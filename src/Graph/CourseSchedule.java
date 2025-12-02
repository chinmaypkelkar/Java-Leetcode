package Graph;

import java.util.*;

public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> preqMap = new HashMap();
        Set<Integer> visitedSet = new HashSet<>();
        for(int[] preq : prerequisites){
            preqMap.computeIfAbsent(preq[0], k -> new ArrayList<>()).add(preq[1]);
        }
        for(int i = 0 ; i < numCourses; i++){
            visitedSet.clear();
            if(isCycle(preqMap, visitedSet, i)){
                return false;
            }
        }
        return true;
    }

    private boolean isCycle(Map<Integer, List<Integer>> preqMap,Set<Integer> visitedSet, int course){
        if(visitedSet.contains(course)){
            return true;
        }
        if(!preqMap.containsKey(course)){
            return false;
        }
        visitedSet.add(course);
        for(Integer c: preqMap.get(course)){
            return isCycle(preqMap,visitedSet, c);
        }
        return false;
    }



     public boolean canF(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> inputMap = new HashMap<>();
        boolean canFinish = true;
        Set<Integer> visited = new HashSet();
        for(int[] preq : prerequisites){
            inputMap.computeIfAbsent(preq[0], k -> new ArrayList()).add(preq[1]);
        }

        for(int i = 0;i < numCourses ;i++){
            if(inputMap.containsKey(i)){
                if(isC(inputMap, visited, i)){
                    return false;
                }
            }
            visited.clear();
        }
        return true;
    }

    private boolean isC(Map<Integer, List<Integer>> inputMap, Set<Integer> visited, int currentCourse ){
        if(visited.contains(currentCourse)){
            return true;
        }
        visited.add(currentCourse);
        if(!inputMap.containsKey(currentCourse)){
            return false;
        }
        
        for(int preq : inputMap.get(currentCourse)){
                return isC(inputMap,visited,preq);
        }
       
        return false;
    }
}
