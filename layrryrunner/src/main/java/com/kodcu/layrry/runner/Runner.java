package com.kodcu.layrry.runner;

import org.moditect.layrry.Layers;

/**
 * @author hakdogan (hakdogan@kodcu.com)
 * Created on 19.05.2020
 **/

public class Runner
{
    public static void main(String[] args){

        Layers layers = Layers.builder()
                .layer("greeterOlder")
                .withModule("com.kodcu:greeter:1.0.0")
                .layer("greeterRecent")
                .withModule("com.kodcu:greeter:2.0.0")
                .layer("bar")
                .withParent("greeterOlder")
                .withModule("com.kodcu:bar:1.0.0")
                .layer("foo")
                .withParent("greeterRecent")
                .withModule("com.kodcu:foo:1.0.0")
                .layer("app")
                .withParent("bar")
                .withParent("foo")
                .withModule("com.kodcu:app:1.0.0")
                .build();

        layers.run("com.kodcu.app/com.kodcu.app.App");
    }
}
