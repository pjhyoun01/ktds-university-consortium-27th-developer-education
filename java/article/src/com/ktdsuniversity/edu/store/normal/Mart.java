package com.ktdsuniversity.edu.store.normal;

public class Mart {
	public static void main(String[] args) {
		Product[] productArray = {
				new Product("과자", 1_900),
				new Product("소고기", 70_000),
				new Product("돼지고기", 20_000),
				new Product("당근", 3_400),
				new Product("오이", 2_000),
				new Product("냉동만두", 8_300),
		};
		
		Customer cust1 = new Customer(60_000, 0, 150);
		Customer cust2 = new Customer(100_000, 1, 12_000);
		Customer cust3 = new Customer(80_000, 2, 500);
		
		NormalStore normal = new NormalStore(productArray);
		NormalStore conven = new ConvenStore(productArray);
		NormalStore dept = new DepartmentStore(productArray);
		
		normal.printProduct(productArray);

		normal.sell(cust1, 2);
        System.out.println();

        if (conven instanceof ConvenStore cs) {
			cs.sellUsePoint(cust1, 0);
		}
        System.out.println();
        
        if (dept instanceof DepartmentStore dp) {
			dp.sellUsePointDept(cust1, 1, 5_000);
			dp.sellUsePointDept(cust2, 1, 4_000);
			dp.sellUsePointDept(cust3, 1, 0);
			
//			포인트 적용 예
			cust3.setEarnedPoint(cust3.getEarnedPoint() + 15_000);
			dp.sellUsePointDept(cust3, 1, 11_000);
		}
		
	}
}
