package org.pierre.robot;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Date;

public class RobotSnapshot {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < 2000; i++) {
            robot.delay(2000);
            moveWithPageDown(robot);
            robot.delay(2000);
            System.out.println(new Date() + " printscreen");
            //KeyEvent keyEvent = new KeyEvent();
            takeSnapshot(robot);
        }
    }

    private static void takeSnapshot(Robot robot) {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_PRINTSCREEN);
        robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    private static void moveWithLeftArrow(Robot robot) {
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
    }

    private static void moveWithPageDown(Robot robot) {
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    }
}
