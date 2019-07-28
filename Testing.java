import java.util.*;
import Nitin_ds.*;

public class Testing
{
	public static void main(String[] args) 
	{
		DoublyLinkedList<Integer> n = new DoublyLinkedList<Integer>();
		for(int i=0;i<5;i++)
		{
			n.addFirst(i);
			n.addLast(i*i);
		}
		n.removeFirst();
		n.removeLast();

		// CircularlyLinkedList<Integer> c = new CircularlyLinkedList<Integer>();
		// //for(int i=0;i<3;i++)
		// //{
		// 	c.addFirst(7);
		// 	c.addLast(8);
		// //}

		System.out.println(n.toString());
	}
}