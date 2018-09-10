/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Cephas Dirthanz
 */
public class zookeeper {
    //private static final AtomicInteger count = new AtomicInteger(0);
    //private final int zk_id;
    public static int zk_id;
    String gender, name;
    int no_ani;

    public zookeeper(String name, String gender, int no_ani) {
        this.name = name;
        this.gender = gender;
        this.no_ani = no_ani;
        //this.zk_id ; //count.incrementAndGet();

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo_ani() {
        return no_ani;
    }

    public void setNo_ani(int no_ani) {
        this.no_ani = no_ani;
    }

    public int getZk_id() {
        return zk_id;
    }

    

    @Override
    public String toString() {
        zk_id++;
        return "zookeeper{" + ", ID= "+ zk_id +  ",  name= " + name + ", gender= "+ gender + ",Number of animals looked after = " + no_ani + '}';
    }

}