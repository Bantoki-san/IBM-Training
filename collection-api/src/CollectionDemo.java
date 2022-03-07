import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {

		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Microsoft");
		lst.add("Google");
		lst.addFirst("Apple");
		lst.addLast("Apache");
		lst.add(2, "Oracle");

//		System.out.println("---ITERATION using For Loop---");
//		for (int i = 0; i < lst.size(); i++) {
//			System.out.println(lst.get(i));
//		}

//		System.out.println("---ITERATION using ITERATOR");

		System.out.println("---ITERATING USING For-each---");
		for (String e : lst)
			System.out.println(e);

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("IBM");
		ar.add("Apple");
		ar.add("JBoss");

		ar.addAll(lst);
		System.out.println("----Iterating Over Merged Collection---");
		for (String e : ar)
			System.out.println(e);

		HashSet<String> set = new HashSet<String>(ar);
		System.out.println("---Iterating Over Set Collection---");
		for (String e : set)
			System.out.println(e);

		TreeSet<String> trs = new TreeSet<String>(set);
		System.out.println("---Iterating over TreeSet---");
		for (String e : trs)
			System.out.println(e);

	}
}
