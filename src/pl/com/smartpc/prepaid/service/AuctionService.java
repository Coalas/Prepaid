package pl.com.smartpc.prepaid.service;



import java.util.List;

import pl.com.smartpc.prepaid.model.Auction;

public interface AuctionService {
    public List getAuctions();
    public Auction getAuction(Long auctionId);
    public void saveAuction(Auction auction);
    public void removeAuction(Long auctionId);
}
