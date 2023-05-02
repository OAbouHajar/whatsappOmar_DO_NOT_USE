package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass175;
import X.AnonymousClass39D;
import X.AnonymousClass3Q5;
import X.C110115dX;
import X.C111715hI;
import X.C1214265l;
import X.C13680ns;
import X.C16010sH;
import X.C18090w8;
import X.C18290wS;
import X.C35511m3;
import X.C447725m;
import X.C47372Ir;
import X.C87324Wh;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxObserverShape37S0200000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PaymentInvitePickerActivity extends C111715hI {
    public AnonymousClass175 A00;
    public C18090w8 A01;
    public C18290wS A02;
    public AnonymousClass3Q5 A03;

    public int A36() {
        return R.string.str105b;
    }

    public int A37() {
        return R.string.str106b;
    }

    public int A38() {
        return R.plurals.plurals0104;
    }

    public int A39() {
        return Integer.MAX_VALUE;
    }

    public int A3A() {
        return 1;
    }

    public int A3B() {
        return R.string.str0de0;
    }

    public Drawable A3C() {
        return C447725m.A00(this, this.A0S, R.drawable.ic_fab_next);
    }

    public void A3K() {
        ArrayList A0n = C13680ns.A0n(A3H());
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("referral_screen") : null;
        C87324Wh r4 = new C87324Wh(this, this, this.A05, this.A02, this.A03, (Runnable) null, new C1214265l(this, A0n), false);
        AnonymousClass00B.A0F(r4.A02());
        C47372Ir AEf = r4.A03.A03().AEf();
        if (AEf != null) {
            AnonymousClass3Q5 r1 = r4.A04;
            r1.A05(0);
            DialogFragment AEe = AEf.AEe(stringExtra, A0n, false, false);
            r4.A01.Afc(AEe);
            r1.A00.A0A(AEe, new IDxObserverShape37S0200000_2_I1(AEe, 6, r4));
        }
    }

    public void A3U(AnonymousClass39D r3, C16010sH r4) {
        super.A3U(r3, r4);
        TextEmojiLabel textEmojiLabel = r3.A02;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setText(R.string.str106c);
    }

    public void A3Z(ArrayList arrayList) {
        ArrayList A0u = AnonymousClass000.A0u();
        super.A3Z(A0u);
        if (this.A02.A03().AEf() != null) {
            List<C35511m3> A0E = C110115dX.A0H(this.A02).A0E(new int[]{2}, 3);
            HashMap A0x = AnonymousClass000.A0x();
            for (C35511m3 r1 : A0E) {
                A0x.put(r1.A05, r1);
            }
            Iterator it = A0u.iterator();
            while (it.hasNext()) {
                C16010sH r3 = (C16010sH) it.next();
                Object obj = A0x.get(r3.A07());
                if (!this.A0F.A0V(C110115dX.A0I(r3)) && obj != null) {
                    arrayList.add(r3);
                }
            }
        }
    }

    public boolean A3d() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.hasExtra("extra_multi_invite_picker_title")) {
            setTitle(intent.getIntExtra("extra_multi_invite_picker_title", R.string.str105b));
        }
        this.A03 = C110115dX.A0U(this);
    }
}
