public class Cinema {
    private String[] titles = new String[0];
    private int amountOfTitles = 5;

    public Cinema() {
        String[] titles = new String[5];
    }

    public Cinema(int amountOfTitles) {
        String[] titles = new String[amountOfTitles];
    }

    public void addTitle(String title) {
        String[] tmp = new String[titles.length + 1];
        for (int i = 0; i < titles.length; i++) {
            tmp[i] = titles[i];
        }
        tmp[tmp.length - 1] = title;
        titles = tmp;
    }

    public String[] findAll() {
        return titles;
    }

    public String[] findLast() {

        String[] reversed5 = new String[5];
        for (int i = 0; i < 5; i++) {
            reversed5[i] = titles[titles.length - 1 - i];
        }
        return reversed5;
    }

    public String[] findLast(int amountOfTitles) {
        String[] reversed = new String[amountOfTitles];
        this.amountOfTitles = amountOfTitles;

        for (int i = 0; i < amountOfTitles; i++) {
            reversed[i] = titles[titles.length - 1 - i];
        }
        return reversed;
    }
}
