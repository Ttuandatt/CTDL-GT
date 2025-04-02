/* Bài 1. Viết phương trình nhập vào số nguyên n
	 * 1. Viết phương thức để trả về 1 mảng số thực gồm n phần tử
	 * 2. Viết phương thức gán giá trị x cho phần từ cuối cùng
	 * 3. Viết phương thức trả về tổng của 2 phần tử đầu tiên
	 * 4. Viết phương thức sử dụng vòng lặp tính toán tổng của tất cả các phần tử trong mảng
	 * 5. Viết phương thức dùng vòng lặp để tìm giá trị nhỏ nhất trong mảng
	 * 6. Tự động tạo ra một số ngẫu nhiên index < n và hiển thị giá trị của phần tử tại ví trí index
	 * 7. Dùng array initializer để tạo ra một mảng với giá trị khởi tạo là 3.5, 5.5, 4.52 và 5.6
*/

package vidu;

import java.util.Random;
import java.util.Scanner;

public class BaiTapVeMang {
	//Khai báo mảng
	float [] arr;
	
	// Số lượng phần tử
	int n;
	
	
	public BaiTapVeMang() {
		System.out.print("Nhập số lượng phần tử của mảng: ");
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		
		arr = taoMangSoThuc(n);
		inMang();
	}
	
	public void inMang() {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	// 1. Viết phương thức để trả về 1 mảng số thực gồm n phần tử
	public float[] taoMangSoThuc(int n) {
		float[] tempArr = new float[n];
		Random r = new Random();
		
		for(int i=0; i<n; i++) {
			tempArr[i] = r.nextFloat();
		}
		
		return tempArr;
	}
	
	// 2. Viết phương thức gán giá trị x cho phần từ cuối cùng
	public void themPhanTuXVaoCuoiMang(float x) {
		// arr: |1|3|4|2|5|6|
		
		
		// Vì thêm 1 phần tử nên số lượng phần tử phải +1
		n = arr.length+1;
		
		// Tạo 1 mảng tạm mới
		float[] tempArr = new float[n];
		
		// Copy giá trị phần tử từ mảng arr sang tempArr
		// tempArr: |1|3|4|2|5|6| |
		for(int i=0; i<arr.length; i++) {	//arr.length chứ k phải n vì giả sử ban đầu độ dài mảng arr nó chỉ có 5 phần tử, mà bây giờ ta muốn thêm 1 phần tử vào cuối mảng tức là n tăng thêm 1 phần tử tức là n=n+1 tức là sẽ có 6 phần từ mà mình dùng n thì ở i cuối cùng(i=5) thì mảng arr không hề có i=5 vì vậy giá trị tại i=5 của tempArr sẽ là rỗng
			tempArr[i] = arr[i];
		} 
		
		//Thêm x vào cuối mảng
		// tempArr: |1|3|4|2|5|6|x|
		tempArr[n-1] = x;
		
		//Gán lại cho mảng ban đầu
		arr = tempArr;
		
	}
	
	
	// 3. Viết phương thức trả về tổng của 2 phần tử đầu tiên
	public void tongHaiPhanTuDauTien() {
		//Cách 1:
		float sum=0;
		if(arr.length>0 && arr.length<2) {
			System.out.print("Mảng chỉ có 1 phần tử nê giá trị của sum=" + arr[0]);
		}else if(arr.length>=2) {
			sum = arr[0] + arr[1];
			System.out.print("Tổng của 2 phần tử đầu tiên: " + sum);
		}
		
		
//		//Cách 2:
//		if(arr.length>0) {
//			sum+=arr[0];
//		}
//		if(arr.length>1) {
//			sum+=arr[1];
//		}
//		
//		//Cách 3
//		for(int i=0; i<=1 && i<arr.length; i++) {	//đảm bảo i chạy từ 0 -> 1
//			sum+=arr[i];
//		}
	}
	
	// 4. Viết phương thức sử dụng vòng lặp tính toán tổng của tất cả các phần tử trong mảng
	public float tinhTongMang() {
		float sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		return sum;
	}
	
	
	// 5. Viết phương thức dùng vòng lặp để tìm giá trị nhỏ nhất trong mảng
	public float timMin() {
		float min= Long.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}
	
	// 6. Tự động tạo ra một số ngẫu nhiên index < n và hiển thị giá trị của phần tử tại ví trí index
	public void taoSoNgauNhien() {
		Random r = new Random();
		int index = r.nextInt(arr.length);	//tạo index ngẫu nhiên từ 0 đến < arr.length
		System.out.print("arr[" + index + "] = " + arr[index]);
	}
	
	public static void main(String[] args) {
		//1.
		BaiTapVeMang btvm = new BaiTapVeMang();
		
		//2.
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhập giá trị x: ");
		float x = Float.parseFloat(sc.nextLine());
		sc.close();
		btvm.themPhanTuXVaoCuoiMang(x);
		btvm.inMang();
		
		//3.
		btvm.tongHaiPhanTuDauTien();
		
		//4.
		System.out.print("\nTổng của mảng: " + btvm.tinhTongMang());
		
		//5.
		System.out.print("\nGTNN của mảng: " + btvm.timMin());

		//6.
		btvm.taoSoNgauNhien();
		
		//7.
		float[] arr2 = {3.5f, 5.5f, 4.52f,5.6f};
	}
}
