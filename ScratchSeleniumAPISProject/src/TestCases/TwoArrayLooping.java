package TestCases;

import java.util.ArrayList;

public class TwoArrayLooping {

	public static void main(String[] args) {
		
		
		
		String[] studentNames = { "syed", "abdullah", "shanto", "amina" };

        int[] studentAge = { 20, 21, 22, 23 };

        for (int i = 0; i < studentNames.length; i++) {
            System.out.print(studentNames[i]);
            System.out.println();
            System.out.print(studentAge[i]);
        }
		

	}

}
