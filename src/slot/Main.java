package slot;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);

		Slot_core core = new Slot_core();
		core.buttomInit(); //buttom配列の初期化


		Random ran = new Random();
		int ram = ran.nextInt(9) + 1;
		//System.out.println(ram);



        // 「end」が入力されるまでループ
        while (true) {
            // コンソールから値を受け付ける処理
            String input = "";

            try {
            	System.out.print("push buttom!! 1 or 2 or 3");
                System.out.print(">");
                input = new String(reader.readLine().getBytes("UTF-8"));
            } catch (IOException e){
                System.out.println("入力エラー：" + e.getMessage());
                break;
            }

            // 入力判定
            if (input.equals("end")) {
                System.out.println("入力終了");
                break;
            } else if (input.equals("1") || input.equals("2") || input.equals("3")){
                core.getInput(input);
            } else {
            	System.out.println("push buttom!!(1 or 2 or 3");
            }
        }


	}

}
