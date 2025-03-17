interface animal_interface {
    void sound();
}

class cat_interface implements animal_interface {
    public void sound() {
        System.out.println("Meow Meow");
    }
}
public class interfaces {
    public static void main(String[] args) {
        cat_interface c = new cat_interface();
        c.sound();
    }
}
