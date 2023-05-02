package com.obwhatsapp.businessapisearch.viewmodel;

import X.AnonymousClass02H;
import X.C13680ns;
import X.C26651Op;
import X.C30801cy;
import android.app.Application;
import android.content.SharedPreferences;

public class BusinessApiSearchActivityViewModel extends AnonymousClass02H {
    public final C26651Op A00;
    public final C30801cy A01;

    public BusinessApiSearchActivityViewModel(Application application, C26651Op r6) {
        super(application);
        SharedPreferences sharedPreferences;
        C30801cy A012 = C30801cy.A01();
        this.A01 = A012;
        this.A00 = r6;
        if (r6.A01.A0C(2760)) {
            synchronized (r6) {
                sharedPreferences = r6.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = r6.A02.A00("com.obwhatsapp_business_api");
                    r6.A00 = sharedPreferences;
                }
            }
            if (sharedPreferences.getBoolean("arg_should_show_nux", true)) {
                C13680ns.A1P(A012, 1);
            }
        }
    }
}
