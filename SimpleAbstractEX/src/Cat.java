public class Cat extends Animal{

    private String name;

    public Cat(int age, String type){
        super(age, type);
    }
    public Cat(String type, boolean isMammal){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void makeSound(){
        System.out.println("Meooow baby!");
    }
    public void move(){
        System.out.println("the Cat walks");
    }

}
