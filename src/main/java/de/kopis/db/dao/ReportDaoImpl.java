package de.kopis.db.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import de.kopis.db.model.Report;

public class ReportDaoImpl implements ReportDAO {

	@Autowired
	private SessionFactory sessionFactory;
	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	public void saveReport(Report report) {
		hibernateTemplate.saveOrUpdate(report);
	}

	@SuppressWarnings("unchecked")
	public List<Report> listReports() {
		return hibernateTemplate.loadAll(Report.class);
	}

}
