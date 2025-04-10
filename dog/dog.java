public class dog{
    private String name;
    private int age;
    private String breed;
    private String color;
    //constructor
    public dog(String name, int age, String breed, String color){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }
    public dog(){
        this.name = "阿黄";
        this.age = 0;
        this.breed = "unknown";
        this.color = "unknown";
    }
    //mutator
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    //accessor
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    //method
    public void bark(String sound){
        
        System.out.println(sound + "!");
    }
}