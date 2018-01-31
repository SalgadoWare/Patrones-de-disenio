package adapter;

import model.Monument;
import components.Coordinates;
import components.GPS;
import views.MapElement;

public class MonumentoAdapter implements MapElement {
	
	Monument m;
	GPS gps;
	
	public MonumentoAdapter(Monument m) {
		// TODO Auto-generated constructor stub
		this.m = m;
		gps = new GPS();
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return m.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		// TODO Auto-generated method stub
		return gps.getCoordinates(m.getAddress());
	}

	@Override
	public String getHTMLInfo() {
		// TODO Auto-generated method stub
		return m.getName() + " " + m.getAuthor();
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		gps.navigateTo(m.getAddress());
	}

}
