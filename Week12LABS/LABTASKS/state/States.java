package OOP.Week12LABS.LABTASKS.state;

class RedLightState implements TrafficLightState{

    @Override
    public String transitionToRed() {
        return "The light is red.";
    }

    @Override
    public String transitionToYellow() {
        return null;
    }

    @Override
    public String transitionToGreen() {
        return null;
    }
}

class YellowLightState implements TrafficLightState{

    @Override
    public String transitionToRed() {
        return null;
    }

    @Override
    public String transitionToYellow() {
        return "The light is yellow";
    }

    @Override
    public String transitionToGreen() {
        return null;
    }
}

class GreenLightState implements TrafficLightState{

    @Override
    public String transitionToRed() {
        return null;
    }

    @Override
    public String transitionToYellow() {
        return null;
    }

    @Override
    public String transitionToGreen() {
        return "The light is green.";
    }
}

class TrafficLightContext implements TrafficLightState{
    private String state;

    public TrafficLightContext() {
        RedLightState redLightState = new RedLightState();
        this.state = redLightState.transitionToRed();
    }


    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String transitionToRed() {
        RedLightState redLightState = new RedLightState();
        this.state = redLightState.transitionToRed();
        return this.state;
    }

    @Override
    public String transitionToYellow() {
        YellowLightState yellowLightState = new YellowLightState();
        this.state = yellowLightState.transitionToYellow();
        return this.state;
    }

    @Override
    public String transitionToGreen() {
        GreenLightState greenLightState = new GreenLightState();
        this.state = greenLightState.transitionToGreen();
        return this.state;
    }

    public String getState() {
        return state;
    }
}

class TrafficLightController {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();
        System.out.println(context.getState());

        context.transitionToYellow();
        System.out.println(context.getState());

        context.transitionToGreen();
        System.out.println(context.getState());
    }
}