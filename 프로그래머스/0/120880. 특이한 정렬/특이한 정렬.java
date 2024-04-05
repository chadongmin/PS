
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};

		List<Integer> list = IntStream.of(numlist).boxed().collect(Collectors.toList());
		Collections.sort(list, (o1, o2) -> {
            if(Math.abs(o2 - n) == Math.abs(o1 - n)){
                return o1 - o2;
            }
			return Math.abs(o2 - n)- Math.abs(o1 - n);
		});
        Collections.reverse(list);

		return list.stream().mapToInt(Integer::intValue).toArray();
    }
}