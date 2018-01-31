package videoclub.categoria;

public class NewRelase implements Categoria {
	@Override
	public double getAmount(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int getRenterPoints(int daysRented) {
		if (daysRented > 2)
			return 2;
		else
			return 1;
	}
}
