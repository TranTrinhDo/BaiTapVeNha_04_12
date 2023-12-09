import java.util.Scanner;

/**
 * Mục đích: tính và xuất tổng 2 ký số của n Người tạo: Trần Trịnh Đô Ngày tạo:
 * 05/12/2023
 */
public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final String TEXT_THONG_BAO = "Nhập vào số có 2 ký số : ";
		final String TEXT_THONG_BAO_SAI = "Vui lòng nhập số có hai ký số";
		final String TEXT_KET_QUA = "Tổng của 2 ký số bạn vừa nhập là : ";
		int n;
		int hangChuc;
		int hangDonVi;
		int tongHaiKySo = 0;
		// Code đầu vào
		System.out.println(TEXT_THONG_BAO);
		n = scan.nextInt();

		// Code Xử lý
		if (n > 9 && n < 100) {
			hangChuc = n / 10;
			hangDonVi = n % 10;
			tongHaiKySo = hangChuc + hangDonVi;
		} else {
			System.out.println(TEXT_THONG_BAO_SAI);
		}

		// Code đầu ra
		if (tongHaiKySo != 0) {
			System.out.println(TEXT_KET_QUA + tongHaiKySo);
		}
	}

}
