package com.study.java.pattern.number;

public class Pattern4 {
	public static void main(String[] args) {
		int n = 3; 
		for (int i = 0; i < n; i++) {
			int num = 1;
			System.out.printf("%" + (n - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.printf("%4d", num);
				num = num * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}