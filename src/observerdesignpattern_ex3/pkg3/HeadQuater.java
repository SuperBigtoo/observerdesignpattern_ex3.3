/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerdesignpattern_ex3.pkg3;

import java.util.ArrayList;

/**
 *
 * @author Jason
 */
public class HeadQuater implements Source {
    private final ArrayList<MyObserver> list;
    private String score;
    
    public HeadQuater() {
        this.list = new ArrayList<MyObserver>();
    }
    
    public void setScore(String score) {
        this.score = score;
        notifyObservers();
    }
    
    public String getScore() {
        return score;
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).update(this);
        }
    }

    @Override
    public void register(MyObserver o) {
        list.add(o);
    } 
}
