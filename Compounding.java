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
			System.out.println("|---1�������ս�� ---|---2������� ---|");
			System.out.println("|---3��������� ---|---4��������Ϣ ---|");
			System.out.println("|---5����ȶ�Ͷ�� ---|---6������Ǯ ---|");
			System.out.println("|--------------------------------------|");
			System.out.print("���������ѡ��");
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
			System.out.println("1��������2��������");
			System.out.print("��������ѡ��Ĵ�ʽ��");
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
			System.out.print("��������ȷ������(1~6):");
			menu();
			break;
		}
		} catch(InputMismatchException e) {
			System.out.print("��������ȷ������(1~6):");
			a = scanner.nextInt();
			main(null);
		}
	}

    public static void earnings() {
		// TODO Auto-generated method stub
		int a=scanner.nextInt();
		if(a==1){
			System.out.println("|-----------------------------------------|");
			System.out.print("��������������ı���");
			double P = deposit();
			System.out.print("������������������ʱȣ�");
			double i = interest();
			System.out.print("����������������ޣ�");
			int n = year();
			System.out.print("��������������긴��������");
			int k = forty_times();
			double F=compounding(P,i,n,k);
			System.out.println("ͨ��������������õĽ��Ϊ:" + df.format(F));
			System.out.println("|-----------------------------------------|");
		}
		else if(a==2){
			System.out.println("|-----------------------------------------|");
			System.out.print("��������������ı���");
			double P = deposit();
			System.out.print("�������������������Ϣ��");
			double i = interest();
			System.out.print("���������������������");
			int n = year();
			double F=simple_interest(P,i,n);
			System.out.println("ͨ��������������õĽ��Ϊ��" + df.format(F));
			System.out.println("|-----------------------------------------|");
			
		}
		else{
			System.out.print("��������ȷ��ֵ��1��2����");
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
		System.out.print("��������ϣ����õ����ս�");
		double F = refunt();
		System.out.print("������������������ʱȣ�");
		double i = interest();
		System.out.print("����������������ޣ�");
		int n = year();
		System.out.print("��������������긴��������");
		int k = forty_times();
		double P=Deposit(F,i,n,k);
		System.out.println("ͨ��������������Ҫ����ı���Ϊ��" + df.format(P));
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
		System.out.print("���������������ı���");
		double P = deposit();
		System.out.print("��������ϣ����õ����ս�");
		double F = refunt();
		System.out.print("������������������ʱȣ�");
		double i = interest();
		System.out.print("��������������긴��������");
		int k = forty_times();
		double n = (Math.log(F / P)) / (Math.log(i / k + 1) / k);
		System.out.println("ͨ��������������Ҫ�Ĵ������Ϊ��" + df.format(n));
		System.out.println("|-----------------------------------------|");
	}

	private static void count_Interest() {
		// TODO Auto-generated method stub
		System.out.println("|-----------------------------------------|");
		System.out.print("���������������ı���");
		double P = deposit();
		System.out.print("��������ϣ����õ����ս�");
		double F = refunt();
		System.out.print("����������������ޣ�");
		int n = year();
		System.out.print("��������������긴��������");
		int k = forty_times();
		double b = (double) 1 / (k * n);
		double i = (Math.pow(F / P, b) - 1) * k;
		System.out.println("ͨ��������������Ҫ�Ĵ������Ϊ��" + df.format(i));
		System.out.println("|-----------------------------------------|");
	}

	private static void count_invest() {
		// TODO Auto-generated method stub
		System.out.println("|-----------------------------------------|");
		System.out.print("��������ÿ����Ͷ��ı���");
		double P = deposit();
		System.out.print("����������Ͷ�������Ϣ��");
		double i = interest();
		System.out.print("�����������������ޣ�");
		int n = year();
		System.out.println("1����Ͷ��2����Ͷ");
		System.out.print("��������ѡ��Ĵ�ʽ��");
		int a = scanner.nextInt();
		double F = invest(P, i, n,a);
		System.out.println("���" + n + "�꣬������õĽ��Ϊ��" + df.format(F));
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
			System.out.print("��������ȷ��ֵ��1��2����");
			a = scanner.nextInt();
			F=invest(P, i, n, a);
			return F;
		}
		
	}

	private static void count_Refunt() {
		// TODO Auto-generated method stub
		System.out.println("|-----------------------------------------|");
		System.out.print("������������Ľ�");
		double F = refunt();
		System.out.print("�������������Ϣ���꣩��");
		double i = interest();
		System.out.print("��������������ޣ�");
		int n = year();
		System.out.println("1���껹��2���»�");
		System.out.print("��������ѡ��Ļ��ʽ��");
		refunt_selsct(F, i, n);
		System.out.println("|-----------------------------------------|");
	}

	public static void refunt_selsct(double F, double i, int n) {
		double P;
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			P = year_refunt(F, i, n);
			System.out.println("��ÿ��Ҫ���Ľ��Ϊ��" + df.format(P));
			break;
		case 2:
			P = month_refunt(F, i, n);
			System.out.println("��ÿ��Ҫ���Ľ��Ϊ��" + df.format(P));
			break;
		default:
			System.out.print("��������ȷ��ֵ��1��2����");
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
				System.out.print("������һ����ȷ��ֵ��ֵ������>0��:");
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
				System.out.print("������һ����ȷ��ֵ��ֵ�����ս��>0��:");
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
				System.out.print("������һ����ȷ��ֵ��ֵ������>0��:");
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
				System.out.print("������һ����ȷ��ֵ��0<����<1��:");
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
				System.out.print("������һ����ȷ��ֵ��ֵ���긴������>0��:");
				k = scanner.nextInt();
			}
		}
		return k;
	}

	
}
