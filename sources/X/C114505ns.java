package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiMyQrFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.5ns  reason: invalid class name and case insensitive filesystem */
public class C114505ns extends C16690tT {
    public final Bitmap A00;
    public final C16180sb A01;
    public final C1221168i A02;
    public final WeakReference A03;

    public C114505ns(Context context, Bitmap bitmap, C16180sb r4, C1221168i r5) {
        this.A03 = new WeakReference(context);
        this.A00 = bitmap;
        this.A01 = r4;
        this.A02 = r5;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r8) {
        /*
            r7 = this;
            java.lang.String r0 = "PAY: ShareQrCodeUtil start share QR code background job"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r0)
            java.lang.String r0 = "image/*"
            r6.setType(r0)
            X.0sb r1 = r7.A01
            java.lang.String r0 = "qrcode.jpg"
            java.io.File r1 = r1.A0N(r0)
            java.lang.ref.WeakReference r0 = r7.A03
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            android.net.Uri r5 = X.AnonymousClass1XI.A01(r0, r1)
            r4 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004a }
            r3.<init>(r1)     // Catch:{ IOException -> 0x004a }
            android.graphics.Bitmap r0 = r7.A00     // Catch:{ all -> 0x0045 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0)     // Catch:{ all -> 0x0045 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0045 }
            r0 = 100
            r2.compress(r1, r0, r3)     // Catch:{ all -> 0x0045 }
            r3.close()     // Catch:{ IOException -> 0x004a }
            java.lang.String r0 = "android.intent.extra.STREAM"
            r6.putExtra(r0, r5)
            android.content.Intent r4 = android.content.Intent.createChooser(r6, r4)
            return r4
        L_0x0045:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            r1 = move-exception
            java.lang.String r0 = "PAY: ShareQrCodeUtil cannot process qr code for sharing"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114505ns.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Intent intent = (Intent) obj;
        IndiaUpiMyQrFragment indiaUpiMyQrFragment = ((C1205962g) this.A02).A00;
        if (intent == null || intent.resolveActivity(indiaUpiMyQrFragment.A0D().getPackageManager()) == null) {
            indiaUpiMyQrFragment.A04.A09(R.string.str1612, 1);
            return;
        }
        indiaUpiMyQrFragment.startActivityForResult(intent, 1006);
        indiaUpiMyQrFragment.A00.setDrawingCacheEnabled(false);
    }
}
