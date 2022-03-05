package addressd10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class address10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating user-defined objects 
		  addbook s1=new addbook(101,"Sonoo","ggh","hhh","hh","gg");  
		  addbook s2=new addbook(102,"Ravi","ggh","hhh","hh","gg");  
		  addbook s3=new addbook(103,"Hanumat","ggh","hhh","hh","gg"); 
		  addbook1 m1=new addbook1(101,"Sonoo","ggh","hhh","hh","gg");  
		  addbook1 m2=new addbook1(102,"Ravi","ggh","hhh","hh","gg");  
		  addbook1 m3=new addbook1(103,"Hanumat","ggh","hhh","hh","gg"); 
		  
		//creating arraylist  
		  ArrayList<addbook> al=new ArrayList<addbook>();
		  ArrayList<addbook1> all=new ArrayList<addbook1>();
		  al.add(s1);//
		  al.add(s2);  
		  al.add(s3);  
		  all.add(m1);//
		  all.add(m2);  
		  all.add(m3);  
		  
		  //Getting Iterator  
		  Iterator<addbook> itr=al.iterator();
		  Iterator<addbook1> itrr=all.iterator();
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    addbook st=(addbook)itr.next();  
		    addbook1 st1=(addbook1)itrr.next();
		    System.out.println(st.addressbookno+" "+st.firstname+" "+st.lastname+" "+st.address+" "+st.state+" "+st.city+" ");  
		  }  
		 }  
		
	}


