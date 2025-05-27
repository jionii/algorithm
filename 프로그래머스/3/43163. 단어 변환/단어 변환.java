import java.util.*;

class Solution {
    
    class Word {
        String word;
        int count;
        Word(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
    
    int getDiffCount(String word1, String word2) {
        int count = 0;
        for(int i = 0; i < word1.length(); i++) {
            if(word1.charAt(i) != word2.charAt(i)) count++;
        }
        return count;
    }

    public int solution(String begin, String target, String[] words) {
        Set<String> visited = new HashSet<>();
        Queue<Word> queue = new ArrayDeque<>();
        queue.offer(new Word(begin, 0));
        visited.add(begin);
        
        while(!queue.isEmpty()) {
            Word cur = queue.poll();
            if(cur.word.equals(target)) return cur.count;
            
            for(String next: words) {
                if(getDiffCount(cur.word, next) == 1 && !visited.contains(next)) {
                    queue.offer(new Word(next, cur.count + 1));
                    visited.add(next);
                }
            }
        }
        return 0;
    }
}