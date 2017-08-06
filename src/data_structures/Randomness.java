package data_structures;

import java.util.Random;

public class Randomness {
	
		
	
	static Random r;
	static Boolean torf(){
		r = new Random();
		Boolean b = r.nextBoolean();
		System.out.println(b);
		return r.nextBoolean();
	}
	static Random rnum;
	static int randnum(){
		rnum = new Random();
		int num = rnum.nextInt(10);
		System.out.println(num);
		return rnum.nextInt(10);
	}
	
}
