package com.obwhatsapp.components;

import X.AnonymousClass006;
import X.C14550pN;
import X.C15810rt;
import X.C15830rv;
import X.C52652eD;
import X.C52662eE;
import X.C75893st;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.whatsapp.util.ViewOnClickCListenerShape1S0400000_I1;

public class InviteViaLinkView extends RelativeLayout implements AnonymousClass006 {
    public C15810rt A00;
    public C52662eE A01;
    public boolean A02;

    public InviteViaLinkView(Context context) {
        this(context, (AttributeSet) null);
    }

    public InviteViaLinkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InviteViaLinkView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (C15810rt) C52652eD.A00(generatedComponent()).A43.get();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setupOnClick(C15830rv r7, C14550pN r8, C75893st r9) {
        setOnClickListener(new ViewOnClickCListenerShape1S0400000_I1(this, r9, r7, r8, 0));
    }
}
