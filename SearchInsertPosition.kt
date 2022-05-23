class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (target <= nums[0]){
            return 0
        }
        for((index, _) in nums.withIndex()){
            if (nums.size >= index + 2){
                if (target <= nums[index+1]){
                    return index + 1
                }
            }
        }
    return nums.size
    }

}