package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass1CL;
import X.C003001i;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14720pe;
import X.C16000sG;
import X.C16300so;
import X.C16440t3;
import X.C16590tJ;
import X.C17240ul;
import X.C18500wn;
import X.C19060xh;
import X.C19070xi;
import X.C19550yc;
import X.C222217c;
import X.C226318r;
import X.C23311Bm;
import X.C27951Tt;
import X.C28371Vv;
import X.C29501aj;
import X.C34451kH;
import X.C34841kx;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IDxRCallbackShape229S0100000_1_I0 implements C19550yc {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape229S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void APb(String str) {
        if (this.A01 == 0) {
            Log.e(C13680ns.A0h("BroadcastXmppMethods/sendGetBroadcastLists/onDeliveryFailure: iq=", str));
        }
    }

    public void AQe(C28371Vv r7, String str) {
        StringBuilder sb;
        SharedPreferences sharedPreferences;
        int i2;
        if (this.A01 != 0) {
            int A002 = C34451kH.A00(r7);
            C19070xi r5 = ((C27951Tt) this.A00).A01;
            r5.A04(A002);
            if (A002 == 207 || A002 == 304 || (A002 >= 400 && A002 <= 503)) {
                synchronized (r5) {
                    sharedPreferences = r5.A01;
                    i2 = sharedPreferences.getInt("ab_props:sys:fetch_attemp_count", 0);
                }
                int i3 = i2 + 1;
                r5.A03(i3);
                if (i3 >= 3) {
                    long A003 = r5.A02.A00();
                    synchronized (r5) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong("ab_props:sys:last_refresh_time", A003);
                        edit.apply();
                    }
                    r5.A03(0);
                    return;
                }
                return;
            }
            sb = AnonymousClass000.A0r("ABPropsManager/onABPropError; unknown error code: ");
            sb.append(A002);
        } else {
            sb = AnonymousClass000.A0r("BroadcastXmppMethods/sendGetBroadcastLists/onError: iq=");
            sb.append(str);
        }
        Log.e(sb.toString());
    }

    public void AYG(C28371Vv r20, String str) {
        boolean z2;
        SharedPreferences sharedPreferences;
        C28371Vv r2 = r20;
        if (this.A01 != 0) {
            C28371Vv A0J = r2.A0J("props");
            if (A0J != null) {
                C27951Tt r9 = (C27951Tt) this.A00;
                C29501aj.A00(A0J.A0N("protocol", (String) null), 1);
                String A0N = A0J.A0N("ab_key", (String) null);
                String A0N2 = A0J.A0N("hash", (String) null);
                long A012 = C29501aj.A01(A0J.A0N("refresh", (String) null), 86400) * 1000;
                int A0A = A0J.A0A("refresh_id", 0);
                SparseArray sparseArray = new SparseArray();
                List A0O = A0J.A0O("prop");
                SparseIntArray sparseIntArray = new SparseIntArray();
                Iterator it = A0O.iterator();
                while (it.hasNext()) {
                    C28371Vv A0S = C13690nt.A0S(it);
                    if (!TextUtils.isEmpty(A0S.A0N("config_code", (String) null))) {
                        sparseArray.append(C28371Vv.A00(A0S, "config_code"), Pair.create(A0S.A0M("config_value"), A0S.A0N("config_expo_key", (String) null)));
                    } else {
                        sparseIntArray.append(C28371Vv.A00(A0S, "event_code"), C28371Vv.A00(A0S, "sampling_weight"));
                    }
                }
                C19070xi r6 = r9.A01;
                C16440t3 r18 = r9.A00;
                synchronized (r6) {
                    r6.A02();
                    SharedPreferences sharedPreferences2 = r6.A01;
                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                    if (!TextUtils.isEmpty(A0N2) && C14720pe.A06) {
                        SharedPreferences A002 = r6.A08.A00("ab-props-backup");
                        A002.edit().clear().apply();
                        Map<String, ?> all = sharedPreferences2.getAll();
                        if (!all.isEmpty()) {
                            SharedPreferences.Editor edit2 = A002.edit();
                            Iterator A0y = AnonymousClass000.A0y(all);
                            while (A0y.hasNext()) {
                                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                                String A0f = C13690nt.A0f(A0z);
                                Object value = A0z.getValue();
                                if (value != null) {
                                    Class<?> cls = value.getClass();
                                    if (cls.equals(Boolean.class)) {
                                        edit2.putBoolean(A0f, AnonymousClass000.A1X(value));
                                    } else if (cls.equals(Float.class)) {
                                        edit2.putFloat(A0f, ((Float) value).floatValue());
                                    } else if (cls.equals(Integer.class)) {
                                        edit2.putInt(A0f, ((Integer) value).intValue());
                                    } else if (cls.equals(Long.class)) {
                                        edit2.putLong(A0f, ((Long) value).longValue());
                                    } else if (cls.equals(String.class)) {
                                        edit2.putString(A0f, (String) value);
                                    } else if (Set.class.isAssignableFrom(cls)) {
                                        edit2.putStringSet(A0f, (Set) value);
                                    }
                                }
                            }
                            edit2.commit();
                        }
                    }
                    long max = Math.max(A012, 600000);
                    edit.putLong("ab_props:sys:refresh", max);
                    if (!TextUtils.isEmpty(A0N2)) {
                        HashMap A0x = AnonymousClass000.A0x();
                        Set<String> stringSet = sharedPreferences2.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
                        sharedPreferences2.getAll();
                        edit.clear();
                        edit.putLong("ab_props:sys:refresh", max);
                        edit.putStringSet("ab_props:sys:last_exposure_keys", stringSet);
                        C19060xh r1 = r6.A00;
                        AnonymousClass00B.A06(r1);
                        synchronized (r1) {
                            try {
                                r1.A01 = false;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        z2 = true;
                        C222217c r14 = r6.A05;
                        Iterator A003 = C16590tJ.A00(r14);
                        while (A003.hasNext()) {
                            C23311Bm r12 = (C23311Bm) A003.next();
                            try {
                                r12.A01();
                            } catch (Exception e2) {
                                r14.A04(r12, e2);
                            }
                        }
                        int i2 = 0;
                        while (i2 < sparseArray.size()) {
                            try {
                                int keyAt = sparseArray.keyAt(i2);
                                Pair pair = (Pair) sparseArray.valueAt(i2);
                                String str2 = (String) pair.second;
                                if (r6.A05(edit, (String) pair.first, keyAt) && !TextUtils.isEmpty(str2)) {
                                    StringBuilder A0o = AnonymousClass000.A0o();
                                    A0o.append(keyAt);
                                    edit.putString(AnonymousClass000.A0h("_expo_key", A0o), str2);
                                }
                                i2++;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        Set<String> stringSet2 = sharedPreferences2.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
                        C003001i r13 = stringSet2 == null ? new C003001i(0) : new C003001i((Collection) stringSet2);
                        C003001i r5 = new C003001i(0);
                        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                            Pair pair2 = (Pair) sparseArray.valueAt(i3);
                            String str3 = pair2 == null ? null : (String) pair2.second;
                            if (r13.contains(str3)) {
                                r5.add(str3);
                            }
                        }
                        C14720pe r0 = r6.A06;
                        r0.A0A(edit, r5);
                        r0.A09();
                        A0x.isEmpty();
                    } else {
                        z2 = false;
                    }
                    edit.putString("ab_props:sys:config_key", A0N);
                    C226318r r3 = r6.A07;
                    r3.A02(A0N, 4473, 0);
                    r3.A02(A0N, 4473, 1);
                    if (!TextUtils.isEmpty(A0N2)) {
                        edit.putString("ab_props:sys:config_hash", A0N2);
                    }
                    edit.putLong("ab_props:sys:last_refresh_time", r18.A00());
                    edit.putInt("ab_props:sys:last_version", A0A);
                    edit.apply();
                    if (z2) {
                        C222217c r32 = r6.A05;
                        Iterator A004 = C16590tJ.A00(r32);
                        while (A004.hasNext()) {
                            C23311Bm r15 = (C23311Bm) A004.next();
                            try {
                                r15.A00();
                            } catch (Exception e3) {
                                r32.A04(r15, e3);
                            }
                        }
                    }
                    r6.A04(0);
                    r6.A03(0);
                    C13690nt.A1K(C13700nu.A0C(r6.A03.A00.getFilesDir(), "crash_counter"));
                }
                if (!TextUtils.isEmpty(A0N2)) {
                    AnonymousClass1CL r22 = r9.A02;
                    synchronized (r22) {
                        sharedPreferences = r22.A00;
                        if (sharedPreferences == null) {
                            sharedPreferences = r22.A01.A00("field-stats-events-sampling");
                            r22.A00 = sharedPreferences;
                        }
                    }
                    SharedPreferences.Editor edit3 = sharedPreferences.edit();
                    edit3.clear();
                    for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                        edit3.putInt(String.valueOf(sparseIntArray.keyAt(i4)), sparseIntArray.valueAt(i4));
                    }
                    edit3.apply();
                    return;
                }
                return;
            }
            return;
        }
        Log.i(C13680ns.A0h("BroadcastXmppMethods/sendGetBroadcastLists/onSuccess: iq=", str));
        C28371Vv A0J2 = r2.A0J("lists");
        if (A0J2 != null) {
            Iterator it2 = A0J2.A0O("list").iterator();
            while (it2.hasNext()) {
                C28371Vv A0S2 = C13690nt.A0S(it2);
                C18500wn r11 = (C18500wn) this.A00;
                C16300so r10 = r11.A00;
                C34841kx r4 = (C34841kx) A0S2.A0F(r10, C34841kx.class, "id");
                String A05 = C28371Vv.A05(A0S2, FacebookFacade.RequestParameter.NAME);
                List A0O2 = A0S2.A0O("recipient");
                Object[] objArr = new UserJid[A0O2.size()];
                int i5 = 0;
                Iterator it3 = A0O2.iterator();
                while (it3.hasNext()) {
                    objArr[i5] = C13690nt.A0S(it3).A0F(r10, UserJid.class, "jid");
                    i5++;
                }
                C17240ul r62 = (C17240ul) r11.A02.get();
                List asList = Arrays.asList(objArr);
                StringBuilder A0r = AnonymousClass000.A0r("groupmgr/onParticipatingList/jid:");
                A0r.append(r4);
                A0r.append("/name:");
                A0r.append(A05);
                A0r.append("/recipients:");
                Log.i(AnonymousClass000.A0h(Arrays.deepToString(asList.toArray()), A0r));
                if (r62.A0R.A0F(r4) || r62.A0Z.A03.containsKey(r4)) {
                    StringBuilder A0q = AnonymousClass000.A0q("groupmgr/onParticipatingList/jid:");
                    A0q.append(r4);
                    Log.i(AnonymousClass000.A0h(" already exists", A0q));
                } else {
                    r62.A0g.A00(r62.A08(r4, asList), 1);
                }
                C16000sG r23 = r62.A0E;
                if (r23.A08(r4) == null) {
                    r23.A06(r4, A05, System.currentTimeMillis());
                }
            }
        }
        Log.i("groupmgr/onParticipatingList/onParticipatingListsComplete");
        C13680ns.A0z(((C17240ul) ((C18500wn) this.A00).A02.get()).A0N.A0K(), "refresh_broadcast_lists", false);
    }
}
