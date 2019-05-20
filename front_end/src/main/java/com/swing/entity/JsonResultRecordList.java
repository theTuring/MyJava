package com.swing.entity;

import java.util.List;

//接收接口返回json的实体类(record)
public class JsonResultRecordList {

    private int status;

    private String msg;

    private List<Record> data;

    private String ok;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Record> getData() {
        return data;
    }

    public void setData(List<Record> data) {
        this.data = data;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }
}
