import stanford.karel.Karel;

public class Robot extends Karel {
    public void run() {
       turnLeft();
       while(frontIsClear()) {
           if(noBeepersPresent()) {
               putBeeper();
           }
           move();
       }
        if(noBeepersPresent()) {
            putBeeper();
        }
    }
}
