package storage;

import model.Resume;

public interface Storage {
    void save(Resume r);
    void delete(String uuid);
    void update(Resume r);
    Resume get(String uuid);
    Resume[] getAll();
    int size();
    void clear();
}
