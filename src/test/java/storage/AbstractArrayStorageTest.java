package storage;

import exception.StorageException;
import model.Resume;
import org.junit.Assert;
import org.junit.Test;

public abstract class AbstractArrayStorageTest extends AbstractStorageTest {
    public AbstractArrayStorageTest(Storage storage) {
        super(storage);
    }

    @Test(expected = StorageException.class)
    public void saveOverflow() throws Exception {
        try {
            for (int i = 4; i <= AbstractArrayStorage.MAX_LENTH; i++) {
                storage.save(new Resume("" + i));
            }
        } catch (StorageException e) {
            Assert.fail();
        }
        storage.save(new Resume("dummy" ));
    }
}
