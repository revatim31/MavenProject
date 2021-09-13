package com.programme.JerseyCrud;
import java.util.*;
import java.util.stream.*;


public class StudDao {
	
	List<Stud>student;
	public StudDao() {
		student=new ArrayList<>();
		Stud stud1 = new Stud(1,"Raj");
		Stud stud2 = new Stud(2,"John");
		Stud stud3= new Stud(3,"Nick");
		
		student.addAll(Arrays.asList(stud1,stud2,stud3));
	}
	
	public List<Stud> getAllStud(){
		
		return student;
	}
	public Stud getStudById(int studRollno){
		
		return student.stream().filter(x->x.getStudRollno()==studRollno)
		.collect(Collectors.toList()).get(0);
	}
	
     public List<Stud> createStud(Stud stud){
		student.add(stud);
		return  student;
	}
     public List<Stud> removeStud(int id){
 		student.removeIf(x -> x.getStudRollno()==id);
 		return student;
 	}
     public List<Stud> updateStud(int id,String Name){
    	 student.stream().filter(x->x.getStudRollno()==id)
 		.collect(Collectors.toList()).get(0).setStudName(Name);
 		return  student;
 	}
     
     
	}


