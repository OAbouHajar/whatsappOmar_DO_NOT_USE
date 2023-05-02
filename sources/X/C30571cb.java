package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1cb  reason: invalid class name and case insensitive filesystem */
public class C30571cb extends C30581cc implements C30591cd, C16850tk, C16860tl, C30081bi {
    public C30611cf A00;

    public C30571cb(C28381Vw r2, long j2) {
        super(r2, (byte) 27, j2);
    }

    public C30571cb(C28381Vw r8, C30571cb r9, long j2) {
        super(r8, r9, j2, true);
        this.A00 = r9.A00.A00();
    }

    public String A18() {
        if (TextUtils.isEmpty(A0I())) {
            return this.A00.A02;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("*");
        sb2.append(A0I());
        sb2.append("*");
        sb.append(sb2.toString());
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append(this.A00.A02);
        return sb.toString();
    }

    public void A5j(AnonymousClass21Q r7, AnonymousClass1GC r8) {
        C33221iE r5 = r7.A04;
        C69633fM r4 = (C69633fM) r5.A05().A0U();
        C30611cf r0 = this.A00;
        if (r0 != null) {
            C69583fH A002 = AnonymousClass38C.A00(r5, r0);
            if (!TextUtils.isEmpty(A0I())) {
                String A0I = A0I();
                A002.A03();
                C59032uZ r1 = (C59032uZ) A002.A00;
                r1.A01 = 2;
                r1.A03 = A0I;
            }
            r4.A06(A002);
            r4.A05(A002);
            r5.A0D(r4);
            return;
        }
        StringBuilder sb = new StringBuilder("MessageTemplateHsm: cannot send encrypted hsm title message, ");
        sb.append(this.A10);
        Log.w(sb.toString());
    }

    public /* bridge */ /* synthetic */ C16740tZ A6L(C28381Vw r2, long j2) {
        return A12(r2, j2);
    }

    public String ACS() {
        C30611cf r1;
        String str;
        if (!TextUtils.isEmpty(A0I())) {
            StringBuilder sb = new StringBuilder();
            sb.append(A0I());
            sb.append(" ");
            r1 = this.A00;
            sb.append(r1.A02);
            str = sb.toString();
        } else {
            r1 = this.A00;
            str = r1.A02;
        }
        if (TextUtils.isEmpty(r1.A03)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.A00.A03);
        return sb2.toString();
    }

    public String ADz(AnonymousClass013 r2) {
        return !TextUtils.isEmpty(A0I()) ? A0I() : this.A00.A02;
    }

    public String AFB() {
        return !TextUtils.isEmpty(A0I()) ? A0I() : this.A00.A02;
    }

    public String AFK() {
        return A18();
    }

    public C30611cf AGV() {
        return this.A00;
    }

    public void Aep(C30611cf r1) {
        this.A00 = r1;
    }
}
