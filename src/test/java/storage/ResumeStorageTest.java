package storage;

import java.io.IOException;

public class ResumeStorageTest extends AbstractArrayStorageTest {
    public ResumeStorageTest() throws IOException, InterruptedException {
        super(new ResumeStorage());
    }
}
