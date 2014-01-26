package com.myschool.service;

import org.apache.log4j.Logger;

import com.myschool.dao.StaffDAO;

public class StaffServiceImpl implements StaffService {
	private static Logger log = Logger.getLogger(StaffServiceImpl.class);
	StaffDAO staffDAO;
	public StaffDAO getStaffDAO() {
		return staffDAO;
	}
	public void setStaffDAO(StaffDAO staffDAO) {
		this.staffDAO = staffDAO;
	}
}
