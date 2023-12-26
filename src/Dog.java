public class Dog extends Animal{
    Dog(String name, int age){
        super(name, age);
    }
    @Override
    int getRunLimit(){
        return 500;
    }
    @Override
    int getSwimLimit(){
        return 10;
    }
    @Override
    double getJumpLimit(){
        return 0.5;
    }
}
