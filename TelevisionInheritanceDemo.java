class TVSeries {
    String title = "Unknown Series";
    int seasons = 0;

    void showSeriesInfo() {
        System.out.println("Series Title: " + title);
        System.out.println("Number of Seasons: " + seasons);
    }
}

class GenreSeries extends TVSeries {
    String genre = "Undefined";

    void showGenre() {
        System.out.println("Genre: " + genre);
    }
}

class Episode extends GenreSeries {
    int episodeNumber;
    String episodeTitle;

    void showEpisodeInfo() {
        System.out.println("Episode " + episodeNumber + ": " + episodeTitle);
    }
}

public class TelevisionInheritanceDemo {
    public static void main(String[] args) {
        Episode ep = new Episode();

        ep.title = "Stranger Things";
        ep.seasons = 4;
        ep.genre = "Science Fiction";
        ep.episodeNumber = 1;
        ep.episodeTitle = "The Vanishing of Will Byers";

        System.out.println("=== TV Series Episode Info ===");
        ep.showSeriesInfo();     
        ep.showGenre();          
        ep.showEpisodeInfo();    
    }
}
