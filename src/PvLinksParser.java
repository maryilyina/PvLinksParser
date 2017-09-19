

public class PvLinksParser {

    private PvLinksParser(){
        PvReader pvreader = new PvReader();
        pvreader.ReadPv();
    }

    public static void main(String[] args) {
        PvLinksParser pvLinksParser = new PvLinksParser();
    }

}


