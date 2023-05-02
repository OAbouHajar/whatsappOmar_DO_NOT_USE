package com.facebook.redex;

import X.AnonymousClass29G;
import X.AnonymousClass5PG;
import android.view.KeyEvent;
import com.obwhatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.util.Log;

public class IDxIListenerShape444S0100000_2_I0 implements AnonymousClass5PG {
    public Object A00;
    public final int A01;

    public IDxIListenerShape444S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean ASV(int i2, KeyEvent keyEvent) {
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            MessageReplyActivity messageReplyActivity = (MessageReplyActivity) obj;
            if (i2 != 4 || keyEvent.getAction() != 1) {
                return false;
            }
            messageReplyActivity.A35();
            messageReplyActivity.A37();
            messageReplyActivity.A36();
            return false;
        }
        AnonymousClass29G r2 = (AnonymousClass29G) obj;
        if (i2 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        Log.i("MediaCaptionDialog/dismiss/send");
        r2.onDismiss();
        return false;
    }
}
