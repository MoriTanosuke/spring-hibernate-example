package de.kopis.db;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import de.kopis.db.dao.ReportDAO;
import de.kopis.db.model.Report;

public class SimpleDatabaseApplication {

	public static void main(String[] args) {
		logger.info("Initializing Spring context.");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/application-context.xml");
		logger.info("Spring context initialized.");

		SimpleDatabaseApplication app = (SimpleDatabaseApplication) applicationContext
				.getBean("myApplication");
		
		app.save(new Report("SUCCESS"));
		
		logger.info("Getting list of reports...");
		List<Report> reports = app.listReports();
		for (Report report : reports) {
			logger.info("report=" + report.toString());
		}
		logger.info("Done.");
	}

	private void save(Report report) {
		reportDao.saveReport(report);
	}

	private List<Report> listReports() {
		return reportDao.listReports();
	}

	public void setReportDao(ReportDAO reportDao) {
		this.reportDao = reportDao;
	}

	private ReportDAO reportDao;
	final static Logger logger = Logger
			.getLogger(SimpleDatabaseApplication.class.getName());
}
