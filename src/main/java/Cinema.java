public class Cinema {
    private String[] titles = new String[0];
    private int amountOfTitles = 5;

    public Cinema() {
        amountOfTitles = 5;
    }

    public Cinema(int amountOfTitles) {
        this.amountOfTitles = amountOfTitles;
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

        String[] reversed = new String[amountOfTitles];
        for (int i = 0; i < amountOfTitles; i++) {
            reversed[i] = titles[titles.length - 1 - i];
        }
        return reversed;
    }
}
