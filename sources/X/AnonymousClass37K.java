package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.RegisterPhone;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.37K  reason: invalid class name */
public class AnonymousClass37K extends C16690tT {
    public long A00;
    public final long A01;
    public final C16440t3 A02;
    public final C16980tz A03;
    public final C15860rz A04;
    public final AnonymousClass10J A05;
    public final C19070xi A06;
    public final C19060xh A07;
    public final AnonymousClass1NE A08;
    public final AnonymousClass1KP A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final WeakReference A0D;
    public final JSONObject A0E;

    public AnonymousClass37K(C16440t3 r2, C16980tz r3, C15860rz r4, AnonymousClass10J r5, C19070xi r6, C19060xh r7, AnonymousClass1NE r8, AnonymousClass1KP r9, AnonymousClass2F5 r10, String str, String str2, String str3, JSONObject jSONObject, long j2) {
        this.A02 = r2;
        this.A03 = r3;
        this.A0A = str;
        this.A0C = str2;
        this.A01 = j2;
        this.A0B = str3;
        this.A07 = r7;
        this.A06 = r6;
        this.A05 = r5;
        this.A08 = r8;
        this.A0E = jSONObject;
        this.A04 = r4;
        this.A09 = r9;
        this.A0D = C13690nt.A0h(r10);
    }

    public static AnonymousClass01Q A03(Object obj, int i2) {
        return new AnonymousClass01Q(Integer.valueOf(i2), obj);
    }

