import java.util.*;
public class FrontGarden{
	private AutomaticDoor ad;
	private List<Light> lights;
	private List<IrrigationSystem> systems;
	public FrontGarden(){
		ad = new AutomaticDoor();
		lights = new ArrayList<>();
		for(int i = 0; i < 12 ; i++){
			Light l = new Light();
			lights.add(l);
		}
		systems = new ArrayList<>();
		for(int i = 0; i < 3 ; i++){
			switch(i){
				case 0:
					IrrigationSystem is = new IrrigationSystem(5);
					systems.add(is);
					break;
				case 1:
					IrrigationSystem is1 = new IrrigationSystem(8);
					systems.add(is1);
					break;
				case 2:
					IrrigationSystem is2 = new IrrigationSystem(3);
					systems.add(is2);
					break;				
			}
		}
	}
	public void openDoor(){
		ad.open();
	}
	public void closeDoor(){
		ad.close();
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
		systems.get(index-1).setPumpFlowPower(value);
	}
	public void setPumpsFlowPower(int value){
		for(IrrigationSystem is: systems){
			is.setPumpFlowPower(value);
		}
	}
	public void check(){
		System.out.println("CHECKING FRONT GARDEN");
		ad.check();
		for(Light l : lights){
			l.check();
		}
		for(IrrigationSystem is : systems){
			is.check();
		}
	}
}
