package X;

import android.content.Context;
import android.os.Looper;
import android.support.v4.view.accessibility.AccessibilityEventCompat;

/* renamed from: X.4Oy  reason: invalid class name and case insensitive filesystem */
public final class C85564Oy {
    public Looper A00;
    public AnonymousClass5L6 A01;
    public AnonymousClass5L7 A02;
    public C88884bF A03;
    public C96224nz A04;
    public C89164bh A05;
    public AnonymousClass5LL A06;
    public AnonymousClass4GL A07;
    public AnonymousClass5LX A08;
    public AnonymousClass5TU A09;
    public final Context A0A;
    public final C108225Nd A0B;

    public C85564Oy(Context context, C108225Nd r13) {
        C96664oh r1 = new C96664oh();
        C65593Vj r4 = new C65593Vj(context);
        C97334pm r3 = new C97334pm(r1, new C97614qH(context));
        C96184nv r5 = new C96184nv(new C97574qD(AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED), 50000, 50000, 2500, 5000);
        AnonymousClass3E2 A002 = AnonymousClass3E2.A00(context);
        AnonymousClass5TU r12 = AnonymousClass5TU.A00;
        C96224nz r0 = new C96224nz(r12);
        this.A0A = context;
        this.A0B = r13;
        this.A07 = r4;
        this.A06 = r3;
        this.A02 = r5;
        this.A08 = A002;
        this.A04 = r0;
        Looper myLooper = Looper.myLooper();
        this.A00 = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.A05 = C89164bh.A02;
        this.A03 = C88884bF.A02;
        this.A01 = new C96174nu();
        this.A09 = r12;
    }
}
