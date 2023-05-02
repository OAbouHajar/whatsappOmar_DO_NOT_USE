package com.obwhatsapp.conversation.conversationrow.nativeflow.commerce.extensions;

import X.AnonymousClass22Q;
import X.C003501o;

public class AndroidOreoOrientationIssueHandler$1 implements C003501o {
    public final /* synthetic */ AnonymousClass22Q A00;

    public AndroidOreoOrientationIssueHandler$1(AnonymousClass22Q r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r3.A00;
     */
    @androidx.lifecycle.OnLifecycleEvent(X.C011405n.ON_RESUME)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResumed(X.C001300o r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C001100m
            if (r0 == 0) goto L_0x001e
            X.22Q r2 = r3.A00
            java.lang.Integer r0 = r2.A00
            if (r0 == 0) goto L_0x001e
            X.00m r4 = (X.C001100m) r4
            int r0 = r0.intValue()
            r4.setRequestedOrientation(r0)
            X.04p r1 = r4.A06
            X.01o r0 = r2.A01
            r1.A01(r0)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.nativeflow.commerce.extensions.AndroidOreoOrientationIssueHandler$1.onResumed(X.00o):void");
    }
}
