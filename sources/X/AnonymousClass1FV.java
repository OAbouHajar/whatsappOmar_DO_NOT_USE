package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.obwhatsapp.AlarmService;

/* renamed from: X.1FV  reason: invalid class name */
public final class AnonymousClass1FV implements C19400yN {
    public final Context A00;

    public AnonymousClass1FV(Context context) {
        this.A00 = context;
    }

    public String AGT() {
        return "AlarmServiceAsyncInit";
    }

    public void AMc() {
        Context context = this.A00;
        Class<AlarmService> cls = AlarmService.class;
        AnonymousClass03J.A00(context, new Intent("com.obwhatsapp.action.SETUP", (Uri) null, context, cls), cls, 3);
    }
}
