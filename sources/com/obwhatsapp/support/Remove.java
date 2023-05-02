package com.obwhatsapp.support;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass04o;
import X.AnonymousClass2Re;
import X.AnonymousClass2TA;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;

public class Remove extends C001000l implements AnonymousClass006 {
    public AnonymousClass013 A00;
    public boolean A01;
    public final Object A02;
    public volatile AnonymousClass2Re A03;

    public Remove() {
        this(0);
    }

    public Remove(int i2) {
        this.A02 = C13690nt.A0Y();
        this.A01 = false;
        C13680ns.A1G(this, 135);
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A00(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new AnonymousClass2Re(this);
                }
            }
        }
        return this.A03.generatedComponent();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str17a9);
        Intent A09 = C13680ns.A09();
        A09.putExtra("is_removed", true);
        C13680ns.A0r(this, A09);
    }
}
