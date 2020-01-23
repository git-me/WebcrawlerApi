/**
 * 
 */
package com.ssingment.webcrawler.model;

import java.util.List;

public class DeepCrawlingModel {

private Integer totalLinks;
private Integer totalImages;
private List<PageDetails> details = null;

public Integer getTotalLinks() {
return totalLinks;
}

public void setTotalLinks(Integer totalLinks) {
this.totalLinks = totalLinks;
}

public Integer getTotalImages() {
return totalImages;
}

public void setTotalImages(Integer totalImages) {
this.totalImages = totalImages;
}

public List<PageDetails> getDetails() {
return details;
}

public void setDetails(List<PageDetails> details) {
this.details = details;
}

}