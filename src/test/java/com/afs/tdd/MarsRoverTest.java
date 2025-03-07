package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {
    @Test
    void should_change_to_location_0_1_N_when_executeCommand_given_0_0_North_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(1 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_negative_1_S_when_executeCommand_given_0_0_South_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeCommand(Command.MOVE);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(-1 , currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_1_0_E_when_executeCommand_given_0_0_East_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeCommand(Command.MOVE);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(1 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.EAST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_negative_1_0_W_when_executeCommand_given_0_0_West_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeCommand(Command.MOVE);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(-1 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.WEST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_E_when_executeCommand_given_0_0_North_and_command_TurnRight() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeCommand(Command.TURN_RIGHT);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.EAST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_W_when_executeCommand_given_0_0_South_and_command_TurnRight() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeCommand(Command.TURN_RIGHT);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.WEST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_S_when_executeCommand_given_0_0_East_and_command_TurnRight() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeCommand(Command.TURN_RIGHT);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_N_when_executeCommand_given_0_0_West_and_command_TurnRight() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeCommand(Command.TURN_RIGHT);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_S_when_executeCommand_given_0_0_West_and_command_TurnLeft() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeCommand(Command.TURN_LEFT);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_N_when_executeCommand_given_0_0_East_and_command_TurnLeft() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeCommand(Command.TURN_LEFT);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_E_when_executeCommand_given_0_0_South_and_command_TurnLeft() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeCommand(Command.TURN_LEFT);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.EAST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_W_when_executeCommand_given_0_0_North_and_command_TurnLeft() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeCommand(Command.TURN_LEFT);
        // When

        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.WEST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_negative1_1_N_when_executeCommands_given_0_0_North_and_command_series_are_Move_turnLeft_Move_and_turnRight() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        MarsRover marsRover = new MarsRover(initialLocation);
        int numberOfCommands = 1;
        for (int i = 0; i < numberOfCommands ; i++){
            marsRover.executeCommand(Command.MOVE);
            marsRover.executeCommand(Command.TURN_LEFT);
            marsRover.executeCommand(Command.MOVE);
            marsRover.executeCommand(Command.TURN_RIGHT);
        }
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(-1 , currentLocation.getX());
        Assertions.assertEquals( 1 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }


}
