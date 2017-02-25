import java.util.*;

public class CharacterCount
{
	static int cnt = 0, itr = 0;
	static String string;
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		string = scanner.nextLine();
		scanner.close();
		StringBuffer str_buff = new StringBuffer();
		for(int i = 0; i < string.length(); i++){
			String temp_str = string.substring(i,i+1);
			if(!str_buff.toString().contains(temp_str)){
				str_buff.append(temp_str+count(string.charAt(i)));
			}
		}
		System.out.printf("\n%s",str_buff);
	}
	
	public static int count(char temp){
		cnt = 0;itr = 0;
		while(itr < string.length()){
			if(temp == string.charAt(itr)){
				cnt++;
			}
			itr++;
		}
		return cnt;
	}
}
