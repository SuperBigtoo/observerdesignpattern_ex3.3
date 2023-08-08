/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerdesignpattern_ex3.pkg3;

/**
 *
 * @author Jason
 */
public interface Source {
    public void notifyObservers ();
    public void register (MyObserver o);
}
