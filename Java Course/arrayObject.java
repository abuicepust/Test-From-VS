class Student {
    int roll;
    String name;
    int marks;    
}

public class arrayObject {
    public static void main(String[] args) {

        
        Student s1 = new Student();
        s1.roll = 180640;
        s1.name = "Abu";
        s1.marks = 44;

        Student s2 = new Student();
        s2.roll = 180641;
        s2.name = "Siam";
        s2.marks = 48;

        Student s3 = new Student();
        s3.roll = 180642;
        s3.name = "Vubi";
        s3.marks = 52;

        //System.out.println(s1.name + " : "+s1.roll);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student n: students){
            System.out.println(n.name + " : "+n.roll);
        }
    }
}
