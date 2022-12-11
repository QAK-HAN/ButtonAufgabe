package main;

import controlP5.CallbackListener;
import controlP5.ControlListener;
import controlP5.ControlP5;
import controlP5.Slider;
import processing.core.PApplet;

public class isOffSlider{

    ControlP5 controlP5;
    Slider slider;
    ControlListener listener;
    PApplet applet;
    boolean isOn;

    isOffSlider(Slider slider, ControlListener listener,PApplet applet,boolean isOn){
        this.slider = slider;
        this.listener = listener;
        this.applet = applet;
        controlP5 = new ControlP5(this.applet);
        this.isOn = isOn;
    }
    boolean isItOn(){
        return isOn;
    }

    void turnSliderOff(boolean isButtonOnOrOff){
        if(!isButtonOnOrOff){
            slider.setColorForeground(applet.color(100));
            slider.setColorActive(applet.color(100));
            slider.setColorBackground(applet.color(100));
            slider.setRange(0,0);
            isOn = false;
        }
        else{
            slider.setColorForeground(applet.color(0));
            slider.setColorActive(applet.color(0));
            slider.setColorBackground(applet.color(6,255,231));
            slider.setRange(0,255);
            isOn = true;
        }
    }
    public void newSlider(){
        slider = controlP5.addSlider("Slide here pls");
        slider.setPosition(10, 30);
        slider.setSize(70, 25);
    }
    public void slideStyle(){
        slider.setColorForeground(applet.color(0));
        slider.setColorActive(applet.color(0));
        slider.setColorBackground(applet.color(6,255,231));
    }

    public void addListenerFor(int i, CallbackListener callbackListener){
        slider.addListenerFor(i,callbackListener);
    }
}