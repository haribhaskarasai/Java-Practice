import java.util.Iterator;

public class User {
   void display() {
	   for (int i = 0; i < 5; i++) {
		System.out.println("Hari");
	}
   }
   void display(int howManyTimes, String name) {
	   for (int i = 0; i < howManyTimes; i++) {
		System.out.println(name);
	}
   }
}
