public class Spray{
	private boolean activated;
	public Spray(){
		activated = false;
	}
	public void activate(){
		activated = true;
	}
	public void deactivate(){
		activated = false;
	}
	public void check(){
		if(activated)
			System.out.println("Spray is ACTIVATED");
		else
			System.out.println("Spray is DEACTIVATED");	
	}
}
