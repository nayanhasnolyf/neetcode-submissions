class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap <String, List<String>> hm = new HashMap<>();
    
    for(int i =0; i<strs.length; i++)
    {
        char[] arr = strs[i].toCharArray();
        Arrays.sort(arr);
        String key = new String(arr);
        if(!hm.containsKey(key))
        {
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            hm.put(key,list);
        }
        else
        {
            (hm.get(key)).add(strs[i]);
        }
    }
    return new ArrayList <>(hm.values());      
    }
}
