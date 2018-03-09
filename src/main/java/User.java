public class User {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User(Integer id) {
        this.id = id;
    }

    private Integer id;
private String haha;

    public String getHaha() {
        return haha;
    }

    public void setHaha(String haha) {
        this.haha = haha;
    }

    public User(String haha) {
        this.haha = haha;
    }
}
