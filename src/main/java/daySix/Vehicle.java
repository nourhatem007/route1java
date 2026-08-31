package daySix;

public interface Vehicle {
    void start();

    default void stop(){
        System.out.println("stop");
    }
}
