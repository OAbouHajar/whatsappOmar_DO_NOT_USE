package X;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.5wn  reason: invalid class name and case insensitive filesystem */
public class C119255wn {
    public C111985hk A00;
    public C117055sN A01;
    public final C16180sb A02;
    public final C15900s5 A03;
    public final C17130ua A04;
    public final C16440t3 A05;
    public final C16980tz A06;
    public final C14730pf A07;
    public final C14710pd A08;
    public final C20330zs A09;
    public final C18300wT A0A;
    public final C19040xf A0B;

    public C119255wn(C16180sb r1, C15900s5 r2, C17130ua r3, C16440t3 r4, C16980tz r5, C14730pf r6, C14710pd r7, C20330zs r8, C18300wT r9, C19040xf r10) {
        this.A05 = r4;
        this.A08 = r7;
        this.A06 = r5;
        this.A04 = r3;
        this.A02 = r1;
        this.A03 = r2;
        this.A07 = r6;
        this.A0B = r10;
        this.A0A = r9;
        this.A09 = r8;
    }

    public static C117055sN A00(byte[] bArr, long j2) {
        String str;
        try {
            C33211iD A0U = C33211iD.A0U(bArr);
            if (!A0U.A0c()) {
                Log.e("dyiReportManager/create-report-info failed : invalid e2eMessage -> no document message found");
                return null;
            }
            C445324l r2 = A0U.A0C;
            if (r2 == null) {
                r2 = C445324l.A0L;
            }
            if ((r2.A00 & 1) == 1) {
                str = r2.A0J;
                if (TextUtils.isEmpty(str)) {
                    Log.e("dyiReportManager/create-report-info failed : url is empty");
                    return null;
                } else if (!"https".equalsIgnoreCase(Uri.parse(str).getScheme())) {
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append("dyiReportManager/create-report-info failed : invalid scheme; url =");
                    Log.e(AnonymousClass000.A0h(str, A0o));
                    return null;
                }
            } else {
                str = null;
            }
            return new C117055sN(str, (r2.A00 & 16) == 16 ? r2.A04 : 0, j2);
        } catch (C29791bD e2) {
            Log.e("dyiReportManager/create-report-info", e2);
            return null;
        }
    }

    public static void A01(AnonymousClass028 r1, C119255wn r2, String str) {
        r1.A09(Integer.valueOf(r2.A02(str)));
    }

    public synchronized int A02(String str) {
        return this.A0A.A01().getInt("personal".equals(str) ? "payment_dyi_report_state" : "business_payment_dyi_report_state", -1);
    }

    public synchronized C117055sN A03(String str) {
        byte[] A0H;
        if (this.A01 == null && (A0H = C004101u.A0H(A04(str))) != null) {
            C18300wT r7 = this.A0A;
            SharedPreferences A012 = r7.A01();
            boolean equals = "personal".equals(str);
            long j2 = A012.getLong(equals ? "payment_dyi_report_timestamp" : "business_payment_dyi_report_timestamp", -1);
            r7.A01().getLong(equals ? "payment_dyi_report_expiration_timestamp" : "business_payment_dyi_report_expiration_timestamp", -1);
            this.A01 = A00(A0H, j2);
        }
        return this.A01;
    }

    public final File A04(String str) {
        return new File(this.A06.A00.getFilesDir(), "personal".equals(str) ? "dyi.info" : "business_dyi.info");
    }

    public synchronized void A05(String str) {
        Log.i("dyiReportManager/reset");
        this.A01 = null;
        File A042 = A04(str);
        if (A042.exists() && !A042.delete()) {
            Log.e("dyiReportManager/reset/failed-delete-report-info");
        }
        C16180sb r2 = this.A02;
        File A0H = r2.A0H(str);
        if (A0H.exists() && !A0H.delete()) {
            Log.e("dyiReportManager/reset/failed-delete-report-file");
        }
        AnonymousClass1XI.A0E(r2.A0K(str), 0);
        this.A0A.A0G(str);
    }
}
