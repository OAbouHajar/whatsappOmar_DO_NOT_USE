package com.obwhatsapp.contactinput.contactscreen;

import X.AnonymousClass2BO;
import X.AnonymousClass5EE;
import X.AnonymousClass5EF;
import X.C11010i3;
import X.C11360ie;
import X.C14570pP;
import X.C15220qW;
import X.C18450wi;
import X.C64413Pe;
import X.C64563Qu;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import java.util.Collections;
import java.util.List;

public final class NativeContactActivity extends C14570pP {
    public final C15220qW A00 = new C11010i3(new AnonymousClass5EF(this), new AnonymousClass5EE(this), new C11360ie(), new AnonymousClass2BO(C64413Pe.class));

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout004f);
        List emptyList = Collections.emptyList();
        C18450wi.A0B(emptyList);
        C64563Qu r1 = new C64563Qu(emptyList);
        View findViewById = findViewById(R.id.form_recycler_view);
        C18450wi.A0B(findViewById);
        ((RecyclerView) findViewById).setAdapter(r1);
    }
}
