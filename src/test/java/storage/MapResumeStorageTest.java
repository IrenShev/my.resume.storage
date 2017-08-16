package storage;

import java.io.IOException;

public class MapResumeStorageTest extends AbstractStorageTest {
    public MapResumeStorageTest() throws IOException, InterruptedException {
        super(new MapResumeStorage());
    }
}
