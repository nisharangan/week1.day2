package assignments;

public class PrintDuplicatesInAnArray {
	public static void main(String[] args) {

		int[] arrName = { 14, 12, 13, 14, 15, 18, 18, 13, 20 };
		int[] arrNew = new int[arrName.length];
		int count = 0;
		int i, j = 0;
		for (i = 0; i < arrName.length; i++) {

			for (j = i + 1; j < arrName.length; j++) {

				if (arrName[i] == arrName[j]) {
					arrNew[count] = arrName[i];
					count = count + 1;

				}

			}

		}
		for (int k = 0; k < arrNew.length; k++) {
			if ((arrNew[k] > 1) && (arrNew[k] != 0)) {

				System.out.println(arrNew[k]);
			}

		}
	}

}
