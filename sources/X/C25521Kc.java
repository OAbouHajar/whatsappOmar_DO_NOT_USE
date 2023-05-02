package X;

import com.AssemMods.translator.Language;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1Kc  reason: invalid class name and case insensitive filesystem */
public final class C25521Kc {
    public int A00;
    public List A01 = A00();
    public boolean A02 = Locale.getDefault().getLanguage().equals(Language.PORTUGUESE);
    public final C16980tz A03;
    public final C14710pd A04;

    public C25521Kc(C16980tz r3, C14710pd r4) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r4, 2);
        this.A03 = r3;
        this.A04 = r4;
    }

    public final List A00() {
        boolean z2 = this.A02;
        C14710pd r2 = this.A04;
        int i2 = 2010;
        if (z2) {
            i2 = 2011;
        }
        String valueOf = String.valueOf(r2.A06(C16620tM.A02, i2));
        C18450wi.A0H(valueOf, 0);
        List<String> A08 = C008603x.A08(valueOf, String.valueOf(new char[]{':'}[0]), 0);
        ArrayList arrayList = new ArrayList(AnonymousClass1J9.A0M(A08, 10));
        for (String A012 : A08) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.A03.A00.getResources().getString(R.string.str01d5));
            sb.append(" \"");
            sb.append(AnonymousClass1ZW.A01(A012, new Object[0]));
            sb.append('\"');
            arrayList.add(sb.toString());
        }
        return arrayList;
    }
}
