import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.io.*;
public class Person { //первое задание Класс человек
   private String Name;
   private int Age;
   private String Number;
   private String Phone_model;
   public Person(String Name,int Age,String Number,String Phone_model) {
	   this.Name = Name;
	   this.Age = Age;
	   if (checkNumber(Number)) {this.Number = Number;} //проверка номера
	   else {System.out.println("Wrong number");}
	   this.Phone_model = Phone_model;
   }
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	   public int getAge() {
		return Age;
	}
	
	public void setAge(int age) {
		Age = age;
	}

	public String getNumber() { //изменить номер
		return Number;
	}

	public void setNumber(String number) {
		if (checkNumber(number)) {this.Number = number;} //проверка номера
		   else {System.out.println("Wrong number");}
	}

	public String getPhone_model() { //изменить модель телефона
		return Phone_model;
	}

	public void setPhone_model(String phone_model) {
		Phone_model = phone_model;
	}
	public void info() { //выод инфо
		System.out.println("Имя "+ Name);
		System.out.println("Возраст "+ Age);
		System.out.println("Номер телефона "+ Number);
		System.out.println("Модель телефона "+ Phone_model);
	}  
	public static boolean Equal(Person obj1,Person obj2) { //сравнение объектов
		boolean eq;
		eq = obj1.equals(obj2); 
		return eq;
	}
	private boolean checkNumber(String Number) {
		String pattern = "^\\+?\\d{10,13}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(Number);
		return m.find( );
	}
	

public static void main(String [] args) throws IOException {
	Person Friend = new Person("Маша",15, "+790986789780", "Apple 12 Pro");
	Person Enemy = new Person("Вася",20, "790986899780", "Apple 11 Pro");
	BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
	int a = 0;
	Friend.info();
	Enemy.info();
	Friend.setPhone_model("Sony Xperia 10");
	Friend.setNumber("0989885860");
	Friend.info();
	System.out.println(Equal(Friend,Enemy));
	Map<String, Person> people = new HashMap<>();
	int i = 0;
	while (a !=3) {
		System.out.println("Меню программы");
		System.out.println("1 - создать новую запись");
		System.out.println("2 - показать количество записей");
		System.out.println("3 - выход");
		a = Integer.parseInt(inp.readLine());
		switch(a) {
		case 1:
			System.out.println("Введите имя");
			String n = inp.readLine();;
			System.out.println("Введите возраст");
			int ag = Integer.parseInt(inp.readLine());
			System.out.println("Введите номер телефона");
			String num = inp.readLine();;
			System.out.println("Введите модель телефона");
			String m = inp.readLine();;
			people.put("p"+ ++i , new Person(n,ag,num,m));
		break;
		case 2:
			System.out.println(people.size());
		}
	}	
}
}

