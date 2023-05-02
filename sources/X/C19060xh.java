package X;

import android.content.SharedPreferences;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0xh  reason: invalid class name and case insensitive filesystem */
public class C19060xh {
    public SharedPreferences A00;
    public boolean A01;
    public final C14710pd A02;
    public final C19070xi A03;
    public final C24731Hb A04;
    public final C24721Ha A05;
    public final C17020u3 A06;

    public C19060xh(C14710pd r1, C19070xi r2, C24731Hb r3, C24721Ha r4, C17020u3 r5) {
        this.A02 = r1;
        this.A05 = r4;
        this.A03 = r2;
        this.A04 = r3;
        this.A06 = r5;
    }

    public final synchronized void A00() {
        synchronized (this) {
            if (!this.A01) {
                C24731Hb r8 = this.A04;
                C24721Ha r6 = this.A05;
                List<C47192Hy> list = r8.A01.A00;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C47192Hy r9 : list) {
                    if (r9.A00.AIk(r6)) {
                        r8.A00().update("language_selector_universe_global".getBytes());
                        int intValue = new BigInteger(1, r8.A00().digest(((String) r6.A00("device_id")).getBytes())).mod(new BigInteger(Integer.toString(SearchActionVerificationClientService.NOTIFICATION_ID))).intValue();
                        Iterator it = r9.A01.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C47202Hz r3 = (C47202Hz) it.next();
                            Iterator it2 = r3.A00.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    AnonymousClass2I0 r1 = (AnonymousClass2I0) it2.next();
                                    i2 += 2500;
                                    if (intValue < i2) {
                                        Pair create = Pair.create(r3, r1);
                                        if (create != null) {
                                            C47202Hz r4 = (C47202Hz) create.first;
                                            AnonymousClass2I0 r32 = (AnonymousClass2I0) create.second;
                                            long currentTimeMillis = System.currentTimeMillis() / 1000;
                                            if (currentTimeMillis >= 1665385200 && currentTimeMillis <= 1677571200) {
                                                AnonymousClass4RC r0 = new AnonymousClass4RC(r32, r4, r9);
                                                arrayList.add(r0);
                                                arrayList2.addAll(r0.A00.A01);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                SparseArray sparseArray = new SparseArray();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object obj = ((AnonymousClass2I1) it3.next()).A00;
                    if (obj instanceof Boolean) {
                        obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                    }
                    sparseArray.append(1362, obj.toString());
                }
                C19070xi r42 = this.A03;
                synchronized (r42) {
                    try {
                        SharedPreferences.Editor edit = r42.A01.edit();
                        edit.remove("ab_props:sys:config_hash");
                        edit.remove("ab_props:sys:last_refresh_time");
                        edit.remove("ab_props:sys:last_version");
                        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                            r42.A05(edit, (String) sparseArray.valueAt(i3), sparseArray.keyAt(i3));
                        }
                        edit.apply();
                        r42.A06.A09();
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    hashSet.add(((AnonymousClass4RC) it4.next()).toString());
                }
                try {
                    SharedPreferences sharedPreferences = this.A00;
                    if (sharedPreferences == null) {
                        sharedPreferences = this.A06.A00(AnonymousClass01S.A07);
                        this.A00 = sharedPreferences;
                    }
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putStringSet("ab_offline_props:offline_exposure_strings", hashSet);
                    edit2.apply();
                    this.A01 = true;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
    }
}
