package com.jrd.oops.misc;

public class CallByValue {

	 int data=50;  
	  
	 void change(int data){  
	 data=data+100;//changes will be in the local variable only  
	 }  
	     
	 public static void main(String args[]){  
	   CallByValue op=new CallByValue();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);  
	  
	   Operation2 o=new Operation2();  
	   
	   System.out.println("before change "+o.data);  
	   o.change(o);//passing object  
	   System.out.println("after change "+o.data);  
	 }  

}
class Operation2{  
int data=50;  
 
void change(Operation2 o){  
data=o.data+100;//changes will be in the instance variable  
}  
}
