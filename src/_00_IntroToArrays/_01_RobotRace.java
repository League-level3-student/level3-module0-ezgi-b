package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	public static void main(String[] args) {
		raceCircle(3);
	}
	//1. make a main method
	
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.
	static Random rand = new Random();
	static void raceStraight(int numbots) {
		Robot[] robots = new Robot[numbots];
		for(int i = 0; i<robots.length; i++) {
			robots[i] = new Robot();
			robots[i].moveTo(60 + (100*i), 850);
			robots[i].setSpeed(10);
		}
		Robot.setWindowSize((30+100*numbots), 900);
		Robot.setWindowColor(150, 120, 250);
		
		boolean winner = false;
		do {
			for(int i = 0; i<robots.length; i++) {
				robots[i].move(rand.nextInt(51)+1);
				if(robots[i].getY()<=0) {
					winner = true;
				}
			}
		}while(winner==false);
		
		for(int i = 0; i<robots.length; i++) {
			if(robots[i].getY()<=0) {
				System.out.println("Robot Number " + i + " is the winner! It gets a party!!!!");
			}
		}
	}
	
	static void raceCircle(int numbots) {
		Robot[] robots = new Robot[numbots];
		int[] degrees = new int[numbots];
		for(int i = 0; i<robots.length; i++) {
			degrees[i] = 0;
			robots[i] = new Robot();
			robots[i].moveTo(100, 450);
			robots[i].setSpeed(10);
			robots[i].miniaturize();
			robots[i].penDown();
		}
		Robot.setWindowSize(900, 880);
		Robot.setWindowColor(150, 120, 250);
		
		boolean winner = false;
		do {
			for(int i = 0; i<robots.length; i++) {
				int r = rand.nextInt(40)+10;
				for(int z = 0; z<r; z++) {
					robots[i].turn(1);
					robots[i].move(5);
					degrees[i]++;
				}
				if(degrees[i]>=360) {
					winner = true;
				}
			}
		}while(winner==false);
		
		for(int i = 0; i<robots.length; i++) {
			if(degrees[i]>=360) {
				System.out.println("Robot Number " + i + " is the winner! It gets a party!!!!");
			}
		}
	}
}
