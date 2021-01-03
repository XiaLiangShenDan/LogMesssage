package com.sono.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sono.bean.LogMessage;
import com.sono.service.LogMessageService;

import net.sf.json.JSONArray;

@Controller
public class LogMessageAction {
	@Autowired
	private LogMessageService logMessageService;
	
	@ResponseBody
	@RequestMapping("/findall.action")
	public String findAll() {
		List<LogMessage> list = logMessageService.findAll();
		System.out.println(list.size());
		JSONArray json = JSONArray.fromObject(list);
		return json.toString();
	}
	
	@ResponseBody
	@RequestMapping("/findbyid.action")
	public LogMessage findById(@RequestParam("id") int id) {
		LogMessage logMessage = logMessageService.findById(id);
		System.out.println(logMessage.getDate() + " " + logMessage.getMessageLocation() + " " + logMessage.getMessageRank() + " " + logMessage.getMessage());
		return logMessage;
//		return logMessageService.findById(id);
	}
}
