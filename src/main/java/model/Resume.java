package model;

public class Resume implements Comparable<Resume> {
    //unique identifier
    private String uuid;
    //see you later!
    //private String fullName;

    //must add empty constructor
    public Resume() {
    }

    public Resume(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return uuid;
    }

    //bad idea!!!
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public int compareTo(Resume o) {
        return this.uuid.compareTo(o.getUuid());
    }
}
