package X;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.4qK  reason: invalid class name and case insensitive filesystem */
public class C97644qK implements C48612Oe {
    public long A00;
    public Uri A01;
    public boolean A02;
    public final C48612Oe A03;
    public final Object A04 = C13690nt.A0Y();

    public C97644qK(Context context, Uri uri) {
        this.A03 = new C57872s4(context);
        this.A01 = uri;
    }

    public void A4k(AnonymousClass5LZ r1) {
    }

    public /* synthetic */ Map AFZ() {
        return Collections.emptyMap();
    }

    public Uri AGo() {
        Uri uri;
        synchronized (this.A04) {
            uri = this.A01;
        }
        return uri;
    }

    public long AZr(AnonymousClass3AL r8) {
        long j2;
        Uri uri;
        synchronized (this.A04) {
            j2 = r8.A03;
            this.A00 = j2;
            uri = this.A01;
        }
        if (uri != null) {
            return this.A03.AZr(new AnonymousClass3AL(uri, j2, -1));
        }
        throw AnonymousClass3K3.A0e("Uri not set");
    }

    public void close() {
        this.A03.close();
    }

    public int read(byte[] bArr, int i2, int i3) {
        long j2;
        Uri uri;
        Object obj = this.A04;
        synchronized (obj) {
            j2 = this.A00;
            if (this.A02) {
                this.A02 = false;
                uri = this.A01;
            } else {
                uri = null;
            }
        }
        if (uri != null) {
            C48612Oe r0 = this.A03;
            r0.close();
            r0.AZr(new AnonymousClass3AL(uri, j2, -1));
        }
        int read = this.A03.read(bArr, i2, i3);
        synchronized (obj) {
            this.A00 += (long) read;
        }
        return read;
    }
}
