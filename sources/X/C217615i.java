package X;

import android.support.v4.view.GravityCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: X.15i  reason: invalid class name and case insensitive filesystem */
public class C217615i {
    public final C16040sK A00;
    public final C15900s5 A01;
    public final AnonymousClass11R A02;
    public final C14710pd A03;

    public C217615i(C16040sK r1, C15900s5 r2, AnonymousClass11R r3, C14710pd r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public AnonymousClass1WJ A00(C28501Wi r25, String str, boolean z2) {
        String obj;
        StringBuilder sb;
        String str2;
        C28531Wl r4;
        AnonymousClass1ZX r8;
        AnonymousClass1ZT r9;
        StringBuilder sb2;
        String str3;
        AnonymousClass1ZX r42;
        C28531Wl r5;
        StringBuilder sb3;
        String str4;
        String obj2;
        C28501Wi r1 = r25;
        String[] strArr = r1.A06;
        String str5 = strArr[0];
        String str6 = null;
        if (A02(str5)) {
            String str7 = str;
            boolean z3 = z2;
            switch (str5.hashCode()) {
                case -1751563479:
                    if (str5.equals("setting_locale")) {
                        C28481Wg r43 = r1.A01;
                        C28531Wl r52 = r1.A03;
                        if (strArr.length != 1 || !"setting_locale".equals(strArr[0]) || !C28481Wg.A03.equals(r43) || r52 == null || !r52.A0c() || (r52.A00 & 2048) != 2048) {
                            return null;
                        }
                        C37261os r0 = r52.A0E;
                        C37261os r3 = r0;
                        if (r0 == null) {
                            r0 = C37261os.A02;
                        }
                        if ((r0.A00 & 1) != 1) {
                            return null;
                        }
                        if (r3 == null) {
                            r3 = C37261os.A02;
                        }
                        return new AnonymousClass1WI(r1.A02, str7, r3.A01, r52.A01);
                    }
                    break;
                case -1727394375:
                    if (!str5.equals("primary_feature") || strArr.length != 1 || !"primary_feature".equals(strArr[0])) {
                        return null;
                    }
                    C28531Wl r32 = r1.A03;
                    if (!C28481Wg.A03.equals(r1.A01) || r32 == null || !r32.A0c() || (r32.A00 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) != 524288) {
                        return null;
                    }
                    C37241oq r02 = r32.A0K;
                    if (r02 == null) {
                        r02 = C37241oq.A01;
                    }
                    return new C37251or(r1.A02, str7, r02.A00, r32.A01);
                case -1271410875:
                    if (str5.equals("clearChat")) {
                        C28481Wg r10 = r1.A01;
                        C28531Wl r44 = r1.A03;
                        if (strArr.length == 4 && "clearChat".equals(strArr[0])) {
                            C15830rv A022 = C15830rv.A02(strArr[1]);
                            if (A022 == null) {
                                obj = "clear-chat-mutation/from-key-value unable to create chat jid";
                            } else {
                                int i2 = 2;
                                Boolean A002 = AnonymousClass1XA.A00(strArr[2]);
                                if (A002 != null) {
                                    i2 = 3;
                                    Boolean A003 = AnonymousClass1XA.A00(strArr[3]);
                                    if (A003 != null) {
                                        if (C28481Wg.A03.equals(r10) && r44 != null && r44.A0c() && (r44.A00 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
                                            C37221oo r33 = r44.A07;
                                            if (r33 == null) {
                                                r33 = C37221oo.A02;
                                            }
                                            boolean z4 = true;
                                            if ((r33.A00 & 1) != 1) {
                                                z4 = false;
                                            }
                                            C36791o7 r03 = r33.A01;
                                            if (r03 == null) {
                                                r03 = C36791o7.A04;
                                            }
                                            return new C37231op(r1.A02, C36801o8.A02(r03, z4), A022, str7, r44.A01, A002.booleanValue(), A003.booleanValue(), z3);
                                        }
                                    }
                                }
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("clear-chat-mutation/from-key-value value=");
                                sb4.append(strArr[i2]);
                                sb4.append(" at index=");
                                sb4.append(i2);
                                sb4.append(" is not one of the valid strings");
                                obj = sb4.toString();
                            }
                            Log.e(obj);
                        }
                        return null;
                    }
                    break;
                case -988160667:
                    if (str5.equals("pin_v1")) {
                        C28481Wg r53 = r1.A01;
                        C28531Wl r34 = r1.A03;
                        if (strArr.length == 2 && "pin_v1".equals(strArr[0])) {
                            C15830rv A023 = C15830rv.A02(strArr[1]);
                            if (A023 == null) {
                                StringBuilder sb5 = new StringBuilder("pin-chat-mutation/from-key-value unable to create chat jid from ");
                                sb5.append(strArr[1]);
                                Log.e(sb5.toString());
                            } else if (C28481Wg.A03.equals(r53) && r34 != null && r34.A0c() && (r34.A00 & 16) == 16) {
                                C37201om r04 = r34.A0I;
                                C37201om r2 = r04;
                                if (r04 == null) {
                                    r04 = C37201om.A02;
                                }
                                if ((r04.A00 & 1) == 1) {
                                    if (r2 == null) {
                                        r2 = C37201om.A02;
                                    }
                                    return new C37211on(r1.A02, A023, str7, r34.A01, r2.A01, z3);
                                }
                            }
                        }
                        return null;
                    }
                    break;
                case -748101438:
                    if (str5.equals("archive")) {
                        C28481Wg r45 = r1.A01;
                        C28531Wl r54 = r1.A03;
                        if (strArr.length == 2 && "archive".equals(strArr[0])) {
                            C15830rv A024 = C15830rv.A02(strArr[1]);
                            if (A024 == null) {
                                StringBuilder sb6 = new StringBuilder("archive-chat-mutation/from-key-value unable to create chat jid from ");
                                sb6.append(strArr[1]);
                                Log.e(sb6.toString());
                            } else if (C28481Wg.A03.equals(r45) && r54 != null && r54.A0c() && (r54.A00 & 4096) == 4096) {
                                C37181ok r05 = r54.A04;
                                C37181ok r46 = r05;
                                if (r05 == null) {
                                    r05 = C37181ok.A03;
                                }
                                if ((r05.A00 & 1) == 1) {
                                    if (r46 == null) {
                                        r46 = C37181ok.A03;
                                    }
                                    boolean z5 = false;
                                    if ((r46.A00 & 2) == 2) {
                                        z5 = true;
                                    }
                                    C36791o7 r06 = r46.A01;
                                    if (r06 == null) {
                                        r06 = C36791o7.A04;
                                    }
                                    return new C37191ol(r1.A02, C36801o8.A02(r06, z5), A024, str7, r54.A01, r46.A02, z3);
                                }
                            }
                        }
                        return null;
                    }
                    break;
                case -396578917:
                    if (str5.equals("primary_version") && strArr.length == 2 && "primary_version".equals(strArr[0])) {
                        String str8 = strArr[1];
                        if (C18450wi.A0R(str8, "current") || C18450wi.A0R(str8, "session_start")) {
                            C28481Wg r22 = r1.A01;
                            C18450wi.A0A(r22);
                            C28531Wl r35 = r1.A03;
                            if (C18450wi.A0R(C28481Wg.A03, r22) && r35 != null && r35.A0c() && (r35.A00 & 67108864) == 67108864) {
                                C37171oj r07 = r35.A0L;
                                C37171oj r47 = r07;
                                if (r07 == null) {
                                    r07 = C37171oj.A02;
                                }
                                if ((r07.A00 & 1) == 1) {
                                    long j2 = r35.A01;
                                    if (str8 == null) {
                                        C18450wi.A0N("ARRAY_ELEMENT");
                                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                                    }
                                    if (r47 == null) {
                                        r47 = C37171oj.A02;
                                    }
                                    String str9 = r47.A01;
                                    C18450wi.A0B(str9);
                                    return new C37271ot(r1.A02, str8, str9, str7, j2);
                                }
                            }
                        }
                    }
                    return null;
                case -266683330:
                    if (str5.equals("removeRecentSticker")) {
                        C28481Wg r55 = r1.A01;
                        C28531Wl r48 = r1.A03;
                        if (strArr.length == 2 && "removeRecentSticker".equals(strArr[0])) {
                            String str10 = strArr[1];
                            if (TextUtils.isEmpty(str10)) {
                                StringBuilder sb7 = new StringBuilder("remove-recent-sticker-mutation/from-key-value unable to create file hash from ");
                                sb7.append(strArr[1]);
                                Log.e(sb7.toString());
                            } else if (C28481Wg.A03.equals(r55) && r48 != null && r48.A0c() && (r48.A00 & 268435456) == 268435456) {
                                C37151oh r08 = r48.A0P;
                                C37151oh r23 = r08;
                                if (r08 == null) {
                                    r08 = C37151oh.A02;
                                }
                                if ((r08.A00 & 1) == 1) {
                                    long j3 = r48.A01;
                                    if (r23 == null) {
                                        r23 = C37151oh.A02;
                                    }
                                    return new C37161oi(r1.A02, str7, str10, j3, r23.A01, z3);
                                }
                            }
                        }
                        return null;
                    }
                    break;
                case 109457:
                    if (!str5.equals("nux") || strArr.length != 2 || !"nux".equals(strArr[0])) {
                        return null;
                    }
                    C28531Wl r56 = r1.A03;
                    if (!C28481Wg.A03.equals(r1.A01) || r56 == null || !r56.A0c()) {
                        return null;
                    }
                    boolean z6 = true;
                    String str11 = strArr[1];
                    if (str11 == null) {
                        return null;
                    }
                    if ((r56.A00 & 33554432) == 33554432) {
                        C37131of r09 = r56.A0H;
                        C37131of r24 = r09;
                        if (r09 == null) {
                            r09 = C37131of.A02;
                        }
                        if ((r09.A00 & 1) == 1) {
                            if (r24 == null) {
                                r24 = C37131of.A02;
                            }
                            z6 = r24.A01;
                        }
                    }
                    return new C37141og(r1.A02, str7, str11, r56.A01, z6);
                case 3363353:
                    if (str5.equals("mute")) {
                        C28481Wg r49 = r1.A01;
                        C28531Wl r92 = r1.A03;
                        if (strArr.length == 2 && "mute".equals(strArr[0])) {
                            C15830rv A025 = C15830rv.A02(strArr[1]);
                            if (A025 == null) {
                                StringBuilder sb8 = new StringBuilder("mute-chat-mutation/from-key-value unable to create chat jid from ");
                                sb8.append(strArr[1]);
                                Log.e(sb8.toString());
                            } else if (C28481Wg.A03.equals(r49) && r92 != null && r92.A0c() && (r92.A00 & 8) == 8) {
                                C37111od r010 = r92.A0G;
                                C37111od r26 = r010;
                                if (r010 == null) {
                                    r010 = C37111od.A04;
                                }
                                if ((r010.A00 & 1) == 1) {
                                    long j4 = 0;
                                    C37111od r011 = r26;
                                    if (r26 == null) {
                                        r011 = C37111od.A04;
                                    }
                                    if (r011.A03) {
                                        C37111od r012 = r26;
                                        if (r26 == null) {
                                            r012 = C37111od.A04;
                                        }
                                        if ((r012.A00 & 2) == 2) {
                                            C37111od r013 = r26;
                                            if (r26 == null) {
                                                r013 = C37111od.A04;
                                            }
                                            long j5 = r013.A01;
                                            if (j5 >= 0 || j5 == -1) {
                                                C37111od r014 = r26;
                                                if (r26 == null) {
                                                    r014 = C37111od.A04;
                                                }
                                                j4 = r014.A01;
                                            }
                                        }
                                    }
                                    if (r26 == null) {
                                        r26 = C37111od.A04;
                                    }
                                    return new C37121oe(r1.A02, A025, str7, j4, r92.A01, r26.A03, z3);
                                }
                            }
                        }
                        return null;
                    }
                    break;
                case 3540562:
                    if (str5.equals("star")) {
                        C28481Wg r7 = r1.A01;
                        C28531Wl r6 = r1.A03;
                        if (strArr.length == 5 && "star".equals(strArr[0])) {
                            C15830rv A026 = C15830rv.A02(strArr[1]);
                            if (A026 == null) {
                                sb = new StringBuilder("star-message-mutation/from-key-value unable to create chat jid from ");
                                str2 = strArr[1];
                            } else {
                                String str12 = strArr[3];
                                Boolean A004 = AnonymousClass1XA.A00(str12);
                                if (A004 == null) {
                                    sb = new StringBuilder("star-message-mutation/from-key-value value=");
                                    sb.append(str12);
                                    sb.append(" at index=");
                                    sb.append(3);
                                    str2 = " is not one of the valid strings";
                                } else if (C28481Wg.A03.equals(r7) && r6 != null && r6.A0c() && (r6.A00 & 2) == 2) {
                                    C37091ob r27 = r6.A0R;
                                    if (r27 == null) {
                                        r27 = C37091ob.A02;
                                    }
                                    if ((r27.A00 & 1) == 1) {
                                        C28381Vw r57 = new C28381Vw(A026, strArr[2], A004.booleanValue());
                                        C15830rv A027 = C15830rv.A02(strArr[4]);
                                        C37091ob r015 = r6.A0R;
                                        if (r015 == null) {
                                            r015 = C37091ob.A02;
                                        }
                                        return new C37101oc(r1.A02, A027, r57, str7, r6.A01, r015.A01, z3);
                                    }
                                }
                            }
                            sb.append(str2);
                            Log.e(sb.toString());
                        }
                        return null;
                    }
                    break;
                case 249675220:
                    if (str5.equals("setting_pushName")) {
                        C28481Wg r410 = r1.A01;
                        C28531Wl r58 = r1.A03;
                        if (strArr.length != 1 || !"setting_pushName".equals(strArr[0]) || !C28481Wg.A03.equals(r410) || r58 == null || !r58.A0c() || (r58.A00 & 64) != 64) {
                            return null;
                        }
                        C37071oZ r016 = r58.A0M;
                        C37071oZ r36 = r016;
                        if (r016 == null) {
                            r016 = C37071oZ.A02;
                        }
                        if ((r016.A00 & 1) != 1) {
                            return null;
                        }
                        if (r36 == null) {
                            r36 = C37071oZ.A02;
                        }
                        return new C37081oa(r1.A02, str7, r36.A01, r58.A01);
                    }
                    break;
                case 478826921:
                    if (str5.equals("time_format")) {
                        C28481Wg r411 = r1.A01;
                        C28531Wl r59 = r1.A03;
                        if (strArr.length != 1 || !"time_format".equals(strArr[0]) || !C28481Wg.A03.equals(r411) || r59 == null || !r59.A0c() || (r59.A00 & 16777216) != 16777216) {
                            return null;
                        }
                        C37051oX r017 = r59.A0U;
                        C37051oX r37 = r017;
                        if (r017 == null) {
                            r017 = C37051oX.A02;
                        }
                        if ((r017.A00 & 1) != 1) {
                            return null;
                        }
                        if (r37 == null) {
                            r37 = C37051oX.A02;
                        }
                        return new C37061oY(r1.A02, str7, r59.A01, r37.A01);
                    }
                    break;
                case 489413140:
                    if (!str5.equals("pnForLidChat") || (r4 = r1.A03) == null || !C18450wi.A0R(strArr[0], "pnForLidChat") || strArr.length != 2 || !C18450wi.A0R(r1.A01, C37031oV.A02) || (r4.A00 & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                        return null;
                    }
                    UserJid nullable = UserJid.getNullable(strArr[1]);
                    if (!(nullable instanceof AnonymousClass1ZX) || (r8 = (AnonymousClass1ZX) nullable) == null) {
                        return null;
                    }
                    C37041oW r018 = r4.A0J;
                    if (r018 == null) {
                        r018 = C37041oW.A02;
                    }
                    UserJid nullable2 = UserJid.getNullable(r018.A01);
                    if (!(nullable2 instanceof AnonymousClass1ZT) || (r9 = (AnonymousClass1ZT) nullable2) == null) {
                        return null;
                    }
                    return new C37031oV(r1.A02, r8, r9, str7, r4.A01);
                case 685217037:
                    if (str5.equals("markChatAsRead")) {
                        C28481Wg r412 = r1.A01;
                        C28531Wl r510 = r1.A03;
                        if (strArr.length == 2 && "markChatAsRead".equals(strArr[0])) {
                            C15830rv A028 = C15830rv.A02(strArr[1]);
                            if (A028 == null) {
                                Log.e("mark-chat-as-read-mutation/from-key-value unable to create chat jid");
                            } else if (C28481Wg.A03.equals(r412) && r510 != null && r510.A0c() && (r510.A00 & 32768) == 32768) {
                                C37001oS r019 = r510.A0F;
                                C37001oS r413 = r019;
                                if (r019 == null) {
                                    r019 = C37001oS.A03;
                                }
                                if ((r019.A00 & 1) == 1) {
                                    if (r413 == null) {
                                        r413 = C37001oS.A03;
                                    }
                                    boolean z7 = false;
                                    if ((r413.A00 & 2) == 2) {
                                        z7 = true;
                                    }
                                    C36791o7 r020 = r413.A01;
                                    if (r020 == null) {
                                        r020 = C36791o7.A04;
                                    }
                                    return new C37011oT(r1.A02, C36801o8.A02(r020, z7), A028, str7, r510.A01, r413.A02, z3);
                                }
                            }
                        }
                        return null;
                    }
                    break;
                case 951526432:
                    if (str5.equals("contact")) {
                        C28481Wg r72 = r1.A01;
                        C28531Wl r414 = r1.A03;
                        String str13 = null;
                        if (strArr.length == 2 && "contact".equals(strArr[0])) {
                            UserJid nullable3 = UserJid.getNullable(strArr[1]);
                            if (nullable3 == null) {
                                sb2 = new StringBuilder("contact-mutation/from-key-value unable to create user jid from ");
                                sb2.append(strArr[1]);
                            } else {
                                C28481Wg r62 = C28481Wg.A03;
                                if (!r62.equals(r72)) {
                                    C28481Wg r28 = C28481Wg.A02;
                                    if (r28.equals(r72)) {
                                        return new C36991oR(r28, r1.A02, (AnonymousClass1ZX) null, nullable3, str7, (String) null, (String) null, 0);
                                    }
                                    sb2 = new StringBuilder("contact-mutation/from-key-value unknown operation: ");
                                    sb2.append(r72);
                                } else if (r414 == null || !r414.A0c() || (r414.A00 & 4) != 4) {
                                    str3 = "contact-mutation/from-key-value syncActionValue is null, missing timestamp, or is missing contactAction";
                                    Log.e(str3);
                                } else {
                                    long j6 = r414.A01;
                                    C36981oQ r93 = r414.A08;
                                    if (r93 == null) {
                                        r93 = C36981oQ.A04;
                                    }
                                    int i3 = r93.A00;
                                    if ((i3 & 1) == 1) {
                                        String str14 = r93.A02;
                                        if ((i3 & 2) == 2) {
                                            str13 = r93.A01;
                                        }
                                        if ((i3 & 4) == 4) {
                                            UserJid nullable4 = UserJid.getNullable(r93.A03);
                                            if (nullable4 instanceof AnonymousClass1ZX) {
                                                r42 = (AnonymousClass1ZX) nullable4;
                                                return new C36991oR(r62, r1.A02, r42, nullable3, str7, str13, str14, j6);
                                            }
                                        }
                                        r42 = null;
                                        return new C36991oR(r62, r1.A02, r42, nullable3, str7, str13, str14, j6);
                                    }
                                    str3 = "contact-mutation/from-key-value fullName was not in contactAction protobuf";
                                    Log.e(str3);
                                }
                            }
                            str3 = sb2.toString();
                            Log.e(str3);
                        }
                        return null;
                    }
                    break;
                case 1002312534:
                    if (!str5.equals("userStatusMute") || strArr.length != 2 || !"userStatusMute".equals(strArr[0]) || (r5 = r1.A03) == null || !C18450wi.A0R(C28481Wg.A03, r1.A01) || !r5.A0c() || (r5.A00 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 8388608) {
                        return null;
                    }
                    C36961oO r29 = r5.A0W;
                    C36961oO r415 = r29;
                    if (r29 == null) {
                        r29 = C36961oO.A02;
                    }
                    if ((r29.A00 & 1) != 1) {
                        return null;
                    }
                    if (r415 == null) {
                        r415 = C36961oO.A02;
                    }
                    boolean z8 = r415.A01;
                    UserJid nullable5 = UserJid.getNullable(strArr[1]);
                    if (nullable5 == null) {
                        return null;
                    }
                    return new C36971oP(r1.A02, nullable5, str7, r5.A01, z8, z3);
                case 1084168033:
                    if (str5.equals("setting_unarchiveChats")) {
                        C28481Wg r511 = r1.A01;
                        C28531Wl r416 = r1.A03;
                        if (strArr.length != 1 || !"setting_unarchiveChats".equals(strArr[0]) || !C28481Wg.A03.equals(r511) || r416 == null || !r416.A0c() || (r416.A00 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) != 262144) {
                            return null;
                        }
                        long j7 = r416.A01;
                        AnonymousClass1WK r94 = r1.A02;
                        C36941oM r021 = r416.A0V;
                        if (r021 == null) {
                            r021 = C36941oM.A02;
                        }
                        return new C36951oN(r94, str7, j7, r021.A01);
                    }
                    break;
                case 1178537985:
                    if (str5.equals("favoriteSticker")) {
                        C28481Wg r63 = r1.A01;
                        C28531Wl r417 = r1.A03;
                        String str15 = null;
                        if (strArr.length == 2 && "favoriteSticker".equals(strArr[0])) {
                            String str16 = strArr[1];
                            if (TextUtils.isEmpty(str16)) {
                                StringBuilder sb9 = new StringBuilder("favorite-sticker-mutation/from-key-value unable to create file hash from ");
                                sb9.append(strArr[1]);
                                Log.e(sb9.toString());
                            } else if (C28481Wg.A03.equals(r63) && r417 != null && r417.A0c() && (r417.A00 & 134217728) == 134217728) {
                                C36911oJ r022 = r417.A0S;
                                C36911oJ r64 = r022;
                                if (r022 == null) {
                                    r022 = C36911oJ.A0B;
                                }
                                if ((r022.A00 & 256) == 256) {
                                    C36911oJ r023 = r64;
                                    if (r64 == null) {
                                        r023 = C36911oJ.A0B;
                                    }
                                    int i4 = r023.A00 & 512;
                                    int i5 = -1;
                                    if (i4 == 512) {
                                        C36911oJ r024 = r64;
                                        if (r64 == null) {
                                            r024 = C36911oJ.A0B;
                                        }
                                        i5 = r024.A01;
                                    }
                                    if (r64 == null) {
                                        r64 = C36911oJ.A0B;
                                    }
                                    String encodeToString = (r64.A00 & 2) == 2 ? Base64.encodeToString(r64.A05.A04(), 2) : null;
                                    String encodeToString2 = (r64.A00 & 4) == 4 ? Base64.encodeToString(r64.A06.A04(), 1) : null;
                                    int i6 = r64.A00;
                                    String str17 = (i6 & 1) == 1 ? r64.A09 : null;
                                    if ((i6 & 8) == 8) {
                                        str6 = r64.A08;
                                    }
                                    int i7 = (i6 & 32) == 32 ? r64.A03 : 0;
                                    int i8 = (i6 & 16) == 16 ? r64.A02 : 0;
                                    if ((i6 & 64) == 64) {
                                        str15 = r64.A07;
                                    }
                                    C36921oK r73 = new C36921oK(str16, str17, encodeToString, encodeToString2, str6, str15, i7, i8, (i6 & 128) == 128 ? r64.A04 : 0);
                                    long j8 = r417.A01;
                                    AnonymousClass1WK r512 = r1.A02;
                                    C36911oJ r12 = r417.A0S;
                                    if (r12 == null) {
                                        r12 = C36911oJ.A0B;
                                    }
                                    return new C36931oL(r73, r512, str7, i5, j8, r12.A0A, z3);
                                }
                            }
                        }
                        return null;
                    }
                    break;
                case 1262856228:
                    if (str5.equals("sentinel")) {
                        C28481Wg r65 = r1.A01;
                        C28531Wl r418 = r1.A03;
                        if (strArr.length == 2 && "sentinel".equals(strArr[0])) {
                            String str18 = strArr[1];
                            if (!AnonymousClass1WJ.A08.contains(str18)) {
                                StringBuilder sb10 = new StringBuilder("sentinel-mutation/from-key-value unknown collectionName: ");
                                sb10.append(str18);
                                Log.e(sb10.toString());
                            } else if (C28481Wg.A03.equals(r65) && r418 != null && r418.A0c() && (r418.A00 & 16384) == 16384) {
                                C36891oH r025 = r418.A0B;
                                C36891oH r210 = r025;
                                if (r025 == null) {
                                    r025 = C36891oH.A02;
                                }
                                if ((r025.A00 & 1) == 1) {
                                    long j9 = r418.A01;
                                    if (r210 == null) {
                                        r210 = C36891oH.A02;
                                    }
                                    return new C36901oI(r1.A02, str7, str18, r210.A01, j9, z3);
                                }
                            }
                        }
                        return null;
                    }
                    break;
                case 1693532963:
                    if (str5.equals("android_unsupported_actions")) {
                        C28481Wg r513 = r1.A01;
                        C28531Wl r38 = r1.A03;
                        if (strArr.length != 1 || !"android_unsupported_actions".equals(strArr[0]) || !C28481Wg.A03.equals(r513) || r38 == null || !r38.A0c() || (r38.A00 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) != 1048576) {
                            return null;
                        }
                        C36871oF r026 = r38.A03;
                        if (r026 == null) {
                            r026 = C36871oF.A02;
                        }
                        if ((r026.A00 & 1) != 1) {
                            return null;
                        }
                        return new C36881oG(r1.A02, str7, r38.A01, z3);
                    }
                    break;
                case 1728918981:
                    if (str5.equals("deleteMessageForMe")) {
                        C28481Wg r419 = r1.A01;
                        C28531Wl r514 = r1.A03;
                        if (strArr.length == 5 && "deleteMessageForMe".equals(strArr[0])) {
                            C15830rv A029 = C15830rv.A02(strArr[1]);
                            if (A029 == null) {
                                sb3 = new StringBuilder("delete-message-for-me-mutation/from-key-value unable to create chat jid from ");
                                str4 = strArr[1];
                            } else {
                                String str19 = strArr[3];
                                Boolean A005 = AnonymousClass1XA.A00(str19);
                                if (A005 == null) {
                                    sb3 = new StringBuilder("delete-message-for-me-mutation/from-key-value value=");
                                    sb3.append(str19);
                                    sb3.append(" at index=");
                                    sb3.append(3);
                                    str4 = " is not one of the valid strings";
                                } else if (C28481Wg.A03.equals(r419) && r514 != null && r514.A0c() && (r514.A00 & 8192) == 8192) {
                                    C36841oC r211 = r514.A0A;
                                    C36841oC r420 = r211;
                                    if (r211 == null) {
                                        r211 = C36841oC.A03;
                                    }
                                    if ((r211.A00 & 1) == 1) {
                                        if (r420 == null) {
                                            r420 = C36841oC.A03;
                                        }
                                        if ((r420.A00 & 2) == 2) {
                                            C28381Vw r74 = new C28381Vw(A029, strArr[2], A005.booleanValue());
                                            C15830rv A0210 = C15830rv.A02(strArr[4]);
                                            C36841oC r027 = r514.A0A;
                                            C36841oC r421 = r027;
                                            if (r027 == null) {
                                                r027 = C36841oC.A03;
                                            }
                                            boolean z9 = r027.A02;
                                            long j10 = r514.A01;
                                            TimeUnit timeUnit = TimeUnit.SECONDS;
                                            if (r421 == null) {
                                                r421 = C36841oC.A03;
                                            }
                                            return new C36851oD(r1.A02, A0210, r74, str7, j10, timeUnit.toMillis(r421.A01), z9, z3);
                                        }
                                    }
                                }
                            }
                            sb3.append(str4);
                            Log.e(sb3.toString());
                        }
                        return null;
                    }
                    break;
                case 1764081571:
                    if (str5.equals("deleteChat")) {
                        C28481Wg r66 = r1.A01;
                        C28531Wl r422 = r1.A03;
                        if (strArr.length == 3 && "deleteChat".equals(strArr[0])) {
                            C15830rv A0211 = C15830rv.A02(strArr[1]);
                            if (A0211 == null) {
                                obj2 = "delete-chat-mutation/from-key-value unable to create chat jid";
                            } else {
                                String str20 = strArr[2];
                                Boolean A006 = AnonymousClass1XA.A00(str20);
                                if (A006 == null) {
                                    StringBuilder sb11 = new StringBuilder("delete-chat-mutation/from-key-value value=");
                                    sb11.append(str20);
                                    sb11.append(" at index=");
                                    sb11.append(2);
                                    sb11.append(" is not one of the valid strings");
                                    obj2 = sb11.toString();
                                } else if (C28481Wg.A03.equals(r66) && r422 != null && r422.A0c() && (r422.A00 & 131072) == 131072) {
                                    C36781o6 r39 = r422.A09;
                                    if (r39 == null) {
                                        r39 = C36781o6.A02;
                                    }
                                    boolean z10 = true;
                                    if ((r39.A00 & 1) != 1) {
                                        z10 = false;
                                    }
                                    C36791o7 r028 = r39.A01;
                                    if (r028 == null) {
                                        r028 = C36791o7.A04;
                                    }
                                    return new C36811o9(r1.A02, C36801o8.A02(r028, z10), A0211, str7, r422.A01, A006.booleanValue(), z3);
                                }
                            }
                            Log.e(obj2);
                        }
                        return null;
                    }
                    break;
            }
        }
        return null;
    }

    public final AnonymousClass1WJ A01(AnonymousClass1WK r8, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, boolean z2) {
        try {
            C28481Wg r1 = C28481Wg.A03;
            if (!Arrays.equals(r1.A01, bArr2)) {
                r1 = C28481Wg.A02;
                if (!Arrays.equals(r1.A01, bArr2)) {
                    StringBuilder sb = new StringBuilder("Incorrect operation bytes: ");
                    sb.append(new String(bArr2));
                    throw new IllegalStateException(sb.toString());
                }
            }
            C28501Wi r0 = new C28501Wi(r1, r8, str2, bArr, bArr3, i2);
            AnonymousClass1WJ A002 = A00(r0, str, z2);
            if (A002 == null) {
                return A002;
            }
            A002.A02 = r0.A05;
            return A002;
        } catch (C29791bD | C36771o5 | IllegalArgumentException | JSONException e2) {
            Log.e("sync-mutation/from-key-value couldn't create sync action data", e2);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        return r2.A0E(X.C16620tM.A02, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        if (r6.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a3, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d5, code lost:
        if (r6.equals(r0) == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d7, code lost:
        r1 = r5.A01;
        r0 = X.C15910s6.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00df, code lost:
        return r1.A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r4 = 2
            r3 = 1
            r2 = 0
            switch(r0) {
                case -1751563479: goto L_0x000b;
                case -1727394375: goto L_0x0010;
                case -1271410875: goto L_0x0014;
                case -988160667: goto L_0x0018;
                case -748101438: goto L_0x0026;
                case -396578917: goto L_0x0029;
                case -266683330: goto L_0x00a4;
                case 109457: goto L_0x0036;
                case 3363353: goto L_0x0043;
                case 3540562: goto L_0x0046;
                case 249675220: goto L_0x004a;
                case 478826921: goto L_0x004e;
                case 489413140: goto L_0x005c;
                case 685217037: goto L_0x005f;
                case 951526432: goto L_0x0062;
                case 1002312534: goto L_0x0065;
                case 1084168033: goto L_0x0073;
                case 1178537985: goto L_0x0077;
                case 1262856228: goto L_0x008a;
                case 1693532963: goto L_0x008e;
                case 1728918981: goto L_0x009b;
                case 1764081571: goto L_0x00cf;
                default: goto L_0x000a;
            }
        L_0x000a:
            return r2
        L_0x000b:
            java.lang.String r0 = "setting_locale"
            goto L_0x009d
        L_0x0010:
            java.lang.String r0 = "primary_feature"
            goto L_0x009d
        L_0x0014:
            java.lang.String r0 = "clearChat"
            goto L_0x00d1
        L_0x0018:
            java.lang.String r0 = "pin_v1"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0s5 r1 = r5.A01
            X.0s8 r0 = X.C15910s6.A0a
            goto L_0x00db
        L_0x0026:
            java.lang.String r0 = "archive"
            goto L_0x009d
        L_0x0029:
            java.lang.String r0 = "primary_version"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0pd r2 = r5.A03
            r1 = 1993(0x7c9, float:2.793E-42)
            goto L_0x0083
        L_0x0036:
            java.lang.String r0 = "nux"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0pd r2 = r5.A03
            r1 = 1343(0x53f, float:1.882E-42)
            goto L_0x0083
        L_0x0043:
            java.lang.String r0 = "mute"
            goto L_0x009d
        L_0x0046:
            java.lang.String r0 = "star"
            goto L_0x009d
        L_0x004a:
            java.lang.String r0 = "setting_pushName"
            goto L_0x009d
        L_0x004e:
            java.lang.String r0 = "time_format"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0pd r2 = r5.A03
            r1 = 1612(0x64c, float:2.259E-42)
            goto L_0x0083
        L_0x005c:
            java.lang.String r0 = "pnForLidChat"
            goto L_0x009d
        L_0x005f:
            java.lang.String r0 = "markChatAsRead"
            goto L_0x009d
        L_0x0062:
            java.lang.String r0 = "contact"
            goto L_0x009d
        L_0x0065:
            java.lang.String r0 = "userStatusMute"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0pd r2 = r5.A03
            r1 = 2070(0x816, float:2.9E-42)
            goto L_0x0083
        L_0x0073:
            java.lang.String r0 = "setting_unarchiveChats"
            goto L_0x009d
        L_0x0077:
            java.lang.String r0 = "favoriteSticker"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0pd r2 = r5.A03
            r1 = 2775(0xad7, float:3.889E-42)
        L_0x0083:
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            return r0
        L_0x008a:
            java.lang.String r0 = "sentinel"
            goto L_0x009d
        L_0x008e:
            java.lang.String r0 = "android_unsupported_actions"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0s5 r1 = r5.A01
            X.0s8 r0 = X.C15910s6.A0W
            goto L_0x00db
        L_0x009b:
            java.lang.String r0 = "deleteMessageForMe"
        L_0x009d:
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x00c0
            return r2
        L_0x00a4:
            java.lang.String r0 = "removeRecentSticker"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0sK r0 = r5.A00
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x00c1
            X.11R r0 = r5.A02
            android.content.SharedPreferences r1 = r0.A00()
            java.lang.String r0 = "recent_sticker_feature_flag"
            boolean r3 = r1.getBoolean(r0, r2)
        L_0x00c0:
            return r3
        L_0x00c1:
            X.0pd r2 = r5.A03
            r1 = 1829(0x725, float:2.563E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            if (r0 >= r4) goto L_0x00c0
            r3 = 0
            return r3
        L_0x00cf:
            java.lang.String r0 = "deleteChat"
        L_0x00d1:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0s5 r1 = r5.A01
            X.0s8 r0 = X.C15910s6.A0X
        L_0x00db:
            boolean r0 = r1.A05(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217615i.A02(java.lang.String):boolean");
    }
}
