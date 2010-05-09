package pl.com.smartpc.prepaid.web;
import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MainBean {
	private String date = (new Date()).toString();
	public void update() {
		try {
			Thread.sleep(4000);
			date = (new Date()).toString();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
