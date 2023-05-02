package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.35x  reason: invalid class name */
public class AnonymousClass35x extends C16690tT {
    public final AnonymousClass1A9 A00;
    public final WeakReference A01;

    public AnonymousClass35x(C001300o r2, AnonymousClass4MB r3, AnonymousClass1A9 r4) {
        super(r2, true);
        this.A00 = r4;
        this.A01 = C13690nt.A0h(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            Bitmap A0W = this.A00.A0W(Uri.fromFile(((File[]) objArr)[0]), 100, 100);
            byte[] A1X = C13690nt.A1X(A0W, new ByteArrayOutputStream());
            A0W.recycle();
            return A1X;
        } catch (Exception e2) {
            Log.e("create-product-reply/", e2);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        byte[] bArr = (byte[]) obj;
        AnonymousClass4MB r0 = (AnonymousClass4MB) this.A01.get();
        if (r0 != null) {
            C34621kZ r4 = r0.A03;
            C35701mM r5 = r0.A01;
            AnonymousClass4PI r7 = r0.A02;
            C16750ta r10 = r0.A00;
            try {
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("product_inquiry:");
                String A0h = AnonymousClass000.A0h(r5.A0D, A0o);
                C222617g r9 = r4.A0k;
                UserJid userJid = r7.A0A;
                C38891ra r1 = (C38891ra) r9.A01(new C28381Vw(userJid, A0h, false), (byte) 23, r4.A0V.A00());
                r1.A02 = r10;
                r1.A0F().A02(bArr);
                r5.A00(r1);
                if (userJid != null) {
                    r1.A01 = userJid;
                }
                r4.A0J(r1);
            } catch (Exception e2) {
                Log.e("create-product-reply/", e2);
            }
            if (bArr == null) {
                Log.i("create-product-reply/creating product reply without media");
                C16740tZ A012 = r4.A0k.A01(r4.A0j.A02(r7.A0A, false), (byte) 0, r4.A0V.A00());
                String A0h2 = AnonymousClass000.A0h(r5.A04, AnonymousClass000.A0r("*"));
                String str = r5.A0A;
                if (!AnonymousClass1ZW.A0E(str)) {
                    StringBuilder A0q = AnonymousClass000.A0q(A0h2);
                    A0q.append("*\n");
                    A0h2 = AnonymousClass000.A0h(str, A0q);
                }
                A012.A0k(A0h2);
                r4.A0J(A012);
            }
        }
    }
}
