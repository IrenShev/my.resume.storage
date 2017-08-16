package storage;

import model.Resume;

import java.io.IOException;

public class ResumeStorage extends AbstractArrayStorage {
    @Override
    protected void fillDeletedEl(int index) {
        storage[index] = storage[size - 1];
        storage[size - 1] = null;
    }

    //index not used
    @Override
    protected void insertEl(Resume r, int index) {
        storage[size] = r;
    }


    @Override
    protected Integer getSearchKey(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }
}
