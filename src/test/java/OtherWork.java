public class OtherWork {
    public static void main(String[] args) {

        //  System.out.println(computeMultipleSum(11));

        System.out.println(luckyMoney(32, 5));

    }


    public static int computeMultipleSum(int n) {

        int sum = 0;
        for (int i = 1; i < n; i++) {

            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {

                sum += i;

            }


        }

        return sum;
    }

    public static int luckyMoney(int money, int grandChildren) {

        int numberLetter = 0;

        if (0 <= money && money < 100) {

            if (0 < grandChildren && grandChildren < 10) {


                while (money / 8 > 0 ) {

                    if (money==4 && grandChildren==1){
                        return 0;
                    }else if (money-8==4 && grandChildren==2){
                        return 0;
                    }else if (money==8 && grandChildren==2){
                        return numberLetter;
                    }

                    money = money - 8;
                    grandChildren--;
                    numberLetter++;
                }

            }


            return numberLetter;

        }else
            return -1;
    }


}


// class DuoDigits {
//     public static void main(String[] args) {
//         String result = isDouDigit(33554);
//
//         System.out.println(result);
//
//
//     }
//
//     private static String isDouDigit(int number) {
//         String s = String.valueOf(number);
//         String[] SElements = s.split("");
//
//
//         HashSet<String> hset = new HashSet<>();
//         hset.addAll(Arrays.asList(SElements));
//
//         if (hset.size() > 2) {
//             return "n";
//         }
//         return "y";
//     }
// }
