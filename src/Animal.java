public class Animal {
    public String name;
    public int age;
   public Animal(String name, int age){
    this.name = name;
    this.age = age;
    }
    public void Hello(){
        System.out.println("Hello!");
    }
    public String toString() {
        return "Name: "+name + ", Age:" + age;
    }
}
