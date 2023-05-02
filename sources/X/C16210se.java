package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.obwhatsapp.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0se  reason: invalid class name and case insensitive filesystem */
public abstract class C16210se {
    public boolean A00;
    public final C16040sK A01;
    public final C16200sd A02;
    public final C16190sc A03;
    public final AnonymousClass12W A04;
    public final C16980tz A05;
    public final C18790xG A06;
    public final AnonymousClass12X A07;
    public final C16230sg A08;
    public final C16990u0 A09;
    public final AnonymousClass12V A0A;

    public C16210se(C16040sK r1, C16200sd r2, C16190sc r3, AnonymousClass12W r4, C16980tz r5, C18790xG r6, AnonymousClass12X r7, C16230sg r8, C16990u0 r9, AnonymousClass12V r10) {
        this.A05 = r5;
        this.A0A = r10;
        this.A01 = r1;
        this.A03 = r3;
        this.A06 = r6;
        this.A02 = r2;
        this.A04 = r4;
        this.A08 = r8;
        this.A09 = r9;
        this.A07 = r7;
    }

    public static Point A00(Context context) {
        Point point = new Point();
        AnonymousClass01V.A02(context).getDefaultDisplay().getSize(point);
        if (context.getResources().getConfiguration().orientation == 2) {
            int i2 = point.y;
            point.y = point.x;
            point.x = i2;
        }
        point.y -= ((int) context.getResources().getDimension(R.dimen.dimen0002)) + AnonymousClass1UP.A02(context, AnonymousClass01V.A02(context));
        return point;
    }

    public static C446825c A01(Point point, boolean z2) {
        int i2 = point.x;
        int i3 = point.y;
        Long valueOf = Long.valueOf(AnonymousClass01S.A00 / 32);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inDither = z2;
        return new C446825c(options, valueOf, i2, i3, false);
    }

    public static List A02(C16190sc r5) {
        List A082 = C40691uX.A08(C16960tx.A06, C16960tx.A00());
        File file = new File(r5.A02(), "wallpapers.backup");
        ArrayList A072 = C40691uX.A07(file, A082);
        File file2 = new File(r5.A02(), "Wallpapers");
        if (file2.exists()) {
            A072.add(file2);
        }
        C40691uX.A0D(file, A072);
        return A072;
    }

    public Drawable A03(C86864Ul r5) {
        if (this instanceof AnonymousClass1AB) {
            if (r5 == null) {
                return null;
            }
            Drawable drawable = r5.A00;
            Integer num = r5.A01;
            if (num == null || drawable == null) {
                return drawable;
            }
            C62063Bm.A04(this.A05.A00, drawable, num.intValue());
            return drawable;
        } else if (r5 == null) {
            return null;
        } else {
            return r5.A00;
        }
    }

