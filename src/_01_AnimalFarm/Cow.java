package _01_AnimalFarm;

public class Cow extends Animal {

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		playNoise("Cow.wav");
	}

	@Override
	public void stampede() {
		// TODO Auto-generated method stub
		playNoise("Stampede.wav");
	}

}
