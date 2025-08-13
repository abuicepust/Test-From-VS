class hello{
    hello(){
        System.out.println("Inside cons.");
    }
    public void display2(){
        System.out.println("in hello");
    };
    public void display23(){
        System.out.println("in hello");
    };
}

class A2 extends hello{
        A2(){
            super();
        }
        public void display2() {
            
            System.out.println("Inside Inherited hello");
        };
    
    };

public class abstract1 {
    public static void main(String[] args) {
        hello obj = new A2();
        obj.display2();
    }
}
