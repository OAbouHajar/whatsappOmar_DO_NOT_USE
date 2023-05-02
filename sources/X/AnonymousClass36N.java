package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;

/* renamed from: X.36N  reason: invalid class name */
public class AnonymousClass36N extends C16690tT {
    public final C16180sb A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final String A03;
    public final WeakReference A04;

    public AnonymousClass36N(C14550pN r2, C16180sb r3, C14870pt r4, C16040sK r5, String str) {
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
        this.A04 = C13690nt.A0h(r2);
        this.A03 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = ((Bitmap[]) objArr)[0];
        AnonymousClass00B.A06(bitmap);
        File A0N = this.A00.A0N("shared_qr_code.png");
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(A0N);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, fileOutputStream);
                C30311c8.A04(fileOutputStream);
                bitmap.recycle();
                return A0N;
            } catch (FileNotFoundException e2) {
                e = e2;
                try {
                    Log.e("CreateSharedQrCardImageAsyncTask/shareFailed", e);
                    C30311c8.A04(fileOutputStream);
                    bitmap.recycle();
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    C30311c8.A04(fileOutputStream2);
                    bitmap.recycle();
                    throw th;
                }
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            fileOutputStream = null;
            Log.e("CreateSharedQrCardImageAsyncTask/shareFailed", e);
            C30311c8.A04(fileOutputStream);
            bitmap.recycle();
            return null;
        } catch (Throwable th2) {
            th = th2;
            C30311c8.A04(fileOutputStream2);
            bitmap.recycle();
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        File file = (File) obj;
        C14550pN r3 = (C14550pN) this.A04.get();
        if (r3 != null) {
            r3.Ac1();
            if (file == null) {
                this.A01.A09(R.string.str15fd, 0);
                return;
            }
            Intent A022 = C13700nu.A02("android.intent.action.SEND");
            Object[] A1Z = C13690nt.A1Z();
            C16040sK r5 = this.A02;
            A1Z[0] = r5.A07();
            r5.A0B();
            C28881Zb r0 = r5.A01;
            AnonymousClass00B.A06(r0);
            A022.putExtra("android.intent.extra.SUBJECT", C13680ns.A0d(r3, C24561Gk.A01(r0), A1Z, 1, R.string.str0573));
            A022.putExtra("android.intent.extra.TEXT", this.A03);
            A022.putExtra("android.intent.extra.STREAM", AnonymousClass1XI.A01(r3.getApplicationContext(), file));
            A022.setType("image/png");
            A022.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
            r3.A2X(Intent.createChooser(A022, (CharSequence) null), false);
        }
    }
}
