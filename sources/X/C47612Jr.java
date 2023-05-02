package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.Conversation;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.task.YTranslate;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.IOUtils;

/* renamed from: X.2Jr  reason: invalid class name and case insensitive filesystem */
public class C47612Jr {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = ((com.obwhatsapp.Conversation) r0).A00.A4A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass1ZQ A00(android.content.Context r0) {
        /*
            X.1yP r0 = X.AnonymousClass22O.A01(r0)
            if (r0 == 0) goto L_0x000f
            com.obwhatsapp.Conversation r0 = (com.obwhatsapp.Conversation) r0
            X.1yj r0 = r0.A00
            X.1ZQ r0 = r0.A4A
            if (r0 == 0) goto L_0x000f
            return r0
        L_0x000f:
            X.2Z9 r0 = new X.2Z9
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47612Jr.A00(android.content.Context):X.1ZQ");
    }

    public static String A01(Context context, AnonymousClass013 r8, C39021rn r9) {
        BigDecimal bigDecimal;
        String str = r9.A04;
        if (str == null || (bigDecimal = r9.A09) == null) {
            return null;
        }
        return context.getString(R.string.str03ba, new Object[]{new C39651sq(str).A03(r8, bigDecimal, true)});
    }

    public static String A02(AnonymousClass013 r6, C39021rn r7) {
        int i2 = r7.A00;
        long j2 = (long) i2;
        return r6.A0J(new Object[]{Integer.valueOf(i2)}, R.plurals.plurals016f, j2);
    }

    public static String A03(C16740tZ r2) {
        StringBuilder sb = new StringBuilder("date-transition-");
        sb.append(r2.A11);
        return sb.toString();
    }

    public static String A04(String str) {
        StringBuilder sb = new StringBuilder("thumb-transition-");
        sb.append(str);
        return sb.toString();
    }

    public static void A05(Context context, C14870pt r11, C16040sK r12, C16000sG r13, C16080sP r14, AnonymousClass01V r15, AnonymousClass013 r16, C19990zK r17, C17020u3 r18, Collection collection) {
        String A0I;
        StringBuilder sb;
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C16740tZ r2 = (C16740tZ) it.next();
            if (!r2.A0x() || r2.A0E().A00 == null) {
                byte b2 = r2.A10;
                if (b2 == 0 || b2 == 32 || b2 == 46) {
                    A0I = r2.A0I();
                } else {
                    A0I = null;
                    if (r2 instanceof C16840tj) {
                        C42101xE A01 = C42091xD.A01((C16840tj) r2);
                        if (A01 != null) {
                            if (A01 instanceof C42461xp) {
                                C16880tn r4 = A01.A00;
                                C42101xE.A00(r4.A07, IOUtils.LINE_SEPARATOR_UNIX, sb);
                                C42101xE.A00(r4.A08, IOUtils.LINE_SEPARATOR_UNIX, sb);
                            } else {
                                sb = new StringBuilder();
                                C42101xE.A00(A01.A03(), IOUtils.LINE_SEPARATOR_UNIX, sb);
                                C16880tn r1 = A01.A00;
                                C35201lX r0 = r1.A02;
                                C42101xE.A00(r0 != null ? r0.A00 : null, IOUtils.LINE_SEPARATOR_UNIX, sb);
                                C42101xE.A00(r1.A07, IOUtils.LINE_SEPARATOR_UNIX, sb);
                                C42101xE.A00(r1.A08, IOUtils.LINE_SEPARATOR_UNIX, sb);
                            }
                            A0I = sb.toString();
                        }
                    } else if (r2 instanceof C38891ra) {
                        A0I = ((C38891ra) r2).A1C();
                    } else if (r2 instanceof C38631rA) {
                        A0I = ((C38631rA) r2).A01;
                    } else if (r2 instanceof C16730tY) {
                        A0I = ((C16730tY) r2).A13();
                    } else if (r2 instanceof C30571cb) {
                        A0I = ((C30571cb) r2).A18();
                    }
                }
            } else {
                A0I = C42551xz.A02(r2.A0E().A00, r2.A0I());
            }
            if (!TextUtils.isEmpty(A0I)) {
                StringBuilder sb4 = new StringBuilder();
                if (sb2.length() != 0) {
                    sb4.append(10);
                }
                if (collection.size() > 1 && !yo.yo_hideinfo()) {
                    sb4.append('[');
                    sb4.append(DateUtils.formatDateTime(context, r2.A0I, 655377));
                    sb4.append("] ");
                    sb4.append(r2.A11.A02 ? r12.A07() : r14.A08(r13.A0A(r2.A0C())));
                    sb4.append(": ");
                }
                sb2.append(sb4);
                sb3.append(sb4);
                sb3.append(A0I);
                List list = r2.A0q;
                if (list != null) {
                    sb2.append(r17.A00(A0I, list));
                    hashSet.addAll(r2.A0q);
                } else {
                    sb2.append(A0I);
                }
            }
        }
        String obj = sb2.toString();
        SharedPreferences.Editor edit = r18.A00(AnonymousClass01S.A07).edit();
        if (!hashSet.isEmpty()) {
            edit.putString("copied_message", obj);
            edit.putString("copied_message_without_mentions", sb3.toString());
            edit.putString("copied_message_jids", C39501sa.A00(hashSet));
        } else {
            edit.remove("copied_message");
            edit.remove("copied_message_without_mentions");
            edit.remove("copied_message_jids");
        }
        edit.apply();
        try {
            r15.A0B().setPrimaryClip(ClipData.newPlainText(obj, obj));
            if (collection.size() == 1) {
                r11.A09(R.string.str0d33, 0);
            } else {
                r11.A0H(r16.A0J(new Object[]{Integer.valueOf(collection.size())}, R.plurals.plurals00d0, (long) collection.size()), 0);
            }
        } catch (NullPointerException | SecurityException e2) {
            Log.e("conversation/copymessage/npe", e2);
            r11.A09(R.string.str19d7, 0);
        }
    }

    public static boolean A06(C16040sK r4, C16000sG r5, C216114t r6, C14710pd r7, C17240ul r8, C16740tZ r9, C216014s r10) {
        C28381Vw r2 = r9.A11;
        if (!r2.A02) {
            C15830rv r22 = r2.A00;
            AnonymousClass00B.A06(r22);
            if (r10.A00(r22) != 1 && (!(r9 instanceof C30571cb) || !r7.A0E(C16620tM.A02, 2990))) {
                C16010sH A01 = r6.A01(r22);
                if (A01.A0J()) {
                    C15830rv A0B = r9.A0B();
                    if (A0B == null) {
                        return false;
                    }
                    C16010sH A0A = r5.A0A(A0B);
                    Class<C16050sL> cls = C16050sL.class;
                    UserJid A0D = r5.A0D((GroupJid) A01.A08(cls));
                    C16010sH A0A2 = A0D != null ? r5.A0A(A0D) : null;
                    r4.A0B();
                    AnonymousClass1ZT r42 = r4.A05;
                    AnonymousClass00B.A06(r42);
                    Jid A08 = A01.A08(cls);
                    AnonymousClass00B.A06(A08);
                    return r8.A0a.A0D((C16050sL) A08) || (A0A2 != null && (A0A2.A0D != null || r42.equals(A0A2.A0E))) || A0A.A0D != null || A0A.A06 == 3;
                } else if (A01.A0D == null && A01.A06 != 3) {
                    if (r22 == null) {
                        return false;
                    }
                    int type = r22.getType();
                    return type == 8 || type == 7;
                }
            }
        }
    }

    public static void my(Activity activity, C16000sG r11, C16080sP r12, Collection collection) {
        String A0I;
        StringBuilder sb;
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C16740tZ r2 = (C16740tZ) it.next();
            if (!r2.A0x() || r2.A0E().A00 == null) {
                byte b2 = r2.A10;
                if (b2 == 0 || b2 == 32 || b2 == 46) {
                    A0I = r2.A0I();
                } else {
                    A0I = null;
                    if (r2 instanceof C16840tj) {
                        C42101xE A01 = C42091xD.A01((C16840tj) r2);
                        if (A01 != null) {
                            if (A01 instanceof C42461xp) {
                                C16880tn r4 = A01.A00;
                                C42101xE.A00(r4.A07, IOUtils.LINE_SEPARATOR_UNIX, sb);
                                C42101xE.A00(r4.A08, IOUtils.LINE_SEPARATOR_UNIX, sb);
                            } else {
                                sb = new StringBuilder();
                                C42101xE.A00(A01.A03(), IOUtils.LINE_SEPARATOR_UNIX, sb);
                                C16880tn r1 = A01.A00;
                                C35201lX r0 = r1.A02;
                                C42101xE.A00(r0 != null ? r0.A00 : null, IOUtils.LINE_SEPARATOR_UNIX, sb);
                                C42101xE.A00(r1.A07, IOUtils.LINE_SEPARATOR_UNIX, sb);
                                C42101xE.A00(r1.A08, IOUtils.LINE_SEPARATOR_UNIX, sb);
                            }
                            A0I = sb.toString();
                        }
                    } else if (r2 instanceof C38891ra) {
                        A0I = ((C38891ra) r2).A1C();
                    } else if (r2 instanceof C38631rA) {
                        A0I = ((C38631rA) r2).A01;
                    } else if (r2 instanceof C16730tY) {
                        A0I = ((C16730tY) r2).A13();
                    } else if (r2 instanceof C30571cb) {
                        A0I = ((C30571cb) r2).A18();
                    }
                }
            } else {
                A0I = C42551xz.A02(r2.A0E().A00, r2.A0I());
            }
            if (!TextUtils.isEmpty(A0I)) {
                StringBuilder sb4 = new StringBuilder();
                if (sb2.length() != 0) {
                    sb4.append(10);
                }
                if (collection.size() > 1 && !yo.yo_hideinfo()) {
                    sb4.append('[');
                    sb4.append(DateUtils.formatDateTime(activity, r2.A0I, 655377));
                    sb4.append("] ");
                    sb4.append(r2.A11.A02 ? "" : r12.A08(r11.A0A(r2.A0C())));
                    sb4.append(": ");
                }
                sb2.append(sb4);
                sb3.append(sb4);
                sb3.append(A0I);
                if (r2.A0q != null) {
                    hashSet.addAll(r2.A0q);
                } else {
                    sb2.append(A0I);
                }
            }
        }
        String obj = sb2.toString();
        String str = AnonymousClass01S.A07;
        if (sb2 == null) {
        }
        try {
            YTranslate.translte(obj, activity);
            if (collection.size() != 1) {
                long size = (long) collection.size();
                new Object[1][0] = Integer.valueOf(collection.size());
            }
        } catch (NullPointerException | SecurityException e2) {
            Log.e("conversation/YOWA/TR", e2);
        }
    }

    public static void mysc(Activity activity, C16000sG r11, C16080sP r12, Collection collection) {
        String A0I;
        StringBuilder sb;
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C16740tZ r2 = (C16740tZ) it.next();
            if (!r2.A0x() || r2.A0E().A00 == null) {
                byte b2 = r2.A10;
                if (b2 == 0 || b2 == 32 || b2 == 46) {
                    A0I = r2.A0I();
                } else {
                    A0I = null;
                    if (r2 instanceof C16840tj) {
                        C42101xE A01 = C42091xD.A01((C16840tj) r2);
                        if (A01 != null) {
                            if (A01 instanceof C42461xp) {
                                C16880tn r4 = A01.A00;
                                C42101xE.A00(r4.A07, IOUtils.LINE_SEPARATOR_UNIX, sb);
                                C42101xE.A00(r4.A08, IOUtils.LINE_SEPARATOR_UNIX, sb);
                            } else {
                                sb = new StringBuilder();
                                C42101xE.A00(A01.A03(), IOUtils.LINE_SEPARATOR_UNIX, sb);
                                C16880tn r1 = A01.A00;
                                C35201lX r0 = r1.A02;
                                C42101xE.A00(r0 != null ? r0.A00 : null, IOUtils.LINE_SEPARATOR_UNIX, sb);
                                C42101xE.A00(r1.A07, IOUtils.LINE_SEPARATOR_UNIX, sb);
                                C42101xE.A00(r1.A08, IOUtils.LINE_SEPARATOR_UNIX, sb);
                            }
                            A0I = sb.toString();
                        }
                    } else if (r2 instanceof C38891ra) {
                        A0I = ((C38891ra) r2).A1C();
                    } else if (r2 instanceof C38631rA) {
                        A0I = ((C38631rA) r2).A01;
                    } else if (r2 instanceof C16730tY) {
                        A0I = ((C16730tY) r2).A13();
                    } else if (r2 instanceof C30571cb) {
                        A0I = ((C30571cb) r2).A18();
                    }
                }
            } else {
                A0I = C42551xz.A02(r2.A0E().A00, r2.A0I());
            }
            if (!TextUtils.isEmpty(A0I)) {
                StringBuilder sb4 = new StringBuilder();
                if (sb2.length() != 0) {
                    sb4.append(10);
                }
                if (collection.size() > 1 && !yo.yo_hideinfo()) {
                    sb4.append('[');
                    sb4.append(DateUtils.formatDateTime(activity, r2.A0I, 655377));
                    sb4.append("] ");
                    sb4.append(r2.A11.A02 ? "" : r12.A08(r11.A0A(r2.A0C())));
                    sb4.append(": ");
                }
                sb2.append(sb4);
                sb3.append(sb4);
                sb3.append(A0I);
                if (r2.A0q != null) {
                    hashSet.addAll(r2.A0q);
                } else {
                    sb2.append(A0I);
                }
            }
        }
        String obj = sb2.toString();
        String str = AnonymousClass01S.A07;
        if (sb2 == null) {
        }
        try {
            Conversation.copySelection(obj, activity);
            if (collection.size() != 1) {
                long size = (long) collection.size();
                new Object[1][0] = Integer.valueOf(collection.size());
            }
        } catch (NullPointerException | SecurityException e2) {
            Log.e("conversation/YOWA/SC", e2);
        }
    }
}
