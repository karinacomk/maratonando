import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static boolean isAnagrams(String s1, String s2) {
		System.out.println(s1 + " com " + s2);
		
        if(s1.length() != s2.length()) return false;
        
        int cnt = 0;
        boolean[] visit = new boolean[s2.length()];
                
        for(int i = 0; i < s1.length(); i++) {
            for(int j = 0; j < s2.length(); j++) {
                if(s1.charAt(i) == s2.charAt(j) && !visit[j]) {
                    cnt++; visit[j] = true; break;
                }
            }
        }
        
        return cnt == s2.length()? true : false;
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ans = 0;

		while (sc.hasNext()) {			
			String s = sc.nextLine();
		
			List<String> list = new ArrayList<>();
			for(int i = 0; i < s.length(); i++) {
				for(int j = i + 1; j <= s.length(); j++) {
					list.add(s.substring(i, j));
					System.out.println("[" + i + ", " + j + "] = " + s.substring(i, j));
				}
			}
			
			for(int i = 0; i < list.size(); i++) {
				for(int j = i + 1; j < list.size(); j++) {
					if(isAnagrams(list.get(i), list.get(j))) ans++;
				}
			}
		}
		
		System.out.println("\nsolution = " + ans);
	}
}