    public Uri A04() {
        if (this instanceof AnonymousClass1AB) {
            return ((AnonymousClass1AB) this).A03.A04();
        }
        AnonymousClass1AA r4 = (AnonymousClass1AA) this;
        C16040sK r0 = r4.A05;
        r0.A0B();
        AnonymousClass1ZT r02 = r0.A05;
        AnonymousClass00B.A06(r02);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r02.getRawString());
        sb2.append(System.currentTimeMillis());
        sb.append(C004101u.A02(sb2.toString()));
        sb.append(".jpg");
        String obj = sb.toString();
        File file = r4.A03.A05().A0P;
        C16180sb.A04(file, false);
        return Uri.fromFile(new File(file, obj));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0047 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00bd */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0047=Splitter:B:18:0x0047, B:13:0x003f=Splitter:B:13:0x003f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C86864Ul A05(android.content.Context r8, android.net.Uri r9, X.C15830rv r10, boolean r11) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass1AB
            if (r0 == 0) goto L_0x0063
            r4 = r7
            X.1AB r4 = (X.AnonymousClass1AB) r4
            r3 = 0
            r5 = 0
            X.1A9 r1 = r4.A04     // Catch:{ IOException -> 0x0048 }
            if (r11 == 0) goto L_0x0013
            r0 = 1
            java.io.InputStream r6 = r1.A0b(r9, r0)     // Catch:{ IOException -> 0x0048 }
            goto L_0x001c
        L_0x0013:
            java.io.File r0 = X.AnonymousClass1XI.A03(r9)     // Catch:{ IOException -> 0x0048 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0048 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0048 }
        L_0x001c:
            android.graphics.Point r0 = A00(r8)     // Catch:{ all -> 0x0043 }
            X.25c r0 = A01(r0, r3)     // Catch:{ all -> 0x0043 }
            X.25d r0 = X.C37741pe.A04(r5, r0, r6, r3)     // Catch:{ all -> 0x0043 }
            android.graphics.Bitmap r2 = r0.A02     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0037
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ all -> 0x0043 }
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x0043 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0043 }
            r5 = r0
            goto L_0x003f
        L_0x0037:
            X.0pt r1 = r4.A01     // Catch:{ all -> 0x0043 }
            r0 = 2131888202(0x7f12084a, float:1.9411033E38)
            r1.A07(r0, r3)     // Catch:{ all -> 0x0043 }
        L_0x003f:
            r6.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0050
        L_0x0043:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            X.0pt r1 = r4.A01
            r0 = 2131888202(0x7f12084a, float:1.9411033E38)
            r1.A07(r0, r3)
        L_0x0050:
            if (r5 != 0) goto L_0x0057
            X.4Ul r4 = r4.A06(r8, r10)
            return r4
        L_0x0057:
            if (r10 != 0) goto L_0x005a
            r3 = 1
        L_0x005a:
            X.1uv r0 = r4.A0D(r8, r5, r10)
            X.4Ul r4 = r4.A0C(r8, r0, r3)
            return r4
        L_0x0063:
            r3 = r7
            X.1AA r3 = (X.AnonymousClass1AA) r3
            r2 = 0
            r4 = 0
            java.lang.String r0 = "wallpaper/set with Uri with size (width x height): "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = "x"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r3.A00 = r0
            X.1A9 r0 = r3.A08     // Catch:{ IOException -> 0x00be }
            r6 = 1
            java.io.InputStream r5 = r0.A0b(r9, r6)     // Catch:{ IOException -> 0x00be }
            android.graphics.Point r0 = A00(r8)     // Catch:{ all -> 0x00b9 }
            X.25c r1 = A01(r0, r2)     // Catch:{ all -> 0x00b9 }
            r0 = 0
            X.25d r0 = X.C37741pe.A04(r0, r1, r5, r2)     // Catch:{ all -> 0x00b9 }
            android.graphics.Bitmap r2 = r0.A02     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x00ac
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ all -> 0x00b9 }
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x00b9 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00b9 }
            r3.A00 = r0     // Catch:{ all -> 0x00b9 }
        L_0x00a9:
            r3.A00 = r6     // Catch:{ all -> 0x00b9 }
            goto L_0x00b5
        L_0x00ac:
            X.0pt r1 = r3.A04     // Catch:{ all -> 0x00b9 }
            r0 = 2131888202(0x7f12084a, float:1.9411033E38)
            r1.A07(r0, r4)     // Catch:{ all -> 0x00b9 }
            goto L_0x00a9
        L_0x00b5:
            r5.close()     // Catch:{ IOException -> 0x00be }
            goto L_0x00c2
        L_0x00b9:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            throw r0     // Catch:{ IOException -> 0x00be }
        L_0x00be:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00c2:
            android.graphics.drawable.Drawable r0 = r3.A00
            if (r0 == 0) goto L_0x00c9
            r3.A0C(r8, r0)
        L_0x00c9:
            android.graphics.drawable.Drawable r3 = r3.A00
            java.lang.String r2 = "DOWNLOADED"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0 = 1
            X.4Ul r4 = new X.4Ul
            r4.<init>(r3, r1, r2, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16210se.A05(android.content.Context, android.net.Uri, X.0rv, boolean):X.4Ul");
    }

    public C86864Ul A06(Context context, C15830rv r7) {
        C40931uv A0E;
        if (!(this instanceof AnonymousClass1AB)) {
            return ((AnonymousClass1AA) this).A0B(context, false);
        }
        AnonymousClass1AB r4 = (AnonymousClass1AB) this;
        boolean A092 = C434920f.A09(context);
        boolean z2 = true;
        if (r7 == null || (A0E = r4.A08.AH3(r7, A092)) == null) {
            A0E = r4.A0E(context, A092);
        } else {
            z2 = false;
        }
        AnonymousClass01Q r0 = new AnonymousClass01Q(A0E, Boolean.valueOf(z2));
        Object obj = r0.A00;
        AnonymousClass00B.A06(obj);
        Object obj2 = r0.A01;
        AnonymousClass00B.A06(obj2);
        return r4.A0C(context, (C40931uv) obj, ((Boolean) obj2).booleanValue());
    }

    public File A07() {
        return this instanceof AnonymousClass1AB ? ((AnonymousClass1AB) this).A03.A07() : new File(this.A05.A00.getFilesDir(), "wallpaper.jpg");
    }

    public void A08() {
        if (this instanceof AnonymousClass1AB) {
            ((AnonymousClass1AB) this).A00.A0B(0);
        }
    }

    public void A09(Context context, C15830rv r7, int i2) {
        C40931uv A0E;
        if (this instanceof AnonymousClass1AB) {
            AnonymousClass1AB r4 = (AnonymousClass1AB) this;
            boolean A092 = C434920f.A09(context);
            boolean z2 = true;
            if (r7 == null || (A0E = r4.A08.AH3(r7, A092)) == null) {
                A0E = r4.A0E(context, A092);
            } else {
                z2 = false;
            }
            Object obj = new AnonymousClass01Q(A0E, Boolean.valueOf(z2)).A00;
            AnonymousClass00B.A06(obj);
            C40931uv r0 = (C40931uv) obj;
            r4.A0G(context, r7, new C40931uv(Integer.valueOf(i2), r0.A01, r0.A02));
        }
    }

    public boolean A0A() {
        if (this instanceof AnonymousClass1AB) {
            AnonymousClass1AB r1 = (AnonymousClass1AB) this;
            boolean A0A2 = r1.A03.A0A();
            r1.A0F();
            return A0A2;
        }
        AnonymousClass1AA r0 = (AnonymousClass1AA) this;
        return r0.A06.A03(new File(r0.A05.A00.getFilesDir(), "wallpaper.jpg"), "wallpaper") == 19;
    }
}
