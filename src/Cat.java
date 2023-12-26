public class Cat extends Animal{
    Cat(String name, int age){
        super(name, age);
    }
    @Override
    int getRunLimit(){
        return 200;
    }
    @Override
    int getSwimLimit(){
        return 0;
    }
    @Override
    double getJumpLimit(){
        return 2;
    }
}
