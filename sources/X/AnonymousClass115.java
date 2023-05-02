package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.115  reason: invalid class name */
public class AnonymousClass115 {
    public final C16980tz A00;
    public final AnonymousClass113 A01;
    public final C15940sA A02;
    public final AnonymousClass10T A03;
    public final AnonymousClass4R0 A04;
    public final Executor A05;

    public AnonymousClass115(C16980tz r4, AnonymousClass113 r5, C15940sA r6, AnonymousClass10T r7, C16320sq r8) {
        C28831Xx r2 = new C28831Xx(r8, 5, false);
        AnonymousClass4R0 r0 = new AnonymousClass4R0(r4, new C15950sB(r4, new C46782Gf()));
        this.A00 = r4;
        this.A03 = r7;
        this.A02 = r6;
        this.A01 = r5;
        this.A05 = r2;
        this.A04 = r0;
    }

    public final void A00(String str, boolean z2) {
        SecurityException securityException;
        try {
            if (this.A02.A01("com.facebook.stella").A03) {
                Intent intent = new Intent("com.obwhatsapp.action.INSTRUMENTATION_CALLBACK_SERVICE").setPackage("com.facebook.stella");
                try {
                    AnonymousClass4R0 r0 = this.A04;
                    String str2 = AnonymousClass01S.A09;
                    List<ResolveInfo> queryIntentServices = r0.A00.queryIntentServices(intent, 0);
                    if (!queryIntentServices.isEmpty()) {
                        if (queryIntentServices.size() <= 1) {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            if (serviceInfo == null || !str2.equals(serviceInfo.permission)) {
                                StringBuilder sb = new StringBuilder("Service not protected by permission ");
                                sb.append(str2);
                                securityException = new SecurityException(sb.toString());
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Multiple services can handle this intent ");
                            sb2.append(intent.getAction());
                            securityException = new SecurityException(sb2.toString());
                        }
                        throw securityException;
                    }
                    if (!this.A00.A00.bindService(intent, new C91584g9(this, str, z2), 1)) {
                        Log.w("CallbackServiceProxy/Failed to bind to stella service");
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("CallbackServiceProxy/Failed to bind to stella service", th);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Log.w("CallbackServiceProxy/verification failed, dropping event");
    }
}
