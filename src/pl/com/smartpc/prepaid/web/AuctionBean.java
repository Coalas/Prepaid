package pl.com.smartpc.prepaid.web;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.springframework.beans.factory.annotation.Autowired;

import pl.com.smartpc.prepaid.model.Auction;
import pl.com.smartpc.prepaid.service.AuctionService;
import pl.com.smartpc.prepaid.service.AuctionServiceImpl;


@ManagedBean(name="auctionBean")
public class AuctionBean {
	
@ManagedProperty(value = "#{auctionService}")
private AuctionService auctionService; 
	
public void setAuctionService(AuctionService auctionService) {
		this.auctionService = auctionService;
	}

public void createAuction(){
	System.out.println("555555");
	Auction auction = new Auction();
	auction.setUrl("http://allegro.pl");
	//auction.setId(2L);
    auctionService.saveAuction(auction);
	//System.out.println(getAuction(1L).getUrl());
	}


public Auction getAuction(Long auctionId){
	return auctionService.getAuction(auctionId);
	
}

}
