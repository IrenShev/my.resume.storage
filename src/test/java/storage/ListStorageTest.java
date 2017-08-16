package storage;


import java.io.IOException;

public class ListStorageTest  extends  AbstractStorageTest{
    public ListStorageTest() throws IOException, InterruptedException {
        super(new ListStorage());
    }
}