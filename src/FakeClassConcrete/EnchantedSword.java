/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FakeClassConcrete;

/**
 *
 * @author Alec
 */
public class EnchantedSword extends Sword{
    private String enchanment;
    private String enchanter;

    public final String getEnchanment() {
        return enchanment;
    }

    public final void setEnchanment(String enchanment) {
        this.enchanment = enchanment;
    }

    public final String getEnchanter() {
        return enchanter;
    }

    public final void setEnchanter(String enchanter) {
        this.enchanter = enchanter;
    }
    
}
