import java.util.*;
public class Tv{
	private boolean power;
	private int channels;
	private int curChannel;
	public Tv(){
		power = false;
		channels = 100;
		curChannel = 1;
	}
	
	public void turnOn(){
		power = true;
	}
	public void turnOff(){
		power = false;
	}
	public void setChannel(){
		System.out.print("ENTER CHANNEL:");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		if(a < 0 || a > channels){
			System.out.print("\nInvalid choice, try again!\n");
			return;
		}
		curChannel = a;
		return;
	}
	public void check(){
		if(!power)
			System.out.print("TV OFF\n");
		else
			System.out.print("TV ON -> CURRENT CHANNEL : " + curChannel + "\n");		
	}
	
}
