class hierarchy1{
    public String name = "Rabbi";
    public int age = 29;
    public String[] test1(){
        int roll = 12;
        String dept = "CSE";
        return new String[]{String.valueOf(roll),dept,"Hello"}; 
        //System.out.println(dept+" : "+roll);
    }
}

public class InputStream {
    public static void main(String[] args) {
        
        System.out.println("Hello World");

        hierarchy1 obj = new hierarchy1();
        //System.out.println(obj.test1());
        String[] Return = obj.test1();
        System.out.println(Return);

        for(String s: Return){
            System.out.println(s);
        }
        //System.out.println(obj.name);
        //hierarchy1.test1().roll= 21;


    }
}
