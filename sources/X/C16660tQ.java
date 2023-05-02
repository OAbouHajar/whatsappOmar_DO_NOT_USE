package X;

import android.text.TextUtils;
import android.util.Base64;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.0tQ  reason: invalid class name and case insensitive filesystem */
public class C16660tQ implements C16670tR {
    public final C16300so A00;
    public final C25571Kh A01;
    public final C18260wP A02;
    public final C14710pd A03;

    public C16660tQ(C16300so r1, C25571Kh r2, C18260wP r3, C14710pd r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String A00(C16610tL r6) {
        byte[] bArr;
        try {
            bArr = C40481uC.A00("".getBytes(), r6.A02);
        } catch (Exception unused) {
            Log.e("ACSTokenProviderImpl/computeHMAC Failed to compute HMAC");
            this.A00.AcB("ACSTokenProviderImpl/computeHMAC", "Failed to compute HMAC", true);
            bArr = null;
        }
        if (bArr != null) {
            return Base64.encodeToString(bArr, 10);
        }
        return null;
    }

    public void A9N(C16650tP r30, String str) {
        int i2;
        byte[] decode;
        C16610tL r1;
        int i3;
        C16650tP r12 = r30;
        String str2 = str;
        C16640tO r9 = new C16640tO(this, r12, str2);
        try {
            C25571Kh r8 = this.A01;
            C14710pd r3 = this.A03;
            C16620tM r2 = C16620tM.A02;
            int A032 = r3.A03(r2, 966);
            int A033 = r3.A03(r2, 965);
            int A034 = r3.A03(r2, 967);
            int A035 = r3.A03(r2, 968);
            int A036 = r3.A03(r2, 969);
            int A037 = r3.A03(r2, 970);
            int A038 = r3.A03(r2, 971);
            int A039 = r3.A03(r2, 972);
            if (!r8.A09.contains(str2)) {
                C16300so r32 = this.A00;
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(" is not registered with ACSTokenManager");
                r32.AcB("ACSTokenProviderImpl/generateACSToken", sb.toString(), false);
                r12.A06(0);
                return;
            }
            Map map = r8.A01;
            if (!map.containsKey(str2)) {
                C16540tE r33 = new C16540tE(r8.A07, str2);
                C63093Gc r0 = new C63093Gc(r8.A06);
                C16440t3 r25 = r8.A04;
                C14710pd r21 = r8.A05;
                C16320sq r20 = r8.A08;
                C16550tF r18 = r8.A03;
                C16530tD r202 = new C16530tD(r8.A02, r18, r33, r0, r25, r21, r20, str2);
                r33.A02("token_length", A032);
                r33.A02("shared_secret_length", A033);
                r33.A03("max_time_to_live_in_sec", (long) A034);
                r33.A02("max_redeem_count", A035);
                r33.A02("lead_time_to_prefetch_sec", A036);
                r33.A02("lead_redeem_count_to_prefetch", A037);
                r33.A02("max_sign_retry_count", A038);
                r33.A03("sign_retry_interval_sec", (long) A039);
                map.put(str2, r202);
                r8.A00.put(str2, r33);
                r202.A09.execute(new RunnableRunnableShape2S0100000_I0_1(r202, 32));
            }
            if (map.containsKey(str2)) {
                ((C16530tD) map.get(str2)).A00.add(r9);
            }
            if (map.containsKey(str2) && r8.A00.get(str2) != null) {
                C16530tD r5 = (C16530tD) map.get(str2);
                C16540tE r4 = r5.A05;
                String string = r4.A00().getString("original_token_string", (String) null);
                long A002 = (r5.A07.A00() / 1000) - r4.A00().getLong("base_timestamp", 0);
                byte[] bArr = null;
                if (string != null) {
                    if (r4.A00().getInt("redeem_count", -1) >= r4.A00().getInt("max_redeem_count", -1) || A002 >= r4.A00().getLong("max_time_to_live_in_sec", 0)) {
                        decode = Base64.decode(string, 8);
                        if (!r5.A0F) {
                            r5.A09.execute(new RunnableRunnableShape2S0100000_I0_1(r5, 31));
                            i3 = r4.A00().getInt("token_not_ready_reason", 0);
                        } else {
                            r1 = new C16610tL(decode, (byte[]) null, 13);
                        }
                    } else {
                        int i4 = r4.A00().getInt("redeem_count", -1) + 1;
                        r4.A02("redeem_count", i4);
                        int i5 = r4.A00().getInt("lead_redeem_count_to_prefetch", 0);
                        int i6 = r4.A00().getInt("lead_time_to_prefetch_sec", 0);
                        if (i4 >= i5 || (A002 > r4.A00().getLong("max_time_to_live_in_sec", 0) - ((long) i6) && !r5.A0F)) {
                            r5.A09.execute(new RunnableRunnableShape2S0100000_I0_1(r5, 28));
                        }
                        decode = Base64.decode(string, 8);
                        String string2 = r4.A00().getString("shared_secret_string", (String) null);
                        if (string2 != null) {
                            bArr = Base64.decode(string2, 8);
                        }
                        i3 = 0;
                        r4.A01(0);
                    }
                    r1 = new C16610tL(decode, bArr, i3);
                } else if (!r5.A0F) {
                    r5.A09.execute(new RunnableRunnableShape2S0100000_I0_1(r5, 29));
                    r4.A01(13);
                    r1 = new C16610tL((byte[]) null, (byte[]) null, 13);
                } else {
                    r1 = new C16610tL((byte[]) null, (byte[]) null, r4.A00().getInt("token_not_ready_reason", 0));
                }
                byte[] bArr2 = r1.A01;
                if (!(bArr2 == null || r1.A02 == null)) {
                    String A003 = A00(r1);
                    if (TextUtils.isEmpty(A003)) {
                        i2 = 2;
                        r12.A06(i2);
                        r9.A00(str2);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Base64.encodeToString(bArr2, 10));
                    sb2.append("+");
                    sb2.append(A003);
                    String obj = sb2.toString();
                    if (!r12.A06.A02.isCancelled()) {
                        r12.A01 = obj;
                        r12.A05();
                    }
                    r9.A00(str2);
                }
            }
            if (!this.A02.A0A()) {
                i2 = 4;
                r12.A06(i2);
                r9.A00(str2);
            }
        } catch (Exception unused) {
            Log.e("ACSTokenProviderImpl/generateACSToken Exception while generating ACS token");
            this.A00.AcB("ACSTokenProviderImpl/generateACSToken", "Exception while generating ACS token", true);
            r12.A06(5);
            r9.A00(str2);
        }
    }
}
