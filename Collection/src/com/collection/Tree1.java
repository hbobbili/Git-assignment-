package com.collection;
	
		import java.util.*;
		import java.util.TreeMap;
		public class Tree1 {
		    public static void main(String[] args)
		    {
		        TreeMap<Long, String> map = new TreeMap<Long, String>();
		        TreeMap<Long, String> Name = new TreeMap<Long,String>();
		        TreeMap<Long, String> email = new TreeMap<Long, String>();
		        TreeMap<Long, Enum> Gender = new TreeMap<Long, Enum>();
		        map.put(86548934756L, "Harika");
		        map.put(56748398655L, "Naipu");
		        map.put(86598767867L, "Vijaya");
		        map.put(66584946376L, "Sherli");
		        //  The keys are as follows
		        System.out.println("The keys of the given treemap is" + map.keySet());
		        System.out.println("The values of the given treemap is " + map.values());
		        System.out.println("The key/value pair is " + map.entrySet());
		        // The name class is given follow
		        Name.put(86695746859L, "Ashisha");
		        Name.put(7685493647L, "Anusha");
		        Name.put(8765946736L, "Shyamu");
		        Name.put(7658493684L, "Sherli");
		        Name.put(86874938436L, "Vanisree");
		        Name.put(876557263265L, "Varsha");
		        System.out.println("The keys of the given treemap is" + Name.keySet());
		        System.out.println("The values of the given treemap is " + Name.values());
		        System.out.println("The key/value pair is " + Name.entrySet());
		        email.put(765648275365L, "harika123@gmail.com");
		        email.put(76849378756L, "vijaya123@gmail.com");
		        email.put(98756736375L, "naipu34@gmail.com");
		        email.put(876583674577L, "sherli@gmail.com");
		        System.out.println("The keys of the given treemap is" + email.keySet());
		        System.out.println("The values of the given treemap is" + email.values());
		        System.out.println("The key/value pair is " + email.entrySet());
		    }
		

	}


