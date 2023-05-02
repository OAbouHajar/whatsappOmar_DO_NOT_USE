package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.5zK  reason: invalid class name */
public class AnonymousClass5zK implements C1223469f {
    public static final Boolean A04 = Boolean.FALSE;
    public static final Boolean A05 = Boolean.TRUE;
    public static final Map A06 = Collections.emptyMap();
    public final AnonymousClass5xU A00;
    public final C117785tY A01;
    public final C114885ol A02;
    public final C114885ol A03;

    public AnonymousClass5zK(AnonymousClass5xU r1, C117785tY r2, C114885ol r3, C114885ol r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
    }

    public Object A9Z(C115815qM r3) {
        int i2 = r3.A00;
        switch (i2) {
            case 0:
            case 7:
                return A05;
            case 1:
            case 4:
            case 5:
            case 12:
                return false;
            case 2:
            case 14:
                throw AnonymousClass000.A0a(C13680ns.A0c(i2, "Invalid Settings key: "));
            case 15:
                return A06;
            default:
                return A04;
        }
    }
}
