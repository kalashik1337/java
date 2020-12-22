
import java.io.*;

public class Task3 {
	//перегрузка метода bark
	public class Animal{
		public void bark() {System.out.println("Animal barks");}
	}
	public class Dog extends Animal{
		public void bark() {System.out.println("Dog barks");}
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//информация о валюте
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		int a = 0;
		while (a !=7) {
			System.out.println("Введите номер валюты");
			System.out.println("1 - Евро");
			System.out.println("2 - Гривна");
			System.out.println("3 - Доллар");
			System.out.println("4 - Тугрик");
			System.out.println("5 - Йена");
			System.out.println("6 - Злотый");
			System.out.println("7 - Выход");
			a = Integer.parseInt(inp.readLine());
			switch(a) {
			case 1:
				System.out.println("Банкноты 	5, 10, 20, 50, 100, 200, 500 евро\n Введена 1 января 2002\nКурс к рублю 91.42");
			break;
			case 2:
				System.out.println("Банкноты 	1, 2,5,10, 20, 50, 100, 200, 500, 1000 грн\n Введена 2 сентября 1996\nКурс к рублю 2.65");
			break;
			case 3:
				System.out.println("Банкноты: 1, 2, 5, 10, 20, 50, 100 долларов\n" + 
						"(Ограничено 500, 1000, 5000, 10 000, 100 000)\n Введена в 1792 году\nКурс к рублю 74.63 ");
			break;
			case 4:
				System.out.println("Банкноты 	1, 5, 10, 20, 50, 100, 500, 1000, 5000, 10 000, 20 000 тугриков\n Введена в 1925 году\nКурс к рублю 0.0257752");
			break;
			case 5:
				System.out.println("Банкноты 	1000, 2000, 5000, 10 000 иен\n Введена в 1871 году\nКурс к рублю 0.72");
			break;
			case 6:
				System.out.println("Банкноты 	10, 20, 50, 100, 200 и 500 злотых\n Введена в 1924, а потом в 1944 году\nКурс к рублю 20.32");
			break;
			}
		}	
	}

}
