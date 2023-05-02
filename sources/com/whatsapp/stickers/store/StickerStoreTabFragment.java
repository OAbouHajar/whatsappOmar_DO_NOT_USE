package com.whatsapp.stickers.store;

import X.AnonymousClass013;
import X.AnonymousClass14W;
import X.AnonymousClass1CX;
import X.AnonymousClass1MF;
import X.AnonymousClass1UP;
import X.AnonymousClass35H;
import X.AnonymousClass35I;
import X.AnonymousClass3Qh;
import X.C004601z;
import X.C02800Fh;
import X.C14710pd;
import X.C14750ph;
import X.C14870pt;
import X.C16040sK;
import X.C16620tM;
import X.C20100zV;
import X.C211613a;
import X.C213013o;
import X.C214714f;
import X.C26141Mm;
import X.C27121Qn;
import X.C37771pi;
import X.C38411qk;
import X.C41781we;
import X.C55522jm;
import X.C78383xw;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.facebook.redex.RunnableRunnableShape20S0100000_I1_3;
import com.facebook.redex.ViewOnClickCListenerShape20S0100000_I1_5;
import com.obwhatsapp.R;
import com.whatsapp.stickers.IDxSObserverShape100S0100000_2_I0;
import java.util.List;
import java.util.UUID;

