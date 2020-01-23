/**
 * 
 */
package com.ssingment.webcrawler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssingment.webcrawler.application.WebcrawlerApplicationLogicInterface;
import com.ssingment.webcrawler.model.DeepCrawlingModel;

/**
 * @author mankumar74
 *
 */
@RestController
public class WebCrawlerController {
	@Autowired
	private WebcrawlerApplicationLogicInterface webcrawlerApplicationLogicInterface;

	@PostMapping(path = "/crawlweb")
	public ResponseEntity<DeepCrawlingModel> inputString(@RequestBody String url) {
		DeepCrawlingModel deepCrawlingModel= webcrawlerApplicationLogicInterface.HtmlparserLogic(url);
		//var headers = new HttpHeaders();
       // headers.add("Responded", "MyController");
	return 	ResponseEntity.accepted().body(deepCrawlingModel);
		
	}
	
	@GetMapping("/test")
	public void heloworld() {
		System.out.println("hello world test");
	}
	
}
 