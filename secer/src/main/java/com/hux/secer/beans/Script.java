package com.hux.secer.beans;

/**
 *
 * @author kado
 */
public class Script {
    /** the message sender  position **/
    private int messageSenderPosition;
    /** the message receiver  position **/
    private int messageReceiverPosition;
    /** the script value **/
    private int scriptValue;
    /** the script index **/
    private int scriptIndex;
    
    private Direction messageDirection;
    
    
    public enum Direction {
        SEND('>'),RECEIVE('<');
        
        private Direction(char direct){
            this.direct = direct;
        }
        private char direct;
        public char getDirectValue(){
            return this.direct;
        }
    }
    
}
