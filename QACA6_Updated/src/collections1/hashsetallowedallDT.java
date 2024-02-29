package collections1;
//hash set allowed the hetergenoius data type is allowed
import java.util.HashSet;

public class hashsetallowedallDT {

	public static void main(String[] args) {
		HashSet set=new HashSet<>();
		set.add(10);
		set.add(10.5);
		set.add(true);
		set.add('d');
		System.out.println(set);
	}
}
