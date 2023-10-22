package library.book;

import library.Borrowable;

public class Dictionary extends  Book implements Borrowable {


    private String dictionaryName;

    public Dictionary(String title, String author, String ISBN, Boolean availabilityStatus) {
        super(title, author, ISBN, availabilityStatus);
    }

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }

    @Override
    public void borrow() {

        // head approaval
        //librar
        //dean approaval
        //other approaval

        this.setAvailabilityStatus(false);
    }
}
