package X;

import android.text.TextUtils;
import com.obwhatsapp.payments.IDxRCallbackShape7S0300000_1_I0;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1GO  reason: invalid class name */
public class AnonymousClass1GO {
    public static final Object A0I = new Object();
    public int A00 = 0;
    public C53292fT A01;
    public final C16300so A02;
    public final C14870pt A03;
    public final C16000sG A04;
    public final C19230xz A05;
    public final C16440t3 A06;
    public final C16980tz A07;
    public final AnonymousClass013 A08;
    public final AnonymousClass173 A09;
    public final C14710pd A0A;
    public final AnonymousClass1UZ A0B;
    public final C18340wX A0C;
    public final C18300wT A0D;
    public final C18310wU A0E;
    public final C18290wS A0F;
    public final C53282fS A0G;
    public final C16320sq A0H;

    public AnonymousClass1GO(C16300so r4, C14870pt r5, C16000sG r6, C19230xz r7, C16440t3 r8, C16980tz r9, AnonymousClass013 r10, AnonymousClass173 r11, C14710pd r12, C18340wX r13, C18300wT r14, C18310wU r15, C18290wS r16, C16320sq r17) {
        this.A06 = r8;
        this.A0A = r12;
        this.A03 = r5;
        this.A07 = r9;
        this.A0H = r17;
        this.A02 = r4;
        this.A08 = r10;
        this.A04 = r6;
        this.A0F = r16;
        this.A05 = r7;
        this.A0D = r14;
        this.A0E = r15;
        this.A09 = r11;
        this.A0C = r13;
        this.A0G = new C53282fS(r8, r14);
        this.A0B = new AnonymousClass1UZ();
        this.A0G.A00();
        String string = this.A0D.A01().getString("payment_incentive_user_claim_info", (String) null);
        if (!TextUtils.isEmpty(string)) {
            try {
                synchronized (A0I) {
                    this.A01 = new C53292fT(string);
                }
            } catch (JSONException unused) {
                A04();
            }
        }
    }

    public C53322fW A00() {
        C53302fU A022 = A02();
        C53292fT A032 = A03();
        if (A022 == null || !(A032 == null || A032.A03 == A022.A08.A01)) {
            A04();
        }
        return new C53322fW(A022, A03());
    }

