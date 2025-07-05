package composiiton;

public class Body {
	private Head headRef;
	
	public Body() {
		headRef = new Head();
	}
	
	public void control() {
		headRef.think();
	}
	

	
	class Head{
		private float size;
		
		public void think() {
			System.out.println("thinking ...");
		}
	}
}
