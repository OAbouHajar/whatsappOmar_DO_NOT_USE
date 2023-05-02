package X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.telephony.TelephonyManager;
import com.obwhatsapp.CallConfirmationFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1cC  reason: invalid class name and case insensitive filesystem */
public class C30341cC {
    public static int A00(int i2, int i3, int i4) {
        float f2 = (float) i4;
        int i5 = ((int) (1.402f * f2)) + i2;
        float f3 = (float) i3;
        int i6 = i2 - ((int) ((0.344f * f3) + (f2 * 0.714f)));
        return Math.min(MotionEventCompat.ACTION_MASK, Math.max(0, i2 + ((int) (f3 * 1.772f)))) | (Math.min(MotionEventCompat.ACTION_MASK, Math.max(0, i5)) << 16) | -16777216 | (Math.min(MotionEventCompat.ACTION_MASK, Math.max(0, i6)) << 8);
    }

    public static int A01(TelephonyManager telephonyManager, C16260sj r3) {
        if (telephonyManager != null && !r3.A0D()) {
            try {
                return C15450qv.A0A() ? telephonyManager.getCallStateForSubscription() : telephonyManager.getCallState();
            } catch (SecurityException unused) {
                Log.w("voip/getTelephonyState SecurityException is caught");
            }
        }
        return 0;
    }

    public static C16010sH A02(C16000sG r4, C17240ul r5, GroupJid groupJid, C216014s r7) {
        C16010sH A09;
        C16050sL r1;
        if (groupJid == null || (A09 = r4.A09(groupJid)) == null || (r1 = (C16050sL) A09.A08(C16050sL.class)) == null || A09.A09() == null || r7.A06(r1, Boolean.valueOf(r5.A0a.A0D(r1)))) {
            return null;
        }
        return A09;
    }

