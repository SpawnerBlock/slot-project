package slot;


public class Slot_roulette {

	String Aline[] = {"b7","w7","suica","cherry","bell","rep","BAR"," "};
	String Bline[] = {"cheery","suica","w7","BAR","b7","bell","rep"," "};
	String Cline[] = {"bell","BAR","b7","rep","cherry","w7","suica"," "};

	int [] al = new int[]{7,7,7};
	int [] bl = new int[]{7,7,7};
	int [] cl = new int[]{7,7,7};

	public void getline(int getA, int getB, int getC){


		System.out.println(Aline[al[2]] +" "+ Bline[bl[2]] +" "+ Cline[cl[2]]);
		System.out.println(Aline[al[1]] +" "+ Bline[bl[1]] +" "+ Cline[cl[1]]);
		System.out.println(Aline[al[0]] +" "+ Bline[bl[0]] +" "+ Cline[cl[0]]);

	}

	public void anum(int getA){
		for(int a=0; a<3;a++){
			if(getA + a > 6){
				al[a] = (getA + a) - 7;
			}else{
				al[a] = getA + a;
			}
		}
	}

	public void bnum(int getB){
		for(int b=0; b<3;b++){
			if(getB + b > 6){
				bl[b] = (getB + b) - 7;
			}else{
				bl[b] = getB + b;
			}
		}
	}

	public void cnum(int getC){
		for(int c=0; c<3;c++){
			if(getC + c > 6){
				cl[c] = (getC + c) - 7;
			}else{
				cl[c] = getC + c;
			}
		}
	}


}