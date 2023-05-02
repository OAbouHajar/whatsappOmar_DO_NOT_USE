package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.obwhatsapp.R;

/* renamed from: X.28c  reason: invalid class name and case insensitive filesystem */
public class C453628c extends C16690tT {
    public C14550pN A00;
    public C14610pT A01;
    public final int A02;
    public final Uri A03;
    public final AnonymousClass120 A04;
    public final AnonymousClass01V A05;
    public final AnonymousClass013 A06;
    public final C16010sH A07;
    public final String A08;

    public C453628c(Uri uri, C14550pN r3, C14610pT r4, AnonymousClass120 r5, AnonymousClass01V r6, AnonymousClass013 r7, C16010sH r8, String str, int i2) {
        super(r3, true);
        this.A01 = r4;
        this.A05 = r6;
        this.A06 = r7;
        this.A03 = uri;
        this.A07 = r8;
        this.A00 = r3;
        this.A04 = r5;
        this.A08 = str;
        this.A02 = i2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x008b */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0081=Splitter:B:19:0x0081, B:26:0x008b=Splitter:B:26:0x008b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r7) {
        /*
            r6 = this;
            X.120 r1 = r6.A04
            X.0sH r0 = r6.A07
            java.io.File r0 = r1.A02(r0)
            r0.delete()
            X.01V r0 = r6.A05
            android.content.ContentResolver r0 = r0.A0C()
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "profileinfo/cropphoto contentResolver=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 2131888200(0x7f120848, float:1.9411029E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L_0x0020:
            android.net.Uri r4 = r6.A03     // Catch:{ IOException -> 0x008c }
            java.io.InputStream r3 = r0.openInputStream(r4)     // Catch:{ IOException -> 0x008c }
            if (r3 != 0) goto L_0x0044
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
            r1.<init>()     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "profileinfo/cropphoto/no-input-stream "
            r1.append(r0)     // Catch:{ all -> 0x0085 }
            r1.append(r4)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0085 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0085 }
            r0 = 2131888200(0x7f120848, float:1.9411029E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0085 }
            return r5
        L_0x0044:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0085 }
            r1.<init>()     // Catch:{ all -> 0x0085 }
            r0 = 1
            r1.inJustDecodeBounds = r0     // Catch:{ all -> 0x0085 }
            r5 = 0
            android.graphics.BitmapFactory.decodeStream(r3, r5, r1)     // Catch:{ all -> 0x0085 }
            int r2 = r1.outWidth     // Catch:{ all -> 0x0085 }
            if (r2 <= 0) goto L_0x0066
            int r1 = r1.outHeight     // Catch:{ all -> 0x0085 }
            if (r1 <= 0) goto L_0x0066
            r0 = 192(0xc0, float:2.69E-43)
            if (r2 < r0) goto L_0x005e
            if (r1 >= r0) goto L_0x0081
        L_0x005e:
            r0 = 2131755149(0x7f10008d, float:1.914117E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0085 }
            goto L_0x0081
        L_0x0066:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
            r1.<init>()     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "profileinfo/cropphoto/not-an-image "
            r1.append(r0)     // Catch:{ all -> 0x0085 }
            r1.append(r4)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0085 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0085 }
            r0 = 2131888192(0x7f120840, float:1.9411012E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0085 }
        L_0x0081:
            r3.close()     // Catch:{ IOException -> 0x008c }
            return r5
        L_0x0085:
            r0 = move-exception
            if (r3 == 0) goto L_0x008b
            r3.close()     // Catch:{ all -> 0x008b }
        L_0x008b:
            throw r0     // Catch:{ IOException -> 0x008c }
        L_0x008c:
            r2 = move-exception
            java.lang.String r0 = "profileinfo/cropphoto/ "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            android.net.Uri r0 = r6.A03
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            r0 = 2131888200(0x7f120848, float:1.9411029E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C453628c.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Number number = (Number) obj;
        C14550pN r9 = this.A00;
        if (r9 != null && this.A01 != null) {
            if (number != null) {
                int intValue = number.intValue();
                if (intValue == R.plurals.plurals008d) {
                    r9.Afh(this.A06.A0J(new Object[]{192}, R.plurals.plurals008d, 192));
                    return;
                }
                r9.Afg(intValue);
                return;
            }
            C614538z r3 = new C614538z(r9);
            r3.A09 = this.A03;
            r3.A04 = 192;
            r3.A0H = false;
            r3.A0E = false;
            r3.A0A = Uri.fromFile(this.A04.A02(this.A07));
            r3.A0C = Bitmap.CompressFormat.JPEG.toString();
            r3.A0D = this.A08;
            r3.A00 = 1;
            r3.A01 = 1;
            r3.A06 = 640;
            r3.A07 = 640;
            this.A01.startActivityForResult(r3.A00(), this.A02);
        }
    }
}
