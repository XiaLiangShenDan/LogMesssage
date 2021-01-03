package com.sono.service;

import java.util.List;

import com.sono.bean.LogMessage;

public interface LogMessageService {
	public List<LogMessage> findAll();
	public LogMessage findById(int id);

}
