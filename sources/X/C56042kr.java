package X;

import java.util.List;

/* renamed from: X.2kr  reason: invalid class name and case insensitive filesystem */
public class C56042kr implements C40921uu {
    public C216114t A00;
    public final C16080sP A01;
    public final List A02;

    public C56042kr(C16080sP r1, C216114t r2, List list) {
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = list;
    }

    public boolean A90(C15830rv r5) {
        C16010sH r3 = (C16010sH) this.A00.A04().get(r5);
        return r3 != null && !C16030sJ.A0R(r3.A0E) && this.A01.A0T(r3, this.A02, true);
    }
}
