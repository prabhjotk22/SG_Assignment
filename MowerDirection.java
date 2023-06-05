package com.sg.garden;

import java.util.Scanner;

public class MowerDirection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int xmax, ymax=0; 
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the height or width of the garden - ");
        xmax = scanner.nextInt();
        ymax = xmax; //As garden is square in shape so height and width would be same
        
        System.out.print("Enter the initial X position of the mower: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter the initial Y position of the mower: ");
        int y = scanner.nextInt();
        
        System.out.print("Enter the initial direction of the mower (N, S, E, W): ");
        String direction = scanner.next().toUpperCase();
        
        System.out.print("Enter instructions for the mower (move forward (A), turn left (L), turn right (R)): ");
        String instructions = scanner.next().toUpperCase();
        
        for(int i=0;i<instructions.length();i++){
        	if (instructions.charAt(i) == 'A') {
                switch (direction) {
                    case "N":
                        if (y < ymax) {
                            y++;
                        }
                        break;
                    case "S":
                        if (y > 0) {
                            y--;
                        }
                        break;
                    case "E":
                        if (x < xmax) {
                            x++;
                        }
                        break;
                    case "W":
                        if (x > 0) {
                            x--;
                        }
                        break;
                }
            } else if (instructions.charAt(i) == 'L') {
                switch (direction) {
                case "N":
                    direction = "W";
                    break;
                case "S":
                    direction = "E";
                    break;
                case "E":
                    direction = "N";
                    break;
                case "W":
                    direction = "S";
                    break;
            }
        } else if (instructions.charAt(i) == 'R') {
            switch (direction) {
                case "N":
                    direction = "E";
                    break;
                case "S":
                    direction = "W";
                    break;
                case "E":
                    direction = "S";
                    break;
                case "W":
                    direction = "N";
                    break;
            }
        }
        }
        
        System.out.println("Final position of the mower : (" + x + ", " + y + ")");
        System.out.println("Final direction of the mower : " + direction);

	}

}
