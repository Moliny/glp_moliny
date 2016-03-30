package invest;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Compounding {

	/**
	 * @param args
	 */
	static DecimalFormat df=new DecimalFormat("0.0000");
	static Scanner scanner=new Scanner(System.in);
    static int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("|--------------------------------------|");
			System.out.println("|---1、求最终金额 ---|---2、求存款本金 ---|");
			System.out.println("|---3、求存款年份 ---|---4、求存款利息 ---|");
			System.out.println("|---5、求等额投资 ---|---6、求贷款还钱 ---|");
			System.out.println("|--------------------------------------|");
			System.out.print("请输入你的选择：");
			menu();
			System.out.println("");
			System.out.println("");
		}
	}

	public static void menu() {
		// TODO Auto-generated method stub
		try { 
			a = scanner.nextInt();
		switch (a) {
		case 1:
			System.out.println("|-----------------------------------------|");
			System.out.println("1、复利存款。2、单利存款。");
			System.out.print("请输入你选择的存款方式：");
			earnings();
			break;
		case 2:
			count_Deposit();
			break;
		case 3:
			count_year();
			break;
		case 4:
			count_Interest();
			break;
		case 5:
			count_invest();
			break;
		case 6:
			count_Refunt();
			break;
		default:
			System.out.print("请输入正确的数字(1~6):");
			menu();
			break;
		}
		} catch(InputMismatchException e) {
			System.out.print("请输入正确的数字(1~6):");
			a = scanner.nextInt();
			main(null);
		}
	}

    public static void earnings() {
		// TODO Auto-generated method stub
		int a=scanner.nextInt();
		if(a==1){
			System.out.println("|-----------------------------------------|");
			System.out.print("请输入你所存入的本金：");
			double P = deposit();
			System.out.print("请输入你所存的年利率比：");
			double i = interest();
			System.out.print("请输入你所存的年限：");
			int n = year();
			System.out.print("请输入你所存的年复利次数：");
			int k = forty_times();
			double F=compounding(P,i,n,k);
			System.out.println("通过复利存款，你所获得的金额为:" + df.format(F));
			System.out.println("|-----------------------------------------|");
		}
		else if(a==2){
			System.out.println("|-----------------------------------------|");
			System.out.print("请输入你所存入的本金：");
			double P = deposit();
			System.out.print("请输入你所存的周期利息：");
			double i = interest();
			System.out.print("请输入你所存的周期数：");
			int n = year();
			double F=simple_interest(P,i,n);
			System.out.println("通过单利存款，你所获得的金额为：" + df.format(F));
			System.out.println("|-----------------------------------------|");
			
		}
		else{
			System.out.print("请输入正确的值（1、2）：");
			earnings();
		}
	}

	public static double compounding(double P,double i,int n,int k) {
		// TODO Auto-generated method stub
		double F = P * (Math.pow(i / k + 1, k * n));
		return F;
	}

	public static double simple_interest(double P,double i,int n) {
		// TODO Auto-generated method stub
		double F = P * (1 + i * n);
		return F;
	}

	public static void count_Deposit() {
		// TODO Auto-generated method stub
		System.out.println("|-----------------------------------------|");
		System.out.print("请输入你希望获得的最终金额：");
		double F = refunt();
		System.out.print("请输入你所存的年利率比：");
		double i = interest();
		System.out.print("请输入你所存的年限：");
		int n = year();
		System.out.print("请输入你所存的年复利次数：");
		int k = forty_times();
		double P=Deposit(F,i,n,k);
		System.out.println("通过复利存款，你所需要存入的本金为：" + df.format(P));
		System.out.println("|-----------------------------------------|");
	}

	public static double Deposit(double F, double i, int n, int k) {
		// TODO Auto-generated method stub
		double P = F / (Math.pow(i / k + 1, k * n));
		return P;
	}

	public static void count_year() {
		// TODO Auto-generated method stub
		System.out.println("|-----------------------------------------|");
		System.out.print("请输入你所存存入的本金：");
		double P = deposit();
		System.out.print("请输入你希望获得的最终金额：");
		double F = refunt();
		System.out.print("请输入你所存的年利率比：");
		double i = interest();
		System.out.print("请输入你所存的年复利次数：");
		int k = forty_times();
		double n = (Math.log(F / P)) / (Math.log(i / k + 1) / k);
		System.out.println("通过复利存款，你所需要的存款年限为：" + df.format(n));
		System.out.println("|-----------------------------------------|");
	}

	private static void count_Interest() {
		// TODO Auto-generated method stub
		System.out.println("|-----------------------------------------|");
		System.out.print("请输入你所存存入的本金：");
		double P = deposit();
		System.out.print("请输入你希望获得的最终金额：");
		double F = refunt();
		System.out.print("请输入你所存的年限：");
		int n = year();
		System.out.print("请输入你所存的年复利次数：");
		int k = forty_times();
		double b = (double) 1 / (k * n);
		double i = (Math.pow(F / P, b) - 1) * k;
		System.out.println("通过复利存款，你所需要的存款年限为：" + df.format(i));
		System.out.println("|-----------------------------------------|");
	}

	private static void count_invest() {
		// TODO Auto-generated method stub
		System.out.println("|-----------------------------------------|");
		System.out.print("请输入你每次所投入的本金：");
		double P = deposit();
		System.out.print("请输入你所投本金的利息：");
		double i = interest();
		System.out.print("请输入你所存款的年限：");
		int n = year();
		System.out.println("1、年投；2、月投");
		System.out.print("请输入你选择的存款方式：");
		int a = scanner.nextInt();
		double F = invest(P, i, n,a);
		System.out.println("存款" + n + "年，你所获得的金额为：" + df.format(F));
		System.out.println("|-----------------------------------------|");
	}

	public static double invest(double P, double i, int n,int a) {
		// TODO Auto-generated method stub
		double F;
		if (a == 1) {
			F = P * (1 + i) * (Math.pow(1 + i, n) - 1) / i;
			return F;
		} else if (a == 2) {
			F = P * 12 * (1 + i) * (Math.pow(1 + i, n) - 1) / i;
			return F;
		} else {
			System.out.print("请输入正确的值（1、2）：");
			a = scanner.nextInt();
			F=invest(P, i, n, a);
			return F;
		}
		
	}

	private static void count_Refunt() {
		// TODO Auto-generated method stub
		System.out.println("|-----------------------------------------|");
		System.out.print("请输入你所借的金额：");
		double F = refunt();
		System.out.print("请输入你借款的利息（年）：");
		double i = interest();
		System.out.print("请输入你借款的年限：");
		int n = year();
		System.out.println("1、年还；2、月还");
		System.out.print("请输入你选择的还款方式：");
		refunt_selsct(F, i, n);
		System.out.println("|-----------------------------------------|");
	}

	public static void refunt_selsct(double F, double i, int n) {
		double P;
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			P = year_refunt(F, i, n);
			System.out.println("你每年要还的金额为：" + df.format(P));
			break;
		case 2:
			P = month_refunt(F, i, n);
			System.out.println("你每月要还的金额为：" + df.format(P));
			break;
		default:
			System.out.print("请输入正确的值（1、2）：");
			refunt_selsct(F, i, n);
		}
	}

	public static double month_refunt(double F, double i, int n) {
		double P;
		i = i / 12;
		n = n * 12;
		P = year_refunt(F, i, n);
		return P;
	}

	public static double year_refunt(double F, double i, int n) {
		double P;
		P = F * i * (Math.pow(1 + i, n)) / (Math.pow(1 + i, n - 1));
		return P;
	}

	private static double deposit() {
		double P;
		P = scanner.nextDouble();
		while (true) {
			if (P > 0) {
				break;
			} else {
				System.out.print("请输入一个正确的值的值（本金>0）:");
				P = scanner.nextDouble();
			}
		}
		return P;
	}
	
	private static double refunt() {
		double F = scanner.nextDouble();
		while (true) {
			if (F > 0) {
				break;
			} else {
				System.out.print("请输入一个正确的值的值（最终金额>0）:");
				F = scanner.nextDouble();
			}
		}
		return F;
	}
	
	private static int year() {
		int n = scanner.nextInt();
		while (true) {
			if (n > 0) {
				break;
			} else {
				System.out.print("请输入一个正确的值的值（年限>0）:");
				n = scanner.nextInt();
			}
		}
		return n;
	}

	private static double interest() {
		double i = scanner.nextDouble();
		while (true) {
			if (i > 0&&i < 1) {
				break;
			} else {
				System.out.print("请输入一个正确的值（0<利率<1）:");
				i = scanner.nextDouble();
			}
		}
		return i;
	}
	
	public static int forty_times() {
		int k = scanner.nextInt();
		while(true){
			if(k>0){
				break;
			}
			else{
				System.out.print("请输入一个正确的值的值（年复利次数>0）:");
				k = scanner.nextInt();
			}
		}
		return k;
	}

	
}
