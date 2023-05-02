package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.10c  reason: invalid class name and case insensitive filesystem */
public class C204310c {
    public long A00;
    public final Handler A01;
    public final C16570tH A02;
    public final C16300so A03;
    public final C14870pt A04;
    public final C16040sK A05;
    public final C15900s5 A06;
    public final AnonymousClass01Y A07;
    public final C23111An A08;
    public final C18380wb A09;
    public final C216514x A0A;
    public final C23121Ao A0B;
    public final C19590yg A0C;
    public final C18260wP A0D;
    public final C16000sG A0E;
    public final C16080sP A0F;
    public final AnonymousClass01V A0G;
    public final C16440t3 A0H;
    public final C16980tz A0I;
    public final C16260sj A0J;
    public final AnonymousClass013 A0K;
    public final C16070sO A0L;
    public final AnonymousClass195 A0M;
    public final C17580vJ A0N;
    public final C17240ul A0O;
    public final C216014s A0P;
    public final C16320sq A0Q;
    public final AnonymousClass01D A0R;
    public volatile AnonymousClass2R6 A0S;

    public C204310c(C16570tH r4, C16300so r5, C14870pt r6, C16040sK r7, C15900s5 r8, AnonymousClass01Y r9, C23111An r10, C18380wb r11, C216514x r12, C23121Ao r13, C19590yg r14, C18260wP r15, C16000sG r16, C16080sP r17, AnonymousClass01V r18, C16440t3 r19, C16980tz r20, C16260sj r21, AnonymousClass013 r22, C16070sO r23, AnonymousClass195 r24, C17580vJ r25, C17240ul r26, C216014s r27, C16320sq r28, AnonymousClass01D r29) {
        C16440t3 r2 = r19;
        this.A0H = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r7;
        this.A0I = r20;
        this.A0Q = r28;
        this.A0P = r27;
        this.A08 = r10;
        this.A06 = r8;
        this.A0E = r16;
        this.A0G = r18;
        this.A0F = r17;
        this.A0K = r22;
        this.A07 = r9;
        this.A0O = r26;
        this.A0N = r25;
        this.A09 = r11;
        this.A0J = r21;
        this.A0M = r24;
        this.A0B = r13;
        this.A0L = r23;
        this.A0D = r15;
        this.A02 = r4;
        this.A0C = r14;
        this.A0A = r12;
        this.A0R = r29;
        if (Build.VERSION.SDK_INT >= 28) {
            r12.A08(new C52262dQ(r10, this, r12, r2));
        }
        this.A01 = new C52272dR(Looper.getMainLooper(), this, r2);
    }

