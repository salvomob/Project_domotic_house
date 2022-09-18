public class AutomaticDoor{
	private boolean opened;
	public AutomaticDoor(){
		opened = false;
	}
	public void open(){
		opened = true;
	}
	public void close(){
		opened = false;
	}
	public void check(){
		if(opened)
			System.out.print("Automatic door is opened!\n");
		else
			System.out.print("Automatic door is closed!\n");
	}
}
