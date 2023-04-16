package H071221062.Pertemuan_4;

public class Assignment_4_2 {
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
    private String username;
    private String password;

    public Assignment_4_2(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPasswsord() {
        return password;
    }

    public void setPasswsord(String password) {
        this.password = password;
    }
}
