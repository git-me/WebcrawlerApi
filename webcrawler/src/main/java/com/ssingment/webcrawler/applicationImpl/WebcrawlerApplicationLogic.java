package com.ssingment.webcrawler.applicationImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.ssingment.webcrawler.application.WebcrawlerApplicationLogicInterface;
import com.ssingment.webcrawler.model.DeepCrawlingModel;
import com.ssingment.webcrawler.model.PageDetails;
@Service
public class WebcrawlerApplicationLogic implements WebcrawlerApplicationLogicInterface {
	public  DeepCrawlingModel HtmlparserLogic(String inputRequest){
		Document doc;
		 Long totaLinks;
		  DeepCrawlingModel deepCrawlingModel=new DeepCrawlingModel();
		  Integer totalLinks;
		  Integer totalImagesinLink;
		  try {
			doc = Jsoup.connect("http://google.com").get();
			 
			// get page title
            String title = doc.title();
            
            // get all links
            Elements deepLinks = doc.select("a[href]");
            Elements totalImages=doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
            totalLinks= deepLinks.size();
           totalImagesinLink= totalImages.size();
          deepCrawlingModel.setTotalLinks(totalLinks);
          deepCrawlingModel.setTotalImages(totalImagesinLink);
          ////// deeplinks crawling code goes here 
         List<PageDetails> ls=new ArrayList<>();
          for(Element nLinks:deepLinks) {
        	 PageDetails pg=new PageDetails();
        	 String  e= nLinks.attr("href");
        	 String txt = nLinks.text();
        	 String imge =nLinks.attr("\"img[src~=(?i)\\\\.(png|jpe?g|gif)]\"");
        	 
        	 pg.setPageTitle(txt);
        	 pg.setPageLink(e);
        	 
        	 pg.setImageCount(null);
        	 ls.add(pg);
        	 
        	
         }
          deepCrawlingModel.setDetails(ls); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		 
		 
		 return deepCrawlingModel;
		 
	 }

}
