/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package latihan2_inheritance;

/**
 *
 * @author ASUS
 */
public class person {
    protected String name;
    protected int age;
    
    public person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void info(){
        System.out.println("Nama : " + this.name);
        System.out.println("Usia : " + this.age);
    }
}
