package co.rajaram.venkatraman;


class staff{  
	 int rollno;  
	 String name;  
	 void insertRecord(int r, String n){  
	  rollno=r;  
	  name=n;  
	 }  
	 void displayInformation(){System.out.println(rollno+" "+name);}  
	}  
	class ObjectByInitialization{  
	 public static void main(String args[]){  
		 staff s1=new staff();  
		 staff s2=new staff();  
	  s1.insertRecord(111,"Karan");  
	  s2.insertRecord(222,"Aryan");  
	  s1.displayInformation();  
	  s2.displayInformation();  
	 }  
	}  