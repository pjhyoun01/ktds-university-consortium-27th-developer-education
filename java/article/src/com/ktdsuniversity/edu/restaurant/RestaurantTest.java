package com.ktdsuniversity.edu.restaurant;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.restaurant.exceptions.DeficientAmountException;
import com.ktdsuniversity.edu.restaurant.exceptions.DeficientStockException;
import com.ktdsuniversity.edu.restaurant.exceptions.DrunkenException;
import com.ktdsuniversity.edu.restaurant.exceptions.FullException;
import com.ktdsuniversity.edu.restaurant.exceptions.WrongOrderQuantityException;

public class RestaurantTest {
    public static void main(String[] args) {
        
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu("스테이크", 90, 30_000));
        menuList.add(new Menu("파스타", 110, 15_000));
        menuList.add(new Menu("진로", 180, 16, 4_000));
        menuList.add(new Menu("처음처럼", 180, 17, 4_000));
        menuList.add(new Menu("발렌타인", 300, 37, 20_000));
        menuList.add(new Menu("위스키", 300, 42, 20_000));
        menuList.add(new Menu("사케", 300, 13, 13_000));
        menuList.add(new Menu("밤막걸리", 500, 7, 8_000));
        menuList.add(new Menu("땅콩막걸리", 500, 8, 8_000));
        
        Restaurant rest = new Restaurant(400, 0.08, menuList);
        Customer cust = new Customer(75, 160_000, true);
//        Customer cust2 = new Customer(75, 200_000, true);

        rest.printMenuAndDrink();

        try {
        	cust.order(cust, rest, menuList.get(0), 2);
		} catch (DeficientAmountException dae) {
			System.out.println(dae.getMessage());
		} catch (DeficientStockException dse) {
			System.out.println(dse.getMessage());
		} catch (DrunkenException de) {
			System.out.println(de.getMessage());
		} catch (FullException fe) {
			System.out.println(fe.getMessage());
		} catch (WrongOrderQuantityException woqe) {
			System.out.println(woqe.getMessage());
		}
        
        try {
        	cust.order(cust, rest, menuList.get(0), 2);
        } catch (DeficientAmountException dae) {
        	System.out.println(dae.getMessage());
        } catch (DeficientStockException dse) {
        	System.out.println(dse.getMessage());
        } catch (DrunkenException de) {
        	System.out.println(de.getMessage());
        } catch (FullException fe) {
        	System.out.println(fe.getMessage());
        } catch (WrongOrderQuantityException woqe) {
        	System.out.println(woqe.getMessage());
        }
        
        try {
        	cust.order(cust, rest, menuList.get(0), 2);
        } catch (DeficientAmountException dae) {
        	System.out.println(dae.getMessage());
        } catch (DeficientStockException dse) {
        	System.out.println(dse.getMessage());
        } catch (DrunkenException de) {
        	System.out.println(de.getMessage());
        } catch (FullException fe) {
        	System.out.println(fe.getMessage());
        } catch (WrongOrderQuantityException woqe) {
        	System.out.println(woqe.getMessage());
        }
        
        try {
        	cust.order(cust, rest, menuList.get(1), 2);
        } catch (DeficientAmountException dae) {
        	System.out.println(dae.getMessage());
        } catch (DeficientStockException dse) {
        	System.out.println(dse.getMessage());
        } catch (DrunkenException de) {
        	System.out.println(de.getMessage());
        } catch (FullException fe) {
        	System.out.println(fe.getMessage());
        } catch (WrongOrderQuantityException woqe) {
        	System.out.println(woqe.getMessage());
        }
        
        try {
        	cust.order(cust, rest, menuList.get(0), 4);
        } catch (DeficientAmountException dae) {
        	System.out.println(dae.getMessage());
        } catch (DeficientStockException dse) {
        	System.out.println(dse.getMessage());
        } catch (DrunkenException de) {
        	System.out.println(de.getMessage());
        } catch (FullException fe) {
        	System.out.println(fe.getMessage());
        } catch (WrongOrderQuantityException woqe) {
        	System.out.println(woqe.getMessage());
        }
        
        try {
        	cust.order(cust, rest, menuList.get(4), 1);
        } catch (DeficientAmountException dae) {
        	System.out.println(dae.getMessage());
        } catch (DeficientStockException dse) {
        	System.out.println(dse.getMessage());
        } catch (DrunkenException de) {
        	System.out.println(de.getMessage());
        } catch (FullException fe) {
        	System.out.println(fe.getMessage());
        } catch (WrongOrderQuantityException woqe) {
        	System.out.println(woqe.getMessage());
        }
        
        try {
        	cust.order(cust, rest, menuList.get(8), 3);
        } catch (DeficientAmountException dae) {
        	System.out.println(dae.getMessage());
        } catch (DeficientStockException dse) {
        	System.out.println(dse.getMessage());
        } catch (DrunkenException de) {
        	System.out.println(de.getMessage());
        } catch (FullException fe) {
        	System.out.println(fe.getMessage());
        } catch (WrongOrderQuantityException woqe) {
        	System.out.println(woqe.getMessage());
        }

        cust.printStatus();
    }
}