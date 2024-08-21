package tugasbupasha;
//Object Guru
public class Guru {
    int id;
    String nama;
    String alamat;
    String mapel;

    //constructor Guru
    public Guru() {
        id = 0;
        nama = "";
        alamat = "";
        mapel = "";

        
    }
    //Consturctor Parameter
    public Guru(int id, String nama, String alamat, String mapel){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.mapel = mapel;
    }
    //method
    public void print(){
        System.out.println("--------------------");
        System.out.println("ID :"+ id);
        System.out.println("Nama"+ nama);
        System.out.println("Mapel:"+ mapel);
        System.out.println("Alamat:"+ alamat);
        System.out.println("--------------------");
    }
}
