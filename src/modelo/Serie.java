package modelo;

public class Serie extends Title{
    private int seasons;
    private int chaptersPerSeasons;
    private int episodeLenghtinMinutes;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getChaptersPerSeasons() {
        return chaptersPerSeasons;
    }

    public void setChaptersPerSeasons(int chaptersPerSeasons) {
        this.chaptersPerSeasons = chaptersPerSeasons;
    }

    public int getEpisodeLenghtinMinutes() {
        return episodeLenghtinMinutes;
    }

    public void setEpisodeLenghtinMinutes(int episodeLenghtinMinutes) {
        this.episodeLenghtinMinutes = episodeLenghtinMinutes;
    }

    @Override
    public int getDurationInMinutes() {
        return episodeLenghtinMinutes*chaptersPerSeasons*seasons;
    }
}
