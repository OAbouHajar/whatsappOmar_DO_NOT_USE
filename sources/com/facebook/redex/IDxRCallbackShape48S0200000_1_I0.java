package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass028;
import X.AnonymousClass14D;
import X.AnonymousClass14E;
import X.AnonymousClass14G;
import X.AnonymousClass16P;
import X.AnonymousClass18X;
import X.AnonymousClass1H4;
import X.AnonymousClass1W9;
import X.AnonymousClass28x;
import X.AnonymousClass290;
import X.AnonymousClass4IV;
import X.AnonymousClass5SZ;
import X.C13680ns;
import X.C13690nt;
import X.C14860ps;
import X.C15830rv;
import X.C15860rz;
import X.C16300so;
import X.C16940tv;
import X.C17640vP;
import X.C19430yQ;
import X.C19550yc;
import X.C26131Ml;
import X.C27471Rw;
import X.C27481Rx;
import X.C28371Vv;
import X.C29721b5;
import X.C29731b6;
import X.C29751b8;
import X.C29801bE;
import X.C29811bF;
import X.C29961bW;
import X.C29971bX;
import X.C30821d1;
import X.C34451kH;
import X.C454328p;
import X.C48802Pe;
import X.C53622g0;
import X.C802543d;
import X.C82834Ei;
import X.C82844Ej;
import X.C82854Ek;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.simplejni.NativeHolder;
import com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IDxRCallbackShape48S0200000_1_I0 implements C19550yc {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxRCallbackShape48S0200000_1_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void APb(String str) {
        String str2;
        switch (this.A02) {
            case 0:
                return;
            case 1:
                ((AnonymousClass5SZ) this.A01).APa(new C802543d(str));
                return;
            case 2:
                Log.i(C13680ns.A0h("LocationSubscriptionSendMethods/subscribe/onDeliveryFailure; iqId=", str));
                return;
            case 3:
                ((AnonymousClass028) this.A01).A09(Boolean.FALSE);
                return;
            case 4:
                str2 = "EncryptedBackupProtocolHelper/sendInitRegIq/onDeliveryFailure id=";
                break;
            case 5:
                str2 = "EncryptedBackupProtocolHelper/sendFinishRegIq/onDeliveryFailure id=";
                break;
            case 6:
                str2 = "EncryptedBackupProtocolHelper/sendInitLoginIq/onDeliveryFailure id=";
                break;
            case 7:
                str2 = "EncryptedBackupProtocolHelper/finishLoginOnSuccess/onDeliveryFailure id=";
                break;
            default:
                Log.i(C13680ns.A0h("TwoFactorXmppMethods/sendGetTwoFactorAuth/onDeliveryFailure; iq=", str));
                C29971bX.A03((C29961bW) this.A01, C13680ns.A0h("Delivery failure: iqId=", str));
                return;
        }
        C29731b6.A00(this, C13680ns.A0h(str2, str));
    }

    public void AQe(C28371Vv r5, String str) {
        switch (this.A02) {
            case 0:
                int A002 = C34451kH.A00(r5);
                for (DeviceJid A003 : (List) this.A01) {
                    C17640vP.A00((C17640vP) this.A00, A003, A002);
                }
                return;
            case 1:
                ((AnonymousClass14E) this.A00).A01.AcB("BaseFetchCertificateProtocolHelper failed with a server error", (String) null, false);
                ((AnonymousClass5SZ) this.A01).AQa(new C48802Pe(r5, str));
                return;
            case 2:
                int A004 = C34451kH.A00(r5);
                StringBuilder A0r = AnonymousClass000.A0r("LocationSubscriptionSendMethods/subscribe/onError; iqId=");
                A0r.append(str);
                A0r.append(", error=");
                A0r.append(A004);
                C13680ns.A1V(A0r);
                Log.e(C13680ns.A0c(A004, "locationssubscriberesponsehandler/error "));
                return;
            case 3:
                ((AnonymousClass028) this.A01).A09(Boolean.FALSE);
                return;
            case 8:
                Log.i(C13680ns.A0h("TwoFactorXmppMethods/sendGetTwoFactorAuth/onError; iq=", str));
                ((C29961bW) this.A01).A05(new C48802Pe(r5, str));
                return;
            default:
                AnonymousClass18X.A00(r5, (C29731b6) this.A01, str);
                return;
        }
    }

    public void AYG(C28371Vv r16, String str) {
        AnonymousClass1W9 r1;
        Integer num;
        byte[] bArr;
        C29751b8 r5;
        String str2;
        String str3;
        C28371Vv r12 = r16;
        String str4 = str;
        switch (this.A02) {
            case 0:
                List A0O = r12.A0K("list").A0O("user");
                C17640vP r8 = (C17640vP) this.A00;
                C16300so r3 = r8.A00;
                Collections.sort(A0O, new IDxComparatorShape183S0100000_2_I0(r3, 4));
                Iterator it = A0O.iterator();
                while (it.hasNext()) {
                    C28371Vv A0S = C13690nt.A0S(it);
                    DeviceJid deviceJid = (DeviceJid) A0S.A0G(r3, DeviceJid.class, "jid");
                    C28371Vv A0J = A0S.A0J("error");
                    if (A0J != null) {
                        C17640vP.A00(r8, deviceJid, C28371Vv.A00(A0J, "code"));
                    } else {
                        C28371Vv A0K = A0S.A0K("identity");
                        C28371Vv A0K2 = A0S.A0K("type");
                        C28371Vv A0J2 = A0S.A0J("device-identity");
                        byte[] bArr2 = A0K2.A01;
                        if (bArr2 == null || bArr2.length != 1) {
                            throw new AnonymousClass1W9("type node should contain exactly 1 byte");
                        }
                        ((AnonymousClass16P) r8.A07.get()).A00.execute(new RunnableRunnableShape0S0401000_I0(r8, deviceJid, A0K.A01, A0J2 != null ? A0J2.A01 : null, bArr2[0], 2));
                    }
                }
                return;
            case 1:
                try {
                    AnonymousClass14E r32 = (AnonymousClass14E) this.A00;
                    AnonymousClass5SZ r4 = (AnonymousClass5SZ) this.A01;
                    C28371Vv A0K3 = r12.A0K("reply");
                    if ((r32 instanceof AnonymousClass14G) || (r32 instanceof AnonymousClass14D)) {
                        A0K3.A0K("password_pem");
                    }
                    String str5 = null;
                    String A0N = A0K3.A0N("algorithm", (String) null);
                    if (A0N == null) {
                        A0N = "rsa2048";
                    }
                    C28371Vv A0K4 = A0K3.A0K("encryption_pem");
                    C28371Vv A0K5 = A0K3.A0K("signature_pem");
                    String A0L = A0K4.A0L();
                    if (A0L != null) {
                        String A0L2 = A0K5.A0L();
                        if (A0L2 != null) {
                            C28371Vv A0J3 = A0K3.A0J("password_pem");
                            String str6 = null;
                            if (A0J3 != null) {
                                str6 = A0J3.A0L();
                                if (!TextUtils.isEmpty(str6)) {
                                    str5 = A0J3.A0M("key_id");
                                    try {
                                        num = Integer.valueOf(A0J3.A0M("ttl"));
                                    } catch (NumberFormatException e2) {
                                        r1 = new AnonymousClass1W9((Throwable) e2);
                                    }
                                } else {
                                    r1 = new AnonymousClass1W9("empty key");
                                }
                            } else {
                                num = null;
                            }
                            r4.AYL(num, A0N, A0L, A0L2, str6, str5);
                            return;
                        }
                        r1 = new AnonymousClass1W9("missing sig");
                    } else {
                        r1 = new AnonymousClass1W9("missing cert");
                    }
                    throw r1;
                } catch (AnonymousClass1W9 e3) {
                    ((AnonymousClass5SZ) this.A01).AQa(e3);
                    throw e3;
                }
            case 2:
                Log.i(C13680ns.A0h("LocationSubscriptionSendMethods/subscribe/onSuccess; iqId=", str4));
                int i2 = 0;
                C28371Vv A0I = r12.A0I(0);
                if (A0I != null) {
                    String A05 = C28371Vv.A05(A0I, "duration");
                    int parseInt = A05 != null ? Integer.parseInt(A05) : 0;
                    C28371Vv A0I2 = A0I.A0I(0);
                    if (A0I2 != null) {
                        List A0O2 = A0I2.A0O("participant");
                        ArrayList A0w = AnonymousClass000.A0w(A0O2);
                        Iterator it2 = A0O2.iterator();
                        while (it2.hasNext()) {
                            A0w.add(C13690nt.A0S(it2).A0F(((C27471Rw) this.A00).A00, UserJid.class, "jid"));
                        }
                        C27471Rw r52 = (C27471Rw) this.A00;
                        C19430yQ r82 = (C19430yQ) r52.A02.get();
                        C15830rv r9 = ((C454328p) this.A01).A00;
                        StringBuilder A0r = AnonymousClass000.A0r("LocationSharingManager/onReceiveServerSharingList; jid=");
                        A0r.append(r9);
                        A0r.append("; participants.size=");
                        A0r.append(A0w.size());
                        C13680ns.A1V(A0r);
                        HashSet A0o = C13680ns.A0o();
                        synchronized (r82.A0R) {
                            Map A09 = r82.A09();
                            Map map = (Map) A09.get(r9);
                            if (map != null) {
                                A0o.addAll(map.keySet());
                                A0o.removeAll(A0w);
                                HashSet A0o2 = C13680ns.A0o();
                                Iterator it3 = A0o.iterator();
                                while (it3.hasNext()) {
                                    UserJid userJid = (UserJid) it3.next();
                                    r82.A0T((AnonymousClass28x) map.remove(userJid));
                                    A0o2.add(userJid);
                                }
                                r82.A0N.A02(r9, A0o2, false);
                                if (map.isEmpty()) {
                                    A09.remove(r9);
                                }
                                if (!A0o.isEmpty()) {
                                    r82.A0Y(A09);
                                }
                            }
                        }
                        Iterator it4 = A0o.iterator();
                        while (it4.hasNext()) {
                            UserJid userJid2 = (UserJid) it4.next();
                            for (AnonymousClass290 AVo : r82.A0X) {
                                AVo.AVo(r9, userJid2);
                            }
                        }
                        if (!A0o.isEmpty()) {
                            r82.A0L();
                        }
                        Log.i("locationssubscriberesponsehandler/subscription list updated");
                        Iterator it5 = A0O2.iterator();
                        while (it5.hasNext()) {
                            C28371Vv A0S2 = C13690nt.A0S(it5);
                            UserJid userJid3 = (UserJid) A0S2.A0F(r52.A00, UserJid.class, "jid");
                            C28371Vv A0I3 = A0S2.A0I(0);
                            if (A0I3 != null) {
                                Log.i(AnonymousClass000.A0g("LocationSubscriptionSendMethods/subscribe/handleLocationUpdate; from=", userJid3));
                                C28371Vv A0I4 = A0I3.A0I(0);
                                if (A0I4 == null || !"enc".equals(A0I4.A00)) {
                                    throw new AnonymousClass1W9("invalid location node");
                                }
                                C30821d1 A002 = C53622g0.A00(A0I4);
                                String A052 = C28371Vv.A05(A0I3, "elapsed");
                                long j2 = 0;
                                if (A052 != null) {
                                    j2 = (long) Integer.parseInt(A052);
                                }
                                ((C27481Rx) r52.A03.get()).A00(userJid3, A002, j2);
                            }
                        }
                    }
                    i2 = parseInt;
                }
                ((C454328p) this.A01).A00(i2 * 1000);
                return;
            case 3:
                C26131Ml r6 = (C26131Ml) this.A00;
                C28371Vv A0J4 = r12.A0K("privacy").A0J("list");
                if (A0J4 != null) {
                    HashSet A0o3 = C13680ns.A0o();
                    String A053 = C28371Vv.A05(A0J4, "dhash");
                    Iterator it6 = A0J4.A0O("user").iterator();
                    while (it6.hasNext()) {
                        A0o3.add(C13690nt.A0S(it6).A0G(r6.A00, UserJid.class, "jid"));
                    }
                    AnonymousClass4IV r0 = new AnonymousClass4IV(A053, A0o3);
                    r6.A04(r0.A00, r0.A01, false);
                }
                ((AnonymousClass028) this.A01).A09(Boolean.TRUE);
                return;
            case 4:
                C29801bE r7 = (C29801bE) this.A01;
                Log.i(C13680ns.A0h("EncryptedBackupProtocolHelper/initRegOnSuccess id=", str4));
                byte[] A012 = AnonymousClass18X.A01(r12, r7, "ok_pub");
                byte[] A013 = AnonymousClass18X.A01(r12, r7, "ok_key_signature");
                byte[] A014 = AnonymousClass18X.A01(r12, r7, "hk_pub");
                byte[] A015 = AnonymousClass18X.A01(r12, r7, "hk_key_signature");
                byte[] A016 = AnonymousClass18X.A01(r12, r7, "ed_pub");
                byte[] A017 = AnonymousClass18X.A01(r12, r7, "ed_key_signature");
                if (A012 != null && A013 != null && A014 != null && A015 != null && A016 != null && A017 != null) {
                    if (!C16940tv.A02(A014, A015)) {
                        Log.e(C13680ns.A0h("EncryptedBackupProtocolHelper/initRegOnSuccess/hk_pub cannot be verified with hk_key_signature id=", str4));
                        str3 = "hk_pub cannot be verified with hk_key_signature";
                    } else if (!C16940tv.A02(A012, A013)) {
                        Log.e(C13680ns.A0h("EncryptedBackupProtocolHelper/initRegOnSuccess/ok_pub cannot be verified with ok_key_signature id=", str4));
                        str3 = "ok_pub cannot be verified with ok_key_signature";
                    } else if (!C16940tv.A02(A016, A017)) {
                        Log.e(C13680ns.A0h("EncryptedBackupProtocolHelper/initRegOnSuccess/ed_pub cannot be verified with ed_key_signature id=", str4));
                        str3 = "ed_pub cannot be verified with ed_key_signature";
                    } else {
                        r7.A00.A01();
                        C29811bF r42 = new C29811bF((NativeHolder) JniBridge.jvidispatchOOO(5, r7.A0D, A012));
                        C82854Ek r02 = new C82854Ek((NativeHolder) JniBridge.jvidispatchOO(28, r42.A00));
                        JniBridge.getInstance();
                        NativeHolder nativeHolder = r02.A00;
                        if (((int) JniBridge.jvidispatchIIO(1, (long) 86, nativeHolder)) != 0) {
                            EncBackupViewModel.A01(r7.A08.A00, 4);
                            return;
                        }
                        JniBridge.getInstance();
                        byte[] bArr3 = (byte[]) JniBridge.jvidispatchOIO(0, (long) 87, nativeHolder);
                        synchronized (r7.A0C) {
                            r7.A01 = r42;
                            r7.A05 = A014;
                            r7.A03 = A016;
                            r7.A06 = bArr3;
                            r7.A00 = 1;
                        }
                        r7.A01();
                        return;
                    }
                    r7.AQf(2, str3, -1);
                    return;
                }
                return;
            case 5:
                C29801bE r43 = (C29801bE) this.A01;
                Log.i(C13680ns.A0h("EncryptedBackupProtocolHelper/finishRegOnSuccess id=", str4));
                if (r12.A0J("success") == null) {
                    Log.e(C13680ns.A0h("EncryptedBackupProtocolHelper/finishRegOnSuccess was empty id=", str4));
                    r43.AQf(1, "success was empty", -1);
                    return;
                }
                r43.A00.A01();
                C15860rz r33 = r43.A09;
                r33.A1O(true);
                r33.A1P(false);
                C13680ns.A0w(r33.A0K(), "encrypted_backup_fleet_migration_state", 0);
                C13680ns.A0z(r33.A0K(), "encrypted_backup_show_forced_reg_after_logout", false);
                r43.A01.Acl(new RunnableRunnableShape3S0100000_I0_2(r43, 1));
                return;
            case 6:
                C29721b5 r44 = (C29721b5) this.A01;
                Log.i(C13680ns.A0h("EncryptedBackupProtocolHelper/initLoginOnSuccess id=", str4));
                byte[] A018 = AnonymousClass18X.A01(r12, r44, "ok_pub");
                byte[] A019 = AnonymousClass18X.A01(r12, r44, "ok_key_signature");
                byte[] A0110 = AnonymousClass18X.A01(r12, r44, "hk_pub");
                byte[] A0111 = AnonymousClass18X.A01(r12, r44, "hk_key_signature");
                byte[] A0112 = AnonymousClass18X.A01(r12, r44, "ed_pub");
                byte[] A0113 = AnonymousClass18X.A01(r12, r44, "ed_key_signature");
                if (A018 != null && A019 != null && A0110 != null && A0111 != null && A0112 != null && A0113 != null) {
                    C28371Vv A0J5 = r12.A0J("count");
                    int i3 = 1;
                    if (A0J5 == null || A0J5.A0N("value", (String) null) == null) {
                        Log.e(C13680ns.A0h("EncryptedBackupProtocolHelper/initLoginOnSuccess/count was empty id=", str4));
                        str2 = "count was empty";
                    } else {
                        try {
                            int parseInt2 = Integer.parseInt(A0J5.A0N("value", (String) null));
                            i3 = 2;
                            if (!C16940tv.A02(A018, A019)) {
                                Log.e(C13680ns.A0h("EncryptedBackupProtocolHelper/initLoginOnSuccess/ok_pub cannot be verified with ok_key_signature id=", str4));
                                str2 = "ok_pub cannot be verified with ok_key_signature";
                            } else if (!C16940tv.A02(A0110, A0111)) {
                                Log.e(C13680ns.A0h("EncryptedBackupProtocolHelper/initLoginOnSuccess/hk_pub cannot be verified with hk_key_signature id=", str4));
                                str2 = "hk_pub cannot be verified with hk_key_signature";
                            } else if (!C16940tv.A02(A0112, A0113)) {
                                Log.e(C13680ns.A0h("EncryptedBackupProtocolHelper/initLoginOnSuccess/ed_pub cannot be verified with ed_key_signature id=", str4));
                                str2 = "ed_pub cannot be verified with ed_key_signature";
                            } else {
                                r44.A00.A01();
                                C82844Ej r34 = new C82844Ej((NativeHolder) JniBridge.jvidispatchOOO(6, r44.A0D, A018));
                                C82834Ei r03 = new C82834Ei((NativeHolder) JniBridge.jvidispatchOO(29, r34.A00));
                                JniBridge.getInstance();
                                NativeHolder nativeHolder2 = r03.A00;
                                int jvidispatchIIO = (int) JniBridge.jvidispatchIIO(1, (long) 76, nativeHolder2);
                                if (jvidispatchIIO != 0) {
                                    r44.A08.AQc(C13680ns.A0c(jvidispatchIIO, "WESOpaqueClientCreateLoginStart failed with WESOpaqueStatusType="), 4, 1, -1, -1);
                                    return;
                                }
                                JniBridge.getInstance();
                                byte[] bArr4 = (byte[]) JniBridge.jvidispatchOIO(0, (long) 77, nativeHolder2);
                                synchronized (r44.A0C) {
                                    r44.A06 = bArr4;
                                    r44.A05 = A0112;
                                    r44.A03 = r34;
                                    r44.A01 = parseInt2;
                                    r44.A00 = 1;
                                }
                                r44.A01();
                                return;
                            }
                        } catch (NumberFormatException unused) {
                            Log.e(C13680ns.A0h("EncryptedBackupProtocolHelper/initLoginOnSuccess/count is not numerical, id=", str4));
                            r44.AQf(1, "count is not numerical", -1);
                            return;
                        }
                    }
                    r44.AQf(i3, str2, -1);
                    return;
                }
                return;
            case 7:
                C29721b5 r45 = (C29721b5) this.A01;
                Log.i(C13680ns.A0h("EncryptedBackupProtocolHelper/finishLoginOnSuccess id=", str4));
                C28371Vv A0J6 = r12.A0J("success");
                if (A0J6 == null || (bArr = A0J6.A01) == null) {
                    Log.e(C13680ns.A0h("EncryptedBackupProtocolHelper/finishLoginOnSuccess success was empty id=", str4));
                    r45.AQf(1, "success was empty", -1);
                    return;
                }
                r45.A00.A01();
                Log.i("EncBackupManger/finishLogin saving backup key");
                synchronized (r45.A0C) {
                    r5 = r45.A02;
                }
                r45.A01.Acl(new RunnableRunnableShape0S0400000_I0(r45, r5, r45.A08, bArr, 8));
                return;
            default:
                Log.i(C13680ns.A0h("TwoFactorXmppMethods/sendGetTwoFactorAuth/onSuccess; iq=", str4));
                C28371Vv A0J7 = r12.A0J("2fa");
                AnonymousClass00B.A06(A0J7);
                C14860ps r13 = (C14860ps) ((AnonymousClass1H4) this.A00).A02.get();
                A0J7.A0J("code");
                boolean z2 = true;
                if (A0J7.A0J("email") == null) {
                    z2 = false;
                }
                SharedPreferences.Editor edit = r13.A00().edit();
                int i4 = 2;
                if (z2) {
                    i4 = 1;
                }
                C13680ns.A0w(edit, "two_factor_auth_email_set", i4);
                C29971bX.A04(this.A01);
                return;
        }
    }
}
