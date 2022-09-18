import java.util.*;
public class IrrigationSystem{
	private Pump pump;
	private List<Spray> sprays;
	public IrrigationSystem(int n){
		pump = new Pump();
		sprays = new ArrayList<>();
		for(int i = 0; i < n; i++){
			Spray s = new Spray();
			sprays.add(s);
		}
	}
	public List<Spray> getSprays(){
		return sprays;
	}
	public void turnPumpOn(){
		pump.turnOn();
	}
	public void turnPumpOff(){
		pump.turnOff();
	}
	public void activateAllSprays(){
		for(Spray s : sprays)
			s.activate();
	}
	public void deactivateAllSprays(){
		for(Spray s : sprays)
			s.deactivate();
	}
	public void activateSpray(int index){
		if(index > sprays.size()){
			System.out.println("Invalid choice");
			return;
		}
		sprays.get(index-1).activate();
	}
	public void deactivateSpray(int index){
		if(index > sprays.size()){
			System.out.println("Invalid choice");
			return;
		}
		sprays.get(index-1).deactivate();
	}
	public void setPumpFlowPower(int value){
		if(value > 5){
			System.out.println("Invalid choice");
			return;
		}
		pump.setFixedFlowPower(value);
	}
	public void check(){
		pump.check();
		for(int i = 0; i < sprays.size(); i++){
			sprays.get(i).check();
		}
	}
}
