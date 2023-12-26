public class Main {
    public static void main(String[] args) {
        Cat myCat1 = new Cat("Барсик", 5);
        myCat1.run(400);
        myCat1.swim(10);
        myCat1.jump(2.0);
        Dog myDog1 = new Dog("Мухтар", 5);
        myDog1.run(50);
        myDog1.jump(2.0);
        myDog1.swim(20);
    }
}
