class DemoStat{
    int roll;
    String name;
    int marks;

    void display(){
        System.out.println(name + " :"+ " Roll "+roll + " Marks "+marks);
    }
    
}


public class staticNon {
    public static void main(String[] args) {
        DemoStat b1 = new DemoStat();
        b1.name = "Munna";
        b1.roll = 18054;
        b1.marks = 88;

        DemoStat b2 = new DemoStat();
        b2.name = "Rabbi";
        b2.roll = 180541;
        b2.marks = 85;

        b1.display();
        b2.display();
    }
}
