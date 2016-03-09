package com.goribun.common.utils.collections;

import com.goribun.common.utils.json.JsonUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Created by wangxuesong on 16/3/9.
 */
public class JsonUtilTest {

    private Person p;

    @Before
    public void buildPerson() {
        p = new Person();
        p.setName("Tom");
        p.setBirthday(new Date());
        p.setWeight(50.5);
    }

    @Test
    public void testObject2json() {
        String jsonStr = JsonUtil.object2json(p);
        System.out.println(jsonStr);
    }

}

class Person {

    private String name;
    private Date birthday;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}