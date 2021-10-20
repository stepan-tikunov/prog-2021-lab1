package edu.ifmo.tikunov.lab1.util;

public final class Random {
	public static boolean chance(double chance) {
		return Math.random() < chance;
	}

	public static int randomInt(int a, int b) {
		return (int)(Math.random() * (b - a + 1)) + a;
	}
}
