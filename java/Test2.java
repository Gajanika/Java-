public class Test2 {
    public int gear;
    public int speed;

    public Test2(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;

    }

    public void pressBreak(int slow) {
        speed -= slow;

    }

    public void addSpeed(int sum) {
        speed += sum;
    }

    public String toString() {
        return ("No  of gears are " + gear + "\n" + "speed of bicycle is "
                + speed);

    }
}

class MalaiBike extends Test2{
    public int seatset;

    public MalaiBike (int gear, int speed, int startHeight){
         super (gear,speed);
         seatset = startHeight;
    }
    public String tosString(String startHeight){
            return (super.toString()+"\n seatset is "+ startHeight);
    }

}
public class TEs {
    public static void main(String args[]){
            
    }
}