package exception;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Exception {

    public static void main(String[] args) {
        
        int pilihan;
        boolean ulang=true ;
         game game= new game();
         String pertanyaan;
         String jawabankuis2;
       
        do{
            Scanner scan= new Scanner(System.in);
            try {
            System.out.println("=============================");
            System.out.println("   Kuis Asah Otak Cerdas     ");
            System.out.println("=============================");
            System.out.println("1. Buat Kuis ");
            System.out.println("2. Kuis 1");
            System.out.println("3. Kuis 2");
            System.out.println("4. Kuis 3");
            System.out.println("masukan pilihan");
            pilihan=scan.nextInt();
          
            if(pilihan !=1 && pilihan!=2 && pilihan!=3 &&pilihan!=4){
                System.out.println("Input anda salah");
                throw new InputMismatchException();
            }
                ulang=false;
                boolean sudahbuatkuis=false;
                if(pilihan==1){
                    System.out.println("masukkan nama");
                    String nama=scan.next(); 
                    game= new game(nama);
                    sudahbuatkuis=true;
                    throw new InputMismatchException();
                }
                if(pilihan==2){
                    if(sudahbuatkuis=false){
                        System.out.println("buat kuis terlebih dahulu");
                        throw new InputMismatchException();
                    }
                    pertanyaan="satelit bumi adalah";
                    System.out.println(pertanyaan);
                    System.out.println("jawaban kamu");
                    String jawabankuis1=scan.next().toLowerCase();
                    
                    if(jawabankuis1.equals("bulan")){
                        System.out.println("jawaban"+game.getNama_pemain()+"benar sekali");
                    }
                    else{
                        System.out.println("sayang sekali jawabanmu salah");
                    }
                    ulang=false;
                     //throw new InputMismatchException();
                }  
                if(pilihan==3){
                    if(sudahbuatkuis=false){
                        System.out.println("buat kuis terlebih dahulu");
                        throw new InputMismatchException();
                    }
                    pertanyaan="5+1";
                    System.out.println(pertanyaan);
                    System.out.println("jawaban kamu");
                    jawabankuis2=scan.next().toLowerCase();
                    
                    if(jawabankuis2.equals("6")){
                        System.out.println("jawaban"+game.getNama_pemain()+"benar sekali");
                    }
                    else{
                        System.out.println("sayang sekali jawabanmu salah");
                    }
                    ulang=false;
                }  
                
                if(pilihan==4){
                      if(sudahbuatkuis=false){
                        System.out.println("buat kuis terlebih dahulu");
                        throw new InputMismatchException();
                    }
                    pertanyaan="volume balok yang panjang p:10, L:10, t:10";
                    System.out.println(pertanyaan);
                    System.out.println("jawaban kamu");
                    String jawabankuis3=scan.next();
                    
                    if(jawabankuis3.equals("100")){
                        System.out.println("jawaban"+game.getNama_pemain()+"benar sekali");
                    }
                    else{
                        System.out.println("sayang sekali jawabanmu salah");
                    }
                    ulang=false;
                }  
            
            }catch (InputMismatchException e){
                  
                    ulang=true;
            }
           
        }while(ulang==true);
        
    }
}
