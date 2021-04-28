package co.rajaram.venkatraman;

 class Student4{  
	 int id;  
	 String name;  
	}  
	class ObjectByReference{  
	 public static void main(String args[]){  
	  Student4 s1=new Student4();  
	  s1.id=101;  
	  s1.name="Venkat";  
	  System.out.println(s1.id+" "+s1.name);//printing members with a white space  
	 }  
	}  