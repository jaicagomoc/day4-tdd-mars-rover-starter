package com.afs.tdd;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }
    private String getAbbreviationOfDirection(){
        Map<Direction,String> directionAbbreviation = new HashMap<>();
        directionAbbreviation.put(Direction.NORTH,"N");
        directionAbbreviation.put(Direction.SOUTH,"S");
        directionAbbreviation.put(Direction.EAST,"E");
        directionAbbreviation.put(Direction.WEST,"W");

        return directionAbbreviation.get(location.getDirection());
    }

    public void executeCommand(Command givenCommand) {
        if(givenCommand == Command.MOVE) {
            if(location.getDirection() == Direction.NORTH){location.setY(location.getY() + 1);}
            if(location.getDirection() == Direction.SOUTH){location.setY(location.getY() - 1);}
            if(location.getDirection() == Direction.EAST){location.setX(location.getX() + 1);}
//            if(location.getDirection() == Direction.WEST){location.setX(location.getX() - 1);}
            extracted();
        }
    }

    private void extracted() {
        String currentLocation = String.format("The Mars Rover's current location is: (%d,%d,%s)",
                location.getX(), location.getY(), getAbbreviationOfDirection());
        System.out.println(currentLocation);
    }

    public Location getCurrentLocation() {
        return location;
    }
}
