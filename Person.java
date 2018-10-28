public class Person {
    private String username ;
    private String password ;
    private Integer permision;
    private String food;

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPermision() {
        return permision;
    }

    public void setPermision(Integer permision) {
        this.permision = permision;
    }

}
