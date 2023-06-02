package academy.devonline.java.basic.section01_setup.section05_setup;

import java.util.Random;
import java.util.Scanner;

public class BreakValidUsage {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        var gused = false;
        for (var i = 0; i<3;i++) {
            var user = new Scanner(System.in).nextInt();
            if (user>number){
                System.out.println("Больше: >"+user+"try :");
            } else if (user<number) {
                System.out.println("Менше: >"+user+"try :");
            }else {
                gused= true;
                System.out.println("Вы угадали :");
                break;
            }
        }
        if (!gused)
        System.out.println("Ваш лимит закончился");
    }
}
