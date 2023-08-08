/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerdesignpattern_ex3.pkg3;

/**
 *
 * @author Jason
 */
public class Monitor1 implements MyObserver{
    
    @Override
    public void update(Source o) {
        System.out.println("live result: " + ((HeadQuater)o).getScore());
    }
}
