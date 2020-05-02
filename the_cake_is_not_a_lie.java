public class Main
{
	public static void main(String[] args) {
	    String s = "abcabcabc";
	    int x = getInt(s);
		System.out.println(x);
	}
	public static int getInt(String s){
    String check = "";
    for(int i=0;i<s.length();i++){
        check = check + Character.toString(s.charAt(i));
        if(i+check.length()+1>s.length()){
            return 1;
        }
        String eqString = s.substring(i+1,i+check.length()+1);
        if(check.equals(eqString)){
            int n;
            for(n = check.length();n+check.length()<=s.length();n+=check.length()){
                if(!check.equals(s.substring(n,n+check.length()))){
                    StringBuilder in = new StringBuilder();
                    in.append(s.substring(n,n+check.length()));
                    in = in.reverse();
                    if(!check.equals(in)){
                        break;
                    }
                }
            }
            if(n+check.length()>=s.length()){
                return (s.length()/check.length());
            }                
            
        }else{
            StringBuilder a = new StringBuilder();
            a.append(eqString);
            a = a.reverse();
            if(check.equals(a)){
                int n;
                for(n = check.length();n+check.length()<=s.length();n+=check.length()){
                    if(!check.equals(s.substring(n,n+check.length()))){
                        StringBuilder in = new StringBuilder();
                        in.append(s.substring(n,n+check.length()));
                        in = in.reverse();
                        if(!check.equals(in)){
                            break;
                        }
                    }
                }
                if(n+check.length()>=s.length()){
                    return (s.length()/check.length());
                }                  
            }
        } 
    }
    return 1;
}

}
