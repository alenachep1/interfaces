public class Main {

    public static void main(String[] args) {
        //создадим машины
Beeper horn=new Horn();
EngineV0 engineV0= new EngineV0();
Door0 door0= new Door0();
Cadillak cadillak=new Cadillak();
Toy toy= new Toy(horn,engineV0,cadillak,door0);

        Beeper sound=new Sound();
        EngineD6 engineD6= new EngineD6();
        Door2 door2= new Door2();
        Hyundai hyundai=new Hyundai();
        Bus bus= new Bus(sound,engineD6,hyundai,door2);

        System.out.println(toy.body.modelBody());
        System.out.println(toy.door.openDoor());
        System.out.println(toy.engine.getSpeed());
        System.out.println(toy.beeper.makeSound());
        System.out.println(" ");
        System.out.println(bus.body.modelBody());
        System.out.println(bus.door.openDoor());
        System.out.println(bus.engine.getSpeed());
        System.out.println(bus.beeper.makeSound());



    }
}
