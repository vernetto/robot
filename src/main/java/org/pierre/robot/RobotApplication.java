package org.pierre.robot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RobotApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RobotApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        RobotMoveMouse.main(null);
    }
}
