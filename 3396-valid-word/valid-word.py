class Solution(object):
    def isValid(self, word):
        """
        :type word: str
        :rtype: bool
        """
        if len(word) <3:
            return False
        vowels=set("aeiouAEIOU")
        vowel_found=False
        con_found=False
        for ch in word:
            if not (ch.isalpha() or ch.isdigit()):
                return False
            if(ch.isalpha()):
                if ch in vowels:
                    vowel_found=True
                else:
                    con_found=True
        return vowel_found and con_found