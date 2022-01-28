import java.util.*;
public class MapUses {

	public static void main(String[] args) {
		Map<String,String> hm

        = new HashMap<String,String>();

    hm.put("a","e");

    hm.put("b","f");

    hm.put("c","g");

    hm.put("d","h");

    for (Map.Entry<String,String> me : hm.entrySet()) {

        System.out.print(me.getKey() + ":");

        System.out.println(me.getValue());
}
	}

}
