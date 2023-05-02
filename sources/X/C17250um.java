package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.redex.IDxProviderShape156S0100000_2_I0;
import com.obwhatsapp.emoji.EmojiDescriptor;
import com.obwhatsapp.yo.yo;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0um  reason: invalid class name and case insensitive filesystem */
public class C17250um {
    public static final Set A07 = new HashSet();
    public static final String[] A08 = {"➕", "➖", "➗", "✖️", "🟰", "♾️", "💲", "💱", "™️", "©️", "®️", "👁️‍🗨️", "🔚", "🔙", "🔛", "🔝", "🔜", "〰️", "➰", "➿", "✔️"};
    public final C16980tz A00;
    public final AnonymousClass1QR A01;
    public final C434620c A02 = new C434620c();
    public final C434620c A03 = new C434620c();
    public final C14710pd A04;
    public final AnonymousClass1QQ A05;
    public final AnonymousClass01D A06;

    public C17250um(C16980tz r4, AnonymousClass1QR r5, C14710pd r6, AnonymousClass1QQ r7) {
        this.A00 = r4;
        this.A04 = r6;
        this.A01 = r5;
        this.A05 = r7;
        this.A06 = new AnonymousClass01T((Object) null, new IDxProviderShape156S0100000_2_I0(r4, 22));
    }

    public static void A00(Resources resources, ImageView imageView, C17250um r8, int[] iArr) {
        C17250um r0 = r8;
        imageView.setImageDrawable(r0.A04(resources, new C434420a(iArr), 0.75f, -1));
    }

    public static C17250um A21() {
        return (C17250um) yo.mSingletonC.A7e.get();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v3, types: [int] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.BitmapDrawable A01(android.content.res.Resources r12, X.C434720d r13, X.C434620c r14, X.C434820e r15) {
        /*
            r11 = this;
            int[] r7 = r13.A00
            int r1 = r7.length
            r8 = 0
            r0 = 1
            if (r1 != r0) goto L_0x00c7
            X.0pd r2 = r11.A04
            r1 = 2572(0xa0c, float:3.604E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r6 = 0
            if (r0 == 0) goto L_0x0046
            X.0tz r0 = r11.A00
            android.content.Context r0 = r0.A00
            boolean r0 = X.C434920f.A09(r0)
            if (r0 == 0) goto L_0x0046
            java.util.Set r5 = A07
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0042
            java.lang.String[] r4 = A08
            int r3 = r4.length
        L_0x0029:
            if (r6 >= r3) goto L_0x0042
            r0 = r4[r6]
            X.20g r1 = new X.20g
            r1.<init>(r0)
            r0 = 0
            long r0 = com.obwhatsapp.emoji.EmojiDescriptor.A00(r1, r0)
            X.20d r2 = new X.20d
            r2.<init>((long) r0)
            r5.add(r2)
            int r6 = r6 + 1
            goto L_0x0029
        L_0x0042:
            boolean r6 = r5.contains(r13)
        L_0x0046:
            android.graphics.Bitmap r1 = r14.A00(r13, r6)
            if (r1 == 0) goto L_0x0052
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r12, r1)
            return r0
        L_0x0052:
            if (r15 == 0) goto L_0x00c7
            r0 = 0
            r0 = r7[r0]
            android.graphics.Bitmap r7 = r15.AKD(r12, r0)
            if (r7 == 0) goto L_0x00c7
            if (r6 == 0) goto L_0x00be
            X.0tz r0 = r11.A00
            android.content.Context r0 = r0.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166040(0x7f070358, float:1.7946314E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r8 = (float) r0
            X.01D r0 = r11.A06
            java.lang.Object r9 = r0.get()
            android.graphics.ColorFilter r9 = (android.graphics.ColorFilter) r9
            int r2 = r7.getWidth()
            int r1 = r7.getHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r5)
            r0 = 1
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r0)
            r3.setColorFilter(r9)
            double r0 = (double) r8
            r9 = 4604544271217743214(0x3fe6a09e667e556e, double:0.70710678118)
            double r0 = r0 * r9
            float r2 = (float) r0
            float r0 = -r2
            r4.drawBitmap(r7, r0, r0, r3)
            r4.drawBitmap(r7, r2, r0, r3)
            r4.drawBitmap(r7, r0, r2, r3)
            r4.drawBitmap(r7, r2, r2, r3)
            float r0 = -r8
            r1 = 0
            r4.drawBitmap(r7, r0, r1, r3)
            r4.drawBitmap(r7, r1, r0, r3)
            r4.drawBitmap(r7, r8, r1, r3)
            r4.drawBitmap(r7, r1, r8, r3)
            r0 = 0
            r3.setColorFilter(r0)
            r4.drawBitmap(r7, r1, r1, r3)
            r7 = r5
        L_0x00be:
            r14.A01(r7, r13, r6)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r12, r7)
            return r0
        L_0x00c7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17250um.A01(android.content.res.Resources, X.20d, X.20c, X.20e):android.graphics.drawable.BitmapDrawable");
    }

    public Drawable A02(Resources resources, AnonymousClass20Z r5, C434520b r6, long j2) {
        C434720d A062 = A06(r6, j2);
        if (A062 == null) {
            return null;
        }
        C434620c r1 = this.A02;
        Drawable A032 = A03(resources, A062, r1, (C434820e) null);
        if (A032 != null) {
            return A032;
        }
        Drawable A033 = A03(resources, A062, r1, new C435220j(r5, this));
        if (A033 != null) {
            return A033;
        }
        return A03(resources, A062, this.A03, new C435320k(this));
    }

    public final Drawable A03(Resources resources, C434720d r11, C434620c r12, C434820e r13) {
        int[] iArr = r11.A00;
        int length = iArr.length;
        if (length == 1) {
            return A01(resources, r11, r12, r13);
        }
        Bitmap A002 = r12.A00(r11, false);
        if (A002 == null) {
            BitmapDrawable[] bitmapDrawableArr = new BitmapDrawable[length];
            for (int i2 = 0; i2 < length; i2++) {
                bitmapDrawableArr[i2] = A01(resources, new C434720d(new int[]{iArr[i2]}), r12, r13);
                if (bitmapDrawableArr[i2] == null) {
                    return null;
                }
            }
            A002 = C435120i.A00(bitmapDrawableArr);
            if (A002 == null) {
                return null;
            }
            r12.A01(A002, r11, false);
        }
        return new BitmapDrawable(resources, A002);
    }

    public Drawable A04(Resources resources, C434520b r6, float f2, long j2) {
        int[] iArr;
        Drawable A052 = A05(resources, r6, j2);
        if (A052 != null) {
            return A052;
        }
        if (r6 instanceof C435020g) {
            C435020g r62 = (C435020g) r6;
            int i2 = r62.A01;
            iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = Character.codePointAt(r62.A02, i3);
            }
        } else {
            iArr = ((C434420a) r6).A01;
        }
        return new C435420l(iArr, f2);
    }

    public Drawable A05(Resources resources, C434520b r5, long j2) {
        C434720d A062 = A06(r5, j2);
        if (A062 == null) {
            return null;
        }
        return A03(resources, A062, this.A03, new C435320k(this));
    }

    public final C434720d A06(C434520b r4, long j2) {
        if (j2 == -1) {
            j2 = EmojiDescriptor.A00(r4, false);
            if (j2 == -1) {
                return null;
            }
        }
        Long valueOf = Long.valueOf(j2);
        if (valueOf != null) {
            return new C434720d(valueOf.longValue());
        }
        return null;
    }
}
