package X;

import android.view.ViewGroup;
import com.obwhatsapp.picker.searchexpressions.ExpressionCategoryTabFragment;
import com.obwhatsapp.picker.searchexpressions.stickers.StickerCategoryTabFragment;

/* renamed from: X.3wN  reason: invalid class name and case insensitive filesystem */
public class C77713wN extends AnonymousClass3PN {
    public C77713wN(AnonymousClass02C r1) {
        super(r1);
    }

    public int A01() {
        return 7;
    }

    public void A0C(ViewGroup viewGroup, Object obj, int i2) {
        super.A0C(viewGroup, obj, i2);
        if (this.A00 != obj) {
            this.A00 = (ExpressionCategoryTabFragment) obj;
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass01A A0G(int i2) {
        return StickerCategoryTabFragment.A01(i2);
    }
}
