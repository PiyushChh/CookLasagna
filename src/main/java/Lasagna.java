public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    private int totalTime=40;
    private int layerTime=2;

    public int expectedMinutesInOven(){
        return totalTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timePassed){
        return totalTime-timePassed;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers*layerTime;
    }


    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int layers,int timePassed){
        return (layers*layerTime)+(timePassed);

    }
}
