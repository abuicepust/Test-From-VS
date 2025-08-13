class A{
    public void display(){
        System.out.println("In A Display");
    }
}
class B extends A{
    public void display(){
        System.out.println("In B Display");
    }
}

public class objectDispatch {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();

        obj = new A();
        obj.display();
        
    }
}
