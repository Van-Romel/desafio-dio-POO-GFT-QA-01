package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp extends Event {
    private final LocalDate initDate = LocalDate.now();
    private final LocalDate finishDate = initDate.plusDays(31);

    private Set<Dev> scribedDevs = new HashSet<>();
    private Set<Event> event = new HashSet<>();

    public Bootcamp(String title, String description, Set<Dev> scribedDevs, Set<Event> event) {
        super(title, description);
        this.scribedDevs = scribedDevs;
        this.event = event;
    }

    public Bootcamp(Set<Dev> scribedDevs, Set<Event> event) {
        this.scribedDevs = scribedDevs;
        this.event = event;
    }

    public LocalDate getInitDate() {
        return initDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public Set<Dev> getScribedDevs() {
        return scribedDevs;
    }

    public void setScribedDevs(Set<Dev> scribedDevs) {
        this.scribedDevs = scribedDevs;
    }

    public Set<Event> getEvent() {
        return event;
    }

    public void setEvent(Set<Event> event) {
        this.event = event;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(initDate, bootcamp.initDate) && Objects.equals(finishDate, bootcamp.finishDate) && Objects.equals(scribedDevs, bootcamp.scribedDevs) && Objects.equals(event, bootcamp.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initDate, finishDate, scribedDevs, event);
    }
}
