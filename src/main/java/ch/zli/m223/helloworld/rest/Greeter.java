package ch.zli.m223.helloworld.rest;

import javax.enterprise.context.ApplicationScoped;

/**
 *
 */
@ApplicationScoped
public class Greeter {

    public String getGreeting() {
        return "Hello World!";
    }
}
