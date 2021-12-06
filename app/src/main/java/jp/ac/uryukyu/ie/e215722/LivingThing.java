package jp.ac.uryukyu.ie.e215722;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    /**
     * nameを設定するメソッド
     * @param name LivingThingの名前
     */
    public void setName(String name){
        this.name = name;
    }

    /** 
     * nameを取得するメソッド
     * @return LivingThingの名前
     */
    public String getName(){
        return this.name;
    }

    /**
     * HPを設定するメソッド
     * @param hitPoint LivingThingのHP
     */
    public void setHitPoint(int hitpoint){
        this.hitPoint = hitpoint;
    }

    /**
     * HPを取得するメソッド 
     * @return LivingThingの名前
     */
    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * LivingThingの攻撃力を設定するメソッド
     * @param attack
     */
    public void setAttack(int attack){
        this.attack = attack;
    }

    /**
     * LivingThingの攻撃力を取得するメソッド
     * @return 敵の攻撃力
     */
    public int getAttack(){
        return this.attack;
    }

    /**
     * LivingThingの生死状態を設定するメソッド
     * @param dead 敵の生死状態 ture=死亡
     */
    public void setDead(boolean dead){
        this.dead = dead;
    } 

    /**
     * LivingThingの生死状態を取得するメソッド
     * @return 敵の生死状態
     */
    public boolean getDead(){
        return this.dead;
    }
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP,attack);
    }

    public boolean isDead(){
        return this.dead;
    }

    public void attack(LivingThing opponent){
       if(!dead){ 
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
       }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }





}

