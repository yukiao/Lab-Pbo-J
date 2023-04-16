package H071221078.Pertemuan_4.login_app.utils;

public class StringUtils {
    public static String nickname(String fullname) {
        String[] name = fullname.split(" ");

        return (name.length == 1 ? fullname : name[1]);
    }
}