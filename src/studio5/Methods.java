package studio5;

import edu.princeton.cs.introcs.StdDraw;

public class Methods {

	/**
	 * Compute the (Euclidean) distance between two points.
	 *
	 * @param x1 x-coordinate of a point
	 * @param y1 y-coordinate of a point
	 * @param x2 x-coordinate of another point
	 * @param y2 y-coordinate of another point
	 * @return the Euclidean distance between (x1,y1) and (x2,y2)
	 */
	public static double distanceBetween(double x1, double y1, double x2, double y2) {
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	    return distance;
		// FIXME: Hint use Math methods (e.g. Math.sqrt) to compute the distance
	}

	/**
	 * Draw a bull's eye at the given location with the given radius.
	 *
	 * @param x      the x coordinate of the center of the bull's eye
	 * @param y      the y coordinate of the center of the bull's eye
	 * @param radius the radius of the bull's eye
	 */
	public static void drawBullsEye(double x, double y, double radius) {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x, y, radius);

		// TODO: Draw the remaining rings of the bull's eye
		// Blue ring with 3.0/4.0 the radius
		StdDraw.setPenColor(0, 109, 219);  // RGB color values
	    StdDraw.filledCircle(x, y, (3.0 / 4.0) * radius);
		// suggested rgb values: 0, 109, 219
	    StdDraw.setPenColor(255, 0, 0);  // Red color
	    StdDraw.filledCircle(x, y, (1.0 / 2.0) * radius);
		

		// Red ring with 1.0/2.0 the radius
	    StdDraw.setPenColor(146, 0, 0);  
		// suggested rgb values: 146, 0, 0
	    StdDraw.filledCircle(x, y, (1.0 / 2.0) * radius);

		

		// Yellow ring with 1.0/4.0 the radius
	    StdDraw.setPenColor(255, 255, 109);
		// suggested rgb values: 255, 255, 109
	    StdDraw.filledCircle(x, y, (1.0 / 4.0) * radius);

		
	}

	/**
	 * Return a new String which is the original source String with all occurrences
	 * of the target character substituted by the replacement String.
	 *
	 * @param source      the source String
	 * @param target      the target character to be replaced
	 * @param replacement the replacement String
	 *
	 * @return the String which results from substituting all of the target
	 *         characters in the source String with the replacement String
	 */
	public static String substituteAll(String source, char target, String replacement) {
	    // Create a StringBuilder to efficiently build the result string
	    StringBuilder result = new StringBuilder();

	    // Iterate through each character in the source string
	    for (char c : source.toCharArray()) {
	        // If the character matches the target, append the replacement
	        if (c == target) {
	            result.append(replacement);
	        } else {
	            result.append(c);
	        }
	    }

	    return result.toString();
	}

	/**
	 * Compute the sum of elements in an array
	 *
	 * @param values an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] values) {
	    int sum = 0;

	    // Iterate through the array and add each element to the sum
	    for (int value : values) {
	        sum += value;
	    }

	    return sum;
	}

	/**
	 * Return an array of a given size filled with the provided value
	 *
	 * @param length the length of the returned array
	 * @param value  the value to fill the array with
	 * @return an array of size that's filled with value
	 */
	public static int[] filledArray(int length, int value) {
	    int[] values = new int[length];

	    // Fill the array with the provided value
	    for (int i = 0; i < length; i++) {
	        values[i] = value;
	    }

	    return values;
	}

	/**
	 * Compute the mean (average) of an array of integers.
	 *
	 * @param values an array of integers
	 * @return the mean of the elements in the array
	 */
	public static double arrayMean(int[] values) {
	    // Check for an empty array to avoid division by zero
	    if (values.length == 0) {
	        return 0.0;
	    }

	    int sum = arraySum(values); // Calculate the sum using the arraySum method
	    return (double) sum / values.length; // Compute the mean as a double value
	}
	
}

