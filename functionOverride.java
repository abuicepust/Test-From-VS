public class functionOverride {
    public static void main(String[] args) {
        Dog D1 = new Dog();
        D1.move();
        D1.eat();
    }
}
class Animal {
    void move(){
        System.out.println("Animal is moving");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void move(){
        System.out.println("Dog is moving");
    }
    void bark(){
        System.out.println("Dog is barking");
    }
    
}
