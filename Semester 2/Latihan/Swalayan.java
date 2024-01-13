import java.util.Scanner;

public class Swalayan {
    String namaBarang;
    int hargaBarang, totalBiaya, id, jumlahBarang;

    public Scanner str = new Scanner(System.in);
    public Scanner in = new Scanner(System.in);

    public void setData() {
        this.id = 160500;
    }
    public void setData(int id) {
        this.id = 1 + id;
        System.out.print("Masukkan nama barang : ");
        this.namaBarang = str.nextLine();
        System.out.print("Masukkan haga barang : ");
        this.hargaBarang = in.nextInt();
    }
    public void setData(int id, int jumlah) {
        this.id = 1 + id;
        System.out.print("Masukkan nama barang : ");
        this.namaBarang = str.nextLine();
        System.out.print("Masukkan harga barang : ");
        this.hargaBarang = in.nextInt();
        this.jumlahBarang = jumlah;
        this.totalBiaya = this.hargaBarang * this.jumlahBarang;
    }
    public int getId() {
        return this.id;
    }
    public void tampil() {
        System.out.println("Id penjualan  : "+this.id);
        System.out.println("Nama Barang   : "+this.namaBarang);
        System.out.println("Harga Barang  : Rp"+this.hargaBarang);
        System.out.println("Jumlah Barang : "+this.jumlahBarang);
        System.out.println("Total Harga   : Rp"+this.totalBiaya);
    }
    public static void main(String[] args) {
        int z = 0, menu = 0, a, jumlah, id;
        Swalayan[] sw = new Swalayan[1024];
        sw[0] = new Swalayan();
        sw[0].setData();
        while(menu != 6) {
            System.out.println("|===============|");
            System.out.println("|               |");
            System.out.println("|      MENU     |");
            System.out.println("|               |");
            System.out.println("|===============|");
            System.out.println("|               |");
            System.out.println("|   1. Input    |");
            System.out.println("|   2. View     |");
            System.out.println("|   3. Search   |");
            System.out.println("|   4. Update   |");
            System.out.println("|   5. Delete   |");
            System.out.println("|   6. Exit     |");
            System.out.println("|               |");
            System.out.println("|===============|");
            System.out.print("Pilih menu : ");
            menu = sw[0].in.nextInt();

            if(menu == 1) {
                jumlah = 0;
                while(jumlah < 1) {
                    System.out.print("Masukkan jumlah barang : ");
                    jumlah = sw[0].in.nextInt();  
                }
                z++;
                sw[z]=new Swalayan();

                if(jumlah > 1) {
                    sw[z].setData(sw[z-1].getId(),jumlah);
                }else {
                    sw[z].setData(sw[z-1].getId());
                }

            }else if(menu == 2) {
                if(z < 1) {
                    System.out.println("datakosong");
                }else {
                    a = 0;
                    while (a < z) {
                        a++;
                        System.out.println("---"+a+"---");
                        sw[a].tampil();
                    }
                }
            }else if(menu == 3) {
                if(z < 1) {
                    System.out.println("data kosong");
                }else{
                    System.out.print("masukkan id pembeli yang dicari : ");
                    id = sw[0].in.nextInt();
                    a = 1;

                    while(a <= z) {
                        if(sw[a].getId() == id) {
                            break;
                        }
                        a++;
                    }
                    if (a <= z) {
                        sw[a].tampil();
                    }else {
                        System.out.println("data tidak diterima");
                    }
                }
            }else if(menu == 4) {
                if(z < 1) {
                    System.out.println("data kosong");
                }else {
                    System.out.print("masukkan id pembeli yang diupdate : ");
                    id = sw[0].in.nextInt();
                    a = 1;

                    while(a <= z){
                        if(sw[a].getId() == id) {
                            break;
                        }
                        a++;
                    }
                    if(a <= z){
                        sw[a].tampil();
                        jumlah = 0;

                        while(jumlah < 1) {
                            System.out.print("masukkan jumlah barang : ");
                            jumlah = sw[0].in.nextInt();
                        }
                        if(jumlah > 1) {
                            sw[a].setData(sw[z-1].getId(), jumlah);
                        }else {
                            sw[a].setData(sw[z-1].getId());
                        }
                    }
                }
            }else if(menu == 5){
                if(z < 1) {
                    System.out.println("data kosong");
                }else {
                    System.out.print("masukkan id pembeli yang didelete : ");
                    id = sw[0].in.nextInt();
                    a = 1;

                    while (a <= z) {
                        if(sw[a].getId() == id) {
                           break;
                        }
                        a++; 
                    }
                    if(a <= z) {
                        while (a < z) {
                            sw[a] = sw[a+1];
                            a++;
                        }
                        z--;
                        System.out.println("data berhasil dihapus");
                    }else {
                        System.out.println("data tidak ditemukan");
                    }
                }
            }else if(menu == 6) {
                System.out.println("keluar...");
            }else {
                System.out.println("menu ilegal");
            }
        }
    }
}