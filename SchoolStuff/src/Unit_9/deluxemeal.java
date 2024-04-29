package Unit_9;

import java.util.*;

/*
 04-15-2024
 augustjones
 :3
 */
public class deluxemeal extends meal {
	private String side;
	private String drink;

	public deluxemeal(String e, double c, String s, String d) {
		super(e, c);
		side = s;
		drink = d;
	}

	@Override
	public String toString() {
		return ("deluxe" + e + "meal, $" + c + 3);
	}

}
