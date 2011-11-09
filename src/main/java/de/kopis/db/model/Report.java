package de.kopis.db.model;

import java.util.Date;


public class Report {
	private Long id;
	private String result;
	private Date insertTimestamp;

	public Report() {
	}

	public Report(String result) {
		this();
		this.result = result;
		this.insertTimestamp = new Date();
	}

	public Date getInsertTimestamp() {
		return insertTimestamp;
	}

	public void setInsertTimestamp(Date insertTimestamp) {
		this.insertTimestamp = insertTimestamp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return id + " " + result + " " + insertTimestamp;
	}
}
