package storage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
                ManualSortedStorageTest.class,
                ResumeStorageTest.class,
                SortedResumeStorageTest.class,
                ListStorageTest.class,
                MapStorageTest.class,
                MapResumeStorageTest.class,
                ObjectStreamStorageTest.class,
                ObjectStreamPathStorageTest.class

        })
public class AllStorageTest {
}