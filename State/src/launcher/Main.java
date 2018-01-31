package launcher;

import videoclub.Customer;
import videoclub.Movie;
import videoclub.Rental;
import videoclub.categoria.Childrens;

public class Main {

	public static void main(String[] args) {

		Movie lunes = new Movie("Pelicanos", new Childrens());
		Rental rental = new Rental(lunes, 5);

		Customer carlos = new Customer("carlos");
		carlos.addRental(rental);
		carlos.statement();
	}

}
