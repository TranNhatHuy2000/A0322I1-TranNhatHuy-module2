package ss07_Abstract_Interface.thuchanh.Animal_InterfaceEdible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "ò ó o gâu gâu";
    }

    @Override
    public String howtoEat() {
        return "Luộc lên chấm tiêu chanh";
    }
}
