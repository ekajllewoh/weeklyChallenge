package maf;

import java.util.Scanner;

public class WeekChallenge10072022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		
		System.out.println("Plelase input your pin");
		String pin = sc.next();
		System.out.println(pinChecker.checkPin(pin));
		System.out.println("Check another pin");
		}
	}
	
	public static class pinChecker {
		public static boolean checkPin(String pin) {
			if(pin.length() == 6 || pin.length() == 4) {
				boolean checker = true;
				for(int i = 0; i < pin.length(); i++) {
					if(pin.charAt(i) == '1') {
						checker = false;
					}else if(pin.charAt(i) == '2') {
						checker = false;
					}else if(pin.charAt(i) == '3') {
						checker = false;
					}else if(pin.charAt(i) == '4') {
						checker = false;
					}else if(pin.charAt(i) == '5') {
						checker = false;
					}else if(pin.charAt(i) == '6') {
						checker = false;
					}else if(pin.charAt(i) == '7') {
						checker = false;
					}else if(pin.charAt(i) == '8') {
						checker = false;
					}else if(pin.charAt(i) == '9') {
						checker = false;
					}else if(pin.charAt(i) == '0') {
						checker = false;
					}
					if(checker) {
						return false;
					}
					checker = true;
				}
			}else {
				return false;
			}
			return true;
		}
	}

}
