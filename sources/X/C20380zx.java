package X;

import android.util.Pair;
import com.facebook.redex.IDxCallbackShape70S0200000_2_I0;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.0zx  reason: invalid class name and case insensitive filesystem */
public abstract class C20380zx {
    public final C20360zv A00;

    public C20380zx(C20360zv r1) {
        this.A00 = r1;
    }

    public String A00() {
        if (this instanceof C33731j4) {
            return "regular_high";
        }
        if ((this instanceof C33701j0) || (this instanceof AnonymousClass19G)) {
            return "regular_low";
        }
        if (this instanceof C33631it) {
            return "regular_high";
        }
        if (this instanceof C33691iz) {
            return null;
        }
        return !(this instanceof C33721j3) ? !(this instanceof C33661iw) ? !(this instanceof AnonymousClass19H) ? ((this instanceof C24581Gm) || (this instanceof C20370zw)) ? "regular" : ((this instanceof AnonymousClass19F) || (this instanceof C217715j)) ? "regular_low" : !(this instanceof C33611ir) ? !(this instanceof C33651iv) ? !(this instanceof AnonymousClass1WG) ? !(this instanceof AnonymousClass1j1) ? ((this instanceof C33671ix) || (this instanceof C33641iu)) ? "regular_high" : this instanceof C28431Wb ? "critical_unblock_low" : this instanceof C33681iy ? "regular_high" : "regular_low" : "regular_low" : "critical_block" : "regular_low" : "regular_high" : "regular_low" : "critical_block" : "regular_low";
    }

