package de.kopis.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import de.kopis.db.dao.ReportDAO;
import de.kopis.db.model.Report;


public class SimpleDatabaseApplication {

	public static void main(String[] args) {
		new SimpleDatabaseApplication();
	}
	
	public SimpleDatabaseApplication() {
		List<Report> reports = myReportDao.listReports();
		for (Report report : reports) {
			System.out.println(report);
		}
	}
	
	@Autowired
	private ReportDAO myReportDao;
}
