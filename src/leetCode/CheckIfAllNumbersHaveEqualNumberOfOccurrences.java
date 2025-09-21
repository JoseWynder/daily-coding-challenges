package leetCode;

public class CheckIfAllNumbersHaveEqualNumberOfOccurrences {

    public static void main(String[] args) {
        System.out.println("true == " + CheckIfAllNumbersHaveEqualNumberOfOccurrences
                .hasEqualFrequency(new int[]{1}));
        System.out.println("true == " + CheckIfAllNumbersHaveEqualNumberOfOccurrences
                .hasEqualFrequency(new int[]{2,2,2,3,3,3}));
        System.out.println("true == " + CheckIfAllNumbersHaveEqualNumberOfOccurrences
                .hasEqualFrequency(new int[]{1,2,3,4,4,3,2,1}));
        System.out.println("false == " + CheckIfAllNumbersHaveEqualNumberOfOccurrences
                .hasEqualFrequency(new int[]{1,1,1,2,2,2,3,3}));
        System.out.println("false == " + CheckIfAllNumbersHaveEqualNumberOfOccurrences
                .hasEqualFrequency(new int[]{1,2,2,3,3}));
    }

    public static boolean hasEqualFrequency(int[] deck) {

        if(deck.length <= 2) {
            return true;
        }

        int[] deckCount = new int[10_001];
        for (int value : deck) {
            deckCount[value]++;
        }

        int expectedCount = deckCount[deck[0]];

        for(int count : deckCount) {
            if(count != 0 && count != expectedCount) {
                return false;
            }
        }

        return true;
    }
}
