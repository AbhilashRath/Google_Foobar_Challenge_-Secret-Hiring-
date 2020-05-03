public class Main
{
	public static void main(String[] args) {
		String s = "--->-><-><-->-";//"<<>><";//"--->-><-><-->-";//>><><> //<<>>>> 10
		int x = salutes(s);
		System.out.println(x);
		
	}
	//s = [>,>,>,>],< count = 4,< count = count + 6,
	public static int salutes(String s){
	    s = s.replace("-","");
	    int right_count = 0;
	    int count = 0;
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)=='>'){
	            right_count+=1;
	        }else{
	            count+=right_count*2;
	        }
	    }
	    return count;
	}
}
