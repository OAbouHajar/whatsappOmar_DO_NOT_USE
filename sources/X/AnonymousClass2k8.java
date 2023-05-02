package X;

import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import java.util.List;

/* renamed from: X.2k8  reason: invalid class name */
public class AnonymousClass2k8 extends C55672k9 {
    public AnonymousClass349 A00;
    public boolean A01;
    public final C19980zJ A02;
    public final C16300so A03;
    public final C14870pt A04;
    public final C16260sj A05;
    public final C16500tA A06;
    public final AnonymousClass1PD A07;
    public final C16320sq A08;

    public AnonymousClass2k8(Context context, C19980zJ r2, C16300so r3, C14870pt r4, C85934Qo r5, C16260sj r6, C16500tA r7, C25781Lc r8, AnonymousClass1PD r9, C16320sq r10) {
        super(context, r5, r8);
        A00();
        this.A07 = r9;
        this.A04 = r4;
        this.A03 = r3;
        this.A08 = r10;
        this.A02 = r2;
        this.A06 = r7;
        this.A05 = r6;
    }

    public /* bridge */ /* synthetic */ CharSequence A02(C16010sH r8, C16740tZ r9) {
        C38631rA r92 = (C38631rA) r9;
        if (TextUtils.isEmpty(r92.A01)) {
            return "";
        }
        return C61963Bc.A02(C61963Bc.A01(getContext(), this.A04, this.A06, this.A09, r8, r92.A11.A02), C56522nn.A00(this.A01.getPaint(), AnonymousClass2SR.A02(getContext(), R.drawable.msg_status_doc, R.color.color055a), r92.A01));
    }

    /* renamed from: A07 */
    public void A05(C38631rA r4, List list) {
        super.A05(r4, list);
        this.A00.setMessage(r4, list);
        this.A00.setOnClickListener(new ViewOnClickCListenerShape0S0200000_I0(r4, 25, this));
    }
}
