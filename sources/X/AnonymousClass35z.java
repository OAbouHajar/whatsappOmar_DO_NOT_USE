package X;

import android.text.TextUtils;
import com.obwhatsapp.gifsearch.IDxResultShape79S0100000_2_I0;
import java.util.Collection;

/* renamed from: X.35z  reason: invalid class name */
public class AnonymousClass35z extends C16690tT {
    public final /* synthetic */ IDxResultShape79S0100000_2_I0 A00;
    public final /* synthetic */ String A01;

    public AnonymousClass35z(IDxResultShape79S0100000_2_I0 iDxResultShape79S0100000_2_I0, String str) {
        this.A00 = iDxResultShape79S0100000_2_I0;
        this.A01 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String A0C = AnonymousClass2GK.A0C("https://api.giphy.com/v1/gifs/trending", "api_key", AnonymousClass021.A0F, "rating", "pg-13");
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            A0C = AnonymousClass2GK.A0C(A0C, "offset", str);
        }
        C75683sY r1 = new C75683sY();
        r1.A08 = "Giphy";
        r1.A00 = 1;
        return C25851Lj.A00(r1, (C25851Lj) this.A00.A00, A0C);
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
