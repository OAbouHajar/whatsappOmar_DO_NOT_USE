package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.obwhatsapp.R;
import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.util.ViewOnClickCListenerShape2S0200000_I1_1;
import java.util.List;

/* renamed from: X.35H  reason: invalid class name */
public class AnonymousClass35H extends C55522jm {
    public Drawable.ConstantState A00;
    public final /* synthetic */ StickerStoreFeaturedTabFragment A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass35H(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment, List list) {
        super(stickerStoreFeaturedTabFragment, list);
        this.A01 = stickerStoreFeaturedTabFragment;
    }

    public int A0C() {
        int A0C = super.A0C();
        return (A0C <= 0 || !StickerStoreFeaturedTabFragment.A02(this.A01)) ? A0C : A0C + 1;
    }

    public void ANf(C005602k r9, int i2) {
        Drawable.ConstantState constantState;
        if (getItemViewType(i2) == 0) {
            C55512jl r92 = (C55512jl) r9;
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A01;
            if (StickerStoreFeaturedTabFragment.A02(stickerStoreFeaturedTabFragment)) {
                i2--;
            }
            super.ANf(r92, i2);
            C37771pi r4 = (C37771pi) this.A00.get(i2);
            boolean z2 = r4.A0N;
            int i3 = 8;
            ImageView imageView = r92.A05;
            if (z2) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            if (r4.A01()) {
                r92.A04.setVisibility(0);
                r92.A06.setVisibility(8);
                r92.A09.setVisibility(8);
                r92.A07.setVisibility(8);
                if (r4.A05) {
                    r92.A0E.setVisibility(4);
                    r92.A0A.setVisibility(0);
                } else {
                    r92.A0A.setVisibility(4);
                    r92.A0E.setVisibility(0);
                }
            } else if (r4.A05) {
                r92.A06.setVisibility(8);
                r92.A04.setVisibility(4);
                ProgressBar progressBar = r92.A09;
                progressBar.setVisibility(0);
                progressBar.setIndeterminate(true);
            } else if (r4.A02 != null) {
                ImageView imageView2 = r92.A06;
                imageView2.setVisibility(0);
                imageView2.setImageResource(R.drawable.countrypicker_checkmark);
                imageView2.setOnClickListener((View.OnClickListener) null);
                C13700nu.A0R(imageView2, stickerStoreFeaturedTabFragment, R.string.str16d7);
                imageView2.setClickable(false);
                imageView2.setFocusable(true);
                if (this.A00 == null) {
                    this.A00 = imageView2.getBackground().mutate().getConstantState();
                }
                imageView2.setBackgroundResource(0);
                r92.A09.setVisibility(8);
                r92.A04.setVisibility(4);
            } else {
                r92.A04.setVisibility(4);
                ImageView imageView3 = r92.A06;
                imageView3.setVisibility(0);
                r92.A09.setVisibility(8);
                imageView3.setImageResource(R.drawable.sticker_store_download);
                if (imageView3.getBackground() == null && (constantState = this.A00) != null) {
                    imageView3.setBackground(constantState.newDrawable(stickerStoreFeaturedTabFragment.A03()));
                }
                C13700nu.A0R(imageView3, stickerStoreFeaturedTabFragment, R.string.str16d5);
                imageView3.setOnClickListener(new ViewOnClickCListenerShape2S0200000_I1_1(this, 4, r4));
            }
            View view = r92.A03;
            if (!r4.A05 && r4.A02 == null && r4.A06) {
                i3 = 0;
            }
            view.setVisibility(i3);
        }
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        if (i2 != 1) {
            return super.APF(viewGroup, i2);
        }
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A01;
        return new C64803Rs(C13680ns.A0H(stickerStoreFeaturedTabFragment.A01, viewGroup, R.layout.layout058a), stickerStoreFeaturedTabFragment);
    }

    public int getItemViewType(int i2) {
        return (i2 != 0 || !StickerStoreFeaturedTabFragment.A02(this.A01)) ? 0 : 1;
    }
}
