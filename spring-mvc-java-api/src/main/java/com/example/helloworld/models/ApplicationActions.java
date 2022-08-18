package com.example.helloworld.models;

import java.util.ArrayList;
import java.util.List;

public class ApplicationActions {

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    private String applicationName;
    private List<Action> actions = new ArrayList();

    @Override
    public String toString() {
        return "ApplicationActions{" +
                "applicationName='" + applicationName + '\'' +
                ", actions=" + actions +
                '}';
    }
}
