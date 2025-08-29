
public class Student {

    int  rollno;
    String name;
    int sub1marks;
    int sub2marks;
    int sub3marks;

    public Student(int rollno, String name, int  sub1marks, int sub2marks, int sub3marks){
        this.rollno = rollno;
        this.name = name;
        this.sub1marks = sub1marks;
        this.sub2marks = sub2marks;
        this.sub3marks = sub3marks;
    }

    public int averagemarks(){
        int avrgmarks = (sub1marks + sub2marks + sub3marks)/3;
        return avrgmarks;
    }

    public String Grade(){
    	
    	int avrgmarks = averagemarks();
    	
        if(avrgmarks > 90){
        	return "Grade A";
        }else if(avrgmarks > 80){
        	return "Grade B";
        }else if(avrgmarks > 70){
        	return "Grade C";
        }else if(avrgmarks > 60){
        	return "Grade D";
        }else if(avrgmarks > 50){
        	return "Grade E";
        }else{
        	return " Fail";
        }
    }

    public void displayStudent(){
        System.out.println(rollno+" "+name+" "+sub1marks+" "+sub2marks+" "+sub3marks);
    }
}

