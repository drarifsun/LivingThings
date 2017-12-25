/*  Practicing Java
     Article by Dr. Arif
     Animal classification based on 
     their food habit
*/

package Animals;

public class Omnivores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Animals living on both vegetables and meat is Omnivores");
		System.out.println("They have incisors as well as molars");
		System.out.println("Human is the best example of Omnivores\n");
		
		int name=1;
		switch(name)
		{
		case 1:
			System.out.println("Human is an omnivore");
			break;
			
		case 2:
			System.out.println("Baboon is an omnivore");
			break;
			
		case 3:
			System.out.println("Jackel is not an omnivore");
			break;
			
		default:
			System.out.println("not in the list of omnivores");
		}
	}

}
