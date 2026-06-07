class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0) return res;

        Map<Character, String> letters = new HashMap<>();
        letters.put('2',"abc");
        letters.put('3',"def");
        letters.put('4',"ghi");
        letters.put('5',"jkl");
        letters.put('6',"mno");
        letters.put('7',"pqrs");
        letters.put('8',"tuv");
        letters.put('9',"wxyz");
        backtrack(digits, 0, new StringBuilder(), res, letters);
        
        return res; 
    }

    public void backtrack( String digits, int idx, StringBuilder comb,List<String> res,Map<Character, String> letters)
    {
        if(idx == digits.length())
        {
            res.add(comb.toString());
            return;
        }
        String let = letters.get(digits.charAt(idx));
        for (char l : let.toCharArray()) {
            comb.append(l);
            backtrack(digits, idx + 1, comb, res, letters);
            comb.deleteCharAt(comb.length() - 1);
        }
    }
}