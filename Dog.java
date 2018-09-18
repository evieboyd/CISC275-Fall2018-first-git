import java.util.Comparator;
import java.util.Collections;
public class Dog extends Animal {

	String dogname;
	int dogleg;

	public Dog(String name, int leg) {
		dogname = name;
		dogleg = leg;
	}
	
	public String toString() {
		return dogname;
	}
	public int getLegs() {
		return dogleg;
	}

	@Override
	public int compareTo(Animal arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}