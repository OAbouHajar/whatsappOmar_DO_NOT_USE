package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.3A5  reason: invalid class name */
public class AnonymousClass3A5 {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002a, code lost:
        if (r1 != 29) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass2BE A00(X.C16730tY r11, X.C25791Ld r12) {
        /*
            r3 = r11
            X.0ta r0 = r11.A02
            if (r0 == 0) goto L_0x002c
            java.io.File r5 = r0.A0F
            if (r5 == 0) goto L_0x002c
            byte r1 = r11.A10
            r0 = 1
            if (r1 == r0) goto L_0x0071
            r0 = 2
            if (r1 == r0) goto L_0x0062
            r0 = 3
            if (r1 == r0) goto L_0x0053
            r0 = 9
            if (r1 == r0) goto L_0x0043
            r0 = 13
            if (r1 == r0) goto L_0x0034
            r0 = 25
            if (r1 == r0) goto L_0x0071
            r0 = 26
            if (r1 == r0) goto L_0x0043
            r0 = 28
            if (r1 == r0) goto L_0x0053
            r0 = 29
            if (r1 == r0) goto L_0x0034
        L_0x002c:
            long r0 = r11.A0I
            X.3t5 r2 = new X.3t5
            r2.<init>(r11, r0)
            return r2
        L_0x0034:
            long r9 = r11.A0I
            int r0 = r11.A00
            long r0 = (long) r0
            X.3t7 r2 = new X.3t7
            r6 = r2
            r7 = r11
            r8 = r5
            r11 = r0
            r6.<init>(r7, r8, r9, r11)
            return r2
        L_0x0043:
            X.1rA r3 = (X.C38631rA) r3
            long r7 = r3.A0I
            int r0 = r3.A00
            long r9 = (long) r0
            java.lang.String r6 = r3.A06
            X.3t9 r2 = new X.3t9
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r9)
            return r2
        L_0x0053:
            long r9 = r11.A0I
            int r0 = r11.A00
            long r0 = (long) r0
            X.3t8 r2 = new X.3t8
            r6 = r2
            r7 = r11
            r8 = r5
            r11 = r0
            r6.<init>(r7, r8, r9, r11)
            return r2
        L_0x0062:
            long r9 = r11.A0I
            int r0 = r11.A00
            long r0 = (long) r0
            X.3t6 r2 = new X.3t6
            r6 = r2
            r7 = r11
            r8 = r5
            r11 = r0
            r6.<init>(r7, r8, r9, r11)
            return r2
        L_0x0071:
            long r0 = r11.A0I
            X.3t4 r2 = new X.3t4
            r2.<init>(r11, r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3A5.A00(X.0tY, X.1Ld):X.2BE");
    }

    public static void A01(Bitmap bitmap, Drawable drawable, AnonymousClass2BF r8, C54502hd r9, int i2, boolean z2) {
        int i3;
        C16730tY r0;
        Context context = r9.getContext();
        if (bitmap == null) {
            r9.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int type = r8.getType();
            if (type == 0) {
                r9.setBackgroundColor(i2);
                i3 = R.drawable.ic_missing_thumbnail_picture;
            } else if (type == 1 || type == 2) {
                r9.setBackgroundColor(i2);
                i3 = R.drawable.ic_missing_thumbnail_video;
            } else if (type == 3) {
                AnonymousClass2BF r1 = r9.A05;
                if (!(r1 instanceof AnonymousClass2BE) || (r0 = ((AnonymousClass2BE) r1).A03) == null || r0.A08 != 1) {
                    C13680ns.A0u(context, r9, R.color.color0579);
                    i3 = R.drawable.icon_audio_large;
                } else {
                    C13680ns.A0u(context, r9, R.color.right_icon);
                    i3 = R.drawable.icon_ppt_large;
                }
            } else if (type != 4) {
                r9.setBackgroundColor(i2);
                r9.setImageResource(0);
                return;
            } else {
                r9.setBackgroundColor(i2);
                r9.setImageDrawable(AnonymousClass4Y6.A01(context, r8.ADk(), (String) null, true));
                return;
            }
            r9.setImageResource(i3);
            return;
        }
        r9.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r9.setBackgroundColor(0);
        r9.A00 = bitmap;
        if (z2) {
            Drawable[] drawableArr = new Drawable[2];
            drawableArr[0] = drawable;
            C13680ns.A1E(r9, new BitmapDrawable(context.getResources(), bitmap), drawableArr);
            return;
        }
        r9.setImageBitmap(bitmap);
    }
}
