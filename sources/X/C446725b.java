package X;

import android.view.View;

/* renamed from: X.25b  reason: invalid class name and case insensitive filesystem */
public class C446725b {
    public final View A00;
    public final C16740tZ A01;
    public final AnonymousClass25Z A02;
    public final AnonymousClass25V A03;
    public final Object A04;
    public final boolean A05;
    public final /* synthetic */ AnonymousClass25S A06;

    public C446725b(View view, C16740tZ r2, AnonymousClass25Z r3, AnonymousClass25V r4, AnonymousClass25S r5, Object obj, boolean z2) {
        this.A06 = r5;
        this.A01 = r2;
        this.A00 = view;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = obj;
        this.A05 = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.A11.equals(((C446725b) obj).A01.A11);
    }

    public int hashCode() {
        return this.A01.A11.hashCode();
    }
}
