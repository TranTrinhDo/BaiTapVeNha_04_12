import java.util.Scanner;

/**Mục đích: Quy đổi tiền $ sang VNĐ
 * Người Tạo:Trần Trịnh ĐÔ
 * Ngày tạo: 05/12/2023
 */
public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final int TI_GIA = 23500;
		final String TEXT_THONG_BAO = "Vui lòng nhập số USD cần quy đổi: ";
		final String TEXT_KET_QUA = "Số Việt Nam Đồng sau khi quy đổi là : ";
		float doLa;
		int vietNamDong;
		//Code đầu vào
		System.out.println(TEXT_THONG_BAO);
		doLa = scan.nextFloat();
		//Code xử lý
		vietNamDong = (int) (doLa * TI_GIA);
		
		//Code đầu ra
		System.out.println(TEXT_KET_QUA + vietNamDong);
	}

}
