package src.com.maytinh.tmq;

import java.util.Scanner;

public class MayTinh {

	private static Scanner sc;

	public static void main(String[] args) {
		// Khởi tạo biến
		int number1 = 0;
		int number2 = 0;
		String chon;
		int ketqua = 0;
		// TODO Auto-generated method stub
		System.out.println("Chào mừng đến với công cụ máy tính bỏ túi ");
		System.out.println("------------------------------------------");
		sc = new Scanner(System.in);
		try {
			// Nhập vào 1 số A
			System.out.println("Nhập số A:");
			number1 = sc.nextInt();
			sc.nextLine();
			// Nhập vào 1 số B
			System.out.println("Nhập số B:");
			number2 = sc.nextInt();
			sc.nextLine();
			// Xứ lí ngoại lệ A và B không phải là số
		} catch (Exception e) {
			System.out.println("A và B phải là số");
			System.exit(0);
		}
		// Khởi tạo đối tượng
		MayTinhCaNhan maytinh = new MayTinhCaNhan();
		System.out.println("Thực hiện phép toán tử +,-,*,/,%(Chia lấy phần dư),f(Chia lấy phần thập phân):");
		System.out.println("Lựa chọn phép tính bạn muốn thực hiện:");
		chon = sc.nextLine(); // Chọn một phép toán
		switch (chon) {
		case "+": // Chọn phép cộng
			ketqua = maytinh.add(number1, number2); //Xử lí kết quả hàm cộng 2 số
			break;
		case "-": // Chọn phép trừ
			ketqua = maytinh.subtract(number1, number2); //Xử lí kết quả hàm trừ 2 số
			break;
		case "*":
			ketqua = maytinh.multiply(number1, number2); //Xử lí kết quả nhân cộng 2 số
			break;
		case "/": // Chọn phép chia
			if (number2 == 0) {
				System.out.println("Không thể nhập mẫu bằng 0"); //Xử lí kết quả hàm chia 2 số

			} else { 
				ketqua = maytinh.division(number1, number2); //Xử lí kết quả chia cộng 2 số
			}
			break;
		case "%": // Chọn phép chia lấy dư
			if (number2 == 0) {
				System.out.println("Không thể nhập mẫu bằng 0"); 
				System.exit(0);
			} else {
				ketqua = maytinh.modulo(number1, number2); //Xử lí kết quả hàm chia 2 số lấy dư
			}
			break;
		case "f": // Chọn phép chia dư lấy số thập phân
			if (number2 == 0) {
				System.out.println("Không thể nhập mẫu bằng 0"); 
				System.exit(0);
			} else {

				float c = maytinh.divisionDecimal(number1, number2); //Xử lí kết quả hàm chia 2 số lấy số thập phân
				System.out.println("Đáp án chia dư là:" + c);
				System.exit(0);
			}
			break;

		default: {
			System.out.println("Bạn nhập sai phép tính"); //nhập phép tính sai sẽ hiện thông báo.

			break;
		}
		}

		System.out.println("-----------------------------------------------");
		// In ra kết quả phép tính.
		System.out.printf("Đáp án phép tính: %d %s %d = %d", number1, chon, number2, ketqua);

	}

}
