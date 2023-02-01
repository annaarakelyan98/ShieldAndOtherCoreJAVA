public class TernaryOperator {
    public static void main(String[] args) {
        Double d = 0.1;
        Double d1 = 0.1;

        System.out.println(d.equals(d1) + " " + d.hashCode());

        StringBuffer s = new StringBuffer("sad");
        StringBuffer s1 = new StringBuffer("sad");
        s.equals(s1);
        s.hashCode();

        String s2 = "hdg";
        String s3 = "hdg";
        s2.equals(s3);
        s2.hashCode();

        Character character = '5';
        Character character1 = '5';

        character.equals(character1);
        character.hashCode();
    }
}
