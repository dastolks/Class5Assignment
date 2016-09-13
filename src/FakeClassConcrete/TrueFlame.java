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
public class TrueFlame extends EnchantedSword{
    private boolean nerevarSword;
    private String name;
    
    public TrueFlame(){
        this.name = "True Flame";
        this.nerevarSword = true;
        this.setWeight(15);
        this.setLength(3);
        this.setEnchanment("Fire Damage");
        this.setEnchanter("Dumac Dwarfking");
        this.setSkill("Long Blade");
    }

    public final String getName() {
        return name;
    }

    public final boolean isNeverarSword() {
        return this.nerevarSword;
    }
    
}
