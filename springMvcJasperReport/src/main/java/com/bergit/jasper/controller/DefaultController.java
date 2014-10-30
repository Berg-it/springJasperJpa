package com.bergit.jasper.controller;

import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bergit.jpa.facade.UserJARFacade;



@Controller
@RequestMapping(DefaultController.pathWelcome)
public class DefaultController {
	
	
 	@Autowired
 	UserJARFacade userJARFacade;
	
	
	protected final static String pathWelcome = "/welcome";
	protected static Logger logger = Logger.getLogger("controller");
	
	/**
	 * Handles and retrieves the download page
	 * 
	 * @return the name of the JSP page
	 */
    @RequestMapping(method = RequestMethod.GET)
    public String getWelcomePage() {
    	logger.debug("Received request to show download page");
    	
    	// This will resolve to /WEB-INF/jsp/welcome.jsp
    	return "welcome-page";
	}
    
    @RequestMapping(value = "/download/pdf", method = RequestMethod.GET)
    public ModelAndView doSalesReportPDF(ModelAndView modelAndView) 
		 {
		logger.debug("Received request to download PDF report");
		// Retrieve our data from a custom data provider
		// Our data comes from a DAO layer
		 JRDataSource datasource = userJARFacade.getListUserDetails();
		
		// In order to use Spring's built-in Jasper support, 
		// We are required to pass our datasource as a map parameter
		// parameterMap is the Model of our application
		Map<String,Object> parameterMap = new HashMap<String,Object>();
		parameterMap.put("pdfBeanData", datasource);
		
		// pdfReport is the View of our application
		// This is declared inside the /WEB-INF/jasper-views.xml
		modelAndView = new ModelAndView("pdfReport", parameterMap);
		
		// Return the View and the Model combined
		return modelAndView;
	}    
	

}
