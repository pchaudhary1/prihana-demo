package com.example.splitdemo;

import io.split.client.SplitClient;
import io.split.client.SplitClientConfig;
import io.split.client.SplitFactoryBuilder;
import io.split.client.api.SplitResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import split.com.google.gson.Gson;

import javax.annotation.PostConstruct;
import java.util.*;

@SpringBootApplication
public class SplitDemoApplication {



    public static void main(String[] args) throws Exception {
        SpringApplication.run(SplitDemoApplication.class, args);
    
    }

}
