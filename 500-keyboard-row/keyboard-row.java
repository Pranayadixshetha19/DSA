class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        Set<Character> row1 = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
        Set<Character> row2 = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        Set<Character> row3 = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm');
        for( String word: words )
        {
            String s = word.toLowerCase();
            boolean ans = true;
            if(row1.contains(s.charAt(0)))
            {
                for(int i = 1; i < s.length(); i++)
                {
                    if(!row1.contains(s.charAt(i))){
                        ans = false;
                    }
                }
                if(ans == true)
                {
                    list.add(word);
                }
            }
            else if(row2.contains(s.charAt(0)))
            {
                for(int i = 1; i < s.length(); i++)
                {
                    if(!row2.contains(s.charAt(i))){
                        ans = false;
                    }
                }
                if(ans == true)
                {
                    list.add(word);
                }
            }
            else
            {
                for(int i = 1; i < s.length(); i++)
                {
                    if(!row3.contains(s.charAt(i))){
                        ans = false;
                    }
                }
                if(ans == true)
                {
                    list.add(word);
                }
            }
        }
        return list.toArray(new String[0]);
    }
}