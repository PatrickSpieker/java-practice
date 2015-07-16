//Given the inital velocity of an object and the angle from
//the horizon which it was launched, this program computes:
//-When the object reaches its highest point
//-The peak altitude of the object
//-The time it takes to reach the ground again
//-Total range from launch

import java.util.*; //for scanner

public class Trajectory {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //obtain values
        System.out.println("This program calculates important quantities "
               + "for a objects flight, given its inital velocity and "
               + "the angle of its launch from the horizon.");
        System.out.print("Velocity (meters/second)?   :");
        double velocity = console.nextDouble();
        System.out.print("Angle to horizon (degrees)? :");
        double angle = console.nextDouble();
        



