package collection.map;

import java.util.*;

public class map3 {

	public static void main(String[] args) {
		Properties statesAndCapitals = new Properties();
		statesAndCapitals.setProperty("AndhraPradesh", "Amaravathi");
		statesAndCapitals.setProperty("Telangana", "Hyderabad");
		statesAndCapitals.setProperty("TamilNadu", "Chennai");
		statesAndCapitals.setProperty("Karnataka", "Bengaluru");
		statesAndCapitals.setProperty("Kerala", "Thiruvananthapuram");

		Set<Map.Entry<Object, Object>> entry = statesAndCapitals.entrySet();
		Iterator<Map.Entry<Object, Object>> it = entry.iterator();
		while (it.hasNext()) {
			Map.Entry<Object, Object> map = it.next();
			System.out.println("State: " + map.getKey() + ", Capital: " + map.getValue());
		}

	}

}