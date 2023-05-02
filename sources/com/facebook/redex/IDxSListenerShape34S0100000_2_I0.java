package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass071;
import X.AnonymousClass090;
import X.AnonymousClass2AU;
import X.AnonymousClass2JH;
import X.AnonymousClass2X5;
import X.AnonymousClass3NN;
import X.C004601z;
import X.C009904t;
import X.C13680ns;
import X.C14990q7;
import X.C55982kl;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callgrid.view.CallGrid;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.obwhatsapp.emoji.EmojiPopupFooter;
import com.obwhatsapp.search.IteratingPlayer;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.Iterator;

public class IDxSListenerShape34S0100000_2_I0 extends AnonymousClass071 {
    public Object A00;
    public final int A01;

    public IDxSListenerShape34S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0113, code lost:
        r1 = (com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity) r4.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 1: goto L_0x0110;
                case 2: goto L_0x0009;
                case 3: goto L_0x0037;
                case 4: goto L_0x0129;
                case 5: goto L_0x0131;
                case 6: goto L_0x0139;
                case 7: goto L_0x0069;
                case 8: goto L_0x0081;
                case 9: goto L_0x0005;
                case 10: goto L_0x008d;
                case 11: goto L_0x014a;
                case 12: goto L_0x009d;
                case 13: goto L_0x00a9;
                case 14: goto L_0x0005;
                case 15: goto L_0x00c4;
                case 16: goto L_0x00e1;
                case 17: goto L_0x00f7;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A00(r5, r6, r7)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r3 = r4.A00
            com.obwhatsapp.biz.catalog.view.activity.ProductListActivity r3 = (com.obwhatsapp.biz.catalog.view.activity.ProductListActivity) r3
            r3.A35()
            X.2rL r0 = r3.A0D
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x0008
            X.02W r0 = r5.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            if (r0 == 0) goto L_0x0008
            int r2 = r0.A05()
            int r1 = r0.A06()
            int r0 = r0.A19()
            int r2 = r2 + r0
            int r1 = r1 - r2
            r0 = 4
            if (r1 > r0) goto L_0x0008
            X.2Sb r0 = r3.A0E
            r0.A05()
            return
        L_0x0037:
            if (r7 <= 0) goto L_0x0008
            java.lang.Object r3 = r4.A00
            com.obwhatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment r3 = (com.obwhatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment) r3
            androidx.recyclerview.widget.RecyclerView r0 = r3.A00
            X.C18450wi.A0F(r0)
            X.02W r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            if (r0 == 0) goto L_0x0008
            int r2 = r0.A05()
            int r1 = r0.A06()
            int r0 = r0.A19()
            int r2 = r2 + r0
            int r1 = r1 - r2
            r0 = 4
            if (r1 > r0) goto L_0x0008
            X.2XU r0 = r3.A1C()
            boolean r0 = r0.A0I()
            if (r0 != 0) goto L_0x0008
            r3.A1E()
            return
        L_0x0069:
            java.lang.Object r3 = r4.A00
            X.2JH r3 = (X.AnonymousClass2JH) r3
            if (r7 != 0) goto L_0x014e
            com.obwhatsapp.emoji.EmojiPopupFooter r2 = r3.A08
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0008
            r1 = 0
            X.3NN r0 = new X.3NN
            r0.<init>(r3, r1)
            r2.startAnimation(r0)
            r3.A04 = r1
            return
        L_0x0081:
            if (r7 == 0) goto L_0x0008
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.gifsearch.GifSearchContainer r0 = (com.obwhatsapp.gifsearch.GifSearchContainer) r0
            com.obwhatsapp.WaEditText r0 = r0.A07
            r0.A03()
            return
        L_0x008d:
            java.lang.Object r1 = r4.A00
            X.2X5 r1 = (X.AnonymousClass2X5) r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0008
            if (r7 == 0) goto L_0x0008
            X.2rH r0 = r1.A09
            r0.A0E()
            return
        L_0x009d:
            java.lang.Object r0 = r4.A00
            X.04t r0 = (X.C009904t) r0
            X.071 r0 = r0.A02
            if (r0 == 0) goto L_0x0008
            r0.A00(r5, r6, r7)
            return
        L_0x00a9:
            if (r7 == 0) goto L_0x0008
            java.lang.Object r1 = r4.A00
            com.obwhatsapp.scroller.RecyclerFastScroller r1 = (com.obwhatsapp.scroller.RecyclerFastScroller) r1
            r1.A02()
            X.2hu r0 = r1.A08
            if (r0 == 0) goto L_0x0008
            android.view.View r0 = r1.A02
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0008
            X.2hu r0 = r1.A08
            r0.AhP()
            return
        L_0x00c4:
            java.lang.Object r2 = r4.A00
            com.obwhatsapp.search.SearchFragment r2 = (com.obwhatsapp.search.SearchFragment) r2
            X.1fz r1 = r2.A04
            if (r1 == 0) goto L_0x00d0
            r0 = 3
            r1.A04(r0)
        L_0x00d0:
            r2.A1B()
            if (r7 == 0) goto L_0x0008
            int r1 = r5.A0B
            r0 = 1
            if (r1 != r0) goto L_0x0008
            com.obwhatsapp.search.SearchViewModel r1 = r2.A1L
            r0 = 0
            r1.A0Y(r0)
            return
        L_0x00e1:
            if (r6 != 0) goto L_0x0164
            if (r7 != 0) goto L_0x0164
            java.lang.Object r1 = r4.A00
            X.2jq r1 = (X.C55552jq) r1
            com.whatsapp.stickers.StickerView r0 = r1.A0E
            if (r0 == 0) goto L_0x0008
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0008
            r1.A0F()
            return
        L_0x00f7:
            java.lang.Object r3 = r4.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r3 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r3
            int r0 = r5.computeVerticalScrollOffset()
            r2 = 0
            boolean r1 = X.AnonymousClass000.A1Q(r0)
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x0008
            if (r1 != 0) goto L_0x010c
            r2 = 8
        L_0x010c:
            r0.setVisibility(r2)
            return
        L_0x0110:
            r0 = 5
            if (r7 <= r0) goto L_0x0121
            java.lang.Object r1 = r4.A00
            com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity r1 = (com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity) r1
            X.25l r0 = r1.A06
            if (r0 == 0) goto L_0x0121
            r0.A00()
            r0 = 0
            r1.A06 = r0
        L_0x0121:
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity r0 = (com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity) r0
            r0.A38()
            return
        L_0x0129:
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.calling.callgrid.view.CallGrid r0 = (com.obwhatsapp.calling.callgrid.view.CallGrid) r0
            r0.A07()
            return
        L_0x0131:
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.calling.callgrid.view.CallGrid r0 = (com.obwhatsapp.calling.callgrid.view.CallGrid) r0
            r0.A06()
            return
        L_0x0139:
            if (r7 < 0) goto L_0x0142
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment r0 = (com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r0
            r0.A1D()
        L_0x0142:
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment r0 = (com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r0
            r0.A1E()
            return
        L_0x014a:
            r4.A02(r5)
            return
        L_0x014e:
            com.obwhatsapp.emoji.EmojiPopupFooter r0 = r3.A08
            android.view.animation.Animation r0 = r0.getAnimation()
            if (r0 == 0) goto L_0x0159
            r0.cancel()
        L_0x0159:
            com.obwhatsapp.emoji.EmojiPopupFooter r1 = r3.A08
            int r0 = r1.A00
            int r0 = r0 + r7
            r1.setTopOffset(r0)
            r3.A04 = r7
            return
        L_0x0164:
            java.lang.Object r0 = r4.A00
            X.2jq r0 = (X.C55552jq) r0
            r0.A0E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxSListenerShape34S0100000_2_I0.A00(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public void A01(RecyclerView recyclerView, int i2) {
        EmojiPopupFooter emojiPopupFooter;
        AnonymousClass3NN r0;
        switch (this.A01) {
            case 0:
                if (i2 == 1) {
                    ((InputMethodManager) ((C14990q7) this.A00).A00.getSystemService("input_method")).hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
                    return;
                }
                return;
            case 5:
                CallGrid callGrid = (CallGrid) this.A00;
                CallGridViewModel callGridViewModel = callGrid.A05;
                if (callGridViewModel != null && i2 == 0) {
                    callGridViewModel.A0H(callGrid.getVisibleParticipantJids());
                    return;
                }
                return;
            case 7:
                int i3 = 0;
                if (i2 == 0) {
                    AnonymousClass2JH r4 = (AnonymousClass2JH) this.A00;
                    int height = r4.A08.getHeight();
                    if (r4.A04 > 0 && r4.A08.A00 > (height >> 1)) {
                        i3 = height;
                    }
                    emojiPopupFooter = r4.A08;
                    if (i3 != emojiPopupFooter.A00) {
                        r0 = new AnonymousClass3NN(r4, i3);
                    } else {
                        return;
                    }
                } else if (i2 == 1 && recyclerView.computeVerticalScrollRange() <= recyclerView.getHeight()) {
                    AnonymousClass2JH r1 = (AnonymousClass2JH) this.A00;
                    emojiPopupFooter = r1.A08;
                    if (emojiPopupFooter.A00 != 0) {
                        r0 = new AnonymousClass3NN(r1, 0);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                emojiPopupFooter.startAnimation(r0);
                return;
            case 9:
                AnonymousClass2AU r7 = (AnonymousClass2AU) this.A00;
                boolean z2 = r7.A04;
                boolean A1O = AnonymousClass000.A1O(i2);
                r7.A04 = A1O;
                if (z2 != A1O) {
                    Iterator it = r7.A02.iterator();
                    while (it.hasNext()) {
                        C55982kl r3 = (C55982kl) it.next();
                        if (r7.A04) {
                            r3.A0B(false);
                            r3.A0A(true);
                        } else {
                            IteratingPlayer iteratingPlayer = r7.A0r;
                            int i4 = r3.A06;
                            if (i4 == -1) {
                                i4 = r3.A05;
                            }
                            r3.A0B(AnonymousClass000.A1R(i4, iteratingPlayer.A00));
                            r3.A0A(false);
                        }
                    }
                    return;
                }
                return;
            case 10:
                if (i2 == 1) {
                    ((AnonymousClass2X5) this.A00).A02 = true;
                    return;
                } else if (i2 == 0) {
                    ((AnonymousClass2X5) this.A00).A09.A0E();
                    return;
                } else {
                    return;
                }
            case 11:
                A02(recyclerView);
                return;
            case 12:
                AnonymousClass071 r02 = ((C009904t) this.A00).A02;
                if (r02 != null) {
                    r02.A01(recyclerView, i2);
                    return;
                }
                return;
            case 14:
                IteratingPlayer iteratingPlayer2 = (IteratingPlayer) this.A00;
                if (i2 == 0) {
                    iteratingPlayer2.A02();
                    iteratingPlayer2.A03(iteratingPlayer2.A01);
                    if (!iteratingPlayer2.A03) {
                        iteratingPlayer2.A03 = true;
                        iteratingPlayer2.A00();
                        return;
                    }
                    return;
                }
                iteratingPlayer2.A01();
                return;
            case 17:
                int i5 = 0;
                boolean A1Q = AnonymousClass000.A1Q(recyclerView.computeVerticalScrollOffset());
                View view = ((StickerStorePackPreviewActivity) this.A00).A02;
                if (view != null) {
                    if (!A1Q) {
                        i5 = 8;
                    }
                    view.setVisibility(i5);
                    return;
                }
                return;
            default:
                super.A01(recyclerView, i2);
                return;
        }
    }

    public final void A02(RecyclerView recyclerView) {
        if (Build.VERSION.SDK_INT >= 21) {
            C009904t r5 = (C009904t) this.A00;
            if (r5.A04 != null) {
                float f2 = (C13680ns.A0D(recyclerView).getDisplayMetrics().density * 0.8f) + 0.5f;
                float min = Math.min(((float) recyclerView.computeVerticalScrollOffset()) / (((float) C13680ns.A0D(recyclerView).getDimensionPixelSize(R.dimen.dimen035b)) / 3.0f), 1.0f);
                if (min >= 0.0f && min <= 1.0f) {
                    f2 *= min;
                }
                r5.A04.AGv().setBackgroundColor(AnonymousClass090.A05(AnonymousClass090.A06(r5.A06, (int) (min * 13.0f)), r5.A05));
                C004601z.A0X(r5.A04.AGv(), f2);
            }
        }
    }
}
