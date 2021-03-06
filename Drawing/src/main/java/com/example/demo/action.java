package com.example.demo;

import java.io.Serializable;

public class action implements Serializable {
    private String actionType;
    private Integer id;
    private String property;
    private String oldValue;
    private String newValue;

    public action(){

    }

    public action(String actionType, Integer id){ //for create and delete
        this.actionType = actionType.toLowerCase();
        this.id = id;
    }

    public action(String property , String oldValue , String newValue,Integer id){ //modify
        this.property = property;
        this.newValue = newValue;
        this.oldValue = oldValue;
        this.id = id;
        this.actionType = "modify";
    }


    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    @Override
    public String toString() {
        return "action{" +
                "actionType='" + actionType + '\'' +
                ", id=" + id +
                ", property='" + property + '\'' +
                ", oldValue='" + oldValue + '\'' +
                ", newValue='" + newValue + '\'' +
                '}';
    }
}
