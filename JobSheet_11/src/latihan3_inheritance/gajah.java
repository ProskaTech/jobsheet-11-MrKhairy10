/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package latihan3_inheritance;

/**
 *
 * @author ASUS
 */
public class gajah extends hewan{
    //meng-overwrite method pada class hewan
    public static void testClassMethod(){
        System.out.println("The Ckass Method in Hewan");
    }
    
    public static void testInstanceMethod(){
        System.out.println("The Instance Method in Gajah");
    }
    
    public static void main(String args[]){
        gajah mygajah = new gajah();
        hewan myhewan = mygajah;
        hewan.testClassMethod();
        myhewan.testInstanceMethod();
    }
}
