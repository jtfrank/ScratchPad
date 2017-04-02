import java.util.InputMismatchException;
import java.util.Scanner;

public class Something00002 {

	public static void main(String[] args) {
		Something00002 overlord = new Something00002();
		System.out.println("Welcome to The Game");
		overlord.showMenu();
	}

	void showMenu(){
		System.out.println("Menu\n-----");
		System.out.println("1. New Game");
		System.out.println("0. Quit");
		getAndParseMenuChoice();
	}
	
	void getAndParseMenuChoice(){
		System.out.print("> ");
		Scanner in = new Scanner(System.in);
		
		int choice = 0;
		try{
			choice = in.nextInt();
		}
		catch(InputMismatchException ime){
			System.out.println("Not a valid choice");
			showMenu();
		}
		
		switch(choice){
		case 1:
			startNewGame();
			break;
		case 0: 
			System.exit(0);
		default:
			System.out.println("Not a valid choice");
			showMenu();
			break;
		}
	}
	
	void startNewGame(){
		System.out.println("You win!");
	}
}
