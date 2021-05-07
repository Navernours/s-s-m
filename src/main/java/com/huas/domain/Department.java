package com.huas.domain;

import java.io.Serializable;

public class Department implements Serializable {
    private Integer de_id;
    private String de_name;

    public Department() {
    }

    public Department(Integer de_id, String de_name) {
        this.de_id = de_id;
        this.de_name = de_name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "de_id=" + de_id +
                ", de_name='" + de_name + '\'' +
                '}';
    }

    public Integer getDe_id() {
        return de_id;
    }

    public void setDe_id(Integer de_id) {
        this.de_id = de_id;
    }

    public String getDe_name() {
        return de_name;
    }

    public void setDe_name(String de_name) {
        this.de_name = de_name;
    }
}
