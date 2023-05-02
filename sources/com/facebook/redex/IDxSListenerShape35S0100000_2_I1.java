package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass071;
import X.AnonymousClass3K2;
import X.AnonymousClass3NO;
import X.AnonymousClass3PX;
import X.C59692yn;
import X.C85414Oi;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.biz.catalog.view.CarouselScrollbarView;
import com.obwhatsapp.gallery.MediaGalleryActivity;
import com.obwhatsapp.picker.search.StickerSearchDialogFragment;
import com.obwhatsapp.picker.searchexpressions.ExpressionTabFragment;
import com.obwhatsapp.picker.searchexpressions.gifs.GifTabContainerLayout;
import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;

public class IDxSListenerShape35S0100000_2_I1 extends AnonymousClass071 {
    public Object A00;
    public final int A01;

    public IDxSListenerShape35S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(RecyclerView recyclerView, int i2, int i3) {
        View view;
        int i4;
        WaEditText waEditText;
        switch (this.A01) {
            case 0:
                if (i2 != 0) {
                    ((C85414Oi) this.A00).A03 += i2;
                }
                if (i3 != 0) {
                    ((C85414Oi) this.A00).A04 += i3;
                    return;
                }
                return;
            case 1:
                ((CarouselScrollbarView) this.A00).A00();
                return;
            case 2:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (linearLayoutManager != null) {
                    if (linearLayoutManager.A06() - (linearLayoutManager.A05() + linearLayoutManager.A19()) <= 4) {
                        C59692yn r0 = (C59692yn) this.A00;
                        AnonymousClass3PX r5 = r0.A0D;
                        r5.A02.A01(r5.A00, r0.A0K, r0.A0O, AnonymousClass3K2.A1X(r0.A00, -1));
                    }
                    C59692yn.A02((C59692yn) this.A00);
                    return;
                }
                return;
            case 3:
                AnonymousClass01A r3 = (AnonymousClass01A) this.A00;
                if (r3.A0A != null) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(-1);
                    View findViewById = r3.A0A.findViewById(R.id.shadow_top);
                    int i5 = 4;
                    if (canScrollVertically) {
                        i5 = 0;
                    }
                    findViewById.setVisibility(i5);
                }
                if (r3.A0A != null) {
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(1);
                    View findViewById2 = r3.A0A.findViewById(R.id.shadow_bottom);
                    int i6 = 4;
                    if (canScrollVertically2) {
                        i6 = 0;
                    }
                    findViewById2.setVisibility(i6);
                    return;
                }
                return;
            case 5:
                if (i3 != 0) {
                    waEditText = ((StickerSearchDialogFragment) this.A00).A05;
                    break;
                } else {
                    return;
                }
            case 6:
                if (i3 != 0) {
                    waEditText = ((ExpressionTabFragment) this.A00).A1A().A03;
                    break;
                } else {
                    return;
                }
            case 7:
                if (i3 != 0) {
                    waEditText = ((GifTabContainerLayout) this.A00).A03;
                    break;
                } else {
                    return;
                }
            case 8:
                StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this.A00;
                int A18 = stickerStoreFeaturedTabFragment.A03.A18();
                int top2 = stickerStoreFeaturedTabFragment.A01.getTop();
                if (A18 == 0) {
                    if (top2 != stickerStoreFeaturedTabFragment.A01.getHeight()) {
                        view = stickerStoreFeaturedTabFragment.A01;
                        i4 = view.getHeight();
                    } else {
                        return;
                    }
                } else if (top2 != 0 && stickerStoreFeaturedTabFragment.A01.getAnimation() == null) {
                    view = stickerStoreFeaturedTabFragment.A01;
                    i4 = 0;
                } else {
                    return;
                }
                view.startAnimation(new AnonymousClass3NO(stickerStoreFeaturedTabFragment.A01, i4));
                return;
            default:
                super.A00(recyclerView, i2, i3);
                return;
        }
        waEditText.A03();
    }

    public void A01(RecyclerView recyclerView, int i2) {
        switch (this.A01) {
            case 1:
                ((CarouselScrollbarView) this.A00).A00();
                return;
            case 4:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A00;
                MenuItem menuItem = mediaGalleryActivity.A04;
                if (menuItem != null && menuItem.isActionViewExpanded() && mediaGalleryActivity.getCurrentFocus() != null) {
                    InputMethodManager A0Q = mediaGalleryActivity.A08.A0Q();
                    AnonymousClass00B.A06(A0Q);
                    A0Q.hideSoftInputFromWindow(recyclerView.getWindowToken(), 2);
                    return;
                }
                return;
            default:
                super.A01(recyclerView, i2);
                return;
        }
    }
}
