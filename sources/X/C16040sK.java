package X;

import android.content.SharedPreferences;
import com.obwhatsapp.Me;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0sK  reason: invalid class name and case insensitive filesystem */
public class C16040sK {
    public Me A00;
    public C28881Zb A01;
    public AnonymousClass1ZY A02;
    public AnonymousClass1ZX A03;
    public C28871Za A04;
    public AnonymousClass1ZT A05;
    public boolean A06 = false;
    public final C23411Bw A07;
    public final AnonymousClass1ZU A08 = new AnonymousClass1ZU();
    public final C16980tz A09;
    public final C15860rz A0A;
    public final C16290sm A0B;
    public final List A0C = new ArrayList();

    public C16040sK(C23411Bw r2, C16980tz r3, C15860rz r4, C16290sm r5) {
        this.A09 = r3;
        this.A0A = r4;
        this.A07 = r2;
        this.A0B = r5;
    }

    public int A00() {
        return this.A07.A01.A00.getInt("registration_device_id", 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:(2:27|28)|29|30) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0045 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x004c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.obwhatsapp.Me A01() {
        /*
            r5 = this;
            java.lang.String r0 = "memanager/getoldme"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A0B()
            X.0tz r0 = r5.A09
            android.content.Context r3 = r0.A00
            java.io.File r2 = r3.getFilesDir()
            java.lang.String r1 = "me_old"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            boolean r0 = r0.exists()
            r4 = 0
            if (r0 == 0) goto L_0x005a
            java.io.FileInputStream r3 = r3.openFileInput(r1)     // Catch:{ ClassNotFoundException -> 0x004d, IOException -> 0x0054 }
            X.1ZZ r1 = new X.1ZZ     // Catch:{ all -> 0x0046 }
            r1.<init>(r5, r3)     // Catch:{ all -> 0x0046 }
            java.lang.Object r2 = r1.readObject()     // Catch:{ all -> 0x0041 }
            com.obwhatsapp.Me r2 = (com.obwhatsapp.Me) r2     // Catch:{ all -> 0x0041 }
            r1.close()     // Catch:{ all -> 0x0031 }
            goto L_0x0034
        L_0x0031:
            r0 = move-exception
            r4 = r2
            goto L_0x0047
        L_0x0034:
            if (r3 == 0) goto L_0x0040
            r3.close()     // Catch:{ ClassNotFoundException -> 0x003d, IOException -> 0x003a }
            goto L_0x0040
        L_0x003a:
            r1 = move-exception
            r4 = r2
            goto L_0x0055
        L_0x003d:
            r1 = move-exception
            r4 = r2
            goto L_0x004e
        L_0x0040:
            return r2
        L_0x0041:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
        L_0x0047:
            if (r3 == 0) goto L_0x004c
            r3.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0     // Catch:{ ClassNotFoundException -> 0x004d, IOException -> 0x0054 }
        L_0x004d:
            r1 = move-exception
        L_0x004e:
            java.lang.String r0 = "memanager/read_old_me/serialization_error"
            com.whatsapp.util.Log.w(r0, r1)
            return r4
        L_0x0054:
            r1 = move-exception
        L_0x0055:
            java.lang.String r0 = "memanager/read_old_me/io_error"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x005a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16040sK.A01():com.obwhatsapp.Me");
    }

    public synchronized AnonymousClass1ZY A02() {
        A0C();
        return this.A02;
    }

    public synchronized AnonymousClass1ZX A03() {
        A0C();
        return this.A03;
    }

    public synchronized AnonymousClass1ZX A04() {
        AnonymousClass1ZX r0;
        A0C();
        r0 = this.A03;
        AnonymousClass00B.A06(r0);
        return r0;
    }

    public AnonymousClass1ZT A05() {
        A0B();
        AnonymousClass1ZT r0 = this.A05;
        AnonymousClass00B.A06(r0);
        return r0;
    }

    public String A06() {
        A0B();
        AnonymousClass1ZT r0 = this.A05;
        if (r0 == null) {
            return null;
        }
        return r0.user;
    }

    public String A07() {
        return this.A0B.A00.getString("push_name", "");
    }

    public synchronized String A08() {
        String string;
        string = ((SharedPreferences) this.A0A.A01.get()).getString("self_display_name", "");
        if (AnonymousClass1ZW.A0E(string)) {
            string = null;
        }
        return string;
    }

    public void A09() {
        Log.i("memanager/clearMe");
        A0B();
        A0D((Me) null);
    }

    public void A0A() {
        Log.i("memanager/deleteoldme");
        A0B();
        new File(this.A09.A00.getFilesDir(), "me_old").delete();
    }

    public void A0B() {
        AnonymousClass1ZU r1 = this.A08;
        if (r1.A06()) {
            r1.A04(new AnonymousClass1ZV(this));
            r1.A00();
        }
    }

    public final synchronized void A0C() {
        if (!this.A06) {
            A0E(Jid.getNullable(((SharedPreferences) this.A0A.A01.get()).getString("self_lid", "")));
            this.A06 = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[Catch:{ 1W4 -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015 A[Catch:{ 1W4 -> 0x002a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(com.obwhatsapp.Me r5) {
        /*
            r4 = this;
            r4.A00 = r5
            r3 = 0
            r2 = 0
            if (r5 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            r1 = r2
            goto L_0x0011
        L_0x0009:
            java.lang.String r0 = r5.jabber_id     // Catch:{ 1W4 -> 0x002a }
            if (r0 == 0) goto L_0x0007
            X.1ZT r1 = X.AnonymousClass1ZT.A03(r0)     // Catch:{ 1W4 -> 0x002a }
        L_0x0011:
            r4.A05 = r1     // Catch:{ 1W4 -> 0x002a }
            if (r1 == 0) goto L_0x0022
            int r0 = r4.A00()     // Catch:{ 1W4 -> 0x002a }
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.getFromUserJidAndDeviceId(r1, r0)     // Catch:{ 1W4 -> 0x002a }
            X.1Za r0 = (X.C28871Za) r0     // Catch:{ 1W4 -> 0x002a }
            r4.A04 = r0     // Catch:{ 1W4 -> 0x002a }
            goto L_0x0039
        L_0x0022:
            r4.A04 = r2     // Catch:{ 1W4 -> 0x002a }
            X.1Bw r0 = r4.A07     // Catch:{ 1W4 -> 0x002a }
            r0.A00(r3)     // Catch:{ 1W4 -> 0x002a }
            goto L_0x0039
        L_0x002a:
            r1 = move-exception
            java.lang.String r0 = "memanager/setMe/invalid_jid_error"
            com.whatsapp.util.Log.e(r0, r1)
            r4.A05 = r2
            r4.A04 = r2
            X.1Bw r0 = r4.A07
            r0.A00(r3)
        L_0x0039:
            X.1ZT r0 = r4.A05
            if (r0 != 0) goto L_0x007d
            r4.A01 = r2
        L_0x003f:
            java.lang.String r0 = "memanager/setMe me: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            com.obwhatsapp.Me r0 = r4.A00
            r1.append(r0)
            java.lang.String r0 = ", myUserJid: "
            r1.append(r0)
            X.1ZT r0 = r4.A05
            r1.append(r0)
            java.lang.String r0 = ", myDeviceJid: "
            r1.append(r0)
            X.1Za r0 = r4.A04
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r0 = r4.A0C
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a4
            r1.next()
            java.lang.String r1 = "onChange"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x007d:
            X.1Zb r1 = new X.1Zb
            r1.<init>(r0)
            r4.A01 = r1
            X.0sm r0 = r4.A0B
            android.content.SharedPreferences r3 = r0.A00
            java.lang.String r0 = "profile_photo_thumb_id"
            r2 = 0
            int r0 = r3.getInt(r0, r2)
            r1.A05 = r0
            X.1Zb r1 = r4.A01
            java.lang.String r0 = "profile_photo_full_id"
            int r0 = r3.getInt(r0, r2)
            r1.A04 = r0
            X.1Zb r1 = r4.A01
            java.lang.String r0 = r4.A07()
            r1.A0W = r0
            goto L_0x003f
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16040sK.A0D(com.obwhatsapp.Me):void");
    }

    public final synchronized void A0E(Jid jid) {
        if (jid instanceof AnonymousClass1ZX) {
            AnonymousClass1ZX r3 = (AnonymousClass1ZX) jid;
            this.A03 = r3;
            try {
                this.A02 = new AnonymousClass1ZY(r3, A00());
            } catch (AnonymousClass1W4 e2) {
                Log.w("memanager/setMyLidDeviceJid/invalid_jid_error", e2);
            }
        } else if (jid instanceof AnonymousClass1ZY) {
            AnonymousClass1ZY r32 = (AnonymousClass1ZY) jid;
            this.A03 = (AnonymousClass1ZX) r32.userJid;
            this.A02 = r32;
        }
    }

    public void A0F(String str) {
        this.A0B.A00.edit().putString("push_name", str).apply();
        A0B();
        C28881Zb r0 = this.A01;
        if (r0 != null) {
            r0.A0W = str;
        }
    }

    public boolean A0G() {
        A0B();
        return A00() > 0;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0H(com.obwhatsapp.Me r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r1 = "memanager/save "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = 0
            X.0tz r0 = r4.A09     // Catch:{ FileNotFoundException -> 0x0035, IOException -> 0x002c }
            android.content.Context r0 = r0.A00     // Catch:{ FileNotFoundException -> 0x0035, IOException -> 0x002c }
            java.io.FileOutputStream r0 = r0.openFileOutput(r6, r3)     // Catch:{ FileNotFoundException -> 0x0035, IOException -> 0x002c }
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ FileNotFoundException -> 0x0035, IOException -> 0x002c }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0035, IOException -> 0x002c }
            r1.writeObject(r5)     // Catch:{ all -> 0x0027 }
            r1.close()     // Catch:{ FileNotFoundException -> 0x0035, IOException -> 0x002c }
            r3 = 1
            return r3
        L_0x0027:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002b }
        L_0x002b:
            throw r0     // Catch:{ FileNotFoundException -> 0x0035, IOException -> 0x002c }
        L_0x002c:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "memanager/save/ioerror "
            goto L_0x003d
        L_0x0035:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "memanager/save/notfounderror "
        L_0x003d:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16040sK.A0H(com.obwhatsapp.Me, java.lang.String):boolean");
    }

    public boolean A0I(C15830rv r2) {
        if (r2 == null) {
            return false;
        }
        A0B();
        return r2.equals(this.A05) || r2.equals(A03());
    }

    public boolean A0J(DeviceJid deviceJid) {
        return (deviceJid == null || !A0I(deviceJid.getUserJid()) || deviceJid.device == 0) ? false : true;
    }

    public boolean A0K(DeviceJid deviceJid) {
        A0B();
        return deviceJid.equals(this.A04) || deviceJid.equals(A02());
    }
}
