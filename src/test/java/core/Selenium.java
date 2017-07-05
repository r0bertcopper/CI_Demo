package core;

import junit.framework.TestCase;

/**
 * Created by user on 05/07/2017.
 */
public class Selenium extends TestCase{

    public void addDelay(int delay){

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
