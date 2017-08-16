package storage;

import java.io.IOException;

public class MapStorageTest extends AbstractArrayStorageTest {
    public MapStorageTest() {
        super(new ManualSortedStorage());
    }
}
