package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.4LS  reason: invalid class name */
public final class AnonymousClass4LS {
    public final int A00;
    public final String A01;
    public final List A02;
    public final byte[] A03;

    public AnonymousClass4LS(String str, List list, byte[] bArr, int i2) {
        this.A00 = i2;
        this.A01 = str;
        this.A02 = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.A03 = bArr;
    }
}
