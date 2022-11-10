/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package latihan6_encapsulation;

/**
 *
 * @author ASUS
 */
public class bus2 {
    private int penumpang;
    private int maxPenumpang;
    
    //konstruktor
    public bus2(int maxPenumang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else {
            this.penumpang = temp;
        }
    }
    
    public void cetak(){
        System.out.println("Penumpang bus sekarang : " + penumpang);
        System.out.println("Penumpang maks sebenarnya : " + maxPenumpang);
    }
}
