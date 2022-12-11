package abs;

public interface MyFirstInterface {

    // All attributes will need to final as they cannot change
    final String finalName = "Ankur";
    final Integer finalAge = 33;

    // Only declarations and no definitions for methods
    void setName(String value);

    String getName();

    void setAge(Integer value);

    Integer getAge();
}
