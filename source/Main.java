import java.util.*;
import java.util.concurrent.*;
public class Main{
	 public static void clearScreen() {  
	 	System.out.print("\033[H\033[2J");  
	    System.out.flush();  
    } 
    public static void aspetta(int seconds){
    	try{
				TimeUnit.SECONDS.sleep(seconds);
			}
		catch(InterruptedException e){}
    }
    
    //front garden submenu
    
    public static void fg(Remote remote){
    	int done = 0;
    	while(done == 0){
    		clearScreen();
			System.out.println("Front Garden management section");
			System.out.println("Choose one from the following options by typing the correspective number and pressing enter!");
			System.out.println("(1) Open Door");
			System.out.println("(2) Close Door");
			System.out.println("(3) Turn All Lights On");
			System.out.println("(4) Turn All lights Off");
			System.out.println("(5) Choose Light to Turn On");
			System.out.println("(6) Choose Light to Turn Off");
			System.out.println("(7) Set Specific Light Luminosity");
			System.out.println("(8) Set All Lights Lumininosity");
			System.out.println("(9) Turn All pumps On");
			System.out.println("(10) Turn All Pumps Off");
			System.out.println("(11) Choose Pump to Turn On");
			System.out.println("(12) Choose Pump to Turn Off");
			System.out.println("(13) Activate All Sprays");
			System.out.println("(14) Deactivate All Sprays");
			System.out.println("(15) Activate Specific Spray");
			System.out.println("(16) Deactivate Specific Spray");
			System.out.println("(17) Set All Pumps Flow");
			System.out.println("(18) Set Pump Flow");
			System.out.println("(19) Check");
			System.out.println("(20) Back to the previous Menù");
			System.out.print("-> ");
			int choice = 0;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			int x = 0,y= 0;
			if(choice < 1 || choice > 20){
				System.out.println("Invalid choice, try again!");
				aspetta(1);
				continue;
			}
			switch(choice){
				case 1:
					remote.frontGardenOpenDoor();
					System.out.println("Front Garden Door Opened");
					aspetta(1);
					done = 1;
					break;
				case 2:
					remote.frontGardenCloseDoor();
					System.out.println("Front Garden Door Closed");
					aspetta(1);
					done = 1;
				case 3:
					remote.frontGardenLightsOn();
					System.out.println("Front garden Lights ON");
					aspetta(1);
					done = 1;
					break;
				case 4:
					remote.frontGardenLightsOff();
					System.out.println("Front garden Lights OFF");
					aspetta(1);
					done = 1;
					break;
				case 5:
					System.out.println("Which one of the 12 Lights you want to turn on?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.frontGardenLightOn(x);
					System.out.println("Front garden Light n."+ x + " turned ON");
					aspetta(1);
					done = 1;
					break;
				case 6:
					System.out.println("Which one of the 12 Lights you want to turn off?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.frontGardenLightOff(x);
					System.out.println("Front garden Light n."+ x + " turned OFF");
					aspetta(1);
					done = 1;
					break;
				case 7:
					System.out.println("Which one of the 12 Lights you want to modify the luminosity?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.frontGardenSetLightLuminosity(x,y);
					System.out.println("Front garden Light n."+ x + " luminosity set up to "+ y);
					aspetta(1);
					done = 1;
					break;
				case 8:
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.frontGardenSetLightsLuminosity(x);
					System.out.println("Front garden Light luminosity set to " + x);
					aspetta(1);
					done = 1;
					break;
				case 9:
					remote.frontGardenTurnPumpsOn();
					System.out.println("Front garden Pumps turned ON");
					aspetta(1);
					done = 1;
					break;
				case 10:
					remote.frontGardenTurnPumpsOff();
					System.out.println("Front garden Pumps turned OFF");
					aspetta(1);
					done = 1;
					break;
				case 11:
					System.out.println("Which one of the 3 Pumps you want to turn ON?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.frontGardenTurnPumpOn(x);
					aspetta(1);
					done = 1;
					break;
				case 12:
					System.out.println("Which one of the 3 Pumps you want to turn OFF?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.frontGardenTurnPumpOff(x);
					aspetta(1);
					done = 1;
					break;
				case 13:
					remote.frontGardenActivateAllSprays();
					System.out.println("Front Garden Spays All Activated");
					aspetta(1);
					done = 1;
					break;
				case 14:
					remote.frontGardenDeactivateAllSprays();
					System.out.println("Front Garden Spays All Deactived");
					aspetta(1);
					done = 1;
					break;
				case 15:
					System.out.println("In Which one of the 3 Pumps you want to Activate a spray?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Which spray");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.frontGardenActivateSpray(x,y);
					System.out.println("Front garden Irrigation system n."+ x + " , spray n."+ y + " is now Activated");
					aspetta(1);
					done = 1;
					break;
				case 16:
					System.out.println("In Which one of the 3 Pumps you want to Deactivate a spray?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Which spray");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.frontGardenDeactivateSpray(x,y);
					System.out.println("Front garden Irrigation system n."+ x + " , spray n."+ y + " is now Dectivated");
					aspetta(1);
					done = 1;
					break;
				case 17:
					System.out.println("Which flow value you want to set to the 3 Pumps?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.frontGardenSetPumpsFlow(x);
					System.out.println("Front garden Irrigation systems Pumps flow power set up to "+ x);
					aspetta(1);
					done = 1;
					break;
				case 18:
					System.out.println("Which one of the 3 Pumps you want modify the flow power value?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Value(1-5)");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.frontGardenSetPumpFlow(x,y);
					System.out.println("Front garden Irrigation system n." + x + " , flow power level set up to "+ y );
					aspetta(1);
					done = 1;
					break;
				case 19:
					remote.frontGardenCheck();
					System.out.print("Enter to continue");
					sc.nextLine();
					sc.nextLine();
					done = 1;
					break;	
				case 20:
					done = 1;
					break;
			}
    	}		
    }
    
    //entrance submenu
    
    static public void entrance(Remote remote){
    	int done = 0;
    	while(done == 0){
    		clearScreen();
			System.out.println("Entrance management section");
			System.out.println("Choose one from the following options by typing the correspective number and pressing enter!");
			System.out.println("(1) Open Door");
			System.out.println("(2) Close Door");
			System.out.println("(3) Turn All Lights On");
			System.out.println("(4) Turn All lights Off");
			System.out.println("(5) Choose Light to Turn On");
			System.out.println("(6) Choose Light to Turn Off");
			System.out.println("(7) Set Specific Light Luminosity");
			System.out.println("(8) Set All Lights Lumininosity");
			System.out.println("(9) Check");
			System.out.println("(10) Back to the previous Menù");
			System.out.print("-> ");
			int choice = 0;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			int x = 0,y= 0;
			if(choice < 1 || choice > 10){
				System.out.println("Invalid choice, try again!");
				aspetta(1);
				continue;
			}
			switch(choice){
				case 1:
					remote.entranceOpenDoor();
					System.out.println("Entrance Door Opened");
					aspetta(1);
					done = 1;
					break;
				case 2:
					remote.entranceCloseDoor();
					System.out.println("Entrance Door Closed");
					aspetta(1);
					done = 1;
				case 3:
					remote.entranceLightsOn();
					System.out.println("Entrance Lights ON");
					aspetta(1);
					done = 1;
					break;
				case 4:
					remote.entranceLightsOff();
					System.out.println("Entrance Lights OFF");
					aspetta(1);
					done = 1;
					break;
				case 5:
					System.out.println("Which one of the 4 Lights you want to turn on?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.entranceLightOn(x);
					System.out.println("Entrance Light n."+ x + " turned ON");
					aspetta(1);
					done = 1;
					break;
				case 6:
					System.out.println("Which one of the 4 Lights you want to turn off?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.entranceLightOff(x);
					System.out.println("Entrance Light n."+ x + " turned OFF");
					aspetta(1);
					done = 1;
					break;
				case 7:
					System.out.println("Which one of the 4 Lights you want to modify the luminosity?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.entranceSetLightLuminosity(x,y);
					System.out.println("Entrance Light n."+ x + " luminosity set up to "+ y);
					aspetta(1);
					done = 1;
					break;
				case 8:
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.entranceSetLightsLuminosity(x);
					System.out.println("Entrance Light luminosity set to " + x);
					aspetta(1);
					done = 1;
					break;
				case 9:
					remote.entranceCheck();
					System.out.print("Enter to continue");
					sc.nextLine();
					sc.nextLine();
					done = 1;
					break;	
				case 10:
					done = 1;
					break;
			}
		}	
    }
    
    //Lounge submenu
    
    public static void lounge(Remote remote){
    	int done = 0;
    	while(done == 0){
    		clearScreen();
			System.out.println("Lounge management section");
			System.out.println("Choose one from the following options by typing the correspective number and pressing enter!");
			System.out.println("(1) Turn All Lights On");
			System.out.println("(2) Turn All lights Off");
			System.out.println("(3) Choose Light to Turn On");
			System.out.println("(4) Choose Light to Turn Off");
			System.out.println("(5) Set Specific Light Luminosity");
			System.out.println("(6) Set All Lights Lumininosity");
			System.out.println("(7) Turn On Heater");
			System.out.println("(8) Turn Off Heater");
			System.out.println("(9) Set Heater Temperature");
			System.out.println("(10) Set Heater Mode");
			System.out.println("(11) Turn On Television");
			System.out.println("(12) Turn Off Television");
			System.out.println("(13) Set Television Channel");
			System.out.println("(14) Check");
			System.out.println("(15) Back to the previous Menù");
			System.out.print("-> ");
			int choice = 0;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			int x = 0,y= 0;
			if(choice < 1 || choice > 15){
				System.out.println("Invalid choice, try again!");
				aspetta(1);
				continue;
			}
			switch(choice){
				case 1:
					remote.loungeLightsOn();
					System.out.println("Lounge Lights ON");
					aspetta(1);
					done = 1;
					break;
				case 2:
					remote.loungeLightsOff();
					System.out.println("Lounge Lights OFF");
					aspetta(1);
					done = 1;
					break;
				case 3:
					System.out.println("Which one of the 8 Lights you want to turn on?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.loungeLightOn(x);
					System.out.println("Lounge Light n."+ x + " turned ON");
					aspetta(1);
					done = 1;
					break;
				case 4:
					System.out.println("Which one of the 8 Lights you want to turn off?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.loungeLightOff(x);
					System.out.println("Lounge Light n."+ x + " turned OFF");
					aspetta(1);
					done = 1;
					break;
				case 5:
					System.out.println("Which one of the 4 Lights you want to modify the luminosity?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.loungeSetLightLuminosity(x,y);
					System.out.println("Lounge Light n."+ x + " luminosity set up to "+ y);
					aspetta(1);
					done = 1;
					break;
				case 6:
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.loungeSetLightsLuminosity(x);
					System.out.println("Lounge Light luminosity set to " + x);
					aspetta(1);
					done = 1;
					break;
				case 7:
					remote.loungeHeaterOn();
					System.out.println("Lounge Heater On");
					aspetta(1);
					done = 1;
					break;
				case 8:
					remote.loungeHeaterOff();
					System.out.println("Lounge Heater Off");
					aspetta(1);
					done = 1;
					break;
				case 9:
					remote.loungeHeaterTemp();
					System.out.println("Lounge Heater Tempetature Set correctly!");
					aspetta(1);
					done = 1;
					break;
				case 10:
					remote.loungeHeaterMode();
					System.out.println("Lounge Heater Mode Set correctly!");
					aspetta(1);
					done = 1;
					break;
				case 11:
					remote.loungeTvOn();
					System.out.println("Lounge Television On");
					aspetta(1);
					done = 1;
					break;
				case 12:
					remote.loungeTvOff();
					System.out.println("Lounge Television Off");
					aspetta(1);
					done = 1;
					break;
				case 13:
					remote.loungeTvChannel();
					System.out.println("Lounge Television Channel Set correctly");
					aspetta(1);
					done = 1;
					break;					
				case 14:	
					remote.loungeCheck();
					System.out.print("Enter to continue");
					sc.nextLine();
					sc.nextLine();
					done = 1;
					break;	
				case 15:
					done = 1;
					break;
			}
		}
    }
    
    //Bathroom submenu
    
    public static void bathroom(Remote remote){
    	int done = 0;
    	while(done == 0){
    		clearScreen();
			System.out.println("Bathroom management section");
			System.out.println("Choose one from the following options by typing the correspective number and pressing enter!");
			System.out.println("(1) Turn All Lights On");
			System.out.println("(2) Turn All lights Off");
			System.out.println("(3) Choose Light to Turn On");
			System.out.println("(4) Choose Light to Turn Off");
			System.out.println("(5) Set Specific Light Luminosity");
			System.out.println("(6) Set All Lights Lumininosity");
			System.out.println("(7) Check");
			System.out.println("(8) Back to the previous Menù");
			System.out.print("-> ");
			int choice = 0;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			int x = 0,y= 0;
			if(choice < 1 || choice > 8){
				System.out.println("Invalid choice, try again!");
				aspetta(1);
				continue;
			}
			switch(choice){
				case 1:
					remote.bathroomLightsOn();
					System.out.println("Bathroom Lights ON");
					aspetta(1);
					done = 1;
					break;
				case 2:
					remote.bathroomLightsOff();
					System.out.println("Bathroom Lights OFF");
					aspetta(1);
					done = 1;
					break;
				case 3:
					System.out.println("Which one of the 4 Lights you want to turn on?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.bathroomLightOn(x);
					System.out.println("Bathroom Light n."+ x + " turned ON");
					aspetta(1);
					done = 1;
					break;
				case 4:
					System.out.println("Which one of the 4 Lights you want to turn off?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.bathroomLightOff(x);
					System.out.println("Bathroom Light n."+ x + " turned OFF");
					aspetta(1);
					done = 1;
					break;
				case 5:
					System.out.println("Which one of the 4 Lights you want to modify the luminosity?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.bathroomSetLightLuminosity(x,y);
					System.out.println("Bathroom Light n."+ x + " luminosity set up to "+ y);
					aspetta(1);
					done = 1;
					break;
				case 6:
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.bathroomSetLightsLuminosity(x);
					System.out.println("Bathroom Light luminosity set to " + x);
					aspetta(1);
					done = 1;
					break;
				case 7:
					remote.bathroomCheck();
					System.out.print("Enter to continue");
					sc.nextLine();
					sc.nextLine();
					done = 1;
					break;
				case 8:
					done = 1;
					break;	
			}
		}
	}			

	//Doubleroom submenu
	
	static public void doubleroom(Remote remote){
		int done = 0;
    	while(done == 0){
    		clearScreen();
			System.out.println("Doubleroom management section");
			System.out.println("Choose one from the following options by typing the correspective number and pressing enter!");
			System.out.println("(1) Turn All Lights On");
			System.out.println("(2) Turn All lights Off");
			System.out.println("(3) Choose Light to Turn On");
			System.out.println("(4) Choose Light to Turn Off");
			System.out.println("(5) Set Specific Light Luminosity");
			System.out.println("(6) Set All Lights Lumininosity");
			System.out.println("(7) Turn On Heater");
			System.out.println("(8) Turn Off Heater");
			System.out.println("(9) Set Heater Temperature");
			System.out.println("(10) Set Heater Mode");
			System.out.println("(11) Turn On Television");
			System.out.println("(12) Turn Off Television");
			System.out.println("(13) Set Television Channel");
			System.out.println("(14) Check");
			System.out.println("(15) Back to the previous Menù");
			System.out.print("-> ");
			int choice = 0;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			int x = 0,y= 0;
			if(choice < 1 || choice > 15){
				System.out.println("Invalid choice, try again!");
				aspetta(1);
				continue;
			}
			switch(choice){
				case 1:
					remote.doubleroomLightsOn();
					System.out.println("Doubleroom Lights ON");
					aspetta(1);
					done = 1;
					break;
				case 2:
					remote.doubleroomLightsOff();
					System.out.println("Doubleroom Lights OFF");
					aspetta(1);
					done = 1;
					break;
				case 3:
					System.out.println("Which one of the 4 Lights you want to turn on?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.doubleroomLightOn(x);
					System.out.println("Doubleroom Light n."+ x + " turned ON");
					aspetta(1);
					done = 1;
					break;
				case 4:
					System.out.println("Which one of the 4 Lights you want to turn off?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.doubleroomLightOff(x);
					System.out.println("Doubleroom Light n."+ x + " turned OFF");
					aspetta(1);
					done = 1;
					break;
				case 5:
					System.out.println("Which one of the 4 Lights you want to modify the luminosity?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.doubleroomSetLightLuminosity(x,y);
					System.out.println("Doubleroom Light n."+ x + " luminosity set up to "+ y);
					aspetta(1);
					done = 1;
					break;
				case 6:
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.doubleroomSetLightsLuminosity(x);
					System.out.println("Doubleroom Light luminosity set to " + x);
					aspetta(1);
					done = 1;
					break;
				case 7:
					remote.doubleroomHeaterOn();
					System.out.println("Doubleroom Heater On");
					aspetta(1);
					done = 1;
					break;
				case 8:
					remote.doubleroomHeaterOff();
					System.out.println("Doubleroom Heater Off");
					aspetta(1);
					done = 1;
					break;
				case 9:
					remote.doubleroomHeaterTemp();
					System.out.println("Doubleroom Heater Tempetature Set correctly!");
					aspetta(1);
					done = 1;
					break;
				case 10:
					remote.doubleroomHeaterMode();
					System.out.println("Doubleroom Heater Mode Set correctly!");
					aspetta(1);
					done = 1;
					break;
				case 11:
					remote.doubleroomTvOn();
					System.out.println("Doubleroom Television On");
					aspetta(1);
					done = 1;
					break;
				case 12:
					remote.doubleroomTvOff();
					System.out.println("Doubleroom Television Off");
					aspetta(1);
					done = 1;
					break;
				case 13:
					remote.doubleroomTvChannel();
					System.out.println("Doubleroom Television Channel Set correctly");
					aspetta(1);
					done = 1;
					break;					
				case 14:	
					remote.doubleroomCheck();
					System.out.print("Enter to continue");
					sc.nextLine();
					sc.nextLine();
					done = 1;
					break;	
				case 15:
					done = 1;
					break;	
			}
		}
	}
	
	//Bedroom submenu
	static public void bedroom(Remote remote){
		int done = 0;
    	while(done == 0){
    		clearScreen();
			System.out.println("Bedroom management section");
			System.out.println("Choose one from the following options by typing the correspective number and pressing enter!");
			System.out.println("(1) Turn All Lights On");
			System.out.println("(2) Turn All lights Off");
			System.out.println("(3) Choose Light to Turn On");
			System.out.println("(4) Choose Light to Turn Off");
			System.out.println("(5) Set Specific Light Luminosity");
			System.out.println("(6) Set All Lights Lumininosity");
			System.out.println("(7) Turn On Heater");
			System.out.println("(8) Turn Off Heater");
			System.out.println("(9) Set Heater Temperature");
			System.out.println("(10) Set Heater Mode");
			System.out.println("(11) Turn On Television");
			System.out.println("(12) Turn Off Television");
			System.out.println("(13) Set Television Channel");
			System.out.println("(14) Check");
			System.out.println("(15) Back to the previous Menù");
			System.out.print("-> ");
			int choice = 0;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			int x = 0,y= 0;
			if(choice < 1 || choice > 15){
				System.out.println("Invalid choice, try again!");
				aspetta(1);
				continue;
			}
			switch(choice){
				case 1:
					remote.bedroomLightsOn();
					System.out.println("Bedroom Lights ON");
					aspetta(1);
					done = 1;
					break;
				case 2:
					remote.bedroomLightsOff();
					System.out.println("Bedroom Lights OFF");
					aspetta(1);
					done = 1;
					break;
				case 3:
					System.out.println("Which one of the 4 Lights you want to turn on?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.bedroomLightOn(x);
					System.out.println("Bedroom Light n."+ x + " turned ON");
					aspetta(1);
					done = 1;
					break;
				case 4:
					System.out.println("Which one of the 4 Lights you want to turn off?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.bedroomLightOff(x);
					System.out.println("Bedroom Light n."+ x + " turned OFF");
					aspetta(1);
					done = 1;
					break;
				case 5:
					System.out.println("Which one of the 4 Lights you want to modify the luminosity?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.bedroomSetLightLuminosity(x,y);
					System.out.println("Bedroom Light n."+ x + " luminosity set up to "+ y);
					aspetta(1);
					done = 1;
					break;
				case 6:
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.bedroomSetLightsLuminosity(x);
					System.out.println("Bedroom Lights luminosity set to " + x);
					aspetta(1);
					done = 1;
					break;
				case 7:
					remote.bedroomHeaterOn();
					System.out.println("Bedroom Heater On");
					aspetta(1);
					done = 1;
					break;
				case 8:
					remote.bedroomHeaterOff();
					System.out.println("Bedroom Heater Off");
					aspetta(1);
					done = 1;
					break;
				case 9:
					remote.bedroomHeaterTemp();
					System.out.println("Bedroom Heater Tempetature Set correctly!");
					aspetta(1);
					done = 1;
					break;
				case 10:
					remote.bedroomHeaterMode();
					System.out.println("Bedroom Heater Mode Set correctly!");
					aspetta(1);
					done = 1;
					break;
				case 11:
					remote.bedroomTvOn();
					System.out.println("Bedroom Television On");
					aspetta(1);
					done = 1;
					break;
				case 12:
					remote.bedroomTvOff();
					System.out.println("Bedroom Television Off");
					aspetta(1);
					done = 1;
					break;
				case 13:
					remote.bedroomTvChannel();
					System.out.println("Bedroom Television Channel Set correctly");
					aspetta(1);
					done = 1;
					break;					
				case 14:	
					remote.bedroomCheck();
					System.out.print("Enter to continue");
					sc.nextLine();
					sc.nextLine();
					done = 1;
					break;	
				case 15:
					done = 1;
					break;	
			}
		}
	}
	
	//Guestroom submenu
	
	static public void guestroom(Remote remote){
		int done = 0;
    	while(done == 0){
    		clearScreen();
			System.out.println("Guestroom management section");
			System.out.println("Choose one from the following options by typing the correspective number and pressing enter!");
			System.out.println("(1) Turn All Lights On");
			System.out.println("(2) Turn All lights Off");
			System.out.println("(3) Choose Light to Turn On");
			System.out.println("(4) Choose Light to Turn Off");
			System.out.println("(5) Set Specific Light Luminosity");
			System.out.println("(6) Set All Lights Lumininosity");
			System.out.println("(7) Turn On Heater");
			System.out.println("(8) Turn Off Heater");
			System.out.println("(9) Set Heater Temperature");
			System.out.println("(10) Set Heater Mode");
			System.out.println("(11) Turn On Television");
			System.out.println("(12) Turn Off Television");
			System.out.println("(13) Set Television Channel");
			System.out.println("(14) Check");
			System.out.println("(15) Back to the previous Menù");
			System.out.print("-> ");
			int choice = 0;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			int x = 0,y= 0;
			if(choice < 1 || choice > 15){
				System.out.println("Invalid choice, try again!");
				aspetta(1);
				continue;
			}
			switch(choice){
				case 1:
					remote.guestroomLightsOn();
					System.out.println("Guestroom Lights ON");
					aspetta(1);
					done = 1;
					break;
				case 2:
					remote.guestroomLightsOff();
					System.out.println("Guestroom Lights OFF");
					aspetta(1);
					done = 1;
					break;
				case 3:
					System.out.println("Which one of the 4 Lights you want to turn on?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.guestroomLightOn(x);
					System.out.println("Guestroom Light n."+ x + " turned ON");
					aspetta(1);
					done = 1;
					break;
				case 4:
					System.out.println("Which one of the 4 Lights you want to turn off?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.guestroomLightOff(x);
					System.out.println("Guestroom Light n."+ x + " turned OFF");
					aspetta(1);
					done = 1;
					break;
				case 5:
					System.out.println("Which one of the 4 Lights you want to modify the luminosity?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.guestroomSetLightLuminosity(x,y);
					System.out.println("Guestroom Light n."+ x + " luminosity set up to "+ y);
					aspetta(1);
					done = 1;
					break;
				case 6:
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.guestroomSetLightsLuminosity(x);
					System.out.println("Guestroom Light luminosity set to " + x);
					aspetta(1);
					done = 1;
					break;
				case 7:
					remote.guestroomHeaterOn();
					System.out.println("Guestroom Heater On");
					aspetta(1);
					done = 1;
					break;
				case 8:
					remote.guestroomHeaterOff();
					System.out.println("Guestroom Heater Off");
					aspetta(1);
					done = 1;
					break;
				case 9:
					remote.guestroomHeaterTemp();
					System.out.println("Guestroom Heater Tempetature Set correctly!");
					aspetta(1);
					done = 1;
					break;
				case 10:
					remote.guestroomHeaterMode();
					System.out.println("Guestroom Heater Mode Set correctly!");
					aspetta(1);
					done = 1;
					break;
				case 11:
					remote.guestroomTvOn();
					System.out.println("Guestroom Television On");
					aspetta(1);
					done = 1;
					break;
				case 12:
					remote.guestroomTvOff();
					System.out.println("Guestroom Television Off");
					aspetta(1);
					done = 1;
					break;
				case 13:
					remote.guestroomTvChannel();
					System.out.println("Guestroom Television Channel Set correctly");
					aspetta(1);
					done = 1;
					break;					
				case 14:	
					remote.guestroomCheck();
					System.out.print("Enter to continue");
					sc.nextLine();
					sc.nextLine();
					done = 1;
					break;	
				case 15:
					done = 1;
					break;	
			}
		}
	}
    
    //Diningroom submenu
    
    static public void diningroom(Remote remote){
		int done = 0;
    	while(done == 0){
    		clearScreen();
			System.out.println("Diningroom management section");
			System.out.println("Choose one from the following options by typing the correspective number and pressing enter!");
			System.out.println("(1) Turn All Lights On");
			System.out.println("(2) Turn All lights Off");
			System.out.println("(3) Choose Light to Turn On");
			System.out.println("(4) Choose Light to Turn Off");
			System.out.println("(5) Set Specific Light Luminosity");
			System.out.println("(6) Set All Lights Lumininosity");
			System.out.println("(7) Turn On Heater");
			System.out.println("(8) Turn Off Heater");
			System.out.println("(9) Set Heater Temperature");
			System.out.println("(10) Set Heater Mode");
			System.out.println("(11) Turn On Television");
			System.out.println("(12) Turn Off Television");
			System.out.println("(13) Set Television Channel");
			System.out.println("(14) Turn On Coffee Machine");
			System.out.println("(15) Turn Off Coffee Machine");
			System.out.println("(16) Prepare Espresso");
			System.out.println("(17) Prepare Lungo");
			System.out.println("(18) Prepare Cappuccino");
			System.out.println("(19) Check");
			System.out.println("(20) Back to the previous Menù");
			System.out.print("-> ");
			int choice = 0;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			int x = 0,y= 0;
			if(choice < 1 || choice > 20){
				System.out.println("Invalid choice, try again!");
				aspetta(1);
				continue;
			}
			switch(choice){
				case 1:
					remote.diningroomLightsOn();
					System.out.println("Diningroom Lights ON");
					aspetta(1);
					done = 1;
					break;
				case 2:
					remote.diningroomLightsOff();
					System.out.println("Diningroom Lights OFF");
					aspetta(1);
					done = 1;
					break;
				case 3:
					System.out.println("Which one of the 6 Lights you want to turn on?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.diningroomLightOn(x);
					System.out.println("Diningroom Light n."+ x + " turned ON");
					aspetta(1);
					done = 1;
					break;
				case 4:
					System.out.println("Which one of the 6 Lights you want to turn off?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.diningroomLightOff(x);
					System.out.println("Diningroom Light n."+ x + " turned OFF");
					aspetta(1);
					done = 1;
					break;
				case 5:
					System.out.println("Which one of the 6 Lights you want to modify the luminosity?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.diningroomSetLightLuminosity(x,y);
					System.out.println("Diningroom Light n."+ x + " luminosity set up to "+ y);
					aspetta(1);
					done = 1;
					break;
				case 6:
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.diningroomSetLightsLuminosity(x);
					System.out.println("Diningroom Light luminosity set to " + x);
					aspetta(1);
					done = 1;
					break;
				case 7:
					remote.diningroomHeaterOn();
					System.out.println("Diningroom Heater On");
					aspetta(1);
					done = 1;
					break;
				case 8:
					remote.diningroomHeaterOff();
					System.out.println("Diningroom Heater Off");
					aspetta(1);
					done = 1;
					break;
				case 9:
					remote.diningroomHeaterTemp();
					System.out.println("Diningroom Heater Tempetature Set correctly!");
					aspetta(1);
					done = 1;
					break;
				case 10:
					remote.diningroomHeaterMode();
					System.out.println("Diningroom Heater Mode Set correctly!");
					aspetta(1);
					done = 1;
					break;
				case 11:
					remote.diningroomTvOn();
					System.out.println("Diningroom Television On");
					aspetta(1);
					done = 1;
					break;
				case 12:
					remote.diningroomTvOff();
					System.out.println("Diningroom Television Off");
					aspetta(1);
					done = 1;
					break;
				case 13:
					remote.diningroomTvChannel();
					System.out.println("Diningroom Television Channel Set correctly");
					aspetta(1);
					done = 1;
					break;
				case 14:
					remote.diningroomturnOnCoffeemachine();
					System.out.println("Diningroom Coffee Machine is ON");
					aspetta(1);
					done = 1;
					break;
				case 15:
					remote.diningroomturnOffCoffeemachine();
					System.out.println("Diningroom Coffee Machine is OFF");
					aspetta(1);
					done = 1;
					break;
				case 16:
					remote.diningroomEspresso();
					aspetta(1);
					done = 1;
					break;
				case 17:
					remote.diningroomLungo();
					aspetta(1);
					done = 1;
					break;
				case 18:
					remote.diningroomCappuccino();
					aspetta(1);
					done = 1;
					break;
				case 19:	
					remote.diningroomCheck();
					System.out.print("Enter to continue");
					sc.nextLine();
					sc.nextLine();
					done = 1;
					break;	
				case 20:
					done = 1;
					break;	
			}
		}
	}
    
    //garage submenu
    
    static public void garage(Remote remote){
    	int done = 0;
    	while(done == 0){
    		clearScreen();
			System.out.println("Garage management section");
			System.out.println("Choose one from the following options by typing the correspective number and pressing enter!");
			System.out.println("(1) Open Door");
			System.out.println("(2) Close Door");
			System.out.println("(3) Turn All Lights On");
			System.out.println("(4) Turn All lights Off");
			System.out.println("(5) Choose Light to Turn On");
			System.out.println("(6) Choose Light to Turn Off");
			System.out.println("(7) Set Specific Light Luminosity");
			System.out.println("(8) Set All Lights Lumininosity");
			System.out.println("(9) Check");
			System.out.println("(10) Back to the previous Menù");
			System.out.print("-> ");
			int choice = 0;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			int x = 0,y= 0;
			if(choice < 1 || choice > 10){
				System.out.println("Invalid choice, try again!");
				aspetta(1);
				continue;
			}
			switch(choice){
				case 1:
					remote.garageOpenDoor();
					System.out.println("Garage Door Opened");
					aspetta(1);
					done = 1;
					break;
				case 2:
					remote.garageCloseDoor();
					System.out.println("Garage Door Closed");
					aspetta(1);
					done = 1;
				case 3:
					remote.garageLightsOn();
					System.out.println("Garage Lights ON");
					aspetta(1);
					done = 1;
					break;
				case 4:
					remote.garageLightsOff();
					System.out.println("Garage Lights OFF");
					aspetta(1);
					done = 1;
					break;
				case 5:
					System.out.println("Which one of the 4 Lights you want to turn on?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.garageLightOn(x);
					System.out.println("Garage Light n."+ x + " turned ON");
					aspetta(1);
					done = 1;
					break;
				case 6:
					System.out.println("Which one of the 4 Lights you want to turn off?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.garageLightOff(x);
					System.out.println("Garage Light n."+ x + " turned OFF");
					aspetta(1);
					done = 1;
					break;
				case 7:
					System.out.println("Which one of the 4 Lights you want to modify the luminosity?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.garageSetLightLuminosity(x,y);
					System.out.println("Garage Light n."+ x + " luminosity set up to "+ y);
					aspetta(1);
					done = 1;
					break;
				case 8:
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.garageSetLightsLuminosity(x);
					System.out.println("Garage Light luminosity set to " + x);
					aspetta(1);
					done = 1;
					break;
				case 9:
					remote.garageCheck();
					System.out.print("Enter to continue");
					sc.nextLine();
					sc.nextLine();
					done = 1;
					break;	
				case 10:
					done = 1;
					break;
			}
		}	
    }
    
    //front garden submenu
    
    public static void backgarden(Remote remote){
    	int done = 0;
    	while(done == 0){
    		clearScreen();
			System.out.println("Back Garden management section");
			System.out.println("Choose one from the following options by typing the correspective number and pressing enter!");
			System.out.println("(1) Turn All Lights On");
			System.out.println("(2) Turn All lights Off");
			System.out.println("(3) Choose Light to Turn On");
			System.out.println("(4) Choose Light to Turn Off");
			System.out.println("(5) Set Specific Light Luminosity");
			System.out.println("(6) Set All Lights Lumininosity");
			System.out.println("(7) Turn All pumps On");
			System.out.println("(8) Turn All Pumps Off");
			System.out.println("(9) Choose Pump to Turn On");
			System.out.println("(10) Choose Pump to Turn Off");
			System.out.println("(11) Activate All Sprays");
			System.out.println("(12) Deactivate All Sprays");
			System.out.println("(13) Activate Specific Spray");
			System.out.println("(14) Deactivate Specific Spray");
			System.out.println("(15) Set All Pumps Flow");
			System.out.println("(16) Set Pump Flow");
			System.out.println("(17) Check");
			System.out.println("(18) Back to the previous Menù");
			System.out.print("-> ");
			int choice = 0;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			int x = 0,y= 0;
			if(choice < 1 || choice > 18){
				System.out.println("Invalid choice, try again!");
				aspetta(1);
				continue;
			}
			switch(choice){
				case 1:
					remote.backGardenLightsOn();
					System.out.println("Back garden Lights ON");
					aspetta(1);
					done = 1;
					break;
				case 2:
					remote.backGardenLightsOff();
					System.out.println("Back garden Lights OFF");
					aspetta(1);
					done = 1;
					break;
				case 3:
					System.out.println("Which one of the 8 Lights you want to turn on?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.backGardenLightOn(x);
					System.out.println("Back garden Light n."+ x + " turned ON");
					aspetta(1);
					done = 1;
					break;
				case 4:
					System.out.println("Which one of the 8 Lights you want to turn off?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.backGardenLightOff(x);
					System.out.println("Back garden Light n."+ x + " turned OFF");
					aspetta(1);
					done = 1;
					break;
				case 5:
					System.out.println("Which one of the 8 Lights you want to modify the luminosity?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.backGardenSetLightLuminosity(x,y);
					System.out.println("Back garden Light n."+ x + " luminosity set up to "+ y);
					aspetta(1);
					done = 1;
					break;
				case 6:
					System.out.println("Luminosity(1-5)");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.backGardenSetLightsLuminosity(x);
					System.out.println("Back garden Light luminosity set to " + x);
					aspetta(1);
					done = 1;
					break;
				case 7:
					remote.backGardenTurnPumpsOn();
					System.out.println("Back garden Pumps turned ON");
					aspetta(1);
					done = 1;
					break;
				case 8:
					remote.backGardenTurnPumpsOff();
					System.out.println("Back garden Pumps turned OFF");
					aspetta(1);
					done = 1;
					break;
				case 9:
					System.out.println("Which one of the 2 Pumps you want to turn ON?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.backGardenTurnPumpOn(x);
					aspetta(1);
					done = 1;
					break;
				case 10:
					System.out.println("Which one of the 2 Pumps you want to turn OFF?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.backGardenTurnPumpOff(x);
					aspetta(1);
					done = 1;
					break;
				case 11:
					remote.backGardenActivateAllSprays();
					System.out.println("Back Garden Spays All Activated");
					aspetta(1);
					done = 1;
					break;
				case 12:
					remote.backGardenDeactivateAllSprays();
					System.out.println("Back Garden Spays All Deactived");
					aspetta(1);
					done = 1;
					break;
				case 13:
					System.out.println("In Which one of the 2 Pumps you want to Activate a spray?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Which spray");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.backGardenActivateSpray(x,y);
					System.out.println("Back garden Irrigation system n."+ x + " , spray n."+ y + " is now Activated");
					aspetta(1);
					done = 1;
					break;
				case 14:
					System.out.println("In Which one of the 2 Pumps you want to Deactivate a spray?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Which spray");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.backGardenDeactivateSpray(x,y);
					System.out.println("Back garden Irrigation system n."+ x + " , spray n."+ y + " is now Dectivated");
					aspetta(1);
					done = 1;
					break;
				case 15:
					System.out.println("Which flow value you want to set to the 3 Pumps?");
					System.out.print("-> ");
					x = sc.nextInt();
					remote.backGardenSetPumpsFlow(x);
					System.out.println("Back garden Irrigation systems Pumps flow power set up to "+ x);
					aspetta(1);
					done = 1;
					break;
				case 16:
					System.out.println("Which one of the 3 Pumps you want modify the flow power value?");
					System.out.print("-> ");
					x = sc.nextInt();
					System.out.println("Value(1-5)");
					System.out.print("-> ");
					y = sc.nextInt();
					remote.backGardenSetPumpFLow(x,y);
					System.out.println("Back garden Irrigation system n." + x + " , flow power level set up to "+ y );
					aspetta(1);
					done = 1;
					break;
				case 17:
					remote.backGardenCheck();
					System.out.print("Enter to continue");
					sc.nextLine();
					sc.nextLine();
					done = 1;
					break;	
				case 18:
					done = 1;
					break;
			}
    	}		
    }
    
    //General submenu
    
    public static void general(Remote remote){
    	int done = 0;
    	while(done == 0){
    		clearScreen();
    		int choice = 0;
    		System.out.println("General management section");
			System.out.println("Choose one from the following options by typing the correspective number and pressing enter!");
			System.out.println("(1) Turn all lights On");
			System.out.println("(2) Turn all lights Off");
			System.out.println("(3) Turn all Heater On");
			System.out.println("(4) Turn all heater Off");
			System.out.println("(5) Set all Heaters Temperature");
			System.out.println("(6) Set all Heaters Mode");
			System.out.println("(7) Check All");
			System.out.println("(8) Back to the previous Menù");
			System.out.print("-> ");
    		Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			int x = 0,y= 0;
			if(choice < 1 || choice > 8){
				System.out.println("Invalid choice, try again!");
				aspetta(1);
				continue;
			}
			switch(choice){
				case 1:
					remote.turnAllLightsOn();
					aspetta(1);
					done = 1;
					break;
				case 2:
					remote.turnAllLightsOff();
					aspetta(1);
					done = 1;
					break;
				case 3:
					remote.turnAllHeatersOn();
					aspetta(1);
					done = 1;
					break;
				case 4:
					remote.turnAllHeatersOff();
					aspetta(1);
					done = 1;
					break;
				case 5:
					remote.setAllHeatersTemp();
					aspetta(1);
					done = 1;
					break;
				case 6:
					remote.setAllHeatersMode();
					aspetta(1);
					done = 1;
					break;
				case 7:
					remote.checkAll();
					System.out.print("Enter to continue");
					sc.nextLine();
					sc.nextLine();
					aspetta(1);
					done = 1;
					break;
				case 8:
					done = 1;
					break;
			}
    	}
    }
    
	public static void main(String[] args){		
		Remote r = new Remote();
		int done = 0;
		while(done == 0){
			clearScreen();
			System.out.println("Welcome to the Main menu!");
			System.out.println("Choose one from the following options by typing the correspective number and pressing enter!");
			System.out.println("(1) Front Garden");
			System.out.println("(2) Entrance");
			System.out.println("(3) Lounge");
			System.out.println("(4) Bathroom");
			System.out.println("(5) Double Room");
			System.out.println("(6) Bed Room");
			System.out.println("(7) Guest Room");
			System.out.println("(8) Dining Room");
			System.out.println("(9) Garage");
			System.out.println("(10) Back Garden");
			System.out.println("(11) General");
			System.out.println("(12) Exit");
			System.out.print("-> ");
			int choice = 0;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			if(choice < 1 || choice > 12){
				System.out.println("Invalid choice,try again!");
				try{
					TimeUnit.SECONDS.sleep(1);
				}
				catch(InterruptedException e){}		
				clearScreen();
				continue;
			}
			switch(choice){
				case 1:
					fg(r);
					break;
				case 2:
					entrance(r);
					break;
				case 3:
					lounge(r);
					break;
				case 4:
					bathroom(r);
					break;
				case 5:
					doubleroom(r);
					break;
				case 6:
					bedroom(r);
					break;
				case 7:
					guestroom(r);
					break;
				case 8:
					diningroom(r);
					break;
				case 9:
					garage(r);
					break;
				case 10:
					backgarden(r);
					break;
				case 11:
					general(r);
					break;
				case 12:
					done = 1;
					break;	
			}
		}
		
		
		
	}
}
