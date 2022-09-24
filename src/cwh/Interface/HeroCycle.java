package cwh.Interface;

public class HeroCycle implements Bicycle {
    int speed = 7;

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
