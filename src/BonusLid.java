public class BonusLid {
    public static void main(String[] args) {
        Bonus bonus = new Bonus(4);

        Lid lid1 = new Lid("abaa2334");
        System.out.println(bonus.check(lid1));

        Lid lid2 = new Lid("aabb1122");
        System.out.println(bonus.check(lid2));

        Lid lid3 = new Lid("abaa2334");
        System.out.println(bonus.check(lid3));

        Lid lid4 = new Lid("abA12BBA");
        System.out.println(bonus.check(lid4));
    }
}

class Lid {
    private String code;

    public Lid(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}


class Bonus {
    private int remainingWins;

    public Bonus(int count) {
        this.remainingWins = count;
    }

    public boolean check(Lid lid) {
        if (remainingWins <= 0){return false;}
        String code = lid.getCode();
        if (code.length() != 8){ return false;}

        int vowels = 0, consonants = 0;
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            int value;
            if(Character.isDigit(c)){
                value = c - '0';
            }else if(Character.isLetter(c)){
                value =Character.toLowerCase(c) - 'a' + 1;
            }else{
                return false;
            }

            if ("aeiou".indexOf(Character.toLowerCase(c)) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }

            if (i < 4) {
                leftSum += value;
            } else {
                rightSum += value;
            }
        }

        if (vowels == consonants && leftSum == rightSum) {
            remainingWins--;
            return true;
        }

        return false;
    }
}


