package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1ZK;
import X.AnonymousClass1ZL;
import X.C28961Zl;
import X.C30211bx;
import X.C30221by;
import X.C84934Ml;
import android.widget.TextView;

public class IDxUCallbackShape350S0100000_2_I0 implements C30221by {
    public Object A00;
    public final int A01;

    public IDxUCallbackShape350S0100000_2_I0(AnonymousClass1ZK r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public final void A5q(Object obj) {
        switch (this.A01) {
            case 0:
                AnonymousClass1ZK r1 = (AnonymousClass1ZK) this.A00;
                if (AnonymousClass000.A1X(obj)) {
                    r1.A09();
                } else {
                    r1.A0A();
                }
                r1.A0B();
                return;
            case 1:
                AnonymousClass1ZK r0 = (AnonymousClass1ZK) this.A00;
                boolean A1X = AnonymousClass000.A1X(obj);
                AnonymousClass1ZL r5 = r0.A1G;
                C30211bx r02 = r0.A0N;
                if (r02 != null) {
                    int A02 = r02.A02();
                    boolean A0D = r02.A0D();
                    int A03 = r02.A03();
                    if (A1X) {
                        A02 = 0;
                        A0D = false;
                    }
                    r5.A04.setProgress(A02);
                    r5.A03.setPlaybackPercentage(((float) A02) / ((float) A03));
                    r5.A02(A0D ? (long) A02 : (long) A03);
                    return;
                }
                return;
            default:
                AnonymousClass1ZK r6 = (AnonymousClass1ZK) this.A00;
                int A0D2 = AnonymousClass000.A0D(obj);
                if (A0D2 != r6.A04) {
                    C84934Ml r4 = r6.A1M;
                    boolean z2 = r6.A0W;
                    String A04 = C28961Zl.A04(r4.A03, (long) A0D2);
                    r4.A01.setText(A04);
                    TextView textView = r4.A00;
                    textView.setText(A04);
                    if (z2) {
                        textView.setVisibility(4);
                    }
                    r6.A04 = A0D2;
                    return;
                }
                return;
        }
    }
}
