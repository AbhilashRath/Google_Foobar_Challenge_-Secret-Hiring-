import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int h = 3;
	    int[] q = {7,3,5,1};
	    System.out.println(Arrays.toString(solution(h,q)));
	}
	
    public static int[] solution(int h, int[] q){
        int head = (int) Math.pow(2,h) - 1;
        int[] ans = new int[q.length];
        for(int i=0;i<q.length;i++){
            if(q[i]==head){
                ans[i] = -1;
            }else{
                ans[i] = locate(head,q[i],head-1);
            }
        }
        return ans;
    }
    
    public static int locate(int top,int num,int bottom){
        bottom = bottom/2;
        int r = top -1;
        int l = top-1-bottom;
        if((r==num)||(l==num)){
            return top;
        }else{
            if(num<=l){
                return locate(l,num,bottom);
            }else{
                return locate(r,num,bottom);
            }
        }
    }
}
