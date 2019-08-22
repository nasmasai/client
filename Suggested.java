package groupwork.demo;

public class Suggested {
    private Long id;
    private String movieName;

    public Suggested(String movieName) {
        this.movieName = movieName;
    }

    private Suggested() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}