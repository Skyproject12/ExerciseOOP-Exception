package exception;

import java.util.Scanner;

public class game {
    private String nama_pemain;
    private boolean statuskuis1,statuskuis2,statuskuis3;
//    Scanner scan= new Scanner(System.in);
//    String nama_pemain;
//    String pilihan;
//    boolean status1;
//    boolean status2;
//    boolean status3;
//    boolean buatkuis;
//
//    public game() {
//    }
//
//   
//  
//    public game(String nama_pemain, boolean status1) {
//        this.nama_pemain = nama_pemain;
//        this.status1 = status1;
//    }
//
//    public String getNama_pemain() {
//        System.out.println("Masukan Nama Pemain");
//        nama_pemain=scan.next();
//        return nama_pemain;
//    }
//
//    public void setNama_pemain(String nama_pemain) {
//        this.nama_pemain = nama_pemain;
//    }
//
//    public Scanner getScan() {
//        return scan;
//    }
//
//    public void setScan(Scanner scan) {
//        this.scan = scan;
//    }
//
//    public boolean isStatus1() {
//        System.out.println("satelit Bumi adalah ?");
//       
//        //if()
//        return status1;
//    }
//
//    public void setStatus1(boolean status1) {
//        this.status1 = status1;
//    }
//
//    public boolean isStatus2() {
//        return status2;
//    }
//
//    public void setStatus2(boolean status2) {
//        this.status2 = status2;
//    }
//
//    public boolean isStatus3() {
//        return status3;
//    }
//
//    public void setStatus3(boolean status3) {
//        this.status3 = status3;
//    }
//    public boolean kuis (int x, int y){
//        return true;
//    }
//    public boolean kuis (String jawaban, String pertanyaan){
//        return true;
//    }
//    public boolean kuis(int x, int y, int z){
//        return true;
//    }

    public game() {
    }

    public game(String nama_pemain) {
        this.nama_pemain = nama_pemain;
    }

    public String getNama_pemain() {
        return nama_pemain;
    }

    public void setNama_pemain(String nama_pemain) {
        this.nama_pemain = nama_pemain;
    }

    public boolean isStatuskuis1() {
        return statuskuis1;
    }

    public void setStatuskuis1(boolean statuskuis1) {
        this.statuskuis1 = statuskuis1;
    }

    public boolean isStatuskuis2() {
        return statuskuis2;
    }

    public void setStatuskuis2(boolean statuskuis2) {
        this.statuskuis2 = statuskuis2;
    }

    public boolean isStatuskuis3() {
        return statuskuis3;
    }

    public void setStatuskuis3(boolean statuskuis3) {
        this.statuskuis3 = statuskuis3;
    }
    
}
