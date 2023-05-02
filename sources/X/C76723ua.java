package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.3ua  reason: invalid class name and case insensitive filesystem */
public class C76723ua extends C102644zI {
    public final AnonymousClass013 A00;
    public final AnonymousClass218 A01;
    public final AnonymousClass1MF A02;

    public C76723ua(Context context, C16180sb r8, AnonymousClass013 r9, C17250um r10, AnonymousClass218 r11, AnonymousClass1XQ r12, AnonymousClass1MF r13, String str) {
        super(context, r8, r10, r12, str);
        this.A00 = r9;
        this.A01 = r11;
        this.A02 = r13;
    }

    public void run() {
        C62033Bj r1;
        File A0E = C17970vw.A0E(this.A01, this.A04);
        if (A0E.exists()) {
            r1 = C62033Bj.A02(this.A00, this.A00, this.A02, this.A02, A0E);
        } else {
            r1 = null;
        }
        this.A01.ASr(r1);
    }
}
