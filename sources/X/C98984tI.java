package X;

import com.obwhatsapp.collections.MarginCorrectedViewPager;
import com.obwhatsapp.picker.searchexpressions.ExpressionTabFragment;
import com.obwhatsapp.picker.searchexpressions.ExpressionsSearchDialogFragment;

/* renamed from: X.4tI  reason: invalid class name and case insensitive filesystem */
public class C98984tI implements AnonymousClass2FZ {
    public final /* synthetic */ ExpressionTabFragment A00;
    public final /* synthetic */ ExpressionsSearchDialogFragment A01;

    public C98984tI(ExpressionTabFragment expressionTabFragment, ExpressionsSearchDialogFragment expressionsSearchDialogFragment) {
        this.A00 = expressionTabFragment;
        this.A01 = expressionsSearchDialogFragment;
    }

    public void AYi(C47812Kr r1) {
    }

    public void AYj(C47812Kr r3) {
        this.A01.A03.A03();
        MarginCorrectedViewPager marginCorrectedViewPager = this.A00.A06;
        AnonymousClass00B.A04(marginCorrectedViewPager);
        marginCorrectedViewPager.setCurrentItem(r3.A00);
    }
}
