package Interface;
interface Flyer extends Appendable, AutoCloseable {
    void takeOff();
    void land();
    void fly();
}
