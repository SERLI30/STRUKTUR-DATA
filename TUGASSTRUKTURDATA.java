
package tugas.struktur.data;

public class TUGASSTRUKTURDATA {

    public static void main(String[] args) {
        System.out.println("array int");
    int []inta = new int[3];
    inta[0]=30;
    inta[1]=20;
    inta[2]=10;
        for (int i = 0; i < inta.length; i++) {
            System.out.println(i+inta[i]);
        }
        System.out.println("array double");
            double[]doublea={30,12,9.5};
            for (double nilai : doublea) {
                System.out.println(nilai);
            }
            System.out.println("array long");
            long []longa={5678,8907,7860};
           for (int i = 0; i < longa.length; i++) {
               System.out.println(longa[i]);
           }
           System.out.println("array byte");
           byte []bytea={1,2,3};
           System.out.println(bytea[2]);
    
           System.out.println("array char");
           char []chara = {'S','E','R','L','I'};
           for (char nilai: chara){
           System.out.print(nilai);
           }
           
               System.out.println("array float");
               float []floata={0.1234f,1.567f};
               System.out.println(floata[0]);
               System.out.println(floata[1]);
               System.out.println("array short");
               short []shorta = {287,705,101,005};
               short a = 0;
        do{
            System.out.println(shorta [a]);
            a++;
        }while(a <shorta.length);
        System.out.println("array boolean");
        boolean []booleana = new boolean[5];
        booleana [0]= true;
        booleana [1]=false;
        booleana [2]=true;
        booleana [3]=false;
        booleana [4]=true;
        for (boolean nilaig:booleana){
            System.out.println(nilaig);

            
        }
            
        }
    
            
        
            
        
            
        
           
        
    
                
            
        
    
    

