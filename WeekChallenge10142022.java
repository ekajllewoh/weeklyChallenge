package maf;

import java.util.LinkedList;

public class WeekChallenge10142022 {
	
	public static class linkChecker {
		public static Node linkIntersect(Node pin, Node pin2) {
			
			while(pin2 != null) {
				Node checker = pin;
				while(checker != null) {
					if (checker == pin2) {
						return pin2;
					}
					checker = checker.next;
				}
				pin2 = pin2.next;
			}
			return null;
		}
			
	}
	
	public static class Node{
		int pin3;
		Node next;
		Node (int pin4) {
			pin3 = pin4;
			next = null;
		}
	}

}
