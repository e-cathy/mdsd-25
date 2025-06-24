package MediaStoreRepo

public class Helper {

    public static void assertNull(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Expected null but was not null.");
        }
    }

    public static void assertNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalStateException("Expected non-null value but was null.");
        }
    }
}
