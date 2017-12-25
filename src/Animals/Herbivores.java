/*  Practicing Java
     Article by Dr. Arif
     Animal classification based on 
     their food habit
*/

package Animals;

public class Herbivores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Animals that live on plants and vegetables");
		System.out.println("They have sharp incisors");
		System.out.println("Examples: Rabbit, Kangaroo, Cow etc");
		
		String name;
		name="Rabbit";
		
		if(name=="Rabbit")
		{
			System.out.println("Cute fluffy plant eating animal with sharp incisors");
		}
		
		else if(name=="Kangaroo")
		{
			System.out.println("National animal of Australia, carries baby in an abdominal pouch");
		}
		
		else {
			System.out.println("Animal with canines are not in this category");
		}
	}

}
