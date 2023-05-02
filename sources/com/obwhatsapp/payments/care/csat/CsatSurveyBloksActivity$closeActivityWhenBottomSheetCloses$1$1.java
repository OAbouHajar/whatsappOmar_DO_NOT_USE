package com.obwhatsapp.payments.care.csat;

import X.AnonymousClass01A;
import X.C003501o;
import X.C011405n;
import androidx.lifecycle.OnLifecycleEvent;

public final class CsatSurveyBloksActivity$closeActivityWhenBottomSheetCloses$1$1 implements C003501o {
    public final /* synthetic */ AnonymousClass01A A00;
    public final /* synthetic */ CsatSurveyBloksActivity A01;

    public CsatSurveyBloksActivity$closeActivityWhenBottomSheetCloses$1$1(AnonymousClass01A r1, CsatSurveyBloksActivity csatSurveyBloksActivity) {
        this.A00 = r1;
        this.A01 = csatSurveyBloksActivity;
    }

    @OnLifecycleEvent(C011405n.ON_DESTROY)
    public final void onFragmentDestroyed() {
        this.A00.A0K.A01(this);
        this.A01.finish();
    }
}
