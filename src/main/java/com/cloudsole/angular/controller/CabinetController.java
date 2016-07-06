package com.cloudsole.angular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by has on 06.07.16.
 */
@Controller
@RequestMapping("/cabinet")
public class CabinetController {
	@RequestMapping("/layout")
	public String getTodoPartialPage() {
		return "cabinet/layout";
	}
}
