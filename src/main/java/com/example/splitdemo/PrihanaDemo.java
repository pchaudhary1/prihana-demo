package com.example.splitdemo;

import io.split.client.SplitClient;
import io.split.client.SplitClientConfig;
import io.split.client.SplitFactoryBuilder;
import jdk.jfr.Experimental;



public class PrihanaDemo {
    private static SplitClient client;

    enum FF {
        Feature1,
        Feature2
    }

//------------------------------------------------------------------------------------------------------------


    public void developerFeatureFlag() {
        if (this.evaluate(FF.Feature1)) {
            dummyOnFunction();
            System.out.println("ON case");
        } else {
            System.out.println("OFF case");
            dummyOFFFunction();
        }
    }


    private boolean evaluate(FF flagName) {
        return true;
    }

    private void dummyOFFFunction() {
    }

    private void dummyOnFunction() {
    }

}
