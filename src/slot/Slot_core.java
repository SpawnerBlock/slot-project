package slot;

import java.util.Random;

public class Slot_core{

	Slot_roulette roulette = new Slot_roulette();
	public int[] buttom = new int[10];

	Random ran = new Random();
	int ram = ran.nextInt(7);
	//System.out.println(ram);

	//ボタン初期化
	public void buttomInit(){
		buttom[0] = 1;
		buttom[1] = 2;
		buttom[2] = 3;
	}

	int getA = 7;
	int getB = 7;
	int getC = 7;

	public void getInput(String input){
        int inputInt = Integer.parseInt(input);
        if(buttom[inputInt - 1] == inputInt){
        	buttom[inputInt - 1] = 0;
        	if(inputInt == 1){
        		getA = ram;
        		roulette.anum(getA);
        		roulette.getline(getA, getB, getC);
        	} else if (inputInt == 2){
        		getB = ram;
        		roulette.bnum(getB);
        		roulette.getline(getA, getB, getC);
        	} else if (inputInt == 3){
        		getC = ram;
        		roulette.cnum(getC);
        		roulette.getline(getA, getB, getC);
        	}
        } else {
        	System.out.println("push buttom!!(1 or 2 or 3)");
        }
	}
}