package X;

import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.138  reason: invalid class name */
public class AnonymousClass138 {
    public AnonymousClass4F9 A00;
    public final C14870pt A01;
    public final C15860rz A02;
    public final C17190ug A03;
    public final AnonymousClass125 A04;
    public final HashMap A05 = new HashMap();

    public AnonymousClass138(C14870pt r2, C15860rz r3, C17190ug r4, AnonymousClass125 r5) {
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
    }

    public void A00(AnonymousClass273 r14) {
        AnonymousClass275 r7 = new AnonymousClass275(new AnonymousClass274(this, r14), this.A03);
        Log.i("PrivacySettingsProtocolHelper/sendGetPrivacySettingsRequest");
        C17190ug r6 = r7.A01;
        String A022 = r6.A02();
        r6.A0G(r7, new C28371Vv(new C28371Vv("privacy", (C35081lL[]) null), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("id", A022), new C35081lL("xmlns", "privacy"), new C35081lL("type", "get")}), A022, 70, 0);
    }

    public void A01(String str, String str2) {
        String str3 = str2;
        String str4 = str;
        this.A05.put(str4, new AnonymousClass272(str3));
        AnonymousClass275 r10 = new AnonymousClass275(new AnonymousClass274(this, (AnonymousClass273) null), this.A03);
        Log.i("PrivacySettingsProtocolHelper/sendSetPrivacySettingsRequest");
        C17190ug r9 = r10.A01;
        String A022 = r9.A02();
        r9.A0G(r10, new C28371Vv(new C28371Vv("privacy", (C35081lL[]) null, new C28371Vv[]{new C28371Vv("category", new C35081lL[]{new C35081lL((String) FacebookFacade.RequestParameter.NAME, str4), new C35081lL("value", str3)})}), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("type", "set"), new C35081lL("id", A022), new C35081lL("xmlns", "privacy")}), A022, 69, 0);
    }

    public void A02(Map map) {
        boolean equals;
        boolean z2;
        SharedPreferences.Editor A0K;
        String str;
        C15860rz r4;
        SharedPreferences sharedPreferences;
        String str2;
        SharedPreferences.Editor A0K2;
        String str3;
        SharedPreferences.Editor putBoolean;
        boolean z3 = false;
        boolean z4 = false;
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder("settingsprivacy/received ");
            sb.append(str4);
            sb.append(":");
            sb.append(str5);
            Log.i(sb.toString());
            int A002 = AnonymousClass271.A00(str5);
            if (A002 < 0 || (!(equals = "online".equals(str4)) ? !(A002 != 3 ? A002 != 4 : "status".equals(str4) || "groupadd".equals(str4) || "last".equals(str4) || "profile".equals(str4)) : !(A002 == 0 || A002 == 4))) {
                z3 = true;
            } else {
                HashMap hashMap = this.A05;
                AnonymousClass272 r0 = (AnonymousClass272) hashMap.get(str4);
                if (r0 == null || r0.A00.equals(str5)) {
                    hashMap.remove(str4);
                    if ("last".equals(str4)) {
                        r4 = this.A02;
                        sharedPreferences = (SharedPreferences) r4.A01.get();
                        str2 = "privacy_last_seen";
                    } else {
                        if ("profile".equals(str4)) {
                            A0K2 = this.A02.A0K();
                            str3 = "privacy_profile_photo";
                        } else if ("status".equals(str4)) {
                            A0K2 = this.A02.A0K();
                            str3 = "privacy_status";
                        } else {
                            if ("readreceipts".equals(str4)) {
                                C15860rz r1 = this.A02;
                                z2 = "all".contentEquals(str5);
                                A0K = r1.A0K();
                                str = "read_receipts_enabled";
                            } else if ("groupadd".equals(str4)) {
                                A0K2 = this.A02.A0K();
                                str3 = "privacy_groupadd";
                            } else if (equals) {
                                r4 = this.A02;
                                sharedPreferences = (SharedPreferences) r4.A01.get();
                                str2 = "privacy_online";
                            } else if ("calladd".equals(str4)) {
                                C15860rz r12 = this.A02;
                                z2 = !"all".contentEquals(str5);
                                A0K = r12.A0K();
                                str = "privacy_calladd";
                            }
                            putBoolean = A0K.putBoolean(str, z2);
                            putBoolean.apply();
                        }
                        putBoolean = A0K2.putInt(str3, A002);
                        putBoolean.apply();
                    }
                    int i2 = sharedPreferences.getInt(str2, 0);
                    r4.A0K().putInt(str2, A002).apply();
                    if (i2 != A002) {
                        z4 = true;
                    }
                }
            }
        }
        if (z3) {
            this.A01.A0K(new RunnableRunnableShape2S0100000_I0_1(this, 14));
        }
        if (z4) {
            this.A01.A0K(new RunnableRunnableShape2S0100000_I0_1(this, 15));
        }
        this.A01.A0K(new RunnableRunnableShape2S0100000_I0_1(this, 13));
    }
}
