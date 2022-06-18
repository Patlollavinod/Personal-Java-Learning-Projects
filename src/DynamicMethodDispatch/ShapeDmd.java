package DynamicMethodDispatch;

class Shape {
    double a;
    double b;

    Shape(double i, double j) {
        a = i;
        b = j;
    }

    Shape(double i) {
        a = b = i;
    }

    Shape() {
        a = b = -1;
    }

    double showCoord() {
        System.out.println(a + " " + b);
        return 0;
    }

    void getCoord(double i, double j) {
        a = i;
        b = j;
    }

    void getCoord(double i) {
        a = b = i;
    }
}

class Rect extends Shape {
    Rect(double i, double j) {
        super(i, j);
    }

    Rect(double i) {
        super(i);
    }

    Rect() {
        super();
    }

    void getCoord(double i, double j) {
        super.getCoord(i, j);
    }

    void getCoord(double i) {
        super.getCoord(i);
    }

    double showCoord() {
        System.out.println("Length: " + a + " Breadth: " + b);
        return 0;
    }
}

public class ShapeDmd {
    public static void main(String[] args) {
        Rect myRect = new Rect(10, 20);
        Rect myRect1 = new Rect(20);
        Rect r;

        myRect.getCoord(5, 10);
        myRect1.getCoord(10);

        // r = myRect.showCoord(); // Doesn't work

    }
}
