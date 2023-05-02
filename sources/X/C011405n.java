package X;

/* renamed from: X.05n  reason: invalid class name and case insensitive filesystem */
public enum C011405n {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static C011405n A00(C011005f r0) {
        switch (r0.ordinal()) {
            case 1:
                return ON_CREATE;
            case 2:
                return ON_START;
            case 3:
                return ON_RESUME;
            default:
                return null;
        }
    }

    public C011005f A01() {
        switch (ordinal()) {
            case 0:
            case 4:
                return C011005f.CREATED;
            case 1:
            case 3:
                return C011005f.STARTED;
            case 2:
                return C011005f.RESUMED;
            case 5:
                return C011005f.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" has no target state");
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
