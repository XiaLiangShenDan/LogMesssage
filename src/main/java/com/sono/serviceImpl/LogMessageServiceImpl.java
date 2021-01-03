package com.sono.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sono.bean.LogMessage;
import com.sono.dao.LogMessageDao;
import com.sono.service.LogMessageService;

@Service
public class LogMessageServiceImpl implements LogMessageService {
	@Resource
	private LogMessageDao logMessageDao;
	
	public List<LogMessage> findAll(){
		return logMessageDao.findAll();
	}
	
	public LogMessage findById(int id) {
		return logMessageDao.findById(id);
	}
}
