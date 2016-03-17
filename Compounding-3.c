#include<stdio.h>
#include<stdlib.h>
#include<math.h>
void Compounding(){
    int n,k;
    double F,P;
    float i;
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存入的本金：");
    scanf("%lf",&P);
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存的年利率比：");
    scanf("%f",&i);
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存的年限：");
    scanf("%d",&n);
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存的复利次数：");
    scanf("%d",&k);
    printf("|-----------------------------------------|\n");
    F=P*pow(i/k+1,k*n);
    printf("\n通过复利存款，你所获得的金额为：%.4lf\n\n",F);
}

void Simple_Interested(){
    int n;
    double F,P;
    float i;
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存入的本金：");
    scanf("%lf",&P);
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存的周期利息：");
    scanf("%f",&i);
    printf("|-----------------------------------------|\n");    
    printf("   请输入你所存的周期数：");
    scanf("%d",&n);
    printf("|-----------------------------------------|\n");
    F=P*(1+i*n);
    printf("\n通过单利存款，你所获得的金额为：%.4lf\n\n",F);
}

void Comparison(){
    printf("\t\t<复利计算器>\n");
    Compounding();
    printf("\t\t<单利计算器>\n");
    Simple_Interested();
}

void Count_Deposit(){
    double F,P;
    float i;
    int n,k,a;
	printf("\n请输入你希望获得的最终金额为：");
	scanf("%lf",&F);
	printf("\n请输入你选的存款方式（1、复利；2、单利）：");
	scanf("%d",&a);
	switch(a)
	{
	case 1:
		printf("\n请输入<<复利>>存款的信息！！！！！\n");
		printf("|-----------------------------------------|\n");
		printf("   请输入<<复利>>你所存的年利率比：");
		scanf("%f",&i);
		printf("|-----------------------------------------|\n");
		printf("   请输入<<复利>>你所存的年限：");
		scanf("%d",&n);
		printf("|-----------------------------------------|\n");
		printf("   请输入<<复利>>你所存的复利次数：");
		scanf("%d",&k);
		printf("|-----------------------------------------|\n");
		P=F/pow(i/k+1,k*n);
		printf("\n通过复利存款，你所需要的存款金额为：%lf\n\n",P);
		break;
	case 2:
		printf("请输入<<单利>>存款的信息！！！！！\n");
		printf("|-----------------------------------------|\n");
		printf("   请输入<<单利>>你所存的周期利息：");
		scanf("%f",&i);
		printf("|-----------------------------------------|\n");    
		printf("   请输入<<单利>>你所存的周期数(年份)：");
		scanf("%d",&n);
		printf("|-----------------------------------------|\n");
		P=F/(1+i*n);
		printf("\n通过单利存款，你所需要的存款金额为：%lf\n\n",P);
		break;
	}
}

void Count_Year(){
	double n,F,P;
    float i;
    int k,a;
	printf("\n请输入你所存的金额为：");
	scanf("%lf",&P);
	printf("\n请输入你希望获得的最终金额为：");
	scanf("%lf",&F);
	printf("\n请输入你选的存款方式（1、复利；2、单利）：");
	scanf("%d",&a);
	switch(a)
	{
	case 1:
		printf("\n请输入<<复利>>存款的信息！！！！！\n");
		printf("|-----------------------------------------|\n");
		printf("   请输入<<复利>>你所存的年利率比：");
		scanf("%f",&i);
		printf("|-----------------------------------------|\n");
		printf("   请输入<<复利>>你所存的复利次数：");
		scanf("%d",&k);
		printf("|-----------------------------------------|\n");
		n=log(F/P)/log(i/k+1)/k;
		printf("\n通过复利存款，你所需要的存款年限为：%lf\n\n",n);
		break;
	case 2:
		printf("请输入<<单利>>存款的信息！！！！！\n");
		printf("|-----------------------------------------|\n");
		printf("   请输入<<单利>>你所存的周期利息：");
		scanf("%f",&i);
		printf("|-----------------------------------------|\n");
		n=(F/P-1)/i;
		printf("\n通过单利存款，你所需要的存款年限为：%lf\n\n",n);
		break;
	}
}

