package storage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import storage.serializer.XmlStreamSerializer;


@RunWith(Suite.class)
@Suite.SuiteClasses({
                ManualSortedStorageTest.class,
                ResumeStorageTest.class,
                SortedResumeStorageTest.class,
                ListStorageTest.class,
                MapStorageTest.class,
                MapResumeStorageTest.class,
                ObjectStreamStorageTest.class,
                ObjectStreamPathStorageTest.class,
                PathStorageTest.class,
                FileStorageTest.class,
                XmlPathStorageTest.class,
                JsonPathStorageTest.class,
                DataPathStorageTest.class,
                SqlStorageTest.class

        })
public class AllStorageTest {
}