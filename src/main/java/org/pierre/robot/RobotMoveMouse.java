package org.pierre.robot;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Date;

public class RobotMoveMouse {

    public static final int MS = 60000;
    public static final int NUMBEROFLOOPS = 2;
    public static final int LOOPS = 2000000;
    public static Robot robot ;


    public static void main(String[] args) throws AWTException {
        robot = new Robot();
        for (int i = 0; i < LOOPS; i++) {
            waitFor(NUMBEROFLOOPS);
            //System.out.println(pi.getDevice().getIDstring());
            //System.out.println(pi.getLocation());
            if ("\\Display0".equals(MouseInfo.getPointerInfo().getDevice().getIDstring())) {
                java.awt.Toolkit.getDefaultToolkit().beep();
            }
            robot.mouseWheel(1);
            waitFor(NUMBEROFLOOPS);
            robot.mouseWheel(-1);
            if ("\\Display0".equals(MouseInfo.getPointerInfo().getDevice().getIDstring())) {
                java.awt.Toolkit.getDefaultToolkit().beep();
            }
            System.out.println(new Date());
        }
    }

    private static void waitFor(int numberOfLoops) {
        for (int i = 0 ; i < numberOfLoops; i++) {
            robot.delay(MS);
        }

    }
}
