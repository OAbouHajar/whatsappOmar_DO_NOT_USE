package X;

import android.view.View;
import com.obwhatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet;

/* renamed from: X.26f  reason: invalid class name and case insensitive filesystem */
public class C449126f {
    public View A00;
    public final C14710pd A01;
    public final AnonymousClass1BL A02;
    public final C17110uY A03;

    public C449126f(C14710pd r1, AnonymousClass1BL r2, C17110uY r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r2 != 400) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.widget.ListView r7, X.AnonymousClass01A r8) {
        /*
            r6 = this;
            r2 = 2131558984(0x7f0d0248, float:1.87433E38)
            boolean r0 = r6.A03(r8)
            if (r0 == 0) goto L_0x0065
            android.view.LayoutInflater r1 = r8.A05()
            r0 = 0
            android.view.View r1 = r1.inflate(r2, r7, r0)
            r6.A00 = r1
            r0 = 2131363352(0x7f0a0618, float:1.834651E38)
            android.view.View r5 = X.C004601z.A0E(r1, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r8 instanceof X.C14780pk
            if (r0 == 0) goto L_0x003c
            r0 = r8
            X.0pk r0 = (X.C14780pk) r0
            int r2 = r0.AGS()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x003c
            r0 = 300(0x12c, float:4.2E-43)
            r1 = 2131891847(0x7f121687, float:1.9418426E38)
            if (r2 == r0) goto L_0x003f
            r0 = 400(0x190, float:5.6E-43)
            r1 = 2131890809(0x7f121279, float:1.941632E38)
            if (r2 == r0) goto L_0x003f
        L_0x003c:
            r1 = 2131890811(0x7f12127b, float:1.9416324E38)
        L_0x003f:
            java.lang.String r4 = r8.A0J(r1)
            X.0uY r3 = r6.A03
            r2 = 2131101273(0x7f060659, float:1.7814951E38)
            r0 = 45
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r1 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r1.<init>(r6, r0, r8)
            java.lang.String r0 = "%s"
            android.text.SpannableStringBuilder r0 = r3.A07(r1, r4, r0, r2)
            r5.setText(r0)
            X.3MF r0 = new X.3MF
            r0.<init>()
            r5.setMovementMethod(r0)
            android.view.View r0 = r6.A00
            r7.addFooterView(r0)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C449126f.A00(android.widget.ListView, X.01A):void");
    }

    public void A01(AnonymousClass01A r5) {
        View view;
        C14710pd r3 = this.A01;
        C16620tM r1 = C16620tM.A02;
        if (r3.A0E(r1, 1071) && (view = this.A00) != null && view.getVisibility() == 0 && r5.A0j && r3.A0E(r1, 1071)) {
            int i2 = 8;
            if (r5 instanceof C14780pk) {
                int AGS = ((C14780pk) r5).AGS();
                if (Integer.valueOf(AGS) != null) {
                    if (AGS == 400) {
                        i2 = 6;
                    } else if (AGS == 200) {
                        i2 = 7;
                    }
                }
            }
            this.A02.A00(i2, 0);
        }
    }

    public void A02(AnonymousClass01A r5) {
        C001000l A0C = r5.A0C();
        if (A0C instanceof C14550pN) {
            C14550pN r3 = (C14550pN) A0C;
            int i2 = 7;
            if (r5 instanceof C14780pk) {
                int AGS = ((C14780pk) r5).AGS();
                if (Integer.valueOf(AGS) != null) {
                    if (AGS == 300) {
                        i2 = 8;
                    } else if (AGS == 400) {
                        i2 = 6;
                    }
                }
            }
            r3.Afc(E2EEDescriptionBottomSheet.A01(i2));
        }
    }

    public boolean A03(AnonymousClass01A r5) {
        C14710pd r2;
        int i2;
        if (!(r5 instanceof C14780pk)) {
            return false;
        }
        int AGS = ((C14780pk) r5).AGS();
        if (Integer.valueOf(AGS) == null) {
            return false;
        }
        if (AGS == 200) {
            r2 = this.A01;
            i2 = 2212;
        } else if (AGS == 300) {
            r2 = this.A01;
            i2 = 2213;
        } else if (AGS != 400) {
            return false;
        } else {
            r2 = this.A01;
            i2 = 2214;
        }
        return r2.A0E(C16620tM.A02, i2);
    }
}
