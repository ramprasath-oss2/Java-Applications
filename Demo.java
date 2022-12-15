import java.util.Random;

class Generate extends Thread {
    int r;

    Generate(int r) {
        this.r = r;
    }

    int putValue() { 
        Random random = new Random();

        int rvalue = random.nextInt(r);
        if (rvalue % 2 == 0) {
            Square square = new Square(rvalue);
            square.start();
        } else {
            Cube cube = new Cube(rvalue);
            cube.start();
        }

        return random.nextInt(100);
    }
}


class Square extends Thread {
    int x;

    Square(int a) {
        x = a;
    }

    public void run() {
        System.out.print("Square of the number: ");
        System.out.println(x*x);
    }
}


class Cube extends Thread {
    int y;
    Cube(int b) {
        y = b;
    }

    public void run() {
        System.out.print("Cube of the number: ");
        System.out.println(y*y*y);
    }
}


public class Demo {
    public static void main(String[] args) throws Exception {
        for (int i=1; i<6; i++) {
            Thread.sleep(2000);
            System.out.print("Random Number = ");
            System.out.println(generate()); 
        }
    }


    static int generate() {
        Generate random_number = new Generate(30);
        int number = random_number.putValue();
        return number;
    }
}
