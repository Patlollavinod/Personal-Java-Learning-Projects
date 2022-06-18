package ClassesandObjects;

abstract class Colour {
    String colour;

    abstract void print();
}

class Red extends Colour {
    Red() {
        colour = "red";
    }

    void print() {
        System.out.println("The colour is " + colour);
    }
}

class Blue extends Colour {
    Blue() {
        colour = "blue";
    }

    void print() {
        System.out.println("The colour is " + colour);
    }
}

class Black extends Colour {
    Black() {
        colour = "black";
    }

    void print() {
        System.out.println("The colour is " + colour);
    }
}

public class ColourClass {
    public static void main(String[] args) {
        Red r = new Red();
        Blue b = new Blue();
        Black bl = new Black();

        r.print();
        b.print();
        bl.print();
    }
}
