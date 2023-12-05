public class SingletonMain {
    public static void main(String[] args) {

        SingletonStaticBlock staticBlockInstance1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock staticBlockInstance2 = SingletonStaticBlock.getInstance();

        System.out.println(staticBlockInstance1); // output : SingletonStaticBlock@7a81197d
        System.out.println(staticBlockInstance2); // output : SingletonStaticBlock@7a81197d
        // Both instances should be the same, indicating that only one instance exists.
    }

    public static class SingletonStaticBlock {
        private static SingletonStaticBlock instance;

        // Static block for initialization
        static {
            try {
                instance = new SingletonStaticBlock();
            } catch (Exception e) {
                throw new RuntimeException("Exception occurred in creating singleton instance");
            }
        }
        private SingletonStaticBlock() {
        }
        public static SingletonStaticBlock getInstance() {
            return instance;
        }
    }
}





/*
public class SingletonMain {
    public static void main(String[] args) {
        Person obj1 = new Person();
        Person obj2 = new Person();
        obj1.age = 20;
        obj2.age = 30;
        System.out.println(obj1.age); // output 20
        System.out.println(obj2.age); // output 30
    }
}
class Person{
  int age;
}
*/







// Lazy initialization
/*
public class SingletonMain {
    public static void main(String[] args) {
       Person obj1 = Person.getInstance();
       Person obj2 = Person.getInstance();
    }
}

class Person{
    private static Person obj;
    private Person(){
        System.out.println("instance created...");
    }
    public static Person getInstance(){
        if (obj == null){
            obj = new Person();
        }
        return obj;
    }
}
*/





// Eager
/*
public class SingletonMain {
    public static void main(String[] args) {
        Person obj1 = Person.getInstance();
        obj1.age = 20;
        System.out.println(obj1.age);  // output : 20

        Person obj2 = Person.getInstance();
        obj2.age = 50;
        System.out.println(obj2.age); // output : 50
    }
}

class Person{
    int age = 10;
    private static Person obj = new Person();
    private Person(){

    }
    public static Person getInstance(){
        return obj;
    }
}*/
