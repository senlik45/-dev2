package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager.Update();
		customerManager.Remove();

	
	int sayı=50;
	int sayı2=25;
	sayı2=sayı;
	sayı=30;
	System.out.println(sayı2);
	
	int[]sayılar= new int[] {4,5,6};
	int[]sayılar2= new int[] {7,8,9};
	sayılar2=sayılar;
	sayılar[0]=15;
	System.out.println(sayılar2[0]);
	}
	

}
