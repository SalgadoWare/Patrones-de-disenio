package adapter;

import model.Photo;
import components.Coordinates;
import components.GPS;
import views.MapElement;

public class PhotoAdapter implements MapElement {

	Photo p;
	GPS gps;
	
	public PhotoAdapter(Photo myPhoto) {
		// TODO Auto-generated constructor stub
		p = myPhoto;
		GPS gps;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return p.getDescription();
	}

	@Override
	public Coordinates getCoordinates() {
		// TODO Auto-generated method stub
		return p.getCoordinates();
	}

	@Override
	public String getHTMLInfo() {
		// TODO Auto-generated method stub
		return p.getDescription() + " " +  p.getUser();
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		p.show();
	}

}
