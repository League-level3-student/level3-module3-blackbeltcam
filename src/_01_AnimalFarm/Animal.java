package _01_AnimalFarm;

import java.applet.AudioClip;

import javax.swing.JApplet;

public abstract class Animal {
	
public abstract void makeNoise();
public abstract void stampede();


public void playNoise(String soundFile) {
	try {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
		sound.play();
		Thread.sleep(3400);
	} catch (Exception ex) {
		ex.printStackTrace();
	}
}


}
