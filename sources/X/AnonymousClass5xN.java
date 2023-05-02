package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.5xN  reason: invalid class name */
public class AnonymousClass5xN {
    public final C14870pt A00;
    public final C16440t3 A01;
    public final C16980tz A02;
    public final AnonymousClass013 A03;
    public final C221116r A04;
    public final AnonymousClass61W A05;
    public final C16320sq A06;

    public AnonymousClass5xN(C14870pt r1, C16440t3 r2, C16980tz r3, AnonymousClass013 r4, C221116r r5, AnonymousClass61W r6, C16320sq r7) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = r7;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }

    public static String A00(C16440t3 r2, AnonymousClass013 r3, long j2) {
        return C28891Zc.A05(r3, r2.A02(j2 - ((long) TimeZone.getTimeZone("Asia/Kolkata").getRawOffset())));
    }

    public static boolean A01(C14710pd r1, String str) {
        if (r1.A0C(1433)) {
            String A052 = r1.A05(2834);
            return !TextUtils.isEmpty(A052) && !TextUtils.isEmpty(str) && A052.contains(str);
        }
    }

    public static boolean A02(String str) {
        return str != null && !str.equals("ONETIME") && !str.equals("UNKNOWN");
    }

    public long A03(String str, boolean z2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse != null) {
                if (!z2) {
                    Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
                    instance.setTime(parse);
                    instance.set(11, 23);
                    instance.set(12, 59);
                    instance.set(13, 59);
                    instance.set(14, 999);
                    parse = instance.getTime();
                }
                return parse.getTime();
            }
        } catch (ParseException unused) {
        }
        Log.e("PAY: IndiaMandateUtils/getTimestamp, unexpected date format");
        return 0;
    }

    public String A04(long j2) {
        return C13680ns.A0d(this.A02.A00, C28891Zc.A05(this.A03, this.A01.A02(j2 - ((long) TimeZone.getTimeZone("Asia/Kolkata").getRawOffset()))), C13680ns.A1b(), 0, R.string.str1918);
    }

    public String A05(C28401Vy r6, String str) {
        String A9H = C35481m0.A05.A9H(this.A03, r6, 0);
        return "MAX".equals(str) ? C13680ns.A0d(this.A02.A00, A9H, C13680ns.A1b(), 0, R.string.str18e3) : A9H;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A06(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0009
            int r0 = r3.hashCode()
            switch(r0) {
                case -1738378111: goto L_0x0015;
                case -1681232246: goto L_0x0025;
                case -602281453: goto L_0x0035;
                case 64808441: goto L_0x0045;
                case 1134556285: goto L_0x0055;
                case 1271097434: goto L_0x0065;
                case 1297843654: goto L_0x0075;
                case 1720567065: goto L_0x0085;
                case 1896178312: goto L_0x0096;
                case 1954618349: goto L_0x00a7;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.0tz r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131892362(0x7f12188a, float:1.941947E38)
        L_0x0010:
            java.lang.String r0 = r1.getString(r0)
            return r0
        L_0x0015:
            java.lang.String r0 = "WEEKLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0tz r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131892461(0x7f1218ed, float:1.941967E38)
            goto L_0x0010
        L_0x0025:
            java.lang.String r0 = "YEARLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0tz r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131892462(0x7f1218ee, float:1.9419673E38)
            goto L_0x0010
        L_0x0035:
            java.lang.String r0 = "ONETIME"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0tz r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131892459(0x7f1218eb, float:1.9419667E38)
            goto L_0x0010
        L_0x0045:
            java.lang.String r0 = "DAILY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0tz r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131892455(0x7f1218e7, float:1.9419659E38)
            goto L_0x0010
        L_0x0055:
            java.lang.String r0 = "HALFYEARLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0tz r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131892457(0x7f1218e9, float:1.9419663E38)
            goto L_0x0010
        L_0x0065:
            java.lang.String r0 = "FORTNIGHTLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0tz r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131892456(0x7f1218e8, float:1.941966E38)
            goto L_0x0010
        L_0x0075:
            java.lang.String r0 = "BIMONTHLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0tz r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131892454(0x7f1218e6, float:1.9419657E38)
            goto L_0x0010
        L_0x0085:
            java.lang.String r0 = "QUARTERLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0tz r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131892460(0x7f1218ec, float:1.9419669E38)
            goto L_0x0010
        L_0x0096:
            java.lang.String r0 = "ASPRESENTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0tz r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131892453(0x7f1218e5, float:1.9419655E38)
            goto L_0x0010
        L_0x00a7:
            java.lang.String r0 = "MONTHLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0tz r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131892458(0x7f1218ea, float:1.9419665E38)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5xN.A06(java.lang.String):java.lang.String");
    }

    public void A07(Context context, C119395xh r15, C1221068h r16, String str, boolean z2) {
        String str2;
        Context context2 = context;
        C119395xh r8 = r15;
        C1221068h r9 = r16;
        String str3 = str;
        boolean z3 = z2;
        if (r15 == null) {
            str2 = "isValidMandateMetadata: Unable to parse ";
        } else {
            String str4 = r15.A0L;
            if (str4 != null && z2) {
                str2 = "isValidMandateMetadata: Update mandate is only supported through deeplink URL";
            } else if (!C115735qE.A02.contains(r15.A0C) || !AnonymousClass5x5.A00(r15.A0O)) {
                Log.w("isValidMandateMetadata: Purpose code invalid");
                this.A05.AKS(0, (Integer) null, "qr_code_scan_error", str3);
                this.A00.Acq(new C1215966c(context, r9, z3));
            } else {
                String str5 = r15.A0N;
                String str6 = r15.A0M;
                if (!(str5 == null || str6 == null)) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy", Locale.US);
                    try {
                        Date parse = simpleDateFormat.parse(str5);
                        Date parse2 = simpleDateFormat.parse(str6);
                        if (!(parse == null || parse2 == null || parse.after(parse2))) {
                            Object[] objArr = {r15.A0A, r15.A03, r15.A0K, r15.A05};
                            int i2 = 0;
                            while (objArr[i2] != null) {
                                i2++;
                                if (i2 >= 4) {
                                    AnonymousClass00B.A06(r15);
                                    C117515t7 r6 = new C117515t7(context2, r8, r9, this, str3, z3);
                                    if (TextUtils.isEmpty(str4)) {
                                        Context context3 = r6.A00;
                                        Intent A042 = C110105dW.A04(context3, IndiaUpiPaymentTransactionDetailsActivity.class);
                                        A042.setFlags(268435456);
                                        AnonymousClass5xQ.A02(A042, r6.A01, r6.A04);
                                        context3.startActivity(A042);
                                        r6.A02.ARM();
                                        return;
                                    }
                                    this.A06.Acl(new C1216066d(r6, this, str4));
                                    return;
                                }
                            }
                            str2 = "isValidMandateMetadata: missing mandatory fields";
                        }
                    } catch (ParseException unused) {
                    }
                }
                str2 = "isValidMandateMetadata: start and end date invalid";
            }
        }
        Log.w(str2);
        this.A05.AKS(0, (Integer) null, "qr_code_scan_error", str3);
        this.A00.Acq(new C1215966c(context, r9, z3));
    }
}
