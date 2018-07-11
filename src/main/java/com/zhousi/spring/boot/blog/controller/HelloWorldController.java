package com.zhousi.spring.boot.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @since  2018��7��12��00:08:13
 * @author SongGeorge
 *
 */
@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World!!!";
	}

}
