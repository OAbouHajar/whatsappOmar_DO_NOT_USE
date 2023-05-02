package com.obwhatsapp.picker.search;

import X.AnonymousClass01V;
import X.AnonymousClass3H7;
import X.C108015Mi;
import X.C108745Pe;
import X.C13680ns;
import X.C15860rz;
import X.C16490t9;
import X.C17020u3;
import X.C23061Ai;
import X.C25841Li;
import X.C25861Lk;
import X.C47562Jm;
import X.C93544jN;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.gifsearch.GifSearchContainer;

public class GifSearchDialogFragment extends Hilt_GifSearchDialogFragment implements C108745Pe, C108015Mi {
    public AnonymousClass01V A00;
    public C15860rz A01;
    public C16490t9 A02;
    public C25841Li A03;
    public C25861Lk A04;
    public C17020u3 A05;
    public C23061Ai A06;

    public void A0q() {
        WaEditText waEditText;
        super.A0q();
        GifSearchContainer gifSearchContainer = (GifSearchContainer) this.A0A;
        if (gifSearchContainer != null && (waEditText = gifSearchContainer.A07) != null) {
            waEditText.A04(false);
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.A11(bundle, layoutInflater, viewGroup);
        GifSearchContainer gifSearchContainer = (GifSearchContainer) C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout02bc);
        gifSearchContainer.A00 = 48;
        C25841Li r7 = this.A03;
        C23061Ai r11 = this.A06;
        C16490t9 r5 = this.A02;
        gifSearchContainer.A00(A0D(), this.A00, this.A01, r5, (C47562Jm) null, r7, this.A04, this, this.A05, r11);
        gifSearchContainer.A0E = this;
        return gifSearchContainer;
    }

    public void ARt(C93544jN r2) {
        WaEditText waEditText;
        GifSearchContainer gifSearchContainer = (GifSearchContainer) this.A0A;
        if (!(gifSearchContainer == null || (waEditText = gifSearchContainer.A07) == null)) {
            waEditText.A03();
        }
        AnonymousClass3H7 r0 = this.A00;
        if (r0 != null) {
            r0.ARt(r2);
        }
    }
}
