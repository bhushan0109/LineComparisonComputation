public class LineComparisonComputation {
	public static void main(String arg[]) {
		int x1, x2, y1, y2;
		double line1_length;
		x1 = 4;
		y1 = 5;
		x2 = 5;
		y2 = 6;
		line1_length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Welcome To Line Comparison Computation");
		System.out.println("line1 length:" + line1_length);
	}
}

