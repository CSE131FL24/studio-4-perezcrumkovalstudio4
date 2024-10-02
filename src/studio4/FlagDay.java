package studio4;

import java.awt.Color;
import java.util.Scanner;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class FlagDay {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Color Purple = new Color(102, 0, 153);
		StdDraw.clear();
		StdDraw.setPenColor(Purple);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.35);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(0.5, 0.5, 0.325, 0.275);
		
		
		Color BROWN = new Color(139, 69, 19);
		  // Body
        StdDraw.setPenColor(BROWN);
        StdDraw.filledEllipse(0.5, 0.4, 0.2, 0.1); // Body

        // Head
        StdDraw.filledCircle(0.3, 0.5, 0.08); // Head
        
        // Eyes
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledCircle(0.27, 0.52, 0.015); // Left eye
        StdDraw.filledCircle(0.33, 0.52, 0.015); // Right eye
        
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(0.27, 0.52, 0.007); // Left pupil
        StdDraw.filledCircle(0.33, 0.52, 0.007); // Right pupil

        // Ears
        StdDraw.setPenColor(BROWN);
        StdDraw.filledEllipse(0.23, 0.55, 0.03, 0.05); // Left ear
        StdDraw.filledEllipse(0.37, 0.55, 0.03, 0.05); // Right ear
        
        // Nose
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(0.3, 0.48, 0.015); // Nose

        // Tail
        StdDraw.setPenColor(BROWN);
        StdDraw.filledRectangle(0.7, 0.43, 0.1, 0.01); // Tail
        
        // Legs
        StdDraw.setPenColor(BROWN);
        StdDraw.filledRectangle(0.4, 0.3, 0.02, 0.06); // Front left leg
        StdDraw.filledRectangle(0.6, 0.3, 0.02, 0.06); // Front right leg
        
        StdDraw.setPenColor(StdDraw.BLACK);
        Font font =new Font("Times New Roman", Font.BOLD, 22);
        StdDraw.setFont(font);
        StdDraw.text(0.5, 0.675, "In KovalCrumPerez we trust.");
        	
					}
       
			}	
		
	


