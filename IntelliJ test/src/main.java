import java.util.Scanner;

public class main {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		helloWorld a = new helloWorld();
		name b = new name();
		car c = new car();
		
		System.out.println( a.getPhrase() );
		System.out.println( b.getName() );
		System.out.println( c.getCar() );
		
		System.out.println("PLease enter a phrase:");
		helloWorld d = new helloWorld( input.nextLine() );
		System.out.println("Please enter a name");
		name e = new name(input.nextLine());
		System.out.println("Please enter a car:");
		car f = new car(input.nextLine());
		
		System.out.println( "" );
		System.out.println( "SEPERATE DEFAULT FROM SPECIFIC" );
		System.out.println( "" );
		
		System.out.println( d.getPhrase() );
		System.out.println( e.getName() );
		System.out.println( f.getCar() );
		
		System.out.println();
		String name;
		do {
			System.out.println( "Please enter your name" );
			name = input.nextLine();
			
		} while (name.length() <= 0);
		e.setName(name);
		System.out.println(e.getName());
	}
	
}
