package sort;

/**
 * ��������н�������
 */
public class IntRandom {

	// ����n���������������
	public static int[] random(int n) {
		int[] table = new int[n];
		for (int i = 0; i < n; i++) {
			table[i] = (int) (Math.random() * 100);
		}
		return table;
	}

	public static void main(String[] args) {
		int[] table = random(6);
		System.out.print("�ؼ������У�");
		Array.print(table);
		Array.insertSort(table);
	}
}