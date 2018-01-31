package adapter;

import model.Restaurant;
import components.Coordinates;
import components.GPS;
import views.MapElement;

public class RestaurantAdapter implements MapElement {

	Restaurant r;
	GPS gps;
	
	public RestaurantAdapter(Restaurant elGladiador) {
		// TODO Auto-generated constructor stub
		r = elGladiador;
		gps = new GPS();
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return r.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		// TODO Auto-generated method stub
		return gps.getCoordinates(r.getAddress());
	}

	@Override
	public String getHTMLInfo() {
		// TODO Auto-generated method stub
		return r.getName() + " " + r.getPhone();
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		r.call();
	}

}
