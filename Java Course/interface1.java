interface Demo {
    public abstract void Show();

    public abstract void Run();
}

// class Enam implements Demo {

// public void Show() {
// throw new UnsupportedOperationException("Unimplemented method 'Show'");
// }

// public void Run() {
// throw new UnsupportedOperationException("Unimplemented method 'Run'");
// }

// }
public class interface1 {
    public static void main(String[] args) {

        Demo obj1 = new Demo() {
            public void Show() {
                // throw new UnsupportedOperationException("Unimplemented method 'Show'");
                System.out.println("In Show");
            }
            public void Run() {
                // throw new UnsupportedOperationException("Unimplemented method 'Run'");
                System.out.println("In Run");
            }
        };
        obj1.Run();
        obj1.Show();
    }
}
