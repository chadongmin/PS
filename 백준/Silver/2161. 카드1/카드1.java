
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        List trash = new ArrayList<Integer>();

        for (int i = 1; i <= num;i++){
            q.add(i);
        }
        while(q.size()!=1){
            //제일 위에 있는 카드 버리기
            trash.add(q.remove());
            q.add(q.remove());

        }

        for (var t : trash){
            System.out.print(t+" ");
        }
        for (var Q : q){
            System.out.print(Q);
        }


    }

}
