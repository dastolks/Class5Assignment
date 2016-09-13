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
public class TrueFlame extends EnchantedSword{
    private String enchantment;
    private String enchanter;
    private String skill;
    private int length;
    private int weight;
     
    public TrueFlame(){
        this.length = 5;
        this.weight = 15;
        this.enchanter = "Dumac DwarfKing";
        this.enchantment = "Fire Damage";
    } 
    //used to get the enchantment
    @Override
    public final String getEnchantment() {
        return this.enchantment;
    }
    //used to set the enchantment
    @Override
    public final void SetEnchantment(String e) {
        this.enchantment = e;
    }
    //used to get who enchanted the blade.
    @Override
    public final String getEnchantedBy() {
        return this.enchanter;
    }
    //used to set who enchanted the blade.
    @Override
    public final void setEnchantedBy(String s) {
        this.enchanter = s;
    }
    //used to get the length of the current sword.
    @Override
    public final int getLength() {
        return this.length;
    }
    //used to get the weight of the current sword.
    @Override
    public final int getWeight() {
        return this.weight;
    }
    //set the weight of the blade
    @Override
    public final void setLength(int l) {
        this.length = l;
    }
    //set the weight of the blade
    @Override
    public final void setWeight(int w) {
        this.weight = w;
    }
    //get the skill needed to use the blade.
    @Override
    public final String getSkill(){
        return skill;
    }    
    @Override
    public final void setSkill(String k){
        this.skill = k;
    }
    
    
}
