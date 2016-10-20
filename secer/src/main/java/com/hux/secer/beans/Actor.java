/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hux.secer.beans;

import java.util.ArrayList;

/**
 *
 * @author kado
 */
public class Actor {
    private String ActorName;
    private int  ActorPosition;
    private ArrayList<String> ActorScript = null;
    public String getActorName() {
        return ActorName;
    }

    public void setActorName(String ActorName) {
        this.ActorName = ActorName;
    }

    public int getActorPosition() {
        return ActorPosition;
    }

    public void setActorPosition(int ActorPosition) {
        this.ActorPosition = ActorPosition;
    }

    public ArrayList<String> getActorScript() {
        return ActorScript;
    }

    public void setActorScript(ArrayList<String> ActorScript) {
        this.ActorScript = ActorScript;
    }

}
