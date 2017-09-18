import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

class Scrabble {
  private String word;
  private int score = 0;
  private List<String> lettersEqualToOne = Arrays.asList("A", "E", "I", "O", "U", "L", "N", "R", "S", "T");
  private List<String> lettersEqualToTwo = Arrays.asList("D", "G");
  private List<String> lettersEqualToThree = Arrays.asList("B", "C", "M", "P");
  private List<String> lettersEqualToFour = Arrays.asList("F", "H", "V", "W", "Y");
  private List<String> lettersEqualToFive = Arrays.asList("K");
  private List<String> lettersEqualToEight = Arrays.asList("J", "X");
  private List<String> lettersEqualToTen = Arrays.asList("Q", "Z");
  private Map<List, Integer> scoresForEachLetter;
  private List<String> listOfLetters;
  private String[] lettersPlayed;


    Scrabble(String word) {
      this.word = word.toUpperCase();
      scoresForEachLetter = new HashMap<>();
      scoresForEachLetter.put(lettersEqualToOne, 1);
      scoresForEachLetter.put(lettersEqualToTwo, 2);
      scoresForEachLetter.put(lettersEqualToThree, 3);
      scoresForEachLetter.put(lettersEqualToFour, 4);
      scoresForEachLetter.put(lettersEqualToFive, 5);
      scoresForEachLetter.put(lettersEqualToEight, 8);
      scoresForEachLetter.put(lettersEqualToTen, 10);
    }

    int getScore() {
      lettersPlayed = word.split("");
       for (int i = 0; i < lettersPlayed.length; i++){
        for (Map.Entry<List, Integer> entry: scoresForEachLetter.entrySet()) {
          listOfLetters = entry.getKey();
          if (listOfLetters.contains(lettersPlayed[i])) {
            score += entry.getValue();
          }
        }
       }
      return score;
    }

}
