/**
 * 
 */
package com.study.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author
 *
 */
public class RegexSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Pattern:");
		Pattern p = Pattern.compile(scan.nextLine());
		System.out.println("String :");
		Matcher m = p.matcher(scan.nextLine());
		boolean found = false;
		while (m.find()) {
			System.out.println(m.group() + ":" + m.start() + ":" + m.end());
			found = true;
		}
		if (!found) {
			System.out.println("Not found");
		}
		scan.close();
	}

}
