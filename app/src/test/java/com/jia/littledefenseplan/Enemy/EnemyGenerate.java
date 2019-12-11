package com.jia.littledefenseplan.Enemy;

import com.jia.littledefenseplan.Map.StrangeMouthManage;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EnemyGenerate {
    private List<EnemyManage.Enemy> enemyList = new ArrayList<>();
    @Test
    public void init(){
        StrangeMouthManage.StrangeMouth[] strangeMouth = new StrangeMouthManage().getStrangeMouth();
        BoManage boManage = new BoManage();
        List<BoManage.Bo> bos = boManage.getBos();
        for (int i = 0; i < bos.size(); i++) {
            System.out.println("第 "+(i+1)+" 波" );
            BoManage.Bo bo = bos.get(i);
            BoManage.BoNumber[] boNumbers = bo.getBoNumber();
            for (int j = 0; j < boNumbers.length; j++) {
                BoManage.BoNumber boNumber = boNumbers[i];
                for (int k = 0; k < boNumber.getNumber(); k++) {
                    try {
                        System.out.println(strangeMouth[j].getName()+" 路口创建成功");
                        enemyList.add(boNumber.getEnemy());
                        Thread.sleep(bo.getCreateSpeed());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                Thread.sleep(bo.getWaitingTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(enemyList.size());
    }
}
