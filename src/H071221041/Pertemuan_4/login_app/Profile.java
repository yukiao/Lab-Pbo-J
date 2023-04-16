package H071221041.Pertemuan_4.login_app;

public class Profile {
    private String fullname;
    private String nickname;
    private int age;
    private String hobby;
    private User user;

    public Profile(){}

    public Profile(String fullname, String nickname, int age, String hobby, User user) {
        this.fullname = fullname;
        this.nickname = StringUtils.getNickname(fullname);
        this.age = age;
        this.hobby = hobby;
        this.user = user;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
}
