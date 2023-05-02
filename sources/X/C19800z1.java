package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.0z1  reason: invalid class name and case insensitive filesystem */
public class C19800z1 {
    public final C16000sG A00;
    public final C19780yz A01;
    public final C14710pd A02;
    public final C16490t9 A03;
    public final List A04;

    public C19800z1(C16000sG r6, C19780yz r7, C14710pd r8, C16490t9 r9) {
        this.A02 = r8;
        this.A03 = r9;
        this.A00 = r6;
        this.A01 = r7;
        ArrayList arrayList = new ArrayList();
        String A06 = r8.A06(C16620tM.A02, 2836);
        if (!TextUtils.isEmpty(A06)) {
            try {
                JSONArray jSONArray = new JSONArray(A06);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String optString = jSONArray.optString(i2);
                    if (!TextUtils.isEmpty(optString)) {
                        arrayList.add(optString);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.A04 = arrayList;
    }

    public final C41331vc A00(C15830rv r4, C30591cd r5, Integer num) {
        Long l2;
        C41331vc r2 = new C41331vc();
        r2.A00 = num;
        r2.A03 = r5.AGV().A04;
        try {
            l2 = Long.valueOf(Long.parseLong(r4.user));
        } catch (NumberFormatException unused) {
            l2 = null;
        }
        r2.A01 = l2;
        r2.A02 = Long.valueOf((long) this.A01.A04(r4, 5).size());
        return r2;
    }

    public final boolean A01(C16740tZ r4) {
        C30611cf AGV;
        List<C39731sy> list;
        if (!(r4 instanceof C30591cd) || (AGV = ((C30591cd) r4).AGV()) == null || (list = AGV.A05) == null) {
            return false;
        }
        for (C39731sy r0 : list) {
            if (this.A04.contains(r0.A04)) {
                return true;
            }
        }
        return false;
    }
}
