abstract class Animal {
    String name;
    int age;

    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void run(int distance){
        System.out.println(name+" "+"running is"+" "+(distance<=getRunLimit()? "true":"false"));//применяется сокращенная форма записи if-else
    }
    public void swim(int distance){
        System.out.println(name+" "+"swimming is"+" "+(distance<=getSwimLimit()? "true":"false"));
    }
    public void jump(double height){
        System.out.println(name+" "+"jumping is"+" "+(height<=getJumpLimit()? "true":"false"));
    }
    abstract int getRunLimit();
    abstract int getSwimLimit();
    abstract double getJumpLimit();
}
