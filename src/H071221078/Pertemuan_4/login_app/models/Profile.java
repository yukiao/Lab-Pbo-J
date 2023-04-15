package H071221078.Pertemuan_4.login_app.models;

public class Profile {
    private String fullname;
    private int age;
    private String hobby;
    private String nickname;

public  Profile() {}

    public Profile(String fullname, int age, String hobby) {
        this.fullname = fullname;
        this.age = age;
        this.hobby = hobby;
    }

    public String getFullname() {
        return fullname;
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
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
    public String getNickname() {
        return nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}