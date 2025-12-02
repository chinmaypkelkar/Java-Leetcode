package Graph;

import java.util.*;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class CourseSchedule2 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> preqMap = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        Set<Integer> visitedSet = new HashSet<>();
        for (int[] preq: prerequisites) {
            preqMap.computeIfAbsent(preq[0], k-> new ArrayList<>()).add(preq[1]);
        }

        for(int i = 0;i<numCourses;i++){
            if(!preqMap.containsKey(i)){
                preqMap.put(i, new ArrayList<Integer>());
            }
        }

         for(int i = 0 ;i<numCourses;i++){
            if(output.contains(i)){
                continue;
            }
            visitedSet.clear();
            if(!IsCycle(i,visitedSet, preqMap)){
                output.addAll(visitedSet);
            }
          }

        return output.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean IsCycle(Integer currentCourse, Set<Integer> visitedSet,  Map<Integer, List<Integer>>preqMap) {
        if(visitedSet.contains(currentCourse)){
            return true;
        }

        visitedSet.add(currentCourse);
        for(Integer course: preqMap.get(currentCourse)){
            return IsCycle(course, visitedSet, preqMap);
        }

        return false;
        
    }

}
