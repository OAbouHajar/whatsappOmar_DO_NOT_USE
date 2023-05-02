package X;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1N0  reason: invalid class name */
public class AnonymousClass1N0 extends C19970zI {
    public static final int A0E = ((int) TimeUnit.MINUTES.toMillis(60));
    public static final String A0F;
    public static final String A0G = AnonymousClass5wS.A03;
    public static final String A0H;
    public C75483sE A00;
    public Long A01;
    public String A02;
    public boolean A03;
    public final C14870pt A04;
    public final C26251Mz A05;
    public final C16440t3 A06;
    public final C16980tz A07;
    public final C15860rz A08;
    public final AnonymousClass013 A09;
    public final C14710pd A0A;
    public final C16490t9 A0B;
    public final C18090w8 A0C;
    public final C213013o A0D;

    static {
        StringBuilder sb = new StringBuilder("downloadable");
        String str = File.separator;
        sb.append(str);
        sb.append("bloks_pay");
        String obj = sb.toString();
        A0F = obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(str);
        sb2.append("layout");
        A0H = sb2.toString();
    }

    public AnonymousClass1N0(C14870pt r9, C17130ua r10, C26251Mz r11, C16440t3 r12, C16980tz r13, C15860rz r14, AnonymousClass013 r15, C14710pd r16, C16490t9 r17, C19950zG r18, C18090w8 r19, C213013o r20, C17670vS r21, C16320sq r22) {
        super(r10, r13, r18, r21, r22, 14);
        this.A06 = r12;
        this.A0A = r16;
        this.A04 = r9;
        this.A07 = r13;
        this.A0B = r17;
        this.A09 = r15;
        this.A05 = r11;
        this.A08 = r14;
        this.A0C = r19;
        this.A0D = r20;
        this.A00 = 15;
        this.A01 = 4;
    }

    public final C75483sE A0A() {
        C75483sE r2 = new C75483sE();
        int i2 = 0;
        if ("BR".equals(((AnonymousClass1N1) this.A05).AB2().A03)) {
            i2 = 4;
        }
        r2.A02 = Long.valueOf((long) i2);
        r2.A05 = "2.23.1.76";
        r2.A01 = Boolean.valueOf(this.A03);
        r2.A06 = this.A02;
        return r2;
    }

    public final String A0B() {
        String A002 = AnonymousClass5w0.A00(((AnonymousClass1N1) this.A05).AB2().A03);
        if (TextUtils.isEmpty(A002)) {
            return CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A002);
        sb.append("_p");
        return sb.toString();
    }

    public void A0C(C440622p r13, String str, boolean z2) {
        this.A03 = z2;
        this.A02 = str;
        C440622p r7 = r13;
        if (this.A09) {
            this.A06.Acl(new RunnableRunnableShape3S0200000_I0_1(this, 30, r13));
            return;
        }
        String str2 = null;
        if (TextUtils.isEmpty((CharSequence) null)) {
            str2 = "2.23.1.76";
        }
        C14710pd r4 = this.A0A;
        C213013o r1 = this.A0D;
        String A0B2 = A0B();
        String A062 = this.A09.A06();
        Uri.Builder A002 = AnonymousClass20U.A00(r4, r1);
        A002.appendQueryParameter("category", A0B2);
        if (A062 != null) {
            A002.appendQueryParameter("locale", A062);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            A002.appendQueryParameter("existing_id", (String) null);
        }
        if (!TextUtils.isEmpty(str2)) {
            A002.appendQueryParameter("version", str2);
        }
        super.A03(r7, (C108005Mh) null, (Object) null, A002.build().toString(), (String) null);
    }

    public void A0D(String str) {
        if (!A0E() || !A0F()) {
            A0C((C440622p) null, str, true);
        }
    }

    public boolean A0E() {
        return !A06(A00(A0G)) && !A06(A00(A0H));
    }

    public boolean A0F() {
        StringBuilder sb = new StringBuilder("2.23.1.76");
        sb.append(((AnonymousClass1N1) this.A05).AB2().A03);
        sb.append(" ");
        sb.append(this.A09.A06());
        return sb.toString().equals(((SharedPreferences) this.A08.A01.get()).getString("bloks_version", (String) null));
    }
}
