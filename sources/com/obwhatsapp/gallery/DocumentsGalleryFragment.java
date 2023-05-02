package com.obwhatsapp.gallery;

import X.AnonymousClass10B;
import X.AnonymousClass1PD;
import X.AnonymousClass2DW;
import X.AnonymousClass326;
import X.C13680ns;
import X.C14870pt;
import X.C16300so;
import X.C16500tA;
import X.C19980zJ;
import X.C25711Kv;
import android.os.Bundle;
import com.obwhatsapp.R;

public class DocumentsGalleryFragment extends Hilt_DocumentsGalleryFragment implements AnonymousClass2DW {
    public C19980zJ A00;
    public C16300so A01;
    public C14870pt A02;
    public C25711Kv A03;
    public AnonymousClass10B A04;
    public C16500tA A05;
    public AnonymousClass1PD A06;

    public void A0n(Bundle bundle) {
        super.A0n(bundle);
        AnonymousClass326 r1 = new AnonymousClass326(this);
        this.A0A = r1;
        this.A02.setAdapter(r1);
        C13680ns.A0M(A06(), R.id.empty_text).setText(R.string.str0dea);
    }
}
