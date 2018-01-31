package videoclub;

import videoclub.categoria.Categoria;

public class Movie 
{
	private Categoria categoria;
	private String title;
	
	public Movie(String title, Categoria categoria) 
	{
		this.title = title;
		this.categoria = categoria;
	}
	
	public String getTitle() 
	{
		return title;
	}

	public double getAmount(int daysRented) {
		return categoria.getAmount(daysRented);
	}

	public int getRenterPoints(int daysRented) {
		return categoria.getRenterPoints(daysRented);
	}
}
