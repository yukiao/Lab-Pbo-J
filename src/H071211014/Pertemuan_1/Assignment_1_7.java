package H071211014.Pertemuan_1;
public class Assignment_1_7 {

    public static void main(String[] args) {
        String[] country = new String[]{
            "Indonesia",
            "Argentina",
            "France",
            "Germany",
            "Salah",
            "Dembele",
        };
        System.out.println(findIndex(country,"Salah"));
    }

    private static int findIndex(String[]country, String player) {
        for (int i =0; i< country.length; i++) {
            if (country[i].equalsIgnoreCase(player)) {
                return i;
            }
        }
        return -1;
    }
}
