package rec10;

/*
Problem:
Implement an Elevator class.
The elevator has a fixed number of floors, given as a constructor argument.
The Elevator has a maximum capacity (weight), and should keep track of its current floor.
Add methods to: go up or down by one floor, and add or remove a passenger (with passenger's weight as a parameter).
*/


public class elevator
{
    private int numberoffloors;
    private int maxWeight;
    private int currentFloor;
    private int weight;

    public elevator ( int numberoffloors,int maxWeight)
    {
        this.numberoffloors = numberoffloors;
        this.maxWeight = maxWeight;
        this.currentFloor = 1;
        this.weight = 0;
    }

    public boolean Up()
    {
        if (currentFloor + 1 > numberoffloors)
        {
            System.out.println("You are already at the top floor");
            return false;
        }
        else
        {
            this.currentFloor += 1;
            return true;
        }
    }

    public boolean Down ()
    {
        if (currentFloor - 1 < 1)
        {
            System.out.println("You are already at the bottom floor");
            return false;
        }
        else
        {
            this.currentFloor -= 1;
            return true;
        }
    }

    public boolean addPerson (int personweight)
    {
        if(personweight <= 0)
        {
            System.out.println("weight must be pos");
            return false;
        }
        if (weight + personweight > maxWeight)
        {
            System.out.println("Person too fat");
            return false;
        }
        else
        {
            weight += personweight;
            return true;
        }
        
    }

    public boolean removePerson (int personweight)
    {
        if (personweight <= 0)
        {
            System.out.println("weight must be pos");
            return false;
        }
        if (weight - personweight < 0)
        {
            System.out.println("Elevator is already empty");
            return false;
        }
        else
        {
            weight -= personweight;
            return true;
        }
    }

    public int getCurrentWeight()
    {
        return weight;
    }

    public int getCurrentFloor()
    {
        return currentFloor;
    }
}
