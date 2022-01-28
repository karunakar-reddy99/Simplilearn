import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class AboutCollections {

	public static void main(String[] args) {
		//ARRAY LIST
		ArrayList<String> listofarrays = new ArrayList<>();
		listofarrays.add("karunakar");
		listofarrays.add("deekshitha");
		listofarrays.add("waleed");
		listofarrays.add("Meghana");
		System.out.println("size if list :"+listofarrays.size());
		System.out.println(listofarrays.get(1));
//	    String name = (String)listofarrays.get(1);
//	    int name1 = (Integer)listofarrays.get(0);
		System.out.println(listofarrays);
		listofarrays.remove(3);
		System.out.println(listofarrays);
		for(String val : listofarrays) {
			System.out.println("ARRAY LIST ......");
			System.out.println(val);
		}
		//LINKED LIST
		LinkedList<Integer> list = new LinkedList<>();
		list.add(99);
		list.add(55);
		list.add(36);
		list.add(98);
		list.addFirst(302);
		list.add(2, 22);
		list.addLast(956);
		System.out.println(list);
		list.remove();
		list.remove(3);
		list.removeLast();
		System.out.println(list);
		System.out.println("LINKED LIST .......");
		list.forEach(System.out::println);
		//HASH SET
		HashSet<Double> flag = new HashSet<>();
		flag.add(33.365);
		flag.add(66.98);
		flag.add(68.32);
		System.out.println(flag);
		flag.add(92.354);
		System.out.println("HASH SET ......");
		flag.forEach(System.out::println);
		//TREE SET
		TreeSet<Integer> set = new TreeSet<>();
		set.add(6);
		set.add(98);
		set.add(36);
		set.add(539);
		System.out.println(set);
		System.out.println("TREE SET .......");
		set.forEach(System.out::println);
		//HASH MAP
		HashMap<String,Integer> such = new HashMap<>();
		such.put("Karunakar",9);
		such.put("deekshitha", 98);
		such.put("waleed", 8);
		such.put("qureshi", 6);
		System.out.println("HASH MAP .....");
		such.forEach((k, v)->System.out.println(k+v));
		//TREE MAP
		TreeMap<String, Integer> app = new TreeMap<>();
		app.put("Karunakar",9);
		app.put("deekshitha", 98);
		app.put("waleed", 8);
		app.put("qureshi", 6);
		app.put("a",7);
		System.out.println("TREE MAP .......");
		app.forEach((k, v)->System.out.println(k+v));

	}

}
