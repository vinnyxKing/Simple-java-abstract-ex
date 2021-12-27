import javax.swing.*;

public class testRun {

    public static void main(String[] args) {
        Cat kitty = new Cat( 6,"Cat");
        kitty.setName("Kitty");
        kitty.setisMammal(true);
        kitty.birthday();

        System.out.println(kitty.getName() + " is " + kitty.getAge() + " and can ");
        kitty.makeSound();

        Duck ducky = new Duck(3, "duck");
        ducky.setisMammal(false);
        ducky.makeSound();
        ducky.move();
        ducky.setAge(3);

        JOptionPane.showMessageDialog(null,kitty.getName() +
                " " + kitty.getAge() + " " + kitty.getType() + " " + kitty.isMammal);
        JOptionPane.showMessageDialog(null,"Ducky is " +
                " " + ducky.getAge() + " " + ducky.getType() + " " + ducky.isMammal);

    }
}
