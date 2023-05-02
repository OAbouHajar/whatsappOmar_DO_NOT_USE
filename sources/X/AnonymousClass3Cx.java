package X;

import android.view.View;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.3Cx  reason: invalid class name */
public class AnonymousClass3Cx implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C606734v A02;
    public final /* synthetic */ WebPagePreviewView A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass3Cx(View view, View view2, C606734v r3, WebPagePreviewView webPagePreviewView, boolean z2) {
        this.A02 = r3;
        this.A03 = webPagePreviewView;
        this.A00 = view;
        this.A01 = view2;
        this.A04 = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayoutChange(android.view.View r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30) {
        /*
            r21 = this;
            r3 = r21
            r0 = r22
            r0.removeOnLayoutChangeListener(r3)
            com.obwhatsapp.webpagepreview.WebPagePreviewView r9 = r3.A03
            android.widget.LinearLayout r0 = r9.A0E
            int r12 = r0.getHeight()
            X.34v r8 = r3.A02
            X.1cc r1 = r8.A0c
            java.lang.String r0 = r1.A13()
            if (r0 == 0) goto L_0x0023
            X.1cv r0 = r1.A0U
            if (r0 != 0) goto L_0x003b
            byte[] r0 = r1.A17()
            if (r0 != 0) goto L_0x003b
        L_0x0023:
            r5 = 0
        L_0x0024:
            r10 = 0
            if (r5 == 0) goto L_0x0039
            int r10 = r5.getWidth()
            int r11 = r5.getHeight()
        L_0x002f:
            android.view.View r6 = r3.A00
            android.view.View r7 = r3.A01
            boolean r13 = r3.A04
            X.C606734v.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0039:
            r11 = 0
            goto L_0x002f
        L_0x003b:
            java.lang.String r0 = r1.A13()
            int r2 = X.C47622Js.A01(r0)
            r0 = 250(0xfa, float:3.5E-43)
            if (r2 >= r0) goto L_0x0023
            android.util.DisplayMetrics r4 = r8.A04
            int r0 = r4.heightPixels
            float r2 = (float) r0
            float r0 = r4.density
            float r2 = r2 / r0
            r0 = 1142947840(0x44200000, float:640.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0023
            android.content.Context r0 = r8.A01()
            android.content.res.Resources r2 = r0.getResources()
            r0 = 2131167120(0x7f070790, float:1.7948505E38)
            int r4 = r2.getDimensionPixelSize(r0)
            android.view.View r0 = r8.A0Q
            int r2 = r0.getHeight()
            com.obwhatsapp.TextEmojiLabel r0 = r8.A0V
            int r0 = r0.getHeight()
            int r2 = r2 - r0
            int r2 = r2 - r12
            if (r2 < r4) goto L_0x0023
            X.1cv r4 = r1.A0U
            if (r4 == 0) goto L_0x00aa
            int r5 = r4.A01
            if (r5 <= 0) goto L_0x00aa
            int r0 = r4.A00
            if (r0 <= 0) goto L_0x00aa
            int r0 = r8.A0N
            float r2 = (float) r0
            android.util.DisplayMetrics r0 = r8.A04
            float r0 = r0.density
            float r2 = r2 / r0
            int r0 = (int) r2
            if (r5 < r0) goto L_0x00aa
            boolean r0 = r8.A0j
            if (r0 == 0) goto L_0x00aa
            android.view.View r14 = r3.A00
            android.view.View r15 = r3.A01
            boolean r0 = r3.A04
            X.52b r13 = new X.52b
            r16 = r4
            r17 = r8
            r18 = r9
            r19 = r12
            r20 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            X.1Ld r0 = r8.A0f
            r0.A07(r9, r1, r13)
            return
        L_0x00aa:
            byte[] r0 = r1.A17()
            r5 = 0
            if (r0 == 0) goto L_0x0024
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x0024 }
            r4.<init>()     // Catch:{ OutOfMemoryError -> 0x0024 }
            r0 = 1
            r4.inDither = r0     // Catch:{ OutOfMemoryError -> 0x0024 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ OutOfMemoryError -> 0x0024 }
            r4.inPreferredConfig = r0     // Catch:{ OutOfMemoryError -> 0x0024 }
            byte[] r2 = r1.A17()     // Catch:{ OutOfMemoryError -> 0x0024 }
            r1 = 0
            int r0 = r2.length     // Catch:{ OutOfMemoryError -> 0x0024 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r2, r1, r0, r4)     // Catch:{ OutOfMemoryError -> 0x0024 }
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Cx.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
