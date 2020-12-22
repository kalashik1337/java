
public class Task2 {
	//ряд чисел вампира четырехначных
    static int[] move(int[] a) {
  		int t=a[0];
  		for (int i = 0; i < a.length-1; i++) {
  			a[i]=a[i+1];
  		}
  		a[a.length-1]=t;
  		return a;
  	}
  	
  	static int swap(int x, int y) {
  		return x;
  	}
  	
  	static boolean isVamp(int num) {
  		int[] a=new int[4];
  		for (int i = 0; i < 4; i++) {
  			a[i]=(int) (((num/(Math.pow(10,i))))%10);
  		}
  		for (int z = 0; z < 2; z++) {
  			for (int k = 0; k < 4; k++) {
  				for (int i = 0; i < 3; i++) {
  					for (int j = 0; j < 4; j++) {
  						if ((a[0]*10+a[1])*(a[2]*10+a[3])==num) return true;
  						a=move(a);
  					}
  					a[i+1]=swap(a[i],a[i]=a[i+1]);
  				}
  			}
  			a[0]=swap(a[1],a[1]=a[0]);
  			a[2]=swap(a[3],a[3]=a[2]);
  		}
  		return false;
  	}
  	//ряд чисел фибоначчи
  	public static long fibonacci(int n){
        long x = 1;
        long y = 1;
        for (int i = 2; i < n; i++) {
            y = x + y;
            x = y - x;
            System.out.print(y + " ");
        }
        return y;
    }
  	
  	public static void main(String[] args) {
  		for (int i = 1000; i < 10000; i++) {
  			if (isVamp(i)) System.out.println(i);
  		}
  		fibonacci(10);
  	}
}
		

