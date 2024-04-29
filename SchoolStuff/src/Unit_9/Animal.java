package Unit_9;

import java.util.*;

/*
 04-16-2024
 augustjones
 :3
 */
public class Animal {
	private String species;
	private int weight;

	public Animal(String s, int w) {
		species = s;
		weight = w;
	}

	public void setWeight(int x) {
		weight = x;
	}

	public int getWeight() {
		return weight;
	}

	class Elephant extends Animal {
		private int trunkLength;

		public Elephant(int tL) {
			super(species, weight);
			trunkLength = tL;
		}

		public void setTrunkLength(int tL) {
			trunkLength = tL;
		}

		public int getTrunkLength() {
			return trunkLength;
		}

		public void eatMeal() {
			int x = getWeight();
			setWeight(x += 20);
		}

		public void walkAround() {
			int x = getWeight();
			setWeight(x -= 5);
		}

		public void grow() {
			int x = getWeight();
			setTrunkLength(trunkLength + (x % 4));
		}

		public String toString() {
			return "Weight = " + getWeight() + " Trunk Length = " + getTrunkLength();
		}
	}

	public static void main(String[] args) {
		Animal a = new Animal(null, 200);
		ArrayList<Elephant> enclosure = new ArrayList<Elephant>();
		enclosure.add(a.new Elephant(80));
		enclosure.add(a.new Elephant(75));
		enclosure.add(a.new Elephant(84));
		enclosure.get(2).eatMeal();
		enclosure.get(1).walkAround();
		enclosure.get(0).grow();
		System.out.println(enclosure.get(0).toString());
		System.out.println(enclosure.get(1).toString());
		System.out.println(enclosure.get(2).toString());

	}
}
