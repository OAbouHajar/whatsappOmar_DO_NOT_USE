package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.3AT  reason: invalid class name */
public final class AnonymousClass3AT {
    public C30271c3 A00;
    public C30271c3 A01;
    public C30271c3 A02;
    public C34641kb A03 = C34641kb.of();
    public C17930vs A04 = C17930vs.of();
    public final AnonymousClass4XE A05;

    public AnonymousClass3AT(AnonymousClass4XE r2) {
        this.A05 = r2;
    }

    public static C30271c3 A00(AnonymousClass2PT r10, AnonymousClass4XE r11, C30271c3 r12, C34641kb r13) {
        Timeline ABV = r10.ABV();
        int ABP = r10.ABP();
        boolean A0C = ABV.A0C();
        Object A0B = A0C ? null : ABV.A0B(ABP);
        int A022 = (r10.AJS() || A0C) ? -1 : ABV.A08(r11, ABP, false).A02(C90604eR.A01(r10.ABQ()) - r11.A02);
        for (int i2 = 0; i2 < r13.size(); i2++) {
            C30271c3 r7 = (C30271c3) r13.get(i2);
            boolean AJS = r10.AJS();
            int ABI = r10.ABI();
            int ABJ = r10.ABJ();
            if (r7.A04.equals(A0B)) {
                int i3 = r7.A00;
                if (AJS) {
                    if (i3 == ABI && r7.A01 == ABJ) {
                    }
                } else if (i3 == -1 && r7.A02 == A022) {
                }
                return r7;
            }
        }
        if (r13.isEmpty() && r12 != null) {
            boolean AJS2 = r10.AJS();
            int ABI2 = r10.ABI();
            int ABJ2 = r10.ABJ();
            if (r12.A04.equals(A0B)) {
                int i4 = r12.A00;
                if (!AJS2 ? !(i4 == -1 && r12.A02 == A022) : !(i4 == ABI2 && r12.A01 == ABJ2)) {
                    return null;
                }
                return r12;
            }
        }
        return null;
    }

    public final void A01(Timeline timeline) {
        boolean contains;
        AnonymousClass1C5 builder = C17930vs.builder();
        if (this.A03.isEmpty()) {
            A02(timeline, this.A01, builder);
            if (!AnonymousClass45Q.A00(this.A02, this.A01)) {
                A02(timeline, this.A02, builder);
            }
            if (!AnonymousClass45Q.A00(this.A00, this.A01)) {
                contains = AnonymousClass45Q.A00(this.A00, this.A02);
            }
            this.A04 = builder.build();
        }
        for (int i2 = 0; i2 < this.A03.size(); i2++) {
            A02(timeline, (C30271c3) this.A03.get(i2), builder);
        }
        contains = this.A03.contains(this.A00);
        if (!contains) {
            A02(timeline, this.A00, builder);
        }
        this.A04 = builder.build();
    }

    public final void A02(Timeline timeline, C30271c3 r4, AnonymousClass1C5 r5) {
        if (r4 != null) {
            int A042 = timeline.A04(r4.A04);
            Object obj = timeline;
            if (A042 == -1) {
                Object obj2 = this.A04.get(r4);
                obj = obj2;
                if (obj2 == null) {
                    return;
                }
            }
            r5.put(r4, obj);
        }
    }
}
