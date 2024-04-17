package com.learning.core.day2session2;

public class D02P056 {
	public static int findLongestPrefixSuffix(String s) {
		 
        int n = s.length();
 
        for (int len = n / 2; len > 0; len--) {
 
            String prefix = s.substring(0, len);
 
            String suffix = s.substring(n - len);
 
            if (prefix.equals(suffix)) {
 
                return len;
 
            }
 
        }
 
        return 0;
 
    }
 
 
    public static void main(String[] args) {
 
        String s = "aabcdaabc";
 
        String s1 = "abcab";
 
        System.out.println("Length of the longest prefix which is also a suffix (non-overlapping): "
 
                            + findLongestPrefixSuffix(s));
 
        System.out.println("Length of the longest prefix which is also a suffix (non-overlapping): "
 
                + findLongestPrefixSuffix(s1));
 
 
    }

}
