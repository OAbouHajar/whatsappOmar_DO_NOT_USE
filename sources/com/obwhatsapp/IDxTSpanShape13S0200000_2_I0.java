package com.obwhatsapp;

import X.AnonymousClass000;
import X.AnonymousClass3MG;
import X.C17110uY;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.obwhatsapp.inappsupport.ui.ContactUsActivity;
import com.whatsapp.util.Log;

public class IDxTSpanShape13S0200000_2_I0 extends AnonymousClass3MG {
    public Object A00;
    public Object A01;
    public final int A02 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxTSpanShape13S0200000_2_I0(Context context, C17110uY r3, Runnable runnable, int i2) {
        super(context, i2);
        this.A00 = r3;
        this.A01 = runnable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxTSpanShape13S0200000_2_I0(Context context, Context context2, ContactUsActivity contactUsActivity) {
        super(context);
        this.A00 = contactUsActivity;
        this.A01 = context2;
    }

    public void onClick(View view) {
        if (this.A02 != 0) {
            ((Runnable) this.A01).run();
            return;
        }
        ContactUsActivity contactUsActivity = (ContactUsActivity) this.A00;
        Class AEt = contactUsActivity.A0J.A03().AEt();
        Log.i(AnonymousClass000.A0g("PAY: ContactUsActivity starting settings ", AEt));
        Context context = (Context) this.A01;
        context.startActivity(new Intent(context, AEt));
        contactUsActivity.A36();
    }
}
