package storage;

import exception.ExistStorageException;
import exception.NotExistStorageException;
import exception.StorageException;
import model.Resume;

public abstract class AbstractStorage implements Storage {
    public static final int MAX_LENTH = 10000;
    protected Resume[] storage = new Resume[MAX_LENTH];
    protected int size = 0;


    private boolean isOverflow(){
        if (size == MAX_LENTH){
            return true;
        }
        return false;
    }

    private boolean isExist(int index){
        if (index < 0){
           return false;
        }
        return true;
    }

    @Override
    public void save(Resume r) {
        if (isOverflow()) {
            throw new StorageException("Storage owerflov!",r.getUuid());
        }
        int index = getIndex(r.getUuid());
        if (!isExist(index)) {
            insertEl(r, index);
            size++;
            return;
        }
        throw new ExistStorageException(r.getUuid());
    }

    @Override
    public void delete(String uuid) {
        int index = getIndex(uuid);
        if (isExist(index)) {
            fillDeletedEl(index);
            size--;
            return;
        }
        throw new NotExistStorageException(uuid);
    }

    @Override
    public void update(Resume r) {
        int index = getIndex(r.getUuid());
        if (isExist(index)) {
            storage[index] = r;
            return;
        }
        throw new NotExistStorageException(r.getUuid());
    }

    @Override
    public Resume get(String uuid) {
        int index = getIndex(uuid);
        if (isExist(index)) {
            return storage[index];
        }
        throw new NotExistStorageException(uuid);
    }

    @Override
    public Resume[] getAll() {
        Resume[] resumes = new Resume[size];
        for (int i = 0; i < size; i++) {
            resumes[i] = storage[i];
        }
        return resumes;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size = 0;

    }
    protected abstract int getIndex(String uuid);

    protected abstract void fillDeletedEl(int index);

    protected abstract void insertEl(Resume r, int index);

}
