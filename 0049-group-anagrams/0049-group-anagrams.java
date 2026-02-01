class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String words:strs){
            char[] chars=words.toCharArray();
            Arrays.sort(chars);
            String sortedWords=new String(chars);
            map.putIfAbsent(sortedWords,new ArrayList<>());
            map.get(sortedWords).add(words);
        }
        return new ArrayList<>(map.values());
    }
}