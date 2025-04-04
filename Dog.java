public class Dog extends Pet{
    public Dog(String n, int a){
        super(n,"Woof",a);
    }
    public String toString(){
        return "Dog - "+super.toString();
    }
}
