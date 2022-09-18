import java.util.*;
public class Remote{
	private FrontGarden frontgarden;
	private Entrance entrance; 
	private Lounge lounge;
	private Bedroom bedroom;
	private Guestroom guestroom;
	private Bathroom bathroom;
	private Doubleroom doubleroom;
	private Diningroom diningroom;
	private Garage garage;
	private BackGarden backgarden;
	public Remote(){
		frontgarden = new FrontGarden();
		entrance = new Entrance();
		lounge = new Lounge();
		bathroom = new Bathroom();
		doubleroom = new Doubleroom();
		diningroom = new Diningroom();
		bedroom = new Bedroom();
		guestroom = new Guestroom();
		garage = new Garage();
		backgarden = new BackGarden();
	}
	
	//Front Garden management
	public void frontGardenOpenDoor(){
		frontgarden.openDoor();
	}
	public void frontGardenCloseDoor(){
		frontgarden.closeDoor();
	}
	public void frontGardenLightsOn(){
		frontgarden.turnOnLights();
	}
	public void frontGardenLightOn(int index){
		frontgarden.turnOnLight(index);
	}
	public void frontGardenLightOff(int index){
		frontgarden.turnOffLight(index);
	}
	public void frontGardenSetLightLuminosity(int index,int value){
		frontgarden.setLightLuminosity(index,value);
	}
	public void frontGardenSetLightsLuminosity(int value){
		frontgarden.setLightsLuminosity(value);
	}
	public void frontGardenLightsOff(){
		frontgarden.turnOffLights();
	}
	public void frontGardenTurnPumpsOn(){
		frontgarden.turnPumpsOn();
	}
	public void frontGardenTurnPumpsOff(){
		frontgarden.turnPumpsOff();
	}
	public void frontGardenTurnPumpOn(int index){
		frontgarden.turnPumpOn(index);
	}
	public void frontGardenTurnPumpOff(int index){
		frontgarden.turnPumpOff(index);
	}
	public void frontGardenActivateAllSprays(){
		frontgarden.activateAllSprays();
	}
	public void frontGardenDeactivateAllSprays(){
		frontgarden.deactivateAllSprays();
	}
	public void frontGardenActivateSpray(int index1,int index2){
		frontgarden.activateSpray(index1,index2);
	}
	public void frontGardenDeactivateSpray(int index1,int index2){
		frontgarden.deactivateSpray(index1,index2);
	}
	public void frontGardenSetPumpsFlow(int value){
		frontgarden.setPumpsFlowPower(value);
	}
	public void frontGardenSetPumpFlow(int index,int value){
		frontgarden.setPumpFlowPower(index,value);
	}
	public void frontGardenCheck(){
		frontgarden.check();
	}
	
	//Entrance management
	
	public void entranceOpenDoor(){
		entrance.openDoor();
	}
	public void entranceCloseDoor(){
		entrance.closeDoor();
	}
	public void entranceLightsOn(){
		entrance.turnOnLights();
	}
	public void entranceLightOn(int index){
		entrance.turnOnLight(index);
	}
	public void entranceLightOff(int index){
		entrance.turnOffLight(index);
	}
	public void entranceSetLightLuminosity(int index,int value){
		entrance.setLightLuminosity(index,value);
	}
	public void entranceSetLightsLuminosity(int value){
		entrance.setLightsLuminosity(value);
	}
	public void entranceLightsOff(){
		entrance.turnOffLights();
	}
	public void entranceCheck(){
		entrance.check();
	}
	
	//Lounge management
	
