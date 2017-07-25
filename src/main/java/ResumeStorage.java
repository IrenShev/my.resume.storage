import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResumeStorage {
    Resume[] resumes = new Resume[10000];


    void save(Resume r) {
        for (int i = 0; i < resumes.length; i++) {
            if (Objects.equals(resumes[i], null)) {
                resumes[i] = r;
                break;
            }
        }
    }

    void update(Resume r) {
        for (int i = 0; i < resumes.length; i++) {
            if (!Objects.isNull(resumes[i])) {
                if (Objects.equals(resumes[i].getUuid(), r.getUuid())) {
                    resumes[i] = r;
                    break;
                }
            }
        }
    }


    Resume get(String uuid) {
        for (int i = 0; i < resumes.length; i++) {
            if (!Objects.isNull(resumes[i].getUuid())) {
                return resumes[i];
            }
        }
        return null;
    }


    void delete(String uuid) {
        for (int i = 0; i < resumes.length; i++) {
            if (!Objects.isNull(resumes[i])) {
                if (Objects.equals(resumes[i].getUuid(), uuid)) {
                    resumes[i] = null;
                    break;
                }
            }
        }
    }

    int size() {
        int count = 0;
        for (int i = 0; i < resumes.length; i++) {
            if (!Objects.isNull(resumes[i])) {
                count++;
            }
        }
        return count;
    }

    void clear() {
        for (int i = 0; i < resumes.length; i++) {
            resumes[i] = null;
        }
    }

    Resume[] getAll() {
        List<Resume> list = new ArrayList<>();
        for (int i = 0; i < resumes.length; i++) {
            if(!Objects.isNull(resumes[i])){
              list.add(resumes[i]);
            }
        }
        return  list.toArray(new Resume[list.size()]);
    }
}
