package com.lambdaHandson;
@FunctionalInterface
interface Cab{
//void bookCab();
	//	void bookCab(String source,String destination);
	double	bookCab(String source,String destination);
}/*class UberX implements Cab{
	public void bookCab() {
		System.out.println(("UberX Booked !! Arriving soon !!"));
	}
}*/
public class LambdaApp {
	public static void main(String[] args)
	{
//Cab cab = new UberX();
		//cab.bookCab();
//Anonymous Class Implementation
/*Cab cab = new Cab(){
		@Override
		public void bookCab() {
			System.out.println("UberX Booked !! Arriving Soon !!");
		}
	};
	cab.bookCab;*/
		//Using a Lambda Expression
		Cab cab = (source, destination)->{
			System.out.println ("UberX Booked from "+source+" to "+destination+"!! Arriving Soon !!");
			return 850.12;
		};
		double fare = cab.bookCab("Bengaluru","Coorg");
		System.out.println("Fare Shall be : "+fare);
		
		cab.bookCab("Benguluru" , "Coorg");
	}
}
	
	
 
	
		
	
