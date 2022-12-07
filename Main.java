import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome...\n");
        GenerateSquare sqr = new GenerateSquare(generate());
        GenerateCube cbe = new GenerateCube(generate());
        for (int i=1; i<6; i++) {
            System.out.println("Random Number = " + generate());
            if (generate()%2==0) {
                Thread t1 = new Thread(sqr);
                t1.start();
            } 
            else if (generate()%2==1){
                Thread t2 = new Thread(cbe);
                t2.start();
            }
        }
    }


    static int generate() {
        GenerateRandom random1 = new GenerateRandom(100);
        int number = random1.putValue();
        return number;
    }
}


class GenerateRandom implements Runnable {
    int r;

    GenerateRandom(int r) {
        this.r =r;
    }

    int putValue() { 
        Random random = new Random();
        return random.nextInt(r);
    }

    @Override
    public void run() {
        putValue();
    }
}


class GenerateSquare implements Runnable {
    int x, sNum;
    
    GenerateSquare(int a) {
        x = a;
    }

    @Override
    public void run() {
        try {
            if (x%2==0) {
                sNum = x*x;
                Thread.sleep(1000);
                System.out.println(sNum);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}


class GenerateCube implements Runnable {
    int y, cNum;
    
    GenerateCube(int b) {
        y = b;
    }

    @Override
    public void run() {
        try {
            if (y%2!=0) {
                cNum = y*y*y; 
                Thread.sleep(1000);
                System.out.println(cNum);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
