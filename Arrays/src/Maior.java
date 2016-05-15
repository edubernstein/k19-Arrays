public class Maior {
	
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		for (String arg : args) {
			if (max < Integer.parseInt(arg)) {
				max = Integer.parseInt(arg);
			}
		}
		System.out.println(max);
		int[] aux = { 1, 2, 3, 4, 5 };
		for (int i : aux) {
			i = 0;
			System.out.println(i);
		}
		for (int i : aux) {
			System.out.println(i);
		}
	}
}
