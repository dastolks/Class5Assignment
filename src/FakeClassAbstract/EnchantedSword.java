/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FakeClassAbstract;

/**
 *
 * @author Alec
 */
public abstract class EnchantedSword extends Sword{   
    public abstract String getEnchantment();
    public abstract void SetEnchantment(String e);
    public abstract String getEnchantedBy();
    public abstract void setEnchantedBy(String s);
}
