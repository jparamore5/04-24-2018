import java.util. Scanner;
public class nameBreed {
	public static void main(String[]args) {

		Scanner scan = new Scanner (System.in);
		

		kitten[] kitten= new kitten[3];//create empty kitten array 
		
		//loop that runs through the array
		for (int i=0;i<3;i++) {
			System.out.println("Enter Name and Breed");
			//making an empty object of kitten 
			kitten cat = new kitten();
			
			//this is placing information into the kitten object 
			cat.Name=scan.nextLine();
			cat.breed=scan.nextLine();
			kitten[i] = cat;
			
			
			System.out.println(kitten[i].Name);

		}
		System.out.println(kitten[1].Name);
		System.out.println(kitten[1].breed);
	}
	
}
