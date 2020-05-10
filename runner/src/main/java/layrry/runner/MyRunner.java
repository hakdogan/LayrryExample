package layrry.runner;

import org.moditect.layrry.Layers;

/**
 * @author hakdogan (hakdogan@kodcu.com)
 * Created on 10.05.2020
 **/

public class MyRunner
{
    public static void main(String[] args){
        Layers layers = Layers.builder()
                .layer("first")
                .withModule("com.kodcu:first:1.0.0")
                .layer("second")
                .withModule("com.kodcu:second:1.0.0")
                .layer("third")
                .withModule("layrry.message:third:1.0.0")
                .layer("runner")
                .withModule("layrry.runner:runner:1.0.0")
                .build();

        layers.run("runner/layrry.runner.Run");
    }
}
