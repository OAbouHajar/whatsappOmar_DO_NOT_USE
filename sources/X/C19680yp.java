package X;

import android.content.SharedPreferences;
import com.AssemMods.fakechat.utils.AppUtils;
import com.obwhatsapp.data.device.IDxDObserverShape77S0100000_2_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.0yp  reason: invalid class name and case insensitive filesystem */
public class C19680yp {
    public static final long[] A09 = {300000, 3600000, 7200000};
    public final C16300so A00;
    public final C16040sK A01;
    public final AnonymousClass27H A02;
    public final C16440t3 A03;
    public final C15860rz A04;
    public final AnonymousClass1WC A05 = new IDxDObserverShape77S0100000_2_I0(this, 0);
    public final C19410yO A06;
    public final C14710pd A07;
    public final C17190ug A08;

    public C19680yp(C16300so r8, C16040sK r9, C16440t3 r10, C15860rz r11, C208211s r12, AnonymousClass16P r13, C19410yO r14, C14710pd r15, C17190ug r16, C16320sq r17) {
        this.A03 = r10;
        this.A07 = r15;
        this.A00 = r8;
        this.A01 = r9;
        this.A08 = r16;
        this.A04 = r11;
        this.A06 = r14;
        this.A02 = new AnonymousClass27H(r10, r11, r12, r13, r14, r17);
    }

    public void A00() {
        long A012 = this.A02.A01();
        if (A012 != -1) {
            A02(A012, this.A03.A00(), false);
            return;
        }
        Log.e("DeviceKeyIndexListUpdateHandler/updateKeyIndexList/fail to generate ts");
        A01(-1);
    }

    public void A01(int i2) {
        long A002 = this.A03.A00();
        AnonymousClass27H r4 = this.A02;
        C15860rz r3 = r4.A01;
        r3.A0K().putLong("adv_key_index_list_last_failure_time", A002).apply();
        r3.A0K().remove("adv_key_index_list_require_update").apply();
        int i3 = ((SharedPreferences) r3.A01.get()).getInt("adv_key_index_list_update_retry_count", 0) + 1;
        r3.A0K().putInt("adv_key_index_list_update_retry_count", i3).apply();
        StringBuilder sb = new StringBuilder("DeviceKeyIndexListUpdateHandler/onError code=");
        sb.append(i2);
        sb.append("; retryCount=");
        sb.append(i3);
        Log.e(sb.toString());
        if (i3 > 5) {
            Log.e("DeviceKeyIndexListUpdateHandler/onError logout all devices");
            this.A00.AcB("adv-key-index-list-update", "key index list update fails for more than 5 times", true);
            r4.A04();
        }
    }

    public final void A02(long j2, long j3, boolean z2) {
        AnonymousClass27H r2 = this.A02;
        C15860rz r0 = r2.A01;
        long j4 = j2;
        try {
            AnonymousClass27K A032 = r2.A03(r2.A02(AnonymousClass27H.A00(r0.A02(), r0.A01(), j4)));
            if (A032 != null) {
                AnonymousClass27L r9 = new AnonymousClass27L(this, this.A08, j4, j3, z2);
                C17190ug r10 = r9.A03;
                String A022 = r10.A02();
                r10.A0A(r9, new C28371Vv(new C28371Vv("key-index-list", A032.A02(), new C35081lL[]{new C35081lL((String) AppUtils.HANDLER_TS_KEY, r9.A00)}), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("id", A022), new C35081lL("xmlns", "md"), new C35081lL("type", "set")}), A022, 268, 32000);
                return;
            }
        } catch (Exception e2) {
            Log.e("CompanionDeviceAdvUtil/createADVSignedKeyIndexList ", e2);
        }
        Log.e("DeviceKeyIndexListUpdateHandler/updateKeyIndexList fail to generate index list");
        A01(-1);
    }

    public final boolean A03() {
        return this.A07.A03(C16620tM.A02, 477) != 0 && (this.A06.A06().isEmpty() ^ true) && !this.A01.A0G();
    }
}
