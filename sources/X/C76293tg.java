package X;

import com.obwhatsapp.picker.searchexpressions.ExpressionSearchViewModel;
import com.obwhatsapp.picker.searchexpressions.gifs.GifExpressionTabFragment;

/* renamed from: X.3tg  reason: invalid class name and case insensitive filesystem */
public class C76293tg extends AnonymousClass3R7 {
    public final /* synthetic */ GifExpressionTabFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76293tg(AnonymousClass01V r7, C16490t9 r8, C25841Li r9, C108745Pe r10, GifExpressionTabFragment gifExpressionTabFragment, C17020u3 r12) {
        super(r7, r8, r9, r10, r12);
        this.A00 = gifExpressionTabFragment;
    }

    public void A0E(C86974Uw r4) {
        ExpressionSearchViewModel expressionSearchViewModel;
        int i2;
        super.A0E(r4);
        GifExpressionTabFragment gifExpressionTabFragment = this.A00;
        int A0C = gifExpressionTabFragment.A04.A0C();
        boolean z2 = r4.A02;
        if (A0C == 0) {
            expressionSearchViewModel = gifExpressionTabFragment.A06;
            i2 = 3;
            if (!z2) {
                i2 = 1;
            }
        } else if (!z2) {
            expressionSearchViewModel = gifExpressionTabFragment.A06;
            i2 = 0;
        } else {
            return;
        }
        expressionSearchViewModel.A09.A0B(new C82874Em(i2));
    }
}
