package com.example.lightsfx;
import java.util.Random;

public class Model {
    public static final int NUMBER_OF_LIGHTS = 7;
    private boolean[] lights;
    private Random random;

    public Model(){
        lights = new boolean[NUMBER_OF_LIGHTS];
        random = new Random();
        randomiseLights();
    }
    public boolean getLight(int i){
        return lights[i];
    }
    public void toggle(int i){
        if(i < 0 || i >= NUMBER_OF_LIGHTS){
            return;
        }
        lights[i] = !lights[i];
        if(i + 1 < NUMBER_OF_LIGHTS){
            lights[i+1] = !lights[i+1];
        }
        if(i - 1 >= 0){
            lights[i-1] = !lights[i-1];
        }
    }
    public void randomiseLights(){
        for(int i = 0; i  < NUMBER_OF_LIGHTS; i++){
            lights[i] = random.nextBoolean();
        }

    }
    public boolean allLightsAreOff(){
        for(boolean light : lights) {
            if (light) return false;
        }
            return true;

    }

}
