import java.util.*;

public class WordReversal
{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String string = new String(scanner.nextLine());
		scanner.close();
		String[] words = string.split(" ");
		StringBuffer[] string_buff = new StringBuffer[words.length];
		//str_buf = str.toString();
		
		for(int itr = 0; itr < words.length; itr++){
			StringBuffer temp = new StringBuffer(words[itr]);
			System.out.printf("%s ",temp.reverse());
			}
	}
}
