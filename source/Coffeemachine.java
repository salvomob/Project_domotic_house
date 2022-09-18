import java.util.concurrent.*;

public class Coffeemachine{
	private boolean power;
	private int choice;
	Coffeemachine(){
		power = false;
		choice = 0;
	}
	public void turnOn(){
		power = true;
	}
	public void turnOff(){
		power = false;
	}
	public void setEspresso(){
		choice = 1;
	}
	public void setLungo(){
		choice = 2;
	}
	public void setCappuccino(){
		choice = 3;
	}
	public void prepare(){
		if(power == false){
			System.out.print("Machine not ready, turn it on first!\n");
			choice = 0;
			return;
		}
		if(choice == 0){
			System.out.print("No product selected, try to select a product before!\n");
			return;
		}
		if(choice == 1){
			prepareEspresso();
			choice = 0;
			return;
		}
		if(choice == 2){
			prepareLungo();
			choice = 0;
			return;
		}
		if(choice == 3){
			prepareCappuccino();
			choice = 0;
			return;
		}
		
	}
	public void prepareEspresso(){
		System.out.print("Preparing Espresso.It will be ready in 3");
		try{
			TimeUnit.SECONDS.sleep(1);
		}
		catch(InterruptedException e){
			
		}System.out.print(" 2 ");
		try{
			TimeUnit.SECONDS.sleep(1);
		}
		catch(InterruptedException e){
			
		}
		System.out.print(" 1 \n");
		try{
			TimeUnit.SECONDS.sleep(1);
		}
		catch(InterruptedException e){
			
		}
		System.out.print("Your Espresso is ready!\n");
	}
	public void prepareCappuccino(){
		System.out.print("Preparing Cappuccino.It will be ready in 3");
		try{
			TimeUnit.SECONDS.sleep(1);
		}
		catch(InterruptedException e){
			
		}
		System.out.print(" 2 ");
		try{
			TimeUnit.SECONDS.sleep(1);
		}
		catch(InterruptedException e){
			
		}
		System.out.print(" 1 \n");
		try{
			TimeUnit.SECONDS.sleep(1);
		}
		catch(InterruptedException e){
			
		}
		System.out.print("Your Cappuccino is ready!\n");
	}
	public void prepareLungo(){
		System.out.print("Preparing Lungo.It will be ready in 3");
		try{
			TimeUnit.SECONDS.sleep(1);
		}
		catch(InterruptedException e){
			
		}
		System.out.print(" 2 ");
		try{
			TimeUnit.SECONDS.sleep(1);
		}
		catch(InterruptedException e){
			
		}
		System.out.print(" 1 \n");
		try{
			TimeUnit.SECONDS.sleep(1);
		}
		catch(InterruptedException e){
			
		}
		System.out.print("Your Lungo is ready!\n");
	}
	public void check(){
		if(!power)
			System.out.println("Coffee machine is OFF");
		else	
			System.out.println("Coffee machine is ON");
	}
}
