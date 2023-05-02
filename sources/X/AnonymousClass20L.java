package X;

import android.net.Uri;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.20L  reason: invalid class name */
public class AnonymousClass20L extends C16690tT {
    public final Uri A00;
    public final C14870pt A01;
    public final AnonymousClass013 A02;
    public final AnonymousClass20K A03;
    public final AnonymousClass1A9 A04;
    public final WeakReference A05;

    public AnonymousClass20L(Uri uri, C14600pS r3, C14870pt r4, AnonymousClass013 r5, AnonymousClass20K r6, AnonymousClass1A9 r7) {
        this.A01 = r4;
        this.A04 = r7;
        this.A02 = r5;
        this.A05 = new WeakReference(r3);
        this.A00 = uri;
        this.A03 = r6;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            return this.A04.A0Z(this.A00);
        } catch (IOException e2) {
            return e2;
        }
    }

    public void A0A(Object obj) {
        C14600pS r3 = (C14600pS) this.A05.get();
        if (r3 != null) {
            r3.Ac1();
        }
        if (obj instanceof File) {
            this.A03.ARK((File) obj);
            return;
        }
        if (obj instanceof IOException) {
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder("mediafileutils/getfilefrommediastoreasync/ioerror ");
            sb.append(th);
            Log.e(sb.toString());
            if (th.getMessage() != null && th.getMessage().contains("No space")) {
                this.A01.A0F(r3, R.string.str0852);
                return;
            }
        }
        this.A01.A09(R.string.str15fd, 0);
    }
}
