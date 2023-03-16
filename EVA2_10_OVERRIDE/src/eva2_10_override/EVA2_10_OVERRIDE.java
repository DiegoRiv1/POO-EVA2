package eva2_10_override;

/**
 * @author Diego
 */
public class EVA2_10_OVERRIDE {

    public static void main(String[] args) {
        Person perso1 = new Person();
        Person perso2 = new Person("Diego", 18);
        System.out.println(perso1);
        System.out.println(perso2);
    }
}






class Person{
    private String name;
    private int age;

    public Person() {
        name = "----";
        age = -1;
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        String cade = "DATOS \n" +
                      "Nombre: " + name + "\n" +
                      "Edad: " + age + "\n";
        return cade;
    }
}
