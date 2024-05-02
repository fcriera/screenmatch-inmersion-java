package modelo;

public class Title {
    private String name;
    private int releaseDate;
    private double rating;
    private boolean includedInBasicPlan;
    private String synopsis;
    private int durationInMinutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isIncludedInBasicPlan() {
        return includedInBasicPlan;
    }

    public void setIncludedInBasicPlan(boolean includedInBasicPlan) {
        this.includedInBasicPlan = includedInBasicPlan;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void info(){
        System.out.println("****Info****");
        System.out.println("Title: " + name);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Length: " + getDurationInMinutes() + "min.");
        System.out.println("");
    }
}
