import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CinemaTest {
    String title1 = "Номер один";
    String title2 = "Bloodshot";
    String title3 = "Джентельмены";
    String title4 = "Тролли. Тролли наносят ответный удар";
    String title5 = "Человек-невидимка";
    String title6 = "Вперёд";
    String title7 = "Отель «Белогорск»";

    @Test
    public void ShouldAddTitleThenShow() {
        Cinema cinemaTesting = new Cinema();
        cinemaTesting.addTitle(title1);
        cinemaTesting.addTitle(title2);
        cinemaTesting.addTitle(title3);
        cinemaTesting.findAll();
        String[] expected = {title1, title2, title3};
        String[] actual = cinemaTesting.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddTitleThenShowReversedArrayLength3() {

        Cinema cinemaTesting = new Cinema(3);
        cinemaTesting.addTitle(title1);
        cinemaTesting.addTitle(title2);
        cinemaTesting.addTitle(title3);
        cinemaTesting.addTitle(title4);
        cinemaTesting.addTitle(title5);
        cinemaTesting.addTitle(title6);
        cinemaTesting.addTitle(title7);
        String[] expected = {title7, title6, title5};
        String[] actual = cinemaTesting.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddTitleThenShowReversedArrayLength6() {

        Cinema cinemaTesting = new Cinema(6);
        cinemaTesting.addTitle(title1);
        cinemaTesting.addTitle(title2);
        cinemaTesting.addTitle(title3);
        cinemaTesting.addTitle(title4);
        cinemaTesting.addTitle(title5);
        cinemaTesting.addTitle(title6);
        cinemaTesting.addTitle(title7);
        String[] expected = {title7, title6, title5, title4, title3, title2};
        String[] actual = cinemaTesting.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddTitleInCinema() {

        Cinema cinemaTesting = new Cinema();

        cinemaTesting.addTitle(title1);
        cinemaTesting.addTitle(title4);
        cinemaTesting.addTitle(title3);
        cinemaTesting.addTitle(title2);
        cinemaTesting.addTitle(title5);

        String[] expected = {title5, title2, title3, title4, title1};
        String[] actual = cinemaTesting.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
