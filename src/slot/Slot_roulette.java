package slot;

import java.util.Random;

public class Slot_roulette {
	
	String Aline[] = {"b7","w7","suica","cherry","bell","rep","BAR"," "," "," "};
	String Bline[] = {"cheery","suica","w7","BAR","b7","bell","rep"," "," "," "};
	String Cline[] = {"bell","BAR","b7","rep","cherry","w7","suica"," "," "," "};


	public void getline(int getA, int getB, int getC){
		System.out.println(Aline[getA + 2] +" "+ Bline[getB + 2] +" "+ Cline[getC + 2]);
		System.out.println(Aline[getA + 1] +" "+ Bline[getB + 1] +" "+ Cline[getC + 1]);
		System.out.println(Aline[getA]     +" "+ Bline[getB]     +" "+ Cline[getC]);

	}	
}