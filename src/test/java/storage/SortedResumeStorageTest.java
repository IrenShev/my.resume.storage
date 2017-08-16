package storage;


import java.io.IOException;

//public modificator for class important
public class SortedResumeStorageTest extends AbstractArrayStorageTest {
    public SortedResumeStorageTest() throws IOException, InterruptedException {
        super(new SortedResumeStorage());
    }
}