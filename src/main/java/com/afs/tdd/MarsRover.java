package com.afs.tdd;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
        if(givenCommand == Command.MOVE) {
            if(location.getDirection() == Direction.NORTH){
                location.setY(location.getY() + 1);
            }
            extracted();
        }
    }

    private void extracted() {
        String currentLocation = String.format("The Mars Rover's current location is: (%d, %d, %s)",
                location.getX(), location.getY(), location.getDirection());
        System.out.println(currentLocation);
    }

    public Location getCurrentLocation() {
        return location;
    }
}
