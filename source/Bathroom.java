import java.util.*;
public class Bathroom{
	private List<Light> lights;
	public Bathroom(){
		lights = new ArrayList<Light>();
		for(int i = 0; i < 4; i++){
			Light l = new Light();
			lights.add(l);
		}
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
		System.out.print("CHECKING BATHROOM:\n");
		for(Light l:lights){
			l.check();
		}	
	}
}
