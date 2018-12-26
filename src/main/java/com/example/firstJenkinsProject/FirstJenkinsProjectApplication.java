package com.example.firstJenkinsProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@Controller
public class FirstJenkinsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstJenkinsProjectApplication.class, args);
	}

//	@RequestMapping(value = {"/test"}, method = RequestMethod.GET)
//	@ResponseBody
//	public String test(HttpServletRequest request) {
//		return "success";
//	}

	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	@ResponseBody
	public String noPath(HttpServletRequest request) {
		return "success";
	}

	@RequestMapping(value = {"/listPendingRecord"}, method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String listPendingAfterSalesRecord(@RequestBody String payload) {
		return "success";
	}

}

