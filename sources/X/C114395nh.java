package X;

import android.text.TextUtils;
import com.obwhatsapp.R;

/* renamed from: X.5nh  reason: invalid class name and case insensitive filesystem */
public class C114395nh extends C16690tT {
    public final String A00;
    public final /* synthetic */ C110645ea A01;

    public C114395nh(C110645ea r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str = this.A00;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C18290wS r0 = this.A01.A0H;
        r0.A06();
        return r0.A08.A0M((String) null, str);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass1Vt r0;
        AnonymousClass1Vt r6 = (AnonymousClass1Vt) obj;
        C110645ea r4 = this.A01;
        AnonymousClass1Vo r2 = r4.A0L;
        StringBuilder A0r = AnonymousClass000.A0r("onTransactionDetailData loaded: ");
        A0r.append(AnonymousClass000.A1V(r6));
        C110105dW.A1L(r2, A0r);
        if (r6 != null) {
            r4.A07 = r6;
        }
        AnonymousClass1Vt r22 = r4.A08;
        String str = r22.A0H;
        if ((str == null || str.equals("0")) && (r0 = r4.A07) != null) {
            r22.A0H = r0.A0H;
        }
        r4.A0M.Acl(new AnonymousClass66V(r4, R.string.str1903, 11));
    }
}
