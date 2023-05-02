package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: X.0WN  reason: invalid class name */
public final class AnonymousClass0WN {
    public static boolean A0C = true;
    public static Bitmap.Config A0D = Bitmap.Config.ARGB_8888;
    public static BitmapFactory.Options A0E;
    public static final Bitmap A0F = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    public static final C06220Uu A0G = new C06220Uu(20);
    public static final C06220Uu A0H = new C06220Uu(32);
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = -1;
    public Bitmap A05;
    public BitmapFactory.Options A06;
    public AnonymousClass0WN A07 = null;
    public AnonymousClass0WN A08 = null;
    public final C10670hV A09 = new C03380Ih(this);
    public final AnonymousClass0WN[] A0A = new AnonymousClass0WN[4];
    public volatile int A0B = 0;

    public AnonymousClass0WN(int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
        if (!A0C) {
            BitmapFactory.Options options = A0E;
            if (options == null) {
                options = new BitmapFactory.Options();
                A0E = options;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
            }
            this.A06 = options;
            return;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        this.A06 = options2;
        options2.inSampleSize = 1;
        options2.inPreferredConfig = A0D;
        options2.inMutable = true;
    }

    public static AnonymousClass0WN A00(byte[] bArr, int i2) {
        Bitmap bitmap;
        AnonymousClass0WN r5 = new AnonymousClass0WN(-1, -1);
        if (A0C) {
            BitmapFactory.Options options = r5.A06;
            if (options.inBitmap == null) {
                options.inBitmap = (Bitmap) A0H.A00();
            }
        }
        try {
            BitmapFactory.Options options2 = r5.A06;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, i2, options2);
            r5.A05 = bitmap;
            if (A0C) {
                options2.inBitmap = null;
            }
        } catch (IllegalArgumentException unused) {
            AnonymousClass0V3.A06.A02();
            A0C = false;
            BitmapFactory.Options options3 = r5.A06;
            options3.inBitmap.recycle();
            options3.inBitmap = null;
            A0H.A01();
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, i2, options3);
            r5.A05 = bitmap;
        }
        if (bitmap == null) {
            r5.A02();
            return null;
        }
        r5.A01 = bitmap.getWidth();
        r5.A00 = r5.A05.getHeight();
        return r5;
    }

    public synchronized Bitmap A01() {
        return this.A05;
    }

    public void A02() {
        this.A01 = -1;
        this.A00 = -1;
        for (int i2 = 0; i2 < 4; i2++) {
            this.A0A[i2] = null;
        }
        A03();
        this.A0B = 0;
        this.A07 = null;
        this.A08 = null;
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = -1;
    }

    public final synchronized void A03() {
        Bitmap bitmap = this.A05;
        if (!(bitmap == null || bitmap == A0F)) {
            if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                A0G.A02(this.A05);
            } else if (A0C) {
                A0H.A02(this.A05);
            } else {
                this.A05.recycle();
            }
        }
        this.A05 = null;
    }

    public synchronized String toString() {
        StringBuilder A0o;
        A0o = AnonymousClass000.A0o();
        A0o.append(AnonymousClass0WN.class.getSimpleName());
        A0o.append(" {x=");
        A0o.append(this.A02);
        A0o.append(", y=");
        A0o.append(this.A03);
        A0o.append(", zoom=");
        A0o.append(this.A04);
        A0o.append(", status=");
        A0o.append(this.A0B);
        A0o.append("}");
        A0o.append(this.A05 == null ? "x" : "o");
        return A0o.toString();
    }
}