    public final C53312fV A01() {
        String A062 = this.A0A.A06(C16620tM.A02, 782);
        if (A062 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(A062);
        return new C53312fV(jSONObject.getInt("update_count"), jSONObject.getLong("offer_id"));
    }

    public C53302fU A02() {
        try {
            C53312fV A012 = A01();
            if (A012 == null || A012.A00 <= 0) {
                return null;
            }
            C53282fS r3 = this.A0G;
            long j2 = A012.A01;
            ConcurrentHashMap concurrentHashMap = r3.A02;
            Long valueOf = Long.valueOf(j2);
            C53302fU r0 = (C53302fU) concurrentHashMap.get(valueOf);
            if (r0 != null) {
                return r0;
            }
            concurrentHashMap.clear();
            r3.A00();
            return (C53302fU) concurrentHashMap.get(valueOf);
        } catch (JSONException unused) {
            return null;
        }
    }

    public C53292fT A03() {
        C53292fT r0;
        synchronized (A0I) {
            r0 = this.A01;
        }
        return r0;
    }

    public void A04() {
        synchronized (A0I) {
            this.A01 = null;
            C18300wT r2 = this.A0D;
            if (!TextUtils.isEmpty(r2.A01().getString("payment_incentive_user_claim_info", (String) null))) {
                r2.A01().edit().putString("payment_incentive_user_claim_info", (String) null).apply();
            }
        }
    }

    public final void A05() {
        C53282fS r5 = this.A0G;
        Iterator it = r5.A02.entrySet().iterator();
        while (it.hasNext()) {
            if (((C53302fU) ((Map.Entry) it.next()).getValue()).A04 + TimeUnit.DAYS.toSeconds((long) 14) < TimeUnit.MILLISECONDS.toSeconds(r5.A00.A00())) {
                it.remove();
            }
        }
        r5.A01();
    }

    public void A06(int i2, int i3) {
        try {
            C53302fU A022 = A02();
            C53312fV A012 = A01();
            if (A022 != null && A012 != null) {
                if (i2 >= 0) {
                    A022.A00 = 1;
                }
                if (i3 >= 0) {
                    A022.A01 = i3;
                }
                this.A0G.A02(A022, A012.A01);
            }
        } catch (Exception e2) {
            Log.e("PAY: PaymentIncentiveManager/processUiOfferDetails : Error while parsing ", e2);
        }
    }

    public void A07(C53342fY r18, boolean z2) {
        C53302fU r7;
        C53342fY r1 = r18;
        try {
            C53312fV A012 = A01();
            if (A012 != null) {
                long j2 = A012.A01;
                if (j2 > 0) {
                    C53282fS r4 = this.A0G;
                    ConcurrentHashMap concurrentHashMap = r4.A02;
                    concurrentHashMap.clear();
                    r4.A00();
                    if (z2 || (r7 = (C53302fU) concurrentHashMap.get(Long.valueOf(j2))) == null || !A012.equals(r7.A08) || !AnonymousClass013.A00(this.A08.A00).toString().equals(r7.A0D)) {
                        C14870pt r10 = this.A03;
                        C16980tz r11 = this.A07;
                        C53352fZ r8 = new C53352fZ(this.A02, r10, r11, this.A0C, this.A0E);
                        String obj = AnonymousClass013.A00(this.A08.A00).toString();
                        C53372fb r72 = new C53372fb(r1, this, A012, obj);
                        C18310wU r112 = r8.A04;
                        String A022 = r112.A08.A02();
                        C53392fd r9 = new C53392fd(new AnonymousClass2BJ(A022), Long.valueOf(j2), obj);
                        r112.A0G(new IDxRCallbackShape7S0300000_1_I0(r8.A02.A00, r8.A03, r8.A01, r72, r8, r9, 0), r9.A00, A022, AnonymousClass1NO.A0L);
                        return;
                    } else if (r18 != null) {
                        r1.A00(A02());
                        return;
                    } else {
                        return;
                    }
                }
            }
            A05();
            if (r18 != null) {
                r1.A00((C53302fU) null);
            }
        } catch (JSONException e2) {
            Log.e("PAY: PaymentIncentiveManager/getIncentiveOfferInfo : ", e2);
            A05();
            if (r18 != null) {
                Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshGetIncentiveOfferInfo failed");
                r1.A00.AQQ();
            }
        }
    }

    public void A08(C53332fX r16, long j2) {
        C14870pt r8 = this.A03;
        C16980tz r9 = this.A07;
        C53352fZ r6 = new C53352fZ(this.A02, r8, r9, this.A0C, this.A0E);
        long j3 = j2;
        C53452fj r7 = new C53452fj(r16, this, j3);
        r6.A04.A0H(new C53472fl(r6.A02.A00, r6.A03, r6, r7, r6.A01), new C28371Vv("account", new C35081lL[]{new C35081lL("action", "get-offer-eligibility"), new C35081lL("offer_id", j3)}), "get", AnonymousClass1NO.A0L);
    }

    public void A09(C53332fX r15, C28371Vv r16, long j2) {
        try {
            long j3 = j2;
            C53292fT r8 = new C53292fT(r16, j3, this.A06.A00());
            synchronized (A0I) {
                C53302fU r6 = (C53302fU) this.A0G.A02.get(Long.valueOf(j3));
                if (r6 != null && r6.A01 > 0) {
                    int i2 = 0;
                    if (((long) (r8.A00 + r8.A01)) >= r6.A05) {
                        i2 = 1;
                    }
                    r6.A01 = i2;
                }
                this.A01 = r8;
                C18300wT r3 = this.A0D;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("offer_id", r8.A03);
                jSONObject.put("is_eligible", r8.A04);
                jSONObject.put("pending_count", r8.A00);
                jSONObject.put("redeemed_count", r8.A01);
                jSONObject.put("last_sync_time_ms", r8.A02);
                r3.A01().edit().putString("payment_incentive_user_claim_info", jSONObject.toString()).apply();
            }
            if (r15 != null) {
                r15.AY7(r8);
            }
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("processSuccessfulGetClaimStatus: Error while parsing: ");
            sb.append(e2);
            Log.e(sb.toString());
            A04();
            if (r15 != null) {
                r15.AQQ();
            }
        }
    }

    public synchronized void A0A(boolean z2) {
        if (this.A00 == 1) {
            Log.i("PAY: PaymentIncentiveManager/syncIncentiveData iq requests have yet to be fulfilled, aborting this iq call");
        } else {
            this.A00 = 1;
            A07(new C53342fY(new C53492fn(this), this, z2), false);
        }
    }

    public boolean A0B() {
        C53302fU r1;
        C53292fT r0;
        try {
            C53312fV A012 = A01();
            if (A012 == null) {
                return false;
            }
            long j2 = A012.A01;
            if (j2 == 0 || (r1 = (C53302fU) this.A0G.A02.get(Long.valueOf(j2))) == null || r1.A03 != 0 || (r0 = this.A01) == null || !r0.A04) {
                return false;
            }
            return r1.A0A.A01;
        } catch (JSONException e2) {
            Log.e("PAY: PaymentIncentiveManager/shouldSeedNewOffer : Error while fetching offer ID from ABProps ", e2);
            e2.printStackTrace();
            return false;
        }
    }
}
