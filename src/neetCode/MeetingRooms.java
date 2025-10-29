package neetCode;

// https://neetcode.io/problems/meeting-schedule?list=neetcode150

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MeetingRooms {
    public static class Interval {
        public int start, end;
        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals == null) return true;

        intervals.sort(Comparator.comparingInt(i -> i.start));
        for (int i = 1; i < intervals.size(); i++) {
            Interval prev = intervals.get(i - 1);
            Interval curr = intervals.get(i);
            if(curr.start < prev.end) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("false == " + canAttendMeetings(new ArrayList<>(
                List.of(new Interval(0,30), new Interval(5,10), new Interval(15,20)))));
        System.out.println("true == " + canAttendMeetings(new ArrayList<>(
                List.of(new Interval(5,8), new Interval(9,15)))));
    }
}
