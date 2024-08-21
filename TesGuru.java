package tugasbupasha;
import java.util.Scanner;
//Driver TesGuru
public class TesGuru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("id : ");
        int id = in.nextInt();
        System.out.println("Nama");
        String nama = in.next();
        System.out.println("ipk : ");
        double ipk = in.nextDouble();
        
        System.out.println("");
        //membuat obyek
        Guru buPhasya = new Guru();
        Guru buAul = new Guru();
        Guru pakFirman = new Guru();
        Guru buFeni = new Guru();
        Guru pakDiaur = new Guru();
        buPhasya.id = 1234;
        buPhasya.nama = "buPhasya";
        buPhasya.mapel = "produktif rpl";
        buPhasya.alamat = "malang";
        System.out.println("ini data buPhasya");
        System.out.println(buPhasya.id);
        System.out.println(buPhasya.nama);
        System.out.println(buPhasya.mapel);
        System.out.println(buPhasya.alamat);

        buAul.id = 1234;
        buAul.nama = "buAul";
        buAul.mapel = "produktif";
        buAul.alamat = "malang";
        System.out.println("ini data buAul");
        System.out.println(buAul.id);
        System.out.println(buAul.nama);
        System.out.println(buAul.mapel);
        System.out.println(buAul.alamat);

        pakFirman.id = 1234;
        pakFirman.nama = "pakFirman";
        pakFirman.mapel = "disiplin";
        pakFirman.alamat = "malang";
        System.out.println("ini data pakFirman");
        System.out.println(pakFirman.id);
        System.out.println(pakFirman.nama);
        System.out.println(pakFirman.mapel);
        System.out.println(pakFirman.alamat);

        buFeni.id =34;
        buFeni.nama="bu feni";
        buFeni.mapel="matematika";
        buFeni.alamat="malang";
        System.out.println("ini data buAul");
        System.out.println(buAul.id);
        System.out.println(buAul.nama);
        System.out.println(buAul.mapel);
        System.out.println(buAul.alamat);

        pakDiaur.id =25;
        pakDiaur.nama="pakDaiur";
        pakDiaur.mapel="fisika";
        pakDiaur.alamat="mlg";
        System.out.println("ini data pak diaurr");
        System.out.println(pakDiaur.id);
        System.out.println(pakDiaur.nama);
        System.out.println(pakDiaur.mapel);
        System.out.println(pakDiaur.alamat);
        
        buPhasya.print();
        buAul.print();
        pakFirman.print();
        buFeni.print();
        pakDiaur.print();

    }
}
