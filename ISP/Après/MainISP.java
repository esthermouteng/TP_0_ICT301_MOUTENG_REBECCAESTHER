package ISP.Après;

import ISP.Avant.HumanWorker;
import ISP.Avant.RobotWorker;

public class MainISP {
    public static void main(String[] args) {
        
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();

        RobotWorker robot = new RobotWorker();
        robot.work();
    }
    
}
