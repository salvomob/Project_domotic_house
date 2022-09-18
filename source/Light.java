public class Light{
	private boolean power;
	private int luminosity;
	public Light(){
		power = false;
		luminosity = 1;
	}
	
	public void turnOn(){
		power = true;
	}
	
	public void turnOff(){
		power = false;
	}
	
	public void setLuminosity(int x){
		if(x < 0 || x > 5){
			System.out.println("Invalid value of luminosity. Try again!");
			return;
		}
		luminosity = x;
	}
	
	public void check(){
		if(power == false)
			System.out.print("LIGHT OFF\n");
		else
			System.out.print("ON\n");
		System.out.print("Light luminosity = " + luminosity +"\n")	;
	}
}
