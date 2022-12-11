package main;

import controlP5.Button;
import controlP5.CallbackListener;
import controlP5.ControlP5;
import processing.core.PApplet;

public class isOffButton {
    Button button;
    CallbackListener listener;
    ControlP5 cP5;
    PApplet applet;
    boolean isOn;

    isOffButton(controlP5.Button button, CallbackListener listener, PApplet applet, boolean isOn){
        cP5 = new ControlP5(applet);
        this.button = button;
        this.listener = listener;
        this.applet = applet;
        this.isOn = isOn;
    }
    boolean isItOn(){
        return this.isOn;
    }


    void turnButtonOff(boolean isButtonOnOrOff){
        if(!isButtonOnOrOff){
            button.setColorForeground(applet.color(100));
            button.setColorActive(applet.color(100));
            button.setColorBackground(applet.color(100));
            isOn = false;
        }
        else
        {
            button.setColorForeground(applet.color(100));
            button.setColorActive(applet.color(0));
            button.setColorBackground(applet.color(6,255,231));
            isOn = true;
        }
    }
    public void newButton() {
        button = cP5.addButton("click me");
        button.setPosition(10, 70);
        button.setSize(180, 25);
    }
    public void buttonStyle(){
        button.setColorForeground(applet.color(100));
        button.setColorActive(applet.color(0));
        button.setColorBackground(applet.color(6,255,231));

    }
    public void addListenerFor(int i, CallbackListener callbackListener){
        button.addListenerFor(i,callbackListener);
    }
}


