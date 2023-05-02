package X;

import java.io.File;

/* renamed from: X.206  reason: invalid class name */
public class AnonymousClass206 extends C43411zx {
    public final C16300so A00;
    public final C16180sb A01;
    public final AnonymousClass01Z A02;
    public final C16980tz A03;
    public final AnonymousClass205 A04;
    public final C18840xL A05;
    public final C18820xJ A06;
    public final C18830xK A07;

    public AnonymousClass206(C16300so r1, C16180sb r2, AnonymousClass01Z r3, C16980tz r4, AnonymousClass205 r5, C18840xL r6, C18820xJ r7, C18830xK r8) {
        super(r5);
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final byte[] A02(File file) {
        C42051x9 A002 = new C18850xM(this.A00, this.A05, this.A06, this.A07).A00(new C42031x7(AnonymousClass1XK.A0S, file, "image/webp", false));
        if (A002 != null) {
            return A002.A02;
        }
        return null;
    }
}
