import java.util.*;
public class Entrance{
	private List<Light> lights;
	private AutomaticDoor ad;
	public Entrance(){
		lights = new ArrayList<>();
		for(int i = 0; i < 4; i++){
			Light l = new Light();
			lights.add(l);
		}
		ad = new AutomaticDoor();
	}
	public void openDoor(){
		ad.open();
	}
	public void closeDoor(){
		ad.close();
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
	public void check(){
		System.out.println("CHECKING ENTRANCE");
		ad.check();
		for(Light l : lights){
			l.check();
		}	
	}
}
