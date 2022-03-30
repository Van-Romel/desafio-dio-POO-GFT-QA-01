package br.com.dio.desafio.dominio;

public class Course extends Event {

    private int workload;

    public Course(String title, String description, int workload) {
        super(title, description);
        this.workload = workload;
    }

    public Course() {
        super();
    }

    @Override
    public Double calculateXp() {
        return XP_DEFAULT * this.workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "workload=" + workload +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
