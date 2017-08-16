package storage;

import java.io.IOException;

public class ManualSortedStorageTest extends  AbstractStorageTest{
    public ManualSortedStorageTest() throws IOException, InterruptedException {
        super(new ManualSortedStorage());
    }
}
