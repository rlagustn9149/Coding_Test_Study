package hyunsoo.BOJ.code_plus;
import java.util.*;
import java.io.*;
public class _17298 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr= new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    for(int i=0; i<n; i++){
      arr[i]=Integer.parseInt(st.nextToken());
    }

    
    int[] stack = new int[n];
    stack[0] = 0;
    int point = 0; 
    for(int i=1; i<n; i++){
      while(arr[stack[point]] < arr[i]){
        arr[stack[point--]]=arr[i];
        if(point<0){
          break;
        }
      }
      stack[++point] = i;
    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    while(point>=0){
      arr[stack[point--]]=-1;
    }
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<n; i++){
      sb.append(arr[i]+" ");
    }
    System.out.print(sb.toString());
  }
}
