package BOJ.dp;
import java.util.*;

public class _3687 {

  static String[] max_dp=new String[101];
  static String[] min_dp=new String[101];
  static int[][] num={{},{},{1},{7},{4},{2,3,5},{0,6,9},{8}};
                    //0   1  2   3   4    5       6       7
  public static void main(String[] args){
      
    max_dp[2]="1";
    for(int i=3; i<=100; i++){
      if(i%2==1) max_dp[i]=max_dp[i-1].replaceFirst("1","7");
      else max_dp[i]= 1+max_dp[i-2];

      min_dp[i]="9999999999999999";    
    }
    
     min_dp[2]="1";
     min_dp[3]="7";
     min_dp[4]="4";
     min_dp[5]="2";
     min_dp[6]="6";   // 나중에 6으로 바꿔서 출력해야함
     min_dp[7]="8";
     min_dp[8]="10";

     String[] dp = {"1","7","4","2","0","8"};

      for (int i = 9; i <= 100; i++) {
        for (int j = 2; j <= 7; j++) {
          String comp = min_dp[i-j]+dp[j-2];
          if(Long.parseLong(min_dp[i]) > Long.parseLong(comp))
            min_dp[i] = comp;
        }
      }
     
    
    Scanner sc = new Scanner(System.in);
     
     int T=Integer.parseInt(sc.nextLine());
     for(int i=0; i<T; i++){
       int tmp = Integer.parseInt(sc.nextLine());     
       System.out.println(min_dp[tmp]+" "+max_dp[tmp]);
     }
  }
}
