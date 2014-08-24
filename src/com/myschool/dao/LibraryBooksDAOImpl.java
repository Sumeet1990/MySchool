package com.myschool.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.dto.StaffDTO;


public class LibraryBooksDAOImpl extends HibernateDaoSupport implements LibraryBooksDAO {	
	private static Logger log = Logger.getLogger(LibraryBooksDAOImpl.class);
}
