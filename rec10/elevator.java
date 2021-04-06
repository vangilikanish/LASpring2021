package rec10;

public class elevator {
    private int weight;
    private int minFloors;
    private int maxFloors;
    private int floors;
    private int currentFloors 
    

public elevator(int minF, int maxF, int f){
    this.minFloors= minF;
    this.maxFloors = maxFloors;
    this.floors= f;

}

public boolean maxWeight(double w ){
    if (w > weight){
        return false;
    }
    else return true;

}




}

/*
Problem:
Implement an Elevator class.
The elevator has a fixed number of floors, given as a constructor argument.
The Elevator has a maximum capacity (weight), and should keep track of its current floor.
Add methods to: go up or down by one floor, and add or remove a passenger (with passenger's weight as a parameter).
*/
