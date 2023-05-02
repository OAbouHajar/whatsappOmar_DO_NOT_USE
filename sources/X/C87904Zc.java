package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.4Zc  reason: invalid class name and case insensitive filesystem */
public class C87904Zc {
    public final int A00;
    public final List A01;

    public C87904Zc(int i2) {
        this.A01 = Collections.emptyList();
        this.A00 = i2;
    }

    public C87904Zc(List list) {
        this.A01 = Collections.unmodifiableList(list);
        this.A00 = 0;
    }
}
