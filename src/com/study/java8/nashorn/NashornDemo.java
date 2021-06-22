package com.study.java8.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author rajan
 * 
 * demo nashorn - call script inside java class 22Jun2021
 *
 */
public class NashornDemo {
	
	public static void main(String args[]) {
		 ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");
		String name="rajan";
		Integer sum=null;
		try {
			engine.eval("print('"+name+"')");
			sum=(Integer)engine.eval("10 + 12");
		}catch(ScriptException se) {
			System.out.println(se.getMessage());
		}
		System.out.println(sum.toString());
	}

}
