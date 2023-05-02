package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.util.List;

/* renamed from: X.2dA  reason: invalid class name and case insensitive filesystem */
public class C52122dA {
    public final int A00;
    public final long A01;
    public final GroupJid A02;
    public final UserJid A03;
    public final CallState A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C52122dA(GroupJid groupJid, UserJid userJid, CallState callState, String str, List list, int i2, long j2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A05 = str;
        this.A04 = callState;
        this.A07 = z2;
        this.A08 = z3;
        this.A0E = z4;
        this.A0C = z5;
        this.A0B = z6;
        this.A01 = j2;
        this.A03 = userJid;
        this.A06 = list;
        this.A0D = z7;
        this.A02 = groupJid;
        this.A0A = z8;
        this.A09 = z9;
        this.A00 = i2;
    }

    public static C52122dA A00(CallInfo callInfo, int i2, boolean z2) {
        CallInfo callInfo2 = callInfo;
        C32011fV r3 = callInfo2.callWaitingInfo;
        if (r3.A01 == 1) {
            UserJid userJid = r3.A03.initialPeerJid;
            AnonymousClass00B.A06(userJid);
            String str = r3.A04;
            CallState callState = CallState.RECEIVED_CALL;
            boolean z3 = false;
            if (r3.A00 > 1) {
                z3 = true;
            }
            boolean z4 = r3.A08;
            return new C52122dA(r3.A02, userJid, callState, str, r3.A06, -1, 0, false, z3, z4, false, false, true, r3.A07, false);
        }
        List peerJids = callInfo2.getPeerJids();
        String str2 = callInfo2.callId;
        CallState callState2 = callInfo2.callState;
        boolean z5 = callInfo2.isCaller;
        boolean z6 = callInfo2.isGroupCall;
        boolean z7 = callInfo2.videoEnabled;
        boolean isCallOnHold = callInfo2.isCallOnHold();
        long j2 = callInfo2.callDuration;
        UserJid peerJid = callInfo2.getPeerJid();
        AnonymousClass00B.A06(peerJid);
        return new C52122dA(callInfo2.groupJid, peerJid, callState2, str2, peerJids, i2, j2, z5, z6, z7, z2, isCallOnHold, false, callInfo2.isJoinableGroupCall, callInfo2.isInLonelyState());
    }
}
