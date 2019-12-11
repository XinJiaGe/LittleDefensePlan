package com.jia.littledefenseplan.Enemy;

public class EnemyManage {
    private Enemy enemy1 = new Enemy(EnemyPreformManage.pref1,"enemy1",100,15);
    private Enemy enemy2 = new Enemy(EnemyPreformManage.pref2,"enemy2",200,10);
    private Enemy enemy3 = new Enemy(EnemyPreformManage.pref3,"enemy3",300,5);

    public static class Enemy{
        private EnemyPreformManage.Pref pref;
        private float bool;
        private String name;
        private int speed;

        public Enemy (EnemyPreformManage.Pref pref,String name, float bool, int speed){
            this.pref = pref;
            this.name = name;
            this.bool = bool;
            this.speed = speed;
        }

        public EnemyPreformManage.Pref getPref() {
            return pref;
        }

        public float getBool() {
            return bool;
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }
    }

    public Enemy getEnemy1() {
        return enemy1;
    }

    public Enemy getEnemy2() {
        return enemy2;
    }

    public Enemy getEnemy3() {
        return enemy3;
    }
}
