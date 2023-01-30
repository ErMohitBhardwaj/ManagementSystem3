package com.BikkadIT.AutoWiringModes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.AutoWiringModes.dao.OracleReport;
import com.BikkadIT.AutoWiringModes.dao.ReportDao;

@Service
public class ReportServiceInterface {

	@Autowired
	private ReportDao report1;
	
	//give this report1 name to the class which class object we want to inject.
	// in this program report1 name is given on MySQLReport class.
	// report2 name is given to Oracle class. 
	//if we use variable name report1 then it inject MySQLReport class object.
	//if we use variable name report2 then it inject OracleReport class object.
	//if both class have same name then ambiguity problem will occur.
	//if any class having not same name as variable name then no bean will be inject.
	
	
	public void report() {
		
		report1.generateReport();
	}
}
