import java.util.*;
public class Garage{
	private List<Light> lights = new ArrayList<>();
	private AutomaticDoor ad;
	public Garage(){
		for(int i = 0; i < 4; i++){
			Light l = new Light();
			lights.add(l);
		}
		ad = new AutomaticDoor();
	}
	
	public void turnOnLights(){
		for(Light light: lights)
			light.turnOn();
	}
	public void turnOffLights(){
		for(Light light: lights)
			light.turnOff();
	}
	public void turnOnLight(int index){
		lights.get(index-1).turnOn();
	}
	public void turnOffLight(int index){
		lights.get(index-1).turnOff();
	}
	public void setLightsLuminosity(int x){
		for(Light l: lights){
			l.setLuminosity(x);
		}
	}
	public void setLightLuminosity(int index, int x){
		lights.get(index-1).setLuminosity(x);
	}
	public void openDoor(){
		ad.open();
	}
	public void closeDoor(){
		ad.close();
	}
	public void check(){
		System.out.print("CHECKING GARAGE:\n");
		for(Light l:lights){
			l.check();
		}
		ad.check();
	}
}
