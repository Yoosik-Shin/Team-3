package Day12.Collection.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSet5 {
    
    // 로또 번호를 5회 출력한다.
    public static void main(String[] args) {
        Random random = new Random();
        
        for (int i = 1; i <= 5; i++) { // 5회 반복
            Set<Integer> lottoSet = new HashSet<Integer>();
            
            while (lottoSet.size() < 6 ) {
                int num = random.nextInt(45) + 1;
                boolean check = lottoSet.add(num);
                if (!check) {
                    System.out.println(num + "번이 중복되어서 다시 뽑습니다.");
                }
            }
            
            // 정렬
            List<Integer> lottoList = new ArrayList<Integer>(lottoSet);
            Collections.sort(lottoList);
            
            System.out.println("로또 번호 (회차 " + i + ") : " + lottoList);
        }
    }
}
