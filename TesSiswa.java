//Driver Class
import java.util.Scanner;
public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("id : ");
        int id = in.nextInt();
        System.out.println("Nama");
        String nama = in.next();
        System.out.println("ipk : ");
        double ipk = in.nextDouble();

        //membuat obyek
        Siswa vincent = new Siswa(id, nama, ipk );
        Siswa sumanto = new Siswa(id, nama, ipk );
        Siswa rizky = new Siswa(id, nama, ipk );
        vincent.id = 100;
        vincent.nama = "Vincent";
        vincent.ipk = 4;
        sumanto.id = 101;
        sumanto.nama = "Sumanto";
        sumanto.ipk = 3.5;
        rizky.id = 102;
        rizky.nama = "Rizky";
        rizky.ipk = 3.8;
        System.out.println("ini data vincent");
        System.out.println(vincent.id);
        System.out.println(vincent.nama);
        System.out.println(vincent.ipk);
        System.out.println("ini data sumanto");
        System.out.println(sumanto.id);
        System.out.println(sumanto.nama);
        System.out.println(sumanto.ipk);
        System.out.println("ini data Rizky");
        System.out.println(rizky.id);
        System.out.println(rizky.nama);
        System.out.println(rizky.ipk);
        
        vincent.print();
        sumanto.print();
        rizky.print();
    }
}
