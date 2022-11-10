public class Main {
	public static void main(String[] args) throws Exception {
		int c;
		int[] alphabet = new int[26];
		while((c = System.in.read()) >= 'A') { // 65
			if(c >= 'A' && c <= 'Z') { alphabet[c-'A']++; }
			else { alphabet[c-'a']++; }
		}
		
		int max = 0; // 빈도수를 저장
		int output = 0; // 인덱스를 저장
		for(int i=0; i<26; i++) {
			if(alphabet[i] > max) {
				max = alphabet[i];
				output = i;
			} else if(alphabet[i] == max) {
				output = -2;
			}
		}
		System.out.println((char)('A' + output));
	}
}