package me.parkri123.labs.smartphone;

public class studentDemo {
    public static void main(String[] args) {
        Student one = new Student();
        System.out.println(one.toString()+"\n");
        one.setFirstName("Bobby");
        one.setLastName("Studabaker");
        one.setGpa(4.0);
        one.setFocus("Computer Science");
        System.out.println(one.toString()+"\n");

        Student two = new Student("Maranda", "Elmore", 4.2, "Pre-med");
        System.out.println(two.toString());
    }
}