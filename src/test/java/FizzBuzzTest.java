import FizzBuzz.FizzBuzz;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {

    // 3 things they want me to do : 1- make it works
    //                               2- make it clean
    //                               3- make it fast

    //do FizzBuzz :

    // Agar adad bar 3 bakhsh pazir bod --> Fizz
    // Agar adad bar 5 bakhsh pazir bod --> Buzz
    // Agar adad bar 3,5 bakhsh pazir bod --> FizzBuzz


    //Test Driven Development (TDD) : 1-Shekastan moshkl be bakhsh haye kochik tar
    //                                 2-Agar code qermez shod bayad sabz she
    //                                  3- Be mahze inke code sabz shod mirim ghesmate badi
    //                                  4- Ghanon 3 : vaghte 3 ta halat natije yeksan midan -> tamame halat haye baadi haman natije ra midan
    // Rahatarn tarnin halat kodam halate? use case


    @Test
    void should_return_1_give_1() {

        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String result = fizzBuzz.play(1);



        //Then
        assertThat(result).isEqualTo("1");


    }

    @Test
    void should_return_2_give_2() {

        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String result = fizzBuzz.play(2);



        //Then
        assertThat(result).isEqualTo("2");


    }

    @Test
    void should_return_4_give_4() {

        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String result = fizzBuzz.play(4);



        //Then
        assertThat(result).isEqualTo("4");


    }
    @Test
    void should_return_3_give_Fizz() {

        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String result = fizzBuzz.play(3);



        //Then
        assertThat(result).isEqualTo("Fizz");


    }
    @Test
    void should_return_6_give_Fizz() {

        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String result = fizzBuzz.play(6);



        //Then
        assertThat(result).isEqualTo("Fizz");


    }

    @Test
    void should_return_9_give_Fizz() {

        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String result = fizzBuzz.play(9);



        //Then
        assertThat(result).isEqualTo("Fizz");


    }

    @Test
    void should_return_5_give_Buzz() {

        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();



        // When
        String result = fizzBuzz.play(5);


        // Then
        assertThat(result).isEqualTo("Buzz");
    }
    @Test
    void should_return_10_give_Buzz() {

        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();



        // When
        String result = fizzBuzz.play(10);


        // Then
        assertThat(result).isEqualTo("Buzz");
    }
    @Test
    void should_return_15_give_FizzBuzz() {

        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();



        // When
        String result = fizzBuzz.play(15);


        // Then
        assertThat(result).isEqualTo("FizzBuzz");
    }
    @Test
    void should_return_30_give_FizzBuzz() {

        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();



        // When
        String result = fizzBuzz.play(30);


        // Then
        assertThat(result).isEqualTo("FizzBuzz");
    }
}


