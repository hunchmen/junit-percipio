package com.via.skillsoft.junit.course2;

public class TestClass {
	
	 int id;
	    String name;
	    
	    TestClass(){
	    	
	    }
	    
	    TestClass(int i,String n){
	    id = i;
	    name = n;
	    }
	    
	    TestClass(TestClass s){
	    id = s.id;
	    name =s.name;
	    }
	    void display(){System.out.println(id+" "+name);}
	 
	    public static void main(String args[]){
	    	TestClass s1 = new TestClass(111,"Karan");
	    	TestClass s2 = new TestClass(s1);
		    s1.display();
		    s2.display();
		    System.out.println(s1);
		    System.out.println(s2);
	    }

}

