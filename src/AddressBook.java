import java.util.ArrayList;

// this is lab 3, testing for more changes
// this is a test
// this is a test from github edit

public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo aBuddy) {
        if(aBuddy != null) {
            myBuddies.add(aBuddy);
        }
    }

    public void duplicateBuddy(BuddyInfo aBuddy) {
        myBuddies.add(aBuddy);
    }

    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index < myBuddies.size()) {
            return myBuddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
