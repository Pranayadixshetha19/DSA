class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {

            for (int j = 0; j < list2.length; j++) {

                if (list1[i].equals(list2[j])) {

                    int sum = i + j;

                    if (!map.containsKey(sum)) {
                        map.put(sum, new ArrayList<>());
                    }

                    map.get(sum).add(list1[i]);
                }
            }
        }

        int minKey = Collections.min(map.keySet());

        ans.addAll(map.get(minKey));

        return ans.toArray(new String[0]);
    }
}