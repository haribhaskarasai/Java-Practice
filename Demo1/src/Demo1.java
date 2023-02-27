import java.util.Iterator;

/**
 * 
 * @author haribhaskarasain
 *this program to add array
 */
public class Demo1 {

	public static void main(String[] args) {
		int[] intArray= {1,2,3,4,5};
		int j=0;
		for (int i = 0; i < intArray.length; i++) {
			
			j+= intArray[i];
			
		}
		System.out.println(j);
	}

}
