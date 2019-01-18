package leetcode;

import java.util.*;

class Interval{
	int start;
	int end;
	Interval() {start = 0; end = 0;}
	Interval(int s, int e){ start = s; end = e;}
}
public class _56_merge_intervals {

	public static void main(String[] args) {
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(1,4));
		intervals.add(new Interval(0,4));

		for(Interval i : intervals) {
			System.out.println(i.start + " " + i.end);
		}
		System.out.println(" applying method");
		intervals = merge(intervals);
		for(Interval i : intervals) {
			System.out.println(i.start + " " + i.end);
		}
		
	}
	
	static class sortByStart implements Comparator<Interval>{

		@Override
		public int compare(Interval o1, Interval o2) {
			return o1.start - o2.start;
		}
		
	}
	
	public static List<Interval> merge(List<Interval> intervals) {
		
		int i = 0;
		
		Collections.sort(intervals, new sortByStart());
		
		while(i < intervals.size()-1 ) {
			if(intervals.get(i).end >= intervals.get(i+1).start) {
				intervals.get(i).end = intervals.get(i+1).end;
				intervals.remove(i+1);
			} else {
				i++;
			}
		}
		
		return intervals;
	}
}