	public void loungeLightsOn(){
		lounge.turnOnLights();
	}
	public void loungeLightsOff(){
		lounge.turnOffLights();
	}
	public void loungeLightOn(int index){
		lounge.turnOnLight(index);
	}
	public void loungeLightOff(int index){
		lounge.turnOffLight(index);
	}
	public void loungeSetLightLuminosity(int index,int value){
		lounge.setLightLuminosity(index,value);
	}
	public void loungeSetLightsLuminosity(int value){
		lounge.setLightsLuminosity(value);
	}
	public void loungeHeaterOn(){
		lounge.turnOnHeater();
	}
	public void loungeHeaterOff(){
		lounge.turnOffHeater();
	}
	public void loungeHeaterTemp(){
		lounge.setHeaterTemp();
	}
	public void loungeHeaterMode(){
		lounge.setHeaterMode();
	}
	public void loungeFixedHeaterTemp(int value){
		lounge.setFixedHeaterTemp(value);
	}
	public void loungeFixedHeaterMode(int value){
		lounge.setFixedHeaterMode(value);
	}
	public void loungeTvOn(){
		lounge.turnTvOn();
	}
	public void loungeTvOff(){
		lounge.turnTvOff();
	}
	public void loungeTvChannel(){
		lounge.setTvChannel();
	}
	public void loungeCheck(){
		lounge.check();
	}
	
	//Bathroom management
	
	public void bathroomLightsOn(){
		bathroom.turnOnLights();
	}
	public void bathroomLightsOff(){
		bathroom.turnOffLights();
	}
	public void bathroomLightOn(int index){
		bathroom.turnOnLight(index);
	}
	public void bathroomLightOff(int index){
		bathroom.turnOffLight(index);
	}
	public void bathroomSetLightLuminosity(int index,int value){
		bathroom.setLightLuminosity(index,value);
	}
	public void bathroomSetLightsLuminosity(int value){
		bathroom.setLightsLuminosity(value);
	}
	public void bathroomCheck(){
		bathroom.check();
	}
	
	//Doubleroom management
	
	public void doubleroomLightsOn(){
		doubleroom.turnOnLights();
	}
	public void doubleroomLightsOff(){
		doubleroom.turnOffLights();
	}
	public void doubleroomLightOn(int index){
		doubleroom.turnOnLight(index);
	}
	public void doubleroomLightOff(int index){
		doubleroom.turnOffLight(index);
	}
	public void doubleroomSetLightLuminosity(int index,int value){
		doubleroom.setLightLuminosity(index,value);
	}
	public void doubleroomSetLightsLuminosity(int value){
		doubleroom.setLightsLuminosity(value);
	}
	public void doubleroomHeaterOn(){
		doubleroom.turnOnHeater();
	}
	public void doubleroomHeaterOff(){
		doubleroom.turnOffHeater();
	}
	public void doubleroomHeaterTemp(){
		doubleroom.setHeaterTemp();
	}
	public void doubleroomHeaterMode(){
		doubleroom.setHeaterMode();
	}
	public void doubleroomTvOn(){
		doubleroom.turnTvOn();
	}
	public void doubleroomTvOff(){
		doubleroom.turnTvOff();
	}
	public void doubleroomTvChannel(){
		doubleroom.setTvChannel();
	}
	public void doubleroomCheck(){
		doubleroom.check();
	}
	
	//Bedroom management
	
	public void bedroomLightsOn(){
		bedroom.turnOnLights();
	}
	public void bedroomLightsOff(){
		bedroom.turnOffLights();
	}
	public void bedroomLightOn(int index){
		bedroom.turnOnLight(index);
	}
	public void bedroomLightOff(int index){
		bedroom.turnOffLight(index);
	}
	public void bedroomSetLightLuminosity(int index,int value){
		bedroom.setLightLuminosity(index,value);
	}
	public void bedroomSetLightsLuminosity(int value){
		bedroom.setLightsLuminosity(value);
	}
	public void bedroomHeaterOn(){
		bedroom.turnOnHeater();
	}
	public void bedroomHeaterOff(){
		bedroom.turnOffHeater();
	}
	public void bedroomHeaterTemp(){
		bedroom.setHeaterTemp();
	}
	public void bedroomHeaterMode(){
		bedroom.setHeaterMode();
	}
	public void bedroomTvOn(){
		bedroom.turnTvOn();
	}
	public void bedroomTvOff(){
		bedroom.turnTvOff();
	}
	public void bedroomTvChannel(){
		bedroom.setTvChannel();
	}
	public void bedroomCheck(){
		bedroom.check();
	}
	
