package com.obwhatsapp.search;

import X.AnonymousClass01X;
import X.AnonymousClass0Ri;
import X.AnonymousClass0SJ;
import X.C64453Qb;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.util.Log;

public class SearchGridLayoutManager extends GridLayoutManager {
    public final AnonymousClass01X A00;

    public SearchGridLayoutManager(Context context, AnonymousClass01X r3) {
        super(6);
        this.A00 = r3;
        this.A01 = new C64453Qb(context, this);
    }

    public void A0t(AnonymousClass0SJ r2, AnonymousClass0Ri r3) {
        try {
            super.A0t(r2, r3);
        } catch (IndexOutOfBoundsException e2) {
            Log.e((Throwable) e2);
        }
    }
}
