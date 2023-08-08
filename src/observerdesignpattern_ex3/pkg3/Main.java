/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerdesignpattern_ex3.pkg3;

/**
 *
 * @author Jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monitor1 monitor1 = new Monitor1();
        Monitor2 monitor2 = new Monitor2();
        HeadQuater obj = new HeadQuater();
        
        obj.register(monitor1);
        obj.register(monitor2);
        obj.setScore("Thai 1-0 UAE");
        obj.setScore("Thai 2-0 UAE");
    }
}
