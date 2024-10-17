public class Book {
    private String title;
    private String author;
    private double price;
    private Boolean isBorrowed = false;
    private Boolean isSoldOut = false;

    @Override
    public String toString() {
        String title = "Title: " + getTitle() + "\n";
        String author = "Author: " + getAuthor() + "\n";
        String price = "Price: " + getPrice() + " $\n";
        String isBorrowed = "Available to borrow: " + ((!getIsBorrowed()) && (!getIsSoldOut()) ? "YES" : "NO") + "\n";
        String isSoldOut = "Available to buy: " + ((!getIsSoldOut()) && (!getIsBorrowed()) ? "YES" : "NO") + "\n";

        return title + author + price + isBorrowed + isSoldOut;
    }

    /**
     * Sets isBorrowed property as true if it has not been sold or borrowed
     * 
     * @return true if borrowed successfully, false otherwise
     */
    public Boolean borrowBook() {
        if (isBorrowed) {
            System.out.println("- This book is already borrowed!\n");
            return false;
        } else if (isSoldOut) {
            System.out.println("- This book is sold!\n");
            return false;
        } else {
            setIsBorrowed(true);
            return true;
        }
    }

    /**
     * Sets isBorrowed property as false if it has not been sold and already borrowed
     * 
     * @return true if returned successfully, false otherwise
     */
    public Boolean returnBook() {
        if (!isBorrowed) {
            System.out.println("- This book is not borrowed!\n");
            return false;
        } else if (isSoldOut) {
            System.out.println("- This book is sold!\n");
            return false;
        } else {
            setIsBorrowed(false);
            return true;
        }
    }

    /**
     * Sets isSoldOut property as true if it has not been sold or borrowed
     * 
     * @return true if sold successfully, false otherwise
     */
    public Boolean sellBook() {
        if (isSoldOut) {
            System.out.println("- This book is already sold!\n");
            return false;
        } else if (isBorrowed) {
            System.out.println("- This book is borrowed!\n");
            return false;
        } else {
            setIsSoldOut(true);
            return true;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if ((title != null) && (!title.isEmpty())) {
            this.title = title;
        } else {
            System.out.println("- Title input can't be empty!\n");
        }
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        if ((author != null) && (!author.isEmpty())) {
            this.author = author;
        } else {
            System.out.println("- Author input can't be empty!\n");
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("- Price can't be negative!\n");
        }
    }


    public Boolean getIsBorrowed() {
        return getIsBorrowed();
    }

    public void setIsBorrowed(Boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public Boolean getIsSoldOut() {
        return getIsSoldOut();
    }

    public void setIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }


}
