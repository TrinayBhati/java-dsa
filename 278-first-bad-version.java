/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int f = 1; 
        int l = n;
        while(f<l){
            int mid = (f+l)/2; // always use f + (l-f)/2 
            if(isBadVersion(mid)){
                l = mid;
            }
            else{
                f = mid+1;
            }
        }
        return f;
    }
}

//===========================================================

// This is a Java implementation of binary search to find the first bad version. We start by initializing the left pointer to 1, and the right pointer to n. We then enter a while loop, and while the left pointer is less than the right pointer, we calculate the middle element using int mid = left + (right - left) / 2;.

// We then check if the middle element is a bad version by calling the isBadVersion(mid) method, which is provided by the VersionControl class. If it is, we update the right pointer to the middle element, since we know that all subsequent versions are also bad. If it's not, we update the left pointer to mid + 1, since we know that the bad version must be after mid.

// We continue this process until the left pointer is equal to the right pointer, at which point we have found the first bad version and return its index.