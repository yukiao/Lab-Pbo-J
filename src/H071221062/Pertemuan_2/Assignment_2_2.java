package H071221062.Pertemuan_2;

public class Assignment_2_2 { //MAIN CLASS DEATHGAME
    public static void main(String[] args) {
        Assignment_2_1 assignment_2_1 = new Assignment_2_1();
        assignment_2_1.setNamaGame("Clash Of Clans");
        assignment_2_1.setTahunRilis(2012);
        assignment_2_1.setDeveloper("Supercell");
        assignment_2_1.setJumlahDownloader(500_000_000);

        System.out.println("Nama Game : " + assignment_2_1.getNamaGame());
        System.out.println("Tahun Rilis : " + assignment_2_1.getTahunRilis());
        System.out.println("Developer : " + assignment_2_1.getDeveloper());
        System.out.println("Jumlah Downloader : " + assignment_2_1.getJumlahDownloader());
    }
}