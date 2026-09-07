class Solution {
    public class Pair {
        String word;
        int level;
        public Pair(String word, int level) {
            this.word = word;
            this.level = level;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> hs = new HashSet<>();
        for(String word:wordList) hs.add(word);

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(beginWord,1));
        hs.remove(beginWord);

        while(!q.isEmpty()){

            String word = q.peek().word;
            int step = q.peek().level;

            q.poll();

            if(word.equals(endWord)) return step;

            for(int i=0;i<word.length();i++){
                for(char j='a';j<='z';j++){
                    char[] replacement = word.toCharArray();
                    replacement[i] = j;
                    String newstr = new String(replacement);
                    if(hs.contains(newstr)){
                        hs.remove(newstr);
                        q.offer(new Pair(newstr,step+1));
                    }
                }
            }


        }

        return 0;

    }
}