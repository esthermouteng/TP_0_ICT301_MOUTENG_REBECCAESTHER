package ISP.Après;

interface Workable {
    void work();
}
 class HumanWorker implements Eatable {

           @Override
           public void work() {
            System.out.println("Les humains travaillent");
           }
           @Override
           public void eat(){
            System.out.println("Les humains mangeant");
           }
    

}

class RobotWorker implements Workable {
    @Override
    public void work(){
        System.out.println("Les Robots travaillent sans fatigue");
    }

    
}
