package br.com.dio.desafio.dominio;

public abstract class Event {

    protected final double XP_DEFAULT = 10d;

    protected String title;
    protected String description;

    protected Event(String title, String description) {
        this.title = title;
        this.description = description;
    }

    protected Event() {

    }

    public Double calculateXp() {
        return XP_DEFAULT;
    }

    public double getXP_DEFAULT() {
        return XP_DEFAULT;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
