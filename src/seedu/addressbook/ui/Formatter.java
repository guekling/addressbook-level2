package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE;
import static seedu.addressbook.common.Messages.MESSAGE_WELCOME;

public class Formatter {

    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";

    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";


    /** Offset required to convert between 1-indexing and 0-indexing.  */
    public static final int DISPLAYED_INDEX_OFFSET = 1;

    public String getEnterCommandPrompt() {
        return LINE_PREFIX + "Enter command: ";
    }

    public String getCommandEnteredPrompt(String input) {
        return "[Command entered:" + input + "]";
    }

    public String[] getWelcomeMessage(String version, String storageFileInfo) {
        return new String[] {DIVIDER, DIVIDER, MESSAGE_WELCOME, version, MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE, storageFileInfo, DIVIDER};
    }

    public String formatDisplayMessageToUser(String message) {
        return LINE_PREFIX + message.replace("\n", LS + LINE_PREFIX);
    }


}
