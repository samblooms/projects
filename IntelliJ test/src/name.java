public class name {
	private String name;
	
	public name(){
		this.name = "John Smith";
	}
	
	public name( String s ){
		this.name = s;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName( String s ) {
		this.name = s;
	}
	
}
