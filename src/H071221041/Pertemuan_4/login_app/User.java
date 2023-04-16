package H071221041.Pertemuan_4.login_app;

public class User {
    private String uname;
    private String password;
    private Profile profile;

    public User(){}

    public User(String uname, String password, Profile  profile) {
        this.uname = uname;
        this.password = password;
        this.profile = profile;
    }

    public User(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
