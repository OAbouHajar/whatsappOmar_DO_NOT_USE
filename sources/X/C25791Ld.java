package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape0S0700000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* renamed from: X.1Ld  reason: invalid class name and case insensitive filesystem */
public class C25791Ld extends C214614e {
    public static final BitmapFactory.Options A07;
    public int A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C34711kk A02;
    public final AnonymousClass18C A03;
    public final AnonymousClass25S A04;
    public final HashMap A05 = new HashMap();
    public final List A06 = new ArrayList();

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        A07 = options;
        options.inInputShareable = true;
        options.inPurgeable = true;
        options.inDither = true;
    }

    public C25791Ld(C16180sb r10, C23651Cv r11, C16980tz r12, AnonymousClass013 r13, C17250um r14, C18210wK r15, AnonymousClass1QO r16, AnonymousClass18C r17, AnonymousClass1MF r18, C18840xL r19, C214414c r20) {
        super(r20);
        this.A03 = r17;
        this.A04 = new AnonymousClass25S(r10, r12, r13, r14, r15, r16, r18, r19);
        StringBuilder sb = new StringBuilder("messagethumbcache/construct ");
        sb.append((int) ((AnonymousClass01S.A00 / FileUtils.ONE_KB) / 8));
        Log.i(sb.toString());
        this.A02 = r11.A02();
        r11.A01().A02(new AnonymousClass25T(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ef, code lost:
        if (r1 > 0.0f) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C16730tY r4, int r5) {
        /*
            X.0ta r1 = r4.A02
            X.AnonymousClass00B.A06(r1)
            int r2 = r1.A08
            if (r2 <= 0) goto L_0x0016
            int r0 = r1.A06
            if (r0 <= 0) goto L_0x0016
            float r1 = (float) r5
            float r0 = (float) r0
            float r1 = r1 * r0
            float r0 = (float) r2
        L_0x0011:
            float r1 = r1 / r0
            int r0 = (int) r1
            if (r0 <= 0) goto L_0x0067
            return r0
        L_0x0016:
            java.io.File r0 = r1.A0F
            if (r0 == 0) goto L_0x0067
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0067
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r0 = 1
            r2.inJustDecodeBounds = r0
            java.io.File r0 = r1.A0F
            java.lang.String r0 = r0.getAbsolutePath()
            android.graphics.BitmapFactory.decodeFile(r0, r2)
            int r0 = r2.outWidth
            if (r0 <= 0) goto L_0x0067
            int r0 = r2.outHeight
            if (r0 <= 0) goto L_0x0067
            java.io.File r0 = r1.A0F     // Catch:{ IOException -> 0x0061 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0061 }
            X.03o r1 = new X.03o     // Catch:{ IOException -> 0x0061 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0061 }
            r0 = 1
            int r1 = r1.A07(r0)     // Catch:{ IOException -> 0x0061 }
            r0 = 6
            if (r1 == r0) goto L_0x0058
            r0 = 8
            if (r1 == r0) goto L_0x0058
            float r1 = (float) r5     // Catch:{ IOException -> 0x0061 }
            int r0 = r2.outHeight     // Catch:{ IOException -> 0x0061 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0061 }
            float r1 = r1 * r0
            int r0 = r2.outWidth     // Catch:{ IOException -> 0x0061 }
            goto L_0x005f
        L_0x0058:
            float r1 = (float) r5     // Catch:{ IOException -> 0x0061 }
            int r0 = r2.outWidth     // Catch:{ IOException -> 0x0061 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0061 }
            float r1 = r1 * r0
            int r0 = r2.outHeight     // Catch:{ IOException -> 0x0061 }
        L_0x005f:
            float r0 = (float) r0     // Catch:{ IOException -> 0x0061 }
            goto L_0x0011
        L_0x0061:
            r1 = move-exception
            java.lang.String r0 = "failure retrieving exif, io exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0067:
            byte r0 = r4.A10
            boolean r0 = X.C16870tm.A00(r0)
            if (r0 == 0) goto L_0x00f5
            X.0tm r3 = r4.A0F()
            X.AnonymousClass00B.A06(r3)
            java.lang.Float r0 = r3.A00
            if (r0 != 0) goto L_0x00c1
            X.0tZ r1 = r3.A04
            byte r0 = r1.A10
            boolean r0 = X.C16870tm.A00(r0)
            if (r0 == 0) goto L_0x00ce
            int r0 = r1.A03()
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = r1.A0I()
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = r1.A0I()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00ce
            java.lang.String r1 = r1.A0I()
            r0 = 0
            byte[] r2 = android.util.Base64.decode(r1, r0)
        L_0x00a3:
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r0 = 1
            r4.inJustDecodeBounds = r0
            int r1 = r2.length
            r0 = 0
            android.graphics.BitmapFactory.decodeByteArray(r2, r0, r1, r4)
            int r2 = r4.outWidth
            if (r2 <= 0) goto L_0x00f2
            int r0 = r4.outHeight
            if (r0 <= 0) goto L_0x00f2
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
        L_0x00bb:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r3.A00 = r0
        L_0x00c1:
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00f5
            float r0 = (float) r5
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
        L_0x00ce:
            byte[] r0 = r1.A11()
            if (r0 == 0) goto L_0x00e0
            byte[] r0 = r1.A11()
            int r0 = r0.length
            if (r0 <= 0) goto L_0x00e0
            byte[] r2 = r1.A11()
            goto L_0x00a3
        L_0x00e0:
            boolean r0 = r1 instanceof X.C16730tY
            if (r0 == 0) goto L_0x00f2
            X.0tY r1 = (X.C16730tY) r1
            X.0ta r0 = r1.A02
            if (r0 == 0) goto L_0x00f2
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f2
            goto L_0x00bb
        L_0x00f2:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00bb
        L_0x00f5:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25791Ld.A00(X.0tY, int):int");
    }

    public static Bitmap A01(C16740tZ r2, int i2, boolean z2, boolean z3) {
        byte[] bArr = null;
        if (!(r2 instanceof C39001rl)) {
            if (r2 instanceof C30581cc) {
                bArr = ((C30581cc) r2).A17();
            } else if (r2.A0F() != null && r2.A0F().A05()) {
                bArr = r2.A0F().A07();
            }
        }
        return A02(r2, bArr, i2, z2, z3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r3.getWidth() < 100) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A02(X.C16740tZ r2, byte[] r3, int r4, boolean r5, boolean r6) {
        /*
            boolean r0 = r2 instanceof X.C39001rl
            r1 = 0
            if (r0 != 0) goto L_0x0043
            if (r3 == 0) goto L_0x0043
            android.graphics.BitmapFactory$Options r0 = A07
            android.graphics.Bitmap r3 = X.AnonymousClass25U.A00(r0, r3, r4)
            if (r3 == 0) goto L_0x0043
            if (r5 == 0) goto L_0x0022
            boolean r0 = r2 instanceof X.C30581cc
            if (r0 == 0) goto L_0x0023
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x001a:
            int r1 = r0.intValue()
            r0 = 2
            com.whatsapp.filter.FilterUtils.blurNative(r3, r1, r0)
        L_0x0022:
            return r3
        L_0x0023:
            boolean r0 = r2 instanceof X.C16730tY
            if (r0 == 0) goto L_0x0022
            boolean r0 = r2 instanceof X.C38631rA
            r2 = 1
            if (r0 != 0) goto L_0x0034
            if (r6 == 0) goto L_0x002f
            r2 = 2
        L_0x002f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x001a
        L_0x0034:
            int r0 = r3.getHeight()
            r1 = 100
            if (r0 >= r1) goto L_0x0022
            int r0 = r3.getWidth()
            if (r0 >= r1) goto L_0x0022
            goto L_0x002f
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25791Ld.A02(X.0tZ, byte[], int, boolean, boolean):android.graphics.Bitmap");
    }

    public static C25791Ld A21() {
        return (C25791Ld) yo.mSingletonC.AFY.get();
    }

    public int A03(Context context) {
        int i2 = this.A00;
        if (i2 != 0) {
            return i2;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen052c);
        this.A00 = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public final synchronized Bitmap A04(String str) {
        Bitmap bitmap;
        bitmap = (Bitmap) this.A02.A00(str);
        if (bitmap == null || bitmap.isRecycled()) {
            if (bitmap != null && bitmap.isRecycled()) {
                Log.e("!! recycled message in hard cache");
            }
            HashMap hashMap = this.A05;
            SoftReference softReference = (SoftReference) hashMap.get(str);
            bitmap = softReference != null ? (Bitmap) softReference.get() : null;
            if (bitmap == null || bitmap.isRecycled()) {
                if (softReference != null) {
                    hashMap.remove(str);
                }
                bitmap = null;
            }
        }
        return bitmap;
    }

    public void A05() {
        AnonymousClass00B.A01();
        List<Runnable> list = this.A06;
        synchronized (list) {
            for (Runnable run : list) {
                run.run();
            }
            list.clear();
        }
    }

    public final void A06(View view, C16740tZ r13, AnonymousClass25W r14, AnonymousClass25V r15, Object obj) {
        C16740tZ r7;
        String str;
        Bitmap A042;
        AnonymousClass25W r4 = r14;
        synchronized (this) {
            r7 = r13;
            C28381Vw r0 = r13.A11;
            if (r0 == null || (str = r0.A01) == null) {
                str = "null";
            }
            A042 = A04(str);
        }
        View view2 = view;
        AnonymousClass25V r9 = r15;
        if (A042 != null) {
            if (r14 instanceof AnonymousClass25X) {
                AnonymousClass25X r42 = (AnonymousClass25X) r4;
                int AG6 = (int) (((float) r42.A03.AG6()) / r42.A01.getResources().getDisplayMetrics().density);
                if (AG6 > A042.getWidth() || AG6 == 0) {
                    r42.A01();
                }
            }
            r15.AfV(A042, view, r13);
            return;
        }
        Bitmap A002 = r14.A00();
        C16870tm A0F = r13.A0F();
        if (A002 != null || A0F == null || A0F.A05()) {
            r15.AfV(A002, view, r13);
            r14.A01();
            return;
        }
        this.A03.A02(A0F, new RunnableRunnableShape0S0700000_I0(this, r4, A0F, view2, r7, obj, r9, 3));
        r15.Afm(view);
    }

    public void A07(View view, C16740tZ r10, AnonymousClass25V r11) {
        A0A(view, r10, r11, r10.A11, 100, false, false);
    }

    public void A08(View view, C16740tZ r3, AnonymousClass25V r4) {
        A09(view, r3, r4, r3.A11);
    }

    public void A09(View view, C16740tZ r9, AnonymousClass25V r10, Object obj) {
        View view2 = view;
        Object obj2 = obj;
        view.setTag(obj);
        if (AnonymousClass01E.A01()) {
            A05();
        }
        C16740tZ r3 = r9;
        AnonymousClass25V r5 = r10;
        if ((r9 instanceof C39001rl) || (!(r9 instanceof C30581cc) ? r9.A0F() == null || !r9.A0F().A04() : ((C30581cc) r3).A17() == null)) {
            r10.AfV((Bitmap) null, view, r9);
        } else {
            A06(view2, r3, new AnonymousClass25Y(r9, this), r5, obj2);
        }
    }

    public final synchronized void A0A(View view, C16740tZ r14, AnonymousClass25V r15, Object obj, int i2, boolean z2, boolean z3) {
        synchronized (this) {
            View view2 = view;
            Object obj2 = obj;
            view.setTag(obj2);
            if (AnonymousClass01E.A01()) {
                A05();
            }
            A06(view, r14, new AnonymousClass25X(view2, r14, r15, this, obj2, i2, z3, z2), r15, obj2);
        }
    }

    public void A0B(View view, C16740tZ r12, AnonymousClass25V r13, Object obj, boolean z2) {
        view.setTag(obj);
        AnonymousClass25Z r6 = new AnonymousClass25Z(view, r12, r13, this, obj);
        AnonymousClass25S r0 = this.A04;
        r0.A01(view, r12, r6, r13, obj, z2);
    }

    public void A0C(View view, C16740tZ r8, AnonymousClass25V r9, boolean z2) {
        C40531uH r3;
        String str;
        view.setTag(r8.A0N.A08);
        synchronized (this) {
            if (AnonymousClass01E.A01()) {
                A05();
            }
            C40531uH r0 = r8.A0N;
            if (r0 != null) {
                byte[] bArr = r0.A00;
                if (!TextUtils.isEmpty(r0.A04)) {
                    r3 = r8.A0N;
                    str = r3.A04;
                } else {
                    r3 = r8.A0N;
                    str = r3.A08;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_");
                sb.append(z2);
                String obj = sb.toString();
                if (bArr == null) {
                    bArr = r3.A0D;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append("_micro");
                    obj = sb2.toString();
                }
                Bitmap A042 = A04(obj);
                if (A042 == null) {
                    A042 = A02(r8, bArr, 2000, z2, false);
                    this.A05.remove(obj);
                    if (A042 != null) {
                        this.A02.A03(obj, A042);
                    }
                }
                r9.AfV(A042, view, r8);
            }
        }
    }

    public void A0D(C16740tZ r4) {
        String str;
        C34711kk r2 = this.A02;
        C28381Vw r0 = r4.A11;
        if (r0 == null || (str = r0.A01) == null) {
            str = "null";
        }
        r2.A02.A03(str);
        this.A05.remove(str);
    }
}
