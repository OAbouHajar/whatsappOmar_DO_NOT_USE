package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: X.1WJ  reason: invalid class name */
public abstract class AnonymousClass1WJ {
    public static final Set A08 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"regular", "regular_low", "regular_high", "critical_block", "critical_unblock_low"})));
    public static final Set A09 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"critical_block", "critical_unblock_low"})));
    public AnonymousClass1WK A00;
    public boolean A01;
    public byte[] A02;
    public final int A03;
    public final long A04;
    public final C28481Wg A05;
    public final String A06;
    public final String A07;

    public AnonymousClass1WJ(C28481Wg r1, AnonymousClass1WK r2, String str, String str2, int i2, long j2, boolean z2) {
        this.A04 = j2;
        this.A07 = str;
        this.A03 = i2;
        this.A00 = r2;
        this.A05 = r1;
        this.A06 = str2;
        this.A01 = z2;
    }

    public static String A00(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        for (String put : strArr) {
            jSONArray.put(put);
        }
        String obj = jSONArray.toString();
        AnonymousClass00B.A06(obj);
        return obj;
    }

    public C48232Mj A01() {
        C48232Mj r4 = (C48232Mj) C28531Wl.A0X.A0U();
        long j2 = this.A04;
        r4.A03();
        C28531Wl r1 = (C28531Wl) r4.A00;
        r1.A00 |= 1;
        r1.A01 = j2;
        return r4;
    }

    public C28531Wl A02() {
        C48232Mj A012;
        if ((this instanceof C28491Wh) || (A012 = A01()) == null) {
            return null;
        }
        return (C28531Wl) A012.A02();
    }

    public String A03() {
        String str;
        String str2;
        if (this instanceof C37161oi) {
            str = ((C37161oi) this).A01;
            str2 = "[\"removeRecentSticker\",\"";
        } else if (this instanceof C28491Wh) {
            return ((C28491Wh) this).A00;
        } else {
            if (!(this instanceof C36931oL)) {
                return A00(A07());
            }
            str = ((C36931oL) this).A01.A07;
            str2 = "[\"favoriteSticker\",\"";
        }
        StringBuilder sb = new StringBuilder(str2);
        sb.append(str);
        sb.append("\"]");
        return sb.toString();
    }

    public String A04() {
        return this instanceof C36971oP ? "userStatusMute" : this instanceof C36951oN ? "setting_unarchiveChats" : this instanceof C37061oY ? "time_format" : this instanceof C37101oc ? "star" : this instanceof C36901oI ? "sentinel" : this instanceof C37161oi ? "removeRecentSticker" : this instanceof C28491Wh ? ((C28491Wh) this).A01[0] : this instanceof C37081oa ? "setting_pushName" : this instanceof C37271ot ? "primary_version" : this instanceof C37251or ? "primary_feature" : this instanceof C37031oV ? "pnForLidChat" : this instanceof C37211on ? "pin_v1" : this instanceof C37141og ? "nux" : this instanceof C37121oe ? "mute" : this instanceof C37011oT ? "markChatAsRead" : this instanceof AnonymousClass1WI ? "setting_locale" : this instanceof C36931oL ? "favoriteSticker" : this instanceof C36851oD ? "deleteMessageForMe" : this instanceof C36811o9 ? "deleteChat" : this instanceof C36991oR ? "contact" : this instanceof C37231op ? "clearChat" : this instanceof C37191ol ? "archive" : "android_unsupported_actions";
    }

    public synchronized void A05(boolean z2) {
        this.A01 = z2;
    }

    public synchronized boolean A06() {
        return this.A01;
    }

    public String[] A07() {
        String[] strArr;
        char c2;
        String str;
        String[] strArr2;
        String rawString;
        String str2;
        char c3;
        String[] strArr3;
        C28381Vw r1;
        C15830rv r0;
        if (this instanceof C36971oP) {
            strArr2 = new String[2];
            strArr2[0] = "userStatusMute";
            rawString = ((C36971oP) this).A00.getRawString();
            C18450wi.A0B(rawString);
        } else {
            if (this instanceof C36951oN) {
                strArr = new String[1];
                c2 = 0;
                str = "setting_unarchiveChats";
            } else if (this instanceof C37061oY) {
                strArr = new String[1];
                c2 = 0;
                str = "time_format";
            } else {
                if (this instanceof C37101oc) {
                    C37101oc r2 = (C37101oc) this;
                    strArr3 = new String[]{"star"};
                    r1 = r2.A01;
                    r0 = r2.A00;
                } else if (this instanceof C36901oI) {
                    strArr2 = new String[2];
                    strArr2[0] = "sentinel";
                    rawString = this.A06;
                } else if (this instanceof C37161oi) {
                    strArr2 = new String[2];
                    strArr2[0] = "removeRecentSticker";
                    rawString = ((C37161oi) this).A01;
                } else if (this instanceof C28491Wh) {
                    return ((C28491Wh) this).A01;
                } else {
                    if (this instanceof C37081oa) {
                        strArr = new String[1];
                        c2 = 0;
                        str = "setting_pushName";
                    } else if (this instanceof C37271ot) {
                        strArr2 = new String[2];
                        strArr2[0] = "primary_version";
                        rawString = ((C37271ot) this).A01;
                    } else if (this instanceof C37251or) {
                        strArr = new String[1];
                        c2 = 0;
                        str = "primary_feature";
                    } else if (this instanceof C37031oV) {
                        strArr2 = new String[2];
                        strArr2[0] = "pnForLidChat";
                        rawString = ((C37031oV) this).A00.getRawString();
                        C18450wi.A0B(rawString);
                    } else if (this instanceof C37211on) {
                        C15830rv r22 = ((C37211on) this).A00;
                        strArr2 = new String[2];
                        strArr2[0] = "pin_v1";
                        rawString = r22.getRawString();
                    } else if (this instanceof C37141og) {
                        strArr2 = new String[2];
                        strArr2[0] = "nux";
                        rawString = ((C37141og) this).A00;
                    } else if (this instanceof C37121oe) {
                        strArr2 = new String[2];
                        strArr2[0] = "mute";
                        rawString = ((C37121oe) this).A01.getRawString();
                    } else if (this instanceof C37011oT) {
                        C15830rv r23 = ((C37011oT) this).A01;
                        strArr2 = new String[2];
                        strArr2[0] = "markChatAsRead";
                        rawString = r23.getRawString();
                    } else if (this instanceof AnonymousClass1WI) {
                        strArr = new String[1];
                        c2 = 0;
                        str = "setting_locale";
                    } else if (this instanceof C36931oL) {
                        strArr2 = new String[2];
                        strArr2[0] = "favoriteSticker";
                        rawString = ((C36931oL) this).A01.A07;
                    } else if (this instanceof C36851oD) {
                        C36851oD r24 = (C36851oD) this;
                        strArr3 = new String[]{"deleteMessageForMe"};
                        r1 = r24.A02;
                        r0 = r24.A01;
                    } else {
                        if (this instanceof C36811o9) {
                            C36811o9 r02 = (C36811o9) this;
                            C15830rv r3 = r02.A01;
                            boolean z2 = r02.A02;
                            strArr2 = new String[3];
                            strArr2[0] = "deleteChat";
                            strArr2[1] = r3.getRawString();
                            str2 = z2 ? "1" : "0";
                            c3 = 2;
                        } else if (this instanceof C36991oR) {
                            strArr2 = new String[2];
                            strArr2[0] = "contact";
                            rawString = ((C36991oR) this).A01.getRawString();
                        } else if (this instanceof C37231op) {
                            C37231op r03 = (C37231op) this;
                            C15830rv r4 = r03.A01;
                            boolean z3 = r03.A03;
                            boolean z4 = r03.A02;
                            strArr2 = new String[4];
                            strArr2[0] = "clearChat";
                            strArr2[1] = r4.getRawString();
                            strArr2[2] = z3 ? "1" : "0";
                            str2 = z4 ? "1" : "0";
                            c3 = 3;
                        } else if (this instanceof C37191ol) {
                            C15830rv r25 = ((C37191ol) this).A01;
                            strArr2 = new String[2];
                            strArr2[0] = "archive";
                            rawString = r25.getRawString();
                        } else {
                            strArr = new String[1];
                            c2 = 0;
                            str = "android_unsupported_actions";
                        }
                        strArr2[c3] = str2;
                        return strArr2;
                    }
                }
                return AnonymousClass1XA.A01(r0, r1, strArr3);
            }
            strArr[c2] = str;
            return strArr;
        }
        c3 = 1;
        strArr2[c3] = str2;
        return strArr2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass1WJ r5 = (AnonymousClass1WJ) obj;
            if (!Arrays.equals(A07(), r5.A07()) || !this.A05.equals(r5.A05)) {
                return false;
            }
            C28531Wl A022 = A02();
            byte[] A023 = A022 == null ? null : A022.A02();
            C28531Wl A024 = r5.A02();
            return Arrays.equals(A023, A024 == null ? null : A024.A02());
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(A07())), this.A05, A02()});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SyncMutation{rowId='");
        sb.append(this.A07);
        sb.append('\'');
        sb.append(", timestamp=");
        sb.append(this.A04);
        sb.append(", operation=");
        sb.append(this.A05);
        sb.append(", collectionName='");
        sb.append(this.A06);
        sb.append('\'');
        sb.append(", version=");
        sb.append(this.A03);
        sb.append(", keyId=");
        sb.append(this.A00);
        sb.append(", areDependenciesMissing=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }
}
