package seedu.addressbook.data.person;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.getName().toString().compareToIgnoreCase(b.getName().toString());
    }
}
