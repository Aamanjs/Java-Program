
public class Student {

    String name;
    int marks;

    Student(){
        name = "Ravi Shukla";
        marks = 94;
    }

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    void showDetails(){
        System.out.println("Student Name: "+this.name+", Marks: "+marks);
    }
    
}

class GraduateStudent extends Student{
        String specialization;

        GraduateStudent(){
            specialization = "computers";
        }

        GraduateStudent(String specialization){
            this.specialization = specialization;
        }

        void checkPass(){
            if(this.marks > 50){
                System.out.println("Pass");
            }else System.out.println("Fail");
        }

}
