package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.39I  reason: invalid class name */
public class AnonymousClass39I {
    public C64473Ql A00;
    public final AnonymousClass4Bp A01;
    public final C57522rJ A02;
    public final C85414Oi A03;
    public volatile AnonymousClass0Fr A04;
    public volatile C02840Fl A05;
    public volatile C57562rN A06;
    public volatile List A07;

    public AnonymousClass39I(AnonymousClass4Bp r1, C57522rJ r2, C85414Oi r3) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
    }

    public void A00(int i2, int i3, boolean z2) {
        if (C62003Bg.A03()) {
            C85414Oi r1 = this.A03;
            RecyclerView recyclerView = r1.A06;
            if (recyclerView == null) {
                r1.A01 = i2;
                r1.A02 = i3;
                r1.A09 = z2;
            } else if (z2) {
                recyclerView.A0e(i2, i3);
            } else {
                recyclerView.scrollBy(i2, i3);
            }
        } else {
            throw AnonymousClass000.A0a("Cannot doScrollBy off the main thread!");
        }
    }

    public void A01(int i2, boolean z2) {
        if (C62003Bg.A03()) {
            C85414Oi r1 = this.A03;
            RecyclerView recyclerView = r1.A06;
            if (recyclerView == null) {
                r1.A00 = i2;
                r1.A08 = z2;
            } else if (z2) {
                recyclerView.A0a(i2);
            } else {
                recyclerView.A0Z(i2);
                C57522rJ r3 = this.A02;
                C31201dg r2 = r3.A03;
                C14930q1 A0H = r2.A0H(51);
                C14930q1 A0H2 = r2.A0H(97);
                if (A0H != null || A0H2 != null) {
                    AnonymousClass2rW.A00(r3.A06, r2, i2, false);
                }
            }
        } else {
            throw AnonymousClass000.A0a("Cannot doScrollTo off the main thread!");
        }
    }
}
