import java.util.*;

class Student{
	int roll;

	int getroll(){
		return roll;
	}

	void setroll(int roll){
		this.roll = roll;
	}
}

class Test extends Student{
	int sub1;
	int sub2;

	int getmarks1(){
		return sub1;	
	}

	int getmarks2(){
		return sub2;
	}

	void setmarks(int sub1, int sub2){
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
}

interface Sports{
	int sMarks = 10;
	void set();
}

class Result extends Test implements Sports{
	int totalmarks;

	public void set(){};

	public void display(){
		totalmarks = getmarks1() +getmarks2() + sMarks;
		System.out.println("Roll no : "+getroll());
		System.out.println("Marks is subject 1 : "+getmarks1());
		System.out.println("Marks is subject 2 : "+getmarks2());
		System.out.println("Sports marks : "+sMarks);
		System.out.println("Total marks : "+totalmarks);
	}
}

public class Studentdemo{
	public static void main(String[] args){
	Result r = new Result();
	r.setroll(111);
	r.setmarks(90,90);
	r.set();
	r.display();
	}
}
