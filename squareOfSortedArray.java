class Solution {
    public int[] sortedSquares(int[] A) {
        int [] array = new int [A.length];
        for(int i = 0; i < A.length; i++){
            array[i] = A[i] * A[i];
        }
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        return array;
    }
}
