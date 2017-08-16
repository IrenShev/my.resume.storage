package storage;

import java.io.IOException;

public class MapStorageTest extends AbstractArrayStorageTest {
    public MapStorageTest() throws IOException, InterruptedException {
        super(new ManualSortedStorage());
    }
}
