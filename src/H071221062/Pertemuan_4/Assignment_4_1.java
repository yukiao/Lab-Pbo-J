package H071221062.Pertemuan_4;

public class Assignment_4_1 {
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
    private String fullName;
    private int age;
    private String hobby;
    private String nickName;

    public Assignment_4_1(String fullName, int age, String hobby, String nickName) {
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
        this.nickName = nickName;
    }

    public Assignment_4_1() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
