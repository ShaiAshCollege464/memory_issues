import java.util.Random;

public class Student {
    private int average;

    public Student () {
        this.average = new Random().nextInt(100);
    }

    public int getAverage () {
        return this.average;
    }

}
