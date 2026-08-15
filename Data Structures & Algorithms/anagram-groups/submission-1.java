class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var res = new HashMap<String, List<String>>();

        for (var s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortS = new String(charArr);

            res.putIfAbsent(sortS, new ArrayList<>());

            res.get(sortS).add(s);
        }

        return new ArrayList(res.values());
        
    }
}
