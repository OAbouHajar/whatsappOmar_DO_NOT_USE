package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.1BY  reason: invalid class name */
public class AnonymousClass1BY {
    public AnonymousClass37A A00;
    public final C23241Ba A01;
    public final AnonymousClass12W A02;
    public final C14730pf A03;
    public final C16490t9 A04;
    public final C23251Bb A05;
    public final AnonymousClass1Bc A06;
    public final C16320sq A07;

    public AnonymousClass1BY(C23241Ba r1, AnonymousClass12W r2, C14730pf r3, C16490t9 r4, C23251Bb r5, AnonymousClass1Bc r6, C16320sq r7) {
        this.A07 = r7;
        this.A04 = r4;
        this.A01 = r1;
        this.A03 = r3;
        this.A05 = r5;
        this.A02 = r2;
        this.A06 = r6;
    }

    public Pair A00() {
        String obj = UUID.randomUUID().toString();
        C74493qd r1 = new C74493qd();
        r1.A00 = obj;
        this.A04.A06(r1);
        return new Pair("anid", obj);
    }

    public void A01(C14550pN r18, AnonymousClass1Y3 r19, C16050sL r20, String str, String str2, String str3, String str4, ArrayList arrayList, List list, boolean z2) {
        AnonymousClass37A r0 = this.A00;
        if (r0 != null && r0.A03() == 1) {
            this.A00.A06(false);
        }
        AnonymousClass4NU r4 = new AnonymousClass4NU(r18, this, str2, str3, arrayList);
        AnonymousClass1Y3 r8 = r19;
        C16050sL r9 = r20;
        AnonymousClass37A r42 = new AnonymousClass37A(A00(), this.A02, this.A03, r8, r9, r4, this.A05, this.A06, str, str4, list, z2);
        this.A00 = r42;
        this.A07.Ack(r42, new Void[0]);
    }
}
