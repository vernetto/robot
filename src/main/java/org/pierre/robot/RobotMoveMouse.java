package org.pierre.robot;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotMoveMouse {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < 2000; i++) {
            robot.delay(5000);
            robot.mouseWheel(1);
            robot.delay(5000);
            robot.mouseWheel(-1);
        }
    }
}
