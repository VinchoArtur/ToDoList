package by.home.dataexam.user;

public class User {

    private String name;
    private String password;
    private String agrees;

    public User() {
    }

    public User(String name, String password, String agrees) {
        this.name = name;
        this.password = password;
        this.agrees = agrees;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getAgrees() {
        return agrees;
    }


}
