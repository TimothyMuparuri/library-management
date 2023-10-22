package library.book;

import library.Borrowable;

public class Comic extends Book implements Borrowable {

    private String commicType;

    public Comic(String title, String author, String ISBN, Boolean availabilityStatus) {
        super(title, author, ISBN, availabilityStatus);
    }


    public String getCommicType() {
        return commicType;
    }

    public void setCommicType(String commicType) {
        this.commicType = commicType;
    }

    @Override
    public void borrow() {
        //logic again

        // no approaval

        this.setAvailabilityStatus(false);
    }
}
