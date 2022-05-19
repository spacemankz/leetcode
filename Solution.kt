import java.util.*

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        val minHeap = PriorityQueue<Int>()
        for (i in 0 until m) {
            minHeap.add(nums1[i])
        }
        for (i in 0 until n) {
            minHeap.add(nums2[i])
        }
        while (!minHeap.isEmpty()) {
            for (i in 0 until m + n) {
                nums1[i] = minHeap.remove().toInt()
            }
        }
    }
}