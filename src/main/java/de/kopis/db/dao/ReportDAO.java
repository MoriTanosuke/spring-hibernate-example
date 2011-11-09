package de.kopis.db.dao;

import java.util.List;

import de.kopis.db.model.Report;

public interface ReportDAO {

	void saveReport(Report report);

	List<Report> listReports();

}
