public class Duck extends Animal {

    public Duck(int age, String type){
        super(age, type);
    }

    public void makeSound(){
        System.out.println("Quark Quark baby!!");
    }
    public void move(){
        System.out.println("Duck flies");
    }
}
