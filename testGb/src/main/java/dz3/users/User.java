package dz3.users;

public class User {

    private String name;
    private String password;
    private boolean isAuthenticate = false;
    private boolean isAdmin;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;

    }

    //3.6.
    public boolean authenticate(String name, String password) {
        if( name == null || password == null){
            throw new RuntimeException("логин или пароль пустые");
        }
        this.isAuthenticate = name.equals(this.name) && password.equals(this.password);
        return this.isAuthenticate;
    }
    public void setAuthenticate(boolean flag){
        this.isAuthenticate = flag;
    }
    public String getName() {
        return name;
    }
    public boolean getAuthenticate() {
        return isAuthenticate;
    }
    public boolean isAdmin() {
        return isAdmin;
    }


}

