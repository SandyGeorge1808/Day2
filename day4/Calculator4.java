package week1.day4;

public class Calculator4 {
	public void additionTwoNumbers(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
public void subractionTwoNumbers(int d,int f) {
	int e=d-f;
	System.out.println(e);
}
public void multiplyTwoNumbers(int i, int j) {
	int g=i*j;
	System.out.println(g);
}
public void divideTwoNumbers(int m,int n) {
	int l=m/n;
	System.out.println(l);
}
public static void main(String[] args) {
	Calculator4 cals=new Calculator4();
	cals.additionTwoNumbers(30, 40);
	cals.subractionTwoNumbers(50, 30);
	cals.multiplyTwoNumbers(56, 40);
	cals.divideTwoNumbers(600, 30);
}
}

