package layrry.message;

import com.kodcu.MyFirstClass;
import com.kodcu.MySecondClass;

/**
 * @author hakdogan (hakdogan@kodcu.com)
 * Created on 10.05.2020
 **/

public class Run
{
    public static void main(String[] args){

        final MyFirstClass first = new MyFirstClass();
        final MySecondClass second = new MySecondClass();

        System.out.println(String.join(",", first.getMessageFromMyFirstClass(),
                second.getMessageFromMySecondClass()));
    }
}
