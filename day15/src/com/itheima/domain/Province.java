package com.itheima.domain;

public class Province {
    private int provinceid;
    private String name;

    public int getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(int provinceid) {
        this.provinceid = provinceid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province(int provinceid, String name) {
        this.provinceid = provinceid;
        this.name = name;
    }

    public Province() {
    }
}
