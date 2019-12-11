package com.jia.littledefenseplan.Enemy;


import java.util.ArrayList;
import java.util.List;

public class BoManage {
    private List<Bo> bos = new ArrayList<>();
    public BoManage(){
        bos.add(new Bo(new BoNumber[]{
                new BoNumber(new EnemyManage().getEnemy1(),10)
        },5,1000));
        bos.add(new Bo(new BoNumber[]{
                new BoNumber(new EnemyManage().getEnemy1(),10),
                new BoNumber(new EnemyManage().getEnemy2(),10)
        },5,500));
        bos.add(new Bo(new BoNumber[]{
                new BoNumber(new EnemyManage().getEnemy1(),10),
                new BoNumber(new EnemyManage().getEnemy2(),10),
                new BoNumber(new EnemyManage().getEnemy3(),10)
        },5,350));
    }

    public class BoNumber{
        private EnemyManage.Enemy enemy;//预制体
        private int number;//数量
        public BoNumber(EnemyManage.Enemy enemy, int number){
            this.enemy = enemy;
            this.number = number;
        }
        public EnemyManage.Enemy getEnemy() {
            return enemy;
        }

        public int getNumber() {
            return number;
        }

    }
    public class Bo{
        private int waitingTime;//等待下一波时间
        private int createSpeed;//创造速度
        private BoNumber[] boNumber;
        public Bo(BoNumber[] boNumber,int waitingTime, int createSpeed){
            this.boNumber = boNumber;
            this.waitingTime = waitingTime;
            this.createSpeed = createSpeed;
        }

        public BoNumber[] getBoNumber() {
            return boNumber;
        }

        public int getWaitingTime() {
            return waitingTime;
        }

        public int getCreateSpeed() {
            return createSpeed;
        }
    }

    public List<Bo> getBos() {
        return bos;
    }
}
