package com.facebook.redex;

import X.AnonymousClass1ZK;
import android.text.InputFilter;
import android.text.Spanned;
import com.obwhatsapp.notification.PopupNotification;
import com.obwhatsapp.status.playback.MessageReplyActivity;

public class IDxIFilterShape446S0100000_2_I0 implements InputFilter {
    public Object A00;
    public final int A01;

    public IDxIFilterShape446S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        AnonymousClass1ZK r0;
        int i6 = this.A01;
        Object obj = this.A00;
        if (i6 != 0) {
            r0 = ((MessageReplyActivity) obj).A16;
            if (r0 == null) {
                return null;
            }
        } else {
            r0 = ((PopupNotification) obj).A1I;
        }
        if (r0.A0P != null) {
            return "";
        }
        return null;
    }
}
