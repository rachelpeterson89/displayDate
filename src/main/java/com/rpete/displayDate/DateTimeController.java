package com.rpete.displayDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateTimeController {

	
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		String strDateFormat = "EEEE, 'the' d 'of' MMMM, yyyy";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("formattedDate", formattedDate);
//		System.out.println(formattedDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date time = new Date();
		String strTimeFormat = "h:mm a";
		DateFormat timeFormat = new SimpleDateFormat(strTimeFormat);
		String formattedTime = timeFormat.format(time);
		model.addAttribute("formattedTime", formattedTime);
		System.out.println(formattedTime);
		return "time.jsp";
	}
	
//    System.out.printf("%A, %s %tB %<te, %<tY", "", date);
	
//	public static void getCurrentDate() {
//		Date date = new Date();
//		String strDateFormat = "hh:mm:ss a";
//		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
//		String formattedDate = dateFormat.format(date);
//		System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
//	}
}
