public class GreenState implements TrafficLightState 
{
    @Override
    public void switchState(TrafficLightController controller)
    {
        controller.setState(new YellowState());
    }

    @Override
    public String getColor() 
    {
        return "Green";
    }
}
