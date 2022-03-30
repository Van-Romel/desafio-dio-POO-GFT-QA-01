package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Event> inscribedEvents = new LinkedHashSet<>();
    private Set<Event> completedEvents = new LinkedHashSet<>();

    public void inscribeBootcamp(Bootcamp bootcamp) {
        this.inscribedEvents.addAll(bootcamp.getEvent());
        bootcamp.getScribedDevs().add(this);
    }

    public void toProgress() {
        Optional<Event> event = this.inscribedEvents.stream().findFirst();
        if (event.isPresent()) {
            this.completedEvents.add(event.get());
            this.inscribedEvents.remove(event.get());
        } else System.err.println("You are not inscribed in any event");
    }

    public void calculateTotalXp() {
        this.completedEvents
                .stream()
                .mapToDouble(Event::calculateXp)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Event> getInscribedEvents() {
        return inscribedEvents;
    }

    public void setInscribedEvents(Set<Event> inscribedEvents) {
        this.inscribedEvents = inscribedEvents;
    }

    public Set<Event> getCompletedEvents() {
        return completedEvents;
    }

    public void setCompletedEvents(Set<Event> completedEvents) {
        this.completedEvents = completedEvents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(inscribedEvents, dev.inscribedEvents) && Objects.equals(completedEvents, dev.completedEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, inscribedEvents, completedEvents);
    }
}
