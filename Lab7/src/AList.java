import java.util.LinkedList;
import java.util.ListIterator;
public class AList {

	public static void main (String [] args) {
		
	
		LinkedList<Object> a = new LinkedList<Object>();
		a.add("Tulsa");
		a.add("Ada");
		a.add("Broken Arrow");
		a.add("Owasso");
		a.add(1,"OKC");
		
		
		LinkedList<Object> b = new LinkedList<Object>();
		b.add("74104");
		b.add("74135");
		b.add("foo");
		b.add("hello world");
		b.add("777");
		
		//ListIterator<Object> aIter = b.listIterator();
		//Object theNext = aIter.next();
		//Object theNextnext = aIter.next();
		//System.out.println(theNextnext);
		a.addAll(b);
		System.out.println("Merged List: " + a);
		for(int i = 0; i < a.size();i++ ) {
			if(i%2 != 0) {
				a.remove(i);//creates new array, but then restarts removal with new array
			}
		}
		System.out.println("Removed Elements: " + a);
		LinkedList<Object> c = new LinkedList<Object>();
		c.addAll(b);
		System.out.println("New Second List:" + c);

	}	
}
