package test;

public class divided {
	static int[] arr = {1, 5, 7, 2, 4, 8, 3, 9};
	static int[] temp = new int[arr.length];
	static int index1 = 0;
	static int index2 = 0;
	
	public static void showArr(int[] arr) {
		System.out.print("[");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void main(String[] args) {
		mergeSort(arr, 0, arr.length-1);
		showArr(arr);
	}
	
	static void mergeSort(int[] list, int left, int right){
		int mid;

		  if(left<right){
			  
		    mid = (left+right)/2; // 중간 위치를 계산하여 리스트를 균등 분할 -분할(Divide)
		    mergeSort(list, left, mid); // 앞쪽 부분 리스트 정렬 -정복(Conquer)
		    mergeSort(list, mid+1, right); // 뒤쪽 부분 리스트 정렬 -정복(Conquer)
		    merge(list, left, mid, right); // 정렬된 2개의 부분 배열을 합병하는 과정 -결합(Combine)
		  }
		}

	
	static void merge(int list[], int left, int mid, int right){
		int i, j, k, l;
		  i = left;
		  j = mid+1;
		  k = left;

		  /* 분할 정렬된 list의 합병 */
		  while(i<=mid && j<=right){
		    if(list[i]<=list[j])
		      temp[k++] = list[i++];
		    else
		     temp[k++] = list[j++];
		  }
		  showArr(temp);
		  
		  // 남아 있는 값들을 일괄 복사
		  if(i>mid){
		    for(l=j; l<=right; l++)
		    	temp[k++] = list[l];
		  } else{ // 남아 있는 값들을 일괄 복사
		    for(l=i; l<=mid; l++)
		    	temp[k++] = list[l];
		  }
		  showArr(temp);
		  
		  // 배열 sorted[](임시 배열)의 리스트를 배열 list[]로 재복사
		  for(l=left; l<=right; l++){
		    list[l] = temp[l];
		  }
		  showArr(list);
		}

}
