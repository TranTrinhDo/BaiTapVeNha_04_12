import java.util.Scanner;

/**
 * Mục Đích: tính giá trị đơn thức P(x) = ax^n với x8 cho trước. Người tạo: Trần
 * Trịnh Đô Ngày tạo: 05/12/2023
 */
public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final String TEXT_NHAP_A = "Nhập giá trị của a: ";
		final String TEXT_NHAP_N = "Nhập giá trị của n: ";
		final String TEXT_KET_QUA = "Giá trị của đơn thức P(x) = ";
		double a;
		int n;
		double x = 8;
		double giaTriDonThuc;
		// Code Đầu vào
		System.out.println(TEXT_NHAP_A);
		a = scan.nextDouble();

		System.out.println(TEXT_NHAP_N);
		n = scan.nextInt();

		// Code xử lý
		giaTriDonThuc = a * Math.pow(x, n);
		// Code Đầu ra
		System.out.println(TEXT_KET_QUA + giaTriDonThuc);

	}

}
