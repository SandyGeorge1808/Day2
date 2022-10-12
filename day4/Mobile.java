package week1.day4;

public class Mobile {
public void sendMessage() {
	System.out.println("sendMessage");	
}
public void shareDocument() {
	
	System.out.println("shareDocument");
}
public void call() {
	System.out.println("call");
}

public void sendMail() {
	System.out.println("sendMail");
}
public static void main(String[] args) {
	Mobile gad=new Mobile();
	gad.sendMessage();
	gad.shareDocument();
	gad.call();
	gad.sendMail();
}
}
