package august_1th;

import java.util.*;

public class 스택_문제_기능개발 {

	public int[] solution(int[] progresses, int[] speeds) {
		Deque<Integer> done = new LinkedList<>();
		for (int i =0; i<progresses.length; i++) {
			done.offerLast((int)Math.ceil((100-progresses[i])*1.0/speeds[i]*1.0));
			}System.out.println(done);
		Deque<Integer> bapo = new LinkedList<>();
		
			int a = done.pollFirst();
			int count = 1;
			while (!done.isEmpty()) {
				int b = done.pollFirst();
	            System.out.println(done);
				if(a >= b) {
					count += 1;
					continue;
					}
				else {
					bapo.offerLast(count);
					count = 1;
					a = b;
					}
				}
			bapo.offerLast(count);
			return bapo.stream().mapToInt(Integer :: intValue).toArray();
		}

}
