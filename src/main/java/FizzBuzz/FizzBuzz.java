package FizzBuzz;

public class FizzBuzz {


    public String play(int adad) {
/* Refactoring kardan : manteqe code ro taqir nadadam amma code ro behtar va sade tar shod
        if (adad == 4){
            return 4;
        }
        else if (adad == 2){
            return 2;
        }else{

            return 1;
        }
                if (adad == 3){
            return "Fizz";
        }else if (adad == 6){
            return "Fizz";
        }else if (adad == 9){
            return "Fizz";
        }
*/

        /* aval clean :
          mojadad Refactoring code:

         */

        String result = "";

           if (ayaBar3BakhshPazirHast(adad)){
               result = "Fizz";
           } if(ayaBar5BakhshPazirHast(adad)){
               result = result +"Buzz";
           } else if (!ayaBar5BakhshPazirHast(adad) && !ayaBar3BakhshPazirHast(adad)){
            result = String.valueOf(adad);
        }


        return result;
    }

    private boolean ayaBar5BakhshPazirHast(int adad) {
        return adad % 5 == 0;
    }

    private boolean ayaBar3BakhshPazirHast(int adad) {
        return adad % 3 == 0;
    }
}
