package com.qa.community;

public class PersonClassTask {

	public static void main(String[] args) {

		PersonClass harry = new PersonClass("Harry", "Emmett", 27, "Blackburn", 190);
		PersonClass phil = new PersonClass("Phil", "Mitchell", 160);
		
		phil.nameHeight();
		harry.greet();
		harry.age();
		
		PersonClass bob = new PersonClass("Bob", "Bobson", 22, "Blackburn", 190);
		PersonClass bill = new PersonClass("Bill", "Billson", 33, "London", 156);
		PersonClass jim = new PersonClass("Jim", "Jimson", 60, "Liverpool", 165);
		PersonClass pete = new PersonClass("Pete", "Peteson", 18, "Manchester", 143);
	
		bob.greet();
		bill.greet();
		jim.greet();
		pete.greet();
	
	}

}
