import java.util.Scanner;//import the scanner
public class Username {

	public static void main(String[] args) {
		String username, password;//declare the strings
		System.out.println("Enter your username");
		Scanner keyboard = new Scanner(System.in);
		username = keyboard.next();//prompt for the username
		System.out.println("Enter your password");
		password = keyboard.next();//promopt for the password
		if (username.equals("CSC")&&password.equals("password"))
		{System.out.println("Welcome " +username +".");}
		else{System.out.println("Wrong username or password");}//print the answer
	}

}
