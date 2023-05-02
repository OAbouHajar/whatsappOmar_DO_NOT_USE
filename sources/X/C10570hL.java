package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.whatsapp.util.Log;

/* renamed from: X.0hL  reason: invalid class name and case insensitive filesystem */
public class C10570hL implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ AnonymousClass0AF A02;

    public C10570hL(Context context, Intent intent, AnonymousClass0AF r3) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = intent;
    }

    public void run() {
        String A0h;
        AnonymousClass0AF r5 = this.A02;
        Context context = this.A00;
        Intent intent = this.A01;
        if ("com.facebook.rti.fbns.intent.RECEIVE".equals(intent.getAction())) {
            Bundle bundleExtra = intent.getBundleExtra("auth_bundle");
            if (bundleExtra == null) {
                A0h = "FBNSPreloadAuthUtils/Invalid auth bundle";
            } else {
                PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("auth_pending_intent");
                if (pendingIntent == null) {
                    A0h = "FBNSPreloadAuthUtils/Invalid auth intent";
                } else {
                    if (AnonymousClass08L.A01(context, Build.VERSION.SDK_INT >= 17 ? pendingIntent.getCreatorPackage() : pendingIntent.getTargetPackage())) {
                        String stringExtra = intent.getStringExtra("receive_type");
                        if ("message".equals(stringExtra)) {
                            r5.A00(context, intent.getStringExtra("data"));
                            String stringExtra2 = intent.getStringExtra("extra_notification_sender");
                            String stringExtra3 = intent.getStringExtra("extra_notification_id");
                            if (stringExtra2 != null && !stringExtra2.isEmpty() && stringExtra3 != null && !stringExtra3.isEmpty()) {
                                Intent intent2 = new Intent("com.facebook.rti.intent.ACTION_NOTIFICATION_ACK");
                                intent2.putExtra("extra_notification_id", stringExtra3);
                                intent2.putExtra("extra_processor_completed", true);
                                if ("com.facebook.services".equals(stringExtra2) || "com.facebook.services.dev".equals(stringExtra2)) {
                                    try {
                                        intent2.setPackage(stringExtra2);
                                        AnonymousClass08L.A00(context, intent2);
                                        context.sendBroadcast(intent2);
                                        return;
                                    } catch (RuntimeException e2) {
                                        if (!(e2.getCause() instanceof DeadObjectException)) {
                                            throw e2;
                                        }
                                        return;
                                    }
                                } else {
                                    A0h = AnonymousClass000.A0h(stringExtra2, AnonymousClass000.A0r("FBNSPreloadIPC/Unknown package "));
                                }
                            } else {
                                return;
                            }
                        } else if ("registered".equals(stringExtra)) {
                            r5.A01(context, intent.getStringExtra("data"));
                            return;
                        } else if (!"unregistered".equals(stringExtra) && "reg_error".equals(stringExtra)) {
                            intent.getStringExtra("data");
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            Log.e(A0h);
        }
    }
}
