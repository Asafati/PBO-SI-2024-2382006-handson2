public class Perbandingan {
    public static void main(String[] args) {
        int nilai = 70;
        int minimumKelulusan = 60;

        System.out.println("Apakah nilai sama dengan minimum kelulusan? " + (nilai == minimumKelulusan));
        System.out.println("Apakah nilai tidak sama dengan minimum kelulusan? " + (nilai != minimumKelulusan));
        System.out.println("Apakah nilai lebih besar dari minimum kelulusan? " + (nilai > minimumKelulusan));
        System.out.println("Apakah nilai lebih besar atau sama dengan minimum kelulusan? " + (nilai >= minimumKelulusan));
        System.out.println("Apakah nilai lebih kecil atau sama dengan minimum kelulusan? " + (nilai <= minimumKelulusan));
    }
}
