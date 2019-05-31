package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.model.HelloModel;
import com.sun.org.apache.xml.internal.dtm.ref.CustomStringPool;
import com.sun.xml.internal.ws.api.FeatureListValidatorAnnotation;

@Controller
public class HelloController {

	@ExceptionHandler(value = Exception.class)
	public String exception(Exception e) {
		System.out.println("you have error in response");
		return "error";
	}

	@InitBinder
	public void test(WebDataBinder bind) {
		// bind.registerCustomEditor(Long.class,"phone", new
		// CustomNumberEditor(String.class, false));
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello(HttpServletRequest request, HttpServletResponse response) {
		return "index";
	}

	@ModelAttribute
	public void message(Model m) {
		m.addAttribute("hi", "Hi ankit :)");
		m.addAttribute("bye", "bye ankit :)");
	}

	@RequestMapping(value = "/show", method = RequestMethod.POST)
	public String sh(@Valid @ModelAttribute("model") HelloModel m, BindingResult result, HttpServletRequest request,
			HttpServletResponse response) {
		if (result.hasErrors()) {
			return "index";
		}
		return "error";
	}

	@ResponseBody
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ArrayList<HelloModel> liist() {
		HelloModel model1= new HelloModel("ankit","chaudhary","7830960649");
		HelloModel model2= new HelloModel("ankit","chaudhary","7830960649");
		HelloModel model3= new HelloModel("ankit","chaudhary","7830960649");
		ArrayList<HelloModel> md= new ArrayList<HelloModel>();
		md.add(model1);
		md.add(model2);
		md.add(model3);
		return md;
	}
	
	
	@RequestMapping(value="/list/{param}",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody HelloModel list(@PathVariable("param") String param){
		HelloModel md= new HelloModel(param,"Chaudhary","7830960649");
		return md;
	}
	
	@ResponseBody
	@RequestMapping(value="/list/{param}",method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<Boolean> listt(@PathVariable("param") String name,@RequestBody HelloModel model) {
		System.out.println("fname is : "+name);
		System.out.println("updated value is  :"+ model);
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
	
	

}
