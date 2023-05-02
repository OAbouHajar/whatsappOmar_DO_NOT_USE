package X;

import android.os.SystemClock;
import com.mod2.fblibs.FacebookFacade;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.3Gh  reason: invalid class name and case insensitive filesystem */
public class C63143Gh implements C19550yc {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C14710pd A01;
    public final C109335Rq A02;
    public final C15830rv A03;
    public final C17190ug A04;
    public final String A05;
    public final String A06;

    public C63143Gh(C14710pd r3, C109335Rq r4, C15830rv r5, C17190ug r6, String str, String str2) {
        this.A01 = r3;
        this.A04 = r6;
        this.A06 = str;
        this.A03 = r5;
        this.A05 = str2;
        this.A02 = r4;
    }

    public final boolean A00() {
        String str = this.A06;
        if (!"preview".equals(str) || !this.A01.A0E(C16620tM.A02, 101)) {
            return "image".equals(str) && this.A01.A0E(C16620tM.A02, 102);
        }
        return true;
    }

    public void APb(String str) {
    }

    public void AQe(C28371Vv r11, String str) {
        int A002 = C34451kH.A00(r11);
        if (A002 == 404) {
            this.A02.AVK(new AnonymousClass277(this.A03, (String) null, (URL) null, (byte[]) null, -1, C13690nt.A00("preview".equals(this.A06) ? 1 : 0)), this.A00);
        } else {
            this.A02.AVJ(this.A03, this.A06, A002, this.A00);
        }
    }

    public void AYG(C28371Vv r12, String str) {
        byte[] bArr;
        String str2;
        int i2;
        C28371Vv A0J = r12.A0J(FacebookFacade.RequestParameter.PICTURE);
        String str3 = this.A05;
        URL url = null;
        if (A0J != null) {
            bArr = A0J.A01;
            str2 = A00() ? A0J.A0N("direct_path", (String) null) : null;
            String A0N = A0J.A0N("url", (String) null);
            if (A0N != null) {
                try {
                    url = new URL(A0N);
                } catch (MalformedURLException unused) {
                    throw new AnonymousClass1W9("Malformed picture url");
                }
            }
            str3 = A0J.A0N("id", (String) null);
        } else {
            bArr = null;
            str2 = null;
        }
        if (str3 == null) {
            i2 = -1;
        } else {
            try {
                i2 = Integer.parseInt(str3);
            } catch (NumberFormatException unused2) {
                throw new AnonymousClass1W9(C13680ns.A0h("Malformed photo id=", str3));
            }
        }
        this.A02.AVK(new AnonymousClass277(this.A03, str2, url, bArr, i2, C13690nt.A00("preview".equals(this.A06) ? 1 : 0)), this.A00);
    }
}
