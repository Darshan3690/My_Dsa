class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Arrays.sort(arr);
          Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Set<Integer> s = new HashSet<>();
        for (int x : freq.values()) {
            s.add(x);
        }

        return freq.size() == s.size();
    }
}

        

//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]==arr[i+1]){
//                 return true;
//             }
//         }
//         return false;
        
//     }
// }