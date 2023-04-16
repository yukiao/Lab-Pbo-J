package login_app.models;

public class User {
    /* 
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
    private String username;
    private String password;
    private Profile profile; // menyimpan objek profil dari user
 
    public User(){} 

    public User(String username, String password, Profile profile) { 
        this.username = username;
        this.password = password;
        this.profile = profile;
    }

    public String getUserName() {
        return username;
    }
    public void setUserName(String username) {
        this.username = username;
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