import java.util.Scanner;

/**
 * Mục đích: Đổi độ C sang Độ F 
 * Người tạo: Trần Trịnh Đô 
 * Ngày tạo: 05/12/2023
 */
public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final String THONG_BAO_NHAP = "Vui lòng nhập số độ C bạn muốn quy đổi: ";
		final String THONG_BAO_KET_QUA = "Số độ F bạn quy đổi được là: ";
		double doC;
		double doF;
		// Code đầu vào
		System.out.println(THONG_BAO_NHAP);
		doC = scan.nextDouble();
		// Code đầu ra
		doF = (doC * 1.8) + 32;
		// Code xử lý
		System.out.println(THONG_BAO_KET_QUA + doF);

	}

}
