package IO;

public enum BookGenre {
    BIOGRAPHY(12),
    HORROR(15);

    private BookGenre(int minAgeToRead){
        this.minAgeToRead = minAgeToRead;
    }

    private int minAgeToRead;

    public int getMinAgeToRead(){
        return minAgeToRead;
    }

    public static void main(String[] args) {
        for (BookGenre bookGenre : BookGenre.values()){
            System.out.println("Ordicnal: " + bookGenre.ordinal());
        }
    }
}
