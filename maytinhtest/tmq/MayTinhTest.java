package src.com.maytinhtest.tmq;

import java.util.Scanner;

import com.maytinh.tmq.MayTinhCaNhan;

import src.com.maytinh.tmq.MayTinh;

public class MayTinhTest {
	private static Scanner sc;
	private static int number1;
	private static int number2;

	public static void main(String[] args) {

		String chon;
		int ketqua = 0;
		System.out.println("Chào mừng đến với công cụ máy tính bỏ túi ");
		System.out.println("------------------------------------------");
		sc = new Scanner(System.in);
		extracted();
        //khởi tạo đối tượng
		MayTinhCaNhan maytinh = new MayTinh();
        //Chọn một thao tác
		System.out.println("Thực hiện phép toán tử +,-,*,/,%(Chia lấy phần dư),f(Chia lấy phần thập phân):");
		chon = sc.nextLine();

		switch (chon) {
		case "+":
			ketqua = maytinh.add(number1, number2);
			break;
		case "-":
			ketqua = maytinh.subtract(number1, number2);
			break;
		case "*":
			ketqua = maytinh.multiply(number1, number2);
			break;
		case "/":
			try {
				ketqua = maytinh.division(number1, number2);
				break;
			} catch (ArithmeticException e) {
				System.out.println("Gặp phải lỗi chia cho 0: " + e);
			}
		case "%":

			try {
				ketqua = maytinh.modulo(number1, number2);
				break;
			} catch (ArithmeticException e) { // (2)
				System.out.println("Gặp phải lỗi chia cho 0: " + e);
			}
		case "f":
			try {
				float c = maytinh.divisionDecimal(number1, number2);
				System.out.println("Đáp án chia dư là:" + c);
				break;
			} catch (ArithmeticException e) {
				System.out.println("Gặp phải lỗi chia cho 0:" + e);
			}
			break;
		default: {
			System.out.println("Bạn nhập sai phép tính");

			break;
		}
		}
		//In ra kết quả
		System.out.println("-----------------------------------------------");
		System.out.printf("Đáp án phép tính: %d %s %d = %d", number1, chon, number2, ketqua);

	}

	private static void extracted() {
		try {
			System.out.println("Nhập số A:"); //Nhập vào một số A
			number1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhập số B:"); //Nhập vào một số B
			number2 = sc.nextInt();
			sc.nextLine();
		} catch (Exception e) { //Xử lí ngoại lệ
			System.out.println("A và B phải là số");
			System.exit(0);
		}
	}
}