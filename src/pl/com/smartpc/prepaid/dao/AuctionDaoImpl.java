package pl.com.smartpc.prepaid.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pl.com.smartpc.prepaid.model.Auction;

@Repository(value="auctionDao")
public class AuctionDaoImpl implements AuctionDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	/*@PersistenceContext
    void setEntityManager(EntityManager entityManager) {
        this.entityManagerFactory = entityManager;
    }*/
	public Auction getAuction(Long auctionId) {
		return (Auction) this.entityManager.createQuery("from Auction where id= :id").setParameter("id",auctionId)
		.getSingleResult();
	 
	}

	public List getAuctions() {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeAuction(Long auctionId) {
		// TODO Auto-generated method stub

	}
	@Transactional
	public void saveAuction(Auction auction) {
		System.out.println("em open "+entityManager.isOpen());
		try {
		
		this.entityManager.persist(auction);
		System.out.println("dao -  "+auction.getId()+auction.getUrl());
		}
		catch (Exception ex){
			System.out.println(ex.getMessage());	
			
		}
	}

}
