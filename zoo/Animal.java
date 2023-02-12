package zoo;

public abstract class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract String say();

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract String feed();
}
