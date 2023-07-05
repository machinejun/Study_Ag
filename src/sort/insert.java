package sort;

public class insert {
	static int[] array = { 9, 3,6,2,5, 1};
	
	private static void showArray() {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if(i == array.length-1) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i] + ",");				
			}
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		
		int temp;
		// 9
		for (int i = 0; i < array.length-1; i++) {
			temp = array[i+1];
			System.out.println();
			for (int j = i+1; j > 0; j--) {
				if(array[j-1] > temp) {
					array[j] = array[j-1];
					array[j-1] =temp;
				}
				showArray();
			}
		}
		System.out.println("-------------------------");
		showArray();
		System.out.println("-------------------------");
	}

}
