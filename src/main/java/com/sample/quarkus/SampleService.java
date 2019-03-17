package com.sample.quarkus;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SampleService {

    public String helloQuarkus() {
        return "Hello, quarkus\n";
    }

}
