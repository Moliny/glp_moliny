#include<stdio.h>
#include<stdlib.h>
#include<math.h>
void Compounding(){
    int n,k;
    double F,P;
    float i;
    printf("|-----------------------------------------|\n");
    printf("   ��������������ı���");
    scanf("%lf",&P);
    printf("|-----------------------------------------|\n");
    printf("   ������������������ʱȣ�");
    scanf("%f",&i);
    printf("|-----------------------------------------|\n");
    printf("   ����������������ޣ�");
    scanf("%d",&n);
    printf("|-----------------------------------------|\n");
    printf("   ������������ĸ���������");
    scanf("%d",&k);
    printf("|-----------------------------------------|\n");
    F=P*pow(i/k+1,k*n);
    printf("\nͨ��������������õĽ��Ϊ��%.4lf\n\n",F);
}

void Simple_Interested(){
    int n;
    double F,P;
    float i;
    printf("|-----------------------------------------|\n");
    printf("   ��������������ı���");
    scanf("%lf",&P);
    printf("|-----------------------------------------|\n");
    printf("   �������������������Ϣ��");
    scanf("%f",&i);
    printf("|-----------------------------------------|\n");    
    printf("   ���������������������");
    scanf("%d",&n);
    printf("|-----------------------------------------|\n");
    F=P*(1+i*n);
    printf("\nͨ��������������õĽ��Ϊ��%.4lf\n\n",F);
}

void Comparison(){
    printf("\t\t<����������>\n");
    Compounding();
    printf("\t\t<����������>\n");
    Simple_Interested();
}

void Count_Deposit(){
    double F,P;
    float i;
    int n,k,a;
    printf("\n��������ϣ����õ����ս��Ϊ��");
    scanf("%lf",&F);
    printf("\n��������ѡ�Ĵ�ʽ��1��������2����������");
    scanf("%d",&a);
    switch(a)
    {
    case 1:
        printf("\n������<<����>>������Ϣ����������\n");
        printf("|-----------------------------------------|\n");
        printf("   ������<<����>>������������ʱȣ�");
        scanf("%f",&i);
        printf("|-----------------------------------------|\n");
        printf("   ������<<����>>����������ޣ�");
        scanf("%d",&n);
        printf("|-----------------------------------------|\n");
        printf("   ������<<����>>������ĸ���������");
        scanf("%d",&k);
        printf("|-----------------------------------------|\n");
        P=F/pow(i/k+1,k*n);
        printf("\nͨ��������������Ҫ�Ĵ����Ϊ��%lf\n\n",P);
        break;
    case 2:
        printf("������<<����>>������Ϣ����������\n");
        printf("|-----------------------------------------|\n");
        printf("   ������<<����>>�������������Ϣ��");
        scanf("%f",&i);
        printf("|-----------------------------------------|\n");    
        printf("   ������<<����>>�������������(���)��");
        scanf("%d",&n);
        printf("|-----------------------------------------|\n");
        P=F/(1+i*n);
        printf("\nͨ��������������Ҫ�Ĵ����Ϊ��%lf\n\n",P);
        break;
    }
}

void Count_Year(){
    double n,F,P;
    float i;
    int k,a;
    printf("\n������������Ľ��Ϊ��");
    scanf("%lf",&P);
    printf("\n��������ϣ����õ����ս��Ϊ��");
    scanf("%lf",&F);
    printf("\n��������ѡ�Ĵ�ʽ��1��������2����������");
    scanf("%d",&a);
    switch(a)
    {
    case 1:
        printf("\n������<<����>>������Ϣ����������\n");
        printf("|-----------------------------------------|\n");
        printf("   ������<<����>>������������ʱȣ�");
        scanf("%f",&i);
        printf("|-----------------------------------------|\n");
        printf("   ������<<����>>������ĸ���������");
        scanf("%d",&k);
        printf("|-----------------------------------------|\n");
        n=log(F/P)/log(i/k+1)/k;
        printf("\nͨ��������������Ҫ�Ĵ������Ϊ��%lf\n\n",n);
        break;
    case 2:
        printf("������<<����>>������Ϣ����������\n");
        printf("|-----------------------------------------|\n");
        printf("   ������<<����>>�������������Ϣ��");
        scanf("%f",&i);
        printf("|-----------------------------------------|\n");
        n=(F/P-1)/i;
        printf("\nͨ��������������Ҫ�Ĵ������Ϊ��%lf\n\n",n);
        break;
    }
}

