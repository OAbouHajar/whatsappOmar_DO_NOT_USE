package com.whatsapp.stickers.info;

import X.AnonymousClass1CX;
import X.AnonymousClass1MF;
import X.AnonymousClass1ML;
import X.AnonymousClass1UP;
import X.AnonymousClass2EA;
import X.C001000l;
import X.C004601z;
import X.C005702l;
import X.C06490Wi;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C16040sK;
import X.C16320sq;
import X.C19980zJ;
import X.C211613a;
import X.C26141Mm;
import X.C27651Sp;
import X.C32241fu;
import X.C34151jm;
import X.C78953yx;
import X.C85454On;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxLListenerShape394S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.obwhatsapp.R;
import com.whatsapp.stickers.StickerView;
import java.util.Collections;

public class StickerInfoDialogFragment extends Hilt_StickerInfoDialogFragment {
    public int A00;
    public View A01;
    public View A02;
    public Button A03;
    public Button A04;
    public Button A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public C19980zJ A09;
    public C16040sK A0A;
    public C26141Mm A0B;
    public AnonymousClass1ML A0C;
    public C211613a A0D;
    public C34151jm A0E;
    public AnonymousClass1MF A0F;
    public AnonymousClass1CX A0G;
    public StickerView A0H;
    public C85454On A0I;
    public C27651Sp A0J;
    public C16320sq A0K;
    public final DialogInterface.OnClickListener A0L = new IDxCListenerShape128S0100000_2_I1(this, 109);
    public final DialogInterface.OnClickListener A0M = new IDxCListenerShape128S0100000_2_I1(this, AnonymousClass2EA.A03);

    public static CharSequence A01(StickerInfoDialogFragment stickerInfoDialogFragment, CharSequence charSequence) {
        C14710pd r1 = stickerInfoDialogFragment.A04;
        return (r1 == null || r1.A0C(1963)) ? charSequence : charSequence.toString().toUpperCase(C13690nt.A0m(stickerInfoDialogFragment.A02));
    }

    public void A0q() {
        super.A0q();
        C06490Wi r1 = ((C005702l) this.A03).A00;
        Button button = r1.A0G;
        this.A03 = button;
        this.A04 = r1.A0E;
        this.A05 = r1.A0F;
        if (this.A0F != null && this.A0E != null && this.A0H != null && this.A0I == null) {
            button.setVisibility(8);
            this.A04.setVisibility(8);
            this.A05.setVisibility(8);
            AnonymousClass1MF r0 = this.A0F;
            C34151jm r2 = this.A0E;
            StickerView stickerView = this.A0H;
            int i2 = this.A00;
            r0.A04(stickerView, r2, new IDxLListenerShape394S0100000_2_I1(this, 1), 1, i2, i2, true, false);
            AnonymousClass1CX r3 = this.A0G;
            this.A0K.Ack(new C78953yx(this.A0B, this.A0E, r3, this), new Void[0]);
        }
    }

    public Dialog A1B(Bundle bundle) {
        C001000l A0D2 = A0D();
        this.A0E = (C34151jm) A04().getParcelable("sticker");
        C32241fu A002 = C32241fu.A00(A0D2);
        LayoutInflater layoutInflater = A0D2.getLayoutInflater();
        this.A00 = A03().getDimensionPixelSize(R.dimen.dimen0288);
        View inflate = layoutInflater.inflate(R.layout.layout057e, (ViewGroup) null);
        StickerView stickerView = (StickerView) C004601z.A0E(inflate, R.id.sticker_view);
        this.A0H = stickerView;
        stickerView.A03 = true;
        this.A01 = C004601z.A0E(inflate, R.id.progress_view);
        this.A02 = C004601z.A0E(inflate, R.id.sticker_info_container);
        this.A07 = C13680ns.A0L(inflate, R.id.sticker_pack_name);
        this.A08 = C13680ns.A0L(inflate, R.id.sticker_pack_publisher);
        this.A06 = C13680ns.A0L(inflate, R.id.bullet_sticker_info);
        AnonymousClass1UP.A06(this.A07);
        A002.setPositiveButton(R.string.str16bb, this.A0L);
        A002.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        A002.A0B(this.A0M, R.string.str16bb);
        A002.setView(inflate);
        return A002.create();
    }

    public final void A1N(C34151jm r6, C85454On r7) {
        if (r7.A06) {
            AnonymousClass1CX r4 = this.A0G;
            r4.A0Y.Acl(new RunnableRunnableShape10S0200000_I0_8(r4, 44, Collections.singleton(r6)));
            return;
        }
        this.A0G.A0F(Collections.singleton(r6));
        boolean z2 = r7.A05;
        C27651Sp r0 = this.A0J;
        if (z2) {
            r0.A04("starred");
        } else {
            r0.A05("starred");
        }
    }
}
