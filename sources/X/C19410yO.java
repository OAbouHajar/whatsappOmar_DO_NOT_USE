package X;

import android.content.ContentValues;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0200100_I0;
import com.facebook.redex.RunnableRunnableShape0S0220000_I0;
import com.facebook.redex.RunnableRunnableShape7S0200000_I0_5;
import com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.obwhatsapp.data.device.IDxDObserverShape76S0100000_1_I0;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.IDxATaskShape26S0200000_2_I0;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0yO  reason: invalid class name and case insensitive filesystem */
public class C19410yO extends C16590tJ implements C19420yP {
    public AnonymousClass1WF A00;
    public DeviceJid A01;
    public Comparator A02 = new IDxComparatorShape19S0000000_2_I0(21);
    public boolean A03;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final C16300so A05;
    public final AnonymousClass16R A06;
    public final C16040sK A07;
    public final AnonymousClass139 A08;
    public final C210712r A09;
    public final AnonymousClass01V A0A;
    public final C16440t3 A0B;
    public final C16980tz A0C;
    public final C15860rz A0D;
    public final AnonymousClass013 A0E;
    public final C208211s A0F;
    public final AnonymousClass16P A0G;
    public final AnonymousClass16Q A0H;
    public final C19020xd A0I;
    public final AnonymousClass16T A0J;
    public final C17190ug A0K;
    public final AnonymousClass16S A0L;
    public final AnonymousClass1WA A0M;
    public final C16320sq A0N;
    public final Object A0O = new Object();
    public final Set A0P = new HashSet();

    public C19410yO(C16300so r4, AnonymousClass16R r5, C16040sK r6, AnonymousClass139 r7, C210712r r8, AnonymousClass01V r9, C16440t3 r10, C16980tz r11, C15860rz r12, AnonymousClass013 r13, C208211s r14, AnonymousClass16P r15, AnonymousClass16Q r16, C19020xd r17, AnonymousClass16T r18, C17190ug r19, AnonymousClass16S r20, C16320sq r21) {
        this.A0B = r10;
        this.A09 = r8;
        this.A05 = r4;
        this.A07 = r6;
        this.A0C = r11;
        C16320sq r2 = r21;
        this.A0N = r2;
        this.A0I = r17;
        this.A0K = r19;
        this.A0G = r15;
        this.A0A = r9;
        this.A0E = r13;
        this.A0L = r20;
        this.A0F = r14;
        this.A0J = r18;
        this.A0D = r12;
        this.A06 = r5;
        this.A08 = r7;
        this.A0H = r16;
        this.A0M = new AnonymousClass1WA(r2, true);
    }

    public AnonymousClass1WD A04() {
        AnonymousClass1WD r3 = new AnonymousClass1WD();
        if (!this.A0L.A01.A1d()) {
            r3.A02(Boolean.FALSE);
            return r3;
        }
        this.A0N.Ack(new IDxATaskShape26S0200000_2_I0(r3, 2, this), new Void[0]);
        return r3;
    }

