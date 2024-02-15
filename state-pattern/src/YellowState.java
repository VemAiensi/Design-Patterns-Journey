public class YellowState implements TrafficLightState 
{
    @Override
    public void switchState(TrafficLightController controller)
    {
        controller.setState(new RedState());
    }

    @Override
    public String getColor() 
    {
        return "Yellow";
    }
}
