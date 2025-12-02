import Array.*;
import BinarySearchTree.BST;
import BinarySearchTree.LevelOrderTraversal;
import BinaryTree.Node;
import Graph.CourseSchedule;
import Graph.CourseSchedule2;
import Graph.IslandAndTreasure;
import Graph.NumerOfIslands;
import Graph.OrangesRotting;
import Graph.SetMatrixZeros;
import Interval.InsertInterval;
import Interval.Merge;
import JavaPractice.Context;
import JavaPractice.Database;
import JavaPractice.Employee;
import JavaPractice.FlatDiscountStrategy;
import JavaPractice.IDiscountStrategy;
import JavaPractice.Mythread;
import JavaPractice.PrintOddEvenNumbers;
import JavaPractice.Student;
import PriorityQueue.KClosest;
import PriorityQueue.LastStoneWeight;
import SlidingWindow.LengthOfLongestSubstring;
import Stack.ValidParentheses;
import Stack.CalPoints;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;

import String.FindPalindrome;
import TwoPointers.NumRescueBoats;




public class Main {
    public static void main(String[] args) {

       System.out.println(' ' - 'a');
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer,List<String>> input = new HashMap<>();
        for(String str : strs){
            input.computeIfAbsent(calculateHash(str), k -> new ArrayList()).add(str);
        }
        return new ArrayList<>(input.values());
     
    }

    private int calculateHash(String input){
        int result = 0;
        for(int i=0;i<input.length();i++){
            result += input.charAt(i) - 'a';
        }
        return result;
    }

   


}