public abstract class StickerStoreTabFragment extends Hilt_StickerStoreTabFragment {
    public int A00;
    public LayoutInflater A01;
    public View A02;
    public LinearLayoutManager A03;
    public RecyclerView A04;
    public C14870pt A05;
    public C16040sK A06;
    public AnonymousClass013 A07;
    public C14710pd A08;
    public C26141Mm A09;
    public C27121Qn A0A;
    public C213013o A0B;
    public C20100zV A0C;
    public AnonymousClass1MF A0D;
    public AnonymousClass14W A0E;
    public AnonymousClass1CX A0F;
    public C214714f A0G;
    public C55522jm A0H;
    public List A0I;
    public final ViewTreeObserver.OnGlobalLayoutListener A0J = new IDxLListenerShape144S0100000_2_I0(this, 29);
    public final C41781we A0K = new IDxSObserverShape100S0100000_2_I0(this, 1);

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A01 = layoutInflater;
        boolean z2 = this instanceof StickerStoreMyTabFragment;
        View inflate = layoutInflater.inflate(z2 ? R.layout.layout058d : R.layout.layout058b, viewGroup, false);
        this.A04 = (RecyclerView) C004601z.A0E(inflate, R.id.store_recycler_view);
        this.A02 = C004601z.A0E(inflate, R.id.store_progress);
        A0u();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.A03 = linearLayoutManager;
        linearLayoutManager.A1P(1);
        LinearLayoutManager linearLayoutManager2 = this.A03;
        linearLayoutManager2.A0A = true;
        this.A04.setLayoutManager(linearLayoutManager2);
        this.A04.getViewTreeObserver().addOnGlobalLayoutListener(this.A0J);
        this.A04.setNestedScrollingEnabled(true);
        this.A0E.A02(this.A0K);
        if (z2) {
            StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) this;
            stickerStoreMyTabFragment.A00 = inflate.findViewById(R.id.empty);
            TextView textView = (TextView) inflate.findViewById(R.id.get_stickers_button);
            AnonymousClass1UP.A06(textView);
            textView.setOnClickListener(new ViewOnClickCListenerShape20S0100000_I1_5((Object) stickerStoreMyTabFragment, 36));
        } else if (this instanceof StickerStoreFeaturedTabFragment) {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
            stickerStoreFeaturedTabFragment.A00 = inflate.findViewById(R.id.empty);
            View A0E2 = C004601z.A0E(inflate, R.id.floating_discover_third_party_app_button);
            stickerStoreFeaturedTabFragment.A01 = A0E2;
            A0E2.setVisibility(0);
            stickerStoreFeaturedTabFragment.A01.setContentDescription(stickerStoreFeaturedTabFragment.A0J(R.string.str16d3));
            stickerStoreFeaturedTabFragment.A01.setOnClickListener(new ViewOnClickCListenerShape20S0100000_I1_5((Object) stickerStoreFeaturedTabFragment, 35));
            if (stickerStoreFeaturedTabFragment.A1L()) {
                C211613a r2 = stickerStoreFeaturedTabFragment.A04;
                r2.A03 = UUID.randomUUID().toString();
                r2.A00 = 3;
            }
            stickerStoreFeaturedTabFragment.A04.A0o(stickerStoreFeaturedTabFragment.A07);
        }
        A1E();
        if (z2) {
            StickerStoreMyTabFragment stickerStoreMyTabFragment2 = (StickerStoreMyTabFragment) this;
            stickerStoreMyTabFragment2.A05 = false;
            C02800Fh r1 = new C02800Fh(new AnonymousClass3Qh(stickerStoreMyTabFragment2));
            stickerStoreMyTabFragment2.A01 = r1;
            r1.A0D(stickerStoreMyTabFragment2.A04);
            stickerStoreMyTabFragment2.A02.postDelayed(new RunnableRunnableShape20S0100000_I1_3(stickerStoreMyTabFragment2, 17), 300);
        } else {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment2 = (StickerStoreFeaturedTabFragment) this;
            stickerStoreFeaturedTabFragment2.A02.setVisibility(0);
            if (!stickerStoreFeaturedTabFragment2.A05) {
                stickerStoreFeaturedTabFragment2.A06 = true;
                C20100zV r5 = stickerStoreFeaturedTabFragment2.A0C;
                r5.A03.Acl(new RunnableRunnableShape10S0200000_I0_8(r5, 36, new C78383xw(stickerStoreFeaturedTabFragment2)));
                return inflate;
            }
        }
        return inflate;
    }

    public void A13() {
        this.A04.getViewTreeObserver().removeGlobalOnLayoutListener(this.A0J);
        AnonymousClass1CX r2 = this.A0F;
        C38411qk r0 = r2.A01;
        if (r0 != null) {
            r0.A02.A02(false);
            r2.A01 = null;
        }
        AnonymousClass1MF r02 = this.A0D;
        if (r02 != null) {
            r02.A03();
        }
        this.A0E.A03(this.A0K);
        super.A13();
    }

    public void A1B() {
        if (this instanceof StickerStoreFeaturedTabFragment) {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
            if (stickerStoreFeaturedTabFragment.A05) {
                stickerStoreFeaturedTabFragment.A06 = true;
                C20100zV r4 = stickerStoreFeaturedTabFragment.A0C;
                r4.A03.Acl(new RunnableRunnableShape10S0200000_I0_8(r4, 36, new C78383xw(stickerStoreFeaturedTabFragment)));
            }
        }
    }

    public void A1C() {
        if (this instanceof StickerStoreMyTabFragment) {
            ((StickerStoreMyTabFragment) this).A1M();
        }
    }

    public void A1D() {
        if (this instanceof StickerStoreMyTabFragment) {
            ((StickerStoreMyTabFragment) this).A1M();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r0.A0C() != 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1E() {
        /*
            r3 = this;
            X.2jm r0 = r3.A0H
            if (r0 == 0) goto L_0x000b
            int r0 = r0.A0C()
            r2 = 1
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1 = r3
            boolean r0 = r3 instanceof com.whatsapp.stickers.store.StickerStoreMyTabFragment
            if (r0 == 0) goto L_0x0020
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r1 = (com.whatsapp.stickers.store.StickerStoreMyTabFragment) r1
            android.view.View r1 = r1.A00
        L_0x0015:
            if (r1 == 0) goto L_0x001f
            r0 = 8
            if (r2 == 0) goto L_0x001c
            r0 = 0
        L_0x001c:
            r1.setVisibility(r0)
        L_0x001f:
            return
        L_0x0020:
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r1 = (com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment) r1
            android.view.View r1 = r1.A00
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.StickerStoreTabFragment.A1E():void");
    }

    public void A1F(C37771pi r6) {
        if (this instanceof StickerStoreMyTabFragment) {
            StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) this;
            if (stickerStoreMyTabFragment.A0H != null) {
                for (int i2 = 0; i2 < stickerStoreMyTabFragment.A0I.size(); i2++) {
                    if (((C37771pi) stickerStoreMyTabFragment.A0I.get(i2)).A0F.equals(r6.A0F)) {
                        stickerStoreMyTabFragment.A0I.set(i2, r6);
                        C55522jm r0 = stickerStoreMyTabFragment.A0H;
                        if (r0 != null) {
                            r0.A02(i2);
                            return;
                        }
                        return;
                    }
                }
                C55522jm r4 = stickerStoreMyTabFragment.A0H;
                if (r4 instanceof AnonymousClass35I) {
                    AnonymousClass35I r42 = (AnonymousClass35I) r4;
                    boolean z2 = false;
                    if (!r42.A00.isEmpty()) {
                        z2 = ((C37771pi) r42.A00.get(0)).A0Q;
                    }
                    r42.A00.add(z2 ? 1 : 0, r6);
                    r42.A03(r42.A00.indexOf(r6));
                    r42.A00.A1E();
                } else {
                    r4.A00.add(r6);
                    r4.A03(r4.A00.indexOf(r6));
                    r4.A01.A1E();
                }
                stickerStoreMyTabFragment.A05 = true;
            }
        } else if ((this instanceof StickerStoreFeaturedTabFragment) && this.A0I != null) {
            for (int i3 = 0; i3 < this.A0I.size(); i3++) {
                if (((C37771pi) this.A0I.get(i3)).A0F.equals(r6.A0F)) {
                    this.A0I.set(i3, r6);
                    C55522jm r02 = this.A0H;
                    if (r02 != null) {
                        r02.A02(i3);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void A1G(C37771pi r6) {
        if (this instanceof StickerStoreMyTabFragment) {
            if (this.A0I != null) {
                for (int i2 = 0; i2 < this.A0I.size(); i2++) {
                    C37771pi r2 = (C37771pi) this.A0I.get(i2);
                    if (r2.A0F.equals(r6.A0F)) {
                        r2.A05 = true;
                        C55522jm r0 = this.A0H;
                        if (r0 != null) {
                            r0.A02(i2);
                            return;
                        }
                        return;
                    }
                }
            }
        } else if (this instanceof StickerStoreFeaturedTabFragment) {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
            if (stickerStoreFeaturedTabFragment.A0I != null) {
                for (int i3 = 0; i3 < stickerStoreFeaturedTabFragment.A0I.size(); i3++) {
                    C37771pi r22 = (C37771pi) stickerStoreFeaturedTabFragment.A0I.get(i3);
                    if (r22.A0F.equals(r6.A0F)) {
                        r22.A05 = true;
                        C55522jm r02 = stickerStoreFeaturedTabFragment.A0H;
                        if (r02 != null) {
                            r02.A02(i3);
                        }
                    }
                }
                if (r6.A0Q) {
                    C55522jm r03 = stickerStoreFeaturedTabFragment.A0H;
                    List list = stickerStoreFeaturedTabFragment.A0I;
                    if (r03 == null) {
                        stickerStoreFeaturedTabFragment.A1I(new AnonymousClass35H(stickerStoreFeaturedTabFragment, list));
                        return;
                    }
                    r03.A00 = list;
                    r03.A01();
                }
            }
        }
    }

    public void A1H(C37771pi r4, int i2) {
        A0D().startActivityForResult(C14750ph.A0i(A0u(), r4.A0F, this instanceof StickerStoreMyTabFragment ? "sticker_store_my_tab" : "sticker_store_featured_tab"), 1);
    }

    public void A1I(C55522jm r4) {
        this.A0H = r4;
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.setLayoutFrozen(false);
            recyclerView.A0k(r4, true, true);
            recyclerView.A0s(true);
            recyclerView.requestLayout();
        }
        A1E();
    }

    public void A1J(String str) {
        if (this instanceof StickerStoreMyTabFragment) {
            if (this.A0I != null) {
                for (int i2 = 0; i2 < this.A0I.size(); i2++) {
                    C37771pi r1 = (C37771pi) this.A0I.get(i2);
                    if (r1.A0F.equals(str)) {
                        r1.A05 = false;
                        C55522jm r0 = this.A0H;
                        if (r0 != null) {
                            r0.A02(i2);
                            return;
                        }
                        return;
                    }
                }
            }
        } else if ((this instanceof StickerStoreFeaturedTabFragment) && this.A0I != null) {
            for (int i3 = 0; i3 < this.A0I.size(); i3++) {
                C37771pi r5 = (C37771pi) this.A0I.get(i3);
                if (r5.A0F.equals(str)) {
                    r5.A05 = false;
                    C55522jm r02 = this.A0H;
                    if (r02 != null) {
                        r02.A02(i3);
                    }
                    this.A05.A0H(A0K(R.string.str16d4, r5.A0H), 1);
                }
            }
        }
    }

    public void A1K(String str) {
        if (this instanceof StickerStoreMyTabFragment) {
            StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) this;
            C55522jm r3 = stickerStoreMyTabFragment.A0H;
            if (r3 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= r3.A00.size()) {
                        break;
                    }
                    C37771pi r1 = (C37771pi) r3.A00.get(i2);
                    if (r1.A0F.equals(str)) {
                        r3.A00.remove(r1);
                        if (r3.A00.size() == 0) {
                            r3.A01();
                        } else {
                            r3.A04(i2);
                        }
                        r3.A01.A1E();
                    } else {
                        i2++;
                    }
                }
                stickerStoreMyTabFragment.A05 = true;
            }
        } else if ((this instanceof StickerStoreFeaturedTabFragment) && this.A0I != null) {
            for (int i3 = 0; i3 < this.A0I.size(); i3++) {
                C37771pi r32 = (C37771pi) this.A0I.get(i3);
                if (r32.A0F.equals(str)) {
                    r32.A05 = false;
                    r32.A01 = 0;
                    r32.A02 = null;
                    C55522jm r0 = this.A0H;
                    if (r0 != null) {
                        r0.A02(i3);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public boolean A1L() {
        return !this.A06.A0G() && this.A08.A0E(C16620tM.A02, 1396);
    }
}
