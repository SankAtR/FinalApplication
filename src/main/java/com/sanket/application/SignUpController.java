package com.sanket.application;

import java.text.ParseException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daoarchitecture.SignUpModel;

@Controller
@RequestMapping(value = "signup.html", params = "module=signup")
public class SignUpController {
	private static final Logger logger = LoggerFactory
			.getLogger(SignUpController.class);

	@RequestMapping(params = "action=signup",method=RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest request,Locale locale, Model model) {

		String fname=(String) request.getParameter("fname");
		String lname = (String) request.getParameter("lname");
		String emailId = (String) request.getParameter("emailId");
		String datepicker = (String) request.getParameter("datepicker");
		String password = (String) request.getParameter("password");
		
		
		Map<String,String> datamodel= new HashMap<String, String>();
		
		datamodel.put("fname", fname);
		datamodel.put("lname", lname);
		datamodel.put("emailID", emailId);
		datamodel.put("datepicker", datepicker);
		datamodel.put("password", password);
		
		
		
		SignUpModel sm= new SignUpModel();
		try {
			sm.addNewUser(datamodel);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;

	}
}
