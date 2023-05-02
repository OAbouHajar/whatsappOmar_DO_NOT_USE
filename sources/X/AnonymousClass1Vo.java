package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1Vo  reason: invalid class name */
public class AnonymousClass1Vo {
    public String A00;
    public String A01;
    public String A02;
    public final C39991tO A03;

    public AnonymousClass1Vo(C39991tO r1, String str, String str2, String str3) {
        this.A03 = r1;
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public static AnonymousClass1Vo A00(String str, String str2, String str3) {
        return new AnonymousClass1Vo(new C39991tO(), str, str2, str3);
    }

    public static String A01(String str, String str2) {
        StringBuilder sb = new StringBuilder("PAY: ");
        StringBuilder sb2 = new StringBuilder(" - ");
        sb2.append(str);
        sb2.append(":");
        sb.append(sb2.toString());
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(" ");
            sb3.append(str2);
            sb.append(sb3.toString());
        }
        return sb.toString();
    }

    public String A02(String str) {
        return A03(this.A02, str).toString();
    }

    public final StringBuilder A03(String str, String str2) {
        StringBuilder sb = new StringBuilder("PAY: ");
        String str3 = this.A01;
        if (!TextUtils.isEmpty(str3)) {
            sb.append(String.format("[%s]", new Object[]{str3}));
        }
        if (TextUtils.isEmpty(str)) {
            str = this.A02;
        }
        sb.append(String.format("[%s]", new Object[]{str}));
        sb.append(" - ");
        sb.append(this.A00);
        sb.append(":");
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" ");
            sb.append(str2);
        }
        return sb;
    }

    public void A04(String str) {
        A03((String) null, str);
    }

    public void A05(String str) {
        String obj = A03((String) null, str).toString();
        if (TextUtils.isEmpty(obj)) {
            Log.e((Throwable) null);
        } else {
            Log.e(obj);
        }
    }

    public void A06(String str) {
        A09((String) null, str, (C40001tP[]) null);
    }

    public void A07(String str) {
        A03((String) null, str);
    }

    public void A08(String str, String str2, Throwable th) {
        String obj = A03(str, str2).toString();
        if (TextUtils.isEmpty(obj)) {
            Log.e(th);
        } else if (th == null) {
            Log.e(obj);
        } else {
            Log.e(obj, th);
        }
    }

    public void A09(String str, String str2, C40001tP[] r8) {
        int length;
        StringBuilder A032 = A03(str, str2);
        if (r8 != null && (length = r8.length) > 0) {
            A032.append(" [");
            int i2 = 0;
            do {
                C40001tP r1 = r8[i2];
                A032.append("{");
                A032.append(r1.A00);
                A032.append(" : ");
                A032.append(r1.A01);
                A032.append("}");
                if (i2 != length - 1) {
                    A032.append(",");
                }
                i2++;
            } while (i2 < length);
            A032.append("]");
        }
        Log.i(A032.toString());
    }

    public void A0A(String str, Throwable th) {
        String obj = A03((String) null, str).toString();
        if (TextUtils.isEmpty(obj)) {
            Log.e(th);
        } else if (th == null) {
            Log.e(obj);
        } else {
            Log.e(obj, th);
        }
    }
}
