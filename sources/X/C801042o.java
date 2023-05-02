package X;

/* renamed from: X.42o  reason: invalid class name and case insensitive filesystem */
public enum C801042o {
    NONE(0, r11),
    REQUESTER_ACCOUNT_DELETED(400, r3),
    REQUEST_DELETED(404, r3),
    REQUESTER_ALREADY_IN_GROUP(409, AnonymousClass42N.A01.value),
    GROUP_LIMIT_REACHED(500, r11),
    DEFAULT(1, r11);
    
    public final int statusMapping;
    public final int value;

    /* access modifiers changed from: public */
    C801042o(int i2, int i3) {
        this.value = i2;
        this.statusMapping = i3;
    }
}
