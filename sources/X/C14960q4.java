package X;

import com.obwhatsapp.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0q4  reason: invalid class name and case insensitive filesystem */
public class C14960q4 extends C14970q5 {
    public final C14990q7 A00;
    public final C88964bN A01;
    public final String A02;
    public final List A03;
    public final Map A04;
    public final Set A05;

    public C14960q4(AnonymousClass4YH r3, C14990q7 r4, C88964bN r5, AnonymousClass4K0 r6, C25261Jc r7, String str, List list, Map map, Set set) {
        super(r3, r6, r7);
        this.A00 = r4;
        this.A04 = map;
        this.A01 = r5;
        this.A05 = set;
        this.A02 = str;
        if (list == null) {
            this.A03 = Collections.emptyList();
        } else {
            this.A03 = list;
        }
        C99344ts r0 = this.A03;
        r0.A00.add(new C99334tr());
    }

    public static C14960q4 A00(C14990q7 r9, List list) {
        return new C14960q4(AnonymousClass4YH.A00, r9, (C88964bN) null, C90154da.A01(r9.A02.A01), C62183Bz.A04(r9), (String) r9.A01.get(R.id.bk_context_key_logging_id), list, (Map) null, (Set) null);
    }
}
