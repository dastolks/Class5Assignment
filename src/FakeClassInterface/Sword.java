/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FakeClassInterface;

/**
 *
 * @author Alec
 */
public interface Sword {
    public abstract int getLength();
    public abstract int getWeight();
    public abstract String getSkill();
    public abstract void setLength(int l);
    public abstract void setWeight(int w);
    public abstract void setSkill(String k);
}
