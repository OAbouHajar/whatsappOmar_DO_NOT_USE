package com.whatsapp.util;

import X.AnonymousClass1ML;
import X.C211613a;
import X.C30011bb;
import X.C34331k5;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape1S0400000_I1;
import java.lang.ref.WeakReference;

public class ViewOnClickCListenerShape0S0400000_I0 extends C34331k5 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public ViewOnClickCListenerShape0S0400000_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    public void A06(View view) {
        if (this.A04 != 0) {
            ((C211613a) this.A03).A02(13);
            AnonymousClass1ML.A01((AnonymousClass1ML) this.A02, "avatar_sticker_picker", new WeakReference(this.A01));
            return;
        }
        ((C30011bb) this.A00).A1e.Acl(new RunnableRunnableShape1S0400000_I1(this, this.A01, this.A02, this.A03, 4));
    }
}
