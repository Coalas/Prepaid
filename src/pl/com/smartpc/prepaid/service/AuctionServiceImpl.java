package pl.com.smartpc.prepaid.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import pl.com.smartpc.prepaid.dao.AuctionDao;
import pl.com.smartpc.prepaid.dao.AuctionDaoImpl;
import pl.com.smartpc.prepaid.model.Auction;

import java.util.List;
//@Transactional
@Service(value = "auctionService")
public class AuctionServiceImpl implements AuctionService {
    @Autowired
    AuctionDao auctionDao;

    public void setDao(AuctionDao auctionDao){
    	this.auctionDao =auctionDao;
    	
    }
	public Auction getAuction(Long auctionId) {
		return auctionDao.getAuction(auctionId);
		
	}

	public List getAuctions() {
		
		return null;
	}

	public void removeAuction(Long auctionId) {
	
		
	}
	//@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void saveAuction(Auction auction) {
	System.out.println("service -  "+auction.getUrl());
	auctionDao.saveAuction(auction)	;
	}
}
