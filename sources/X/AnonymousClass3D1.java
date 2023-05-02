package X;

import android.view.View;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.3D1  reason: invalid class name */
public class AnonymousClass3D1 implements View.OnTouchListener {
    public float A00;
    public float A01;
    public final /* synthetic */ VoipCallControlBottomSheetV2 A02;

    public AnonymousClass3D1(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        this.A02 = voipCallControlBottomSheetV2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r4 = r10.A02
            X.2Tr r0 = r4.A0H
            r3 = 1
            if (r0 == 0) goto L_0x008d
            boolean r2 = r0.A08()
            X.2PE r0 = r4.A0Z
            if (r0 == 0) goto L_0x014b
            com.whatsapp.voipcalling.VoipActivityV2 r1 = r0.A00
            boolean r0 = r1.A22
            if (r0 != 0) goto L_0x0025
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = r1.A1L
            if (r0 != 0) goto L_0x0025
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r1.A0t
            if (r0 == 0) goto L_0x014b
            X.027 r0 = r0.A08
            java.lang.Object r0 = r0.A01()
            if (r0 == 0) goto L_0x014b
        L_0x0025:
            r8 = 1
        L_0x0026:
            float r6 = r12.getX()
            float r5 = r12.getY()
            X.00l r0 = r4.A0C()
            if (r0 == 0) goto L_0x008e
            if (r2 != 0) goto L_0x008e
            int r0 = com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A01(r4)
            float r0 = (float) r0
            float r0 = r0 + r5
            r12.setLocation(r6, r0)
            X.00l r0 = r4.A0C()
            r0.dispatchTouchEvent(r12)
            X.2PE r1 = r4.A0Z
            if (r1 == 0) goto L_0x008e
            r0 = 4
            android.view.View[] r7 = new android.view.View[r0]
            com.whatsapp.voipcalling.VoipActivityV2 r2 = r1.A00
            android.widget.ImageButton r1 = r2.A0T
            r0 = 0
            r7[r0] = r1
            android.view.View r0 = r2.A0P
            r7[r3] = r0
            android.view.ViewGroup r1 = r2.A0S
            r0 = 2
            r7[r0] = r1
            com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner r1 = r2.A0s
            r0 = 3
            r7[r0] = r1
            java.util.List r0 = java.util.Arrays.asList(r7)
            android.graphics.Rect r7 = X.AnonymousClass000.A0J()
            java.util.Iterator r2 = r0.iterator()
        L_0x006e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r2.next()
            android.view.View r0 = (android.view.View) r0
            r0.getGlobalVisibleRect(r7)
            float r0 = r12.getX()
            int r1 = (int) r0
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r0 = r7.contains(r1, r0)
            if (r0 == 0) goto L_0x006e
        L_0x008d:
            return r3
        L_0x008e:
            if (r8 != 0) goto L_0x008d
            int r0 = r12.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x00f6
            r10.A00 = r6
            r10.A01 = r5
        L_0x009b:
            com.obwhatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r4.A0O
            if (r0 == 0) goto L_0x011f
            X.2Tr r0 = r4.A0H
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x011f
            int r0 = r12.getAction()
            if (r0 == r3) goto L_0x00b3
            int r0 = r12.getAction()
            if (r0 != 0) goto L_0x011f
        L_0x00b3:
            com.obwhatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r1 = r4.A0O
            android.view.View r0 = r4.A07
            int r0 = r0.getTop()
            float r8 = (float) r0
            float r8 = r8 - r5
            int r7 = r12.getAction()
            int r0 = r1.A02
            if (r0 != 0) goto L_0x00d2
            android.content.res.Resources r9 = r1.getResources()
            r0 = 2131165445(0x7f070105, float:1.7945107E38)
            int r0 = r9.getDimensionPixelSize(r0)
            r1.A02 = r0
        L_0x00d2:
            int r0 = r1.getLeft()
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x011c
            int r0 = r1.getRight()
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x011c
            int r0 = r1.A02
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x011c
            boolean r0 = r1.A02(r7)
            if (r0 == 0) goto L_0x011f
            r10.A00 = r2
            r10.A01 = r2
            return r3
        L_0x00f6:
            int r1 = r12.getAction()
            r0 = 2
            if (r1 != r0) goto L_0x009b
            float r0 = r10.A00
            float r0 = r6 - r0
            float r0 = java.lang.Math.abs(r0)
            float r1 = r4.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0117
            float r0 = r10.A01
            float r0 = r5 - r0
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
        L_0x0117:
            r10.A00 = r2
            r10.A01 = r2
            goto L_0x009b
        L_0x011c:
            r0 = 0
            r1.A06 = r0
        L_0x011f:
            int r0 = r12.getAction()
            if (r0 != r3) goto L_0x008d
            float r0 = r10.A00
            float r6 = r6 - r0
            float r0 = java.lang.Math.abs(r6)
            float r1 = r4.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x008d
            float r0 = r10.A01
            float r5 = r5 - r0
            float r0 = java.lang.Math.abs(r5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x008d
            com.obwhatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r4.A0J
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x008d
            r10.A00 = r2
            r10.A01 = r2
            r4.A1N()
            return r3
        L_0x014b:
            r8 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3D1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
