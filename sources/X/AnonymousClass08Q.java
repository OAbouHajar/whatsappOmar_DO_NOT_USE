package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: X.08Q  reason: invalid class name */
public class AnonymousClass08Q {
    public int A00 = -1;
    public AnonymousClass08Y A01;
    public AnonymousClass08Y A02;
    public AnonymousClass08Y A03;
    public final View A04;
    public final AnonymousClass06K A05;

    public AnonymousClass08Q(View view) {
        this.A04 = view;
        this.A05 = AnonymousClass06K.A01();
    }

    public void A00() {
        View view = this.A04;
        Drawable background = view.getBackground();
        if (background != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 <= 21 ? i2 == 21 : this.A02 != null) {
                AnonymousClass08Y r2 = this.A03;
                if (r2 == null) {
                    r2 = new AnonymousClass08Y();
                    this.A03 = r2;
                }
                r2.A00 = null;
                r2.A02 = false;
                r2.A01 = null;
                r2.A03 = false;
                ColorStateList A09 = C004601z.A09(view);
                if (A09 != null) {
                    r2.A02 = true;
                    r2.A00 = A09;
                }
                PorterDuff.Mode A0A = C004601z.A0A(view);
                if (A0A != null) {
                    r2.A03 = true;
                    r2.A01 = A0A;
                }
                if (r2.A02 || r2.A03) {
                    AnonymousClass06L.A03(background, r2, view.getDrawableState());
                    return;
                }
            }
            AnonymousClass08Y r1 = this.A01;
            if (r1 != null || (r1 = this.A02) != null) {
                AnonymousClass06L.A03(background, r1, view.getDrawableState());
            }
        }
    }

    public void A01() {
        this.A00 = -1;
        this.A02 = null;
        A00();
        A00();
    }

    public void A02(int i2) {
        ColorStateList A042;
        this.A00 = i2;
        AnonymousClass06K r2 = this.A05;
        if (r2 != null) {
            Context context = this.A04.getContext();
            synchronized (r2) {
                A042 = r2.A00.A04(context, i2);
            }
            if (A042 != null) {
                AnonymousClass08Y r1 = this.A02;
                if (r1 == null) {
                    r1 = new AnonymousClass08Y();
                    this.A02 = r1;
                }
                r1.A00 = A042;
                r1.A02 = true;
                A00();
                A00();
            }
        }
        this.A02 = null;
        A00();
        A00();
    }

    public void A03(ColorStateList colorStateList) {
        AnonymousClass08Y r1 = this.A01;
        if (r1 == null) {
            r1 = new AnonymousClass08Y();
            this.A01 = r1;
        }
        r1.A00 = colorStateList;
        r1.A02 = true;
        A00();
    }

    public void A04(PorterDuff.Mode mode) {
        AnonymousClass08Y r1 = this.A01;
        if (r1 == null) {
            r1 = new AnonymousClass08Y();
            this.A01 = r1;
        }
        r1.A01 = mode;
        r1.A03 = true;
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        r2.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.view.View r7 = r10.A04
            android.content.Context r0 = r7.getContext()
            int[] r8 = X.AnonymousClass05L.A0P
            r1 = 0
            r6 = r11
            r9 = r12
            X.07T r2 = X.AnonymousClass07T.A00(r0, r11, r8, r12, r1)
            android.content.Context r4 = r7.getContext()
            android.content.res.TypedArray r5 = r2.A02
            X.C004601z.A0N(r4, r5, r6, r7, r8, r9)
            boolean r0 = r5.hasValue(r1)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004e
            r0 = -1
            int r0 = r5.getResourceId(r1, r0)     // Catch:{ all -> 0x0075 }
            r10.A00 = r0     // Catch:{ all -> 0x0075 }
            X.06K r4 = r10.A05     // Catch:{ all -> 0x0075 }
            android.content.Context r3 = r7.getContext()     // Catch:{ all -> 0x0075 }
            int r1 = r10.A00     // Catch:{ all -> 0x0075 }
            monitor-enter(r4)     // Catch:{ all -> 0x0075 }
            X.06L r0 = r4.A00     // Catch:{ all -> 0x0038 }
            android.content.res.ColorStateList r0 = r0.A04(r3, r1)     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004e
            goto L_0x003b
        L_0x0038:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x003b:
            X.08Y r1 = r10.A02     // Catch:{ all -> 0x0075 }
            if (r1 != 0) goto L_0x0046
            X.08Y r1 = new X.08Y     // Catch:{ all -> 0x0075 }
            r1.<init>()     // Catch:{ all -> 0x0075 }
            r10.A02 = r1     // Catch:{ all -> 0x0075 }
        L_0x0046:
            r1.A00 = r0     // Catch:{ all -> 0x0075 }
            r0 = 1
            r1.A02 = r0     // Catch:{ all -> 0x0075 }
            r10.A00()     // Catch:{ all -> 0x0075 }
        L_0x004e:
            r1 = 1
            boolean r0 = r5.hasValue(r1)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x005c
            android.content.res.ColorStateList r0 = r2.A01(r1)     // Catch:{ all -> 0x0075 }
            X.C004601z.A0O(r0, r7)     // Catch:{ all -> 0x0075 }
        L_0x005c:
            r0 = 2
            boolean r0 = r5.hasValue(r0)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0071
            r1 = 2
            r0 = -1
            int r1 = r5.getInt(r1, r0)     // Catch:{ all -> 0x0075 }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C015307j.A00(r0, r1)     // Catch:{ all -> 0x0075 }
            X.C004601z.A0P(r0, r7)     // Catch:{ all -> 0x0075 }
        L_0x0071:
            r2.A04()
            return
        L_0x0075:
            r0 = move-exception
            r2.A04()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08Q.A05(android.util.AttributeSet, int):void");
    }
}