    public static C204310c A21() {
        return (C204310c) yo.mSingletonC.A3O.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r0 != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (android.text.TextUtils.equals(r13, r5.callId) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(android.content.Context r10, X.C38591r2 r11, com.whatsapp.jid.GroupJid r12, java.lang.String r13, java.util.ArrayList r14, java.util.ArrayList r15, java.util.List r16, boolean r17) {
        /*
            r9 = this;
            r3 = 0
            r2 = 1
            r8 = 0
            if (r13 == 0) goto L_0x0006
            r8 = 1
        L_0x0006:
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.Voip.getCallInfo()
            int r4 = r16.size()
            if (r13 == 0) goto L_0x001b
            if (r5 == 0) goto L_0x001b
            java.lang.String r0 = r5.callId
            boolean r0 = android.text.TextUtils.equals(r13, r0)
            r1 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            r0 = 0
            if (r11 == 0) goto L_0x0020
            r0 = 1
        L_0x0020:
            if (r1 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0072
            java.lang.String r1 = r11.A02
            java.lang.String r0 = r5.callLinkToken
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            if (r4 != 0) goto L_0x0072
            X.0ph r2 = new X.0ph
            r2.<init>()
            com.whatsapp.jid.UserJid r1 = r5.getPeerJid()
            X.AnonymousClass00B.A06(r1)
            X.0tH r0 = r9.A02
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            android.content.Intent r2 = r2.A10(r10, r1, r0)
            r1 = 3
            java.lang.String r0 = "lobbyEntryPoint"
            r2.putExtra(r0, r1)
            r10.startActivity(r2)
        L_0x0053:
            r6 = 8
        L_0x0055:
            return r6
        L_0x0056:
            if (r0 == 0) goto L_0x0072
        L_0x0058:
            if (r4 != 0) goto L_0x0072
            r1 = 0
            java.util.List r0 = java.util.Collections.singletonList(r13)
            android.os.Message r3 = android.os.Message.obtain(r1, r3, r0)
            X.0wb r2 = r9.A09
            java.lang.String r1 = "check_ongoing_calls"
            X.10g r0 = new X.10g
            r0.<init>((android.os.Message) r3, (java.lang.String) r1)
            r2.A00(r0)
            r6 = 12
            return r6
        L_0x0072:
            boolean r0 = r16.isEmpty()
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = "app/startOutgoingCall empty list of contacts"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r8 != 0) goto L_0x0086
            if (r12 == 0) goto L_0x0086
            r0 = 16
            r9.A05(r0)
        L_0x0086:
            return r2
        L_0x0087:
            X.2R6 r0 = r9.A0S
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "app/startOutgoingCall user tapped the call button twice before the telecom framework responds"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r6 = 2
            return r6
        L_0x0092:
            r0 = 0
            r9.A00 = r0
            java.util.Iterator r6 = r16.iterator()
        L_0x009a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r4 = r6.next()
            X.0sH r4 = (X.C16010sH) r4
            X.0sK r1 = r9.A05
            X.0rv r0 = r4.A0E
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x00b9
            X.0pt r1 = r9.A04
            r0 = 2131892886(0x7f121a96, float:1.9420533E38)
            r1.A07(r0, r2)
            return r2
        L_0x00b9:
            boolean r0 = r4.A0J()
            r1 = r0 ^ 1
            java.lang.String r0 = "can't start a call with a group contact"
            X.AnonymousClass00B.A0C(r0, r1)
            goto L_0x009a
        L_0x00c5:
            if (r8 != 0) goto L_0x00ef
            X.0wP r0 = r9.A0D
            int r0 = r0.A04(r2)
            if (r0 != 0) goto L_0x00ef
            boolean r0 = X.C18260wP.A02(r10)
            if (r0 == 0) goto L_0x00e4
            java.lang.String r0 = "app/startOutgoingCall/failed_airplane_mode_is_on"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0pt r1 = r9.A04
            r0 = 2131886991(0x7f12038f, float:1.9408576E38)
        L_0x00df:
            r1.A07(r0, r2)
            r6 = 4
            return r6
        L_0x00e4:
            java.lang.String r0 = "app/startOutgoingCall/failed_no_network"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0pt r1 = r9.A04
            r0 = 2131892864(0x7f121a80, float:1.9420488E38)
            goto L_0x00df
        L_0x00ef:
            r7 = 2131892847(0x7f121a6f, float:1.9420454E38)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            X.013 r4 = r9.A0K
            X.0sP r1 = r9.A0F
            r0 = -1
            java.lang.String r0 = r1.A0L(r15, r0)
            java.lang.String r0 = r4.A0G(r0)
            r6[r3] = r0
            java.lang.String r4 = r10.getString(r7, r6)
            int r0 = r16.size()
            if (r0 <= 0) goto L_0x0134
            int r1 = r15.size()
            int r0 = r16.size()
            if (r1 != r0) goto L_0x0134
            X.0pt r0 = r9.A04
            X.0pS r1 = r0.A00
            if (r1 == 0) goto L_0x0130
            boolean r0 = r1.AIm()
            if (r0 != 0) goto L_0x012e
            boolean r0 = r1 instanceof X.C14550pN
            if (r0 == 0) goto L_0x012e
            androidx.fragment.app.DialogFragment r0 = com.obwhatsapp.DisplayExceptionDialogFactory$ContactBlockedDialogFragment.A01(r4, r15)
            r1.Afc(r0)
        L_0x012e:
            r6 = 5
            return r6
        L_0x0130:
            r0.A0H(r4, r3)
            goto L_0x012e
        L_0x0134:
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x013f
            X.0pt r0 = r9.A04
            r0.A0H(r4, r3)
        L_0x013f:
            boolean r0 = r14.isEmpty()
            r1 = r0 ^ 1
            java.lang.String r0 = "callable jids must not be empty"
            X.AnonymousClass00B.A0B(r0, r1)
            X.0sj r1 = r9.A0J
            r0 = r17
            boolean r0 = r1.A0G(r0)
            if (r0 != 0) goto L_0x015b
            r6 = 7
            java.lang.String r0 = "app/startOutgoingCall/failed_no_record_audio_permission"
        L_0x0157:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r6
        L_0x015b:
            boolean r0 = r1.A0D()
            if (r0 == 0) goto L_0x0166
            r6 = 11
            java.lang.String r0 = "app/startOutgoingCall/failed_no_read_phone_state_permission"
            goto L_0x0157
        L_0x0166:
            r6 = 0
            r4 = 7
            boolean r0 = com.whatsapp.voipcalling.Voip.A08(r5)
            if (r0 == 0) goto L_0x019c
            if (r8 == 0) goto L_0x01ba
            java.lang.String r0 = r5.callId
            boolean r0 = android.text.TextUtils.equals(r13, r0)
            if (r0 == 0) goto L_0x01ba
            X.0ph r2 = new X.0ph
            r2.<init>()
            com.whatsapp.jid.UserJid r1 = r5.getPeerJid()
            X.AnonymousClass00B.A06(r1)
            X.0tH r0 = r9.A02
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            android.content.Intent r1 = r2.A10(r10, r1, r0)
            java.lang.String r0 = "lobbyEntryPoint"
            r1.putExtra(r0, r4)
            r10.startActivity(r1)
            goto L_0x0053
        L_0x019c:
            X.01V r0 = r9.A0G
            android.telephony.TelephonyManager r0 = r0.A0N()
            int r0 = X.C30341cC.A01(r0, r1)
            if (r0 == 0) goto L_0x01d5
            r1 = 2131886992(0x7f120390, float:1.9408578E38)
            if (r8 == 0) goto L_0x01b0
            r1 = 2131892913(0x7f121ab1, float:1.9420588E38)
        L_0x01b0:
            X.0pt r0 = r9.A04
            r0.A07(r1, r2)
            r6 = 9
            java.lang.String r0 = "app/startOutgoingCall/failed_cellular_call_in_progress"
            goto L_0x0157
        L_0x01ba:
            java.lang.String r0 = "app/startOutgoingCall/ try to start outgoing call from active voip call "
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 2131888188(0x7f12083c, float:1.9411004E38)
            if (r8 == 0) goto L_0x01c7
            r0 = 2131888197(0x7f120845, float:1.9411023E38)
        L_0x01c7:
            android.widget.Toast r1 = android.widget.Toast.makeText(r10, r0, r2)
            r0 = 17
            r1.setGravity(r0, r3, r3)
            r1.show()
            goto L_0x0053
        L_0x01d5:
            if (r8 != 0) goto L_0x024d
            if (r12 == 0) goto L_0x024d
            X.0sO r2 = r9.A0L
            boolean r0 = r2.A09(r12)
            r4 = 0
            if (r0 != 0) goto L_0x01f0
            r0 = 13
            r9.A05(r0)
            X.0so r1 = r9.A03
            java.lang.String r0 = "linked-group-call/left-chat-group"
        L_0x01eb:
            r1.AcB(r0, r4, r3)
        L_0x01ee:
            r6 = 1
            return r6
        L_0x01f0:
            X.0sG r0 = r9.A0E
            X.0sH r1 = r0.A09(r12)
            X.AnonymousClass00B.A06(r1)
            X.0ul r0 = r9.A0O
            boolean r0 = r0.A0e(r1)
            if (r0 == 0) goto L_0x0207
            r0 = 17
        L_0x0203:
            r9.A05(r0)
            goto L_0x01ee
        L_0x0207:
            boolean r0 = r1.A0Y
            if (r0 == 0) goto L_0x0214
            boolean r0 = r2.A0A(r12)
            if (r0 != 0) goto L_0x0214
            r0 = 14
            goto L_0x0203
        L_0x0214:
            X.0us r0 = r2.A07
            X.1cE r0 = r0.A04(r12)
            java.util.Map r0 = r0.A04
            java.util.Set r0 = r0.keySet()
            X.0uz r0 = X.C17380uz.copyOf((java.util.Collection) r0)
            int r2 = r0.size()
            X.0s5 r1 = r9.A06
            X.0tC r0 = X.C15910s6.A1i
            int r1 = r1.A02(r0)
            r0 = 64
            int r0 = java.lang.Math.min(r0, r1)
            if (r2 <= r0) goto L_0x0242
            r0 = 15
            r9.A05(r0)
            X.0so r1 = r9.A03
            java.lang.String r0 = "linked-group-call/log-exceed-size"
            goto L_0x01eb
        L_0x0242:
            X.195 r0 = r9.A0M
            X.1r0 r0 = r0.A02(r12)
            if (r0 == 0) goto L_0x0055
            r0 = 11
            goto L_0x0203
        L_0x024d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204310c.A00(android.content.Context, X.1r2, com.whatsapp.jid.GroupJid, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.List, boolean):int");
    }

    public int A01(Context context, C16010sH r12, int i2, boolean z2) {
        if (r12 == null) {
            return 1;
        }
        return A02(context, (GroupJid) null, C224718b.A00(this.A05, this.A0H, true), Collections.singletonList(r12), i2, z2);
    }

    public final int A02(Context context, GroupJid groupJid, String str, List list, int i2, boolean z2) {
        int i3;
        AnonymousClass00B.A01();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C16010sH r1 = (C16010sH) it.next();
            AnonymousClass1ZX r2 = (AnonymousClass1ZX) r1.A08(AnonymousClass1ZX.class);
            if (r2 != null) {
                AnonymousClass1ZT A012 = this.A0N.A01(r2);
                if (A012 == null) {
                    StringBuilder sb = new StringBuilder("No PN mapping for ");
                    sb.append(r2);
                    Log.w(sb.toString());
                } else {
                    r1 = this.A0E.A0A(A012);
                }
            }
            arrayList.add(r1);
        }
        Context context2 = context;
        if (this.A0C.A05()) {
            C32241fu r12 = new C32241fu(context2);
            r12.A01(R.string.str1afb);
            r12.setPositiveButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
            r12.A00();
            return 12;
        }
        StringBuilder sb2 = new StringBuilder("app/startOutgoingCall/from ");
        int i4 = i2;
        sb2.append(i4);
        sb2.append(", video call:");
        boolean z3 = z2;
        sb2.append(z3);
        sb2.append(", groupJid:");
        GroupJid groupJid2 = groupJid;
        sb2.append(groupJid2);
        Log.i(sb2.toString());
        C23111An r4 = this.A08;
        int size = arrayList.size();
        String str2 = str;
        if (r4.A04(str2, 726210773)) {
            r4.A01(str2, size, z3, false);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        if (groupJid != null) {
            while (it2.hasNext()) {
                arrayList2.add(((C16010sH) it2.next()).A08(UserJid.class));
            }
        } else {
            while (it2.hasNext()) {
                UserJid userJid = (UserJid) ((C16010sH) it2.next()).A08(UserJid.class);
                if (this.A07.A0V(userJid)) {
                    arrayList3.add(userJid);
                    Log.w("app/startOutgoingCall/failed_contact_blocked");
                } else {
                    arrayList2.add(userJid);
                }
            }
        }
        int A002 = A00(context2, (C38591r2) null, groupJid2, (String) null, arrayList2, arrayList3, arrayList, z3);
        if (A002 != 0) {
            if (A002 != 7) {
                if (A002 == 11) {
                    i3 = 1;
                }
                r4.A03(str2, 7952);
                return A002;
            }
            i3 = 0;
            Intent intent = new Intent();
            intent.setClassName(context2.getPackageName(), "com.obwhatsapp.calling.VoipPermissionsActivity");
            intent.putStringArrayListExtra("jids", C16030sJ.A06(arrayList2));
            intent.putExtra("call_from", i4);
            intent.putExtra("video_call", z3);
            intent.putExtra("permission_type", i3);
            if (groupJid != null) {
                intent.putExtra("group_jid", groupJid2.getRawString());
            }
            context2.startActivity(intent);
            r4.A03(str2, 7952);
            return A002;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            linkedHashMap.put(it3.next(), (Object) null);
        }
        if (Build.VERSION.SDK_INT >= 28 && this.A0A.A0E()) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                linkedHashMap2.put(it4.next(), (Object) null);
            }
            boolean z4 = z3;
            int A042 = A04(new AnonymousClass2R6(groupJid2, str2, linkedHashMap2, i4, z4), str2, arrayList2, z4, false);
            if (A042 == 0) {
                return A042;
            }
        }
        this.A0Q.Acl(new RunnableRunnableShape3S0200000_I0_1(this, 38, new AnonymousClass2R6(groupJid2, str2, linkedHashMap, i4, z3)));
        return 0;
    }

    public int A03(Context context, GroupJid groupJid, List list, int i2, boolean z2) {
        return A02(context, groupJid, C224718b.A00(this.A05, this.A0H, true), list, i2, z2);
    }

    public final int A04(AnonymousClass2R6 r13, String str, List list, boolean z2, boolean z3) {
        UserJid userJid = (UserJid) list.get(0);
        Context context = this.A0I.A00;
        C16000sG r6 = this.A0E;
        C16080sP r4 = this.A0F;
        String A092 = C30341cC.A09(r6, r4, this.A0O, r13.A03, this.A0P);
        if (A092 == null) {
            boolean z4 = false;
            if (list.size() == 1) {
                z4 = true;
            }
            AnonymousClass2Wj A022 = C52142dD.A02(r6, r4, list, 2, z4);
            A092 = C40651uT.A03(A022 == null ? null : A022.A00(context));
        }
        if (A092 == null) {
            Log.w("app/startOutgoingCall/startTelecomFrameworkInternal displayName is null");
        } else if (Build.VERSION.SDK_INT >= 28) {
            C216514x r62 = this.A0A;
            if (r62.A0E()) {
                this.A00 = SystemClock.elapsedRealtime();
                if (r62.A0F()) {
                    this.A0S = r13;
                    boolean z5 = z3;
                    if (r62.A0H(userJid, str, A092, z2, z5)) {
                        Handler handler = this.A01;
                        handler.removeMessages(1);
                        Message message = new Message();
                        message.what = 1;
                        message.obj = Boolean.valueOf(z5);
                        handler.sendMessageDelayed(message, 2000);
                        return 0;
                    }
                    this.A0S = null;
                    return 10;
                }
            }
        }
        return 10;
    }

    public final void A05(int i2) {
        C14600pS r2 = this.A04.A00;
        if (r2 != null) {
            ((C19110xm) this.A0R.get()).A00(AnonymousClass11C.class);
            r2.Afb(VoipErrorDialogFragment.A02(new C52302dW(), i2), (String) null);
        }
    }

    public void A06(Context context, C37831po r24, int i2) {
        AnonymousClass00B.A01();
        Context context2 = context;
        if (this.A0C.A05()) {
            C32241fu r2 = new C32241fu(context2);
            r2.A01(R.string.str1afb);
            r2.setPositiveButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
            r2.A00();
            return;
        }
        StringBuilder sb = new StringBuilder("app/startFromCallLog/from ");
        C37831po r5 = r24;
        sb.append(r5.A03());
        Log.i(sb.toString());
        if (this.A0S != null) {
            Log.e("app/startFromCallLog user tapped the call button twice before the telecom framework responds");
            return;
        }
        this.A00 = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C38581r1 r0 : r5.A04()) {
            UserJid userJid = r0.A02;
            arrayList.add(userJid);
            arrayList3.add(this.A0E.A0A(userJid));
        }
        C35011lE r02 = r5.A0C;
        String str = r02.A02;
        String A0A2 = C30341cC.A0A(str);
        C23111An r3 = this.A08;
        boolean z2 = r5.A0I;
        int size = arrayList3.size();
        if (r3.A04(A0A2, 726210773)) {
            r3.A01(A0A2, size, z2, true);
        }
        boolean z3 = r5.A0I;
        int A002 = A00(context2, r5.A0G, (GroupJid) null, C30341cC.A0A(str), arrayList, arrayList2, arrayList3, z3);
        int i3 = i2;
        if (A002 != 0) {
            if (A002 == 7 || A002 == 11) {
                int i4 = r02.A00;
                boolean z4 = r02.A03;
                UserJid userJid2 = r02.A01;
                boolean z5 = r5.A0I;
                int i5 = 1;
                if (A002 == 7) {
                    i5 = 0;
                }
                Intent intent = new Intent();
                intent.setClassName(context2.getPackageName(), "com.obwhatsapp.calling.VoipPermissionsActivity");
                intent.putExtra("join_call_log", true);
                intent.putExtra("call_log_call_id", str);
                intent.putExtra("call_log_transaction_id", i4);
                intent.putExtra("call_log_from_me", z4);
                intent.putExtra("call_log_user_jid", userJid2.getRawString());
                intent.putExtra("video_call", z5);
                intent.putExtra("lobby_entry_point", i3);
                intent.putExtra("permission_type", i5);
                context2.startActivity(intent);
            }
            r3.A03(A0A2, 7952);
            return;
        }
        if (A04(new AnonymousClass2R6(r5, i3), A0A2, arrayList, r5.A0I, true) != 0) {
            AnonymousClass2R6 r32 = new AnonymousClass2R6(r5, i3);
            if (r32.A04 != null) {
                this.A0Q.Acl(new RunnableRunnableShape3S0200000_I0_1(this, 37, r32));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        if (r9.A0M.A04(r1) == null) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.content.Context r10, java.lang.String r11, int r12, boolean r13) {
        /*
            r9 = this;
            X.AnonymousClass00B.A01()
            r4 = r9
            X.0sj r2 = r9.A0J
            r8 = r13
            boolean r0 = r2.A0G(r13)
            r5 = r11
            r6 = r12
            if (r0 != 0) goto L_0x0037
            r3 = 0
        L_0x0010:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.calling.VoipPermissionsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "video_call"
            r2.putExtra(r0, r13)
            java.lang.String r0 = "permission_type"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "call_link_lobby_token"
            r2.putExtra(r0, r11)
            java.lang.String r0 = "lobby_entry_point"
            r2.putExtra(r0, r12)
            r10.startActivity(r2)
            return
        L_0x0037:
            boolean r0 = r2.A0D()
            if (r0 == 0) goto L_0x003f
            r3 = 1
            goto L_0x0010
        L_0x003f:
            java.lang.String r0 = "app/previewCallLink token:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r11)
            java.lang.String r0 = " isVideoEnabled: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r11.length()
            r0 = 22
            if (r1 == r0) goto L_0x0066
            java.lang.String r0 = "app/previewCallLink token with wrong length!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0066:
            java.lang.String r1 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r1 == 0) goto L_0x0075
            X.195 r0 = r9.A0M
            X.1r0 r0 = r0.A04(r1)
            r3 = 1
            if (r0 != 0) goto L_0x0076
        L_0x0075:
            r3 = 0
        L_0x0076:
            X.01V r0 = r9.A0G
            android.telephony.TelephonyManager r0 = r0.A0N()
            int r0 = X.C30341cC.A01(r0, r2)
            r2 = 1
            if (r0 == 0) goto L_0x0091
            r1 = 2131886992(0x7f120390, float:1.9408578E38)
            if (r3 == 0) goto L_0x008b
            r1 = 2131892913(0x7f121ab1, float:1.9420588E38)
        L_0x008b:
            X.0pt r0 = r9.A04
            r0.A07(r1, r2)
            return
        L_0x0091:
            X.0sq r0 = r9.A0Q
            r7 = 0
            com.facebook.redex.RunnableRunnableShape0S1111000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S1111000_I0
            r3.<init>(r4, r5, r6, r7, r8)
            r0.Acl(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204310c.A07(android.content.Context, java.lang.String, int, boolean):void");
    }
}
