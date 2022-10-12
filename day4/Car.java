package week1.day4;

public class Car {
public void applyBreak() {
	System.out.println("applyBreak");
}
public void applyGear() {
	System.out.println("applyGear");
}
public void applyAccelerate() {
	System.out.println("applyAccelerate");
}
public void switchOnAc() {
	System.out.println("switchOnAc");
}

public static void main(String[] args) {
	Car action=new Car();
	action.applyAccelerate();
	action.applyBreak();
	action.applyGear();
	action.switchOnAc();
}
}

