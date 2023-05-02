package X;

import android.content.Context;
import android.view.View;
import com.obwhatsapp.R;
import java.util.ArrayList;

/* renamed from: X.2pv  reason: invalid class name and case insensitive filesystem */
public class C57022pv extends C05230Pu {
    public final Context A00;
    public final C50402Zi A01;
    public final C16740tZ A02;
    public final C23611Cq A03;
    public final AnonymousClass1L1 A04;
    public final AnonymousClass4FL A05;
    public final AnonymousClass1AF A06;
    public final C23631Ct A07;
    public final AnonymousClass01D A08;
    public final boolean A09;

    public C57022pv(Context context, View view, C50402Zi r9, C16740tZ r10, C23611Cq r11, AnonymousClass1L1 r12, AnonymousClass4FL r13, AnonymousClass1AF r14, C23631Ct r15, AnonymousClass01D r16, boolean z2) {
        super(context, view, 0, R.attr.attr03db);
        this.A00 = context;
        this.A02 = r10;
        this.A07 = r15;
        this.A01 = r9;
        this.A03 = r11;
        this.A04 = r12;
        this.A05 = r13;
        this.A06 = r14;
        this.A08 = r16;
        this.A09 = z2;
        C016607w r5 = this.A04;
        ArrayList A0u = AnonymousClass000.A0u();
        C13680ns.A1W(Integer.valueOf(R.id.menuitem_forward), context.getString(R.string.str0d0f), A0u);
        C13680ns.A1W(Integer.valueOf(R.id.menuitem_share_status_third_party), context.getString(R.string.str0d10), A0u);
        if (this.A03.A01() && !(this.A02 instanceof C38701rH)) {
            C13680ns.A1W(Integer.valueOf(R.id.menuitem_share_status_facebook), context.getString(R.string.str0d12), A0u);
        }
        if (!this.A09) {
            C13680ns.A1W(Integer.valueOf(R.id.menuitem_delete), context.getString(R.string.str0d0e), A0u);
        }
        for (int i2 = 0; i2 < A0u.size(); i2++) {
            AnonymousClass01Q r1 = (AnonymousClass01Q) A0u.get(i2);
            Object obj = r1.A00;
            AnonymousClass00B.A06(obj);
            Object obj2 = r1.A01;
            AnonymousClass00B.A06(obj2);
            r5.add(0, ((Number) obj).intValue(), 0, (CharSequence) (String) obj2);
        }
    }
}
