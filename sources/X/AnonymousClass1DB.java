package X;

import android.content.Context;
import android.content.Intent;
import com.obwhatsapp.crash.upload.ExceptionsUploadService;

/* renamed from: X.1DB  reason: invalid class name */
public class AnonymousClass1DB implements C19400yN, AnonymousClass1D6 {
    public boolean A00 = false;
    public final Context A01;

    public AnonymousClass1DB(Context context) {
        this.A01 = context;
    }

    public String AGT() {
        return "ExceptionsUploadAsyncInit";
    }

    public void AMX() {
        this.A00 = true;
    }

    public void AMc() {
        Context context = this.A01;
        boolean z2 = this.A00;
        Class<ExceptionsUploadService> cls = ExceptionsUploadService.class;
        Intent intent = new Intent(context, cls);
        intent.putExtra("app_version_changed", z2);
        AnonymousClass03J.A00(context, intent, cls, 1);
    }
}
