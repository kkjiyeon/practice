import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=0; i<n; i++) {
            String s = sc.next();
            Loop1:
            for(int j=0; j<s.length()-1; j++) {
                if(s.charAt(j) != s.charAt(j+1)) {
                    for(int k=j; k<s.length(); k++) {
                        if(s.charAt(j) == s.charAt(k)) break Loop1;
                    }
                }
            } cnt++;
        }
        System.out.println(cnt);
    }
}
// 다음 인덱스 값과 다르면 그 인덱스부터 끝까지 for문 돌면서 같은 값 나오면 break
