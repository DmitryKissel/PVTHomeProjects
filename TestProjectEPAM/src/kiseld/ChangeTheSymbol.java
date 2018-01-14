package kiseld;

import kiseld.Entity.Sentence;
import kiseld.Entity.Word;

import java.util.List;

public class ChangeTheSymbol extends Change {

    /**
     * This method changes symbol with number k  for the incoming symbol in the word
     * and saves new value of the word.
     * @param text
     * @return nothing
     */
    void change(List<Sentence> sentenceList, int k, char value){
        SplitSentenceToWords splitSentenceToWords = new SplitSentenceToWords();

        for (Sentence sentence: sentenceList){
            splitSentenceToWords.splitToWords(sentence);
            for(Word word : sentence.getWordList()){
                if(word.getWordContent().contains("\\p{Punct}") || word.getWordContent().equals(" ")){
                }
                else {
                    if (word.getWordContent().length() >= k+1) {
                        StringBuilder stringBuilder = new StringBuilder(word.getWordContent());
                        stringBuilder.setCharAt(k, value);
                        word.setWordContent(stringBuilder.toString());
                    }
                }
            }
        }
    }
}