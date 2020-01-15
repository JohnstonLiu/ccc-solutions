import java.util.*;

public class J4SimpleEncryption2004 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String encrypt = sc.nextLine();
		String str = convert(sc.nextLine());
		int j = 0;
		for (int i = 0; i < str.length(); i++, j++){
			char enc = encrypt.charAt(j);
			int inc = enc - 65;
			char c = str.charAt(i);
			char temp = c;
			temp += inc;
			if (temp > 90){
				int sur = (int) temp - 90;
				c = 'A';
				c += sur - 1;
			}else{
				c += inc;
			}

			str = str.substring(0, i) + c + str.substring(i + 1);
			if (j == encrypt.length() - 1){
				j = -1;
			}
		}

		System.out.println(str);
	}

	public static String convert(String str){
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) < 65 || str.charAt(i) > 90){
			   str = str.substring(0, i) + ' ' + str.substring(i + 1);
			}
		}
		str = str.replaceAll(" ", "");
		return str;		
	}
}