void Count_Interest(){
    double F,P,b,i;
    int k,a,n;
    printf("\n������������Ľ��Ϊ��");
    scanf("%lf",&P);
    printf("\n��������ϣ����õ����ս��Ϊ��");
    scanf("%lf",&F);
    printf("\n�����������������ޣ�");
    scanf("%d",&n);
    printf("\n��������ѡ�Ĵ�ʽ��1��������2����������");
    scanf("%d",&a);
    switch(a)
    {
    case 1:
        printf("\n������<<����>>������Ϣ����������\n");
        printf("|-----------------------------------------|\n");
        printf("   ������<<����>>������ĸ���������");
        scanf("%d",&k);
        printf("|-----------------------------------------|\n");
        b=(double)1/(k*n);
        i=(pow(F/P,b)-1)*k;
        printf("\nͨ��������������Ҫ�Ĵ�������Ϊ��%lf\n\n",i);
        break;
    case 2:
        i=(F/P-1)/n;
        printf("\nͨ���������㣬������Ҫ�Ĵ�������Ϊ��%lf\n\n",i);
        break;
    }
}

void Count_Money(){
    int n,a;
    double F,P;
    float i;
	printf("�����������Ϣ����������\n");
    printf("\n|-----------------------------------------|\n");
    printf("   ��������ÿ����Ͷ��ı���");
    scanf("%lf",&P);
    printf("|-----------------------------------------|\n");
    printf("   ����������Ͷ�������Ϣ��");
    scanf("%f",&i);
    printf("|-----------------------------------------|\n");    
    printf("   �����������������ޣ�");
    scanf("%d",&n);
    printf("|-----------------------------------------|\n");
    printf("\n��������ѡ�Ĵ�ʽ��1����Ͷ��2����Ͷ����");
    scanf("%d",&a);
    switch(a)
    {
    case 1:
        F=P*(1+i)*(pow(1+i,n)-1)/i;
        break;
    case 2:
        F=P*12*(1+i)*(pow(1+i,n)-1)/i;    
        break;
    }
    printf("\n���%d�꣬������õĽ��Ϊ��%.4lf\n\n",n,F);
}




void Count_Refunt(){
    int n,a;
    double F,P;
    float i;
	printf("�����������Ϣ����������\n");
    printf("\n|-----------------------------------------|\n");
    printf("   ������������Ľ�");
	scanf("%lf",&F);
    printf("|-----------------------------------------|\n");
    printf("   �������������Ϣ���꣩��");
    scanf("%f",&i);
    printf("|-----------------------------------------|\n");    
    printf("   ��������������ޣ�");
    scanf("%d",&n);
    printf("|-----------------------------------------|\n");
    printf("\n��������ѡ�Ľ�ʽ��1���껹��2���»�����");
    scanf("%d",&a);
    switch(a)
    {
    case 1:
        P=F*i*pow(1+i,n)/pow(1+i,n-1);
		printf("\n��ÿ��Ҫ���Ľ��Ϊ��%.4lf\n\n",P);
        break;
    case 2:
		i=i/12;
		n=n*12;
        P=F*i*pow(1+i,n)/pow(1+i,n-1);
		printf("\n��ÿ��Ҫ���Ľ��Ϊ��%.4lf\n\n",P);
        break;
    }
    
}

void menu(){
    printf("|-----------------------------------------|\n");
    printf("|               0���˳�ϵͳ               |\n");
    printf("|-----------------------------------------|\n");
    printf("|               1���������               |\n");
    printf("|-----------------------------------------|\n");
    printf("|               2���������               |\n");
    printf("|-----------------------------------------|\n");
    printf("|      3������������������Ľ��    |\n");
    printf("|-----------------------------------------|\n");
    printf("|            4��������ֵ����            |\n");
    printf("|-----------------------------------------|\n");
    printf("|        5��������ֵ��������������      |\n");
    printf("|-----------------------------------------|\n");
    printf("|       6��������ֵ�������������     |\n");
    printf("|-----------------------------------------|\n");
    printf("| 7����ÿ�꣨�£�Ͷ�뱾����������ֵ |\n");
    printf("|-----------------------------------------|\n");
	printf("|        8�����������꣨�£�����      |\n");
    printf("|-----------------------------------------|\n");
}

void main(){
    char t;
	int a;
	menu();
loop:
    printf("\n���������ѡ��");
	if(scanf("%d",&a)==1){
    switch(a)
    {
    case 0:
         exit(0);
		 break;
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
    case 8:
        system("cls");
        t=getchar();
        Count_Refunt();
        break;
    default:
        printf("�����������������룡(Ŀǰ����ѡ��ֻ��1~8)\n");
        goto loop;
    }    
	}
	else{
		system("cls");
        t=getchar();
		printf("\n�����������������룡(Ŀǰ����ѡ��ֻ��1~8)\n\n");
        main();
	}
}
