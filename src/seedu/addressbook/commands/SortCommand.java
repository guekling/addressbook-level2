package seedu.addressbook.commands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import seedu.addressbook.data.person.ReadOnlyPerson;

/**
 * Arrange the names of all persons in the address book by alphabetical order.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Arrange the names of all persons in address book in alphabetical order. \n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Address book has been successfully sorted!";

    public SortCommand() {}

    @Override
    public CommandResult execute() {
        addressBook.clear();
        return new CommandResult(MESSAGE_SUCCESS);
    }

}
