public class TrafficLightDemo 
{
    public static void main(String[] args) {
        TrafficLightController controller = new TrafficLightController();
        System.out.println(controller.getState().getColor());

        controller.getState().switchState(controller);
        System.out.println("Transitioning to Green!");
        System.out.println(controller.getState().getColor());

        controller.getState().switchState(controller);
        System.out.println("Transitioning to Yellow!");
        System.out.println(controller.getState().getColor());

        controller.getState().switchState(controller);
        System.out.println("Transitioning to Red!");
        System.out.println(controller.getState().getColor());
    }
    
}
