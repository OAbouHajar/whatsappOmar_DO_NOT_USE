package X;

import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.10b  reason: invalid class name and case insensitive filesystem */
public class C204210b extends AnonymousClass10W {
    public final C16040sK A00;
    public final C16000sG A01;
    public final C16080sP A02;
    public final C16100sR A03;
    public final AnonymousClass10U A04;
    public final AnonymousClass01J A05;
    public final AnonymousClass01J A06;

    public C204210b(C16040sK r1, C16000sG r2, C16080sP r3, C16100sR r4, AnonymousClass10U r5, AnonymousClass01J r6, AnonymousClass01J r7) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
    }

    public static String A02(CallState callState) {
        switch (callState.ordinal()) {
            case 1:
            case 2:
                return "outgoing_ringing";
            case 3:
            case 8:
                return "incoming_ringing";
            case 4:
            case 5:
            case 6:
            case 11:
                return "active";
            default:
                return "idle";
        }
    }

    public static JSONObject A03(C16040sK r12, C16000sG r13, C16080sP r14, C16100sR r15, AnonymousClass10U r16, C15880s3 r17, CallInfo callInfo, CallState callState) {
        String A022 = A02(callState);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("call_state", A022);
        if (!"idle".equals(A022)) {
            CallInfo callInfo2 = callInfo;
            if (callInfo != null) {
                C15880s3 r5 = r17;
                if (!callInfo2.isCaller) {
                    AnonymousClass00B.A06(callInfo2.getPeerJid());
                    jSONObject.put("caller_contact_id", r15.A01.A03(r5, callInfo2.getPeerJid().getRawString()));
                    jSONObject.put("caller_name", r14.A07(r13.A0A(callInfo2.getPeerJid()), false).A01);
                }
                GroupJid groupJid = callInfo2.groupJid;
                if (groupJid != null) {
                    jSONObject.put("group_name", r14.A08(r13.A0A(groupJid)));
                }
                Set<C15830rv> keySet = callInfo2.participants.keySet();
                if (!keySet.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    int i2 = 0;
                    for (C15830rv r10 : keySet) {
                        if (!r12.A0I(r10)) {
                            String str = r14.A07(r13.A0A(r10), false).A01;
                            if (TextUtils.isEmpty(str)) {
                                i2++;
                            } else {
                                jSONArray.put(r15.A01.A03(r5, r10.getRawString()));
                                jSONArray2.put(str);
                            }
                        }
                    }
                    jSONObject.put("call_participant_contact_ids", jSONArray);
                    jSONObject.put("call_participant_names", jSONArray2);
                    jSONObject.put("unnamed_call_participant_count", i2);
                }
                jSONObject.put("call_id", r16.A03(r5, callInfo2.callId));
                jSONObject.put("video_call", callInfo2.videoEnabled);
            }
        }
        return jSONObject;
    }
}
