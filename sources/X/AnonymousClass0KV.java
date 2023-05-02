package X;

/* renamed from: X.0KV  reason: invalid class name */
public enum AnonymousClass0KV {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean A00() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
