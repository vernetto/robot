package org.pierre.robot;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotSnapshot {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < 2000; i++) {
            robot.delay(2000);
            robot.keyPress(KeyEvent.VK_RIGHT);
            robot.keyRelease(KeyEvent.VK_RIGHT);
            robot.delay(2000);
            robot.keyPress(KeyEvent.VK_PRINTSCREEN);
            robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
        }
    }
}
