package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double botax;
		botax=(population*1.5)*growthRate;
		return botax;
	}

}
