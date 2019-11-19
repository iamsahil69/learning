import java.util.*;
public class stu_result{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int[] RollNo = new int[100];
    int[][] Marks = new int[100][3];
    int[] Total = new int[100];
    int total,max1,max2,max3,max;
    int index1= 0;
    int index2 =0;
    int index3=0;
    int index4=0;
    Random obj = new Random();
    for (int i=0;i<100 ;i++ ) {
      RollNo[i] = i+1;
    }
    for (int c=0;c<100 ;c++ ) {
      for (int d=0;d<3 ;d++ ) {
        Marks[c][d] = obj.nextInt(100);
      }
    }
    int sum = 0;
    for (int q=0;q<100 ;q++ ) {
      sum=0;
       for (int x=0;x<3 ;x++ ) {
         sum = sum+Marks[q][x];
       }
       Total[q]=sum;
    }
    System.out.println("RollNo\tSubj1\tSubj2\tSubj3\tTotal");
    for (int m=0;m<100 ;m++ ) {
      System.out.print("  "+RollNo[m]+"\t");
      for (int n=0;n<3 ;n++ ) {
      System.out.print("  "+Marks[m][n]+"\t");
      }
      System.out.print(" "+Total[m]);
      System.out.println("");
    }
    max = Total[0];
 for (int w=0;w<100;w++ ) {
   if (max < Total[w]) {
     max = Total[w];
     index4 = w;
   }
   else{}
 }
 max1 = Marks[0][0];
for (int d=0;d<100;d++ ) {
if (max1 < Marks[d][0]) {
  max1 = Marks[d][0];
  index1 = d;
}
else{}
}
max2 = Marks[0][1];
for (int j=0;j<100;j++ ) {
if (max2 < Marks[j][1]) {
 max2 = Marks[j][1];
 index2 = j;
}
else{}
}
max3 = Marks[0][2];
for (int k=0;k<100;k++ ) {
if (max3 < Marks[k][2]) {
 max3 = Marks[k][2];
 index3 = k;
}
else{}
}
System.out.println("Highest marks "+max1+" Marks in Subject1 is secured by RollNo "+RollNo[index1]);
System.out.println("Highest marks "+max2+" Marks in Subject2 is secured by RollNo "+RollNo[index2]);
System.out.println("Highest marks "+max3+" Marks in Subject3 is secured by RollNo "+RollNo[index3]);
System.out.println("Overall Highest marks "+max+" Marks in All Subjects is secured by RollNo "+RollNo[index4]);
  }

}
