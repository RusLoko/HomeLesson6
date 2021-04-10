public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Cat cat = new Cat("Киса", 200, " кот не умеет плавать");
        Dog dog = new Dog("Бобик", 500, 10);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}
