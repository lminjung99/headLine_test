package com.example.headline_test.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.headline_test.dto.headLineJson;
import com.example.headline_test.service.HeadLineService;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

@RestController
@RequestMapping("/api")
public class HeadLineController {
	
	private final HeadLineService headLineService;
	
	public HeadLineController(HeadLineService headLineService) {
		this.headLineService = headLineService;
	}
	
	@GetMapping("/title")
	public List<headLineJson> headLineBody() throws StreamReadException, DatabindException, IOException{
		return headLineService.getHeadLine();
	}
	
}
