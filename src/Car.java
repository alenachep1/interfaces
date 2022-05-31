public abstract class Car {
    Beeper beeper;
    Engine engine;
    Body body;
    Door door;

    public Car(Beeper beeper, Engine engine, Body body, Door door){
        this.beeper=beeper;
        this.engine=engine;
        this.body=body;
        this.door=door;
    }
}
