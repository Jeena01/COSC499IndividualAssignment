
public class MaxFinder {
	public static void main(String[] args) {
		
	}
	
	static int findMaxElem(int[] ar) {
		int max=ar[0];
		for(int item:ar)
			max=Math.max(item, max);
	
	return max;
	}
	static String findMaxElem(String[] ar) {
		String s1=ar[0];
		for(String item:ar) {
			if(s1.compareTo(item)<0)
				s1=item;
		}
		return s1;
	}

}