    public String A01() {
        return this instanceof C33731j4 ? "userStatusMute" : this instanceof C33701j0 ? "setting_unarchiveChats" : this instanceof AnonymousClass19G ? "time_format" : this instanceof C33631it ? "star" : this instanceof C33691iz ? "sentinel" : this instanceof C33721j3 ? "removeRecentSticker" : this instanceof C33661iw ? "setting_pushName" : this instanceof AnonymousClass19H ? "primary_version" : this instanceof C24581Gm ? "primary_feature" : this instanceof C20370zw ? "pnForLidChat" : this instanceof AnonymousClass19F ? "pin_v1" : this instanceof C217715j ? "nux" : this instanceof C33611ir ? "mute" : this instanceof C33651iv ? "markChatAsRead" : this instanceof AnonymousClass1WG ? "setting_locale" : this instanceof AnonymousClass1j1 ? "favoriteSticker" : this instanceof C33671ix ? "deleteMessageForMe" : this instanceof C33641iu ? "deleteChat" : this instanceof C28431Wb ? "contact" : this instanceof C33681iy ? "clearChat" : this instanceof C33621is ? "archive" : "android_unsupported_actions";
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x0345 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0136 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A02(boolean r18) {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = r0 instanceof X.C33731j4
            if (r1 == 0) goto L_0x00a4
            X.1j4 r0 = (X.C33731j4) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.0sf r3 = r0.A01
            X.0ty r2 = r3.A01()
            X.0tf r5 = r2.get()
            X.0tg r7 = r5.A02     // Catch:{ all -> 0x009f }
            java.lang.String r8 = "settings"
            r2 = 1
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ all -> 0x009f }
            java.lang.String r6 = "jid"
            r4 = 0
            r9[r4] = r6     // Catch:{ all -> 0x009f }
            java.lang.String r10 = "status_muted = ?"
            java.lang.String[] r11 = new java.lang.String[r2]     // Catch:{ all -> 0x009f }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x009f }
            r11[r4] = r2     // Catch:{ all -> 0x009f }
            r12 = 0
            r14 = r12
            r13 = r12
            android.database.Cursor r8 = r7.A09(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x009f }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0098 }
            r7.<init>()     // Catch:{ all -> 0x0098 }
            if (r8 == 0) goto L_0x005e
            int r6 = r8.getColumnIndex(r6)     // Catch:{ all -> 0x0098 }
        L_0x0041:
            boolean r2 = r8.moveToNext()     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x005e
            java.lang.String r2 = r8.getString(r6)     // Catch:{ all -> 0x0098 }
            com.whatsapp.jid.Jid r4 = com.whatsapp.jid.Jid.get(r2)     // Catch:{ 1W4 -> 0x0057 }
            boolean r2 = r4 instanceof com.whatsapp.jid.UserJid     // Catch:{ 1W4 -> 0x0057 }
            if (r2 == 0) goto L_0x0041
            r7.add(r4)     // Catch:{ 1W4 -> 0x0057 }
            goto L_0x0041
        L_0x0057:
            r4 = move-exception
            java.lang.String r2 = "ChatSettingsStore#getAllMutedStatusJids. Failed to map jid"
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x0098 }
            goto L_0x0041
        L_0x005e:
            if (r8 == 0) goto L_0x0063
            r8.close()     // Catch:{ all -> 0x009f }
        L_0x0063:
            r5.close()
            java.util.Iterator r5 = r7.iterator()
        L_0x006a:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x04d4
            java.lang.Object r4 = r5.next()
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.0rv r2 = X.C15830rv.A00(r4)
            boolean r2 = r3.A0R(r2)
            if (r2 == 0) goto L_0x006a
            X.0t3 r2 = r0.A00
            long r13 = r2.A00()
            r2 = 1
            X.C18450wi.A0H(r4, r2)
            r16 = 0
            r15 = 1
            X.1oP r9 = new X.1oP
            r10 = r12
            r11 = r4
            r9.<init>(r10, r11, r12, r13, r15, r16)
            r1.add(r9)
            goto L_0x006a
        L_0x0098:
            r0 = move-exception
            if (r8 == 0) goto L_0x009e
            r8.close()     // Catch:{ all -> 0x009e }
        L_0x009e:
            throw r0     // Catch:{ all -> 0x009f }
        L_0x009f:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x034a }
            throw r0
        L_0x00a4:
            boolean r1 = r0 instanceof X.C33701j0
            if (r1 == 0) goto L_0x00e8
            X.1j0 r0 = (X.C33701j0) r0
            X.0rz r2 = r0.A07
            boolean r1 = r2.A1b()
            if (r1 == 0) goto L_0x00dd
            X.0sK r1 = r0.A00
            boolean r1 = r1.A0G()
            if (r1 != 0) goto L_0x00dd
            java.lang.String r1 = "unarchive-chats-setting-handler/createBootstrapMutations"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            if (r18 == 0) goto L_0x00c7
            java.util.List r0 = r0.A0A()
            return r0
        L_0x00c7:
            r1 = 0
            X.0t3 r0 = r0.A06
            long r3 = r0.A00()
            boolean r5 = r2.A1c()
            X.1oN r0 = new X.1oN
            r2 = r1
            r0.<init>(r1, r2, r3, r5)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L_0x00dd:
            java.lang.String r0 = "unarchive-chats-setting-handler/createBootstrapMutations/empty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x00e8:
            boolean r1 = r0 instanceof X.AnonymousClass19G
            if (r1 == 0) goto L_0x0113
            X.19G r0 = (X.AnonymousClass19G) r0
            X.0sK r1 = r0.A00
            boolean r1 = r1.A0G()
            r1 = r1 ^ 1
            X.AnonymousClass00B.A0G(r1)
            X.013 r1 = r0.A02
            X.1Zd r1 = r1.A04()
            boolean r5 = r1.A00
            X.0t3 r0 = r0.A01
            long r3 = r0.A00()
            r1 = 0
            X.1oY r0 = new X.1oY
            r2 = r1
            r0.<init>(r1, r2, r3, r5)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L_0x0113:
            boolean r1 = r0 instanceof X.C33631it
            if (r1 == 0) goto L_0x013c
            X.1it r0 = (X.C33631it) r0
            X.0tq r1 = r0.A05
            X.0tf r3 = r1.get()
            X.10G r2 = r0.A06     // Catch:{ all -> 0x0137 }
            r1 = 0
            android.database.Cursor r2 = r2.ADc(r1, r1)     // Catch:{ all -> 0x0137 }
            r1 = 1
            java.util.List r0 = r0.A0A(r2, r3, r1)     // Catch:{ all -> 0x0132 }
            r2.close()     // Catch:{ all -> 0x0137 }
            r3.close()
            return r0
        L_0x0132:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0136 }
        L_0x0136:
            throw r0     // Catch:{ all -> 0x0137 }
        L_0x0137:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x034a }
            throw r0
        L_0x013c:
            boolean r1 = r0 instanceof X.C33691iz
            if (r1 != 0) goto L_0x04f0
            boolean r1 = r0 instanceof X.C33721j3
            if (r1 != 0) goto L_0x04ea
            boolean r1 = r0 instanceof X.C33661iw
            if (r1 == 0) goto L_0x0162
            X.1iw r0 = (X.C33661iw) r0
            X.0sK r1 = r0.A00
            java.lang.String r3 = r1.A07()
            X.0t3 r0 = r0.A01
            long r4 = r0.A00()
            r1 = 0
            X.1oa r0 = new X.1oa
            r2 = r1
            r0.<init>(r1, r2, r3, r4)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L_0x0162:
            boolean r1 = r0 instanceof X.AnonymousClass19H
            if (r1 == 0) goto L_0x0184
            X.19H r0 = (X.AnonymousClass19H) r0
            r1 = 2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.lang.String r1 = "current"
            X.1ot r1 = r0.A0A(r1)
            r2.add(r1)
            if (r18 != 0) goto L_0x0183
            java.lang.String r1 = "session_start"
            X.1ot r0 = r0.A0A(r1)
            r2.add(r0)
        L_0x0183:
            return r2
        L_0x0184:
            boolean r1 = r0 instanceof X.C24581Gm
            if (r1 == 0) goto L_0x01a0
            X.1Gm r0 = (X.C24581Gm) r0
            java.util.List r3 = r0.A0A()
            X.0t3 r0 = r0.A02
            long r4 = r0.A00()
            r1 = 0
            X.1or r0 = new X.1or
            r2 = r1
            r0.<init>(r1, r2, r3, r4)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L_0x01a0:
            boolean r1 = r0 instanceof X.C20370zw
            if (r1 == 0) goto L_0x01a7
            X.22l r0 = X.C440222l.A00
            return r0
        L_0x01a7:
            boolean r1 = r0 instanceof X.AnonymousClass19F
            if (r1 == 0) goto L_0x0220
            X.19F r0 = (X.AnonymousClass19F) r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.0sf r1 = r0.A07
            java.util.Map r1 = r1.A09()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r6 = r1.iterator()
        L_0x01c0:
            boolean r1 = r6.hasNext()
            r5 = 1
            if (r1 == 0) goto L_0x01e6
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            X.0rv r4 = (X.C15830rv) r4
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            long r2 = r1.longValue()
            X.1on r1 = new X.1on
            r1.<init>(r4, r2, r5)
            r7.add(r1)
            goto L_0x01c0
        L_0x01e6:
            if (r18 == 0) goto L_0x01eb
            r0.A0A(r7)
        L_0x01eb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r7.iterator()
        L_0x01f4:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x04d4
            java.lang.Object r3 = r4.next()
            X.1on r3 = (X.C37211on) r3
            X.19E r2 = r0.A01
            r2.A06(r5)
            X.0rv r8 = r3.A00
            r11 = 0
            X.0t3 r2 = r0.A03
            long r9 = r2.A00()
            X.19D r2 = r0.A00
            X.1o8 r7 = r2.A04(r8, r11)
            X.1ol r6 = new X.1ol
            r6.<init>(r7, r8, r9, r11)
            r1.add(r6)
            r1.add(r3)
            goto L_0x01f4
        L_0x0220:
            boolean r1 = r0 instanceof X.C217715j
            if (r1 == 0) goto L_0x02ab
            X.15j r0 = (X.C217715j) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.28d r2 = r0.A00
            X.0ve r2 = r2.A00
            java.util.Map r2 = r2.A02
            java.util.Collection r2 = r2.values()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r2.iterator()
        L_0x023e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0256
            java.lang.Object r4 = r5.next()
            r3 = r4
            X.28e r3 = (X.C453728e) r3
            r2 = 0
            boolean r2 = r3.AHa(r2)
            if (r2 == 0) goto L_0x023e
            r6.add(r4)
            goto L_0x023e
        L_0x0256:
            r2 = 10
            int r2 = X.AnonymousClass1J9.A0M(r6, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            java.util.Iterator r3 = r6.iterator()
        L_0x0265:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0279
            java.lang.Object r2 = r3.next()
            X.28e r2 = (X.C453728e) r2
            java.lang.String r2 = r2.AE0()
            r4.add(r2)
            goto L_0x0265
        L_0x0279:
            boolean r3 = r4 instanceof java.util.Collection
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            if (r3 == 0) goto L_0x02a4
            r2.<init>(r4)
        L_0x0282:
            java.util.Iterator r3 = r2.iterator()
        L_0x0286:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x04d4
            java.lang.Object r7 = r3.next()
            java.lang.String r7 = (java.lang.String) r7
            X.0t3 r2 = r0.A03
            long r8 = r2.A00()
            r10 = 1
            r5 = 0
            X.1og r4 = new X.1og
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r10)
            r1.add(r4)
            goto L_0x0286
        L_0x02a4:
            r2.<init>()
            X.C003101j.A0H(r4, r2)
            goto L_0x0282
        L_0x02ab:
            boolean r1 = r0 instanceof X.C33611ir
            if (r1 == 0) goto L_0x034b
            X.1ir r0 = (X.C33611ir) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.0sf r2 = r0.A02
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            X.0ty r2 = r2.A01()
            X.0tf r8 = r2.get()
            X.0tg r4 = r8.A02     // Catch:{ all -> 0x0346 }
            java.lang.String r3 = "SELECT jid, mute_end FROM settings WHERE mute_end IS NOT NULL"
            r2 = 0
            android.database.Cursor r7 = r4.A08(r3, r2)     // Catch:{ all -> 0x0346 }
            java.lang.String r2 = "jid"
            int r6 = r7.getColumnIndex(r2)     // Catch:{ all -> 0x033f }
            java.lang.String r2 = "mute_end"
            int r5 = r7.getColumnIndex(r2)     // Catch:{ all -> 0x033f }
        L_0x02da:
            boolean r2 = r7.moveToNext()     // Catch:{ all -> 0x033f }
            if (r2 == 0) goto L_0x02fb
            java.lang.String r2 = r7.getString(r6)     // Catch:{ all -> 0x033f }
            X.0rv r4 = X.C15830rv.A02(r2)     // Catch:{ all -> 0x033f }
            if (r4 == 0) goto L_0x02da
            long r2 = r7.getLong(r5)     // Catch:{ all -> 0x033f }
            java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x033f }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x033f }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x033f }
            r9.add(r2)     // Catch:{ all -> 0x033f }
            goto L_0x02da
        L_0x02fb:
            r7.close()     // Catch:{ all -> 0x0346 }
            r8.close()
            java.util.Iterator r6 = r9.iterator()
        L_0x0305:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x04d4
            java.lang.Object r2 = r6.next()
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r9 = r2.first
            X.0rv r9 = (X.C15830rv) r9
            java.lang.Object r2 = r2.second
            java.lang.Number r2 = (java.lang.Number) r2
            long r11 = r2.longValue()
            X.0t3 r5 = r0.A00
            long r3 = java.lang.System.currentTimeMillis()
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x032d
            r3 = -1
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0305
        L_0x032d:
            long r13 = r5.A00()
            r15 = 1
            r8 = 0
            r16 = 0
            X.1oe r7 = new X.1oe
            r10 = r8
            r7.<init>(r8, r9, r10, r11, r13, r15, r16)
            r1.add(r7)
            goto L_0x0305
        L_0x033f:
            r0 = move-exception
            if (r7 == 0) goto L_0x0345
            r7.close()     // Catch:{ all -> 0x0345 }
        L_0x0345:
            throw r0     // Catch:{ all -> 0x0346 }
        L_0x0346:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x034a }
        L_0x034a:
            throw r0
        L_0x034b:
            boolean r1 = r0 instanceof X.C33651iv
            if (r1 == 0) goto L_0x03ca
            X.1iv r0 = (X.C33651iv) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.0rt r7 = r0.A03
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.concurrent.ConcurrentHashMap r3 = r7.A0C()
            monitor-enter(r7)
            boolean r2 = r7.A00     // Catch:{ all -> 0x03c7 }
            monitor-exit(r7)
            if (r2 == 0) goto L_0x03bf
            java.util.Set r2 = r3.entrySet()
            java.util.Iterator r5 = r2.iterator()
        L_0x036f:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0396
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            X.0rv r4 = (X.C15830rv) r4
            java.lang.Object r2 = r2.getValue()
            X.0rx r2 = (X.C15840rx) r2
            int r3 = r2.A06
            r2 = -1
            if (r3 != r2) goto L_0x036f
            boolean r2 = r7.A0I(r4)
            if (r2 != 0) goto L_0x036f
            r6.add(r4)
            goto L_0x036f
        L_0x0396:
            java.util.Iterator r3 = r6.iterator()
        L_0x039a:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x04d4
            java.lang.Object r7 = r3.next()
            X.0rv r7 = (X.C15830rv) r7
            r11 = 0
            X.0t3 r2 = r0.A02
            long r9 = r2.A00()
            X.19D r2 = r0.A00
            X.1o8 r6 = r2.A04(r7, r11)
            r5 = 0
            r12 = 0
            X.1oT r4 = new X.1oT
            r8 = r5
            r4.<init>(r5, r6, r7, r8, r9, r11, r12)
            r1.add(r4)
            goto L_0x039a
        L_0x03bf:
            java.lang.String r0 = "ChatsCache/getMarkedAsUnreadChats: chat haven't initialized"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x03c7:
            r1 = move-exception
            monitor-exit(r7)
            throw r1
        L_0x03ca:
            boolean r1 = r0 instanceof X.AnonymousClass1WG
            if (r1 == 0) goto L_0x03ea
            X.1WG r0 = (X.AnonymousClass1WG) r0
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r3 = X.AnonymousClass1WH.A05(r1)
            X.0t3 r0 = r0.A01
            long r4 = r0.A00()
            r1 = 0
            X.1WI r0 = new X.1WI
            r2 = r1
            r0.<init>(r1, r2, r3, r4)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L_0x03ea:
            boolean r1 = r0 instanceof X.AnonymousClass1j1
            if (r1 == 0) goto L_0x047c
            X.1j1 r0 = (X.AnonymousClass1j1) r0
            java.lang.String r1 = "FavoriteStickerHandler/createBootstrapMutations"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1Go r1 = r0.A06
            r3 = 150(0x96, float:2.1E-43)
            r2 = 1
            X.AnonymousClass00B.A00()
            X.1Qj r1 = r1.A04
            java.util.List r3 = r1.A02(r3, r2)
            int r1 = r3.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.Iterator r5 = r3.iterator()
        L_0x0410:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0443
            java.lang.Object r3 = r5.next()
            X.1pc r3 = (X.C37721pc) r3
            java.lang.String r7 = r3.A0B
            java.lang.String r8 = r3.A0E
            java.lang.String r9 = r3.A0A
            java.lang.String r10 = r3.A0C
            java.lang.String r11 = r3.A0D
            int r13 = r3.A07
            int r14 = r3.A06
            java.lang.String r12 = r3.A09
            int r1 = r3.A05
            long r15 = (long) r1
            X.1oK r6 = new X.1oK
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            long r3 = r3.A08
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r6, r3)
            r2.add(r1)
            goto L_0x0410
        L_0x0443:
            int r1 = r2.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r3 = r2.iterator()
        L_0x0450:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x047b
            java.lang.Object r2 = r3.next()
            android.util.Pair r2 = (android.util.Pair) r2
            X.0sK r1 = r0.A01
            int r9 = r1.A00()
            java.lang.Object r6 = r2.first
            X.1oK r6 = (X.C36921oK) r6
            java.lang.Object r1 = r2.second
            java.lang.Number r1 = (java.lang.Number) r1
            long r10 = r1.longValue()
            r12 = 1
            r7 = 0
            r13 = 0
            X.1oL r5 = new X.1oL
            r8 = r7
            r5.<init>(r6, r7, r8, r9, r10, r12, r13)
            r4.add(r5)
            goto L_0x0450
        L_0x047b:
            return r4
        L_0x047c:
            boolean r1 = r0 instanceof X.C33671ix
            if (r1 != 0) goto L_0x04ea
            boolean r1 = r0 instanceof X.C33641iu
            if (r1 != 0) goto L_0x04f0
            boolean r1 = r0 instanceof X.C28431Wb
            if (r1 == 0) goto L_0x0498
            X.1Wb r0 = (X.C28431Wb) r0
            java.lang.String r1 = "Please use createBootstrapMutations(initialData) method instead"
            X.AnonymousClass00B.A08(r1)
            java.util.List r1 = java.util.Collections.emptyList()
            java.util.List r0 = r0.A0B(r1)
            return r0
        L_0x0498:
            boolean r1 = r0 instanceof X.C33681iy
            if (r1 != 0) goto L_0x04f0
            boolean r1 = r0 instanceof X.C33621is
            if (r1 == 0) goto L_0x04d5
            X.1is r0 = (X.C33621is) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.0rs r2 = r0.A03
            java.util.List r2 = r2.A06()
            java.util.Iterator r4 = r2.iterator()
        L_0x04b1:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x04d4
            java.lang.Object r7 = r4.next()
            X.0rv r7 = (X.C15830rv) r7
            r10 = 1
            X.0t3 r2 = r0.A04
            long r8 = r2.A00()
            X.19D r3 = r0.A00
            r2 = 0
            X.1o8 r6 = r3.A04(r7, r2)
            X.1ol r5 = new X.1ol
            r5.<init>(r6, r7, r8, r10)
            r1.add(r5)
            goto L_0x04b1
        L_0x04d4:
            return r1
        L_0x04d5:
            X.1j2 r0 = (X.C33711j2) r0
            X.0t3 r0 = r0.A00
            long r3 = r0.A00()
            r5 = 0
            r1 = 0
            X.1oG r0 = new X.1oG
            r2 = r1
            r0.<init>(r1, r2, r3, r5)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L_0x04ea:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L_0x04f0:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20380zx.A02(boolean):java.util.List");
    }

    public void A03(AnonymousClass1WJ r9) {
        String str;
        C34151jm r2;
        IDxCallbackShape70S0200000_2_I0 iDxCallbackShape70S0200000_2_I0;
        if (this instanceof C33731j4) {
            C33731j4 r3 = (C33731j4) this;
            C36971oP r92 = (C36971oP) r9;
            boolean z2 = r92.A01;
            C16220sf r1 = r3.A01;
            UserJid userJid = r92.A00;
            if (z2) {
                r1.A0U(userJid);
            } else {
                r1.A0T(userJid);
            }
            r3.A04(r92);
            return;
        }
        if (!(this instanceof C33701j0)) {
            if (this instanceof AnonymousClass19G) {
                str = "Android shouldn't process TimeFormatMutation with dependencies missing";
            } else if (this instanceof C33631it) {
                C33631it r22 = (C33631it) this;
                C37101oc r93 = (C37101oc) r9;
                C16460t6 r0 = r22.A04;
                C16740tZ A03 = r0.A0K.A03(r93.A01);
                if (A03 != null) {
                    r22.A0B(r93, A03);
                    r22.A04(r93);
                    return;
                }
                return;
            } else if (this instanceof C33691iz) {
                ((C33691iz) this).A0B((C36901oI) r9, (C36901oI) null);
                return;
            } else if (this instanceof C33721j3) {
                C33721j3 r7 = (C33721j3) this;
                C37161oi r94 = (C37161oi) r9;
                C212613k r6 = r7.A01;
                Pair A0A = r6.A0A(r94.A01);
                if (A0A != null) {
                    long longValue = ((Number) A0A.second).longValue();
                    long j2 = r94.A00;
                    if (longValue == j2) {
                        r2 = (C34151jm) A0A.first;
                        iDxCallbackShape70S0200000_2_I0 = new IDxCallbackShape70S0200000_2_I0(r7, 2, r94);
                    } else if (longValue < j2) {
                        r2 = (C34151jm) A0A.first;
                        iDxCallbackShape70S0200000_2_I0 = null;
                    } else {
                        r7.A04(r94);
                        return;
                    }
                    r6.A0F(iDxCallbackShape70S0200000_2_I0, r2);
                    return;
                }
                return;
            } else if (this instanceof C33661iw) {
                return;
            } else {
                if (this instanceof AnonymousClass19H) {
                    str = "PrimaryVersionMutation shouldn't have dependencies";
                } else if (!(this instanceof C24581Gm)) {
                    if (this instanceof C20370zw) {
                        C18450wi.A0H(r9, 0);
                    } else if (this instanceof AnonymousClass19F) {
                        AnonymousClass19F r32 = (AnonymousClass19F) this;
                        r32.A0A(r32.A06.A09("pin_v1", true));
                        r32.A04(r9);
                        return;
                    } else if (this instanceof C217715j) {
                        C217715j r23 = (C217715j) this;
                        C37141og r95 = (C37141og) r9;
                        r23.A0A(r95.A00, r95.A01);
                        r23.A04(r95);
                        return;
                    } else if (this instanceof C33611ir) {
                        C33611ir r24 = (C33611ir) this;
                        C37121oe r96 = (C37121oe) r9;
                        if (r24.A01.A0F(r96.A01)) {
                            r24.A0A(r96);
                            r24.A04(r96);
                            return;
                        }
                        return;
                    } else if (this instanceof C33651iv) {
                        ((C33651iv) this).A0A((C37011oT) r9);
                        return;
                    } else if (this instanceof AnonymousClass1WG) {
                        return;
                    } else {
                        if (this instanceof AnonymousClass1j1) {
                            AnonymousClass1j1 r33 = (AnonymousClass1j1) this;
                            C36931oL r97 = (C36931oL) r9;
                            String str2 = r97.A01.A07;
                            if (!r97.A02) {
                                r33.A0C(str2);
                            } else if (r33.A06.A00(str2) == null) {
                                C34151jm A0A2 = r33.A0A(r97);
                                if (A0A2 != null) {
                                    r33.A0B(A0A2, r97.A04);
                                } else {
                                    return;
                                }
                            }
                            r33.A04(r97);
                            return;
                        } else if (this instanceof C33671ix) {
                            C33671ix r34 = (C33671ix) this;
                            C36851oD r98 = (C36851oD) r9;
                            C16460t6 r25 = r34.A01;
                            C16740tZ A032 = r25.A0K.A03(r98.A02);
                            if (A032 != null) {
                                r25.A0m(Collections.singleton(A032), r98.A03 ? 1 : 0);
                                r34.A04(r98);
                                return;
                            }
                            return;
                        } else if (!(this instanceof C33641iu) && !(this instanceof C28431Wb) && !(this instanceof C33681iy)) {
                            if (this instanceof C33621is) {
                                ((C33621is) this).A0B((C37191ol) r9);
                                return;
                            } else {
                                A08(r9, (AnonymousClass1WJ) null);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
            AnonymousClass00B.A08(str);
        }
        A04(r9);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass1WJ r8) {
        /*
            r7 = this;
            X.0zv r0 = r7.A00
            X.19K r0 = r0.A01
            X.0tf r3 = r0.A02()
            X.1cj r6 = r3.A00()     // Catch:{ all -> 0x0048 }
            X.0tg r5 = r3.A02     // Catch:{ all -> 0x0043 }
            java.lang.String r4 = "UPDATE syncd_mutations SET are_dependencies_missing = 0, mutation_name = ?, chat_jid = ?  WHERE mutation_index = ? "
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0043 }
            r1 = 0
            java.lang.String r0 = r8.A04()     // Catch:{ all -> 0x0043 }
            r2[r1] = r0     // Catch:{ all -> 0x0043 }
            r1 = 1
            boolean r0 = r8 instanceof X.C36821oA     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x003a
            r0 = r8
            X.1oA r0 = (X.C36821oA) r0     // Catch:{ all -> 0x0043 }
            X.0rv r0 = r0.AAV()     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x0043 }
        L_0x002a:
            r2[r1] = r0     // Catch:{ all -> 0x0043 }
            r1 = 2
            java.lang.String r0 = r8.A03()     // Catch:{ all -> 0x0043 }
            r2[r1] = r0     // Catch:{ all -> 0x0043 }
            r5.A0C(r4, r2)     // Catch:{ all -> 0x0043 }
            r6.A00()     // Catch:{ all -> 0x0043 }
            goto L_0x003c
        L_0x003a:
            r0 = 0
            goto L_0x002a
        L_0x003c:
            r6.close()     // Catch:{ all -> 0x0048 }
            r3.close()
            return
        L_0x0043:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20380zx.A04(X.1WJ):void");
    }

    public final void A05(AnonymousClass1WJ r3) {
        this.A00.A0H(Collections.singleton(r3.A07));
    }

    public final void A06(AnonymousClass1WJ r3) {
        r3.A05(false);
        this.A00.A0G(Collections.singleton(r3));
    }

    public final void A07(AnonymousClass1WJ r3) {
        r3.A05(true);
        this.A00.A0G(Collections.singleton(r3));
    }

    public final void A08(AnonymousClass1WJ r3, AnonymousClass1WJ r4) {
        if (r4 != null) {
            this.A00.A0E(r4);
        }
        this.A00.A0G(Collections.singleton(r3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03b0, code lost:
        if (r4.A04 <= r1.A04) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0409, code lost:
        if (r4.A04 <= r1.A04) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x060c, code lost:
        if (r4.A04 <= r1.A04) goto L_0x060e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x065f, code lost:
        if (r4.A04 <= r1.A04) goto L_0x0661;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0193, code lost:
        if (r3.A04 > r1.A04) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b6, code lost:
        if (r3.A04 > r1.A04) goto L_0x0195;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:274:0x0506 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.AnonymousClass1WJ r21, X.AnonymousClass1WJ r22) {
        /*
            r20 = this;
            r4 = r22
            r1 = r21
            r0 = r20
            boolean r2 = r0 instanceof X.C33731j4
            if (r2 == 0) goto L_0x0024
            X.1j4 r0 = (X.C33731j4) r0
            X.1oP r1 = (X.C36971oP) r1
            X.1oP r4 = (X.C36971oP) r4
            if (r4 == 0) goto L_0x047c
            com.whatsapp.jid.UserJid r3 = r4.A00
            com.whatsapp.jid.UserJid r2 = r1.A00
            if (r3 != r2) goto L_0x047c
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x047c
            r0.A06(r1)
        L_0x0023:
            return
        L_0x0024:
            boolean r2 = r0 instanceof X.C33701j0
            if (r2 == 0) goto L_0x0080
            X.1j0 r0 = (X.C33701j0) r0
            X.1oN r1 = (X.C36951oN) r1
            X.0sK r2 = r0.A00
            boolean r2 = r2.A0G()
            if (r2 == 0) goto L_0x0549
            X.1Wg r3 = r1.A05
            X.1Wg r2 = X.C28481Wg.A03
            if (r3 != r2) goto L_0x0023
            X.0rz r5 = r0.A07
            boolean r2 = r5.A1b()
            if (r2 != 0) goto L_0x005d
            X.17e r3 = r0.A05
            X.0sK r2 = r3.A00
            boolean r2 = r2.A0G()
            X.AnonymousClass00B.A0G(r2)
            X.0rz r2 = r3.A03
            r4 = 1
            android.content.SharedPreferences$Editor r3 = r2.A0K()
            java.lang.String r2 = "archive_v2_enabled"
            android.content.SharedPreferences$Editor r2 = r3.putBoolean(r2, r4)
            r2.apply()
        L_0x005d:
            boolean r4 = r1.A00
            android.content.SharedPreferences$Editor r3 = r5.A0K()
            java.lang.String r2 = "notify_new_message_for_archived_chats"
            android.content.SharedPreferences$Editor r2 = r3.putBoolean(r2, r4)
            r2.apply()
            if (r4 == 0) goto L_0x050c
            X.0zv r10 = r0.A00
            java.lang.String r3 = "archive"
            r7 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.19K r2 = r10.A01
            X.0tf r9 = r2.get()
            goto L_0x048f
        L_0x0080:
            boolean r2 = r0 instanceof X.AnonymousClass19G
            if (r2 != 0) goto L_0x0672
            boolean r2 = r0 instanceof X.C33631it
            if (r2 == 0) goto L_0x00bc
            X.1it r0 = (X.C33631it) r0
            X.1oc r1 = (X.C37101oc) r1
            X.1Vw r9 = r1.A01
            X.0rv r6 = r1.A00
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]
            r3 = 0
            java.lang.String r2 = "deleteMessageForMe"
            r5[r3] = r2
            java.lang.String[] r2 = X.AnonymousClass1XA.A01(r6, r9, r5)
            java.lang.String r5 = X.AnonymousClass1WJ.A00(r2)
            X.0zv r3 = r0.A00
            X.1WJ r2 = r3.A05(r5)
            if (r2 != 0) goto L_0x054d
            X.1WJ r2 = r3.A06(r5)
            if (r2 != 0) goto L_0x054d
            if (r22 == 0) goto L_0x0559
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0559
            r0.A06(r1)
            return
        L_0x00bc:
            boolean r2 = r0 instanceof X.C33691iz
            if (r2 == 0) goto L_0x00ca
            X.1iz r0 = (X.C33691iz) r0
            X.1oI r1 = (X.C36901oI) r1
            X.1oI r4 = (X.C36901oI) r4
            r0.A0B(r1, r4)
            return
        L_0x00ca:
            boolean r2 = r0 instanceof X.C33721j3
            if (r2 == 0) goto L_0x00e2
            X.1j3 r0 = (X.C33721j3) r0
            X.1oi r1 = (X.C37161oi) r1
            X.1oi r4 = (X.C37161oi) r4
            if (r4 == 0) goto L_0x056e
            long r7 = r4.A00
            long r5 = r1.A00
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0591
            r0.A08(r1, r4)
            return
        L_0x00e2:
            boolean r2 = r0 instanceof X.C33661iw
            if (r2 == 0) goto L_0x00f8
            X.1iw r0 = (X.C33661iw) r0
            X.1oa r1 = (X.C37081oa) r1
            if (r22 == 0) goto L_0x05a0
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x05a0
            r0.A06(r1)
            return
        L_0x00f8:
            boolean r2 = r0 instanceof X.AnonymousClass19H
            if (r2 != 0) goto L_0x0672
            boolean r2 = r0 instanceof X.C24581Gm
            if (r2 == 0) goto L_0x012b
            X.1Gm r0 = (X.C24581Gm) r0
            X.1or r1 = (X.C37251or) r1
            X.0sK r2 = r0.A00
            boolean r2 = r2.A0G()
            if (r2 == 0) goto L_0x0127
            X.11R r5 = r0.A01
            java.util.List r3 = r1.A00
            java.lang.String r2 = "ddm_settings"
            boolean r4 = r3.contains(r2)
            android.content.SharedPreferences r2 = r5.A00()
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.lang.String r2 = "ddm_settings_feature_flag"
            android.content.SharedPreferences$Editor r2 = r3.putBoolean(r2, r4)
            r2.apply()
        L_0x0127:
            r0.A06(r1)
            return
        L_0x012b:
            boolean r2 = r0 instanceof X.C20370zw
            if (r2 == 0) goto L_0x0149
            X.0zw r0 = (X.C20370zw) r0
            X.1oV r1 = (X.C37031oV) r1
            r2 = 0
            X.C18450wi.A0H(r1, r2)
            X.0sK r2 = r0.A00
            boolean r2 = r2.A0G()
            if (r2 == 0) goto L_0x0672
            X.0vJ r3 = r0.A02
            X.1ZX r2 = r1.A00
            X.1ZT r0 = r1.A01
            r3.A03(r2, r0)
            return
        L_0x0149:
            boolean r2 = r0 instanceof X.AnonymousClass19F
            if (r2 == 0) goto L_0x01b9
            X.19F r0 = (X.AnonymousClass19F) r0
            X.1on r1 = (X.C37211on) r1
            if (r22 == 0) goto L_0x015b
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0195
        L_0x015b:
            boolean r2 = r1.A01
            r6 = 0
            if (r2 == 0) goto L_0x05ca
            X.0rv r3 = r1.A00
            r2 = 2
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r2 = "archive"
            r5[r6] = r2
            java.lang.String r3 = r3.getRawString()
            r2 = 1
            r5[r2] = r3
            java.lang.String r10 = X.AnonymousClass1WJ.A00(r5)
            X.0zv r9 = r0.A00
            X.1WJ r3 = r9.A06(r10)
            if (r3 == 0) goto L_0x0199
            X.1Wl r2 = r3.A02()
            X.AnonymousClass00B.A06(r2)
            X.1ok r2 = r2.A04
            if (r2 != 0) goto L_0x0189
            X.1ok r2 = X.C37181ok.A03
        L_0x0189:
            boolean r2 = r2.A02
            if (r2 == 0) goto L_0x0199
            long r7 = r3.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0199
        L_0x0195:
            r0.A06(r1)
            return
        L_0x0199:
            X.1WJ r3 = r9.A05(r10)
            if (r3 == 0) goto L_0x05ca
            X.1Wl r2 = r3.A02()
            X.AnonymousClass00B.A06(r2)
            X.1ok r2 = r2.A04
            if (r2 != 0) goto L_0x01ac
            X.1ok r2 = X.C37181ok.A03
        L_0x01ac:
            boolean r2 = r2.A02
            if (r2 == 0) goto L_0x05ca
            long r7 = r3.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x05ca
            goto L_0x0195
        L_0x01b9:
            boolean r2 = r0 instanceof X.C217715j
            if (r2 == 0) goto L_0x01cf
            X.15j r0 = (X.C217715j) r0
            X.1og r1 = (X.C37141og) r1
            if (r22 == 0) goto L_0x05da
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x05da
            r0.A06(r1)
            return
        L_0x01cf:
            boolean r2 = r0 instanceof X.C33611ir
            if (r2 == 0) goto L_0x01e5
            X.1ir r0 = (X.C33611ir) r0
            X.1oe r1 = (X.C37121oe) r1
            if (r22 == 0) goto L_0x05f1
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x05f1
            r0.A06(r1)
            return
        L_0x01e5:
            boolean r2 = r0 instanceof X.C33651iv
            if (r2 == 0) goto L_0x0233
            X.1iv r0 = (X.C33651iv) r0
            X.1oT r1 = (X.C37011oT) r1
            X.1oT r4 = (X.C37011oT) r4
            if (r4 == 0) goto L_0x0613
            X.1o8 r9 = r1.A00
            X.1o8 r8 = r4.A00
            int r3 = X.C36801o8.A00(r9, r8)
            if (r3 == 0) goto L_0x060e
            r2 = 1
            if (r3 == r2) goto L_0x0617
            r2 = 2
            if (r3 == r2) goto L_0x0606
            r10 = 0
            X.0rv r12 = r4.A01
            long r5 = r1.A04
            long r2 = r4.A04
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x0230
            boolean r4 = r1.A02
        L_0x020e:
            long r14 = java.lang.Math.max(r5, r2)
            X.1o8 r11 = X.C36801o8.A01(r9, r8)
            r17 = 1
            X.1oT r9 = new X.1oT
            r13 = r10
            r16 = r4
            r9.<init>(r10, r11, r12, r13, r14, r16, r17)
            r0.A06(r1)
            X.0zv r2 = r0.A00
            java.util.Set r1 = java.util.Collections.singleton(r9)
            r2.A0F(r1)
            r0.A0B(r9)
            return
        L_0x0230:
            boolean r4 = r4.A02
            goto L_0x020e
        L_0x0233:
            boolean r2 = r0 instanceof X.AnonymousClass1WG
            if (r2 == 0) goto L_0x0321
            X.1WG r0 = (X.AnonymousClass1WG) r0
            X.1WI r1 = (X.AnonymousClass1WI) r1
            X.0sK r2 = r0.A00
            boolean r2 = r2.A0G()
            if (r2 == 0) goto L_0x027e
            X.013 r5 = r0.A02
            java.lang.String r4 = r1.A00
            X.1Bx r2 = r5.A09
            X.0sK r2 = r2.A00
            boolean r2 = r2.A0G()
            if (r2 != 0) goto L_0x027e
            java.util.Locale r6 = X.AnonymousClass1WH.A09(r4)
            java.lang.String r3 = r6.getLanguage()
            int r2 = r3.hashCode()
            switch(r2) {
                case 3365: goto L_0x02b3;
                case 3374: goto L_0x02be;
                case 3588: goto L_0x02c9;
                case 3886: goto L_0x02e4;
                case 101385: goto L_0x0314;
                default: goto L_0x0260;
            }
        L_0x0260:
            java.util.Set r2 = X.AnonymousClass28f.A04
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0282
            java.lang.String r2 = "OBWhatsAppLocale/saveLanguageFromPrimary language "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r4)
            java.lang.String r2 = " is not supported"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x027e:
            r0.A06(r1)
            return
        L_0x0282:
            X.0sm r2 = r5.A08
            r2.A01(r3)
            r2 = 1
            r5.A06 = r2
            java.util.Locale r4 = X.AnonymousClass1WH.A09(r3)
            r5.A04 = r4
            java.lang.String r2 = "OBWhatsAppLocale/saveLanguageFromPrimary setting language to "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r4.getDisplayLanguage(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.util.Locale r2 = r5.A04
            java.util.Locale.setDefault(r2)
            r5.A0Q()
            r5.A0N()
            goto L_0x027e
        L_0x02b3:
            java.lang.String r2 = "in"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0260
            java.lang.String r3 = "id"
            goto L_0x0260
        L_0x02be:
            java.lang.String r2 = "iw"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0260
            java.lang.String r3 = "he"
            goto L_0x0260
        L_0x02c9:
            java.lang.String r2 = "pt"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0260
            X.01i r3 = X.C33171i9.A00
            java.lang.String r2 = r6.getCountry()
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x02e0
            java.lang.String r3 = "pt-PT"
            goto L_0x0260
        L_0x02e0:
            java.lang.String r3 = "pt-BR"
            goto L_0x0260
        L_0x02e4:
            java.lang.String r2 = "zh"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0260
            java.lang.String r3 = r6.getCountry()
            java.lang.String r2 = "HK"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02fe
            java.lang.String r3 = "zh-HK"
            goto L_0x0260
        L_0x02fe:
            java.lang.String r3 = X.AnonymousClass1WH.A02(r6)
            java.lang.String r2 = "Hans"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x030f
            java.lang.String r3 = "zh-CN"
            goto L_0x0260
        L_0x030f:
            java.lang.String r3 = "zh-TW"
            goto L_0x0260
        L_0x0314:
            java.lang.String r2 = "fil"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0260
            java.lang.String r3 = "tl"
            goto L_0x0260
        L_0x0321:
            boolean r2 = r0 instanceof X.AnonymousClass1j1
            if (r2 == 0) goto L_0x0337
            X.1j1 r0 = (X.AnonymousClass1j1) r0
            X.1oL r1 = (X.C36931oL) r1
            if (r22 == 0) goto L_0x061b
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x061b
            r0.A06(r1)
            return
        L_0x0337:
            boolean r2 = r0 instanceof X.C33671ix
            if (r2 == 0) goto L_0x0365
            X.1ix r0 = (X.C33671ix) r0
            X.1oD r1 = (X.C36851oD) r1
            X.1oD r4 = (X.C36851oD) r4
            if (r4 == 0) goto L_0x034f
            boolean r2 = r1.A03
            if (r2 != 0) goto L_0x0649
            boolean r2 = r4.A03
            if (r2 == 0) goto L_0x0649
        L_0x034b:
            r0.A06(r1)
            return
        L_0x034f:
            X.0t6 r4 = r0.A01
            X.1Vw r3 = r1.A02
            X.0th r2 = r4.A0K
            X.0tZ r2 = r2.A03(r3)
            if (r2 == 0) goto L_0x064d
            boolean r3 = r1.A03
            java.util.Set r2 = java.util.Collections.singleton(r2)
            r4.A0m(r2, r3)
            goto L_0x034b
        L_0x0365:
            boolean r2 = r0 instanceof X.C33641iu
            if (r2 == 0) goto L_0x03b8
            X.1iu r0 = (X.C33641iu) r0
            X.1o9 r1 = (X.C36811o9) r1
            X.1o9 r4 = (X.C36811o9) r4
            X.1o8 r8 = r1.A00
            if (r4 == 0) goto L_0x03a3
            X.1o8 r7 = r4.A00
            int r3 = X.C36801o8.A00(r8, r7)
            if (r3 == 0) goto L_0x03b2
            r2 = 1
            if (r3 == r2) goto L_0x0651
            r2 = 2
            if (r3 == r2) goto L_0x03aa
            r9 = 0
            X.0rv r11 = r4.A01
            boolean r15 = r4.A02
            long r5 = r1.A04
            long r2 = r4.A04
            long r13 = java.lang.Math.max(r5, r2)
            r16 = 1
            X.1o8 r10 = X.C36801o8.A01(r8, r7)
            X.1o9 r8 = new X.1o9
            r12 = r9
            r8.<init>(r9, r10, r11, r12, r13, r15, r16)
            X.0zv r3 = r0.A00
            java.util.Set r2 = java.util.Collections.singleton(r8)
            r3.A0F(r2)
        L_0x03a3:
            r0.A07(r1)
            r0.A0A(r1)
            return
        L_0x03aa:
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0651
        L_0x03b2:
            X.0zv r2 = r0.A00
            r2.A0E(r4)
            goto L_0x03a3
        L_0x03b8:
            boolean r2 = r0 instanceof X.C33681iy
            if (r2 == 0) goto L_0x0411
            X.1iy r0 = (X.C33681iy) r0
            X.1op r1 = (X.C37231op) r1
            X.1op r4 = (X.C37231op) r4
            X.1o8 r10 = r1.A00
            if (r4 == 0) goto L_0x03fc
            X.1o8 r9 = r4.A00
            int r3 = X.C36801o8.A00(r10, r9)
            if (r3 == 0) goto L_0x040b
            r2 = 1
            if (r3 == r2) goto L_0x0655
            r2 = 2
            if (r3 == r2) goto L_0x0403
            r11 = 0
            X.0rv r13 = r4.A01
            boolean r8 = r4.A03
            boolean r7 = r4.A02
            long r5 = r1.A04
            long r2 = r4.A04
            long r15 = java.lang.Math.max(r5, r2)
            r19 = 1
            X.1o8 r12 = X.C36801o8.A01(r10, r9)
            X.1op r10 = new X.1op
            r14 = r11
            r18 = r7
            r17 = r8
            r10.<init>(r11, r12, r13, r14, r15, r17, r18, r19)
            X.0zv r3 = r0.A00
            java.util.Set r2 = java.util.Collections.singleton(r10)
            r3.A0F(r2)
        L_0x03fc:
            r0.A07(r1)
            r0.A0A(r1)
            return
        L_0x0403:
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0655
        L_0x040b:
            X.0zv r2 = r0.A00
            r2.A0E(r4)
            goto L_0x03fc
        L_0x0411:
            boolean r2 = r0 instanceof X.C33621is
            if (r2 == 0) goto L_0x066e
            X.1is r0 = (X.C33621is) r0
            X.1ol r1 = (X.C37191ol) r1
            X.1ol r4 = (X.C37191ol) r4
            if (r4 == 0) goto L_0x0666
            X.1o8 r9 = r1.A00
            X.1o8 r8 = r4.A00
            int r3 = X.C36801o8.A00(r9, r8)
            if (r3 == 0) goto L_0x0661
            r2 = 1
            if (r3 == r2) goto L_0x066a
            r2 = 2
            if (r3 == r2) goto L_0x0659
            long r5 = r1.A04
            long r2 = r4.A04
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x0479
            boolean r7 = r1.A02
        L_0x0437:
            r10 = 0
            X.0rv r12 = r4.A01
            long r14 = java.lang.Math.max(r5, r2)
            r17 = 1
            X.1o8 r11 = X.C36801o8.A01(r9, r8)
            X.1ol r9 = new X.1ol
            r13 = r10
            r16 = r7
            r9.<init>(r10, r11, r12, r13, r14, r16, r17)
            r0.A06(r1)
            X.0zv r2 = r0.A00
            java.util.Set r1 = java.util.Collections.singleton(r9)
            r2.A0F(r1)
            X.0rt r2 = r0.A07
            X.0rv r1 = r9.A01
            X.0rx r3 = r2.A06(r1)
            if (r3 == 0) goto L_0x0023
            java.lang.String r1 = "ArchiveChatHandler/handleMutation/setArchivedState - "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            boolean r1 = r9.A02
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r0.A0A(r3, r9)
            return
        L_0x0479:
            boolean r7 = r4.A02
            goto L_0x0437
        L_0x047c:
            boolean r5 = r1.A01
            X.0sf r3 = r0.A01
            com.whatsapp.jid.UserJid r2 = r1.A00
            if (r5 == 0) goto L_0x048b
            r3.A0U(r2)
        L_0x0487:
            r0.A08(r1, r4)
            return
        L_0x048b:
            r3.A0T(r2)
            goto L_0x0487
        L_0x048f:
            X.0tg r8 = r9.A02     // Catch:{ all -> 0x0507 }
            java.lang.String r5 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE mutation_name = ? AND are_dependencies_missing = ?"
            r2 = 2
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ all -> 0x0507 }
            r4[r7] = r3     // Catch:{ all -> 0x0507 }
            r3 = 1
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0507 }
            r4[r3] = r2     // Catch:{ all -> 0x0507 }
            android.database.Cursor r3 = r8.A08(r5, r4)     // Catch:{ all -> 0x0507 }
        L_0x04a3:
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x0500 }
            if (r2 == 0) goto L_0x04b3
            X.1WJ r2 = r10.A04(r3)     // Catch:{ all -> 0x0500 }
            if (r2 == 0) goto L_0x04a3
            r6.add(r2)     // Catch:{ all -> 0x0500 }
            goto L_0x04a3
        L_0x04b3:
            r3.close()     // Catch:{ all -> 0x0507 }
            r9.close()
            java.util.ListIterator r3 = r6.listIterator()
        L_0x04bd:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x04d1
            java.lang.Object r2 = r3.next()
            X.1ol r2 = (X.C37191ol) r2
            boolean r2 = r2.A02
            if (r2 != 0) goto L_0x04bd
            r3.remove()
            goto L_0x04bd
        L_0x04d1:
            java.util.Iterator r6 = r6.iterator()
        L_0x04d5:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0549
            java.lang.Object r5 = r6.next()
            X.1ol r5 = (X.C37191ol) r5
            X.19D r2 = r0.A01
            X.0rv r4 = r5.A01
            X.1o8 r3 = r2.A04(r4, r7)
            X.1o8 r2 = r5.A00
            int r3 = X.C36801o8.A00(r3, r2)
            if (r3 == 0) goto L_0x04f7
            r2 = 1
            if (r3 == r2) goto L_0x04d5
            r2 = 2
            if (r3 == r2) goto L_0x04d5
        L_0x04f7:
            java.lang.String r2 = "UnarchiveChatsSettingHandler/handleSettingOn/setArchivedState - false"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r0.A0B(r4, r7)
            goto L_0x04d5
        L_0x0500:
            r0 = move-exception
            if (r3 == 0) goto L_0x0506
            r3.close()     // Catch:{ all -> 0x0506 }
        L_0x0506:
            throw r0     // Catch:{ all -> 0x0507 }
        L_0x0507:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x050b }
        L_0x050b:
            throw r0
        L_0x050c:
            X.0zv r4 = r0.A00
            java.lang.String r3 = "archive"
            r2 = 0
            java.util.List r4 = r4.A09(r3, r2)
            java.util.ListIterator r3 = r4.listIterator()
        L_0x0519:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x052d
            java.lang.Object r2 = r3.next()
            X.1ol r2 = (X.C37191ol) r2
            boolean r2 = r2.A02
            if (r2 != 0) goto L_0x0519
            r3.remove()
            goto L_0x0519
        L_0x052d:
            java.util.Iterator r4 = r4.iterator()
        L_0x0531:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0549
            java.lang.Object r3 = r4.next()
            X.1ol r3 = (X.C37191ol) r3
            java.lang.String r2 = "UnarchiveChatsSettingHandler/handleSettingOff/setArchivedState - true"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0rv r3 = r3.A01
            r2 = 1
            r0.A0B(r3, r2)
            goto L_0x0531
        L_0x0549:
            r0.A06(r1)
            return
        L_0x054d:
            X.19E r2 = r0.A01
            X.139 r6 = r2.A01
            java.lang.String r5 = "cross_index_conflict_counter"
            r2 = 1
            r6.A06(r5, r2)
            goto L_0x0566
        L_0x0559:
            X.0t6 r2 = r0.A04
            X.0th r2 = r2.A0K
            X.0tZ r2 = r2.A03(r9)
            if (r2 == 0) goto L_0x056a
            r0.A0B(r1, r2)
        L_0x0566:
            r0.A08(r1, r4)
            return
        L_0x056a:
            r0.A07(r1)
            return
        L_0x056e:
            X.13k r3 = r0.A01
            java.lang.String r2 = r1.A01
            android.util.Pair r3 = r3.A0A(r2)
            if (r3 == 0) goto L_0x059c
            java.lang.Object r7 = r3.first
            X.1jm r7 = (X.C34151jm) r7
            java.lang.String r2 = r7.A0D
            if (r2 == 0) goto L_0x059c
            java.lang.Object r2 = r3.second
            java.lang.Number r2 = (java.lang.Number) r2
            long r5 = r2.longValue()
            long r3 = r1.A00
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0595
            r0.A0A(r7)
        L_0x0591:
            r0.A06(r1)
            return
        L_0x0595:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0591
            r0.A0A(r7)
        L_0x059c:
            r0.A07(r1)
            return
        L_0x05a0:
            java.lang.String r7 = r1.A00
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L_0x05c4
            X.0sK r2 = r0.A00
            r2.A0F(r7)
            X.0ug r6 = r0.A02
            r5 = 0
            r3 = 0
            r2 = 3
            android.os.Message r3 = android.os.Message.obtain(r5, r3, r2, r3, r7)
            X.0tK r2 = r6.A02
            boolean r2 = r2.A05
            if (r2 == 0) goto L_0x05c0
            r2 = 0
            r6.A09(r3, r2)
        L_0x05c0:
            r0.A08(r1, r4)
            return
        L_0x05c4:
            java.lang.String r2 = "PushNameSettingHandler/handleMutation/invalid: push name is empty."
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x05c0
        L_0x05ca:
            r0.A08(r1, r4)
            X.0zv r3 = r0.A06
            java.lang.String r2 = "pin_v1"
            r1 = 1
            java.util.List r1 = r3.A09(r2, r1)
            r0.A0A(r1)
            return
        L_0x05da:
            java.util.Set r2 = X.C37141og.A02
            java.lang.String r3 = r1.A00
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x05ed
            boolean r2 = r1.A01
            r0.A0A(r3, r2)
            r0.A08(r1, r4)
            return
        L_0x05ed:
            r0.A07(r1)
            return
        L_0x05f1:
            X.0rt r3 = r0.A01
            X.0rv r2 = r1.A01
            boolean r2 = r3.A0F(r2)
            if (r2 == 0) goto L_0x0602
            r0.A0A(r1)
            r0.A08(r1, r4)
            return
        L_0x0602:
            r0.A07(r1)
            return
        L_0x0606:
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0617
        L_0x060e:
            X.0zv r2 = r0.A00
            r2.A0E(r4)
        L_0x0613:
            r0.A0A(r1)
            return
        L_0x0617:
            r0.A06(r1)
            return
        L_0x061b:
            X.1oK r2 = r1.A01
            java.lang.String r3 = r2.A07
            boolean r2 = r1.A02
            if (r2 != 0) goto L_0x062a
            r0.A0C(r3)
        L_0x0626:
            r0.A08(r1, r4)
            return
        L_0x062a:
            X.1Go r2 = r0.A06
            X.1jm r2 = r2.A00(r3)
            if (r2 != 0) goto L_0x0626
            if (r22 == 0) goto L_0x0639
            X.0zv r2 = r0.A00
            r2.A0E(r4)
        L_0x0639:
            r0.A07(r1)
            X.0sq r4 = r0.A07
            r3 = 25
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r2 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r2.<init>(r0, r3, r1)
            r4.Acl(r2)
            return
        L_0x0649:
            r0.A08(r1, r4)
            return
        L_0x064d:
            r0.A07(r1)
            return
        L_0x0651:
            r0.A06(r1)
            return
        L_0x0655:
            r0.A06(r1)
            return
        L_0x0659:
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x066a
        L_0x0661:
            X.0zv r2 = r0.A00
            r2.A0E(r4)
        L_0x0666:
            r0.A0B(r1)
            return
        L_0x066a:
            r0.A06(r1)
            return
        L_0x066e:
            r0.A08(r1, r4)
            return
        L_0x0672:
            r0.A06(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20380zx.A09(X.1WJ, X.1WJ):void");
    }
}
