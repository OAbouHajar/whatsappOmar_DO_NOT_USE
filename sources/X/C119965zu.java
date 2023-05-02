package X;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxEListenerShape47S0300000_3_I0;
import com.facebook.redex.IDxObserverShape117S0100000_3_I0;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.wabloks.ui.BkActionBottomSheet;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;
import com.obwhatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment;
import com.obwhatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.UUID;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5zu  reason: invalid class name and case insensitive filesystem */
public abstract class C119965zu implements AnonymousClass1K5 {
    public Set A00;
    public final C116925sA A01;
    public final AnonymousClass01D A02;
    public final AnonymousClass01D A03;
    public final AnonymousClass01D A04;
    public final AnonymousClass01D A05;
    public final AnonymousClass01D A06;
    public final AnonymousClass01D A07;
    public final AnonymousClass01D A08;
    public final AnonymousClass01D A09;
    public final AnonymousClass01D A0A;
    public final AnonymousClass01D A0B;
    public final AnonymousClass01D A0C;
    public final AnonymousClass01D A0D;
    public final AnonymousClass01D A0E;
    public final AnonymousClass01D A0F;
    public final AnonymousClass01D A0G;
    public final AnonymousClass01D A0H;
    public final AnonymousClass01D A0I;
    public final AnonymousClass01D A0J;
    public final AnonymousClass01D A0K;
    public final AnonymousClass01D A0L;
    public final AnonymousClass01D A0M;
    public final AnonymousClass01D A0N;
    public final AnonymousClass01D A0O;
    public final AnonymousClass01D A0P;
    public final AnonymousClass01D A0Q;
    public final AnonymousClass01D A0R;
    public final AnonymousClass01D A0S;
    public final AnonymousClass01D A0T;

    public C119965zu(AnonymousClass01D r3, AnonymousClass01D r4, AnonymousClass01D r5, AnonymousClass01D r6, AnonymousClass01D r7, AnonymousClass01D r8, AnonymousClass01D r9, AnonymousClass01D r10, AnonymousClass01D r11, AnonymousClass01D r12, AnonymousClass01D r13, AnonymousClass01D r14, AnonymousClass01D r15, AnonymousClass01D r16, AnonymousClass01D r17, AnonymousClass01D r18, AnonymousClass01D r19, AnonymousClass01D r20, AnonymousClass01D r21, AnonymousClass01D r22, AnonymousClass01D r23, AnonymousClass01D r24, AnonymousClass01D r25, AnonymousClass01D r26, AnonymousClass01D r27, AnonymousClass01D r28, AnonymousClass01D r29, AnonymousClass01D r30, AnonymousClass01D r31, AnonymousClass01D r32) {
        this.A01 = new C116925sA(r4, r27);
        this.A0N = r3;
        this.A02 = r5;
        this.A08 = r6;
        this.A0H = r7;
        this.A0F = r8;
        this.A0I = r9;
        this.A0S = r10;
        this.A03 = r11;
        this.A0T = r12;
        this.A09 = r13;
        this.A0L = r14;
        this.A0P = r15;
        this.A0K = r16;
        this.A0C = r17;
        this.A0M = r18;
        this.A0J = r19;
        this.A04 = r20;
        this.A0D = r21;
        this.A0E = r22;
        this.A0Q = r23;
        this.A05 = r24;
        this.A0B = r25;
        this.A0O = r26;
        this.A0A = r28;
        this.A07 = r29;
        this.A06 = r30;
        this.A0R = r31;
        this.A0G = r32;
    }

    public static int A00(AnonymousClass01D r0, int i2) {
        return ((C118005tu) r0.get()).A00.A00(i2).A01;
    }

    public static int A01(AnonymousClass01D r0, int i2) {
        return ((C117585tE) r0.get()).A06.A00(i2).A00;
    }

    public static int A02(AnonymousClass01D r3, int i2, int i3) {
        r3.get();
        int intValue = Integer.valueOf(i2).intValue();
        int i4 = 0;
        for (int i5 = 0; i5 < 32; i5++) {
            i4 |= ((intValue >> i5) & 1) << (31 - i5);
        }
        return i3 ^ i4;
    }

    public static long A03(AnonymousClass01D r2, int i2, int i3) {
        r2.get();
        return ((long) i3) | (((long) i2) << 32);
    }

    public static C117585tE A04(AnonymousClass01D r0) {
        return (C117585tE) r0.get();
    }

