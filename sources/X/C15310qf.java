package X;

import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0qf  reason: invalid class name and case insensitive filesystem */
public class C15310qf implements C15240qY {
    public final C15250qZ A00;
    public final C15340qi A01;

    public C15310qf(C15340qi r2) {
        this.A01 = r2;
        this.A00 = ((C27311Rg) r2).AGI("max_size");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C15320qg r7, java.io.File r8, long r9) {
        /*
            r6 = this;
            java.lang.String r5 = r8.getCanonicalPath()     // Catch:{ IOException -> 0x0005 }
            goto L_0x0009
        L_0x0005:
            java.lang.String r5 = r8.getAbsolutePath()     // Catch:{ JSONException -> 0x0031 }
        L_0x0009:
            org.json.JSONObject r4 = r7.Agp()     // Catch:{ JSONException -> 0x0031 }
            X.0qb r0 = r7.A00     // Catch:{ JSONException -> 0x0031 }
            X.0qa r0 = (X.C15260qa) r0     // Catch:{ JSONException -> 0x0031 }
            boolean r0 = r0.A03     // Catch:{ JSONException -> 0x0031 }
            if (r0 == 0) goto L_0x002c
            r1 = 0
            java.lang.String r3 = "last_measured_size"
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0029
            X.0qZ r0 = r6.A00     // Catch:{ JSONException -> 0x0031 }
            org.json.JSONObject r2 = r0.A01(r5)     // Catch:{ JSONException -> 0x0031 }
            r0 = -1
            long r9 = r2.optLong(r3, r0)     // Catch:{ JSONException -> 0x0031 }
        L_0x0029:
            r4.put(r3, r9)     // Catch:{ JSONException -> 0x0031 }
        L_0x002c:
            X.0qZ r0 = r6.A00     // Catch:{ JSONException -> 0x0031 }
            r0.A03(r5, r4)     // Catch:{ JSONException -> 0x0031 }
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15310qf.A00(X.0qg, java.io.File, long):void");
    }

    public /* bridge */ /* synthetic */ void AUR(C29711b4 r12, C15270qb r13, File file) {
        String str;
        C15260qa r8 = (C15260qa) r13;
        File file2 = file;
        if (r8.A03) {
            try {
                str = file.getCanonicalPath();
            } catch (IOException unused) {
                str = file.getAbsolutePath();
            }
            long optLong = this.A00.A01(str).optLong("last_measured_size", -1);
            C15340qi r3 = this.A01;
            if (optLong > (((C15370ql) r3).AJ8() ? r8.A01 : r8.A00)) {
                r3.A7o(file);
                file.mkdirs();
            }
        }
        ((C27301Rf) this.A01).AC5(C47742Kf.CONCURRENT).execute(new RunnableRunnableShape0S0400000_I0(this, r12, r8, file2, 1));
    }
}
