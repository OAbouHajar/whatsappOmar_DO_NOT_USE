package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* renamed from: X.1NJ  reason: invalid class name */
public class AnonymousClass1NJ {
    public int A00 = 0;
    public AnonymousClass3CG A01 = null;
    public String A02;
    public final Context A03;
    public final Context A04;
    public final C16300so A05;
    public final AnonymousClass1NW A06;
    public final AnonymousClass01D A07;

    public AnonymousClass1NJ(Context context, C16300so r3, AnonymousClass1NW r4, AnonymousClass01D r5) {
        this.A04 = context;
        this.A05 = r3;
        this.A03 = context;
        this.A07 = r5;
        this.A06 = r4;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.ParcelFileDescriptor A00(java.lang.String r7) {
        /*
            r6 = this;
            X.34b r5 = r6.A01()     // Catch:{ Exception -> 0x004e }
            android.os.IInterface r1 = r5.A01()     // Catch:{ all -> 0x0049 }
            com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService r1 = (com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService) r1     // Catch:{ all -> 0x0049 }
            X.4ns r1 = (X.C96154ns) r1     // Catch:{ all -> 0x0049 }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ all -> 0x0049 }
            android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService"
            r4.writeInterfaceToken(r0)     // Catch:{ all -> 0x0041 }
            r4.writeString(r7)     // Catch:{ all -> 0x0041 }
            android.os.IBinder r2 = r1.A00     // Catch:{ all -> 0x0041 }
            r1 = 2
            r0 = 0
            r2.transact(r1, r4, r3, r0)     // Catch:{ all -> 0x0041 }
            r3.readException()     // Catch:{ all -> 0x0041 }
            android.os.Parcelable$Creator r1 = android.os.ParcelFileDescriptor.CREATOR     // Catch:{ all -> 0x0041 }
            int r0 = r3.readInt()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r1.createFromParcel(r3)     // Catch:{ all -> 0x0041 }
        L_0x0032:
            android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0     // Catch:{ all -> 0x0041 }
            goto L_0x0037
        L_0x0035:
            r0 = 0
            goto L_0x0032
        L_0x0037:
            r3.recycle()     // Catch:{ all -> 0x0049 }
            r4.recycle()     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ Exception -> 0x004e }
            return r0
        L_0x0041:
            r0 = move-exception
            r3.recycle()     // Catch:{ all -> 0x0049 }
            r4.recycle()     // Catch:{ all -> 0x0049 }
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x004d }
        L_0x004d:
            throw r0     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NJ.A00(java.lang.String):android.os.ParcelFileDescriptor");
    }

    public C605734b A01() {
        C605734b r0;
        synchronized (this) {
            this.A00++;
            r0 = new C605734b(this);
        }
        return r0;
    }

    public AnonymousClass54M A02() {
        AnonymousClass54M r0;
        synchronized (this) {
            this.A00++;
            r0 = new AnonymousClass54M(this);
        }
        return r0;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r6 = this;
            X.34b r5 = r6.A01()     // Catch:{ Exception -> 0x003a }
            android.os.IInterface r1 = r5.A01()     // Catch:{ all -> 0x0035 }
            com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService r1 = (com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService) r1     // Catch:{ all -> 0x0035 }
            X.4ns r1 = (X.C96154ns) r1     // Catch:{ all -> 0x0035 }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ all -> 0x0035 }
            android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService"
            r4.writeInterfaceToken(r0)     // Catch:{ all -> 0x002d }
            android.os.IBinder r2 = r1.A00     // Catch:{ all -> 0x002d }
            r1 = 4
            r0 = 0
            r2.transact(r1, r4, r3, r0)     // Catch:{ all -> 0x002d }
            r3.readException()     // Catch:{ all -> 0x002d }
            r3.recycle()     // Catch:{ all -> 0x0035 }
            r4.recycle()     // Catch:{ all -> 0x0035 }
            r5.close()     // Catch:{ Exception -> 0x003a }
            return
        L_0x002d:
            r0 = move-exception
            r3.recycle()     // Catch:{ all -> 0x0035 }
            r4.recycle()     // Catch:{ all -> 0x0035 }
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0     // Catch:{ Exception -> 0x003a }
        L_0x003a:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NJ.A03():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r3.getFileDescriptor() == null) goto L_0x0018;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0041 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0041=Splitter:B:26:0x0041, B:14:0x0032=Splitter:B:14:0x0032} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04() {
        /*
            r6 = this;
            r5 = 0
            X.34b r4 = r6.A01()     // Catch:{ 43s | SecurityException -> 0x0049, all -> 0x0042 }
            android.os.IInterface r0 = r4.A01()     // Catch:{ all -> 0x003d }
            com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService r0 = (com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService) r0     // Catch:{ all -> 0x003d }
            android.os.ParcelFileDescriptor r3 = r0.ACI()     // Catch:{ all -> 0x003d }
            if (r3 == 0) goto L_0x0018
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ all -> 0x0036 }
            r2 = 1
            if (r0 != 0) goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r1.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "GoogleMigrateClient/hasWhatsAppData; hasFileDescriptor = "
            r1.append(r0)     // Catch:{ all -> 0x0036 }
            r1.append(r2)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0036 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0036 }
            if (r3 == 0) goto L_0x0032
            r3.close()     // Catch:{ all -> 0x003d }
        L_0x0032:
            r4.close()     // Catch:{ 43s | SecurityException -> 0x0049, all -> 0x0042 }
            return r2
        L_0x0036:
            r0 = move-exception
            if (r3 == 0) goto L_0x003c
            r3.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0     // Catch:{ 43s | SecurityException -> 0x0049, all -> 0x0042 }
        L_0x0042:
            r1 = move-exception
            java.lang.String r0 = "GoogleMigrateClient/hasWhatsAppData()"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        L_0x0049:
            r2 = move-exception
            java.lang.String r1 = "GoogleMigrateClient/hasWhatsAppData(): "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NJ.A04():boolean");
    }

    public boolean A05(String str) {
        try {
            ApplicationInfo applicationInfo = this.A03.getPackageManager().getPackageInfo(str, 0).applicationInfo;
            if (!applicationInfo.enabled) {
                return false;
            }
            int i2 = applicationInfo.flags;
            boolean z2 = false;
            if ((i2 & 1) != 0) {
                z2 = true;
            }
            boolean z3 = false;
            if ((i2 & 128) != 0) {
                z3 = true;
            }
            return z2 || z3;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
