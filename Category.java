package groupwork.demo;

public class Category {
    private Long id;
    private String genre1;
    private String subgenre;
    private Integer minutes;

    public Category(String genre1, String subgenre, Integer minutes) {
        this.genre1 = genre1;
        this.subgenre = subgenre;
        this.minutes = minutes;
    }

    private Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenre1() {
        return genre1;
    }

    public void setGenre1(String genre1) {
        this.genre1 = genre1;
    }

    public String getSubgenre() {
        return subgenre;
    }

    public void setSubgenre(String subgenre) {
        this.subgenre = subgenre;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id +
                ", genre1='" + genre1 + '\'' +
                ", subgenre='" + subgenre + '\'' +
                ", time=" + minutes +
                '}';
    }
}