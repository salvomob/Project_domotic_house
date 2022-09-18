import java.util.*;
public class Guestroom{
	private List<Light> lights;
	private Heater heater;
	Tv tv;
	public Guestroom(){
		lights = new ArrayList<Light>();
		for(int i = 0; i < 4; i++){
			Light l = new Light();
			lights.add(l);
		}	
		heater = new Heater();
		tv = new Tv();
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
	public void turnOnHeater(){
		heater.turnOn();
	}
	public void turnOffHeater(){
		heater.turnOff();
	}
	public void setHeaterTemp(){
		heater.setTemperature();
	}
	public void setFixedHeaterTemp(int a){
		heater.setFixedTemp(a);
	}
	public void setFixedHeaterMode(int a){
		heater.setFixedMode(a);
	}
	public void setHeaterMode(){
		heater.setMode();
	}
	public void turnTvOn(){
		tv.turnOn();
	}
	public void turnTvOff(){
		tv.turnOff();
	}
	public void setTvChannel(){
		tv.setChannel();
	}	
	public void check(){
		System.out.print("CHECKING GUESTROOM\n");
		heater.check();	
		for(Light l:lights){
			l.check();
		}	
		tv.check();
	}
}
