import java.util.*;
public class BackGarden{
	private List<Light> lights;
	private List<IrrigationSystem> systems;
	public BackGarden(){
		lights = new ArrayList<>();
		for(int i = 0; i < 8; i++){
			Light l = new Light();
			lights.add(l);
		}
		IrrigationSystem is = new IrrigationSystem(2);
		systems = new ArrayList<>();
		systems.add(is);
		systems.add(is);
	}
	public void turnOnLights(){
		for(Light l : lights){
			l.turnOn();
		}
	}
	public void turnOffLights(){
		for(Light l : lights){
			l.turnOff();
		}
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
	public void turnPumpsOn(){
		for(IrrigationSystem is : systems){
			is.turnPumpOn();
		}
	}
	public void turnPumpsOff(){
		for(IrrigationSystem is : systems){
			is.turnPumpOff();
		}
	}
	public void turnPumpOn(int index){
		systems.get(index-1).turnPumpOn();
	}
	public void turnPumpOff(int index){
		systems.get(index-1).turnPumpOff();
	}
	public void activateAllSprays(){
		for(IrrigationSystem is : systems){
			is.activateAllSprays();
		}		
	}
	public void deactivateAllSprays(){
		for(IrrigationSystem is : systems){
			is.deactivateAllSprays();
		}		
	}
	public void activateSpray(int index1,int index2){
		if(index1 > systems.size()){
			System.out.println("Invalid choice");
			return;
		}
		if(index2 >systems.get(index1-1).getSprays().size()){
			System.out.println("Invalid choice");
			return;
		}
		systems.get(index1-1).activateSpray(index2);
	}
	public void deactivateSpray(int index1,int index2){
		if(index1 > systems.size()){
			System.out.println("Invalid choice");
			return;
		}
		if(index2 >systems.get(index1-1).getSprays().size()){
			System.out.println("Invalid choice");
			return;
		}
		systems.get(index1-1).deactivateSpray(index2);
	}
	public void setPumpFlowPower(int index,int value){
		if(index > systems.size()){
			System.out.println("Invalid choice");
			return;			
		}
		if(value > 5){
			System.out.println("Invalid choice");
			return;
		}
		systems.get(index-1).setPumpFlowPower(value);
	}
	public void setPumpsFlowPower(int value){
		if(value > 5){
			System.out.println("Invalid choice");
			return;
		}
		for(IrrigationSystem is: systems){
			is.setPumpFlowPower(value);
		}
	}
	public void check(){
		System.out.println("CHECKING BACK GARDEN");
		for(Light l : lights){
			l.check();
		}
		for(IrrigationSystem is : systems){
			is.check();
		}
	}
}	

