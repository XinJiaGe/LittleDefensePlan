package com.jia.littledefenseplan.Map;

public class StrangeMouthManage {
    private StrangeMouth[] strangeMouth = new StrangeMouth[4];

    public StrangeMouthManage(){
        strangeMouth[0] = new StrangeMouth("上");
        strangeMouth[1] = new StrangeMouth("下");
        strangeMouth[2] = new StrangeMouth("左");
        strangeMouth[3] = new StrangeMouth("右");
    }

    public class StrangeMouth{
        private String name;
        public StrangeMouth(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public StrangeMouth[] getStrangeMouth() {
        return strangeMouth;
    }
}
