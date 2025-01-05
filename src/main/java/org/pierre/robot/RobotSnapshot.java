package org.pierre.robot;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Date;

public class RobotSnapshot {

    public static final int NUMBEROFPAGES = 500;
    public static final int DELAYPAGE = 5000;

    public static void main(String[] args) throws AWTException {
        int count = 0;
        Robot robot = new Robot();
        robot.delay(DELAYPAGE);

        for (int i = 0; i < NUMBEROFPAGES; i++) {
            takeSnapshot(robot);
            robot.delay(DELAYPAGE);
            //moveWithRightArrow(robot);
            moveWithPageDown(robot);
            robot.delay(DELAYPAGE);
            System.out.println(new Date() + " printscreen "+ count++);
            //KeyEvent keyEvent = new KeyEvent();
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

    private static void moveWithRightArrow(Robot robot) {
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
    }

    private static void moveWithPageDown(Robot robot) {
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    }
}
