class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        int count=0;
        Set<Character> brokenset=new HashSet<>();
        for(char c:brokenLetters.toCharArray()){
            brokenset.add(c);
        }
        for(String word:words){
            boolean cantype=true;
            for(char c:word.toCharArray()){
                if(brokenset.contains(c)){
                    cantype=false;
                    break;
                }
            }if(cantype){
                count++;
            }
        }return count;
    }
}