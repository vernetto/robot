package org.pierre.robot;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Date;

public class RobotMoveMouse {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < 2000000; i++) {
            robot.delay(60000);
            robot.delay(60000);
            robot.mouseWheel(1);
            robot.delay(60000);
            robot.delay(60000);
            robot.mouseWheel(-1);
            System.out.println(new Date());
        }
    }
}
