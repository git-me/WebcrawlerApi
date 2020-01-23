/**
 * 
 */
package com.ssingment.webcrawler.application;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.ssingment.webcrawler.model.DeepCrawlingModel;

/**
 * @author mankumar74
 *
 */

public interface WebcrawlerApplicationLogicInterface {
	 public DeepCrawlingModel HtmlparserLogic(String inputRequest);
}