    public AnonymousClass1WN A05(int i2) {
        if (i2 > 0 && this.A0L.A01.A1d()) {
            C28031Ub it = this.A0I.A00().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((DeviceJid) entry.getKey()).device == i2) {
                    return (AnonymousClass1WN) entry.getValue();
                }
            }
        }
        return null;
    }

    public List A06() {
        return !this.A0L.A01.A1d() ? new ArrayList() : new ArrayList(this.A0I.A00().values());
    }

    public List A07() {
        return !this.A0L.A01.A1d() ? new ArrayList() : new ArrayList(this.A0I.A01().values());
    }

    public final void A08(Location location, AnonymousClass1WN r13) {
        AnonymousClass1WN r0;
        String str = null;
        try {
            List<Address> fromLocation = new Geocoder(this.A0C.A00, AnonymousClass013.A00(this.A0E.A00)).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (fromLocation != null) {
                for (Address locality : fromLocation) {
                    str = locality.getLocality();
                    if (!TextUtils.isEmpty(str)) {
                        break;
                    }
                }
            }
        } catch (IOException | IllegalArgumentException unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            C19020xd r02 = this.A0I;
            DeviceJid deviceJid = r13.A06;
            AnonymousClass19N r8 = r02.A04;
            ContentValues contentValues = new ContentValues();
            contentValues.put("place_name", str);
            C16800tf A022 = r8.A02.A02();
            try {
                A022.A02.A00("devices", contentValues, "device_id = ?", new String[]{deviceJid.getRawString()});
                synchronized (r8) {
                    C17930vs r03 = r8.A00;
                    if (!(r03 == null || (r0 = (AnonymousClass1WN) r03.get(deviceJid)) == null)) {
                        r0.A02 = str;
                    }
                }
                A022.close();
                for (AnonymousClass1WC r1 : A01()) {
                    if (r1 instanceof IDxDObserverShape76S0100000_1_I0) {
                        IDxDObserverShape76S0100000_1_I0 iDxDObserverShape76S0100000_1_I0 = (IDxDObserverShape76S0100000_1_I0) r1;
                        if (iDxDObserverShape76S0100000_1_I0.A01 == 0) {
                            ((LinkedDevicesSharedViewModel) iDxDObserverShape76S0100000_1_I0.A00).A0T.A09((Object) null);
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    A022.close();
                } catch (Throwable unused2) {
                }
                throw th;
            }
        }
    }

    public final void A09(C17380uz r3) {
        for (AnonymousClass1WC A002 : A01()) {
            A002.A00(r3);
        }
    }

    public void A0A(DeviceJid deviceJid, String str, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder("companion-device-manager/logoutDeviceAndNotify: ");
        sb.append(deviceJid);
        sb.append(", removalReason ");
        sb.append(str);
        sb.append(", remove on error: ");
        sb.append(z2);
        Log.i(sb.toString());
        new AnonymousClass254(new AnonymousClass252(this, z3, z2), this.A0K).A00(deviceJid, str);
    }

    public final void A0B(String str) {
        synchronized (this.A0O) {
            AnonymousClass1WF r2 = this.A00;
            if (r2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("companion-device-manager/device login canceled: ");
                sb.append(r2.A01.A06);
                Log.i(sb.toString());
                A0A(this.A00.A01.A06, str, true, false);
                this.A00 = null;
                this.A03 = false;
            }
        }
    }

    public void A0C(String str, boolean z2) {
        StringBuilder sb = new StringBuilder("companion-device-manager/logoutAllCompanionDevicesAndNotify/remove on error: ");
        boolean z3 = z2;
        sb.append(z3);
        sb.append(", removalReason ");
        String str2 = str;
        sb.append(str2);
        Log.i(sb.toString());
        C17380uz keySet = this.A0I.A00().keySet();
        if (keySet.isEmpty()) {
            A09(keySet);
            return;
        }
        AnonymousClass254 r10 = new AnonymousClass254(new AnonymousClass252(this, false, z3), this.A0K);
        r10.A00 = keySet;
        C17190ug r9 = r10.A02;
        String A022 = r9.A02();
        boolean A0G2 = r9.A0G(r10, new C28371Vv(new C28371Vv("remove-companion-device", new C35081lL[]{new C35081lL("all", "true"), new C35081lL("reason", str2)}), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("id", A022), new C35081lL("xmlns", "md"), new C35081lL("type", "set")}), A022, 237, 32000);
        StringBuilder sb2 = new StringBuilder("app/sendRemoveAllDevicesRequest success: ");
        sb2.append(A0G2);
        Log.i(sb2.toString());
        if (!A0G2) {
            r10.A01.AQU(keySet, -1);
        }
    }

    public boolean A0D(C17930vs r12, boolean z2, boolean z3) {
        AnonymousClass1WA r2;
        RunnableRunnableShape7S0200000_I0_5 runnableRunnableShape7S0200000_I0_5;
        Log.i("companion-device-manager/refreshDevices");
        C17930vs A012 = this.A0I.A01();
        C17930vs r9 = A012;
        Object obj = this.A0O;
        synchronized (obj) {
            if (this.A00 != null) {
                HashMap hashMap = new HashMap(A012);
                hashMap.remove(this.A00.A01.A06);
                r9 = C17930vs.copyOf((Map) hashMap);
            }
        }
        if (r12 != null) {
            C18390wc r5 = new C18390wc();
            C28031Ub it = r9.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!r12.containsKey(entry.getKey()) || (z2 && ((Number) r12.get(entry.getKey())).intValue() != ((AnonymousClass1WN) entry.getValue()).A03)) {
                    r5.add(entry.getKey());
                }
            }
            C17380uz build = r5.build();
            if (!build.isEmpty()) {
                boolean z4 = false;
                if (build.size() == r9.size()) {
                    z4 = true;
                }
                boolean z5 = !z4;
                StringBuilder sb = new StringBuilder("companion-device-manager/onDeviceRemovedByServer/devices: ");
                sb.append(build);
                Log.i(sb.toString());
                this.A0M.execute(new RunnableRunnableShape0S0220000_I0(build, this, z5));
            }
            HashMap hashMap2 = new HashMap();
            C28031Ub it2 = r12.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                Object key = entry2.getKey();
                C16040sK r0 = this.A07;
                r0.A0B();
                if (!key.equals(r0.A04) && (!A012.containsKey(entry2.getKey()) || (z2 && ((AnonymousClass1WN) A012.get(entry2.getKey())).A03 != ((Number) entry2.getValue()).intValue()))) {
                    hashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            if (!hashMap2.isEmpty()) {
                for (Map.Entry entry3 : hashMap2.entrySet()) {
                    synchronized (obj) {
                        AnonymousClass1WF r02 = this.A00;
                        if (r02 == null || !r02.A01.A06.equals(entry3.getKey())) {
                            if (this.A07.A0G()) {
                                r2 = this.A0M;
                                runnableRunnableShape7S0200000_I0_5 = new RunnableRunnableShape7S0200000_I0_5(this, 15, entry3);
                            } else {
                                A0A((DeviceJid) entry3.getKey(), "unknown_companion", true, false);
                                C16300so r8 = this.A05;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("toAdd=");
                                sb2.append(hashMap2.keySet());
                                r8.AcB("ContactSyncDevicesUpdater/update add unknown device of self", sb2.toString(), false);
                            }
                        } else if (z3) {
                            AnonymousClass1WF r92 = this.A00;
                            StringBuilder sb3 = new StringBuilder("companion-device-manager/device registered: ");
                            sb3.append(r92.A01.A06);
                            Log.i(sb3.toString());
                            for (AnonymousClass1WC A042 : A01()) {
                                A042.A04(r92);
                            }
                            AnonymousClass139 r22 = this.A08;
                            r22.A01().edit().remove("syncd_last_fatal_error_time").apply();
                            r22.A01().edit().putLong("syncd_last_device_reg_time", this.A0B.A00()).apply();
                            r2 = this.A0M;
                            runnableRunnableShape7S0200000_I0_5 = new RunnableRunnableShape7S0200000_I0_5(this, 14, r92);
                        }
                        r2.execute(runnableRunnableShape7S0200000_I0_5);
                    }
                }
            }
            return !build.isEmpty();
        } else if (r9.isEmpty()) {
            return false;
        } else {
            C17380uz keySet = r9.keySet();
            StringBuilder sb4 = new StringBuilder("companion-device-manager/onDeviceRemovedByServer/devices: ");
            sb4.append(keySet);
            Log.i(sb4.toString());
            this.A0M.execute(new RunnableRunnableShape0S0220000_I0(keySet, this, false));
            return true;
        }
    }

    public boolean A0E(DeviceJid deviceJid) {
        boolean z2;
        synchronized (this.A0O) {
            DeviceJid deviceJid2 = this.A01;
            if (deviceJid2 == null || !deviceJid2.equals(deviceJid)) {
                AnonymousClass1WF r0 = this.A00;
                if (r0 == null || !r0.A01.A06.equals(deviceJid) || !this.A03) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    public int[] ACW() {
        return new int[]{213};
    }

    public boolean AHS(Message message, int i2) {
        long A002;
        if (i2 != 213) {
            return false;
        }
        if (message == null) {
            return true;
        }
        C28371Vv r4 = (C28371Vv) message.obj;
        DeviceJid deviceJid = (DeviceJid) r4.A0G(this.A05, DeviceJid.class, "from");
        if (deviceJid == null || !this.A07.A0J(deviceJid)) {
            return true;
        }
        String A0N2 = r4.A0N("type", (String) null);
        if (A0N2 == null || "available".equals(A0N2)) {
            A002 = this.A0B.A00();
            this.A0P.add(deviceJid);
        } else if (!"unavailable".equals(A0N2)) {
            return true;
        } else {
            A002 = AnonymousClass251.A00(r4);
            this.A0P.remove(deviceJid);
        }
        if (A002 == 0) {
            return true;
        }
        this.A0N.Acl(new RunnableRunnableShape0S0200100_I0(this, deviceJid, 6, A002));
        return true;
    }
}
