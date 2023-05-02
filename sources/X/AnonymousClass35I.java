package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import java.util.List;

/* renamed from: X.35I  reason: invalid class name */
public class AnonymousClass35I extends C55522jm {
    public final /* synthetic */ StickerStoreMyTabFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass35I(StickerStoreMyTabFragment stickerStoreMyTabFragment, List list) {
        super(stickerStoreMyTabFragment, list);
        this.A00 = stickerStoreMyTabFragment;
    }

    public int A0C() {
        int A0C = super.A0C();
        return A0C > 0 ? A0C + 1 : A0C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r6.A04.size() != 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ANf(X.C005602k r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.getItemViewType(r10)
            if (r0 != 0) goto L_0x00ab
            X.2jl r9 = (X.C55512jl) r9
            super.ANf(r9, r10)
            java.util.List r0 = r8.A00
            java.lang.Object r6 = r0.get(r10)
            X.1pi r6 = (X.C37771pi) r6
            com.obwhatsapp.CircularProgressBar r3 = r9.A0H
            boolean r0 = r6.A0R
            r1 = 8
            r7 = 0
            if (r0 == 0) goto L_0x0025
            java.util.List r0 = r6.A04
            int r2 = r0.size()
            r0 = 0
            if (r2 == 0) goto L_0x0027
        L_0x0025:
            r0 = 8
        L_0x0027:
            r3.setVisibility(r0)
            android.widget.ImageView r5 = r9.A06
            r0 = 2131232507(0x7f0806fb, float:1.8081125E38)
            r5.setImageResource(r0)
            android.content.Context r2 = r5.getContext()
            r0 = 2131100882(0x7f0604d2, float:1.7814158E38)
            android.content.res.ColorStateList r0 = X.AnonymousClass00T.A03(r2, r0)
            X.C018808t.A00(r0, r5)
            android.widget.ImageView r3 = r9.A07
            r0 = 2131232511(0x7f0806ff, float:1.8081133E38)
            r3.setImageResource(r0)
            android.widget.ImageView r2 = r9.A08
            r0 = 2131231866(0x7f08047a, float:1.8079825E38)
            r2.setImageResource(r0)
            boolean r0 = r6.A01()
            r4 = 4
            if (r0 == 0) goto L_0x00b5
            X.C13690nt.A14(r5, r3, r2, r4)
            android.view.View r0 = r9.A04
            r0.setVisibility(r7)
            boolean r1 = r6.A05
            android.widget.TextView r0 = r9.A0E
            if (r1 == 0) goto L_0x00ac
            r0.setVisibility(r4)
            android.widget.ProgressBar r0 = r9.A0A
            r0.setVisibility(r7)
        L_0x006d:
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r4 = r8.A00
            r0 = 2131891921(0x7f1216d1, float:1.9418576E38)
            X.C13700nu.A0R(r5, r4, r0)
            r1 = 5
            com.whatsapp.util.ViewOnClickCListenerShape2S0200000_I1_1 r0 = new com.whatsapp.util.ViewOnClickCListenerShape2S0200000_I1_1
            r0.<init>(r8, r1, r6)
            r5.setOnClickListener(r0)
            r0 = 2131891937(0x7f1216e1, float:1.9418608E38)
            X.C13700nu.A0R(r3, r4, r0)
            r0 = 1
            r3.setLongClickable(r0)
            r1 = 1
            com.facebook.redex.ViewOnClickCListenerShape0S0000000_I1 r0 = new com.facebook.redex.ViewOnClickCListenerShape0S0000000_I1
            r0.<init>(r1)
            r3.setOnClickListener(r0)
            r1 = 5
            com.facebook.redex.IDxTListenerShape63S0200000_2_I1 r0 = new com.facebook.redex.IDxTListenerShape63S0200000_2_I1
            r0.<init>(r9, r1, r8)
            r3.setOnTouchListener(r0)
            r0 = 2131886112(0x7f120020, float:1.9406794E38)
            X.AnonymousClass2JP.A04(r3, r0)
            r0 = 2131891918(0x7f1216ce, float:1.941857E38)
            X.C13700nu.A0R(r2, r4, r0)
            r0 = 9
            X.C34331k5.A02(r2, r8, r0)
        L_0x00ab:
            return
        L_0x00ac:
            r0.setVisibility(r7)
            android.widget.ProgressBar r0 = r9.A0A
            r0.setVisibility(r4)
            goto L_0x006d
        L_0x00b5:
            android.view.View r0 = r9.A04
            r0.setVisibility(r4)
            boolean r0 = r6.A0Q
            if (r0 == 0) goto L_0x00c8
            r5.setVisibility(r4)
            r3.setVisibility(r1)
            r2.setVisibility(r7)
            goto L_0x006d
        L_0x00c8:
            r2.setVisibility(r1)
            r5.setVisibility(r7)
            r3.setVisibility(r7)
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35I.ANf(X.02k, int):void");
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        if (i2 != 1) {
            return super.APF(viewGroup, i2);
        }
        StickerStoreMyTabFragment stickerStoreMyTabFragment = this.A00;
        return new C64813Rt(C13680ns.A0H(LayoutInflater.from(stickerStoreMyTabFragment.A0u()), viewGroup, R.layout.layout058c), stickerStoreMyTabFragment);
    }

    public int getItemViewType(int i2) {
        return A0C() - 1 != i2 ? 0 : 1;
    }
}
