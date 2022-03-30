package br.com.dio.desafio.dominio;

public class Event {

    protected String title;
    protected String description;

    protected Event(String title, String description) {
        this.title = title;
        this.description = description;
    }

    protected Event() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
}
