package com.example.helloworld.models;

public class Action {

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getSupportedTriggers() {
        return SupportedTriggers;
    }

    public void setSupportedTriggers(String supportedTriggers) {
        SupportedTriggers = supportedTriggers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String actionName;

    private String SupportedTriggers;

    private String status;

    @Override
    public String toString() {
        return "Action{" +
                "actionName='" + actionName + '\'' +
                ", SupportedTriggers='" + SupportedTriggers + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
