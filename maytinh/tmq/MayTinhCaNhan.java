package src.com.maytinh.tmq;

public class MayTinhCaNhan {
	private float fketqua;
	private int ketqua;

	public int add(int a, int b) {
		return ketqua = a + b; // Phép cộng 2 số nguyên
	}

	public int subtract(int a, int b) {
		return ketqua = a - b; // Phép trừ 2 số nguyên
	}

	public int multiply(int a, int b) {
		return ketqua = a * b; // Phép nhân 2 số nguyên
	}

	public int division(int a, int b) {
		return ketqua = a / b; // Phép chia 2 số nguyên
	}

	public int modulo(int a, int b) {
		return ketqua = a % b; // Phép chia lấy phần dư
	}

	public float divisionDecimal(int a, int b) {
		return fketqua = (float) a / b; // Phép chia lấy số thập phân
	}

}