	//Guetstoom management
	
	public void guestroomLightsOn(){
		guestroom.turnOnLights();
	}
	public void guestroomLightsOff(){
		guestroom.turnOffLights();
	}
	public void guestroomLightOn(int index){
		guestroom.turnOnLight(index);
	}
	public void guestroomLightOff(int index){
		guestroom.turnOffLight(index);
	}
	public void guestroomSetLightLuminosity(int index,int value){
		guestroom.setLightLuminosity(index,value);
	}
	public void guestroomSetLightsLuminosity(int value){
		guestroom.setLightsLuminosity(value);
	}
	public void guestroomHeaterOn(){
		guestroom.turnOnHeater();
	}
	public void guestroomHeaterOff(){
		guestroom.turnOffHeater();
	}
	public void guestroomHeaterTemp(){
		guestroom.setHeaterTemp();
	}
	public void guestroomHeaterMode(){
		guestroom.setHeaterMode();
	}
	public void guestroomTvOn(){
		guestroom.turnTvOn();
	}
	public void guestroomTvOff(){
		guestroom.turnTvOff();
	}
	public void guestroomTvChannel(){
		guestroom.setTvChannel();
	}
	public void guestroomCheck(){
		guestroom.check();
	}
	
	//Diningroom management
	
	public void diningroomLightsOn(){
		diningroom.turnOnLights();
	}
	public void diningroomLightsOff(){
		diningroom.turnOffLights();
	}
	public void diningroomLightOn(int index){
		diningroom.turnOnLight(index);
	}
	public void diningroomLightOff(int index){
		diningroom.turnOffLight(index);
	}
	public void diningroomSetLightLuminosity(int index,int value){
		diningroom.setLightLuminosity(index,value);
	}
	public void diningroomSetLightsLuminosity(int value){
		diningroom.setLightsLuminosity(value);
	}
	public void diningroomHeaterOn(){
		diningroom.turnOnHeater();
	}
	public void diningroomHeaterOff(){
		diningroom.turnOffHeater();
	}
	public void diningroomHeaterTemp(){
		diningroom.setHeaterTemp();
	}
	public void diningroomHeaterMode(){
		diningroom.setHeaterMode();
	}
	public void diningroomTvOn(){
		diningroom.turnTvOn();
	}
	public void diningroomTvOff(){
		diningroom.turnTvOff();
	}
	public void diningroomTvChannel(){
		diningroom.setTvChannel();
	}		
	public void diningroomturnOnCoffeemachine(){
		diningroom.turnOnCoffeemachine();
	}
	public void diningroomturnOffCoffeemachine(){
		diningroom.turnOffCoffeemachine();
	}
	public void diningroomEspresso(){
		diningroom.Espresso();
	}
	public void diningroomLungo(){
		diningroom.Lungo();
	}
	public void diningroomCappuccino(){
		diningroom.Cappuccino();
	}
	public void diningroomCheck(){
		diningroom.check();
	}
	
	//Garage management
	
	public void garageOpenDoor(){
		garage.openDoor();
	}
	public void garageCloseDoor(){
		garage.closeDoor();
	}
	public void garageLightsOn(){
		garage.turnOnLights();
	}
	public void garageLightOn(int index){
		garage.turnOnLight(index);
	}
	public void garageLightOff(int index){
		garage.turnOffLight(index);
	}
	public void garageSetLightLuminosity(int index,int value){
		garage.setLightLuminosity(index,value);
	}
	public void garageSetLightsLuminosity(int value){
		garage.setLightsLuminosity(value);
	}
	public void garageLightsOff(){
		garage.turnOffLights();
	}
	public void garageCheck(){
		garage.check();
	}
	
	//Backgarden management
	
