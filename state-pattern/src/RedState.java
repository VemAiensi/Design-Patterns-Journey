public class RedState implements TrafficLightState 
{
    @Override
    public void switchState(TrafficLightController controller)
    {
        controller.setState(new GreenState());
    }

    @Override
    public String getColor() 
    {
        return "Red";
    }
}
