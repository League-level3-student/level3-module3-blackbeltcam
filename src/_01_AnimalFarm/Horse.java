package _01_AnimalFarm;

public class Horse extends Animal {

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		playNoise("Horse.wav");
	}

	@Override
	public void stampede() {
		// TODO Auto-generated method stub
		playNoise("Stampede.wav");
	}

}
