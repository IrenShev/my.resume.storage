package storage;

import model.Resume;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public abstract class AbstractStorageTest {

    private Storage storage;

    private static final String UUID_1 = "uuid1";
    private static final Resume RESUME_1 = new Resume(UUID_1);

    private static final String UUID_2 = "uuid2";
    private static final Resume RESUME_2 = new Resume(UUID_2);

    private static final String UUID_3 = "uuid3";
    private static final Resume RESUME_3 = new Resume(UUID_3);

    private static final String UUID_4 = "uuid4";
    private static final Resume RESUME_4 = new Resume(UUID_4);

    public AbstractStorageTest(Storage storage) {
        this.storage = storage;
    }


    @Before
    public void setUp() {
        storage.clear();
        storage.save(RESUME_1);
        storage.save(RESUME_2);
        storage.save(RESUME_3);
    }

    @Test
    public void save() {
        storage.save(RESUME_4);
        assertSize(4);
        assertArrayEquals(storage.getAll(), new Resume[]{RESUME_1,RESUME_2,RESUME_3,RESUME_4});
    }

    @Test
    public void delete() {
        storage.delete(UUID_3);
        assertSize(2);
        assertArrayEquals(storage.getAll(), new Resume[]{RESUME_1,RESUME_2});
    }

    @Test
    public void update() {
        storage.update(RESUME_3);
        assertSize(3);
        assertArrayEquals(storage.getAll(), new Resume[]{RESUME_1,RESUME_2,RESUME_3});
    }

    @Test
    public void get() {
        assertGet(RESUME_1);
        assertGet(RESUME_2);
        assertGet(RESUME_3);
    }

    @Test
    public void getAll() {
        assertArrayEquals(storage.getAll(), new Resume[]{RESUME_1,RESUME_2,RESUME_3});
    }

    @Test
    public void size() {
        assertSize(3);
    }

    @Test
    public void clear() {
        storage.clear();
        assertSize(0);
    }

    private void assertSize(int size){
        assertEquals(storage.size(), size);
    }

    private void assertGet(Resume r) {
        assertEquals(r, storage.get(r.getUuid()));
    }

}