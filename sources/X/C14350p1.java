package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0p1  reason: invalid class name and case insensitive filesystem */
public final class C14350p1 {
    public static int A06;
    public static PendingIntent A07;
    public Messenger A00;
    public Messenger A01;
    public C14450pC A02;
    public final Context A03;
    public final AnonymousClass00O A04 = new AnonymousClass00O();
    public final C14090ob A05;

    public C14350p1(Context context, C14090ob r4) {
        this.A03 = context;
        this.A05 = r4;
        this.A00 = new Messenger(new C14430p9(Looper.getMainLooper(), this));
    }

    public static /* synthetic */ void A00(Message message, C14350p1 r10) {
        String str;
        Bundle bundle;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C14440pB());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C14450pC) {
                        r10.A02 = (C14450pC) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        r10.A01 = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            Log.w("FirebaseInstanceId", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            Log.d("FirebaseInstanceId", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                Log.w("FirebaseInstanceId", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                                return;
                            }
                            str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            bundle = intent2.putExtra("error", str2).getExtras();
                        } else {
                            AnonymousClass00O r3 = r10.A04;
                            synchronized (r3) {
                                for (int i2 = 0; i2 < r3.size(); i2++) {
                                    r10.A03((String) r3.A02[i2 << 1], intent2.getExtras());
                                }
                            }
                            return;
                        }
                    } else {
                        Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                        if (matcher.matches()) {
                            str = matcher.group(1);
                            String group = matcher.group(2);
                            bundle = intent2.getExtras();
                            bundle.putString("registration_id", group);
                        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            Log.d("FirebaseInstanceId", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                            return;
                        } else {
                            return;
                        }
                    }
                    r10.A03(str, bundle);
                    return;
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf2 = String.valueOf(action);
                    Log.d("FirebaseInstanceId", valueOf2.length() != 0 ? "Unexpected response action: ".concat(valueOf2) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        if (((X.C14520pJ) r4.getCause()).zza == 4) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle A01(android.os.Bundle r6) {
        /*
            r5 = this;
            X.0ob r0 = r5.A05
            int r1 = r0.A03()
            r0 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r1 < r0) goto L_0x00b3
            android.content.Context r0 = r5.A03
            X.0pD r2 = X.C14460pD.A00(r0)
            monitor-enter(r2)
            int r1 = r2.A00     // Catch:{ all -> 0x0075 }
            int r0 = r1 + 1
            r2.A00 = r0     // Catch:{ all -> 0x0075 }
            monitor-exit(r2)
            X.0pE r0 = new X.0pE
            r0.<init>(r1, r6)
            X.0on r4 = r2.A01(r0)
            java.lang.String r0 = "Must not be called on the main application thread"
            X.C13710nw.A06(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            java.lang.String r0 = "Task must not be null"
            X.C13710nw.A02(r4, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            boolean r0 = r4.A09()     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            if (r0 != 0) goto L_0x0052
            r0 = 0
            X.0pG r3 = new X.0pG     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            r3.<init>(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            java.util.concurrent.Executor r2 = X.C14500pH.A01     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            r4.A06(r3, r2)     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            r4.A05(r3, r2)     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            X.0oq r1 = r4.A03     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            X.0pI r0 = new X.0pI     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            r0.<init>(r3, r2)     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            r1.A00(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            r4.A04()     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            java.util.concurrent.CountDownLatch r0 = r3.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            r0.await()     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
        L_0x0052:
            boolean r0 = r4.A0A()     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r4.A01()     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            return r0
        L_0x005f:
            boolean r0 = r4.A05     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            if (r0 == 0) goto L_0x006b
            java.lang.String r1 = "Task is already canceled"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            r0.<init>(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            throw r0     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
        L_0x006b:
            java.lang.Exception r1 = r4.A00()     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            r0.<init>(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
            throw r0     // Catch:{ InterruptedException | ExecutionException -> 0x0078 }
        L_0x0075:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0078:
            r4 = move-exception
            r0 = 3
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x00a0
            java.lang.String r2 = java.lang.String.valueOf(r4)
            int r0 = r2.length()
            int r0 = r0 + 22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Error making request: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r3, r0)
        L_0x00a0:
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof X.C14520pJ
            if (r0 == 0) goto L_0x00cd
            java.lang.Throwable r0 = r4.getCause()
            X.0pJ r0 = (X.C14520pJ) r0
            int r1 = r0.zza
            r0 = 4
            if (r1 != r0) goto L_0x00cd
        L_0x00b3:
            android.os.Bundle r2 = r5.A02(r6)
            if (r2 == 0) goto L_0x00ce
            java.lang.String r1 = "google.messenger"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00ce
            android.os.Bundle r2 = r5.A02(r6)
            if (r2 == 0) goto L_0x00ce
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00ce
        L_0x00cd:
            r2 = 0
        L_0x00ce:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14350p1.A01(android.os.Bundle):android.os.Bundle");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final android.os.Bundle A02(android.os.Bundle r13) {
        /*
            r12 = this;
            java.lang.Class<X.0p1> r6 = X.C14350p1.class
            monitor-enter(r6)
            int r1 = A06     // Catch:{ all -> 0x0129 }
            int r0 = r1 + 1
            A06 = r0     // Catch:{ all -> 0x0129 }
            java.lang.String r5 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0129 }
            monitor-exit(r6)
            X.0p3 r8 = new X.0p3
            r8.<init>()
            X.00O r4 = r12.A04
            monitor-enter(r4)
            r4.put(r5, r8)     // Catch:{ all -> 0x0126 }
            monitor-exit(r4)     // Catch:{ all -> 0x0126 }
            X.0ob r9 = r12.A05
            int r0 = r9.A02()
            if (r0 == 0) goto L_0x011e
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r0 = "com.google.android.gms"
            r7.setPackage(r0)
            int r0 = r9.A02()
            r3 = 2
            if (r0 != r3) goto L_0x003f
            java.lang.String r0 = "com.google.iid.TOKEN_REQUEST"
        L_0x0035:
            r7.setAction(r0)
            r7.putExtras(r13)
            android.content.Context r2 = r12.A03
            monitor-enter(r6)
            goto L_0x0042
        L_0x003f:
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            goto L_0x0035
        L_0x0042:
            android.app.PendingIntent r1 = A07     // Catch:{ all -> 0x0129 }
            if (r1 != 0) goto L_0x0057
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0129 }
            r1.<init>()     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = "com.google.example.invalidpackage"
            r1.setPackage(r0)     // Catch:{ all -> 0x0129 }
            r0 = 0
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r2, r0, r1, r0)     // Catch:{ all -> 0x0129 }
            A07 = r1     // Catch:{ all -> 0x0129 }
        L_0x0057:
            java.lang.String r0 = "app"
            r7.putExtra(r0, r1)     // Catch:{ all -> 0x0129 }
            monitor-exit(r6)
            java.lang.String r6 = "kid"
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            int r0 = r0 + 5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "|ID|"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "|"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.putExtra(r6, r0)
            java.lang.String r6 = "FirebaseInstanceId"
            r10 = 3
            boolean r0 = android.util.Log.isLoggable(r6, r10)
            if (r0 == 0) goto L_0x00af
            android.os.Bundle r0 = r7.getExtras()
            java.lang.String r11 = java.lang.String.valueOf(r0)
            int r0 = r11.length()
            int r0 = r0 + 8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Sending "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r6, r0)
        L_0x00af:
            java.lang.String r1 = "google.messenger"
            android.os.Messenger r0 = r12.A00
            r7.putExtra(r1, r0)
            android.os.Messenger r0 = r12.A01
            if (r0 != 0) goto L_0x00be
            X.0pC r0 = r12.A02
            if (r0 == 0) goto L_0x00dd
        L_0x00be:
            android.os.Message r1 = android.os.Message.obtain()
            r1.obj = r7
            android.os.Messenger r0 = r12.A01     // Catch:{ RemoteException -> 0x00d2 }
            if (r0 == 0) goto L_0x00cc
            r0.send(r1)     // Catch:{ RemoteException -> 0x00d2 }
            goto L_0x00ea
        L_0x00cc:
            X.0pC r0 = r12.A02     // Catch:{ RemoteException -> 0x00d2 }
            r0.A00(r1)     // Catch:{ RemoteException -> 0x00d2 }
            goto L_0x00ea
        L_0x00d2:
            boolean r0 = android.util.Log.isLoggable(r6, r10)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r0 = "Messenger failed, fallback to startService"
            android.util.Log.d(r6, r0)
        L_0x00dd:
            int r0 = r9.A02()
            if (r0 != r3) goto L_0x00e7
            r2.sendBroadcast(r7)
            goto L_0x00ea
        L_0x00e7:
            r2.startService(r7)
        L_0x00ea:
            X.0on r3 = r8.A00     // Catch:{ InterruptedException | TimeoutException -> 0x0101, ExecutionException -> 0x00ff }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x0101, ExecutionException -> 0x00ff }
            java.lang.Object r0 = X.C14310ox.A00(r3, r0, r1)     // Catch:{ InterruptedException | TimeoutException -> 0x0101, ExecutionException -> 0x00ff }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ InterruptedException | TimeoutException -> 0x0101, ExecutionException -> 0x00ff }
            monitor-enter(r4)
            r4.remove(r5)     // Catch:{ all -> 0x00fc }
            monitor-exit(r4)     // Catch:{ all -> 0x00fc }
            return r0
        L_0x00fc:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00fc }
            throw r1
        L_0x00ff:
            r0 = move-exception
            goto L_0x010e
        L_0x0101:
            java.lang.String r0 = "No response"
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "TIMEOUT"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0114 }
            r1.<init>(r0)     // Catch:{ all -> 0x0114 }
            goto L_0x0113
        L_0x010e:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0114 }
            r1.<init>(r0)     // Catch:{ all -> 0x0114 }
        L_0x0113:
            throw r1     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r1 = move-exception
            monitor-enter(r4)
            r4.remove(r5)     // Catch:{ all -> 0x011b }
        L_0x0119:
            monitor-exit(r4)     // Catch:{ all -> 0x011b }
            goto L_0x011d
        L_0x011b:
            r1 = move-exception
            goto L_0x0119
        L_0x011d:
            throw r1
        L_0x011e:
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0126:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0126 }
            throw r1
        L_0x0129:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14350p1.A02(android.os.Bundle):android.os.Bundle");
    }

    public final void A03(String str, Bundle bundle) {
        AnonymousClass00O r4 = this.A04;
        synchronized (r4) {
            C14370p3 r0 = (C14370p3) r4.remove(str);
            if (r0 == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
            } else {
                r0.A01(bundle);
            }
        }
    }
}