	public void backGardenLightsOn(){
		backgarden.turnOnLights();
	}
	public void backGardenLightOn(int index){
		backgarden.turnOnLight(index);
	}
	public void backGardenLightOff(int index){
		backgarden.turnOffLight(index);
	}
	public void backGardenSetLightLuminosity(int index,int value){
		backgarden.setLightLuminosity(index,value);
	}
	public void backGardenSetLightsLuminosity(int value){
		backgarden.setLightsLuminosity(value);
	}
	public void backGardenLightsOff(){
		backgarden.turnOffLights();
	}
	public void backGardenTurnPumpsOn(){
		backgarden.turnPumpsOn();
	}
	public void backGardenTurnPumpsOff(){
		backgarden.turnPumpsOff();
	}
	public void backGardenTurnPumpOn(int index){
		backgarden.turnPumpOn(index);
	}
	public void backGardenTurnPumpOff(int index){
		backgarden.turnPumpOff(index);
	}
	public void backGardenActivateAllSprays(){
		backgarden.activateAllSprays();
	}
	public void backGardenDeactivateAllSprays(){
		backgarden.deactivateAllSprays();
	}
	public void backGardenActivateSpray(int index1,int index2){
		backgarden.activateSpray(index1,index2);
	}
	public void backGardenDeactivateSpray(int index1,int index2){
		backgarden.deactivateSpray(index1,index2);
	}
	public void backGardenSetPumpsFlow(int value){
		backgarden.setPumpsFlowPower(value);
	}
	public void backGardenSetPumpFLow(int index,int value){
		backgarden.setPumpFlowPower(index,value);
	}
	public void backGardenCheck(){
		backgarden.check();
	}
	
	//All-in-one management
	public void turnAllLightsOn(){
		frontGardenLightsOn();
		entranceLightsOn();
		doubleroomLightsOn();
		bedroomLightsOn();
		guestroomLightsOn();
		bathroomLightsOn();
		diningroomLightsOn();
		loungeLightsOn();
		garageLightsOn();
		backGardenLightsOn();
	}
	public void turnAllLightsOff(){
		frontGardenLightsOff();
		entranceLightsOff();
		doubleroomLightsOff();
		bedroomLightsOff();
		guestroomLightsOff();
		bathroomLightsOff();
		diningroomLightsOff();
		loungeLightsOff();
		garageLightsOff();
		backGardenLightsOff();
	}
	public void turnAllHeatersOn(){
		diningroomHeaterOn();
		loungeHeaterOn();
		doubleroomHeaterOn();
		bedroomHeaterOn();
		guestroomHeaterOn();
	}
	public void turnAllHeatersOff(){
		diningroomHeaterOff();
		loungeHeaterOff();
		doubleroomHeaterOff();
		bedroomHeaterOff();
		guestroomHeaterOff();
	}
	public void setAllHeatersTemp(){
		System.out.print("Choose a temperature between 18°C and 30°C : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a < 18 || a > 30){
			System.out.print("\nInvalid choice, try again\n");
			return;
		}	
		diningroom.setFixedHeaterTemp(a);
		doubleroom.setFixedHeaterTemp(a);
		bedroom.setFixedHeaterTemp(a);
		guestroom.setFixedHeaterTemp(a);
		lounge.setFixedHeaterTemp(a);
		return;
	}
	public void setAllHeatersMode(){
		System.out.print("Choose Mode:\n1->sun\n2->ice\n3->turbo\n4->dehumidifier\n");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a < 1 || a > 4){
			System.out.print("\nInvalid choice, try again\n");
			return;
		}	
		diningroom.setFixedHeaterMode(a);
		doubleroom.setFixedHeaterMode(a);
		bedroom.setFixedHeaterMode(a);
		guestroom.setFixedHeaterMode(a);
		lounge.setFixedHeaterMode(a);
		return;
	}
	public void checkAll(){
		frontGardenCheck();
		entranceCheck();
		bedroomCheck();
		guestroomCheck();
		diningroomCheck();
		doubleroomCheck();
		bathroomCheck();
		loungeCheck();
		backGardenCheck();
	}
}
