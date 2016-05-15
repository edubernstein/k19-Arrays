public class Media {
	
	public static void main(String[] args) {
		double media = 0.0;
		for (String arg : args) {
			media += Double.parseDouble(arg);
		}
		media /= args.length;
		System.out.println(media);
	}
	
}
