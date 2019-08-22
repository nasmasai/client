package groupwork.demo;

public class original {
    private Long id;
    private String movieName;

    public original(String movieName) {
        this.movieName = movieName;
    }

    private original() {
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
        return "Original{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}