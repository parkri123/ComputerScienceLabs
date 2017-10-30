package me.parkri123.labs.car;

public class cardemo {

    public static void main(String[] args) {
        Car caitlin = new Car();
        System.out.println(caitlin.getColor());
        System.out.println(caitlin.getMake());
        System.out.println(caitlin.getmpg());
        System.out.println(caitlin.getisAntique());
        caitlin.setColor("grey");
        caitlin.setMpg(30.0);
        caitlin.setMake("Acura");
        caitlin.setAntique(false);
        System.out.println(caitlin.getColor());
        System.out.println(caitlin.getMake());
        System.out.println(caitlin.getmpg());
        System.out.println(caitlin.getisAntique());
    }
}
