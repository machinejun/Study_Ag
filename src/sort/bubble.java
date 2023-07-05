package sort;

public class bubble {
	static int[] array = { 9, 3, 7, 2, 6, 4 };
	
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

		for (int j = 1; j <= array.length; j++) {
			System.out.println();
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
				}
				showArray();
			}
		}

		System.out.println("-------------------------");
		showArray();
		System.out.println("-------------------------");
	}
}
