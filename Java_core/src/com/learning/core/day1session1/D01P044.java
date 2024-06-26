package com.learning.core.day1session1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

	public class D01P044 {

		    
		    public static void findCombinations(int[] A, int i, int k,
		                                        Set<List<Integer>> subarrays,
		                                        List<Integer> out)
		    {
		        
		        if (A.length == 0 || k > A.length) {
		            return;
		        }
		 
		        
		        if (k == 0) {
		            subarrays.add(new ArrayList<>(out));
		            return;
		        }
		 
		        
		        for (int j = i; j < A.length; j++)
		        {
		           
		            out.add(A[j]);
		            findCombinations(A, j + 1, k - 1, subarrays, out);
		            out.remove(out.size() - 1);       
		        }
		    }
		 
		    public static Set<List<Integer>> findCombinations(int[] A, int k)
		    {
		        Set<List<Integer>> subarrays = new HashSet<>();
		        findCombinations(A, 0, k, subarrays, new ArrayList<>());
		        return subarrays;
		    }
		 
		    public static void main(String[] args)
		    {
		        int[] A = { 1, 2, 3 };
		        int k = 2;
		 
		       
		        System.out.println(findCombinations(A, k));

	}

}
