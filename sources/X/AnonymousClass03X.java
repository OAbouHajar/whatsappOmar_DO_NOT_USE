package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.03X  reason: invalid class name */
public class AnonymousClass03X implements ServiceConnection, Handler.Callback {
    public Set A00 = new HashSet();
    public final Context A01;
    public final Handler A02;
    public final HandlerThread A03;
    public final Map A04 = new HashMap();

    public AnonymousClass03X(Context context) {
        this.A01 = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.A03 = handlerThread;
        handlerThread.start();
        this.A02 = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        if (r9.A03 != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C04930Oo r9) {
        /*
            r8 = this;
            java.lang.String r2 = "NotifManCompat"
            r7 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r7)
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "Processing component "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            android.content.ComponentName r0 = r9.A04
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.util.ArrayDeque r0 = r9.A02
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = " queued tasks"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
        L_0x002f:
            java.util.ArrayDeque r3 = r9.A02
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00a2
            boolean r0 = r9.A03
            if (r0 != 0) goto L_0x005b
            java.lang.String r1 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            android.content.ComponentName r5 = r9.A04
            android.content.Intent r1 = r0.setComponent(r5)
            android.content.Context r4 = r8.A01
            r0 = 33
            boolean r0 = r4.bindService(r1, r8, r0)
            r9.A03 = r0
            if (r0 == 0) goto L_0x0104
            r0 = 0
            r9.A00 = r0
        L_0x0057:
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x005f
        L_0x005b:
            android.support.v4.app.INotificationSideChannel r0 = r9.A01
            if (r0 != 0) goto L_0x00a3
        L_0x005f:
            android.os.Handler r5 = r8.A02
            android.content.ComponentName r4 = r9.A04
            boolean r0 = r5.hasMessages(r7, r4)
            if (r0 != 0) goto L_0x00a2
            int r0 = r9.A00
            r6 = 1
            int r1 = r0 + 1
            r9.A00 = r1
            r0 = 6
            if (r1 <= r0) goto L_0x011a
            java.lang.String r0 = "Giving up on delivering "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r3.size()
            r1.append(r0)
            java.lang.String r0 = " tasks to "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " after "
            r1.append(r0)
            int r0 = r9.A00
            r1.append(r0)
            java.lang.String r0 = " retries"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r2, r0)
            r3.clear()
        L_0x00a2:
            return
        L_0x00a3:
            java.lang.Object r4 = r3.peek()
            X.03U r4 = (X.AnonymousClass03U) r4
            if (r4 == 0) goto L_0x00fc
            boolean r0 = android.util.Log.isLoggable(r2, r7)     // Catch:{ DeadObjectException -> 0x00ce, RemoteException -> 0x00e8 }
            if (r0 == 0) goto L_0x00c5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DeadObjectException -> 0x00ce, RemoteException -> 0x00e8 }
            r1.<init>()     // Catch:{ DeadObjectException -> 0x00ce, RemoteException -> 0x00e8 }
            java.lang.String r0 = "Sending task "
            r1.append(r0)     // Catch:{ DeadObjectException -> 0x00ce, RemoteException -> 0x00e8 }
            r1.append(r4)     // Catch:{ DeadObjectException -> 0x00ce, RemoteException -> 0x00e8 }
            java.lang.String r0 = r1.toString()     // Catch:{ DeadObjectException -> 0x00ce, RemoteException -> 0x00e8 }
            android.util.Log.d(r2, r0)     // Catch:{ DeadObjectException -> 0x00ce, RemoteException -> 0x00e8 }
        L_0x00c5:
            android.support.v4.app.INotificationSideChannel r0 = r9.A01     // Catch:{ DeadObjectException -> 0x00ce, RemoteException -> 0x00e8 }
            r4.AdL(r0)     // Catch:{ DeadObjectException -> 0x00ce, RemoteException -> 0x00e8 }
            r3.remove()     // Catch:{ DeadObjectException -> 0x00ce, RemoteException -> 0x00e8 }
            goto L_0x00a3
        L_0x00ce:
            boolean r0 = android.util.Log.isLoggable(r2, r7)
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = "Remote service has died: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            android.content.ComponentName r0 = r9.A04
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
            goto L_0x00fc
        L_0x00e8:
            r4 = move-exception
            java.lang.String r0 = "RemoteException communicating with "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            android.content.ComponentName r0 = r9.A04
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r2, r0, r4)
        L_0x00fc:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00a2
            goto L_0x005f
        L_0x0104:
            java.lang.String r1 = "Unable to bind to listener "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r2, r0)
            r4.unbindService(r8)
            goto L_0x0057
        L_0x011a:
            int r1 = r1 - r6
            int r6 = r6 << r1
            int r3 = r6 * 1000
            boolean r0 = android.util.Log.isLoggable(r2, r7)
            if (r0 == 0) goto L_0x013a
            java.lang.String r0 = "Scheduling retry for "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " ms"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
        L_0x013a:
            android.os.Message r2 = r5.obtainMessage(r7, r4)
            long r0 = (long) r3
            r5.sendMessageDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03X.A00(X.0Oo):void");
    }

    public boolean handleMessage(Message message) {
        Set set;
        INotificationSideChannel r1;
        int i2 = message.what;
        if (i2 == 0) {
            Object obj = message.obj;
            Context context = this.A01;
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
            synchronized (AnonymousClass03S.A05) {
                if (string != null) {
                    if (!string.equals(AnonymousClass03S.A03)) {
                        HashSet hashSet = new HashSet(r4);
                        for (String unflattenFromString : string.split(":", -1)) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet.add(unflattenFromString2.getPackageName());
                            }
                        }
                        AnonymousClass03S.A04 = hashSet;
                        AnonymousClass03S.A03 = string;
                    }
                }
                set = AnonymousClass03S.A04;
            }
            if (!set.equals(this.A00)) {
                this.A00 = set;
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet2 = new HashSet();
                for (ResolveInfo next : queryIntentServices) {
                    if (set.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            StringBuilder sb = new StringBuilder("Permission present on component ");
                            sb.append(componentName);
                            sb.append(", not adding listener record.");
                            Log.w("NotifManCompat", sb.toString());
                        } else {
                            hashSet2.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    Map map = this.A04;
                    if (!map.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb2 = new StringBuilder("Adding listener record for ");
                            sb2.append(componentName2);
                            Log.d("NotifManCompat", sb2.toString());
                        }
                        map.put(componentName2, new C04930Oo(componentName2));
                    }
                }
                Iterator it2 = this.A04.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet2.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb3 = new StringBuilder("Removing listener record for ");
                            sb3.append(entry.getKey());
                            Log.d("NotifManCompat", sb3.toString());
                        }
                        C04930Oo r12 = (C04930Oo) entry.getValue();
                        if (r12.A03) {
                            context.unbindService(this);
                            r12.A03 = false;
                        }
                        r12.A01 = null;
                        it2.remove();
                    }
                }
            }
            for (C04930Oo r13 : this.A04.values()) {
                r13.A02.add(obj);
                A00(r13);
            }
        } else if (i2 == 1) {
            C04740Nt r0 = (C04740Nt) message.obj;
            ComponentName componentName3 = r0.A00;
            IBinder iBinder = r0.A01;
            C04930Oo r2 = (C04930Oo) this.A04.get(componentName3);
            if (r2 != null) {
                if (iBinder == null) {
                    r1 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    r1 = (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) ? new AnonymousClass0YL(iBinder) : (INotificationSideChannel) queryLocalInterface;
                }
                r2.A01 = r1;
                r2.A00 = 0;
                A00(r2);
                return true;
            }
        } else if (i2 == 2) {
            C04930Oo r14 = (C04930Oo) this.A04.get(message.obj);
            if (r14 != null) {
                if (r14.A03) {
                    this.A01.unbindService(this);
                    r14.A03 = false;
                }
                r14.A01 = null;
                return true;
            }
        } else if (i2 != 3) {
            return false;
        } else {
            C04930Oo r02 = (C04930Oo) this.A04.get(message.obj);
            if (r02 != null) {
                A00(r02);
            }
        }
        return true;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            StringBuilder sb = new StringBuilder("Connected to service ");
            sb.append(componentName);
            Log.d("NotifManCompat", sb.toString());
        }
        this.A02.obtainMessage(1, new C04740Nt(componentName, iBinder)).sendToTarget();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            StringBuilder sb = new StringBuilder("Disconnected from service ");
            sb.append(componentName);
            Log.d("NotifManCompat", sb.toString());
        }
        this.A02.obtainMessage(2, componentName).sendToTarget();
    }
}