    public static final String A05(HashMap hashMap) {
        ArrayList A0n = C13680ns.A0n(hashMap.keySet());
        try {
            JSONObject A0J2 = C13700nu.A0J();
            Collections.sort(A0n);
            for (int i2 = 0; i2 < A0n.size(); i2++) {
                A0J2.put((String) A0n.get(i2), hashMap.get(A0n.get(i2)));
            }
            return A0J2.toString();
        } catch (JSONException e2) {
            Log.e("Failed to Convert Map to JSON object.", e2);
            return null;
        }
    }

    public static final void A06(Activity activity, String str) {
        Intent A092 = C13680ns.A09();
        A092.setAction("android.intent.action.SEND");
        A092.putExtra("android.intent.extra.TEXT", str);
        A092.setType("text/plain");
        activity.startActivity(Intent.createChooser(A092, (CharSequence) null));
    }

    public final UserJid A07(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return UserJid.get(str);
            } catch (AnonymousClass1W4 e2) {
                AnonymousClass1ZT A032 = AnonymousClass1ZT.A03(str);
                ((C16300so) this.A0F.get()).AcB("bloks/openchat - Jid missing suffix", e2.getMessage(), true);
                return A032;
            }
        } else {
            throw new AnonymousClass1W4("Jid is Empty");
        }
    }

    public void A5A(C29671b0 r9, C29671b0 r10, Object obj, String str, HashMap hashMap) {
        AnonymousClass1KG r1 = (AnonymousClass1KG) this.A05.get();
        r1.A01.A03((C35001lD) null, new AnonymousClass632(r10, r9, r1, obj), (Boolean) null, str, C110115dX.A0g("params", hashMap), (String) null, true);
    }

    public void A5B(C29671b0 r3, C29671b0 r4, Object obj, String str, HashMap hashMap) {
        hashMap.put("nest_data_manifest", "true");
        A5A(r3, r4, obj, str, hashMap);
    }

    public void A5C(C29671b0 r10, C29671b0 r11, Object obj, String str, String str2, String str3, String str4) {
        C117145sW r2 = (C117145sW) this.A06.get();
        String str5 = str;
        if (TextUtils.isEmpty(str)) {
            AnonymousClass00B.A08("null app id");
            r2.A00.Acq(new RunnableRunnableShape3S0200000_I0_1(obj, 31, r11.A9V()));
            return;
        }
        Iterator it = r2.A02.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass000.A0W("handleAsyncActionWithDataManifestV2Action");
        }
        AnonymousClass1KG r0 = (AnonymousClass1KG) r2.A01.get();
        r0.A01.A03((C35001lD) null, new AnonymousClass632(r11, r10, r0, obj), (Boolean) null, str5, str2, (String) null, true);
    }

    public void A7t(HashMap hashMap) {
        String A052 = A05(hashMap);
        if (!TextUtils.isEmpty(A052)) {
            ((AnonymousClass1IQ) this.A0A.get()).A01.remove(A052);
        }
    }

    public void A82(Activity activity, C29671b0 r4) {
        ((AnonymousClass5wN) this.A07.get()).A00(activity);
        Stack stack = AnonymousClass5w6.A01;
        if (!stack.isEmpty()) {
            BkBottomSheetContainerFragment bkBottomSheetContainerFragment = (BkBottomSheetContainerFragment) stack.peek();
            bkBottomSheetContainerFragment.A02 = r4;
            bkBottomSheetContainerFragment.A1C();
        }
    }

    public String A9d(int i2, String str) {
        switch (str.hashCode()) {
            case -1808118735:
                return str.equals("String") ? ((C14720pe) this.A02.get()).A05(i2) : "null";
            case -672261858:
                return str.equals("Integer") ? Integer.toString(((C14720pe) this.A02.get()).A02(i2)) : "null";
            case 1729365000:
                return str.equals("Boolean") ? Boolean.toString(((C14720pe) this.A02.get()).A0C(i2)) : "null";
            default:
                return "null";
        }
    }

    public Map AAA() {
        return ((C118045ty) this.A0B.get()).A00(((C16040sK) this.A0I.get()).A05());
    }

    public ClipboardManager AAf() {
        return ((AnonymousClass01V) this.A0M.get()).A0B();
    }

    public long ABT() {
        return ((C16440t3) this.A0N.get()).A00();
    }

    public File AC7(String str) {
        return ((C16180sb) this.A0G.get()).A0N(str);
    }

    public String AEz() {
        return ((AnonymousClass1SB) this.A0K.get()).A00().A01;
    }

    public void AIR(String str, HashMap hashMap) {
        ((C20140zZ) this.A08.get()).A04("PRELOAD", ((AnonymousClass1IZ) this.A09.get()).A00(str, C110115dX.A0g("params", hashMap)));
    }

    public void AZu(Activity activity, C108615Or r7) {
        C115915qW r4 = new C115915qW(r7.A9T());
        try {
            AnonymousClass5w6 A002 = ((AnonymousClass5wN) this.A07.get()).A00(activity);
            C001000l r6 = (C001000l) activity;
            if (r4.A00.A02.get(35) != null) {
                String A0h = AnonymousClass000.A0h(UUID.randomUUID().toString(), AnonymousClass000.A0r("bottom_sheet_fragment_tag"));
                AnonymousClass00B.A06(r4);
                BkBottomSheetContentFragment A012 = BkBottomSheetContentFragment.A01(r4, (C20140zZ) A002.A00.get(), A0h, false);
                BkBottomSheetContainerFragment bkBottomSheetContainerFragment = new BkBottomSheetContainerFragment();
                bkBottomSheetContainerFragment.A01 = new AnonymousClass01Q(A012, A0h);
                if (!bkBottomSheetContainerFragment.A0e()) {
                    AnonymousClass02C AGM = r6.AGM();
                    AnonymousClass00B.A06(AGM);
                    bkBottomSheetContainerFragment.A1G(AGM, AnonymousClass000.A0h(UUID.randomUUID().toString(), AnonymousClass000.A0r("bottom_sheet_container_tag")));
                    AnonymousClass5w6.A01.push(bkBottomSheetContainerFragment);
                    return;
                }
                return;
            }
            throw new C115035p0();
        } catch (C115035p0 e2) {
            Log.e((Throwable) e2);
            e2.getMessage();
        }
    }

    public void AZv(Activity activity, String str) {
        Class AAq = ((C18290wS) this.A0J.get()).A03().AAq();
        if (AAq != null) {
            Intent A042 = C110105dW.A04(activity, AAq);
            A042.putExtra("extra_transaction_id", str);
            activity.startActivity(A042);
        }
    }

    public void AZw(Activity activity, String str) {
        Class AFS = ((C18290wS) this.A0J.get()).A03().AFS();
        if (AFS != null) {
            Intent A042 = C110105dW.A04(activity, AFS);
            A042.putExtra("extra_transaction_id", str);
            activity.startActivity(A042);
        }
    }

    public void AZx(Activity activity, String str, String str2) {
        try {
            UserJid A072 = A07(str);
            String A032 = C24561Gk.A03(A072);
            if (A032 != null) {
                Object[] A1a = C110105dW.A1a(A032);
                if (str2 == null) {
                    str2 = "";
                }
                A1a[1] = str2;
                ((C17100uX) this.A04.get()).Act(activity, Uri.parse(String.format("http://api.whatsapp.com/send?phone=%s&text=%s", A1a)));
                return;
            }
            throw new AnonymousClass1W4(AnonymousClass000.A0e(A072, "invalid jid ", AnonymousClass000.A0o()));
        } catch (AnonymousClass1W4 e2) {
            ((C16300so) this.A0F.get()).AcB("bloks/openchat", e2.getMessage(), true);
            ((C14870pt) this.A0H.get()).A09(R.string.str0df7, 0);
        }
    }

    public void AZy(Activity activity, String str) {
        try {
            UserJid A072 = A07(str);
            String A032 = C24561Gk.A03(A072);
            if (A032 != null) {
                C16010sH A082 = ((C16000sG) this.A0C.get()).A08(A072);
                if (A082 == null || !((C16040sK) this.A0I.get()).A0I(A072)) {
                    String replaceAll = A032.replaceAll("\\D", "");
                    String str2 = null;
                    if (replaceAll.length() < 5) {
                        Log.w("bkextentionsimpl/converttointlformat/too-short-no-cc");
                    } else {
                        Matcher A0k = C110115dX.A0k(replaceAll, "^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$");
                        if (A0k.find()) {
                            String group = A0k.group(1);
                            AnonymousClass00B.A06(group);
                            String substring = replaceAll.substring(group.length());
                            AnonymousClass1G1 r1 = (AnonymousClass1G1) this.A0E.get();
                            if (AnonymousClass2JO.A01(r1, group, substring) == 1) {
                                int parseInt = Integer.parseInt(group);
                                try {
                                    substring = r1.A02(parseInt, substring.replaceAll("\\D", ""));
                                } catch (Exception e2) {
                                    Log.w(C13680ns.A0c(parseInt, "bkextentionsimpl/converttointlformat/trim/error "), e2);
                                }
                                StringBuilder A0r = AnonymousClass000.A0r("+");
                                A0r.append(group);
                                str2 = AnonymousClass000.A0h(substring, A0r);
                            }
                        }
                    }
                    if (A082 != null || str2 == null) {
                        activity.startActivity(C14750ph.A0Z(activity, A072, (Integer) null, true));
                    } else {
                        ((C16320sq) this.A0S.get()).Acl(new C1216966m(activity, A072, this, str2));
                    }
                } else {
                    activity.startActivity(((C23101Am) this.A03.get()).A01(activity));
                }
            } else {
                throw new AnonymousClass1W4(AnonymousClass000.A0e(A072, "invalid jid ", AnonymousClass000.A0o()));
            }
        } catch (AnonymousClass1W4 e3) {
            ((C16300so) this.A0F.get()).AcB("bloks/openContactInfo - ", e3.getMessage(), true);
            ((C14870pt) this.A0H.get()).A09(R.string.str0df7, 0);
        }
    }

    public void Aa1(Activity activity, String str, String str2, List list) {
        BkActionBottomSheet.A01((C20140zZ) this.A08.get(), str, str2, list).A1G(((C001000l) activity).AGM(), "bloks_action_sheet_tag");
    }

    public void Aa2(Activity activity, String str, String str2) {
        activity.startActivity(WaBloksActivity.A09(activity, str, str2));
    }

    public void Aa5(Activity activity, C108615Or r5, String str, String str2) {
        activity.startActivity(C110105dW.A04(activity, WaBloksActivity.class).putExtra("screen_name", str).putExtra("screen_params", str2).putExtra("screen_cache_config", (Parcelable) null));
    }

    public void Aae(Activity activity) {
        ((AnonymousClass5wN) this.A07.get()).A00(activity);
        Stack stack = AnonymousClass5w6.A01;
        if (!stack.isEmpty()) {
            ((AnonymousClass01A) stack.peek()).A0F().A0I();
        }
    }

    public void Aaz(Activity activity, C108615Or r10, boolean z2) {
        C115915qW r3 = new C115915qW(r10.A9T());
        AnonymousClass5w6 A002 = ((AnonymousClass5wN) this.A07.get()).A00(activity);
        String A0h = AnonymousClass000.A0h(UUID.randomUUID().toString(), AnonymousClass000.A0r("bottom_sheet_fragment_tag"));
        BkBottomSheetContentFragment A012 = BkBottomSheetContentFragment.A01(r3, (C20140zZ) A002.A00.get(), A0h, z2);
        BkBottomSheetContainerFragment bkBottomSheetContainerFragment = (BkBottomSheetContainerFragment) AnonymousClass5w6.A01.peek();
        AnonymousClass050 r4 = new AnonymousClass050(bkBottomSheetContainerFragment.A0F());
        if (z2) {
            r4.A0I(A0h);
        }
        r4.A02 = R.anim.anim0027;
        r4.A03 = R.anim.anim0028;
        r4.A05 = R.anim.anim0026;
        r4.A06 = R.anim.anim0029;
        r4.A0E(A012, A0h, bkBottomSheetContainerFragment.A00.getId());
        r4.A01();
    }

    public void Ab2(Map map, int i2, int i3) {
        char c2;
        int i4;
        if (map != null && !map.isEmpty()) {
            try {
                Iterator A0y = AnonymousClass000.A0y(map);
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass000.A0z(A0y);
                    Object key = A0z.getKey();
                    String obj = key == null ? null : key.toString();
                    Object value = A0z.getValue();
                    String obj2 = value == null ? null : value.toString();
                    if (!(obj == null || obj2 == null)) {
                        C116925sA r1 = this.A01;
                        AnonymousClass01D r0 = r1.A00;
                        int A022 = A02(r0, i3, i2);
                        int A002 = A00(r0, i2);
                        AnonymousClass01D r7 = r1.A01;
                        C118935ve r8 = A04(r7).A06;
                        Number number = (Number) r8.A00(i2).A03.get(obj);
                        if (number != null) {
                            int intValue = number.intValue();
                            c2 = 2;
                            if (2 != intValue) {
                                c2 = 1;
                                if (1 == intValue) {
                                }
                            }
                            i4 = r8.A00(i2).A00;
                            if (!(i4 == -1 || c2 == 65535)) {
                                ((i4 != 2 || c2 == 2) ? A04(r7).A02 : A04(r7).A03).AKp(obj, obj2, A002, A022);
                            }
                        }
                        c2 = 65535;
                        i4 = r8.A00(i2).A00;
                        ((i4 != 2 || c2 == 2) ? A04(r7).A02 : A04(r7).A03).AKp(obj, obj2, A002, A022);
                    }
                }
            } catch (ConcurrentModificationException e2) {
                Log.e("Error during annotations map parse", e2);
            }
        }
    }

    public void Ab3(int i2, int i3) {
        C19500yX r0;
        C116925sA r1 = this.A01;
        AnonymousClass01D r02 = r1.A00;
        int A022 = A02(r02, i3, i2);
        int A002 = A00(r02, i2);
        AnonymousClass01D r2 = r1.A01;
        int A012 = A01(r2, i2);
        if (1 == A012) {
            r0 = A04(r2).A03;
        } else if (2 == A012) {
            r0 = A04(r2).A02;
        } else {
            return;
        }
        r0.AKx(A002, A022);
    }

    public void Ab4(C108615Or r7, Map map, int i2, int i3, int i4) {
        C19500yX r0;
        C116925sA r1 = this.A01;
        short s2 = (short) i4;
        AnonymousClass01D r02 = r1.A00;
        int A022 = A02(r02, i3, i2);
        int A002 = A00(r02, i2);
        AnonymousClass01D r2 = r1.A01;
        int A012 = A01(r2, i2);
        if (1 == A012) {
            r0 = A04(r2).A03;
        } else if (2 == A012) {
            r0 = A04(r2).A02;
        } else {
            return;
        }
        r0.AKy(A002, A022, s2);
    }

    public void Ab5(C108615Or r7, String str, int i2, int i3) {
        C19500yX r0;
        if (str != null) {
            String A0J2 = r7.A9T() != null ? r7.A9T().A0J(35) : null;
            C116925sA r1 = this.A01;
            AnonymousClass01D r02 = r1.A00;
            int A022 = A02(r02, i3, i2);
            int A002 = A00(r02, i2);
            AnonymousClass01D r2 = r1.A01;
            int A012 = A01(r2, i2);
            if (1 == A012) {
                r0 = A04(r2).A03;
            } else if (2 == A012) {
                r0 = A04(r2).A02;
            } else {
                return;
            }
            r0.ALA(str, A0J2, A002, A022);
        }
    }

    public void Ab6(C108615Or r7, Map map, int i2, int i3) {
        C19500yX r2;
        if (r7 != null) {
            r7.A9T().A0J(38);
        }
        C116925sA r1 = this.A01;
        AnonymousClass01D r0 = r1.A00;
        int A022 = A02(r0, i3, i2);
        int A002 = A00(r0, i2);
        AnonymousClass01D r3 = r1.A01;
        int A012 = A01(r3, i2);
        if (1 == A012) {
            r2 = A04(r3).A03;
        } else if (2 == A012) {
            r2 = A04(r3).A02;
        } else {
            return;
        }
        r2.ALF(A002, A022);
        r2.AKp("bloks_display_name", A04(r3).A06.A00(i2).A02, A002, A022);
    }

    public void Ab7(int i2, String str, int i3) {
        C19500yX r0;
        Object obj;
        C116925sA r1 = this.A01;
        AnonymousClass01D r02 = r1.A00;
        int A022 = A02(r02, i3, i2);
        int A002 = A00(r02, i2);
        AnonymousClass01D r4 = r1.A01;
        long A032 = A03(r4, A022, A002);
        int A012 = A01(r4, i2);
        if (1 == A012) {
            C117585tE A042 = A04(r4);
            if (str != null) {
                obj = A042.A05;
            } else {
                r0 = A042.A03;
                r0.AKy(A002, A022, 4);
                return;
            }
        } else if (2 == A012) {
            C117585tE A043 = A04(r4);
            if (str != null) {
                obj = A043.A04;
            } else {
                r0 = A043.A02;
                r0.AKy(A002, A022, 4);
                return;
            }
        } else {
            return;
        }
        int i4 = (int) A032;
        int i5 = (int) (A032 >>> 32);
        C19500yX r12 = ((AnonymousClass1Bf) obj).A00;
        r12.AKp("cancel_reason", str, i4, i5);
        r12.AKy(i4, i5, 4);
    }

    public void Ab8(String str, String str2, int i2, int i3) {
        C19500yX r0;
        Object obj;
        C116925sA r1 = this.A01;
        AnonymousClass01D r02 = r1.A00;
        int A022 = A02(r02, i3, i2);
        int A002 = A00(r02, i2);
        AnonymousClass01D r5 = r1.A01;
        long A032 = A03(r5, A022, A002);
        int A012 = A01(r5, i2);
        if (1 == A012) {
            C117585tE A042 = A04(r5);
            if (str != null) {
                obj = A042.A05;
            } else {
                r0 = A042.A03;
                r0.AKy(A002, A022, 87);
                return;
            }
        } else if (2 == A012) {
            C117585tE A043 = A04(r5);
            if (str != null) {
                obj = A043.A04;
            } else {
                r0 = A043.A02;
                r0.AKy(A002, A022, 87);
                return;
            }
        } else {
            return;
        }
        int i4 = (int) A032;
        int i5 = (int) (A032 >>> 32);
        C19500yX r12 = ((AnonymousClass1Bf) obj).A00;
        r12.AKq("uf_has_error", i4, i5, true);
        if (str2 != null) {
            r12.ALA(str, str2, i4, i5);
        } else {
            r12.AL9(i4, str, i5);
        }
    }

    public void Ab9(String str, String str2, int i2, int i3) {
        Object obj;
        C116925sA r2 = this.A01;
        AnonymousClass01D r0 = r2.A00;
        int A022 = A02(r0, i3, i2);
        int A002 = A00(r0, i2);
        AnonymousClass01D r4 = r2.A01;
        long A032 = A03(r4, A022, A002);
        int A012 = A01(r4, i2);
        if (1 == A012) {
            obj = A04(r4).A05;
        } else if (2 == A012) {
            obj = A04(r4).A04;
        } else {
            return;
        }
        int i4 = (int) A032;
        int i5 = (int) (A032 >>> 32);
        C19500yX r22 = ((AnonymousClass1Bf) obj).A00;
        r22.AKy(i4, i5, 3);
        if (str == null) {
            str = "<NULL>";
        }
        r22.AKq("uf_has_error", i4, i5, true);
        if (str2 != null) {
            r22.ALA(str, str2, i4, i5);
        } else {
            r22.AL9(i4, str, i5);
        }
    }

    public void AbA(int i2, int i3) {
        Object obj;
        C116925sA r2 = this.A01;
        AnonymousClass01D r0 = r2.A00;
        int A022 = A02(r0, i3, i2);
        int A002 = A00(r0, i2);
        AnonymousClass01D r22 = r2.A01;
        long A032 = A03(r22, A022, A002);
        int A012 = A01(r22, i2);
        if (1 == A012) {
            obj = A04(r22).A05;
        } else if (2 == A012) {
            obj = A04(r22).A04;
        } else {
            return;
        }
        ((AnonymousClass1Bf) obj).A00.AKy((int) A032, (int) (A032 >>> 32), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AbB(java.lang.String r8, java.util.Map r9, int r10, int r11) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0132
            java.util.HashMap r5 = X.AnonymousClass000.A0x()
            if (r9 == 0) goto L_0x0026
            java.util.Iterator r3 = X.AnonymousClass000.A0y(r9)
        L_0x000c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0026
            java.util.Map$Entry r2 = X.AnonymousClass000.A0z(r3)
            java.lang.Object r0 = r2.getKey()
            java.lang.String r1 = r0.toString()
            java.lang.Object r0 = r2.getValue()
            r5.put(r1, r0)
            goto L_0x000c
        L_0x0026:
            X.5sA r1 = r7.A01
            X.01D r0 = r1.A00
            int r2 = A02(r0, r11, r10)
            int r4 = A00(r0, r10)
            X.01D r0 = r1.A01
            X.5tE r3 = A04(r0)
            X.0v3 r1 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            X.5fX r2 = new X.5fX
            r2.<init>(r1, r3, r0, r4)
            r2.A02 = r8
            r0 = -1
            r2.A00 = r0
            java.util.Iterator r6 = X.C13690nt.A0j(r5)
        L_0x004d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x012f
            java.util.Map$Entry r0 = X.AnonymousClass000.A0z(r6)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r3 = r0.getValue()
            boolean r0 = r3 instanceof java.lang.String
            if (r0 != 0) goto L_0x00df
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x00cd
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 != 0) goto L_0x00cd
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 != 0) goto L_0x00c1
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 != 0) goto L_0x00c1
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0099
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r4 = X.C110105dW.A1a(r1)
            r0 = 1
            r4[r0] = r3
            java.lang.String r0 = "%s:%s"
        L_0x0082:
            java.lang.String r4 = java.lang.String.format(r5, r0, r4)
        L_0x0086:
            java.lang.String r3 = r2.A01
            if (r3 == 0) goto L_0x0096
            r0 = 2
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r0]
            X.C13690nt.A1L(r3, r4, r1)
            java.lang.String r0 = " ; "
            java.lang.String r4 = X.AnonymousClass1ZW.A0B(r0, r1)
        L_0x0096:
            r2.A01 = r4
            goto L_0x004d
        L_0x0099:
            boolean r0 = r3 instanceof int[]
            if (r0 == 0) goto L_0x00af
            int[] r3 = (int[]) r3
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r4 = X.C110105dW.A1a(r1)
            r1 = 1
            java.lang.String r0 = java.util.Arrays.toString(r3)
        L_0x00aa:
            r4[r1] = r0
            java.lang.String r0 = "%s:%s"
            goto L_0x0082
        L_0x00af:
            boolean r0 = r3 instanceof long[]
            if (r0 == 0) goto L_0x00e7
            long[] r3 = (long[]) r3
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r4 = X.C110105dW.A1a(r1)
            r1 = 1
            java.lang.String r0 = java.util.Arrays.toString(r3)
            goto L_0x00aa
        L_0x00c1:
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r4 = X.C110105dW.A1a(r1)
            r0 = 1
            r4[r0] = r3
            java.lang.String r0 = "%s:%10.5f"
            goto L_0x0082
        L_0x00cd:
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r4 = X.C110105dW.A1a(r1)
            r0 = 1
            r4[r0] = r3
            java.lang.String r0 = "%s:%d"
            goto L_0x0082
        L_0x00d9:
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = r3.toString()
        L_0x00df:
            java.lang.Object[] r4 = X.C110105dW.A1a(r1)
            r0 = 1
            r4[r0] = r3
            goto L_0x00f8
        L_0x00e7:
            boolean r0 = r3 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x00ff
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object[] r4 = X.C110105dW.A1a(r1)
            r1 = 1
            java.lang.String r0 = java.util.Arrays.toString(r3)
        L_0x00f6:
            r4[r1] = r0
        L_0x00f8:
            java.lang.String r0 = "%s:%s"
            java.lang.String r4 = java.lang.String.format(r0, r4)
            goto L_0x0086
        L_0x00ff:
            boolean r0 = r3 instanceof double[]
            if (r0 == 0) goto L_0x010f
            double[] r3 = (double[]) r3
            java.lang.Object[] r4 = X.C110105dW.A1a(r1)
            r1 = 1
            java.lang.String r0 = java.util.Arrays.toString(r3)
            goto L_0x00f6
        L_0x010f:
            boolean r0 = r3 instanceof float[]
            if (r0 == 0) goto L_0x011f
            float[] r3 = (float[]) r3
            java.lang.Object[] r4 = X.C110105dW.A1a(r1)
            r1 = 1
            java.lang.String r0 = java.util.Arrays.toString(r3)
            goto L_0x00f6
        L_0x011f:
            boolean r0 = r3 instanceof boolean[]
            if (r0 == 0) goto L_0x00d9
            boolean[] r3 = (boolean[]) r3
            java.lang.Object[] r4 = X.C110105dW.A1a(r1)
            r1 = 1
            java.lang.String r0 = java.util.Arrays.toString(r3)
            goto L_0x00f6
        L_0x012f:
            r2.A00()
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119965zu.AbB(java.lang.String, java.util.Map, int, int):void");
    }

    public void AbC(C108615Or r10, int i2, int i3) {
        Object obj;
        boolean equals = "cancel".equals(r10.A9T().A0J(35));
        String A0J2 = r10.A9T().A0J(36);
        r10.A9T().A0A(38, -1);
        C116925sA r2 = this.A01;
        AnonymousClass01D r0 = r2.A00;
        int A022 = A02(r0, i3, i2);
        int A002 = A00(r0, i2);
        AnonymousClass01D r4 = r2.A01;
        long A032 = A03(r4, A022, A002);
        int A012 = A01(r4, i2);
        if (1 == A012) {
            obj = A04(r4).A05;
        } else if (2 == A012) {
            obj = A04(r4).A04;
        } else {
            return;
        }
        C118705v7 r5 = new C118705v7(A0J2, equals);
        AnonymousClass1Bf r6 = (AnonymousClass1Bf) obj;
        int i4 = (int) A032;
        int i5 = (int) (A032 >>> 32);
        String str = r5.A00;
        if (str != null) {
            r6.A00.AKp("trigger_source_of_restart", str, i4, i5);
        }
        C19500yX r1 = r6.A00;
        r1.AKy(i4, i5, 111);
        r1.ALG(i4, i5, r5.A01);
        if (str != null) {
            r1.AKp("trigger_source", str, i4, i5);
        }
    }

    public void Abb(AnonymousClass1Z6 r7, HashMap hashMap) {
        String A052 = A05(hashMap);
        if (!TextUtils.isEmpty(A052)) {
            AnonymousClass1IQ r4 = (AnonymousClass1IQ) this.A0A.get();
            r4.A01.put(A052, new AnonymousClass1Z7(r7.A00, r7.A01, r4.A00));
        }
    }

    public void AcH(Activity activity, C108625Os r12, String[] strArr) {
        Activity activity2 = activity;
        if (this.A00 == null) {
            HashSet A0o = C13680ns.A0o();
            this.A00 = A0o;
            C18450wi.A0H(activity, 0);
            A0o.addAll(Arrays.asList(C28971Zm.A00(activity, true, true)));
        }
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                String str = strArr[i2];
                if (!this.A00.contains(str)) {
                    StringBuilder A0r = AnonymousClass000.A0r("Unauthorized permission request ");
                    A0r.append(str);
                    A0r.append(", Bloks allowed to request only whitelisted permissions ");
                    Log.e(AnonymousClass000.A0f(this.A00, A0r));
                    break;
                }
                i2++;
            } else if (activity instanceof C14530pL) {
                C14530pL r2 = (C14530pL) activity2;
                Intent A092 = RequestPermissionActivity.A09(activity2, (C16260sj) this.A0R.get(), 30, 0, 0, false);
                if (A092 == null) {
                    r12.AWT(true);
                    return;
                }
                r2.A30(new IDxEListenerShape47S0300000_3_I0(r2, r12, this, 0));
                r2.startActivityForResult(A092, 30);
                return;
            }
        }
        r12.AWT(false);
    }

    public void AcI(String str, HashMap hashMap, int i2) {
        AnonymousClass1KK r5 = (AnonymousClass1KK) this.A0Q.get();
        String A0g = C110115dX.A0g("params", hashMap);
        r5.A01.A01(new C35001lD("PRELOAD", ((long) i2) * 1000, false), new AnonymousClass631(r5, str), Boolean.TRUE, str, A0g, (String) null);
    }

    public void AdQ(String str, ArrayList arrayList, HashMap hashMap, int i2, int i3) {
        int i4 = 2;
        if (i3 == 1) {
            i4 = 1;
        } else if (i3 != 2) {
            i4 = 0;
        }
        ((C16490t9) this.A0T.get()).A06(C115155pE.A00(str, arrayList, hashMap, i2, i4));
    }

    public void Af8(Activity activity, String str) {
        AnonymousClass1KE r1 = (AnonymousClass1KE) this.A0L.get();
        if (!(activity instanceof WaBloksActivity) || !r1.A02() || !r1.A07.A01(str)) {
            A06(activity, str);
            return;
        }
        WaBloksActivity waBloksActivity = (WaBloksActivity) activity;
        waBloksActivity.A30(new C119765za(this, waBloksActivity, str));
        HashSet A0o = C13680ns.A0o();
        C13690nt.A1O(A0o, 55);
        AnonymousClass391 r2 = new AnonymousClass391(waBloksActivity);
        r2.A0D = true;
        r2.A0F = true;
        r2.A0R = C13680ns.A0n(A0o);
        r2.A0O = str;
        waBloksActivity.startActivityForResult(r2.A00(), 1);
    }

    public void AfZ(C000900k r6, AnonymousClass1Z6 r7, AnonymousClass1Z6 r8, AnonymousClass1Z6 r9, String str, String str2, String str3, String str4, String str5) {
        C32241fu A002 = C32241fu.A00(r6);
        A002.setTitle(str);
        A002.A06(str2);
        A002.A0H(r6, new IDxObserverShape117S0100000_3_I0(r7, 3), str3);
        if (str4 != null) {
            A002.A0G(r6, new IDxObserverShape117S0100000_3_I0(r8, 1), str4);
        }
        if (str5 != null) {
            IDxObserverShape117S0100000_3_I0 iDxObserverShape117S0100000_3_I0 = new IDxObserverShape117S0100000_3_I0(r9, 2);
            CharSequence A0A2 = A002.A0A(str5);
            C91254fc r1 = A002.A02;
            AnonymousClass0PG r0 = A002.A01;
            r0.A0G = A0A2;
            r0.A04 = r1;
            r1.A01.A0A(r6, iDxObserverShape117S0100000_3_I0);
        }
        C13690nt.A1G(A002);
    }

    public void Afo(Activity activity, ProgressDialog progressDialog, String str, boolean z2) {
        if (progressDialog != null) {
            if (progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
            progressDialog.setMessage(str);
            progressDialog.setIndeterminate(true);
            progressDialog.setCanceledOnTouchOutside(false);
            if (z2) {
                progressDialog.setCancelable(true);
                progressDialog.setOnCancelListener(new C119485xx(activity, this));
            } else {
                progressDialog.setCancelable(false);
            }
            progressDialog.show();
        }
    }

    public void Ag2(Activity activity, Intent intent, C85884Qj r5, int i2) {
        if (!(activity instanceof C14530pL)) {
            r5.A00(C114795oc.ERROR);
            return;
        }
        C14530pL r3 = (C14530pL) activity;
        r3.A30(new IDxEListenerShape47S0300000_3_I0(r3, r5, this, 1));
        r3.startActivityForResult(intent, 1);
    }

    public void Agu(String str) {
        ((C14870pt) this.A0H.get()).A0H(str, 0);
    }
}
