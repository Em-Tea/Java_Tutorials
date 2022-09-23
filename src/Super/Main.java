package Super;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Superman", 600, "Alien");

        Person person1 = new Person("Greg", 31);

        //System.out.println(hero1.name + " " + hero1.age + " " + hero1.power);
        //System.out.println(hero2.name + " " + hero2.age + " " + hero2.power);

        System.out.println(hero2.toString());
    }
}
