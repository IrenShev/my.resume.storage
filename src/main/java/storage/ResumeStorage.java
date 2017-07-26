package storage;

import model.Resume;

public class ResumeStorage extends AbstractStorage {

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
    protected int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }
}
