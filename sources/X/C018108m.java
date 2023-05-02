package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.08m  reason: invalid class name and case insensitive filesystem */
public class C018108m {
    public AnonymousClass08Y A00;
    public AnonymousClass08Y A01;
    public final ImageView A02;

    public C018108m(ImageView imageView) {
        this.A02 = imageView;
    }

    public void A00() {
        ImageView imageView = this.A02;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C015307j.A02(drawable);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 <= 21 && i2 == 21) {
                AnonymousClass08Y r2 = this.A01;
                if (r2 == null) {
                    r2 = new AnonymousClass08Y();
                    this.A01 = r2;
                }
                r2.A00 = null;
                r2.A02 = false;
                r2.A01 = null;
                r2.A03 = false;
                ColorStateList A002 = C018708s.A00(imageView);
                if (A002 != null) {
                    r2.A02 = true;
                    r2.A00 = A002;
                }
                PorterDuff.Mode A012 = C018708s.A01(imageView);
                if (A012 != null) {
                    r2.A03 = true;
                    r2.A01 = A012;
                }
                if (r2.A02 || r2.A03) {
                    AnonymousClass06L.A03(drawable, r2, imageView.getDrawableState());
                    return;
                }
            }
            AnonymousClass08Y r1 = this.A00;
            if (r1 != null) {
                AnonymousClass06L.A03(drawable, r1, imageView.getDrawableState());
            }
        }
    }

    public void A01(int i2) {
        Drawable drawable;
        ImageView imageView = this.A02;
        if (i2 != 0) {
            drawable = AnonymousClass06L.A02().A05(imageView.getContext(), i2);
            if (drawable != null) {
                C015307j.A02(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        A00();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041 A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f A[Catch:{ all -> 0x0060 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.ImageView r7 = r10.A02
            android.content.Context r1 = r7.getContext()
            int[] r8 = X.AnonymousClass05L.A05
            r0 = 0
            r6 = r11
            r9 = r12
            X.07T r2 = X.AnonymousClass07T.A00(r1, r11, r8, r12, r0)
            android.content.Context r4 = r7.getContext()
            android.content.res.TypedArray r5 = r2.A02
            X.C004601z.A0N(r4, r5, r6, r7, r8, r9)
            android.graphics.drawable.Drawable r0 = r7.getDrawable()     // Catch:{ all -> 0x0060 }
            r4 = -1
            if (r0 != 0) goto L_0x0037
            r0 = 1
            int r3 = r5.getResourceId(r0, r4)     // Catch:{ all -> 0x0060 }
            if (r3 == r4) goto L_0x003a
            android.content.Context r1 = r7.getContext()     // Catch:{ all -> 0x0060 }
            X.06L r0 = X.AnonymousClass06L.A02()     // Catch:{ all -> 0x0060 }
            android.graphics.drawable.Drawable r0 = r0.A05(r1, r3)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x003a
            r7.setImageDrawable(r0)     // Catch:{ all -> 0x0060 }
        L_0x0037:
            X.C015307j.A02(r0)     // Catch:{ all -> 0x0060 }
        L_0x003a:
            r1 = 2
            boolean r0 = r5.hasValue(r1)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0048
            android.content.res.ColorStateList r0 = r2.A01(r1)     // Catch:{ all -> 0x0060 }
            X.C018808t.A00(r0, r7)     // Catch:{ all -> 0x0060 }
        L_0x0048:
            r0 = 3
            boolean r0 = r5.hasValue(r0)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005c
            r0 = 3
            int r1 = r5.getInt(r0, r4)     // Catch:{ all -> 0x0060 }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C015307j.A00(r0, r1)     // Catch:{ all -> 0x0060 }
            X.C018808t.A01(r0, r7)     // Catch:{ all -> 0x0060 }
        L_0x005c:
            r2.A04()
            return
        L_0x0060:
            r0 = move-exception
            r2.A04()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018108m.A02(android.util.AttributeSet, int):void");
    }

    public boolean A03() {
        return Build.VERSION.SDK_INT < 21 || !(this.A02.getBackground() instanceof RippleDrawable);
    }
}
