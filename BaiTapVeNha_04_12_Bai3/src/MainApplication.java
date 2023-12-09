import java.util.Scanner;

/**
 * Mục Đích: Tính giá trị trung bình của 5 số nhập từ bàn phím Người Tạo: Trần
 * Trịnh Đô Ngày tạo: 05/12/2023
 */
public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final String TEXT_NHAP_SO = "Vui lòng nhập số: ";
		final String TEXT_THONG_BAO_1 = "Vui lòng nhập năm số để tính giá trị trung bình";
		final String TEXT_THONG_BAO_2 = "Bạn đã nhập đủ năm số.";
		final String TEXT_KET_QUA = "Giá trị trung bình của 5 chữ số là : ";
		final int SO_LUONG_SO = 5;
		int soThuNhat;
		int soThuHai;
		int soThuBa;
		int soThuTu;
		int soThuNam;
		int tong = 0;
		double giaTriTrungBinh;
		// Code đầu vào
		System.out.println(TEXT_THONG_BAO_1);
		System.out.println(TEXT_NHAP_SO);
		tong += soThuNhat = scan.nextInt();
		System.out.println(TEXT_NHAP_SO);
		tong += soThuHai = scan.nextInt();
		System.out.println(TEXT_NHAP_SO);
		tong += soThuBa = scan.nextInt();
		System.out.println(TEXT_NHAP_SO);
		tong += soThuTu = scan.nextInt();
		System.out.println(TEXT_NHAP_SO);
		tong += soThuNam = scan.nextInt();
		System.out.println(TEXT_THONG_BAO_2);

		// Code xử lý
		giaTriTrungBinh = (double) tong / SO_LUONG_SO;

		// Code đầu ra
		System.out.println(TEXT_KET_QUA + giaTriTrungBinh);
	}

}
