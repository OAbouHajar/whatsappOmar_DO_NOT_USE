package X;

import android.content.Context;

/* renamed from: X.0cN  reason: invalid class name and case insensitive filesystem */
public final class C07730cN implements C13590md {
    public boolean A00;
    public final Context A01;
    public final C06190Uq A02;
    public final String A03;
    public final C15220qW A04;
    public final C15220qW A05;
    public final boolean A06;
    public final boolean A07;

    public C07730cN(Context context, C06190Uq r3, String str, boolean z2, boolean z3) {
        this.A01 = context;
        this.A03 = str;
        this.A02 = r3;
        this.A07 = z2;
        this.A06 = z3;
        C15220qW A002 = C32521gW.A00(new C11390ih(this));
        this.A05 = A002;
        this.A04 = A002;
    }

    public final AnonymousClass0AP A00() {
        return (AnonymousClass0AP) this.A04.getValue();
    }

    public void Af3(boolean z2) {
        if (this.A05.AIw()) {
            AnonymousClass0M6.A00(A00(), z2);
        }
        this.A00 = z2;
    }

    public void close() {
        if (this.A05.AIw()) {
            A00().close();
        }
    }
}
