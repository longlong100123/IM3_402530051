public  class Easter{
	public static String  calculateEaster(int year){
    int month= 0,day = 0;
    
	int a= year %19;
	int b= year%4;
	int c= year%7;
	int k= (int)((year)/100);
	int p= (int)((13+(8*k))/25);
	int q= (int)(k/4);
	int M=(int)(15-p+k-q)%30;
	int N=(int)(4+k-q)%7;
	int d=((19*a)+M)%30;
	int e=((2*b)+(4*c)+(6*d)+N)%7;
	
	if ((d+e-9)<0){
		month=3;
		day=d+e+22;
	}
	else if((d+e-9)>0) 
	{
		month=4;
		day=d+e-9;
	}
	else if (d==29 && e==6){
	month=4;
	day=19;
	}
	else if (d==28 && e==6 && (11*M+11)%30<19){
		month=4;
		day=18;
	}
	
	
	return "In "+year+", Easter Sunday is month="+month+"and day="+day;
	}
	
}