    public static VoipStanzaChildNode A03(C30821d1 r8, VoipStanzaChildNode voipStanzaChildNode, byte b2) {
        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder(voipStanzaChildNode.tag);
        builder.addAttributes(voipStanzaChildNode.getAttributesCopy());
        VoipStanzaChildNode fromProtocolTreeNode = r8 != null ? VoipStanzaChildNode.fromProtocolTreeNode(C454228o.A00(r8, b2)) : null;
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                if ("enc".equals(voipStanzaChildNode2.tag)) {
                    voipStanzaChildNode2 = fromProtocolTreeNode;
                    if (fromProtocolTreeNode == null) {
                    }
                }
                builder.addChild(voipStanzaChildNode2);
            }
        }
        return builder.build();
    }

    public static VoipStanzaChildNode A04(VoipStanzaChildNode voipStanzaChildNode, Map map, Set set) {
        ArrayList arrayList;
        VoipStanzaChildNode[] voipStanzaChildNodeArr = null;
        Map map2 = map;
        Set set2 = set;
        if (map == null) {
            AnonymousClass00B.A0B("no destination jids", !set2.isEmpty());
            arrayList = new ArrayList(set2);
        } else {
            AnonymousClass00B.A0B("some device are not encrypted!", map2.keySet().equals(set2));
            arrayList = null;
        }
        List A02 = C46022Ca.A02((C51882cR) null, (Integer) null, (String) null, (String) null, arrayList, Collections.emptyMap(), (Map) null, map2, 0, false, false, false);
        if (!A02.isEmpty()) {
            voipStanzaChildNodeArr = new VoipStanzaChildNode[A02.size()];
            for (int i2 = 0; i2 < A02.size(); i2++) {
                voipStanzaChildNodeArr[i2] = VoipStanzaChildNode.fromProtocolTreeNode((C28371Vv) A02.get(i2));
            }
        }
        return C32601gl.A02(voipStanzaChildNode, voipStanzaChildNodeArr);
    }

    public static VoipStanzaChildNode A05(VoipStanzaChildNode voipStanzaChildNode, byte[] bArr) {
        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder(voipStanzaChildNode.tag);
        builder.addAttributes(voipStanzaChildNode.getAttributesCopy());
        builder.addChildren(voipStanzaChildNode.getChildrenCopy());
        VoipStanzaChildNode.Builder builder2 = new VoipStanzaChildNode.Builder("device-identity");
        builder2.setData(bArr);
        builder.addChild(builder2.build());
        return builder.build();
    }

    public static CallInfo A06() {
        if (!Voip.A07()) {
            return Voip.getCallInfo();
        }
        CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
        if (callLinkInfo != null) {
            return CallInfo.convertCallLinkInfoToCallInfo(callLinkInfo);
        }
        return null;
    }

    public static C35011lE A07() {
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            return null;
        }
        UserJid peerJid = callInfo.getPeerJid();
        AnonymousClass00B.A06(peerJid);
        boolean z2 = callInfo.isCaller;
        return new C35011lE(callInfo.initialGroupTransactionId, peerJid, A0B(callInfo.callId), z2);
    }

    public static File A08(Context context) {
        File file = new File(context.getCacheDir(), "voip_time_series");
        if (!file.exists() || !file.isDirectory()) {
            if (file.exists()) {
                file.delete();
            }
            if (!file.mkdirs()) {
                StringBuilder sb = new StringBuilder("VoipUtil failed to create time series directory: ");
                sb.append(file.getAbsolutePath());
                Log.e(sb.toString());
                return null;
            }
        }
        return file;
    }

    public static String A09(C16000sG r0, C16080sP r1, C17240ul r2, GroupJid groupJid, C216014s r4) {
        C16010sH A02 = A02(r0, r2, groupJid, r4);
        if (A02 != null) {
            return r1.A0C(A02);
        }
        return null;
    }

    public static String A0A(String str) {
        return str.startsWith("call:") ? str.replaceFirst("call:", "") : str;
    }

    public static String A0B(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("call:");
        sb.append(str);
        return sb.toString();
    }

    public static List A0C(C16040sK r3, C16000sG r4, C16070sO r5, C16010sH r6) {
        GroupJid groupJid = (GroupJid) r6.A08(C16050sL.class);
        ArrayList arrayList = new ArrayList();
        if (groupJid != null) {
            for (C15830rv A0A : A0D(r3, r5, groupJid)) {
                arrayList.add(r4.A0A(A0A));
            }
        } else {
            arrayList.add(r6);
        }
        return arrayList;
    }

    public static List A0D(C16040sK r2, C16070sO r3, GroupJid groupJid) {
        ArrayList arrayList = new ArrayList(r3.A07.A04(groupJid).A02());
        r2.A0B();
        arrayList.remove(r2.A05);
        return arrayList;
    }

    public static void A0E(C001000l r6, C16000sG r7, GroupJid groupJid, List list, List list2, int i2, boolean z2) {
        Intent className;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (r7.A0Z(userJid) || !z2) {
                arrayList.add(userJid);
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        int size = list.size() - arrayList.size();
        if (i3 >= 21) {
            Integer valueOf = Integer.valueOf(i2);
            AnonymousClass00B.A0B("List must be non empty", !arrayList.isEmpty());
            className = new Intent();
            className.setClassName(r6.getPackageName(), "com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet");
            className.putStringArrayListExtra("jids", C16030sJ.A06(arrayList));
            if (list2 != null && !list2.isEmpty()) {
                className.putStringArrayListExtra("selected", C16030sJ.A06(list2));
            }
            if (groupJid != null) {
                className.putExtra("source_group_jid", groupJid);
            }
            className.putExtra("hidden_jids", size);
            className.putExtra("call_from_ui", valueOf);
        } else {
            className = new Intent().setClassName(r6.getPackageName(), "com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPicker");
            className.putStringArrayListExtra("jids", C16030sJ.A06(arrayList));
            if (groupJid != null) {
                className.putExtra("source_group_jid", groupJid);
            }
            className.putExtra("hidden_jids", size);
            if (list2 != null && !list2.isEmpty()) {
                className.putStringArrayListExtra("selected", C16030sJ.A06(list2));
            }
            className.putExtra("call_from_ui", i2);
        }
        r6.startActivity(className);
        r6.overridePendingTransition(0, 0);
    }

    public static void A0F(C001000l r7, C16000sG r8, C37831po r9, int i2) {
        List<C38581r1> A04 = r9.A04();
        ArrayList arrayList = new ArrayList(A04.size());
        for (C38581r1 r0 : A04) {
            UserJid of = UserJid.of(r0.A02);
            if (of != null) {
                arrayList.add(of);
            }
        }
        ArrayList arrayList2 = null;
        if (arrayList.size() <= 8) {
            arrayList2 = new ArrayList(arrayList);
        }
        A0E(r7, r8, (GroupJid) null, arrayList, arrayList2, i2, false);
    }

    public static void A0G(C14550pN r5, C16010sH r6, Integer num, boolean z2) {
        CallConfirmationFragment callConfirmationFragment = new CallConfirmationFragment();
        Bundle bundle = new Bundle();
        Class<C15830rv> cls = C15830rv.class;
        bundle.putString("jid", C16030sJ.A03(r6.A08(cls)));
        bundle.putBoolean("is_video_call", z2);
        bundle.putInt("call_from_ui", num.intValue());
        callConfirmationFragment.A0T(bundle);
        StringBuilder sb = new StringBuilder("showCallConfirmationDialog groupJid: ");
        sb.append(r6.A08(cls));
        Log.i(sb.toString());
        r5.Afc(callConfirmationFragment);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        if ("video".equals(r7) != false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0H(android.net.Uri r10, X.C14550pN r11, X.C14870pt r12, X.C16040sK r13, X.C18890xQ r14, X.C204310c r15, X.C14710pd r16, int r17) {
        /*
            java.lang.String r1 = r10.getScheme()
            java.lang.String r0 = "whatsapp"
            boolean r0 = r0.equals(r1)
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r1 = r10.getHost()
            java.lang.String r0 = "call"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003f
        L_0x001b:
            java.lang.String r1 = r10.getScheme()
            java.lang.String r0 = "http"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0033
            java.lang.String r1 = r10.getScheme()
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
        L_0x0033:
            java.lang.String r1 = r10.getHost()
            java.lang.String r0 = "call.whatsapp.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
        L_0x003f:
            r3 = r16
            boolean r0 = X.C32601gl.A04(r13, r3)
            r9 = r11
            if (r0 == 0) goto L_0x009a
            java.util.List r8 = r10.getPathSegments()
            int r0 = r8.size()
            r6 = 0
            if (r0 <= 0) goto L_0x0098
            java.lang.Object r7 = r8.get(r5)
        L_0x0057:
            int r0 = r8.size()
            if (r0 <= r2) goto L_0x0063
            java.lang.Object r6 = r8.get(r2)
            java.lang.String r6 = (java.lang.String) r6
        L_0x0063:
            java.lang.String r0 = "voice"
            boolean r0 = r0.equals(r7)
            java.lang.String r4 = "video"
            if (r0 != 0) goto L_0x0076
            boolean r0 = r4.equals(r7)
            r3 = 0
            if (r0 == 0) goto L_0x0077
        L_0x0076:
            r3 = 1
        L_0x0077:
            if (r6 == 0) goto L_0x0096
            int r1 = r6.length()
            r0 = 22
            if (r1 != r0) goto L_0x0096
        L_0x0081:
            int r1 = r8.size()
            r0 = 2
            if (r1 != r0) goto L_0x00b7
            if (r3 == 0) goto L_0x00b7
            if (r2 == 0) goto L_0x00b7
            boolean r0 = r4.equals(r7)
            r1 = r17
            r15.A07(r11, r6, r1, r0)
        L_0x0095:
            return r5
        L_0x0096:
            r2 = 0
            goto L_0x0081
        L_0x0098:
            r7 = r6
            goto L_0x0057
        L_0x009a:
            boolean r0 = r13.A0G()
            if (r0 != 0) goto L_0x00aa
            r1 = 1129(0x469, float:1.582E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            if (r0 == 0) goto L_0x0095
        L_0x00aa:
            boolean r0 = r13.A0G()
            if (r0 == 0) goto L_0x00be
            r0 = 2131886932(0x7f120354, float:1.9408457E38)
            r11.Afg(r0)
            return r2
        L_0x00b7:
            r0 = 2131889058(0x7f120ba2, float:1.9412769E38)
            r12.A09(r0, r5)
            return r5
        L_0x00be:
            r11 = 2131886949(0x7f120365, float:1.9408491E38)
            r12 = 2131886948(0x7f120364, float:1.940849E38)
            r13 = 2131892402(0x7f1218b2, float:1.9419551E38)
            X.4uh r10 = new X.4uh
            r10.<init>(r9, r14)
            r14 = 2131889695(0x7f120e1f, float:1.941406E38)
            r9.A2b(r10, r11, r12, r13, r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30341cC.A0H(android.net.Uri, X.0pN, X.0pt, X.0sK, X.0xQ, X.10c, X.0pd, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r4.contains(r6.A05) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0I(X.C16040sK r6, X.C15900s5 r7, X.C17650vQ r8, X.C16000sG r9, X.C16070sO r10, X.C16010sH r11, X.C17240ul r12, com.whatsapp.jid.GroupJid r13) {
        /*
            r5 = 0
            if (r13 == 0) goto L_0x002b
            boolean r0 = r8.A00()
            if (r0 != 0) goto L_0x002b
            boolean r0 = r12.A0g(r11, r13)
            if (r0 != 0) goto L_0x002b
            X.0us r0 = r10.A07
            X.1cE r0 = r0.A04(r13)
            X.0uz r4 = r0.A02()
            int r0 = r4.size()
            r3 = 1
            if (r0 != r3) goto L_0x002c
            r6.A0B()
            X.1ZT r0 = r6.A05
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            return r5
        L_0x002c:
            int r2 = r4.size()
            X.0tC r0 = X.C15910s6.A1i
            int r1 = r7.A02(r0)
            r0 = 64
            int r0 = java.lang.Math.min(r0, r1)
            if (r2 <= r0) goto L_0x0054
            X.1Ub r1 = r4.iterator()
        L_0x0042:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r9.A0Z(r0)
            if (r0 == 0) goto L_0x0042
        L_0x0054:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30341cC.A0I(X.0sK, X.0s5, X.0vQ, X.0sG, X.0sO, X.0sH, X.0ul, com.whatsapp.jid.GroupJid):boolean");
    }

    public static boolean A0J(C15900s5 r3, C15810rt r4, C16070sO r5, C16010sH r6, GroupJid groupJid) {
        return groupJid != null && !r6.A0a && r4.A02(groupJid) != 3 && r5.A09(groupJid) && r5.A07.A04(groupJid).A04.size() <= Math.min(64, r3.A02(C15910s6.A1i));
    }

    public static boolean A0K(C17650vQ r3, GroupJid groupJid, CallInfo callInfo) {
        if (groupJid != null) {
            return !r3.A00() || (callInfo != null && callInfo.callState == CallState.ACTIVE && groupJid.equals(callInfo.groupJid));
        }
        return false;
    }

    public static boolean A0L(AnonymousClass01V r2) {
        ActivityManager A03 = r2.A03();
        return Build.VERSION.SDK_INT >= 28 && A03 != null && A03.isBackgroundRestricted();
    }

    public static boolean A0M(C15860rz r2, C14710pd r3) {
        if (!r2.A1e()) {
            C16620tM r1 = C16620tM.A02;
            return ((!r3.A0E(r1, 1674) || r2.A1e()) && r3.A0E(r1, 1268)) || r3.A0E(r1, 742);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0N(X.C15860rz r2, X.C14710pd r3, int r4, boolean r5) {
        /*
            boolean r0 = r2.A1e()
            if (r0 != 0) goto L_0x0032
            r0 = 1674(0x68a, float:2.346E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r0 = r3.A0E(r1, r0)
            if (r0 == 0) goto L_0x002a
            boolean r0 = r2.A1e()
            if (r0 != 0) goto L_0x002a
        L_0x0016:
            if (r5 != 0) goto L_0x0032
            r0 = 2353(0x931, float:3.297E-42)
            int r1 = r3.A03(r1, r0)
        L_0x001e:
            boolean r0 = A0M(r2, r3)
            if (r0 == 0) goto L_0x0034
            if (r1 == 0) goto L_0x0028
            if (r4 <= r1) goto L_0x0034
        L_0x0028:
            r0 = 1
            return r0
        L_0x002a:
            r0 = 1268(0x4f4, float:1.777E-42)
            boolean r0 = r3.A0E(r1, r0)
            if (r0 == 0) goto L_0x0016
        L_0x0032:
            r1 = 0
            goto L_0x001e
        L_0x0034:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30341cC.A0N(X.0rz, X.0pd, int, boolean):boolean");
    }

    public static boolean A0O(C14710pd r2) {
        return Build.VERSION.SDK_INT >= 21 && r2.A0E(C16620tM.A02, 1756);
    }

    public static boolean A0P(VoipStanzaChildNode voipStanzaChildNode) {
        C35081lL r4 = new C35081lL("type", "pkmsg");
        VoipStanzaChildNode A01 = C32601gl.A01(voipStanzaChildNode);
        if (A01 != null) {
            return A01.hasAttribute(r4);
        }
        VoipStanzaChildNode A00 = C32601gl.A00(voipStanzaChildNode);
        if (A00 != null) {
            VoipStanzaChildNode[] childrenCopy = A00.getChildrenCopy();
            if (childrenCopy != null) {
                for (VoipStanzaChildNode A012 : childrenCopy) {
                    VoipStanzaChildNode A013 = C32601gl.A01(A012);
                    if (A013 != null && A013.hasAttribute(r4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int[] A0Q(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        byte[] bArr2 = bArr;
        if (i5 == 17) {
            int i8 = i4 * i3;
            int[] iArr = new int[i8];
            int i9 = 0;
            int i10 = 0;
            while (i9 < i8) {
                byte b2 = bArr[i9] & 255;
                int i11 = i9 + 1;
                byte b3 = bArr[i11] & 255;
                int i12 = i3 + i9;
                byte b4 = bArr[i12] & 255;
                int i13 = i12 + 1;
                byte b5 = bArr[i13] & 255;
                int i14 = i8 + i10;
                byte b6 = bArr[i14] & 255;
                int i15 = (bArr[i14 + 1] & 255) - 128;
                int i16 = b6 - 128;
                iArr[i9] = A00(b2, i15, i16);
                iArr[i11] = A00(b3, i15, i16);
                iArr[i12] = A00(b4, i15, i16);
                iArr[i13] = A00(b5, i15, i16);
                if (i9 != 0 && (i9 + 2) % i3 == 0) {
                    i9 = i12;
                }
                i9 += 2;
                i10 += 2;
            }
            return iArr;
        } else if (i5 == 35) {
            int i17 = ((i3 * 3) * i4) / 2;
            int length = bArr2.length;
            if (length == i17) {
                return A0R(bArr2, i6, i7, true);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("convertYUV420toARGB8888 YUV_420_888 expected length ");
            sb.append(i17);
            sb.append(" got ");
            sb.append(length);
            Log.e(sb.toString());
            return null;
        } else if (i5 == 842094169) {
            return A0R(bArr2, i6, i7, false);
        } else {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("convertYUV420toARGB8888 supported format ");
                sb2.append(i5);
                Log.i(sb2.toString());
                return null;
            } catch (OutOfMemoryError e2) {
                StringBuilder sb3 = new StringBuilder("convertYUV420toARGB8888 OOM when convert data with format = ");
                sb3.append(i5);
                sb3.append(" width = ");
                sb3.append(i6);
                sb3.append("height = ");
                sb3.append(i7);
                Log.i(sb3.toString(), e2);
                return null;
            }
        }
    }

    public static int[] A0R(byte[] bArr, int i2, int i3, boolean z2) {
        int i4 = i2 * i3;
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            byte b2 = bArr[i5] & 255;
            int i7 = i5 + 1;
            byte b3 = bArr[i7] & 255;
            int i8 = i2 + i5;
            byte b4 = bArr[i8] & 255;
            int i9 = i8 + 1;
            byte b5 = bArr[i9] & 255;
            int i10 = i4 + i6;
            byte b6 = bArr[i10] & 255;
            byte b7 = bArr[i10 + (i4 >> 2)] & 255;
            if (!z2) {
                byte b8 = b6;
                b6 = b7;
                b7 = b8;
            }
            int i11 = b6 - 128;
            int i12 = b7 - 128;
            iArr[i5] = A00(b2, i11, i12);
            iArr[i7] = A00(b3, i11, i12);
            iArr[i8] = A00(b4, i11, i12);
            iArr[i9] = A00(b5, i11, i12);
            if (i5 != 0 && (i5 + 2) % i2 == 0) {
                i5 = i8;
            }
            i5 += 2;
            i6++;
        }
        return iArr;
    }
}
