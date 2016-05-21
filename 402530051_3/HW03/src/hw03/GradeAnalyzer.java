package hw03;
import java.util.*;

public class GradeAnalyzer {
   int count;
   double avg,standd,sum=0,temp;
   
   int [] array1=new int[11];
   
   ArrayList<Double> Gradelist= new ArrayList<Double>();
   
   boolean isVaildGrade(double aGrade){
	   if (aGrade>0 && aGrade<=110 )
	   {
		   return true;
	   }
	   else 
	   {
		   return false;
	   }
   }
   void addGrade(double aGrade){
	   if (isVaildGrade(aGrade))
	   {
		   count++;
		   sum = sum + aGrade;
		   Gradelist.add(aGrade);
		   
		   //A+
		   if (aGrade>=98)
		   {
			   array1[0]+=1;
		   }
		   //A
		   else if (aGrade<98 && aGrade>=92)
		   {
			   array1[1]+=1;
		   }
		   //A-
		   else if (aGrade<92 && aGrade>=90)
		   {
			   array1[2]+=1;
		   }
		   //B+
		   else if (aGrade<90 && aGrade>=88)
		   {
			   array1[3]+=1;
		   }
		   //B
		   else if (aGrade<88 && aGrade>=82)
		   {
			   array1[4]+=1;
		   }
		   //B-
		   else if (aGrade<82 && aGrade>=80)
		   {
			   array1[5]+=1;
		   }
		   //C+
		   else if (aGrade<80 && aGrade>=78)
		   {
			   array1[6]+=1;
		   }
		   //C
		   else if (aGrade<78 && aGrade>=72)
		   {
			   array1[7]+=1;
		   }
		   //C-
		   else if (aGrade<72 && aGrade>=70)
		   {
			   array1[8]+=1;
		   }
		   //D
		   else if (aGrade<70 && aGrade>=60)
		   {
			   array1[9]+=1;
		   }
		   //F
		   else if (aGrade<60)
		   {
			   array1[10]+=1;
		   }
			   
	   }
   }
   void analyzeGrades(){
	   avg = sum/count;
	   for (int i=0;i<Gradelist.size();i++)
	   {
		   temp += Math.sqrt(Gradelist.get(i)-avg);
	   }
	   standd=Math.sqrt(temp/count);
   }
   public String toString(){
	   String grade="";
	   
	   grade+= "A+:"+array1[0]+"\n";
	   grade+= "A:"+array1[1]+"\n";
	   grade+= "A-:"+array1[2]+"\n";
	   grade+= "B+:"+array1[3]+"\n";
	   grade+= "B:"+array1[4]+"\n";
	   grade+= "B-:"+array1[5]+"\n";
	   grade+= "C+:"+array1[6]+"\n";
	   grade+= "C:"+array1[7]+"\n";
	   grade+= "C-:"+array1[8]+"\n";
	   grade+= "D:"+array1[9]+"\n";
	   grade+= "F:"+array1[10]+"\n";

	   return grade;
   }
   
}
