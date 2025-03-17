package generics;

import java.util.ArrayList;

import generic.classes.MyCustomData;
import generic.classes.PairData;
import generics.method.Dwayne;
import generics.method.Rocks;

public class Main {

	public static void main(String[] args) {
		
		MyCustomData<String> obj = new MyCustomData<String>("This is a string data");
		System.out.println(obj.getData());

		MyCustomData<Integer> intObj = new MyCustomData<Integer>(4);
		System.out.println(intObj.getData());
		
		PairData<Integer, String> pair = new PairData<Integer, String>(10, "Sebastian");
		System.out.println(pair);
		System.out.println("Key: " + pair.getKey());
		System.out.println("Value: " + pair.getValue());
		
		Rocks rocks = new Rocks();
		rocks.printSomething(new Dwayne());
		
		rocks.printSomething(pair);
		
	}

}
