
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

        System.out.println("Which animal would you like to make:");
        System.out.println("1 - Mammal");
        System.out.println("2- Reptile");

        Scanner in = new Scanner(System.in);
        int type = in.nextInt();

        Animal animal = new Animal() {
            @Override
            public String eat() {
                return null;
            }
        };

        setValues(animal, 20, 2);

        printValues(animal);

        Mammal mammal = new Mammal();
        setValues(mammal, 30, 3);
        mammal.setFurColor("Brown");
        mammal.setGestationPeriod(10);

        printValues(mammal);

        System.out.println("Fur Color:" + mammal.getFurColor());
        System.out.println("Gestation Period:" + mammal.getGestationPeriod());
    }
    private static void setValues(Animal animal, double weight, int age){
        animal.setAge(age);
        animal.setWeight(weight);
    }

    private static void printValues(Animal animal){
        System.out.println("Weight:" + animal.getWeight());
        System.out.println("Age:" + animal.getAge());

    }
}