    public static String A04(AnonymousClass2F3 r4, String str) {
        Log.i(str);
        AnonymousClass4OJ r3 = r4.A0E;
        TextView textView = r3.A04;
        return textView == null ? r4.A0M.A02(r4.A01, r3.A06) : textView.getText().toString();
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Set<String> stringSet;
        JSONObject jSONObject;
        try {
            C16440t3 r13 = this.A02;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.A01;
            if (elapsedRealtime < j2) {
                this.A00 = C13690nt.A09(j2 - elapsedRealtime);
                return A03((Object) null, 11);
            }
            AnonymousClass1NE r0 = this.A08;
            AnonymousClass00B.A06(r0);
            byte[] A012 = r0.A01();
            C19060xh r4 = this.A07;
            synchronized (r4) {
                try {
                    r4.A00();
                    SharedPreferences sharedPreferences = r4.A00;
                    if (sharedPreferences == null) {
                        sharedPreferences = r4.A06.A00(AnonymousClass01S.A07);
                        r4.A00 = sharedPreferences;
                    }
                    stringSet = sharedPreferences.getStringSet("ab_offline_props:offline_exposure_strings", new HashSet(1));
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            JSONArray jSONArray = new JSONArray();
            for (String put : stringSet) {
                jSONArray.put(put);
            }
            try {
                jSONObject = C13700nu.A0J();
                jSONObject.put("exposure", jSONArray);
                JSONObject jSONObject2 = this.A0E;
                if (jSONObject2 != null) {
                    jSONObject.put("metrics", jSONObject2);
                }
            } catch (JSONException e2) {
                Log.e("enterphone/getOfflineAbParams exception: ", e2);
                jSONObject = null;
            }
            C15860rz r5 = this.A04;
            AnonymousClass01D r3 = r5.A01;
            int A013 = C13690nt.A01(C13680ns.A0C(r3), "reg_attempts_check_exist") + 1;
            C13680ns.A1S(r5, "reg_attempts_check_exist", A013);
            C47002Hc r14 = new C47002Hc(A013);
            if (((AnonymousClass2F5) this.A0D.get()) == null) {
                return A03((Object) null, 4);
            }
            Context context = this.A03.A00;
            String str = this.A0C;
            String A002 = AnonymousClass3A8.A00(context, str);
            long A003 = r13.A00();
            AnonymousClass10J r10 = this.A05;
            boolean z2 = true;
            if (A003 <= C13680ns.A08(r10.A0F(), "pref_pre_chatd_ab_next_fetch_time")) {
                z2 = false;
            }
            if (z2) {
                Log.i("CheckIfReinstalledTask/shouldFetchPreChatdABProps");
                String str2 = null;
                try {
                    C46582Ez A014 = this.A09.A01(this.A0A, str);
                    if (A014 == null) {
                        Log.e("fetchPreChatdABProps/null abPropCheckResult");
                    } else {
                        int i2 = A014.A01;
                        if (i2 != 1) {
                            StringBuilder A0o = AnonymousClass000.A0o();
                            A0o.append("fetchPreChatdABProps/status/");
                            A0o.append(i2);
                            A0o.append("/reason/");
                            int i3 = A014.A00;
                            Log.e(AnonymousClass000.A0h(i3 != 1 ? "temporarily_unavailable" : "ab_server_error", A0o));
                            if (i3 == 0) {
                                C13680ns.A0x(r10.A0F().edit(), "pref_pre_chatd_ab_next_fetch_time", r13.A00() + A014.A02);
                            }
                        } else {
                            String str3 = A014.A03;
                            if (str3 == null) {
                                Log.i("fetchPreChatdABProps/no abHash returned, no need to update PreChatdABProps storage");
                            } else {
                                Log.i("fetchPreChatdABProps/success");
                                C13680ns.A0y(C13680ns.A0C(r3).edit(), "pref_pre_chatd_ab_hash", str3);
                                str2 = A014.A04;
                            }
                        }
                    }
                } catch (Exception e3) {
                    Log.e("fetchPreChatdABProps/entrypoint call error: ", e3);
                }
                if (str2 != null) {
                    C19070xi r132 = this.A06;
                    synchronized (r132) {
                        try {
                            Log.i("CheckIfReinstalledTask/updatePreChatdABProps");
                            r132.A02();
                            if (TextUtils.isEmpty(str2)) {
                                Log.i("CheckIfReinstalledTask/updatePreChatdABProps/empty expConfigs");
                            } else {
                                SharedPreferences.Editor edit = r132.A04.A0F().edit();
                                JSONArray jSONArray2 = new JSONArray(str2);
                                for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i4);
                                    if (jSONObject3 != null) {
                                        r132.A05(edit, jSONObject3.getString("config_value"), Integer.parseInt(jSONObject3.getString("config_code")));
                                    }
                                }
                                edit.apply();
                            }
                        } catch (JSONException e4) {
                            Log.e("ABPropsManager/updatePreChatdABProps/update abprop configs failed", e4);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    C16620tM r32 = C16620tM.A02;
                    C13680ns.A0z(r5.A0K(), "reg_prefill_name", r10.A0E(r32, 2412));
                    C13680ns.A0w(r5.A0K(), "reg_skip_storage_perm", r10.A03(r32, 2736));
                }
            }
            AnonymousClass1KP r15 = this.A09;
            String str4 = this.A0A;
            String str5 = this.A0B;
            if (str5 == null) {
                str5 = "-1";
            }
            C31601ej A004 = r15.A00(r14, str4, str, A002, str5, jSONObject, A012);
            if (A004 == null) {
                Log.e("CheckIfReinstalledTask/doInBackground/null ExistResult");
                return A03((Object) null, 4);
            }
            r5.A0d(A004.A00);
            int i5 = A004.A0J;
            if (i5 == 1) {
                return A03(A004, 1);
            }
            if (i5 == 0) {
                C31611ek r1 = A004.A0K;
                if (r1 == null) {
                    return A03((Object) null, 4);
                }
                if (r1 == C31611ek.BLOCKED) {
                    return A03(A004, 5);
                }
                if (r1 == C31611ek.LENGTH_LONG) {
                    return A03((Object) null, 6);
                }
                if (r1 == C31611ek.LENGTH_SHORT) {
                    return A03((Object) null, 7);
                }
                if (r1 == C31611ek.FORMAT_WRONG) {
                    return A03((Object) null, 8);
                }
                if (r1 == C31611ek.TEMPORARILY_UNAVAILABLE) {
                    return A03(A004, 9);
                }
                if (r1 == C31611ek.OLD_VERSION) {
                    return A03((Object) null, 12);
                }
                if (r1 == C31611ek.ERROR_BAD_TOKEN) {
                    return A03((Object) null, 14);
                }
                if (r1 == C31611ek.INVALID_SKEY_SIGNATURE) {
                    return A03((Object) null, 15);
                }
                if (r1 == C31611ek.SECURITY_CODE) {
                    return A03(A004, 16);
                }
                if (r1 == C31611ek.DEVICE_CONFIRM_OR_SECOND_CODE) {
                    return A03(A004, 20);
                }
                if (r1 == C31611ek.SECOND_CODE) {
                    return A03(A004, 19);
                }
                StringBuilder A0o2 = AnonymousClass000.A0o();
                A0o2.append("checkreinstalled/possible-migration/");
                A0o2.append(A004.A0F);
                C13680ns.A1V(A0o2);
                return new AnonymousClass01Q(C13680ns.A0Z(), A004);
            }
            return A03((Object) null, 4);
        } catch (Exception e5) {
            Log.e("checkreinstalled/error", e5);
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        String str;
        C87424Ws r1;
        int i2;
        C87424Ws r7;
        int i3;
        Object[] objArr;
        String A042;
        C31621el r0;
        AnonymousClass01Q r3 = (AnonymousClass01Q) obj;
        AnonymousClass2F5 r12 = (AnonymousClass2F5) this.A0D.get();
        if (r12 != null) {
            AnonymousClass2F3 r13 = (AnonymousClass2F3) r12;
            AnonymousClass29T.A00(r13, 9);
            r13.A01 = null;
            boolean z2 = r13 instanceof RegisterPhone;
            if (z2) {
                ((RegisterPhone) r13).A0N = null;
            }
            Object obj2 = r3.A00;
            AnonymousClass00B.A06(obj2);
            int A0D2 = AnonymousClass000.A0D(obj2);
            C31601ej r5 = (C31601ej) r3.A01;
            String str2 = this.A0A;
            String str3 = this.A0C;
            long j2 = this.A00;
            if (r5 != null) {
                boolean z3 = r5.A0H;
                AnonymousClass2F3.A0Y = z3;
                AnonymousClass2F3.A0X = r5.A09;
                AnonymousClass2F3.A0T = r5.A01;
                if (z3) {
                    r13.A09.A0y("wa_old_eligible");
                }
                int i4 = r5.A03;
                if (i4 > 0) {
                    C13680ns.A0w(r13.A09.A0K(), "registration_voice_code_length", i4);
                }
                int i5 = r5.A02;
                if (i5 > 0) {
                    C13680ns.A0w(r13.A09.A0K(), "registration_sms_code_length", i5);
                }
            }
            if (A0D2 != 4) {
                if (A0D2 != 3) {
                    r13.A0N = null;
                    if (A0D2 == 1) {
                        Log.i("enterphone/reinstalled");
                        r13.AQn();
                        AnonymousClass00B.A06(r5);
                        C19760yx r02 = r13.A0J;
                        String str4 = r5.A0L;
                        r02.A0C(str2, str3, str4);
                        r13.A09.A1L(r5.A0O);
                        r13.A09.A1K(r5.A0N);
                        C15860rz r03 = r13.A09;
                        C13680ns.A0z(r03.A0K(), "first_party_migration_initiated", r5.A0M);
                        r13.A36(str2, str3, str4);
                        return;
                    }
                    if (A0D2 != 2) {
                        if (A0D2 == 5) {
                            Log.e("enterphone/blocked");
                            if (!(r5 == null || (r0 = r5.A07) == null)) {
                                r13.A0H = r0;
                                r13.A0L.A00 = r0.A00;
                            }
                            StringBuilder A0r = AnonymousClass000.A0r("+");
                            A0r.append(str2);
                            r13.A0N = AnonymousClass000.A0h(str3, A0r);
                            AnonymousClass2F3.A0V = str2;
                            AnonymousClass2F3.A0W = str3;
                            StringBuilder A0q = AnonymousClass000.A0q("+");
                            A0q.append(str2);
                            r13.A0N = AnonymousClass000.A0h(str3, A0q);
                            if (r5 == null || !r5.A0G || !z2) {
                                int i6 = 124;
                                if (!r13.A0G.A02) {
                                    if (C13680ns.A0B(r13.A09).getBoolean("underage_account_banned", false)) {
                                        i6 = 125;
                                    }
                                    AnonymousClass29T.A01(r13, i6);
                                    return;
                                }
                                return;
                            }
                            RegisterPhone registerPhone = (RegisterPhone) r13;
                            if (!registerPhone.A0G.A02) {
                                registerPhone.A0Y = true;
                                AnonymousClass29T.A01(registerPhone, 21);
                                return;
                            }
                            return;
                        } else if (A0D2 != 4) {
                            if (A0D2 != 3) {
                                if (A0D2 == 6) {
                                    A042 = A04(r13, "enterphone/phone-number-too-long");
                                    r7 = r13.A0G;
                                    i3 = R.string.str136f;
                                } else if (A0D2 == 7) {
                                    A042 = A04(r13, "enterphone/phone-number-too-short");
                                    r7 = r13.A0G;
                                    i3 = R.string.str1370;
                                } else if (A0D2 == 8) {
                                    String A043 = A04(r13, "enterphone/phone-number-bad-format");
                                    AnonymousClass013 r32 = r13.A01;
                                    StringBuilder A0r2 = AnonymousClass000.A0r("+");
                                    A0r2.append(r13.A0E.A02.getText());
                                    A0r2.append(AnonymousClass01S.A06);
                                    String A0H = r32.A0H(AnonymousClass000.A0f(r13.A0E.A03.getText(), A0r2));
                                    r7 = r13.A0G;
                                    i3 = R.string.str136c;
                                    objArr = new Object[]{A0H, A043};
                                    r7.A03(r13.getString(i3, objArr));
                                    return;
                                } else {
                                    if (A0D2 == 9) {
                                        Log.i("enterphone/temporarily-unavailable");
                                        AnonymousClass00B.A06(r5);
                                        String str5 = r5.A08;
                                        if (str5 == null) {
                                            r1 = r13.A0G;
                                            i2 = R.string.str13ab;
                                        } else {
                                            try {
                                                long parseLong = Long.parseLong(str5) * 1000;
                                                AnonymousClass2F3.A0U = SystemClock.elapsedRealtime() + parseLong;
                                                r13.A0J.A0B(parseLong);
                                                r13.A0G.A03(C13680ns.A0d(r13, C28961Zl.A08(r13.A01, parseLong), new Object[1], 0, R.string.str13ac));
                                                return;
                                            } catch (NumberFormatException unused) {
                                                r1 = r13.A0G;
                                                i2 = R.string.str13ab;
                                            }
                                        }
                                    } else if (A0D2 == 12) {
                                        Log.i("enterphone/old-version");
                                        r13.A04.A01 = true;
                                        r13.A0G.A01(114);
                                        return;
                                    } else {
                                        if (A0D2 == 14) {
                                            str = "enterphone/bad-token";
                                        } else if (A0D2 == 15) {
                                            str = "enterphone/invalid-skey";
                                        } else if (A0D2 == 11) {
                                            Log.w("enterphone/too-recent");
                                            if (j2 != 0) {
                                                long j3 = j2 * 1000;
                                                try {
                                                    AnonymousClass2F3.A0U = SystemClock.elapsedRealtime() + j3;
                                                    r13.A0J.A0B(j3);
                                                    r13.A0G.A03(C13680ns.A0d(r13, C28961Zl.A08(r13.A01, j3), new Object[1], 0, R.string.str13ae));
                                                    return;
                                                } catch (NumberFormatException e2) {
                                                    Log.w("enterphone/too-recent/time-not-int", e2);
                                                    r1 = r13.A0G;
                                                    i2 = R.string.str13af;
                                                }
                                            } else {
                                                Log.w("enterphone/too-recent/time-not-int");
                                                r1 = r13.A0G;
                                                i2 = R.string.str13af;
                                            }
                                        } else if (A0D2 == 16) {
                                            Log.i("EnterPhoneNumber/onStatusNeedsTwoFa");
                                            r13.AQn();
                                            r13.A0J.A0A(7);
                                            AnonymousClass00B.A06(r5);
                                            r13.A09.A1B(r5.A0E, r5.A0D, r5.A06, -1, -1, r13.A05.A00());
                                            AnonymousClass2F3.A0V = str2;
                                            AnonymousClass2F3.A0W = str3;
                                            r13.A09.A19(str2, str3);
                                            r13.A05.Acl(new RunnableRunnableShape13S0100000_I0_12((Object) r13, 15));
                                            r13.A0K.A04("enter_number", "successful");
                                            r13.A2X(C14750ph.A0p(r13, r13.A02.A03()), false);
                                            r13.finish();
                                            return;
                                        } else if (A0D2 == 20) {
                                            Log.i(C13680ns.A0c(1, "enterphone/onStatusNeedsAccountDefenceVerification accountDefenceFlowTypeToStart="));
                                            r13.A0R = true;
                                            r13.A00 = 1;
                                        } else if (A0D2 == 19) {
                                            Log.i(C13680ns.A0c(2, "enterphone/onStatusNeedsAccountDefenceVerification accountDefenceFlowTypeToStart="));
                                            r13.A0R = true;
                                            r13.A00 = 2;
                                        } else {
                                            return;
                                        }
                                        Log.i(str);
                                        r13.A0G.A03(r13.getString(R.string.str13a2));
                                        return;
                                    }
                                    r1.A02(i2);
                                    return;
                                }
                                objArr = new Object[]{A042};
                                r7.A03(r13.getString(i3, objArr));
                                return;
                            }
                        }
                    }
                    Log.i("enterphone/new-installation");
                    AnonymousClass2JN.A0K(r13.A09, AnonymousClass2JN.A00);
                    r13.A35(15);
                    r13.AQn();
                    AnonymousClass00B.A06(r5);
                    r13.A0Q = r5.A0F;
                    r13.ATy(r5.A0A, r5.A0B, r5.A0C, r5.A0I);
                    return;
                }
                Log.i("enterphone/error-connectivity");
                r13.A0G.A03(C13680ns.A0d(r13, r13.getString(R.string.str053b), C13680ns.A1b(), 0, R.string.str1372));
                return;
            }
            Log.i("enterphone/error-unspecified");
            if (!r13.A0G.A02) {
                AnonymousClass29T.A01(r13, 109);
            }
        }
    }
}
