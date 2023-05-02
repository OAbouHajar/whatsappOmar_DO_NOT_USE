package X;

import android.view.ViewGroup;
import com.obwhatsapp.picker.searchexpressions.avatars.AvatarExpressionTabFragment;
import com.obwhatsapp.picker.searchexpressions.gifs.GifExpressionTabFragment;
import com.obwhatsapp.picker.searchexpressions.stickers.StickerExpressionTabFragment;

/* renamed from: X.3PR  reason: invalid class name */
public class AnonymousClass3PR extends AnonymousClass011 {
    public AnonymousClass01A A00;
    public final C16040sK A01;
    public final C14710pd A02;
    public final AvatarExpressionTabFragment A03 = new AvatarExpressionTabFragment();
    public final GifExpressionTabFragment A04 = new GifExpressionTabFragment();
    public final StickerExpressionTabFragment A05 = new StickerExpressionTabFragment();
    public final C26141Mm A06;

    public AnonymousClass3PR(AnonymousClass02C r2, C16040sK r3, C14710pd r4, C26141Mm r5) {
        super(r2, 0);
        this.A02 = r4;
        this.A01 = r3;
        this.A06 = r5;
    }

    public int A01() {
        return (this.A01.A0G() || !this.A02.A0C(1396) || !this.A06.A01()) ? 2 : 3;
    }

    public void A0C(ViewGroup viewGroup, Object obj, int i2) {
        super.A0C(viewGroup, obj, i2);
        if (this.A00 == obj) {
            return;
        }
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.A00 = (AnonymousClass01A) obj;
        }
    }

    public AnonymousClass01A A0G(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? this.A04 : this.A03 : this.A05 : this.A04;
    }
}
