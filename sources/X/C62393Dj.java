package X;

import com.obwhatsapp.notification.PopupNotification;

/* renamed from: X.3Dj  reason: invalid class name and case insensitive filesystem */
public class C62393Dj implements C015507l {
    public final /* synthetic */ PopupNotification A00;

    public C62393Dj(PopupNotification popupNotification) {
        this.A00 = popupNotification;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r4 = r6.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AUN(int r7) {
        /*
            r6 = this;
            r5 = 1
            if (r7 != r5) goto L_0x0008
            com.obwhatsapp.notification.PopupNotification r0 = r6.A00
            r0.A1R = r5
        L_0x0007:
            return
        L_0x0008:
            if (r7 != 0) goto L_0x0007
            com.obwhatsapp.notification.PopupNotification r4 = r6.A00
            java.lang.Integer r0 = r4.A1K
            if (r0 == 0) goto L_0x0007
            java.util.List r1 = r4.A1O
            int r0 = r0.intValue()
            r1.remove(r0)
            java.lang.Integer r0 = r4.A1K
            int r1 = r0.intValue()
            java.util.List r0 = r4.A1O
            int r0 = r0.size()
            if (r1 < r0) goto L_0x0034
            java.lang.Integer r0 = r4.A1K
            int r0 = r0.intValue()
            int r0 = r0 - r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A1K = r0
        L_0x0034:
            X.3TI r0 = r4.A0S
            r0.A06()
            com.obwhatsapp.notification.PopupNotificationViewPager r3 = r4.A12
            X.3TI r2 = r4.A0S
            java.lang.Integer r0 = r4.A1K
            int r1 = r0.intValue()
            r3.setAdapter(r2)
            r0 = 0
            r3.A0F(r1, r0)
            com.obwhatsapp.notification.PopupNotificationViewPager r0 = r4.A12
            int r0 = r0.getCurrentItem()
            r4.A2s(r0)
            java.util.List r0 = r4.A1O
            int r0 = r0.size()
            if (r0 != r5) goto L_0x005e
            r4.A2n()
        L_0x005e:
            r0 = 0
            r4.A1K = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62393Dj.AUN(int):void");
    }

    public void AUO(int i2, float f2, int i3) {
        PopupNotification popupNotification = this.A00;
        if (popupNotification.A1R) {
            popupNotification.A15.A01(true);
            C16740tZ r0 = popupNotification.A18;
            if (r0 != null) {
                popupNotification.A1N.add(r0.A11);
            }
            C16010sH r2 = popupNotification.A0q;
            if (r2 != null) {
                popupNotification.A1L.add(r2.A08(C15830rv.class));
            }
        }
    }

    public void AUP(int i2) {
        PopupNotification popupNotification = this.A00;
        if (popupNotification.A1K == null) {
            popupNotification.A2s(popupNotification.A12.getCurrentItem());
        }
    }
}
