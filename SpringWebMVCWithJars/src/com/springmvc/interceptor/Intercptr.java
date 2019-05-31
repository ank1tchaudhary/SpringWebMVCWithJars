package com.springmvc.interceptor;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Intercptr extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletResponse res, HttpServletRequest req, Object obj) throws IOException {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		int dayofweek = cal.get(cal.DAY_OF_WEEK);
		System.out.println(dayofweek);
		if (dayofweek == 6) {
			res.getWriter().write("Website is closed for today please visit on monday. Sorry for inconvinience.");
			return false;
		}
		return true;
	}

}
