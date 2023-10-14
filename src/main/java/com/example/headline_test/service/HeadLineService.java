package com.example.headline_test.service;

import java.util.List;
import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.example.headline_test.dto.headLineJson;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HeadLineService {
	
	public List<headLineJson> getHeadLine() throws StreamReadException, DatabindException, IOException{
			ObjectMapper objectMapper = new ObjectMapper();
		
			String absolutePath = "/home/ubuntu";
			String filePath = absolutePath+"/trend_topic.json";
			
			List<headLineJson> headLineList = objectMapper.readValue(new File(filePath),
					new TypeReference<List<headLineJson>>() {
				
			});
			
			
			return headLineList;
	}

}
