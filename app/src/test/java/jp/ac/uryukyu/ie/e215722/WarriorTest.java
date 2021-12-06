package jp.ac.uryukyu.ie.e215722;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    /**
     * attackWithWeponSkillを3回実行し、3回ともattackの150%ダメージになっていることを検証
     * 検証方法
     * （１）warriorと敵を準備。warriorの攻撃力を10。敵のHPをwarriorの攻撃力の150％の攻撃✖3回を受けられるHPにする。
     * （２）warriorが10の150%のダメージを与えることを期待。
     * （３）与えるダメージは15になるはず。よってwarriorに与えたダメージと10の150%が等しいことを期待。
     * 　　　これを３回検証する。
     */

    @Test
    void attackTest2(){
        int defaultWarriorAttack = 10;
        Warrior demowarrior =new Warrior("デモウォーリアー", 100, defaultWarriorAttack);
        Enemy slime = new Enemy("スライムもどき", 100, 10);
        for (int i=0; i<3; i++){
            int EnemyHP = slime.hitPoint;
            demowarrior.attackWithWeponSkill(slime);
            assertEquals(EnemyHP-slime.hitPoint, defaultWarriorAttack*1.5);
        }
    }

    
}
