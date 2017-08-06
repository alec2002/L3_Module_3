package data_structures;

import java.util.ArrayList;

public class Plane {
	static ArrayList list;
	int numberOfPassengers;
public static void main(String[] args) {
	list = new ArrayList<Snake>();
	
	for (int i = 0; i < 100; i++) {
		Snake s = new Snake( Randomness.randnum(), Randomness.torf());
	}
}
}
