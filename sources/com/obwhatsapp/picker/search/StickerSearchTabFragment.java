package com.obwhatsapp.picker.search;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass3H7;
import X.AnonymousClass3QB;
import X.AnonymousClass4Om;
import X.AnonymousClass5QT;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C34151jm;
import X.C57482rF;
import X.C57622rT;
import X.C95114m7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import java.util.List;

public class StickerSearchTabFragment extends Hilt_StickerSearchTabFragment implements AnonymousClass5QT {
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public RecyclerView A01;
    public C14710pd A02;
    public C57482rF A03;

    public static StickerSearchTabFragment A01(int i2) {
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("sticker_category_tab", i2);
        StickerSearchTabFragment stickerSearchTabFragment = new StickerSearchTabFragment();
        stickerSearchTabFragment.A0T(A0D);
        return stickerSearchTabFragment;
    }

    public void A0w() {
        C57482rF r0 = this.A03;
        if (r0 != null) {
            r0.A04 = false;
            r0.A01();
        }
        super.A0w();
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context A022 = A02();
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0588);
        this.A01 = (RecyclerView) A0H.findViewById(R.id.tab_result);
        AnonymousClass01A r6 = this.A0D;
        if (r6 instanceof StickerSearchDialogFragment) {
            StickerSearchDialogFragment stickerSearchDialogFragment = (StickerSearchDialogFragment) r6;
            AnonymousClass3H7 r4 = stickerSearchDialogFragment.A00;
            AnonymousClass00B.A06(r4);
            List A0u = AnonymousClass000.A0u();
            Bundle bundle2 = this.A05;
            if (bundle2 != null) {
                int i2 = bundle2.getInt("sticker_category_tab");
                AnonymousClass3QB r0 = stickerSearchDialogFragment.A09;
                if (r0 != null) {
                    r0.A00.A0A(A0H(), new C95114m7(stickerSearchDialogFragment, this, i2));
                }
                List A0k = C13690nt.A0k(stickerSearchDialogFragment.A09.A00);
                A0u = A0k == null ? C13690nt.A0i(0) : stickerSearchDialogFragment.A0F.A00(A0k, i2);
            }
            C57482rF r62 = new C57482rF(A022, r4.A00(), this, C13680ns.A0Y(), A0u);
            this.A03 = r62;
            this.A01.setAdapter(r62);
            AnonymousClass4Om r63 = new AnonymousClass4Om(A022, viewGroup, this.A01, this.A03);
            this.A00 = r63.A07;
            A0H.getViewTreeObserver().addOnGlobalLayoutListener(this.A00);
            this.A01.A0o(new C57622rT(A03(), r63.A08, this.A02));
            return A0H;
        }
        throw AnonymousClass000.A0a("Parent fragment of StickerSearchTabFragment is not of type StickerSearchDialogFragment");
    }

    public void A13() {
        this.A01.getViewTreeObserver().removeGlobalOnLayoutListener(this.A00);
        List list = this.A01.A0b;
        if (list != null) {
            list.clear();
        }
        super.A13();
    }

    public void A14() {
        super.A14();
        C57482rF r0 = this.A03;
        if (r0 != null) {
            r0.A04 = true;
            r0.A01();
        }
    }

    public void AXt(C34151jm r3, Integer num, int i2) {
        AnonymousClass01A r1 = this.A0D;
        if (r1 instanceof StickerSearchDialogFragment) {
            ((StickerSearchDialogFragment) r1).AXt(r3, num, i2);
            return;
        }
        throw AnonymousClass000.A0a("Parent fragment of StickerSearchTabFragment is not of type StickerSearchDialogFragment");
    }
}
