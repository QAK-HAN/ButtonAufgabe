package main;

import controlP5.*;
import processing.core.PApplet;

import static controlP5.ControlP5Constants.*;

public class Main extends PApplet{
    public static void main(String[] args) {
        PApplet.main(Main.class);
    }
    ControlP5 controlP5;
    CallbackListener listener;
    ControlListener listener2;

    Button killButton;

    controlP5.Button loadButton;
    isOffButton offButton;

    Slider slider;
    isOffSlider offSlider;


    public void settings(){
        size(200,155);
    }
    public void setup(){
        background(0);

        controlP5 = new ControlP5(this);

        offButton = new isOffButton(loadButton,listener,this,true);
        offSlider = new isOffSlider(slider,listener2,this,true);



        offButton.newButton();
        offButton.buttonStyle();
        offButton.addListenerFor(ACTION_CLICK, new CallbackListener() {
            @Override
            public void controlEvent(CallbackEvent callbackEvent) {
                if(offButton.isItOn())
                    System.out.println("CLICK");
            }
        });
        offSlider.newSlider();
        offSlider.slideStyle();
        offSlider.addListenerFor(ACTION_DRAG, new CallbackListener() {
            @Override
            public void controlEvent(CallbackEvent callbackEvent) {
                if(offSlider.isItOn())
                    System.out.println("DRAG");
            }
        });
        newKillButton();
        buttonStyle();
       killButton.addListenerFor(ACTION_PRESS, new CallbackListener() {
            @Override
            public void controlEvent(CallbackEvent callbackEvent) {
            callbackToKill();
            }
        });



    }

    public void callbackToKill(){
        offSlider.turnSliderOff(!offSlider.isItOn());
        offButton.turnButtonOff(!offButton.isItOn());
        System.out.println("KILL");
    }

    public void newKillButton(){
        killButton = controlP5.addButton("Moin");
        killButton.setLabel("kill");
        killButton.setPosition(10, 120);
        killButton.setSize(180, 25);
    }

    public void buttonStyle(){
        killButton.setColorBackground(color(255,6,106));
    }

    public void draw(){
    }

    public void keyPressed() {
        if(key=='1') {
       callbackToKill();
        }
    }
}
