package X;

import java.util.List;

/* renamed from: X.4NW  reason: invalid class name */
public class AnonymousClass4NW {
    public C14930q1 A00;
    public String A01;
    public List A02;
    public final String A03;
    public final String A04;

    public AnonymousClass4NW(C31201dg r5) {
        List<C31201dg> A0N;
        String str = "";
        this.A04 = r5 != null ? r5.A0K(38, str) : str;
        this.A03 = r5 != null ? r5.A0K(45, str) : str;
        C14930q1 r1 = null;
        this.A01 = r5 != null ? r5.A0J(42) : null;
        this.A00 = r5 != null ? r5.A0H(43) : r1;
        if (r5 != null && (A0N = r5.A0N(44)) != null) {
            this.A02 = AnonymousClass000.A0u();
            for (C31201dg r2 : A0N) {
                this.A02.add(new AnonymousClass4LC(r2));
            }
        }
    }
}
