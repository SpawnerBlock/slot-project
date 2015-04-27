package slot;

public class Slot_core {
	public int[] buttom = new int[10]; //これはmainクラスで宣言した方が良い気がする。
					   //おそらく上からPG流れるから下のinsert()とgetInput()呼び出すときに毎回生成しそう。
	
	public void insert(){	
		buttom[0] = 1;
		buttom[1] = 2;
		buttom[2] = 3;
	}

	public void getInput(String input){
		



        int inputInt = Integer.parseInt(input);

        if(buttom[inputInt - 1] == inputInt){
        	buttom[inputInt - 1] = 0;
        } else {
        	System.out.println("push buttom!!(1 or 2 or 3");
        }



	}

}
