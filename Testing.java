import java.util.*;
import Nitin_ds.*;

public class Testing
{
	public static void main(String[] args) 
	{
		SinglyLinkedList<Integer> s = new SinglyLinkedList<Integer>();
		for(int i=1;i<6;i++) {
			s.addLast(i);
		}
		SinglyLinkedList<Integer> r = new SinglyLinkedList<Integer>();
		r = s.reverse();

		//SinglyLinkedList<Integer> c = new SinglyLinkedList<Integer>();
		s.merge(r);

		System.out.println(s.toString());
		//System.out.println("Reversed " + r.toString());

		// DoublyLinkedList<Integer> n = new DoublyLinkedList<Integer>();
		// for(int i=0;i<5;i++)
		// {
		// 	n.addFirst(i);
		// 	n.addLast(i*i);
		// }
		// n.removeFirst();
		// n.removeLast();
		//System.out.println(n.toString());

		// CircularlyLinkedList<Integer> c = new CircularlyLinkedList<Integer>();
		// //for(int i=0;i<3;i++)
		// //{
		// 	c.addFirst(7);
		// 	c.addLast(8);
		// //}

		//System.out.println(c.toString());
	}
}