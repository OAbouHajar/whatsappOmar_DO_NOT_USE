package com.obwhatsapp.gallery;

import X.AnonymousClass10B;
import X.AnonymousClass17N;
import X.AnonymousClass1WA;
import X.AnonymousClass2DW;
import X.AnonymousClass325;
import X.C13680ns;
import X.C17250um;
import X.C19980zJ;
import X.C25791Ld;
import X.C26081Mg;
import X.C85934Qo;
import android.content.Context;
import android.os.Bundle;
import com.obwhatsapp.R;

public class LinksGalleryFragment extends Hilt_LinksGalleryFragment implements AnonymousClass2DW {
    public C19980zJ A00;
    public C85934Qo A01;
    public AnonymousClass10B A02;
    public AnonymousClass17N A03;
    public C26081Mg A04;
    public C17250um A05;
    public C25791Ld A06;

    public void A0n(Bundle bundle) {
        super.A0n(bundle);
        AnonymousClass325 r1 = new AnonymousClass325(this);
        this.A0A = r1;
        this.A02.setAdapter(r1);
        C13680ns.A0M(A06(), R.id.empty_text).setText(R.string.str0e12);
    }

    public void A16(Context context) {
        super.A16(context);
        this.A01 = new C85934Qo(new AnonymousClass1WA(this.A0E, false));
    }
}
