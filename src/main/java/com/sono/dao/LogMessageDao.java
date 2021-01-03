package com.sono.dao;

import java.util.List;

import com.sono.bean.LogMessage;

public interface LogMessageDao {
	public List<LogMessage> findAll();
	public LogMessage findById(int id);
}
