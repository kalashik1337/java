import java.io.*;
import java.lang.Math;
import java.util.Stack;
public class Task5 {
	
	public static void main(String[] args) throws IOException{
		// part1 отработка исключений
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Введите два числа, а я поделю первое на второе");
		try {
		int a = Integer.parseInt(inp.readLine());
		int b = Integer.parseInt(inp.readLine());
		double c = a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("EXCEPTION "+e.getMessage());
		}
		//part2 запись рандомных чисел в файл и их считыванеи по индексу
		BufferedReader inp2 = new BufferedReader (new FileReader("num.txt"));
		try {
			String s = inp2.readLine();
			inp2.close();
		}
		catch(IOException e) { BufferedWriter outp = new BufferedWriter (new FileWriter("num.txt"));
		
		for (int i = 0; i <200; i++) {
			 int randomNum = (int)(Math.random() * 100);
			 outp.write(i+": "+ randomNum + "\n");
		}
		outp.close();
		}
		BufferedReader inp3 = new BufferedReader (new FileReader("num.txt"));
		System.out.println("Введите индекс числа");
		int a = Integer.parseInt(inp.readLine());
		String line = "";
		for(int i = 0;i <= a;i++) {
			line = inp3.readLine();
		}
		System.out.println(line.substring(line.indexOf(':')+2));
		//part3 считывание из файла и перепись содержимого одного в другой в обратном порядке
		Stack<Character> st = new Stack<>();
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
		Character symbol = (char) br1.read();
		while (symbol != 65535) { 
				st.push(symbol);
		      symbol = (char)br1.read(); 
		}
		Stack<Character> st1 = new Stack<>();
		BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
		Character symbol1 = (char) br2.read();
		while (symbol1 != 65535) { 
				st1.push(symbol1);
		      symbol1 = (char)br2.read(); 
		}
		br1.close();
		br2.close();
		
		
		BufferedWriter wr2 = new BufferedWriter(new FileWriter("file2.txt"));
		while(!st.empty()) {
			wr2.write(st.pop());
		}
		wr2.close();
		
		BufferedWriter wr1 = new BufferedWriter(new FileWriter("file1.txt"));
		while(!st1.empty()) {
			wr1.write(st1.pop());
		}
		wr1.close();
		
		
	}

}
