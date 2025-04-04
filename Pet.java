public class Pet{
    String name;
    String sound;
    int age;
    public Pet(String n, String s, int a){
        name = n;
        sound = s;
        age = a;
    }
    public String toString(){
        return name + " - " + sound + " - " + age;
    }
}