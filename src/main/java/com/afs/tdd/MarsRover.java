package com.afs.tdd;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {

    private final Location location;

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
            moveOneSpace();
        }
        else if(givenCommand == Command.TURN_RIGHT) {
            turnRight();
        }
        else if(givenCommand == Command.TURN_LEFT) {
            turnLeft();
        }
    }
    private void moveOneSpace() {
        if(location.getDirection() == Direction.NORTH){location.setY(location.getY() + 1);}
        else if(location.getDirection() == Direction.SOUTH){location.setY(location.getY() - 1);}
        else if(location.getDirection() == Direction.EAST){location.setX(location.getX() + 1);}
        else if(location.getDirection() == Direction.WEST){location.setX(location.getX() - 1);}
        extracted();
    }

    private void turnRight() {
        if(location.getDirection() == Direction.NORTH){location.setDirection(Direction.EAST);}
        else if(location.getDirection() == Direction.SOUTH){location.setDirection(Direction.WEST);}
        else if(location.getDirection() == Direction.EAST){location.setDirection(Direction.SOUTH);}
        else if(location.getDirection() == Direction.WEST){location.setDirection(Direction.NORTH);}
        extracted();
    }

    private void turnLeft() {
        if(location.getDirection() == Direction.NORTH){location.setDirection(Direction.WEST);}
        else if(location.getDirection() == Direction.SOUTH){location.setDirection(Direction.EAST);}
        else if(location.getDirection() == Direction.EAST){location.setDirection(Direction.NORTH);}
        else if(location.getDirection() == Direction.WEST){location.setDirection(Direction.SOUTH);}
        extracted();
    }

    private void extracted(){
         String currentLocation = String.format("The Mars Rover's current location is: (%d,%d,%s)",
                location.getX(), location.getY(), getAbbreviationOfDirection());
         System.out.println(currentLocation);
    }

    public Location getCurrentLocation() {
        return location;
    }
}


