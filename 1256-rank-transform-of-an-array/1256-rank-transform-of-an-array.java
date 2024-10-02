class Solution {

    // method1============================================================
    // public int[] arrayRankTransform(int[] arr) {

    //     if(arr.length==0){
    //         return arr;
    //     }


    //     int[][] indexedArr=new int[arr.length][2];
    //     for(int i=0;i<arr.length;i++){
    //         indexedArr[i][0]=arr[i];
    //         indexedArr[i][1]=i;
    //     }

    //     for(int i=0;i<arr.length;i++){
    //         int min=indexedArr[i][0];
    //         int index=i;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(indexedArr[j][0]<min){
    //                 min=indexedArr[j][0];
    //                 index=j;
    //             }
    //         }
    //         int[] temp=indexedArr[i];
    //         indexedArr[i]=indexedArr[index];
    //         indexedArr[index]=temp;
    //     }


    //     int rank=1;
    //     int min=indexedArr[0][0];
    //     for(int i=0;i<arr.length;i++){
    //         if(min == indexedArr[i][0] ){
    //             arr[indexedArr[i][1]]=rank;
    //         }
    //         else{
    //             rank++;
    //             arr[indexedArr[i][1]]=rank;
    //             min=indexedArr[i][0];
    //         }

    //     }

    //     return arr;
 
    // }


        public int[] arrayRankTransform(int[] arr) {

            if(arr == null || arr.length==0){
                return arr;
            }

            HashMap<Integer,Integer> map=new HashMap<>();

            int[] sortedArr=arr.clone();
            Arrays.sort(sortedArr);
            int rank=1;

            for(int num:sortedArr){
                if(!map.containsKey(num)){
                    map.put(num,rank);
                    rank++;
                }
            }

            for(int i=0;i<sortedArr.length;i++){
                arr[i]=map.get(arr[i]);
            }

            return arr;

        }
        
}