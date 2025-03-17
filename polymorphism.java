class Animal {
    public void sound() {
        System.out.println("Sounds");
    }
}

class Dog extends AAnimal {
    public void bark () {
        System.out.println("Dog is Barking");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark();
    }
}