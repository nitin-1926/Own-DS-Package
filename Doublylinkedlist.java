import java.util.*;
import Nitin_ds.*;

public class Doublylinkedlist
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

		System.out.println(n.toString());
	}
}