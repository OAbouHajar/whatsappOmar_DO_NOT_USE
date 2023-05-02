package X;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.obwhatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2dw  reason: invalid class name and case insensitive filesystem */
public class C52522dw {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public final DeviceJid A04;
    public final String A05;
    public final Map A06 = new HashMap();
    public final Set A07;
    public final /* synthetic */ C23531Ci A08;

    public C52522dw(C23531Ci r2, DeviceJid deviceJid, String str, Set set) {
        this.A08 = r2;
        this.A05 = str;
        this.A04 = deviceJid;
        this.A07 = set;
    }

    public void A00(C37511pH r19, C34151jm r20, String str, boolean z2) {
        C28541Wm r1;
        boolean z3 = false;
        C34151jm r5 = r20;
        if (r20 != null) {
            z3 = true;
        }
        Map map = this.A06;
        if (z3) {
            C69573fG r6 = (C69573fG) C37521pI.A0I.A0U();
            if (!TextUtils.isEmpty(r5.A0G)) {
                String str2 = r5.A0G;
                r6.A03();
                C37521pI r12 = (C37521pI) r6.A00;
                r12.A00 |= 1;
                r12.A0F = str2;
            }
            String str3 = r5.A0D;
            if (!TextUtils.isEmpty(str3)) {
                byte[] decode = Base64.decode(str3, 0);
                r6.A05(C28631Ww.A01(decode, 0, decode.length));
            }
            String str4 = r5.A08;
            if (!TextUtils.isEmpty(str4)) {
                byte[] decode2 = Base64.decode(str4, 0);
                C28631Ww A012 = C28631Ww.A01(decode2, 0, decode2.length);
                r6.A03();
                C37521pI r13 = (C37521pI) r6.A00;
                r13.A00 |= 4;
                r13.A07 = A012;
            }
            String str5 = r5.A0B;
            if (!TextUtils.isEmpty(str5)) {
                byte[] decode3 = Base64.decode(str5, 1);
                C28631Ww A013 = C28631Ww.A01(decode3, 0, decode3.length);
                r6.A03();
                C37521pI r14 = (C37521pI) r6.A00;
                r14.A00 |= 8;
                r14.A0A = A013;
            }
            String str6 = r5.A0C;
            if (!TextUtils.isEmpty(str6)) {
                r6.A03();
                C37521pI r15 = (C37521pI) r6.A00;
                r15.A00 |= 16;
                r15.A0E = str6;
            }
            int i2 = r5.A02;
            r6.A03();
            C37521pI r16 = (C37521pI) r6.A00;
            r16.A00 |= 32;
            r16.A02 = i2;
            int i3 = r5.A03;
            r6.A03();
            C37521pI r17 = (C37521pI) r6.A00;
            r17.A00 |= 64;
            r17.A03 = i3;
            String str7 = r5.A06;
            if (!TextUtils.isEmpty(str7)) {
                r6.A03();
                C37521pI r18 = (C37521pI) r6.A00;
                r18.A00 |= 128;
                r18.A0D = str7;
            }
            long j2 = (long) r5.A00;
            r6.A03();
            C37521pI r110 = (C37521pI) r6.A00;
            r110.A00 |= 256;
            r110.A04 = j2;
            r1 = r6.A02();
        } else {
            r1 = null;
        }
        C37511pH r52 = r19;
        map.put(str, new Pair(r52, r1));
        Set set = this.A07;
        set.size();
        map.size();
        if (r52 == C37511pH.A04) {
            if (z2) {
                this.A03++;
            } else {
                this.A01++;
            }
        } else if (r52 == C37511pH.A02) {
            this.A00++;
        } else {
            this.A02++;
        }
        if (map.size() == set.size()) {
            C23531Ci r7 = this.A08;
            C24621Gq r53 = r7.A05;
            DeviceJid deviceJid = this.A04;
            String str8 = this.A05;
            StringBuilder sb = new StringBuilder("NonMessageDataRequestSendMethod/sendStickerRequestResponseMessage sticker stanzaId=");
            sb.append(str8);
            sb.append("; remoteDeviceJid");
            sb.append(deviceJid);
            sb.append("; stickerSize=");
            sb.append(map.size());
            Log.i(sb.toString());
            if (map.isEmpty()) {
                Log.w("NonMessageDataRequestSendMethod/sendStickerRequestResponseMessage sticker result is empty");
            } else {
                C16040sK r0 = r53.A00;
                r0.A0B();
                AnonymousClass1ZT r10 = r0.A05;
                C37491pF r62 = new C37491pF(r53.A06.A02(r10, true), str8, r53.A03.A00());
                r62.A00 = deviceJid;
                r62.A00 = map;
                if (r53.A04.A01(r62) < 0) {
                    Log.e("NonMessageDataRequestSendMethod/sendStickerRequestResponseMessage unable to add sticker peer message");
                } else {
                    r53.A01.A00(new SendPeerMessageJob(deviceJid, r62, (byte[]) null, 0));
                }
            }
            r7.A04.A00(str8, 0, set.size(), this.A03, this.A01, this.A00, this.A02);
        }
    }
}
