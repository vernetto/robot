package org.pierre.robot;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Date;

public class RobotClick {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < 2000; i++) {
            robot.delay(5000);
            robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
            robot.delay(1000);
            robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
            System.out.println(new Date() + " click");
        }
    }
}
