public abstract class Animal {
    protected int age;
    protected boolean isMammal;
    protected String type;


    public Animal() {
    }
    public Animal(int age, String type) {
        this.age = age;
        this.type = type;
    }
    public int birthday(){
        return this.age = age +  1;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public boolean getisMammal() {
        return isMammal;
    }

    public void setisMammal(boolean mammal) {
        isMammal = mammal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public abstract void makeSound();
    public abstract void move();

}
