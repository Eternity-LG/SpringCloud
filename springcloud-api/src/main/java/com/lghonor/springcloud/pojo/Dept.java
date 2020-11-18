package com.lghonor.springcloud.pojo;


import java.io.Serializable;

/**
 * @author
 */
public class Dept implements Serializable {


    public long getDeptNO() {
        return deptNO;
    }

    public void setDeptNO(long deptNO) {
        this.deptNO = deptNO;
    }

    private long deptNO;

    public Dept() {
    }

    public Dept(long deptNO) {
        this.deptNO = deptNO;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    private String dname;
    private String db_source;
}
