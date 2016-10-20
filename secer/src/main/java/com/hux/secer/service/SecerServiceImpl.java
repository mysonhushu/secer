/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hux.secer.service;

import com.hux.secer.beans.Actor;
import com.hux.secer.exception.InvalidHeaderException;
import com.hux.secer.exception.InvalidScriptException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kado
 */
public class SecerServiceImpl implements SecerService{
    public static final String LINE_SPARATOR = System.getProperty("line.separator");
    public static final String SCRIPT_SPARATOR = ";"; 
    public static final String SCRIPT_SEND = ">";
    public static final String SCRIPT_RECEIVE = "<";
    public static final String SCRIPT_SPACELINE = "$";
    public static final String SCRIPT_BOTHWAY = "=";
            
    private ArrayList<Actor> actors = new ArrayList<Actor>();
    private ArrayList<String> orginalScriptList = new ArrayList<>();

    @Override
    public ArrayList<String> readScripts(String scripts) {
        String[] scriptsArray = scripts.split(LINE_SPARATOR);
        for(int i=0; i<scriptsArray.length; i++)
        {
            orginalScriptList.add(scriptsArray[i]);
            if(i==0)
            {
                anaysisHeader(scriptsArray[i]);
            }else{
                anaysisMessage(i, scriptsArray[i]);
            }
        }
        return null;
    }

    @Override
    public StringBuffer draw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void anaysisHeader(String header){
        if(!header.startsWith("^")){
            try {
                throw new InvalidHeaderException("Invalid Header syntax, the header line must start with ^ ");
            } catch (InvalidHeaderException ex) {
                Logger.getLogger(SecerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String[] actors = header.substring(1).split(",");
        for(int i=0; i<actors.length; i++)
        {
            Actor actor = new Actor();
            actor.setActorPosition(i+1);
            actor.setActorName(actors[i]);
            actor.setActorScript(new ArrayList());
            this.actors.add(actor);
        }
    }
    
    private void anaysisMessage(int index, String cmd){
        try {
            char firstChar = cmd.charAt(0);
            switch(firstChar){
                case '<':{
                    String[] cmdAndMsg = cmd.split(SCRIPT_SPARATOR);
                    if(cmdAndMsg.length != 2){
                        throw new InvalidScriptException("Invalid Script at line:"+index+" script is:"+cmd+" reason: lact of ; to separate.");
                    }
                    //TODO:
                }
                case '>':{
                    
                }
                case '=':{
                    
                }
                case '$':{
                    
                }
                default:
                    throw new InvalidScriptException("Invalid Script at line:"+index+" script is:"+cmd+" reason: the begin char is in valid.");
                    
            }
        } catch (InvalidScriptException ex) {
            Logger.getLogger(SecerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
