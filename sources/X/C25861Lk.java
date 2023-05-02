package X;

import com.obwhatsapp.gifsearch.IDxResultShape79S0100000_2_I0;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.1Lk  reason: invalid class name and case insensitive filesystem */
public abstract class C25861Lk {
    public long A00 = -1;
    public WeakReference A01;
    public final C17130ua A02;
    public final C16440t3 A03;
    public final AnonymousClass013 A04;
    public final C24361Fp A05;
    public final C16490t9 A06;
    public final C25841Li A07;
    public final C18520wp A08;
    public final C17660vR A09;
    public final C16320sq A0A;
    public final Random A0B;

    public C25861Lk(C17130ua r3, C16440t3 r4, AnonymousClass013 r5, C24361Fp r6, C16490t9 r7, C25841Li r8, C18520wp r9, C17660vR r10, C16320sq r11) {
        this.A03 = r4;
        this.A05 = r6;
        this.A07 = r8;
        this.A09 = r10;
        this.A0A = r11;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = r5;
        this.A08 = r9;
        this.A0B = new Random();
    }

    public int A00() {
        return this instanceof C25921Lq ? 1 : 0;
    }

    public final C86974Uw A01() {
        C86974Uw r3;
        AnonymousClass00B.A01();
        WeakReference weakReference = this.A01;
        if (weakReference != null && (r3 = (C86974Uw) weakReference.get()) != null && this.A03.A00() - this.A00 < TimeUnit.HOURS.toMillis(4) && !r3.A02) {
            return r3;
        }
        IDxResultShape79S0100000_2_I0 iDxResultShape79S0100000_2_I0 = this instanceof C25921Lq ? new IDxResultShape79S0100000_2_I0((C25921Lq) this) : new IDxResultShape79S0100000_2_I0((C25851Lj) this);
        this.A01 = new WeakReference(iDxResultShape79S0100000_2_I0);
        this.A00 = this.A03.A00();
        return iDxResultShape79S0100000_2_I0;
    }

    public final HttpsURLConnection A02(String str) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setRequestProperty("User-Agent", this.A09.A00());
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setReadTimeout(30000);
        httpsURLConnection.setRequestMethod("GET");
        httpsURLConnection.connect();
        return httpsURLConnection;
    }
}
