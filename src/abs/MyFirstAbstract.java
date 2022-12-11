package abs;

public abstract class MyFirstAbstract {

    String name;
    String age;
    char gender;

    // Only declarations and no definitions for methods
    public void setName(String value) {
        this.name = "Abstract Kumar";
    }

    public String getName() {
        return this.name;
    }

    abstract public void setGender(char value);

    abstract public char getGender();

}
