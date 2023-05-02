package X;

import android.text.TextUtils;
import com.obwhatsapp.gifsearch.IDxResultShape79S0100000_2_I0;
import java.util.Collection;

/* renamed from: X.3yc  reason: invalid class name and case insensitive filesystem */
public class C78743yc extends C16690tT {
    public final /* synthetic */ IDxResultShape79S0100000_2_I0 A00;
    public final /* synthetic */ String A01;

    public C78743yc(IDxResultShape79S0100000_2_I0 iDxResultShape79S0100000_2_I0, String str) {
        this.A00 = iDxResultShape79S0100000_2_I0;
        this.A01 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String A0C = AnonymousClass2GK.A0C("https://wa.tenor.co/v1/trending", "key", AnonymousClass021.A0P);
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            A0C = AnonymousClass2GK.A0C(A0C, "pos", str);
        }
        C75683sY r1 = new C75683sY();
        r1.A08 = "Tenor";
        r1.A00 = 1;
        return C25921Lq.A01(r1, (C25921Lq) this.A00.A00, A0C);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass01Q r5 = (AnonymousClass01Q) obj;
        if (r5 == null) {
            this.A00.A00((String) null, (Collection) null, true);
        } else {
            this.A00.A00((String) r5.A00, (Collection) r5.A01, false);
        }
    }
}
