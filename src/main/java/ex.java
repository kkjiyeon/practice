import java.util.Arrays;
import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char [] arr = new char[n.length()];
        for(int i=0; i<n.length(); i++) {
            arr[i] = n.charAt(i);
        }
        Arrays.sort(arr);
        for(int i=arr.length-1; i>0; i--) {
            System.out.print(arr[i]);
        }
    }
}
// 1251 길이-2까지 알파벳 비교, 가장 작은 알파벳 위치까지 첫 번째 자르고 뒤집기, 나머지에서 -1까지 같은 과정 반복 작은 알파벳 위치에서 자르고 뒤집기, 나머지 뒤집고 출력