package X;

import android.content.Context;

/* renamed from: X.4da  reason: invalid class name and case insensitive filesystem */
public class C90154da {
    public static volatile C90154da A0D;
    public final Context A00;
    public final AnonymousClass01m A01;
    public final AnonymousClass1MO A02;
    public final AnonymousClass4YX A03;
    public final AnonymousClass45X A04;
    public final C83354Gi A05;
    public final C23271Bi A06;
    public final C88454aX A07;
    public final C25901Lo A08;
    public final C807045d A09;
    public final C25261Jc A0A;
    public final AnonymousClass1JY A0B;
    public final AnonymousClass1JR A0C;

    public C90154da(Context context, AnonymousClass01m r3, AnonymousClass1MO r4, AnonymousClass4YX r5, AnonymousClass45X r6, C23271Bi r7, C88454aX r8, C25901Lo r9, C807045d r10, C25261Jc r11, AnonymousClass1JY r12, AnonymousClass1JR r13, AnonymousClass4HE r14) {
        this.A00 = context;
        this.A0A = r11;
        this.A04 = r6;
        this.A09 = r10;
        this.A0B = r12;
        this.A06 = r7;
        this.A08 = r9;
        this.A07 = r8;
        this.A02 = r4;
        this.A0C = r13;
        this.A03 = r5;
        this.A01 = r3;
        this.A05 = new C83354Gi(r14);
    }

    public static C90154da A00() {
        if (A0D == null) {
            synchronized (C90154da.class) {
                if (A0D == null) {
                    throw AnonymousClass000.A0V("Can't find bloks instance. Is it initialized?");
                }
            }
        }
        return A0D;
    }

    public static AnonymousClass4K0 A01(AnonymousClass4CE r2) {
        return new AnonymousClass4K0(r2.A00, new AnonymousClass45V());
    }

    public Context A02() {
        return this.A00;
    }

    public AnonymousClass01m A03() {
        return this.A01;
    }

    public AnonymousClass1MO A04() {
        return this.A02;
    }

    public C88454aX A05() {
        return this.A07;
    }

    public AnonymousClass1JR A06() {
        AnonymousClass1JR r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0V("No child attribute mapper configured. Unexpectedly attempting to traverse children nodes.");
    }
}
