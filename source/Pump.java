import java.util.*;
public class Pump{
	private boolean power;
	private int flowPower;
	public Pump(){
		power = false;
		flowPower = 0;
	}
	public void turnOn(){
		power = true;
	}
	public void turnOff(){
		power = false;
	}
	public void setFixedFlowPower(int fp){
		if(fp < 1 || fp > 5){
			System.out.println("Invalid flow power\n");
			return;
		}
		flowPower = fp;	
	}
	public void setFlowPower(){
		System.out.print("Insert new Flow Power(1-5)\n");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		if(a < 1 || a > 5){
			System.out.print("Invalid choice,try again!\n");
			return;
		}
		flowPower = a;
		return;
	}
	public void check(){
		if(!power){
			System.out.print("Pump is OFF\n");
			System.out.print("Pump Flow Power is set to " + flowPower + "\n");
			return;
		}
		else{
			System.out.print("Pump is ON\n");
			System.out.print("Pump Flow Power is set to " + flowPower + "\n");
			return;
		}
	}
	
}
