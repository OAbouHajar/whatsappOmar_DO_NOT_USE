package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxDCompatShape22S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.2r9  reason: invalid class name and case insensitive filesystem */
public class C57422r9 extends AnonymousClass01X {
    public final Activity A00;
    public final C020009i A01 = new C020009i(new AnonymousClass3T8(this), C39461sW.class);
    public final C16040sK A02;
    public final C82684Dt A03;
    public final C16000sG A04;
    public final C16080sP A05;
    public final AnonymousClass2Ao A06;
    public final AnonymousClass013 A07;
    public final C15810rt A08;
    public final C16070sO A09;
    public final C218115n A0A;
    public final C25781Lc A0B;
    public final boolean A0C;

    public C57422r9(Activity activity, C16040sK r5, C82684Dt r6, C16000sG r7, C16080sP r8, AnonymousClass2Ao r9, AnonymousClass013 r10, C15810rt r11, C16070sO r12, C218115n r13, C25781Lc r14, boolean z2) {
        this.A02 = r5;
        this.A08 = r11;
        this.A04 = r7;
        this.A05 = r8;
        this.A07 = r10;
        this.A0B = r14;
        this.A0A = r13;
        this.A06 = r9;
        this.A09 = r12;
        this.A00 = activity;
        this.A0C = z2;
        this.A03 = r6;
    }

    public int A0C() {
        return this.A01.A03;
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r11, int i2) {
        C57682ra r112 = (C57682ra) r11;
        C39461sW r3 = (C39461sW) this.A01.A01(i2);
        AnonymousClass2Ao r8 = this.A06;
        C82684Dt r2 = this.A03;
        C16000sG r0 = r112.A05;
        GroupJid groupJid = r3.A02;
        C16010sH A0A2 = r0.A0A(groupJid);
        C15810rt r4 = r112.A07;
        int A022 = r4.A02(groupJid);
        ThumbnailButton thumbnailButton = r112.A04;
        if (A022 == 3) {
            thumbnailButton.setImageResource(R.drawable.avatar_announcement);
        } else {
            r8.A06(thumbnailButton, A0A2);
        }
        C30521cU r02 = r112.A02;
        String str = r3.A03;
        r02.A0E(str);
        r112.A01.A0I((List) null, r4.A02(groupJid) == 3 ? r112.A01.getResources().getText(R.string.str04d7) : C16070sO.A00(r112.A08, groupJid).A0M(r112.A00) ? r112.A06.A0K(groupJid, 1, true) : r112.A01.getResources().getString(R.string.str050b));
        WaImageButton waImageButton = r112.A03;
        C13680ns.A0t(waImageButton.getContext(), waImageButton, R.string.str13e4);
        C004601z.A0j(waImageButton, new IDxDCompatShape22S0100000_2_I0(new C54322hF[]{new C54332hG(C13680ns.A0d(waImageButton.getContext(), str, C13680ns.A1b(), 0, R.string.str003d))}, 4));
        if (r4.A02(groupJid) != 3) {
            C13680ns.A1B(waImageButton, r2, r3, 36);
            waImageButton.setVisibility(0);
        } else {
            waImageButton.setOnClickListener((View.OnClickListener) null);
            waImageButton.setVisibility(4);
        }
        if (!this.A0C) {
            waImageButton.setOnClickListener((View.OnClickListener) null);
            waImageButton.setVisibility(4);
        }
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        C16040sK r2 = this.A02;
        C15810rt r6 = this.A08;
        C16000sG r3 = this.A04;
        AnonymousClass013 r5 = this.A07;
        C16080sP r4 = this.A05;
        C25781Lc r8 = this.A0B;
        return new C57682ra(C13680ns.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.layout0062), r2, r3, r4, r5, r6, this.A09, r8);
    }
}
