import java.util. Scanner;
public class gametest {
	public static void main(String[]args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Name of game Breed");
		String Usergame = scan.nextLine();
		
		game[] gamelist= new game[5];
		gamelist[0]= new game ("Tart","scifi",5);
		gamelist[1] = new game ("fart","horror",5);
		gamelist[2] = new game ("bart","comedy",5);
		gamelist[3] = new game ("chart","scifi",5);
		gamelist[4] = new game ("Part","scifi",5);
		
		for (int i=0;i<5;i++) {
			if(gamelist[i].Name .equals(Usergame) ) {
				System.out.println(i);
		} else {
		System.out.println("GAme not found");
			
			
		}
		
		
		


}
}
}