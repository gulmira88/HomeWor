public class Child extends Parent {
    private String name;
    private int age;

    public Child(String name, int age, String nationality) {
    super( nationality);
    }

    public void childSleep(){




        System.out.println("Child sleeping");
    }
    public void ChildPlay(){
        System.out.println("Child playing");

    }





    @Override
    public String toString() {
        return "Child{" +
                "name" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}









