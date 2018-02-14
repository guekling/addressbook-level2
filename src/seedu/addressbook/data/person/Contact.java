package seedu.addressbook.data.person;

public class Contact {

    public final String value;
    private boolean isPrivate;

    public Contact(String value, boolean isPrivate) {
        this.isPrivate = isPrivate;
        String trimmedValue = value.trim();
        this.value = trimmedValue;
    }

    @Override
    public String toString() {
        return value;
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
