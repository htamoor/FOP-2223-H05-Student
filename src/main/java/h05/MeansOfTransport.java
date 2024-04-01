package h05;

public abstract class MeansOfTransport {
    protected TransportType transportType;
    final private char[] VOWELS = new char[]{'A', 'E', 'I', 'O', 'U'};

    public TransportType gettransportType() {
        return transportType;
    }

    public abstract int letMeMove(int distance);

    @Override
    public String toString() {
        String transportTypeString = transportType == null ? "undefined" : transportType.toNoun();
        String indefiniteArticle = firstCharIsVowel(transportTypeString) ? "an" 					: "a";
        return "I am " + indefiniteArticle + " " + transportTypeString + ".";
    }

    private boolean firstCharIsVowel(String s) {
        if (s.length() < 1) {
            return false;
        }
        for (char vowel : VOWELS) {
            if (s.charAt(0) == vowel || s.charAt(0) == vowel + 32) {
                return true;
            }
        }
        return false;
    }


}