void Count_Interest(){
	double F,P,b,i;
    int k,a,n;
	printf("\n请输入你所存的金额为：");
	scanf("%lf",&P);
	printf("\n请输入你希望获得的最终金额为：");
	scanf("%lf",&F);
	printf("\n请输入你所存款的年限：");
	scanf("%d",&n);
	printf("\n请输入你选的存款方式（1、复利；2、单利）：");
	scanf("%d",&a);
	switch(a)
	{
	case 1:
		printf("\n请输入<<复利>>存款的信息！！！！！\n");
		printf("|-----------------------------------------|\n");
		printf("   请输入<<复利>>你所存的复利次数：");
		scanf("%d",&k);
		printf("|-----------------------------------------|\n");
		b=(double)1/(k*n);
		i=(pow(F/P,b)-1)*k;
		printf("\n通过复利存款，你所需要的存款的利率为：%lf\n\n",i);
		break;
	case 2:
		i=(F/P-1)/n;
		printf("\n通过单利计算，你所需要的存款的利率为：%lf\n\n",i);
		break;
	}
}

void Count_Money(){
	int n,a;
    double F,P;
    float i;
	printf("|-----------------------------------------|\n");
	printf("   请输入你每次所投入的本金：");
	scanf("%lf",&P);
	printf("|-----------------------------------------|\n");
	printf("   请输入你所投本金的利息：");
	scanf("%f",&i);
	printf("|-----------------------------------------|\n");    
	printf("   请输入你所存款的年限：");
	scanf("%d",&n);
	printf("|-----------------------------------------|\n");
	printf("\n请输入你选的存款方式（1、年投；2、月投）：");
	scanf("%d",&a);
	switch(a)
	{
	case 1:
		F=P*(1+i)*(pow(1+i,n)-1)/i;
		break;
	case 2:
		F=P*(1+i/12)*(pow(1+i/12,12*n)-1)/(i/12);	
		break;
	}
	printf("\n存款%d年，你所获得的金额为：%.4lf\n\n",n,F);
}


void main(){
	char t;
    int a;
	printf("|-----------------------------------------|\n");
    printf("|              1、用复利计算              |\n");
	printf("|-----------------------------------------|\n");
    printf("|              2、用单利计算              |\n");
	printf("|-----------------------------------------|\n");
    printf("|      3、输出复利计算、单利计算的结果    |\n");
	printf("|-----------------------------------------|\n");
    printf("|            4、输入终值求存款            |\n");
	printf("|-----------------------------------------|\n");
	printf("|        5、输入终值、存款求所需年份      |\n");
	printf("|-----------------------------------------|\n");
	printf("|       6、输入终值、存款、年份求利率     |\n");
	printf("|-----------------------------------------|\n");
	printf("| 7、输每年（月）投入本金，求几年后的终值 |\n");
	printf("|-----------------------------------------|\n");
loop:
    printf("\n请输入你的选择：");
    scanf("%d",&a);
	switch(a)
	{
	case 1:
		system("cls");
	    t=getchar();
		Compounding();
		break;
	case 2:
		system("cls");
	    t=getchar();
		Simple_Interested();
		break;
	case 3:
		system("cls");
	    t=getchar();
		Comparison();
		break;
	case 4:
		system("cls");
	    t=getchar();
		Count_Deposit();
		break;
	case 5:
		system("cls");
	    t=getchar();
		Count_Year();
		break;
	case 6:
		system("cls");
	    t=getchar();
		Count_Interest();
		break;
	case 7:
		system("cls");
	    t=getchar();
		Count_Money();
		break;
	default:
		printf("输入错误！请重新输入！\n");
		goto loop;
	}     
}
