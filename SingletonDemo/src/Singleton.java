
public class Singleton {

	private static Singleton instance = null;
	
	protected Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	protected void demo(){
		System.out.println("Test instancji");
	}
}

