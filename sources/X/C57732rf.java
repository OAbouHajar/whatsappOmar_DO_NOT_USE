package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.emoji.EmojiContainerView;

/* renamed from: X.2rf  reason: invalid class name and case insensitive filesystem */
public class C57732rf extends C005602k {
    public int A00;
    public C37781pj A01;
    public final ImageView A02;
    public final EmojiContainerView A03;
    public final C17250um A04;
    public final C108725Pc A05;
    public final C17020u3 A06;

    public C57732rf(LayoutInflater layoutInflater, ViewGroup viewGroup, C17250um r7, C108725Pc r8, C17020u3 r9, int i2) {
        super(layoutInflater.inflate(R.layout.layout0254, viewGroup, false));
        this.A04 = r7;
        this.A05 = r8;
        this.A06 = r9;
        View view = this.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
        EmojiContainerView emojiContainerView = (EmojiContainerView) view.findViewById(R.id.emoji_preview_container);
        this.A03 = emojiContainerView;
        this.A02 = C13680ns.A0K(view, R.id.emoji);
        emojiContainerView.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r1 != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07() {
        /*
            r5 = this;
            X.1pj r0 = r5.A01
            r4 = 0
            if (r0 != 0) goto L_0x000b
            com.obwhatsapp.emoji.EmojiContainerView r0 = r5.A03
            r0.setOnClickListener(r4)
            return
        L_0x000b:
            android.view.View r2 = r5.A0H
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = r1.height
            r1.width = r0
            r2.setLayoutParams(r1)
            com.obwhatsapp.emoji.EmojiContainerView r3 = r5.A03
            r0 = 1
            X.C13680ns.A16(r3, r5, r0)
            X.1pj r0 = r5.A01
            int[] r0 = r0.A00
            boolean r2 = X.C62153Bw.A03(r0)
            boolean r1 = X.C62153Bw.A02(r0)
            if (r2 != 0) goto L_0x002f
            r0 = 0
            if (r1 == 0) goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            r3.A04 = r0
            if (r1 == 0) goto L_0x0063
            X.0u3 r1 = r5.A06
            X.1pj r0 = r5.A01
            int[] r0 = r0.A00
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r1 = X.C61953Bb.A03(r1, r0)
            X.1pj r0 = new X.1pj
            r0.<init>((int[]) r1)
            r5.A01 = r0
            r0 = 6
            com.facebook.redex.IDxCListenerShape178S0100000_2_I1 r4 = new com.facebook.redex.IDxCListenerShape178S0100000_2_I1
            r4.<init>(r5, r0)
        L_0x0051:
            r3.setOnLongClickListener(r4)
        L_0x0054:
            android.widget.ImageView r1 = r5.A02
            X.1pj r0 = r5.A01
            java.lang.String r0 = r0.toString()
            r1.setContentDescription(r0)
            r5.A08()
            return
        L_0x0063:
            if (r2 == 0) goto L_0x0051
            X.0u3 r1 = r5.A06
            X.1pj r0 = r5.A01
            int[] r0 = r0.A00
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r1 = X.C61953Bb.A04(r1, r0)
            X.1pj r0 = new X.1pj
            r0.<init>((int[]) r1)
            r5.A01 = r0
            r0 = 1
            com.facebook.redex.IDxSListenerShape437S0100000_2_I1 r2 = new com.facebook.redex.IDxSListenerShape437S0100000_2_I1
            r2.<init>(r5, r0)
            r1 = 6
            com.facebook.redex.IDxCListenerShape53S0200000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape53S0200000_2_I1
            r0.<init>(r5, r1, r2)
            r3.setOnLongClickListener(r0)
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57732rf.A07():void");
    }

    public final void A08() {
        this.A02.setImageDrawable(this.A04.A04(this.A0H.getResources(), new C434420a(this.A01.A00), 0.75f, -1));
    }
}
