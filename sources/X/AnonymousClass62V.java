package X;

import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;
import java.util.List;
import java.util.Map;

/* renamed from: X.62V  reason: invalid class name */
public class AnonymousClass62V implements AnonymousClass5S7 {
    public final /* synthetic */ C119965zu A00;
    public final /* synthetic */ WaBloksActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public AnonymousClass62V(C119965zu r1, WaBloksActivity waBloksActivity, String str, List list) {
        this.A00 = r1;
        this.A03 = list;
        this.A01 = waBloksActivity;
        this.A02 = str;
    }

    public void AR6(Map map) {
        C119965zu.A06(this.A01, this.A02);
    }

    public void AR7(C93644jX r12) {
        String str = r12.A04;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(r12.A02) || !TextUtils.isEmpty(r12.A03)) {
            List list = this.A03;
            String str2 = r12.A00;
            String str3 = r12.A02;
            WaBloksActivity waBloksActivity = this.A01;
            ((C16760tb) this.A00.A0P.get()).A0R((C16740tZ) null, str2, str, str3, waBloksActivity.getString(R.string.str17a3), list, r12.A00());
            if (list.size() == 1) {
                waBloksActivity.startActivity(new C14750ph().A0x(waBloksActivity, (C15830rv) C13690nt.A0Z(list)));
                return;
            }
            return;
        }
        C119965zu.A06(this.A01, this.A02);
    }
}
