package com.obwhatsapp.backup.google;

import X.AnonymousClass01V;
import X.C28251Uz;
import android.content.Context;

public class PromptDialogFragment extends Hilt_PromptDialogFragment {
    public C28251Uz A00;
    public AnonymousClass01V A01;

    public void A16(Context context) {
        super.A16(context);
        try {
            this.A00 = (C28251Uz) context;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement PromptDialogClickListener");
            throw new ClassCastException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (r3.getBoolean("cancelable") != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1B(android.os.Bundle r7) {
        /*
            r6 = this;
            android.os.Bundle r3 = r6.A04()
            java.lang.String r1 = "dialog_id"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x00b3
            int r5 = r3.getInt(r1)
            X.00l r0 = r6.A0C()
            X.1fu r4 = new X.1fu
            r4.<init>(r0)
            java.lang.String r1 = "title"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r3.getString(r1)
            r4.setTitle(r0)
        L_0x0029:
            java.lang.String r1 = "message"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0038
            java.lang.CharSequence r0 = r3.getCharSequence(r1)
            r4.A06(r0)
        L_0x0038:
            java.lang.String r1 = "neutral_button"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r3.getString(r1)
            r0 = 4
            com.facebook.redex.IDxCListenerShape6S0101000_2_I0 r2 = new com.facebook.redex.IDxCListenerShape6S0101000_2_I0
            r2.<init>(r6, r5, r0)
            java.lang.CharSequence r1 = r4.A0A(r1)
            X.0PG r0 = r4.A01
            r0.A0G = r1
            r0.A04 = r2
        L_0x0054:
            java.lang.String r1 = "positive_button"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0069
            java.lang.String r2 = r3.getString(r1)
            r1 = 2
            com.facebook.redex.IDxCListenerShape6S0101000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape6S0101000_2_I0
            r0.<init>(r6, r5, r1)
            r4.A09(r0, r2)
        L_0x0069:
            java.lang.String r1 = "negative_button"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x007e
            java.lang.String r2 = r3.getString(r1)
            r1 = 3
            com.facebook.redex.IDxCListenerShape6S0101000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape6S0101000_2_I0
            r0.<init>(r6, r5, r1)
            r4.A08(r0, r2)
        L_0x007e:
            java.lang.String r1 = "cancelable"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x008d
            boolean r1 = r3.getBoolean(r1)
            r0 = 0
            if (r1 == 0) goto L_0x008e
        L_0x008d:
            r0 = 1
        L_0x008e:
            r4.A07(r0)
            r6.A1H(r0)
            X.02l r2 = r4.create()
            r2.setCanceledOnTouchOutside(r0)
            java.lang.String r1 = "is_message_clickable"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r3.getBoolean(r1)
            if (r0 == 0) goto L_0x00b2
            r1 = 1
            com.facebook.redex.IDxSListenerShape78S0200000_2_I0 r0 = new com.facebook.redex.IDxSListenerShape78S0200000_2_I0
            r0.<init>(r2, r1, r6)
            r2.setOnShowListener(r0)
        L_0x00b2:
            return r2
        L_0x00b3:
            java.lang.String r1 = "dialog_id should be provided."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.google.PromptDialogFragment.A1B(android.os.Bundle):android.app.Dialog");
    }
}
