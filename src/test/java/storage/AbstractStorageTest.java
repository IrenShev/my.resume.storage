package storage;

import exception.ExistStorageException;
import exception.NotExistStorageException;
import exception.StorageException;
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


    @Test(expected = StorageException.class)
    public void saveOverflow() throws Exception {
        try {
            for (int i = 4; i <= AbstractStorage.MAX_LENTH; i++) {
                storage.save(new Resume("" + i)); //вот тут 1 раз всплывает почему пустой конструктор это плохо, да и сеттер тоже
                // мы ловим  nullPointerException  в вызове компоратора, при создании нового пустого резюме
            }
        } catch (StorageException e) {
            Assert.fail();
        }
        storage.save(new Resume("dummy" ));
    }

    @Test
    public void save() {
        storage.save(RESUME_4);
        assertSize(4);
        assertArrayEquals(storage.getAll(), new Resume[]{RESUME_1,RESUME_2,RESUME_3,RESUME_4});
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

    @Test(expected = NotExistStorageException.class)
    public void delete() throws Exception {
        storage.delete(UUID_1);
        assertSize(2);
        storage.get(UUID_1);
    }

    @Test(expected = NotExistStorageException.class)
    public void getNotExist() throws Exception {
        storage.get("dummy");
    }

    @Test(expected = ExistStorageException.class)
    public void saveExist() throws Exception {
        storage.save(RESUME_1);
    }

    @Test(expected = NotExistStorageException.class)
    public void updateNotExist() throws Exception {
        storage.get("dummy");
    }


    private void assertSize(int size){
        assertEquals(storage.size(), size);
    }

    private void assertGet(Resume r) {
        assertEquals(r, storage.get(r.getUuid()));
    }

}