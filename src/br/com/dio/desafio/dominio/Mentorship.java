package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorship extends Event {

    private LocalDate date;

    @Override
    public Double calculateXp() {
        return XP_DEFAULT + 20d;
    }

    public Mentorship(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    public Mentorship() {
        super();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
