import java.util.*;
public class Heater{
	private int temperature;
	private boolean power;
	private int mode;
	public Heater(){
		temperature = 24;
		power = false;
		mode = 0;
	}
	public void setMode(){
		System.out.print("Choose Mode:\n1->sun\n2->ice\n3->turbo\n4->dehumidifier\n");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		if(a < 1 || a > 4){
			System.out.print("Invalid choice,try again!\n");
			return;
		}
		mode = a;
		return;
	}
	public void setFixedMode(int a){
		mode = a;
	}
	public void setFixedTemp(int t){
		temperature = t;
	}
	public void setTemperature(){
		System.out.print("Choose a temperature between 18°C and 30°C\n");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		if(a < 18 || a > 30){
			System.out.print("Invalid choice,try again!\n");
			return;
		}
		temperature = a;
	}
	public void turnOn(){
		power = true;
	}
	public void turnOff(){
		power = false;
	}
	public void check(){
		if(power == false){
			System.out.println("Heater is OFF");
		}
		else
			System.out.print("Mode : " + mode + "\n" + "Temperature : " + temperature + "\n");
	}
}
