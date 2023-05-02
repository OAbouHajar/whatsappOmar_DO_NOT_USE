package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import com.facebook.redex.IDxNConsumerShape9S0400000_2_I0;
import com.facebook.redex.IDxRCallbackShape13S0300000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.facebook.redex.RunnableRunnableShape0S0210000_I0;
import com.facebook.redex.RunnableRunnableShape0S0220000_I0;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.facebook.redex.RunnableRunnableShape0S1411000_I0;
import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextData;
import com.obwhatsapp.push.RegistrationIntentService;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0tb  reason: invalid class name and case insensitive filesystem */
public class C16760tb {
    public final AnonymousClass12E A00;
    public final C16300so A01;
    public final AnonymousClass16R A02;
    public final C14870pt A03;
    public final AnonymousClass1H8 A04;
    public final C16040sK A05;
    public final AnonymousClass01Z A06;
    public final C15900s5 A07;
    public final C17130ua A08;
    public final C216815a A09;
    public final C19740yv A0A;
    public final C16600tK A0B;
    public final AnonymousClass18Z A0C;
    public final C17150uc A0D;
    public final AnonymousClass16N A0E;
    public final AnonymousClass01Y A0F;
    public final C17760vb A0G;
    public final C17230uk A0H;
    public final C18930xU A0I;
    public final C16000sG A0J;
    public final AnonymousClass156 A0K;
    public final AnonymousClass12G A0L;
    public final C16080sP A0M;
    public final AnonymousClass10Y A0N;
    public final C15800rs A0O;
    public final AnonymousClass12W A0P;
    public final C16440t3 A0Q;
    public final C16980tz A0R;
    public final C16260sj A0S;
    public final AnonymousClass013 A0T;
    public final C14730pf A0U;
    public final C19820z3 A0V;
    public final AnonymousClass1GG A0W;
    public final C20070zS A0X;
    public final AnonymousClass126 A0Y;
    public final AnonymousClass199 A0Z;
    public final C18910xS A0a;
    public final C15810rt A0b;
    public final C216114t A0c;
    public final AnonymousClass11A A0d;
    public final C16460t6 A0e;
    public final C27631Sn A0f;
    public final C27531Sc A0g;
    public final AnonymousClass182 A0h;
    public final AnonymousClass11H A0i;
    public final C16070sO A0j;
    public final AnonymousClass153 A0k;
    public final C19780yz A0l;
    public final AnonymousClass17H A0m;
    public final C19150xq A0n;
    public final AnonymousClass16V A0o;
    public final AnonymousClass10G A0p;
    public final AnonymousClass128 A0q;
    public final AnonymousClass180 A0r;
    public final AnonymousClass15H A0s;
    public final C27591Sj A0t;
    public final AnonymousClass1FI A0u;
    public final C16500tA A0v;
    public final C18030w2 A0w;
    public final C18070w6 A0x;
    public final C14710pd A0y;
    public final C20260zl A0z;
    public final C16490t9 A10;
    public final C17240ul A11;
    public final C17780vd A12;
    public final C19950zG A13;
    public final C19430yQ A14;
    public final C18210wK A15;
    public final AnonymousClass1HE A16;
    public final AnonymousClass1QV A17;
    public final C215914r A18;
    public final C209212c A19;
    public final AnonymousClass1QT A1A;
    public final AnonymousClass1QW A1B;
    public final AnonymousClass1HO A1C;
    public final C17190ug A1D;
    public final AnonymousClass0y3 A1E;
    public final AnonymousClass124 A1F;
    public final C18500wn A1G;
    public final C19830z4 A1H;
    public final C14770pj A1I;
    public final AnonymousClass00F A1J = new AnonymousClass00F(1, 10);
    public final AnonymousClass125 A1K;
    public final C26141Mm A1L;
    public final AnonymousClass1RV A1M;
    public final C222617g A1N;
    public final C27641So A1O;
    public final C27621Sm A1P;
    public final C19040xf A1Q;
    public final C16220sf A1R;
    public final C17980vx A1S;
    public final AnonymousClass1L1 A1T;
    public final AnonymousClass1CX A1U;
    public final C27651Sp A1V;
    public final AnonymousClass1PD A1W;
    public final AnonymousClass1A9 A1X;
    public final C16320sq A1Y;
    public final JniBridge A1Z;

    public C16760tb(AnonymousClass12E r4, C16300so r5, AnonymousClass16R r6, C14870pt r7, AnonymousClass1H8 r8, C16040sK r9, AnonymousClass01Z r10, C15900s5 r11, C17130ua r12, C216815a r13, C19740yv r14, C16600tK r15, AnonymousClass18Z r16, C17150uc r17, AnonymousClass16N r18, AnonymousClass01Y r19, C17760vb r20, C17230uk r21, C18930xU r22, C16000sG r23, AnonymousClass156 r24, AnonymousClass12G r25, C16080sP r26, AnonymousClass10Y r27, C15800rs r28, AnonymousClass12W r29, C16440t3 r30, C16980tz r31, C16260sj r32, AnonymousClass013 r33, C14730pf r34, C19820z3 r35, AnonymousClass1GG r36, C20070zS r37, AnonymousClass126 r38, AnonymousClass199 r39, C18910xS r40, C15810rt r41, C216114t r42, AnonymousClass11A r43, C16460t6 r44, C27631Sn r45, C27531Sc r46, AnonymousClass182 r47, AnonymousClass11H r48, C16070sO r49, AnonymousClass153 r50, C19780yz r51, AnonymousClass17H r52, C19150xq r53, AnonymousClass16V r54, AnonymousClass10G r55, AnonymousClass128 r56, AnonymousClass180 r57, AnonymousClass15H r58, C27591Sj r59, AnonymousClass1FI r60, C16500tA r61, C18030w2 r62, C18070w6 r63, C14710pd r64, C20260zl r65, C16490t9 r66, C17240ul r67, C17780vd r68, C19950zG r69, C19430yQ r70, C18210wK r71, AnonymousClass1HE r72, AnonymousClass1QV r73, C215914r r74, C209212c r75, AnonymousClass1QT r76, AnonymousClass1QW r77, AnonymousClass1HO r78, C17190ug r79, AnonymousClass0y3 r80, AnonymousClass124 r81, C18500wn r82, C19830z4 r83, C14770pj r84, AnonymousClass125 r85, C26141Mm r86, AnonymousClass1RV r87, C222617g r88, C27641So r89, C27621Sm r90, C19040xf r91, C16220sf r92, C17980vx r93, AnonymousClass1L1 r94, AnonymousClass1CX r95, C27651Sp r96, AnonymousClass1PD r97, AnonymousClass1A9 r98, C16320sq r99, JniBridge jniBridge) {
        this.A0R = r31;
        this.A0Q = r30;
        this.A0y = r64;
        this.A1W = r97;
        this.A03 = r7;
        this.A01 = r5;
        this.A05 = r9;
        this.A1Y = r99;
        this.A0b = r41;
        this.A1Z = jniBridge;
        this.A08 = r12;
        this.A10 = r66;
        this.A0a = r40;
        this.A1F = r81;
        this.A07 = r11;
        this.A0I = r22;
        this.A0Z = r39;
        this.A15 = r71;
        this.A0U = r34;
        this.A0z = r65;
        this.A13 = r69;
        this.A1D = r79;
        this.A1Q = r91;
        this.A0C = r16;
        this.A0J = r23;
        this.A0w = r62;
        this.A0i = r48;
        this.A1X = r98;
        this.A1A = r76;
        this.A0M = r26;
        this.A0T = r33;
        this.A1N = r88;
        this.A1K = r85;
        this.A1P = r90;
        this.A0F = r19;
        this.A0G = r20;
        this.A0e = r44;
        this.A0f = r45;
        this.A12 = r68;
        this.A0x = r63;
        this.A0l = r51;
        this.A0n = r53;
        this.A11 = r67;
        this.A0B = r15;
        this.A1R = r92;
        this.A04 = r8;
        this.A0P = r29;
        this.A1M = r87;
        this.A1U = r95;
        this.A0A = r14;
        this.A0Y = r38;
        this.A1H = r83;
        this.A1B = r77;
        this.A1E = r80;
        this.A0q = r56;
        this.A18 = r74;
        this.A0m = r52;
        this.A1I = r84;
        this.A0p = r55;
        this.A0v = r61;
        this.A1S = r93;
        this.A0S = r32;
        this.A1G = r82;
        this.A0H = r21;
        this.A0O = r28;
        this.A0g = r46;
        this.A02 = r6;
        this.A19 = r75;
        this.A1O = r89;
        this.A0o = r54;
        this.A1T = r94;
        this.A17 = r73;
        this.A0r = r57;
        this.A0d = r43;
        this.A0h = r47;
        this.A1C = r78;
        this.A0L = r25;
        this.A1L = r86;
        this.A14 = r70;
        this.A0D = r17;
        this.A0s = r58;
        this.A0N = r27;
        this.A0W = r36;
        this.A0E = r18;
        this.A16 = r72;
        this.A0j = r49;
        this.A0K = r24;
        this.A0c = r42;
        this.A0u = r60;
        this.A1V = r96;
        this.A0V = r35;
        this.A0t = r59;
        this.A06 = r10;
        this.A0X = r37;
        this.A00 = r4;
        this.A09 = r13;
        this.A0k = r50;
    }

    public static String A00(C16730tY r5) {
        File file;
        if (!TextUtils.isEmpty(r5.A06)) {
            return r5.A06;
        }
        C16750ta r0 = r5.A02;
        if (!(r0 == null || (file = r0.A0F) == null)) {
            try {
                byte b2 = r5.A10;
                if (b2 == 2) {
                    return AnonymousClass1QS.A06(AnonymousClass1QS.A03(file));
                }
                if (b2 == 3 || b2 == 13) {
                    int i2 = AnonymousClass1QS.A04(file, false).A01;
                    return i2 == 7 ? "video/quicktime" : i2 == 3 ? "video/3gpp" : "video/mp4";
                }
            } catch (C43051zG | IOException e2) {
                Log.e("useractions/getmediamimetype exception", e2);
            }
        }
        byte b3 = r5.A10;
        return b3 != 1 ? b3 != 2 ? (b3 == 3 || b3 == 13) ? "video/*" : (b3 == 23 || b3 == 25 || b3 == 37 || b3 == 42) ? "image/jpeg" : b3 != 43 ? "*/*" : "video/*" : "audio/*" : "image/jpeg";
    }

    public static /* synthetic */ void A01(Uri uri, C19980zJ r10, C16760tb r11, C16730tY r12, WeakReference weakReference) {
        String str;
        Intent intent;
        int i2;
        r11.A03.A05();
        if (weakReference.get() != null) {
            Context context = (Context) weakReference.get();
            boolean z2 = false;
            if (r12.A05 >= 127) {
                z2 = true;
            }
            C16040sK r7 = r11.A05;
            byte b2 = r12.A10;
            if (b2 == 23) {
                str = ((C38891ra) r12).A09;
            } else if (b2 != 44) {
                if (b2 == 1) {
                    i2 = R.string.str15fb;
                } else if (b2 == 2) {
                    i2 = R.string.str15f7;
                } else if (b2 == 3) {
                    i2 = R.string.str15fc;
                } else if (b2 != 9) {
                    i2 = R.string.str15fa;
                    if (b2 != 13) {
                        i2 = R.string.str15f9;
                    }
                } else {
                    i2 = R.string.str15f8;
                }
                str = context.getString(i2, new Object[]{r7.A07()});
            } else {
                str = ((C39021rn) r12).A07;
            }
            String A002 = C42551xz.A04(r12) ? C42551xz.A00(r12) : b2 != 44 ? r12.A13() : C47612Jr.A02(r11.A0T, (C39021rn) r12);
            String A003 = A00(r12);
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType(A003);
            if (!TextUtils.isEmpty(str)) {
                intent2.putExtra("android.intent.extra.SUBJECT", str);
            }
            if (!TextUtils.isEmpty(A002)) {
                intent2.putExtra("android.intent.extra.TEXT", A002);
            }
            intent2.putExtra("origin", 3);
            intent2.putExtra("android.intent.extra.STREAM", uri);
            if (Build.VERSION.SDK_INT >= 29 || !z2) {
                intent = Intent.createChooser(intent2, (CharSequence) null);
            } else {
                ArrayList arrayList = new ArrayList();
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent2, 0);
                if (queryIntentActivities != null) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        String str2 = activityInfo.name;
                        String str3 = activityInfo.applicationInfo.packageName;
                        Intent intent3 = new Intent(intent2);
                        intent3.setClassName(str3, str2);
                        intent3.setPackage(str3);
                        arrayList.add(intent3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Intent intent4 = (Intent) it.next();
                    if ("com.obwhatsapp".equals(intent4.getPackage()) || "com.obwhatsapp.w4b".equals(intent4.getPackage())) {
                        intent4.putExtra("enforce_hfm_limit", z2);
                    }
                }
                intent = AnonymousClass1yL.A01((IntentSender) null, (CharSequence) null, arrayList);
            }
            intent.setFlags(1);
            r10.A06(context, intent);
        }
    }

    public static C16760tb A21() {
        return (C16760tb) yo.mSingletonC.APV.get();
    }

    public final C30581cc A02(AnonymousClass1ZR r16, C35541m6 r17, C15830rv r18, C40531uH r19, C16740tZ r20, C30771cv r21, String str, List list, boolean z2, boolean z3, boolean z4) {
        long A002;
        C222617g r4;
        C30771cv r8;
        boolean z5;
        boolean z6;
        C15830rv r6 = r18;
        boolean A0Q2 = C16030sJ.A0Q(r6);
        AnonymousClass1ZR r5 = r16;
        String str2 = str;
        if (A0Q2) {
            z5 = C47622Js.A09(r5, C47622Js.A01(str2));
            r4 = this.A1N;
            A002 = this.A0Q.A00();
            r8 = null;
            z6 = this.A0y.A0E(C16620tM.A02, 2567);
        } else {
            A002 = this.A0Q.A00();
            A03(A002);
            r4 = this.A1N;
            r8 = null;
            z5 = false;
            z6 = false;
        }
        C30581cc A042 = r4.A04(r5, r6, r20, r8, str2, list, A002, z5, z6);
        C30771cv r0 = r21;
        if (r21 != null) {
            A042.A0h(r0);
        }
        C40531uH r02 = r19;
        if (r19 != null) {
            A042.A0c(r02);
        }
        A0M(A042);
        if (z2) {
            A042.A0S(4);
        }
        if (z3) {
            A042.A0S(2);
        }
        if (A0Q2) {
            TextData textData = new TextData();
            int[] iArr = C47622Js.A01;
            textData.backgroundColor = iArr[Math.abs(C47622Js.A00.nextInt()) % iArr.length];
            textData.textColor = -1;
            textData.fontStyle = 0;
            A042.A14(textData);
            A042.A0k(C47622Js.A06(A042.A0I()));
            C35541m6 r03 = r17;
            AnonymousClass00B.A06(r03);
            A042.A0K = r03;
            this.A1T.A09(A042, "request", C18020w1.A02(this.A0w, A042), 0, false, false);
        }
        A042.A1B = z4;
        return A042;
    }

    public final void A03(long j2) {
        if (j2 < 946684800000L || j2 > 2208988800000L) {
            StringBuilder sb = new StringBuilder("userActions/reportIfBadTime: time=");
            AnonymousClass013 r2 = this.A0T;
            sb.append(C42681yF.A05(r2, C28891Zc.A05(r2, j2), C47672Jx.A00(r2, j2)));
            Log.e(sb.toString());
            if (this.A1J.A00()) {
                this.A01.AcB("userActions/badTime", (String) null, false);
            }
        }
    }

    public void A04(Activity activity, C19980zJ r11, C16740tZ r12) {
        String str;
        File file;
        if (!(r12 instanceof C16730tY)) {
            str = "app/share/message-is-not-media-message";
        } else {
            C16730tY r8 = (C16730tY) r12;
            C16750ta r0 = r8.A02;
            if (r0 == null || (file = r0.A0F) == null || !file.exists()) {
                str = "app/share/media-does-not-exist";
            } else {
                C16320sq r4 = this.A1Y;
                r4.Acl(new RunnableRunnableShape2S0200000_I0(r12, 27, this));
                WeakReference weakReference = new WeakReference(activity);
                C14870pt r3 = this.A03;
                r3.A08(0, R.string.str0c8c);
                C16300so r2 = this.A01;
                C16500tA r02 = this.A0v;
                IDxNConsumerShape9S0400000_2_I0 iDxNConsumerShape9S0400000_2_I0 = new IDxNConsumerShape9S0400000_2_I0(r11, weakReference, r8, this, 0);
                C41961wy r1 = new C41961wy(r2, r02, r8);
                r1.A01(iDxNConsumerShape9S0400000_2_I0, r3.A06);
                r4.Acl(r1);
                return;
            }
        }
        Log.w(str);
        C14870pt r32 = this.A03;
        boolean A002 = C14730pf.A00();
        int i2 = R.string.str092f;
        if (A002) {
            i2 = R.string.str092e;
        }
        r32.A09(i2, 0);
    }

    public void A05(C14550pN r11, C16730tY r12, boolean z2) {
        AnonymousClass12W r6 = this.A0P;
        C14730pf r7 = this.A0U;
        C14550pN r3 = r11;
        if (r6.A04(new C47692Jz(r11, r7))) {
            C38331qc r2 = null;
            if (z2) {
                boolean z3 = r12 instanceof C38891ra;
                C14870pt r4 = this.A03;
                C16490t9 r9 = this.A10;
                C16080sP r5 = this.A0M;
                C16010sH A092 = C38621r6.A09(this.A0c, r12);
                r2 = z3 ? new AnonymousClass2K0(r3, r4, r5, r6, r7, A092, r9) : new AnonymousClass2K1(r3, r4, r5, r6, r7, A092, r9);
            }
            this.A19.A07(r2, r12, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0043, code lost:
        if (r6.A07(r7.A01, (long) r7.A00) != false) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C43241zg r21, X.AnonymousClass1XQ r22, X.C16730tY r23, byte[] r24, boolean r25, boolean r26, boolean r27) {
        /*
            r20 = this;
            java.lang.String r0 = "useractions/useractionsendmediamessages/size = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r4 = r21
            java.util.concurrent.CopyOnWriteArrayList r5 = r4.A01
            int r0 = r5.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r13 = r20
            X.1QT r6 = r13.A1A
            X.0tY r0 = r4.A00()
            boolean r0 = r6.A0A(r0)
            if (r0 != 0) goto L_0x0045
            X.0tY r7 = r4.A00()
            byte r1 = r7.A10
            int r0 = r7.A08
            X.1XK r0 = X.C31831f6.A01(r1, r0)
            boolean r0 = X.C31831f6.A03(r0)
            if (r0 == 0) goto L_0x0068
            long r2 = r7.A01
            int r0 = r7.A00
            long r0 = (long) r0
            boolean r0 = r6.A07(r2, r0)
            if (r0 == 0) goto L_0x0068
        L_0x0045:
            X.0tY r2 = r4.A00()
            byte r1 = r2.A10
            int r0 = r2.A08
            X.1XK r1 = X.C31831f6.A01(r1, r0)
            X.0ta r0 = r2.A02
            X.AnonymousClass00B.A06(r0)
            java.io.File r0 = r0.A0F
            boolean r0 = r6.A08(r1, r0)
            if (r0 != 0) goto L_0x0068
            X.0pt r2 = r13.A03
            r1 = 2131891710(0x7f1215fe, float:1.9418148E38)
            r0 = 0
            r2.A09(r1, r0)
        L_0x0067:
            return
        L_0x0068:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
            java.util.Iterator r12 = r0.iterator()
        L_0x007a:
            boolean r0 = r12.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x0105
            java.lang.Object r8 = r12.next()
            X.0tY r8 = (X.C16730tY) r8
            r13.A0M(r8)
            X.0s5 r10 = r13.A07
            X.0tC r9 = X.C15910s6.A1y
            int r7 = r10.A02(r9)
            int r0 = r5.size()
            if (r0 == r6) goto L_0x00a4
            X.0pd r6 = r13.A0y
            r1 = 695(0x2b7, float:9.74E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r6.A0E(r0, r1)
            if (r0 == 0) goto L_0x0101
        L_0x00a4:
            X.1Vw r0 = r8.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x0101
            byte r1 = r8.A10
            r0 = 3
            if (r1 != r0) goto L_0x0101
            int r0 = r8.A00
            if (r0 <= r7) goto L_0x0101
            r8.A00 = r7
            X.0ta r11 = r8.A02
            X.AnonymousClass00B.A06(r11)
            long r6 = r11.A0D
            int r0 = r10.A02(r9)
            long r0 = (long) r0
            r9 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r9
            long r6 = r6 + r0
            r11.A0E = r6
            r2.add(r8)
        L_0x00ce:
            X.1Vw r9 = r8.A11
            X.0rv r10 = r9.A00
            boolean r0 = X.C16030sJ.A0Q(r10)
            if (r0 == 0) goto L_0x00ec
            X.0vx r0 = r13.A1S
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00ec
            X.1L1 r6 = r13.A1T
            int r0 = r8.A0B
            long r0 = (long) r0
            java.lang.String r7 = "request"
            X.1Su r6 = r6.A0D
            r6.A03(r8, r7, r0)
        L_0x00ec:
            X.1HO r0 = r13.A1C
            X.AnonymousClass00B.A06(r10)
            X.2IZ r1 = r0.A00(r10)
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r1.A01     // Catch:{ all -> 0x015f }
            r0.put(r9, r8)     // Catch:{ all -> 0x015f }
            r1.toString()     // Catch:{ all -> 0x015f }
            monitor-exit(r1)
            goto L_0x007a
        L_0x0101:
            r3.add(r8)
            goto L_0x00ce
        L_0x0105:
            X.0tY r0 = r4.A00()
            X.0ta r0 = r0.A02
            X.AnonymousClass00B.A06(r0)
            java.io.File r0 = r0.A0F
            if (r0 == 0) goto L_0x011e
            X.0sq r5 = r13.A1Y
            r1 = 35
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r4, r1, r13)
            r5.Acl(r0)
        L_0x011e:
            int r0 = r3.size()
            r14 = r22
            r15 = r23
            r1 = r24
            r17 = r25
            r18 = r26
            r19 = r27
            if (r0 < r6) goto L_0x0144
            X.1zg r12 = new X.1zg
            r12.<init>(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            X.2K5 r11 = new X.2K5
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r13.A0Q(r15, r11, r0, r1)
        L_0x0144:
            int r0 = r2.size()
            if (r0 < r6) goto L_0x0067
            X.1zg r12 = new X.1zg
            r12.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            X.2K5 r11 = new X.2K5
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r13.A0Q(r15, r11, r0, r1)
            return
        L_0x015f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16760tb.A06(X.1zg, X.1XQ, X.0tY, byte[], boolean, boolean, boolean):void");
    }

    public void A07(C43241zg r9, byte[] bArr, boolean z2, boolean z3) {
        A06(r9, (AnonymousClass1XQ) null, (C16730tY) null, bArr, false, z2, z3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v131, resolved type: X.1cc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v133, resolved type: X.1cc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v134, resolved type: X.1cc} */
    /* JADX WARNING: type inference failed for: r0v64, types: [X.0tY] */
    /* JADX WARNING: type inference failed for: r0v68, types: [X.0tY] */
    /* JADX WARNING: type inference failed for: r0v74, types: [X.0tY] */
    /* JADX WARNING: type inference failed for: r0v82, types: [X.0tY, X.0tZ] */
    /* JADX WARNING: type inference failed for: r27v15, types: [X.1rH] */
    /* JADX WARNING: type inference failed for: r27v16, types: [X.1rA] */
    /* JADX WARNING: type inference failed for: r27v17, types: [X.1rA] */
    /* JADX WARNING: type inference failed for: r27v18, types: [X.1s0] */
    /* JADX WARNING: type inference failed for: r27v19, types: [X.1s0] */
    /* JADX WARNING: type inference failed for: r27v20, types: [X.1rR] */
    /* JADX WARNING: type inference failed for: r27v21, types: [X.1rR] */
    /* JADX WARNING: type inference failed for: r27v22, types: [X.1rI] */
    /* JADX WARNING: type inference failed for: r27v23, types: [X.1rI] */
    /* JADX WARNING: type inference failed for: r27v24, types: [X.1rF] */
    /* JADX WARNING: type inference failed for: r27v25, types: [X.1rj] */
    /* JADX WARNING: type inference failed for: r27v26, types: [X.1rj] */
    /* JADX WARNING: type inference failed for: r27v27, types: [X.1rw] */
    /* JADX WARNING: type inference failed for: r27v28, types: [X.1rw] */
    /* JADX WARNING: type inference failed for: r27v29, types: [X.1rF] */
    /* JADX WARNING: type inference failed for: r27v30, types: [X.1ra] */
    /* JADX WARNING: type inference failed for: r27v31, types: [X.1ra] */
    /* JADX WARNING: type inference failed for: r27v32, types: [X.1rB] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f2, code lost:
        r5 = (X.C15830rv) r23.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r8 = r2.A1N;
        r11 = r2.A0Q.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0200, code lost:
        if (r25 != false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0202, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0203, code lost:
        if (r24 == false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0205, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x020c, code lost:
        if (r1.A10(1024) == false) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x020e, code lost:
        r3 = r8.A05.A02(r5, true);
        r6 = r1.A0N;
        r0 = new X.C30581cc(r3, r11);
        r0.A0k(r6.A07);
        r0.A0c(r6);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0223, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0228, code lost:
        if (X.C42941yx.A02(r1) == false) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x022e, code lost:
        if ((r1 instanceof X.C39041rp) == false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0230, code lost:
        r3 = r8.A05.A02(r5, true);
        r6 = r1.A0I();
        r0 = new X.C30581cc(r3, r11);
        r0.A0k(X.AnonymousClass1ZW.A04(android.support.v4.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED, r6));
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0249, code lost:
        if (r15 == false) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x024b, code lost:
        r3 = (X.C16730tY) r1;
        r0 = r3.A02;
        r35 = r0;
        X.AnonymousClass00B.A06(r35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0255, code lost:
        if (r10 == false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0257, code lost:
        r6 = r35.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x025c, code lost:
        r6 = new X.C16750ta(r0);
        r6.A0P = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x026a, code lost:
        if (r6.A0B != 0) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x026c, code lost:
        r6.A0B = r3.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0270, code lost:
        r29 = r8.A05.A02(r5, true);
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0279, code lost:
        if ((r3 instanceof X.C38641rB) == false) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x027b, code lost:
        X.AnonymousClass00B.A06(r6);
        r27 = new X.C38641rB(r6, r29, (X.C38641rB) r3, r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0290, code lost:
        r11 = r8.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x029e, code lost:
        if (X.C40541uI.A02(r11, r3, X.C16030sJ.A0Q(r0.A11.A00)) == false) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a0, code lost:
        r8 = r3.A0U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a2, code lost:
        if (r8 == null) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a8, code lost:
        if (r8.A01() == false) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02aa, code lost:
        r8 = r3.A0F();
        X.AnonymousClass00B.A06(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02b5, code lost:
        if (r8.A04() == false) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02c1, code lost:
        if (java.util.Arrays.equals(r3.A0U.A09, r6.A0U) != false) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02c3, code lost:
        com.whatsapp.util.Log.e("FMessageFactory/newFMessageForForward/thumbnail and media file key not the same");
        r0.A0h((X.C30771cv) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02cf, code lost:
        if (X.C40541uI.A00(r11, r0) == false) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02d1, code lost:
        r3 = r0.A12();
        X.AnonymousClass00B.A06(r3);
        r3.A05 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02da, code lost:
        if (r10 == false) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02e0, code lost:
        if ((r0 instanceof X.C38681rF) == false) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e2, code lost:
        r0.A05 = null;
        r0.A04 = null;
        r3 = r0.A02;
        X.AnonymousClass00B.A06(r3);
        r3.A0K = null;
        r3.A0J = null;
        r10 = r0.A12();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02f3, code lost:
        if (r10 == null) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f5, code lost:
        r6 = r10.A06();
        r10.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02fc, code lost:
        if (r6 == null) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02fe, code lost:
        r12 = r6.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0300, code lost:
        if (r12 != 4) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0302, code lost:
        r13 = 0;
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0305, code lost:
        r13 = r13 + ((long) r6[r11]);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x030b, code lost:
        if (r11 < r12) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0313, code lost:
        if (r0.A02.A0A != r13) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0315, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r10.A03 = r6;
        r10.A01 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x031c, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x031f, code lost:
        r6 = r3.A0U.A00();
        r6.A02 = r35.A0B;
        r6.A08 = r10;
        r6.A0B = X.C40541uI.A01(r11, r0);
        r0.A0h(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0339, code lost:
        if ((r3 instanceof X.C39021rn) == false) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x033b, code lost:
        r1 = new X.AnonymousClass2K2("Order messages can not be forwarded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0342, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0345, code lost:
        if ((r3 instanceof X.C38991rk) == false) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0347, code lost:
        r1 = new X.AnonymousClass2K2("ViewOnce messages can not be forwarded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0351, code lost:
        if ((r3 instanceof X.C38681rF) == false) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0353, code lost:
        r9 = (X.C38681rF) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0358, code lost:
        if ((r9 instanceof X.C38891ra) == false) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x035a, code lost:
        X.AnonymousClass00B.A06(r6);
        r27 = new X.C38891ra(r6, r29, (X.C38891ra) r9, r11, false);
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0371, code lost:
        if ((r3 instanceof X.C39011rm) == false) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0373, code lost:
        r1 = new X.AnonymousClass2K2("ViewOnce messages can not be forwarded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x037b, code lost:
        if (r45 != false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x037d, code lost:
        r27.A03 = null;
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0383, code lost:
        if ((r9 instanceof X.C38901rb) == false) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0385, code lost:
        X.AnonymousClass00B.A06(r6);
        r27 = new X.C38681rF(r6, r29, r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0398, code lost:
        if ((r9 instanceof X.C39111rw) == false) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x039a, code lost:
        X.AnonymousClass00B.A06(r6);
        r27 = new X.C39111rw(r6, r29, (X.C39111rw) r9, r11, false);
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03ae, code lost:
        if (r45 != false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03b0, code lost:
        r27.A03 = null;
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03b6, code lost:
        if ((r9 instanceof X.C38981rj) == false) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03b8, code lost:
        X.AnonymousClass00B.A06(r6);
        r27 = new X.C38981rj(r6, r29, (X.C38981rj) r9, r11, false);
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03cc, code lost:
        if (r45 != false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03ce, code lost:
        r27.A03 = null;
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03d2, code lost:
        X.AnonymousClass00B.A06(r6);
        r27 = new X.C38681rF(r6, r29, r9, r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03e4, code lost:
        if (r45 != false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03e6, code lost:
        r0.A03 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03ec, code lost:
        if ((r3 instanceof X.C38711rI) == false) goto L_0x0428;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03ee, code lost:
        r9 = (X.C38711rI) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03f3, code lost:
        if ((r9 instanceof X.C39141rz) == false) goto L_0x0406;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03f5, code lost:
        X.AnonymousClass00B.A06(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03f8, code lost:
        r27 = new X.C38711rI(r13, r29, r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0408, code lost:
        if ((r9 instanceof X.C38921rd) == false) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x040a, code lost:
        X.AnonymousClass00B.A06(r6);
        r13 = r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0410, code lost:
        X.AnonymousClass00B.A06(r6);
        r27 = new X.C38711rI(r6, r29, r9, r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0422, code lost:
        if (r45 != false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0424, code lost:
        r0.A03 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x042a, code lost:
        if ((r3 instanceof X.C38801rR) == false) goto L_0x045e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x042c, code lost:
        r9 = (X.C38801rR) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0431, code lost:
        if ((r9 instanceof X.C38931re) == false) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0433, code lost:
        X.AnonymousClass00B.A06(r6);
        r27 = new X.C38801rR(r9.A02, r29, r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0446, code lost:
        X.AnonymousClass00B.A06(r6);
        r27 = new X.C38801rR(r6, r29, r9, r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0458, code lost:
        if (r45 != false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x045a, code lost:
        r0.A03 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0460, code lost:
        if ((r3 instanceof X.C38631rA) == false) goto L_0x04af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0462, code lost:
        r9 = (X.C38631rA) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0467, code lost:
        if ((r9 instanceof X.C38911rc) == false) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0469, code lost:
        X.AnonymousClass00B.A06(r6);
        r34 = false;
        r13 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0473, code lost:
        if ((r9 instanceof X.C39151s0) == false) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0475, code lost:
        X.AnonymousClass00B.A06(r6);
        r27 = new X.C39151s0(r6, r29, (X.C39151s0) r9, r11, false);
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0489, code lost:
        if (r45 != false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x048b, code lost:
        r27.A03 = null;
        r27.A1C((java.lang.String) null);
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0492, code lost:
        X.AnonymousClass00B.A06(r6);
        r34 = false;
        r13 = r9.A10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0499, code lost:
        r27 = new X.C38631rA(r6, r29, r9, r13, r11, r34);
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04a8, code lost:
        if (r45 != false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04aa, code lost:
        r27.A1C((java.lang.String) null);
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04af, code lost:
        X.AnonymousClass00B.A06(r6);
        r27 = new X.C38701rH(r6, r29, (X.C38701rH) r3, r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04c6, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04c7, code lost:
        r0.A0W(1);
        r0.A08 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04cd, code lost:
        r0.A0W(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04d1, code lost:
        r0.A0l(r22);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04da, code lost:
        if ((r1 instanceof X.C30581cc) == false) goto L_0x04ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04dc, code lost:
        r0 = ((X.C30581cc) r1).A12(r8.A05.A02(r5, true), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04e9, code lost:
        r3 = r1.A0U;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04eb, code lost:
        if (r10 == false) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04ed, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04ee, code lost:
        X.AnonymousClass00B.A0G(r1 instanceof X.C16860tl);
        r0 = ((X.C16860tl) r1).A6L(r8.A05.A02(r5, true), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0501, code lost:
        if (r3 == null) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0503, code lost:
        r0.A0h(r3.A00());
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x050c, code lost:
        r3 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x050d, code lost:
        r0.A08 = r3;
        r10 = X.C16030sJ.A0Q(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0513, code lost:
        if (r10 == false) goto L_0x05d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0517, code lost:
        if ((r0 instanceof X.C30581cc) == false) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0519, code lost:
        r6 = new com.obwhatsapp.TextData();
        r9 = X.C47622Js.A01;
        r6.backgroundColor = r9[java.lang.Math.abs(X.C47622Js.A00.nextInt()) % r9.length];
        r6.textColor = -1;
        r6.fontStyle = 0;
        ((X.C30581cc) r0).A14(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0540, code lost:
        if (X.C42551xz.A04(r0) == false) goto L_0x05c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0542, code lost:
        r8 = new java.lang.StringBuilder();
        r5 = r0.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x054f, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0551, code lost:
        r8.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0554, code lost:
        r5 = X.C42551xz.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x055e, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0564, code lost:
        if (android.text.TextUtils.isEmpty(r8) != false) goto L_0x0569;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0566, code lost:
        r8.append("\n\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0569, code lost:
        r8.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x056c, code lost:
        r3 = r0.A0E().A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0572, code lost:
        if (r3 == null) goto L_0x0588;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0574, code lost:
        r5 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x057a, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x0588;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0580, code lost:
        if (android.text.TextUtils.isEmpty(r8) != false) goto L_0x0585;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0582, code lost:
        r8.append("\n\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0585, code lost:
        r8.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0588, code lost:
        r5 = r8.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0590, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0592, code lost:
        r0.A0k(X.C47622Js.A06(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x059b, code lost:
        if ((r0 instanceof X.C38701rH) == false) goto L_0x05d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x059d, code lost:
        r9 = (X.C38701rH) r0;
        r3 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05a2, code lost:
        if (r3 == null) goto L_0x05bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05a4, code lost:
        r8 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05a6, code lost:
        r6 = X.C47622Js.A01;
        r9.A19(new X.C42661yC(r8, r6[java.lang.Math.abs(X.C47622Js.A00.nextInt()) % r6.length]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05bf, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05c9, code lost:
        if (android.text.TextUtils.isEmpty(r1.A0I()) != false) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05cb, code lost:
        r0.A0k(X.C47622Js.A06(r0.A0I()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05d7, code lost:
        if (r18 == false) goto L_0x05e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05dd, code lost:
        if (com.obwhatsapp.yo.yo.disableFwd() != false) goto L_0x05e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05df, code lost:
        r0.A0S(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05e2, code lost:
        r0.A05 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05e8, code lost:
        if ((r0 instanceof X.C38641rB) == false) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05ea, code lost:
        ((X.C38641rB) r0).A03 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05f4, code lost:
        A0M(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05f7, code lost:
        if (r10 == false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05f9, code lost:
        r0.A0K = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05fd, code lost:
        r3 = r0.A10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05ff, code lost:
        if (r3 == 0) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0601, code lost:
        if (r3 != 1) goto L_0x061c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0603, code lost:
        if (r10 == false) goto L_0x061c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0605, code lost:
        r2.A1T.A09(r0, "request", X.C18020w1.A02(r2.A0w, r1), 0, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x061c, code lost:
        r0.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x064c, code lost:
        if (X.AnonymousClass1XM.A00(new X.AnonymousClass1XM(r11, r5), r2.A0Q.A00()) == false) goto L_0x064e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x06be, code lost:
        if (r10 < r5) goto L_0x06c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x06c0, code lost:
        r25 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06c2, code lost:
        if (r16 == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x06de, code lost:
        if (r3.A01() != false) goto L_0x06c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x06e5, code lost:
        r5 = r1.A0U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06f6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06f7, code lost:
        com.whatsapp.util.Log.e("UserActions/userActionForwardMessage ", r1);
        r2.A01.AcB("UserActions/userActionForwardMessage", r1.getMessage(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0707, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x070c, code lost:
        if (X.C38621r6.A0N(r36) == false) goto L_0x0752;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x070e, code lost:
        if (r25 != false) goto L_0x0752;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0710, code lost:
        X.AnonymousClass00B.A0G(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0713, code lost:
        if (r24 == false) goto L_0x0723;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0715, code lost:
        r38.Acl(new com.facebook.redex.RunnableRunnableShape0S0300000_I0(r2, r1, r0, 7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0722, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0723, code lost:
        r4 = new java.util.ArrayList(r26.size());
        r3 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0734, code lost:
        if (r3.hasNext() == false) goto L_0x073e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0736, code lost:
        r4.add(r3.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x073e, code lost:
        A06(new X.C43241zg(r4), (X.AnonymousClass1XQ) null, (X.C16730tY) r1, r20, false, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0751, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0752, code lost:
        r0 = r0;
        A0Q(r1, new com.facebook.redex.RunnableRunnableShape0S0300000_I0(r2, r1, r0, 6), r0, r20);
        r0 = r37.A00;
        r3 = X.C16030sJ.A0Q(r0);
        r0 = X.C16030sJ.A0L(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x076c, code lost:
        if (r3 == false) goto L_0x077b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x076e, code lost:
        r4 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x076f, code lost:
        r38.Acl(new com.facebook.redex.RunnableRunnableShape0S0201000_I0((java.lang.Object) r2, r4, (java.lang.Object) r1, 7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x077a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x077b, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x077c, code lost:
        if (r0 == false) goto L_0x076f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x077e, code lost:
        r4 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d7, code lost:
        if (r14 == false) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d9, code lost:
        if (r0 == false) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01db, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e4, code lost:
        if (X.C38621r6.A12((X.C38711rI) r1) != false) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e6, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e8, code lost:
        r23 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f0, code lost:
        if (r23.hasNext() == false) goto L_0x0708;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0651  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0682  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x06bc  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x06cc  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x06ef  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x06f2 A[EDGE_INSN: B:383:0x06f2->B:355:0x06f2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0623 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.AnonymousClass10X r41, X.C35541m6 r42, X.C16740tZ r43, java.util.List r44, boolean r45) {
        /*
            r40 = this;
            r1 = r43
            r4 = 1
            boolean r0 = r1.A10(r4)
            if (r0 != 0) goto L_0x000f
            X.1Vw r0 = r1.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0067
        L_0x000f:
            byte r2 = r1.A10
            r0 = 20
            if (r2 == r0) goto L_0x0067
            r18 = 1
            X.1Vw r0 = r1.A11
            boolean r2 = r0.A02
            int r0 = r1.A05
            if (r2 == 0) goto L_0x0059
            int r19 = java.lang.Math.max(r4, r0)
        L_0x0023:
            r2 = r40
            X.0sq r0 = r2.A1Y
            r38 = r0
            r0 = 26
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r3 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r3.<init>(r1, r0, r2)
            r0 = r38
            r0.Acl(r3)
            boolean r0 = r1 instanceof X.C38681rF
            r7 = 0
            r39 = r42
            r26 = r44
            if (r0 == 0) goto L_0x00c6
            r5 = r1
            X.0tY r5 = (X.C16730tY) r5
            X.0ta r0 = r5.A02
            if (r0 == 0) goto L_0x00e6
            java.io.File r6 = r0.A0F
            if (r6 == 0) goto L_0x00e6
            X.AnonymousClass00B.A06(r6)
            r0 = 24
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r3 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r3.<init>(r1, r0, r2)
            r0 = r38
            r0.Acl(r3)
            goto L_0x006c
        L_0x0059:
            int r0 = r0 + 1
            int r19 = java.lang.Math.max(r4, r0)
            r2 = 5
            r0 = r19
            if (r0 < r2) goto L_0x0023
            r19 = 127(0x7f, float:1.78E-43)
            goto L_0x0023
        L_0x0067:
            r18 = 0
            r19 = 0
            goto L_0x0023
        L_0x006c:
            java.lang.String r3 = r6.getAbsolutePath()     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
            X.03o r0 = new X.03o     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
            r0.<init>(r3)     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
            int r0 = r0.A07(r4)     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
            if (r0 == r4) goto L_0x00e6
            if (r0 == 0) goto L_0x00e6
            if (r45 == 0) goto L_0x0080
            goto L_0x0084
        L_0x0080:
            r0 = r7
            r25 = r7
            goto L_0x008a
        L_0x0084:
            java.util.List r0 = r1.A0q     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
            java.lang.String r25 = r5.A13()     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
        L_0x008a:
            java.lang.String r3 = "sendmedia/send-image jids:"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
            r5.<init>(r3)     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
            java.lang.Object[] r3 = r26.toArray()     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
            java.lang.String r3 = java.util.Arrays.deepToString(r3)     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
            r5.append(r3)     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
            java.lang.String r3 = r5.toString()     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
            android.net.Uri r21 = android.net.Uri.fromFile(r6)     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
            r29 = 3
            r31 = 0
            r24 = r7
            r28 = r7
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r20 = r41
            r22 = r39
            r23 = r7
            r27 = r0
            r30 = r19
            r20.A02(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ 20M | IOException | OutOfMemoryError | SecurityException -> 0x00df }
            return
        L_0x00c6:
            boolean r0 = r1 instanceof X.C38641rB
            if (r0 == 0) goto L_0x00e6
            r0 = r1
            X.0tY r0 = (X.C16730tY) r0
            long r5 = r0.A01
            r8 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e6
            X.0pt r1 = r2.A03
            r0 = 2131891869(0x7f12169d, float:1.941847E38)
        L_0x00db:
            r1.A07(r0, r4)
            return
        L_0x00df:
            r3 = move-exception
            java.lang.String r0 = "userActionForwardMessage"
            com.whatsapp.util.Log.e(r0, r3)
        L_0x00e6:
            X.0pd r3 = r2.A0y
            X.0s5 r8 = r2.A07
            boolean r0 = X.C38621r6.A0W(r8, r3, r1)
            if (r0 != 0) goto L_0x00f6
            X.0pt r1 = r2.A03
            r0 = 2131889466(0x7f120d3a, float:1.9413596E38)
            goto L_0x00db
        L_0x00f6:
            X.1Vt r0 = r1.A0L
            if (r0 == 0) goto L_0x0100
            X.0pt r1 = r2.A03
            r0 = 2131889465(0x7f120d39, float:1.9413594E38)
            goto L_0x00db
        L_0x0100:
            X.0zl r6 = r2.A0z
            X.0t9 r5 = r2.A10
            r0 = 2
            X.C42601y5.A02(r6, r5, r1, r0)
            X.1Vw r0 = r1.A11
            r37 = r0
            int r5 = r26.size()
            java.util.ArrayList r21 = new java.util.ArrayList
            r0 = r21
            r0.<init>(r5)
            int r0 = r26.size()
            if (r0 <= r4) goto L_0x014f
            X.0wK r0 = r2.A15
            X.0t3 r6 = r0.A08
            X.0sK r5 = r0.A04
            r0 = 0
            byte[] r0 = X.C224718b.A01(r5, r6, r0)
            if (r0 == 0) goto L_0x0780
            java.lang.String r22 = X.C004101u.A04(r0)
        L_0x012e:
            byte r0 = r1.A10
            r36 = r0
            boolean r0 = X.C16870tm.A00(r36)
            if (r0 == 0) goto L_0x0163
            int r0 = r1.A03()
            if (r0 != 0) goto L_0x0163
            boolean r0 = r1.A0w()
            if (r0 == 0) goto L_0x0163
            java.lang.String r0 = r1.A0I()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0163
            goto L_0x0152
        L_0x014f:
            r22 = r7
            goto L_0x012e
        L_0x0152:
            java.lang.String r5 = r1.A0I()     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException -> 0x015c }
            r0 = 0
            byte[] r20 = android.util.Base64.decode(r5, r0)     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException -> 0x015c }
            goto L_0x0165
        L_0x015c:
            r5 = move-exception
            java.lang.String r0 = "userActionForwardMessage/base64-decode/error"
            com.whatsapp.util.Log.e(r0, r5)
        L_0x0163:
            r20 = r7
        L_0x0165:
            boolean r0 = r1 instanceof X.C38711rI
            if (r0 == 0) goto L_0x06f2
            r6 = 695(0x2b7, float:9.74E-43)
            X.0tM r5 = X.C16620tM.A02
            boolean r5 = r3.A0E(r5, r6)
            if (r5 == 0) goto L_0x06f2
            r5 = r1
            X.0tY r5 = (X.C16730tY) r5
            int r6 = r5.A00
            X.0tC r5 = X.C15910s6.A1y
            int r5 = r8.A02(r5)
            if (r6 <= r5) goto L_0x06f2
            java.util.Iterator r6 = r26.iterator()
        L_0x0184:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x06f2
            java.lang.Object r5 = r6.next()
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            boolean r5 = X.C16030sJ.A0Q(r5)
            if (r5 == 0) goto L_0x0184
            r16 = 1
        L_0x0198:
            boolean r15 = r1 instanceof X.C16730tY
            if (r15 == 0) goto L_0x06e1
            r5 = r1
            X.0tY r5 = (X.C16730tY) r5
            java.lang.String r5 = r5.A04
            if (r5 == 0) goto L_0x06e1
        L_0x01a3:
            r14 = 1
        L_0x01a4:
            java.util.Iterator r8 = r26.iterator()
        L_0x01a8:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x0623
            java.lang.Object r5 = r8.next()
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            boolean r5 = X.C16030sJ.A0Q(r5)
            boolean r5 = X.C40541uI.A02(r3, r1, r5)
            if (r5 == 0) goto L_0x01a8
            X.1cv r6 = r1.A0U
            X.0tm r5 = r1.A0F()
            X.AnonymousClass00B.A06(r5)
            boolean r5 = r5.A04()
            if (r5 == 0) goto L_0x01a8
            if (r6 == 0) goto L_0x01d5
            boolean r5 = r6.A01()
            if (r5 != 0) goto L_0x01a8
        L_0x01d5:
            r25 = 0
            if (r14 == 0) goto L_0x01e6
        L_0x01d9:
            if (r0 == 0) goto L_0x01e6
            r0 = r1
            X.1rI r0 = (X.C38711rI) r0
            boolean r0 = X.C38621r6.A12(r0)
            r24 = 1
            if (r0 != 0) goto L_0x01e8
        L_0x01e6:
            r24 = 0
        L_0x01e8:
            java.util.Iterator r23 = r26.iterator()
        L_0x01ec:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x0708
            java.lang.Object r5 = r23.next()
            X.0rv r5 = (X.C15830rv) r5
            X.17g r8 = r2.A1N     // Catch:{ 2K2 -> 0x06f6 }
            X.0t3 r0 = r2.A0Q     // Catch:{ 2K2 -> 0x06f6 }
            long r11 = r0.A00()     // Catch:{ 2K2 -> 0x06f6 }
            if (r25 != 0) goto L_0x0205
            r10 = 0
            if (r24 == 0) goto L_0x0206
        L_0x0205:
            r10 = 1
        L_0x0206:
            r0 = 1024(0x400, float:1.435E-42)
            boolean r0 = r1.A10(r0)     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x022c
            X.18b r0 = r8.A05     // Catch:{ 2K2 -> 0x06f6 }
            X.1Vw r3 = r0.A02(r5, r4)     // Catch:{ 2K2 -> 0x06f6 }
            X.1uH r6 = r1.A0N     // Catch:{ 2K2 -> 0x06f6 }
            X.1cc r0 = new X.1cc     // Catch:{ 2K2 -> 0x06f6 }
            r0.<init>(r3, r11)     // Catch:{ 2K2 -> 0x06f6 }
            java.lang.String r3 = r6.A07     // Catch:{ 2K2 -> 0x06f6 }
            r0.A0k(r3)     // Catch:{ 2K2 -> 0x06f6 }
            r0.A0c(r6)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x0223:
            boolean r6 = X.C42941yx.A02(r1)     // Catch:{ 2K2 -> 0x06f6 }
            r3 = 3
            if (r6 == 0) goto L_0x050d
            goto L_0x050c
        L_0x022c:
            boolean r0 = r1 instanceof X.C39041rp     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x0249
            X.18b r0 = r8.A05     // Catch:{ 2K2 -> 0x06f6 }
            X.1Vw r3 = r0.A02(r5, r4)     // Catch:{ 2K2 -> 0x06f6 }
            java.lang.String r6 = r1.A0I()     // Catch:{ 2K2 -> 0x06f6 }
            X.1cc r0 = new X.1cc     // Catch:{ 2K2 -> 0x06f6 }
            r0.<init>(r3, r11)     // Catch:{ 2K2 -> 0x06f6 }
            r3 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r3 = X.AnonymousClass1ZW.A04(r3, r6)     // Catch:{ 2K2 -> 0x06f6 }
            r0.A0k(r3)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0223
        L_0x0249:
            if (r15 == 0) goto L_0x04d8
            r3 = r1
            X.0tY r3 = (X.C16730tY) r3     // Catch:{ 2K2 -> 0x06f6 }
            X.0ta r0 = r3.A02     // Catch:{ 2K2 -> 0x06f6 }
            r35 = r0
            X.AnonymousClass00B.A06(r35)     // Catch:{ 2K2 -> 0x06f6 }
            if (r10 == 0) goto L_0x025c
            X.0ta r6 = r35.A02()     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0264
        L_0x025c:
            X.0ta r6 = new X.0ta     // Catch:{ 2K2 -> 0x06f6 }
            r6.<init>(r0)     // Catch:{ 2K2 -> 0x06f6 }
            r0 = 0
            r6.A0P = r0     // Catch:{ 2K2 -> 0x06f6 }
        L_0x0264:
            long r13 = r6.A0B     // Catch:{ 2K2 -> 0x06f6 }
            r16 = 0
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0270
            long r13 = r3.A0I     // Catch:{ 2K2 -> 0x06f6 }
            r6.A0B = r13     // Catch:{ 2K2 -> 0x06f6 }
        L_0x0270:
            X.18b r0 = r8.A05     // Catch:{ 2K2 -> 0x06f6 }
            X.1Vw r29 = r0.A02(r5, r4)     // Catch:{ 2K2 -> 0x06f6 }
            r13 = r6
            boolean r0 = r3 instanceof X.C38641rB     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x0337
            r9 = r3
            X.1rB r9 = (X.C38641rB) r9     // Catch:{ 2K2 -> 0x06f6 }
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
            r33 = 0
            X.1rB r0 = new X.1rB     // Catch:{ 2K2 -> 0x06f6 }
            r27 = r0
            r28 = r6
            r30 = r9
            r31 = r11
            r27.<init>(r28, r29, r30, r31, r33)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x0290:
            X.0pd r11 = r8.A04     // Catch:{ 2K2 -> 0x06f6 }
            X.1Vw r8 = r0.A11     // Catch:{ 2K2 -> 0x06f6 }
            X.0rv r8 = r8.A00     // Catch:{ 2K2 -> 0x06f6 }
            boolean r8 = X.C16030sJ.A0Q(r8)     // Catch:{ 2K2 -> 0x06f6 }
            boolean r8 = X.C40541uI.A02(r11, r3, r8)     // Catch:{ 2K2 -> 0x06f6 }
            if (r8 == 0) goto L_0x02cb
            X.1cv r8 = r3.A0U     // Catch:{ 2K2 -> 0x06f6 }
            if (r8 == 0) goto L_0x02cb
            boolean r8 = r8.A01()     // Catch:{ 2K2 -> 0x06f6 }
            if (r8 == 0) goto L_0x02cb
            X.0tm r8 = r3.A0F()     // Catch:{ 2K2 -> 0x06f6 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ 2K2 -> 0x06f6 }
            boolean r8 = r8.A04()     // Catch:{ 2K2 -> 0x06f6 }
            if (r8 == 0) goto L_0x02cb
            X.1cv r8 = r3.A0U     // Catch:{ 2K2 -> 0x06f6 }
            byte[] r8 = r8.A09     // Catch:{ 2K2 -> 0x06f6 }
            byte[] r6 = r6.A0U     // Catch:{ 2K2 -> 0x06f6 }
            boolean r6 = java.util.Arrays.equals(r8, r6)     // Catch:{ 2K2 -> 0x06f6 }
            if (r6 != 0) goto L_0x031f
            java.lang.String r3 = "FMessageFactory/newFMessageForForward/thumbnail and media file key not the same"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 2K2 -> 0x06f6 }
            r0.A0h(r7)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x02cb:
            boolean r3 = X.C40541uI.A00(r11, r0)     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 == 0) goto L_0x02da
            X.1y4 r3 = r0.A12()     // Catch:{ 2K2 -> 0x06f6 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ 2K2 -> 0x06f6 }
            r3.A05 = r4     // Catch:{ 2K2 -> 0x06f6 }
        L_0x02da:
            if (r10 == 0) goto L_0x02de
            goto L_0x04cd
        L_0x02de:
            boolean r3 = r0 instanceof X.C38681rF     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 == 0) goto L_0x04c7
            r0.A05 = r7     // Catch:{ 2K2 -> 0x06f6 }
            r0.A04 = r7     // Catch:{ 2K2 -> 0x06f6 }
            X.0ta r3 = r0.A02     // Catch:{ 2K2 -> 0x06f6 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ 2K2 -> 0x06f6 }
            r3.A0K = r7     // Catch:{ 2K2 -> 0x06f6 }
            r3.A0J = r7     // Catch:{ 2K2 -> 0x06f6 }
            X.1y4 r10 = r0.A12()     // Catch:{ 2K2 -> 0x06f6 }
            if (r10 == 0) goto L_0x04c7
            int[] r6 = r10.A06()     // Catch:{ 2K2 -> 0x06f6 }
            r10.A01()     // Catch:{ 2K2 -> 0x06f6 }
            if (r6 == 0) goto L_0x04c7
            int r12 = r6.length     // Catch:{ 2K2 -> 0x06f6 }
            r3 = 4
            if (r12 != r3) goto L_0x04c7
            r13 = 0
            r11 = 0
        L_0x0305:
            r3 = r6[r11]     // Catch:{ 2K2 -> 0x06f6 }
            long r8 = (long) r3     // Catch:{ 2K2 -> 0x06f6 }
            long r13 = r13 + r8
            int r11 = r11 + 1
            if (r11 < r12) goto L_0x0305
            X.0ta r3 = r0.A02     // Catch:{ 2K2 -> 0x06f6 }
            long r8 = r3.A0A     // Catch:{ 2K2 -> 0x06f6 }
            int r3 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x04c7
            monitor-enter(r10)     // Catch:{ 2K2 -> 0x06f6 }
            r10.A03 = r6     // Catch:{ all -> 0x031c }
            r10.A01 = r4     // Catch:{ all -> 0x031c }
            goto L_0x04c6
        L_0x031c:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0342
        L_0x031f:
            X.1cv r3 = r3.A0U     // Catch:{ 2K2 -> 0x06f6 }
            X.1cv r6 = r3.A00()     // Catch:{ 2K2 -> 0x06f6 }
            r3 = r35
            long r8 = r3.A0B     // Catch:{ 2K2 -> 0x06f6 }
            r6.A02 = r8     // Catch:{ 2K2 -> 0x06f6 }
            r6.A08 = r10     // Catch:{ 2K2 -> 0x06f6 }
            boolean r3 = X.C40541uI.A01(r11, r0)     // Catch:{ 2K2 -> 0x06f6 }
            r6.A0B = r3     // Catch:{ 2K2 -> 0x06f6 }
            r0.A0h(r6)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x02cb
        L_0x0337:
            boolean r0 = r3 instanceof X.C39021rn     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x0343
            java.lang.String r0 = "Order messages can not be forwarded"
            X.2K2 r1 = new X.2K2     // Catch:{ 2K2 -> 0x06f6 }
            r1.<init>(r0)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x0342:
            throw r1     // Catch:{ 2K2 -> 0x06f6 }
        L_0x0343:
            boolean r0 = r3 instanceof X.C38991rk     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x034f
            java.lang.String r0 = "ViewOnce messages can not be forwarded"
            X.2K2 r1 = new X.2K2     // Catch:{ 2K2 -> 0x06f6 }
            r1.<init>(r0)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0342
        L_0x034f:
            boolean r0 = r3 instanceof X.C38681rF     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x036f
            r9 = r3
            X.1rF r9 = (X.C38681rF) r9     // Catch:{ 2K2 -> 0x06f6 }
            boolean r0 = r9 instanceof X.C38891ra     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x0381
            X.1ra r9 = (X.C38891ra) r9     // Catch:{ 2K2 -> 0x06f6 }
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
            r33 = 0
            X.1ra r0 = new X.1ra     // Catch:{ 2K2 -> 0x06f6 }
            r27 = r0
            r28 = r6
            r30 = r9
            r31 = r11
            r27.<init>(r28, r29, r30, r31, r33)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x037b
        L_0x036f:
            boolean r0 = r3 instanceof X.C39011rm     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x03ea
            java.lang.String r0 = "ViewOnce messages can not be forwarded"
            X.2K2 r1 = new X.2K2     // Catch:{ 2K2 -> 0x06f6 }
            r1.<init>(r0)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0342
        L_0x037b:
            if (r45 != 0) goto L_0x0290
            r0.A03 = r7     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0290
        L_0x0381:
            boolean r0 = r9 instanceof X.C38901rb     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x0396
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
            X.1rF r0 = new X.1rF     // Catch:{ 2K2 -> 0x06f6 }
            r27 = r0
            r28 = r6
            r30 = r9
            r31 = r11
            r27.<init>(r28, r29, r30, r31)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x03e4
        L_0x0396:
            boolean r0 = r9 instanceof X.C39111rw     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x03b4
            X.1rw r9 = (X.C39111rw) r9     // Catch:{ 2K2 -> 0x06f6 }
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
            r33 = 0
            X.1rw r0 = new X.1rw     // Catch:{ 2K2 -> 0x06f6 }
            r27 = r0
            r28 = r6
            r30 = r9
            r31 = r11
            r27.<init>(r28, r29, r30, r31, r33)     // Catch:{ 2K2 -> 0x06f6 }
            if (r45 != 0) goto L_0x0290
            r0.A03 = r7     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0290
        L_0x03b4:
            boolean r0 = r9 instanceof X.C38981rj     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x03d2
            X.1rj r9 = (X.C38981rj) r9     // Catch:{ 2K2 -> 0x06f6 }
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
            r33 = 0
            X.1rj r0 = new X.1rj     // Catch:{ 2K2 -> 0x06f6 }
            r27 = r0
            r28 = r6
            r30 = r9
            r31 = r11
            r27.<init>(r28, r29, r30, r31, r33)     // Catch:{ 2K2 -> 0x06f6 }
            if (r45 != 0) goto L_0x0290
            r0.A03 = r7     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0290
        L_0x03d2:
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
            r33 = 0
            X.1rF r0 = new X.1rF     // Catch:{ 2K2 -> 0x06f6 }
            r27 = r0
            r28 = r6
            r30 = r9
            r31 = r11
            r27.<init>(r28, r29, r30, r31, r33)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x03e4:
            if (r45 != 0) goto L_0x0290
            r0.A03 = r7     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0290
        L_0x03ea:
            boolean r0 = r3 instanceof X.C38711rI     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x0428
            r9 = r3
            X.1rI r9 = (X.C38711rI) r9     // Catch:{ 2K2 -> 0x06f6 }
            boolean r0 = r9 instanceof X.C39141rz     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x0406
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x03f8:
            X.1rI r0 = new X.1rI     // Catch:{ 2K2 -> 0x06f6 }
            r27 = r0
            r28 = r13
            r30 = r9
            r31 = r11
            r27.<init>(r28, r29, r30, r31)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0422
        L_0x0406:
            boolean r0 = r9 instanceof X.C38921rd     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x0410
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
            X.0ta r13 = r9.A02     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x03f8
        L_0x0410:
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
            r33 = 0
            X.1rI r0 = new X.1rI     // Catch:{ 2K2 -> 0x06f6 }
            r27 = r0
            r28 = r6
            r30 = r9
            r31 = r11
            r27.<init>((X.C16750ta) r28, (X.C28381Vw) r29, (X.C38711rI) r30, (long) r31, (boolean) r33)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x0422:
            if (r45 != 0) goto L_0x0290
            r0.A03 = r7     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0290
        L_0x0428:
            boolean r0 = r3 instanceof X.C38801rR     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x045e
            r9 = r3
            X.1rR r9 = (X.C38801rR) r9     // Catch:{ 2K2 -> 0x06f6 }
            boolean r0 = r9 instanceof X.C38931re     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x0446
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
            X.0ta r13 = r9.A02     // Catch:{ 2K2 -> 0x06f6 }
            X.1rR r0 = new X.1rR     // Catch:{ 2K2 -> 0x06f6 }
            r27 = r0
            r28 = r13
            r30 = r9
            r31 = r11
            r27.<init>(r28, r29, r30, r31)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0458
        L_0x0446:
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
            r33 = 0
            X.1rR r0 = new X.1rR     // Catch:{ 2K2 -> 0x06f6 }
            r27 = r0
            r28 = r6
            r30 = r9
            r31 = r11
            r27.<init>((X.C16750ta) r28, (X.C28381Vw) r29, (X.C38801rR) r30, (long) r31, (boolean) r33)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x0458:
            if (r45 != 0) goto L_0x0290
            r0.A03 = r7     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0290
        L_0x045e:
            boolean r0 = r3 instanceof X.C38631rA     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x04af
            r9 = r3
            X.1rA r9 = (X.C38631rA) r9     // Catch:{ 2K2 -> 0x06f6 }
            boolean r0 = r9 instanceof X.C38911rc     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x0471
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
            r34 = 0
            r13 = 9
            goto L_0x0499
        L_0x0471:
            boolean r0 = r9 instanceof X.C39151s0     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x0492
            X.1s0 r9 = (X.C39151s0) r9     // Catch:{ 2K2 -> 0x06f6 }
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
            r33 = 0
            X.1s0 r0 = new X.1s0     // Catch:{ 2K2 -> 0x06f6 }
            r27 = r0
            r28 = r6
            r30 = r9
            r31 = r11
            r27.<init>(r28, r29, r30, r31, r33)     // Catch:{ 2K2 -> 0x06f6 }
            if (r45 != 0) goto L_0x0290
            r0.A03 = r7     // Catch:{ 2K2 -> 0x06f6 }
            r0.A1C(r7)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0290
        L_0x0492:
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
            r34 = 0
            byte r13 = r9.A10     // Catch:{ 2K2 -> 0x06f6 }
        L_0x0499:
            X.1rA r0 = new X.1rA     // Catch:{ 2K2 -> 0x06f6 }
            r27 = r0
            r28 = r6
            r30 = r9
            r31 = r13
            r32 = r11
            r27.<init>(r28, r29, r30, r31, r32, r34)     // Catch:{ 2K2 -> 0x06f6 }
            if (r45 != 0) goto L_0x0290
            r0.A1C(r7)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0290
        L_0x04af:
            r9 = r3
            X.1rH r9 = (X.C38701rH) r9     // Catch:{ 2K2 -> 0x06f6 }
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2K2 -> 0x06f6 }
            r33 = 0
            X.1rH r0 = new X.1rH     // Catch:{ 2K2 -> 0x06f6 }
            r27 = r0
            r28 = r6
            r30 = r9
            r31 = r11
            r27.<init>(r28, r29, r30, r31, r33)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0290
        L_0x04c6:
            monitor-exit(r10)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x04c7:
            r0.A0W(r4)     // Catch:{ 2K2 -> 0x06f6 }
            r0.A08 = r7     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x04d1
        L_0x04cd:
            r3 = 2
            r0.A0W(r3)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x04d1:
            r3 = r22
            r0.A0l(r3)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0223
        L_0x04d8:
            boolean r0 = r1 instanceof X.C30581cc     // Catch:{ 2K2 -> 0x06f6 }
            if (r0 == 0) goto L_0x04ee
            r3 = r1
            X.1cc r3 = (X.C30581cc) r3     // Catch:{ 2K2 -> 0x06f6 }
            X.18b r0 = r8.A05     // Catch:{ 2K2 -> 0x06f6 }
            X.1Vw r0 = r0.A02(r5, r4)     // Catch:{ 2K2 -> 0x06f6 }
            X.1cc r0 = r3.A12(r0, r11)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x04e9:
            X.1cv r3 = r1.A0U     // Catch:{ 2K2 -> 0x06f6 }
            if (r10 == 0) goto L_0x0223
            goto L_0x0501
        L_0x04ee:
            boolean r0 = r1 instanceof X.C16860tl     // Catch:{ 2K2 -> 0x06f6 }
            X.AnonymousClass00B.A0G(r0)     // Catch:{ 2K2 -> 0x06f6 }
            r3 = r1
            X.0tl r3 = (X.C16860tl) r3     // Catch:{ 2K2 -> 0x06f6 }
            X.18b r0 = r8.A05     // Catch:{ 2K2 -> 0x06f6 }
            X.1Vw r0 = r0.A02(r5, r4)     // Catch:{ 2K2 -> 0x06f6 }
            X.0tZ r0 = r3.A6L(r0, r11)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x04e9
        L_0x0501:
            if (r3 == 0) goto L_0x0223
            X.1cv r3 = r3.A00()     // Catch:{ 2K2 -> 0x06f6 }
            r0.A0h(r3)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0223
        L_0x050c:
            r3 = 7
        L_0x050d:
            r0.A08 = r3     // Catch:{ 2K2 -> 0x06f6 }
            boolean r10 = X.C16030sJ.A0Q(r5)     // Catch:{ 2K2 -> 0x06f6 }
            if (r10 == 0) goto L_0x05d7
            boolean r3 = r0 instanceof X.C30581cc     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 == 0) goto L_0x0599
            r8 = r0
            X.1cc r8 = (X.C30581cc) r8     // Catch:{ 2K2 -> 0x06f6 }
            com.obwhatsapp.TextData r6 = new com.obwhatsapp.TextData     // Catch:{ 2K2 -> 0x06f6 }
            r6.<init>()     // Catch:{ 2K2 -> 0x06f6 }
            int[] r9 = X.C47622Js.A01     // Catch:{ 2K2 -> 0x06f6 }
            java.util.Random r3 = X.C47622Js.A00     // Catch:{ 2K2 -> 0x06f6 }
            int r3 = r3.nextInt()     // Catch:{ 2K2 -> 0x06f6 }
            int r5 = java.lang.Math.abs(r3)     // Catch:{ 2K2 -> 0x06f6 }
            int r3 = r9.length     // Catch:{ 2K2 -> 0x06f6 }
            int r5 = r5 % r3
            r3 = r9[r5]     // Catch:{ 2K2 -> 0x06f6 }
            r6.backgroundColor = r3     // Catch:{ 2K2 -> 0x06f6 }
            r3 = -1
            r6.textColor = r3     // Catch:{ 2K2 -> 0x06f6 }
            r3 = 0
            r6.fontStyle = r3     // Catch:{ 2K2 -> 0x06f6 }
            r8.A14(r6)     // Catch:{ 2K2 -> 0x06f6 }
            boolean r3 = X.C42551xz.A04(r0)     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 == 0) goto L_0x05c1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ 2K2 -> 0x06f6 }
            r8.<init>()     // Catch:{ 2K2 -> 0x06f6 }
            java.lang.String r5 = r0.A0I()     // Catch:{ 2K2 -> 0x06f6 }
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 != 0) goto L_0x0554
            r8.append(r5)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x0554:
            java.lang.String r5 = X.C42551xz.A01(r0)     // Catch:{ 2K2 -> 0x06f6 }
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch:{ 2K2 -> 0x06f6 }
            java.lang.String r6 = "\n\n"
            if (r3 != 0) goto L_0x056c
            boolean r3 = android.text.TextUtils.isEmpty(r8)     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 != 0) goto L_0x0569
            r8.append(r6)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x0569:
            r8.append(r5)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x056c:
            X.1sA r3 = r0.A0E()     // Catch:{ 2K2 -> 0x06f6 }
            X.1sB r3 = r3.A00     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 == 0) goto L_0x0588
            java.lang.String r5 = r3.A01     // Catch:{ 2K2 -> 0x06f6 }
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 != 0) goto L_0x0588
            boolean r3 = android.text.TextUtils.isEmpty(r8)     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 != 0) goto L_0x0585
            r8.append(r6)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x0585:
            r8.append(r5)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x0588:
            java.lang.String r5 = r8.toString()     // Catch:{ 2K2 -> 0x06f6 }
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 != 0) goto L_0x0599
            java.lang.String r3 = X.C47622Js.A06(r5)     // Catch:{ 2K2 -> 0x06f6 }
            r0.A0k(r3)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x0599:
            boolean r3 = r0 instanceof X.C38701rH     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 == 0) goto L_0x05d7
            r9 = r0
            X.1rH r9 = (X.C38701rH) r9     // Catch:{ 2K2 -> 0x06f6 }
            X.1yC r3 = r9.A00     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 == 0) goto L_0x05bf
            byte[] r8 = r3.A02     // Catch:{ 2K2 -> 0x06f6 }
        L_0x05a6:
            int[] r6 = X.C47622Js.A01     // Catch:{ 2K2 -> 0x06f6 }
            java.util.Random r3 = X.C47622Js.A00     // Catch:{ 2K2 -> 0x06f6 }
            int r3 = r3.nextInt()     // Catch:{ 2K2 -> 0x06f6 }
            int r5 = java.lang.Math.abs(r3)     // Catch:{ 2K2 -> 0x06f6 }
            int r3 = r6.length     // Catch:{ 2K2 -> 0x06f6 }
            int r5 = r5 % r3
            r5 = r6[r5]     // Catch:{ 2K2 -> 0x06f6 }
            X.1yC r3 = new X.1yC     // Catch:{ 2K2 -> 0x06f6 }
            r3.<init>(r8, r5)     // Catch:{ 2K2 -> 0x06f6 }
            r9.A19(r3)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x05d7
        L_0x05bf:
            r8 = r7
            goto L_0x05a6
        L_0x05c1:
            java.lang.String r3 = r1.A0I()     // Catch:{ 2K2 -> 0x06f6 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 != 0) goto L_0x0599
            java.lang.String r3 = r0.A0I()     // Catch:{ 2K2 -> 0x06f6 }
            java.lang.String r3 = X.C47622Js.A06(r3)     // Catch:{ 2K2 -> 0x06f6 }
            r0.A0k(r3)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x0599
        L_0x05d7:
            if (r18 == 0) goto L_0x05e6
            boolean r3 = com.obwhatsapp.yo.yo.disableFwd()     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 != 0) goto L_0x05e2
            r0.A0S(r4)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x05e2:
            r3 = r19
            r0.A05 = r3     // Catch:{ 2K2 -> 0x06f6 }
        L_0x05e6:
            boolean r3 = r0 instanceof X.C38641rB     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 == 0) goto L_0x05f4
            r5 = r0
            X.1rB r5 = (X.C38641rB) r5     // Catch:{ 2K2 -> 0x06f6 }
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ 2K2 -> 0x06f6 }
            r5.A03 = r3     // Catch:{ 2K2 -> 0x06f6 }
        L_0x05f4:
            r2.A0M(r0)     // Catch:{ 2K2 -> 0x06f6 }
            if (r10 == 0) goto L_0x05fd
            r3 = r39
            r0.A0K = r3     // Catch:{ 2K2 -> 0x06f6 }
        L_0x05fd:
            byte r3 = r0.A10     // Catch:{ 2K2 -> 0x06f6 }
            if (r3 == 0) goto L_0x0603
            if (r3 != r4) goto L_0x061c
        L_0x0603:
            if (r10 == 0) goto L_0x061c
            X.0w2 r3 = r2.A0w     // Catch:{ 2K2 -> 0x06f6 }
            int r30 = X.C18020w1.A02(r3, r1)     // Catch:{ 2K2 -> 0x06f6 }
            X.1L1 r3 = r2.A1T     // Catch:{ 2K2 -> 0x06f6 }
            r31 = 0
            java.lang.String r29 = "request"
            r33 = 0
            r34 = 0
            r27 = r3
            r28 = r0
            r27.A09(r28, r29, r30, r31, r33, r34)     // Catch:{ 2K2 -> 0x06f6 }
        L_0x061c:
            r3 = r21
            r3.add(r0)     // Catch:{ 2K2 -> 0x06f6 }
            goto L_0x01ec
        L_0x0623:
            if (r15 == 0) goto L_0x0689
            r6 = r1
            X.0tY r6 = (X.C16730tY) r6
            X.0ta r5 = r6.A02
            X.AnonymousClass00B.A06(r5)
            long r8 = r6.A0I
            byte[] r11 = r5.A0U
            long r5 = r5.A0B
        L_0x0633:
            if (r11 == 0) goto L_0x064e
            r12 = 0
            int r10 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x063c
            r5 = r8
        L_0x063c:
            X.1XM r8 = new X.1XM
            r8.<init>(r11, r5)
            X.0t3 r5 = r2.A0Q
            long r5 = r5.A00()
            boolean r5 = X.AnonymousClass1XM.A00(r8, r5)
            r8 = 1
            if (r5 != 0) goto L_0x064f
        L_0x064e:
            r8 = 0
        L_0x064f:
            if (r15 == 0) goto L_0x0682
            r5 = r1
            X.0tY r5 = (X.C16730tY) r5
            java.lang.String r5 = r5.A08
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r6 = r5 ^ 1
        L_0x065c:
            if (r14 == 0) goto L_0x01d5
            if (r8 == 0) goto L_0x01d5
            if (r6 == 0) goto L_0x01d5
            X.0sK r6 = r2.A05
            X.0t3 r5 = r2.A0Q
            long r10 = r5.A00()
            r8 = 1505(0x5e1, float:2.109E-42)
            X.0tM r5 = X.C16620tM.A02
            boolean r3 = r3.A0E(r5, r8)
            if (r3 == 0) goto L_0x0698
            if (r15 == 0) goto L_0x0698
            r3 = r37
            X.0rv r3 = r3.A00
            boolean r3 = X.C16030sJ.A0Q(r3)
            if (r3 == 0) goto L_0x0698
            goto L_0x01d5
        L_0x0682:
            boolean r5 = r1 instanceof X.C30581cc
            r6 = 0
            if (r5 == 0) goto L_0x065c
            r6 = 1
            goto L_0x065c
        L_0x0689:
            boolean r5 = r1 instanceof X.C30581cc
            if (r5 == 0) goto L_0x064e
            X.1cv r5 = r1.A0U
            if (r5 == 0) goto L_0x064e
            byte[] r11 = r5.A09
            long r5 = r5.A02
            long r8 = r1.A0I
            goto L_0x0633
        L_0x0698:
            boolean r3 = X.C30921dB.A00(r36)
            if (r3 != 0) goto L_0x01d5
            r5 = 78
            r3 = r36
            if (r3 == r5) goto L_0x01d5
            boolean r3 = X.C38621r6.A0N(r36)
            if (r3 == 0) goto L_0x06c6
            boolean r3 = X.C30921dB.A01(r6, r1)
            if (r3 != 0) goto L_0x06c6
            long r5 = r1.A0I
            r8 = 432000000(0x19bfcc00, double:2.13436359E-315)
            long r5 = r5 + r8
            r8 = 0
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x06c6
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x06c6
        L_0x06c0:
            r25 = 1
            if (r16 == 0) goto L_0x01d9
            goto L_0x01d5
        L_0x06c6:
            boolean r3 = X.C30921dB.A04(r1)
            if (r3 == 0) goto L_0x01d5
            long r5 = r1.A0I
            r8 = 432000000(0x19bfcc00, double:2.13436359E-315)
            long r10 = r10 - r8
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x01d5
            X.1cv r3 = r1.A0U
            if (r3 == 0) goto L_0x01d5
            boolean r3 = r3.A01()
            if (r3 == 0) goto L_0x01d5
            goto L_0x06c0
        L_0x06e1:
            boolean r5 = r1 instanceof X.C30581cc
            if (r5 == 0) goto L_0x06ef
            X.1cv r5 = r1.A0U
            if (r5 == 0) goto L_0x06ef
            java.lang.String r5 = r5.A05
            if (r5 == 0) goto L_0x06ef
            goto L_0x01a3
        L_0x06ef:
            r14 = 0
            goto L_0x01a4
        L_0x06f2:
            r16 = 0
            goto L_0x0198
        L_0x06f6:
            r1 = move-exception
            java.lang.String r0 = "UserActions/userActionForwardMessage "
            com.whatsapp.util.Log.e(r0, r1)
            X.0so r2 = r2.A01
            java.lang.String r1 = r1.getMessage()
            java.lang.String r0 = "UserActions/userActionForwardMessage"
            r2.AcB(r0, r1, r4)
            return
        L_0x0708:
            boolean r0 = X.C38621r6.A0N(r36)
            if (r0 == 0) goto L_0x0752
            if (r25 != 0) goto L_0x0752
            X.AnonymousClass00B.A0G(r15)
            if (r24 == 0) goto L_0x0723
            r4 = 7
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r0 = r21
            r3.<init>(r2, r1, r0, r4)
            r0 = r38
            r0.Acl(r3)
            return
        L_0x0723:
            int r0 = r26.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r3 = r21.iterator()
        L_0x0730:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x073e
            java.lang.Object r0 = r3.next()
            r4.add(r0)
            goto L_0x0730
        L_0x073e:
            X.1zg r0 = new X.1zg
            r0.<init>(r4)
            X.0tY r1 = (X.C16730tY) r1
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r2
            r4 = r0
            r5 = r7
            r6 = r1
            r7 = r20
            r3.A06(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0752:
            r3 = 6
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r4 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r0 = r21
            r4.<init>(r2, r1, r0, r3)
            r3 = r0
            r0 = r20
            r2.A0Q(r1, r4, r3, r0)
            r0 = r37
            X.0rv r0 = r0.A00
            boolean r3 = X.C16030sJ.A0Q(r0)
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r3 == 0) goto L_0x077b
            r4 = 4
        L_0x076f:
            r0 = 7
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0
            r3.<init>((java.lang.Object) r2, (int) r4, (java.lang.Object) r1, (int) r0)
            r0 = r38
            r0.Acl(r3)
            return
        L_0x077b:
            r4 = 2
            if (r0 == 0) goto L_0x076f
            r4 = 3
            goto L_0x076f
        L_0x0780:
            java.lang.String r1 = "multicast id could not be created"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16760tb.A08(X.10X, X.1m6, X.0tZ, java.util.List, boolean):void");
    }

    public void A09(AnonymousClass1ZR r20, C41681wN r21, C35541m6 r22, C40531uH r23, C16740tZ r24, String str, List list, List list2, boolean z2, boolean z3, boolean z4) {
        C30771cv r0;
        C41681wN r4 = r21;
        C30771cv r13 = r21 != null ? r4.A03 : null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30581cc A022 = A02(r20, r22, (C15830rv) it.next(), r23, r24, r13, str, list2, z2, z3, z4);
            if (r21 == null || (r0 = r4.A03) == null || r0.A01() || r4.A00 != 3) {
                this.A0e.A0W(A022);
            } else {
                this.A0e.A0d(A022, 1);
                String str2 = r4.A05;
                AnonymousClass21F r1 = r4.A02;
                if (r1 != null && str2.equals(r1.A02)) {
                    r1.A00 = A022;
                }
                this.A03.A0L(new RunnableRunnableShape0S0300000_I0(this, r4, A022, 11), 3000);
            }
        }
    }

    public void A0A(AnonymousClass1ZR r13, C35541m6 r14, C16740tZ r15, String str, List list, List list2, boolean z2, boolean z3) {
        A09(r13, (C41681wN) null, r14, (C40531uH) null, r15, str, list, list2, z2, z3, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.0rv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.0rv} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.C15830rv r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0026
            boolean r0 = X.C16030sJ.A0G(r4)
            if (r0 != 0) goto L_0x0026
            X.0sK r0 = r3.A05
            boolean r0 = r0.A0I(r4)
            if (r0 != 0) goto L_0x0026
            X.1H8 r0 = r3.A04
            android.os.Handler r2 = r0.A00
            java.util.HashMap r1 = r0.A06
            java.lang.Object r0 = r1.get(r4)
            if (r0 == 0) goto L_0x0027
            r4 = r0
        L_0x001d:
            r1 = 1
            r0 = 0
            android.os.Message r0 = r2.obtainMessage(r1, r0, r0, r4)
            r0.sendToTarget()
        L_0x0026:
            return
        L_0x0027:
            r1.put(r4, r4)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16760tb.A0B(X.0rv):void");
    }

    public final void A0C(C15830rv r7) {
        C16220sf r5 = this.A1R;
        if (r5.A07(r7.getRawString()).A0G) {
            C18930xU r4 = this.A0I;
            Set A0D2 = r4.A0D(r7, false);
            r5.A08(r7, 0, false);
            r4.A0V(A0D2);
        }
    }

    public void A0D(C15830rv r10, int i2) {
        A0F(r10, i2, 0, false);
        C18930xU r2 = this.A0I;
        Set A0B2 = r2.A0B(r10, 0, false);
        if (this.A1R.A0P(r10)) {
            r2.A0V(A0B2);
        } else {
            r2.A0U(A0B2);
        }
        if (C16030sJ.A0L(r10)) {
            Context context = this.A0R.A00;
            Log.i("GCM: force updating push config");
            RegistrationIntentService.A03(context, (String) null, (String) null, (String) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.0rv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.0rv} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.C15830rv r4, int r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0030
            boolean r0 = X.C16030sJ.A0G(r4)
            if (r0 != 0) goto L_0x0030
            boolean r0 = X.C16030sJ.A0L(r4)
            if (r0 == 0) goto L_0x0013
            X.125 r0 = r3.A1K
            r0.A05(r4)
        L_0x0013:
            X.0sK r0 = r3.A05
            boolean r0 = r0.A0I(r4)
            if (r0 != 0) goto L_0x0030
            X.1H8 r0 = r3.A04
            android.os.Handler r2 = r0.A00
            java.util.HashMap r1 = r0.A06
            java.lang.Object r0 = r1.get(r4)
            if (r0 == 0) goto L_0x0031
            r4 = r0
        L_0x0028:
            r0 = 0
            android.os.Message r0 = r2.obtainMessage(r0, r0, r5, r4)
            r0.sendToTarget()
        L_0x0030:
            return
        L_0x0031:
            r1.put(r4, r4)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16760tb.A0E(X.0rv, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.C15830rv r19, int r20, long r21, boolean r23) {
        /*
            r18 = this;
            r16 = 0
            r15 = 0
            r9 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            int r0 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            r14 = 0
            r6 = 3
            if (r0 == 0) goto L_0x0010
            r14 = 1
            r6 = 2
        L_0x0010:
            r7 = r18
            X.0z4 r3 = r7.A1H
            r10 = r20
            if (r10 == r9) goto L_0x0158
            r2 = 2
            if (r10 == r2) goto L_0x0152
            r1 = 4
            r0 = 3
            if (r10 == r0) goto L_0x014c
            if (r10 == r1) goto L_0x0152
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0025:
            int r1 = r0.intValue()
            r0 = 0
            r11 = r19
            r3.A08(r11, r0, r1, r6)
            int r0 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0148
            r1 = -1
            int r0 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0128
            r4 = -1
        L_0x003b:
            X.0vb r2 = r7.A0G
            r2.A03 = r4
            X.2Jt r12 = new X.2Jt
            r12.<init>()
            X.0zl r0 = r7.A0z
            boolean r0 = X.C40561uK.A01(r0, r11)
            if (r0 == 0) goto L_0x005a
            r0 = 1
            if (r10 == r9) goto L_0x0122
            r0 = 2
            if (r10 == r0) goto L_0x0122
            r0 = 3
            if (r10 == r0) goto L_0x0122
            r0 = 0
        L_0x0056:
            r12.A03 = r0
            r12.A04 = r8
        L_0x005a:
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r12.A05 = r3
            r10 = 2
            r0 = 2
            if (r14 == 0) goto L_0x0065
            r0 = 1
        L_0x0065:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.A00 = r0
            if (r14 == 0) goto L_0x0077
            r0 = 1
            if (r23 == 0) goto L_0x0071
            r0 = 2
        L_0x0071:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.A01 = r0
        L_0x0077:
            r12.A02 = r8
            boolean r13 = X.C16030sJ.A0L(r11)
            if (r13 == 0) goto L_0x0120
            X.0sO r6 = r7.A0j
            r1 = r11
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            boolean r0 = r6.A09(r1)
            if (r0 == 0) goto L_0x0120
            r8 = 1
            X.0us r0 = r6.A07
            X.1cE r0 = r0.A04(r1)
            java.util.Map r0 = r0.A04
            int r0 = r0.size()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12.A06 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r12.A02 = r0
        L_0x00a4:
            X.0t9 r6 = r7.A10
            r6.A04(r12)
            if (r8 == 0) goto L_0x011e
            X.0sO r10 = r7.A0j
            X.0sL r1 = X.C16050sL.A03(r11)
            X.AnonymousClass00B.A06(r1)
            X.0us r0 = r10.A07
            X.1cE r0 = r0.A04(r1)
            java.util.ArrayList r0 = r0.A0C()
            java.util.Iterator r8 = r0.iterator()
        L_0x00c2:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x011e
            java.lang.Object r0 = r8.next()
            X.1ck r0 = (X.C30661ck) r0
            X.0sG r1 = r10.A02
            com.whatsapp.jid.UserJid r0 = r0.A03
            X.0sH r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x00c2
            r1 = 1
        L_0x00df:
            if (r13 != 0) goto L_0x00f0
            X.0sG r0 = r7.A0J
            X.0sH r0 = r0.A08(r11)
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x00f0
            r15 = 1
        L_0x00f0:
            if (r1 != 0) goto L_0x00f4
            if (r15 == 0) goto L_0x0106
        L_0x00f4:
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x010d
            X.2Ju r1 = new X.2Ju
            r1.<init>()
            java.lang.String r0 = r11.getRawString()
            r1.A00 = r0
            r6.A05(r1)
        L_0x0106:
            if (r14 != 0) goto L_0x0109
            r9 = 2
        L_0x0109:
            r2.A00(r11, r9)
            return
        L_0x010d:
            X.2Jv r1 = new X.2Jv
            r1.<init>()
            r1.A00 = r3
            java.lang.String r0 = r11.getRawString()
            r1.A01 = r0
            r6.A05(r1)
            goto L_0x0106
        L_0x011e:
            r1 = 0
            goto L_0x00df
        L_0x0120:
            r8 = 0
            goto L_0x00a4
        L_0x0122:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0056
        L_0x0128:
            long r0 = java.lang.System.currentTimeMillis()
            long r12 = r21 - r0
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r21 - r0
            int[] r6 = X.C47662Jw.A04
            int r3 = r6.length
            r2 = 0
        L_0x0138:
            if (r2 >= r3) goto L_0x003b
            r0 = r6[r2]
            long r4 = (long) r0
            r0 = 60000(0xea60, double:2.9644E-319)
            long r4 = r4 * r0
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x003b
            int r2 = r2 + 1
            goto L_0x0138
        L_0x0148:
            r4 = 0
            goto L_0x003b
        L_0x014c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0025
        L_0x0152:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0025
        L_0x0158:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16760tb.A0F(X.0rv, int, long, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.C15830rv r21, X.C16740tZ r22, X.C34151jm r23, java.lang.Integer r24, boolean r25) {
        /*
            r20 = this;
            X.0ta r8 = new X.0ta
            r8.<init>()
            r4 = r23
            java.lang.String r2 = r4.A09
            if (r2 == 0) goto L_0x0039
            int r1 = r4.A01
            r0 = 3
            if (r1 != r0) goto L_0x0032
            android.net.Uri r7 = android.net.Uri.parse(r2)
        L_0x0014:
            int r0 = r4.A00
            long r5 = (long) r0
            r1 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r3 = r20
            if (r0 <= 0) goto L_0x003b
            X.0tz r0 = r3.A0R
            android.content.Context r1 = r0.A00
            r0 = 2131891869(0x7f12169d, float:1.941847E38)
            java.lang.String r2 = r1.getString(r0)
            X.0pt r1 = r3.A03
            r0 = 1
            r1.A0H(r2, r0)
            return
        L_0x0032:
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r8.A0F = r0
        L_0x0039:
            r7 = 0
            goto L_0x0014
        L_0x003b:
            int r0 = r4.A03
            r8.A08 = r0
            int r0 = r4.A02
            r8.A06 = r0
            X.0wK r6 = r3.A15
            r2 = 0
            r16 = 20
            r9 = 0
            r13 = r9
            r14 = r9
            r15 = r9
            r18 = 0
            r17 = 0
            r10 = r21
            r11 = r22
            r19 = r25
            r12 = r9
            X.0tY r1 = r6.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1rB r1 = (X.C38641rB) r1
            java.lang.String r0 = r4.A0D
            r1.A05 = r0
            java.lang.String r0 = r4.A0C
            r1.A06 = r0
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "image/webp"
            r1.A06 = r0
        L_0x006b:
            X.1XO r0 = r4.A04
            r1.A02 = r0
            r0 = r24
            r1.A03 = r0
            java.util.List r1 = java.util.Collections.singletonList(r1)
            X.1zg r0 = new X.1zg
            r0.<init>(r1)
            r3.A07(r0, r9, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16760tb.A0G(X.0rv, X.0tZ, X.1jm, java.lang.Integer, boolean):void");
    }

    public void A0H(C15830rv r6, String str, String str2, String str3, long j2) {
        C222617g r4 = this.A1N;
        C39041rp r3 = new C39041rp(r4.A05.A02(r6, true), this.A0Q.A00());
        C16460t6 r2 = this.A0e;
        C16740tZ A002 = r2.A0K.A00(j2);
        if (A002 != null) {
            r4.A05(r3, A002);
        }
        r3.A00 = new C35101lN(new C35091lM(str2, str3), str);
        r2.A0W(r3);
    }

    public void A0I(C15830rv r6, boolean z2) {
        C20070zS r4 = this.A0X;
        UserJid of = UserJid.of(r6);
        if (r4.A03.A0E(C16620tM.A02, 2805)) {
            r4.A01(of, (String) null, 24);
        }
        A0J(r6, z2, true);
    }

    public void A0J(C15830rv r20, boolean z2, boolean z3) {
        C35611mD A002;
        C15830rv r11 = r20;
        this.A0G.A00(r11, 6);
        C42601y5.A01(this.A0l, this.A0z, this.A10, r11, this.A1Y, 11, (Integer) null, 6);
        this.A1H.A08(r11, (String) null, 0, 5);
        C16010sH A082 = this.A0J.A08(r11);
        C14770pj r4 = this.A1I;
        r4.A0A(r11, (C16740tZ) null);
        C18450wi.A0H(r11, 0);
        if (C18450wi.A0R(C451927k.A00, r11)) {
            C451927k.A00 = null;
        }
        C451927k.A04.remove(r11);
        C451927k.A03.remove(r11);
        C216815a r5 = this.A09;
        boolean z4 = z2;
        Set A0E2 = z3 ? r5.A01.A0E(r11, z4) : Collections.emptySet();
        r5.A04.A0T(r11, z4);
        r5.A01.A0V(A0E2);
        if (A082 != null) {
            if (A082.A0J() || C16030sJ.A0G(A082.A0E)) {
                this.A0A.A05(A082);
            }
            this.A0A.A06(r11);
            this.A1R.A0I(r11, A082.A0J());
            A0C(r11);
            this.A0N.A00((C15830rv) A082.A08(C15830rv.class), 1, true, true);
            r4.A08();
            C17240ul r52 = this.A11;
            r52.A0A.A00(A082);
            Class<C16050sL> cls = C16050sL.class;
            if (A082.A08(cls) != null && r52.A0R.A02((GroupJid) A082.A08(GroupJid.class)) == 1) {
                r52.A0B.A03.A04.A03((GroupJid) A082.A08(cls), Collections.emptyList());
            }
            UserJid userJid = (UserJid) A082.A08(UserJid.class);
            if (userJid != null) {
                AnonymousClass12G r9 = this.A0L;
                C16800tf A022 = r9.A01.A00.A02();
                try {
                    AnonymousClass15L.A02(A022, "wa_trusted_contacts", "wa_trusted_contacts.jid = ?", new String[]{userJid.getRawString()});
                    AnonymousClass15L.A02(A022, "wa_trusted_contacts_send", "wa_trusted_contacts_send.jid = ?", new String[]{userJid.getRawString()});
                    A022.close();
                    r9.A06().remove(userJid);
                } catch (Throwable unused) {
                }
            }
            if (A082.A0H() && (A002 = this.A0D.A0A.A00(userJid)) != null && A002.A0K) {
                AnonymousClass16N r1 = this.A0E;
                String rawString = r11.getRawString();
                C15860rz r6 = r1.A08;
                r6.A0n(rawString);
                SharedPreferences.Editor A0K2 = r6.A0K();
                StringBuilder sb = new StringBuilder("smb_business_direct_connection_enc_string_");
                sb.append(rawString);
                A0K2.remove(sb.toString()).apply();
                SharedPreferences.Editor A0K3 = r6.A0K();
                StringBuilder sb2 = new StringBuilder("smb_business_direct_connection_enc_string_expired_timestamp_");
                sb2.append(rawString);
                A0K3.remove(sb2.toString()).apply();
                SharedPreferences.Editor A0K4 = r6.A0K();
                StringBuilder sb3 = new StringBuilder("dc_user_postcode_");
                sb3.append(rawString);
                A0K4.remove(sb3.toString()).apply();
                SharedPreferences.Editor A0K5 = r6.A0K();
                StringBuilder sb4 = new StringBuilder("dc_location_name_");
                sb4.append(rawString);
                A0K5.remove(sb4.toString()).apply();
                SharedPreferences.Editor A0K6 = r6.A0K();
                StringBuilder sb5 = new StringBuilder("dc_default_postcode_");
                sb5.append(rawString);
                A0K6.remove(sb5.toString()).apply();
                SharedPreferences.Editor A0K7 = r6.A0K();
                StringBuilder sb6 = new StringBuilder("dc_business_domain_");
                sb6.append(rawString);
                A0K7.remove(sb6.toString()).apply();
            }
        }
        if (C16030sJ.A0H(r11)) {
            C18500wn r62 = this.A1G;
            C47682Jy r53 = new C47682Jy(this.A0d, (C34841kx) r11);
            Log.i("BroadcastXmppMethods/sendDeleteBroadcastList");
            C17190ug r12 = r62.A01;
            String A023 = r12.A02();
            C34841kx r42 = r53.A01;
            r12.A0A(new IDxRCallbackShape13S0300000_2_I0(r53, r53, r62, 4), new C28371Vv(new C28371Vv(r42 != null ? new C28371Vv("list", new C35081lL[]{new C35081lL((Jid) r42, "id")}) : null, "delete", (C35081lL[]) null), "iq", new C35081lL[]{new C35081lL("id", A023), new C35081lL("xmlns", "w:b"), new C35081lL("type", "set"), new C35081lL((Jid) C34791ks.A00, "to")}), A023, 60, 32000);
        }
        this.A0A.A02();
        C42861yn.A00.put(r11, false);
        return;
        throw th;
    }

    public void A0K(UserJid userJid, int i2) {
        AnonymousClass1WV A082 = this.A0b.A08(userJid);
        if (A082 == null || A082.expiration != i2) {
            C222617g r1 = this.A1N;
            C38971ri r12 = new C38971ri(r1.A05.A02(userJid, true), this.A0Q.A00());
            r12.A00 = i2;
            r12.A0b(userJid);
            this.A0e.A0W(r12);
        }
    }

    public void A0L(AnonymousClass1XQ r9, C16730tY r10) {
        A06(new C43241zg(Collections.singletonList(r10)), r9, (C16730tY) null, (byte[]) null, false, false, false);
    }

    public void A0M(C16740tZ r12) {
        String string;
        C41261vV A002;
        C15830rv r2 = r12.A11.A00;
        if (C16030sJ.A0Q(r2)) {
            r12.A0b(C34091jg.A00);
            A0O(r12);
        } else if (C16030sJ.A0G(r2)) {
            r12.A0t = true;
            C30361cE A042 = this.A0j.A07.A04((C16060sN) r2);
            r12.A0l = this.A0c.A01(r2).A09();
            ArrayList arrayList = new ArrayList(A042.A02());
            C16040sK r0 = this.A05;
            r0.A0B();
            arrayList.remove(r0.A05);
            r12.A0t(arrayList);
        }
        C15810rt r4 = this.A0b;
        C14710pd r3 = this.A0y;
        if ((r12 instanceof C39171s2) || ((r3.A0E(C16620tM.A01, 2200) && C30921dB.A04(r12)) || (!(r12 instanceof C38541qx) && r4.A0H(C16050sL.A03(r2)) && r3.A0E(C16620tM.A02, 1921)))) {
            r12.A0v = true;
            byte[] bArr = new byte[32];
            C003601p.A00().nextBytes(bArr);
            r12.A1F = bArr;
        }
        C24901Hs A012 = this.A0W.A01();
        UserJid of = UserJid.of(r2);
        if (of == null) {
            A012.A04.A00(2);
        } else {
            if (A012.A05.A00()) {
                if (A012.A00.A00.A0E(C16620tM.A02, 823)) {
                    C20030zO r1 = A012.A01;
                    r1.A06(r1.A00(of), r12);
                } else {
                    A012.A01(of, (AnonymousClass2IP) A012.A08.A00.get(of));
                }
            }
            AnonymousClass2IP r42 = (AnonymousClass2IP) A012.A08.A00.get(of);
            C24881Hq r10 = A012.A06;
            if (r10.A01() && r42 != null) {
                if (System.currentTimeMillis() - r42.A01 <= AnonymousClass2IP.A06 && !r42.A02 && r42.A00 == 0) {
                    A012.A04.A01(of, 0);
                    r12.A0e = r42.A04;
                    r12.A0f = r42.A05;
                }
            }
            if (!r10.A01()) {
                A012.A04.A01(of, 1);
            }
            if (r42 == null) {
                A012.A04.A01(of, 8);
            }
        }
        if (r3.A0E(C16620tM.A02, 508) && of != null && (string = this.A0V.A01.A00.A00("entry_point_conversions_for_sending").getString(of.getRawString(), (String) null)) != null && (A002 = C41251vU.A00(string)) != null) {
            r12.A0k = A002.A06;
            r12.A0j = A002.A05;
            r12.A03 = (int) TimeUnit.SECONDS.convert(System.currentTimeMillis() - A002.A01, TimeUnit.MILLISECONDS);
        }
    }

    public void A0N(C16740tZ r4) {
        byte b2 = r4.A10;
        AnonymousClass00B.A0G(!C38621r6.A0N(b2));
        AnonymousClass00B.A0G(!C30921dB.A00(b2));
        this.A1E.A02(r4, false);
        if (r4 instanceof C38541qx) {
            C16460t6 r0 = this.A0e;
            r4 = r0.A0K.A03(((C38541qx) r4).A12());
        }
        this.A0n.A08(r4, -1);
    }

    public final void A0O(C16740tZ r5) {
        C14710pd r3 = this.A0y;
        C16620tM r2 = C16620tM.A02;
        boolean A0E2 = r3.A0E(r2, 2755);
        boolean A0E3 = r3.A0E(r2, 2797);
        if (A0E2 && A0E3) {
            r5.A0S(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        }
    }

    public void A0P(C16740tZ r22, int i2, boolean z2, boolean z3) {
        Boolean bool;
        if (C34321k4.A03(this.A0y)) {
            int i3 = 0;
            int i4 = 0;
            boolean z4 = z2;
            if (z2) {
                i4 = 1;
            }
            C16740tZ r6 = r22;
            try {
                r6.A06 = i4;
                this.A0h.A05(r6);
                C18070w6 r9 = this.A0x;
                AnonymousClass2JJ r8 = new AnonymousClass2JJ();
                C39191s4 r11 = r6.A1A;
                if (r11 != null) {
                    r8.A09 = Long.valueOf((long) r11.A00);
                }
                boolean z5 = false;
                if (z2) {
                    r8.A04 = 1;
                } else {
                    r8.A04 = 2;
                    Long l2 = r6.A0Z;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (l2 != null) {
                        long longValue = l2.longValue();
                        boolean z6 = false;
                        if (longValue <= System.currentTimeMillis()) {
                            z6 = true;
                        }
                        r8.A03 = Boolean.valueOf(z6);
                        r8.A0B = Long.valueOf(longValue <= currentTimeMillis ? 0 : longValue - currentTimeMillis);
                    }
                    if (r11 != null) {
                        r8.A0A = Long.valueOf((long) Math.round((((float) (currentTimeMillis - r11.A02)) / 1000.0f) / 3600.0f));
                    }
                }
                r8.A06 = Integer.valueOf(i2);
                r8.A0D = 1L;
                r8.A07 = Integer.valueOf(C42141xI.A00(r6.A10, r6.A08, C30921dB.A04(r6)));
                C28381Vw r0 = r6.A11;
                C15830rv r1 = r0.A00;
                if (r1 != null) {
                    C15810rt r2 = r9.A04;
                    C16000sG r112 = r9.A02;
                    r8.A08 = Long.valueOf((long) C40491uD.A00(r112, r2, r1));
                    if (C16030sJ.A0L(r1)) {
                        C16070sO r12 = r9.A05;
                        GroupJid groupJid = (GroupJid) r1;
                        boolean A092 = r12.A09(groupJid);
                        boolean A0A2 = r12.A0A(groupJid);
                        if (A092 && A0A2) {
                            z5 = true;
                        }
                        r8.A02 = Boolean.valueOf(z5);
                        bool = Boolean.TRUE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    r8.A01 = bool;
                    r8.A05 = r0.A02 ? 1 : 2;
                    C16010sH A082 = r112.A08(r1);
                    if (C16030sJ.A0N(r1) && A082 != null) {
                        r8.A00 = Boolean.valueOf(r9.A08.A0h(A082, (C16050sL) r1));
                    }
                    r8.A0E = r9.A07.A03(r1.getRawString());
                }
                r9.A06.A06(r8);
                AnonymousClass23X r13 = new AnonymousClass23X(r6.A0C(), r0);
                long j2 = r6.A13;
                C222617g r23 = this.A1N;
                AnonymousClass00B.A06(r1);
                C16440t3 r3 = this.A0Q;
                long A002 = r3.A00();
                int i5 = 0;
                if (z2) {
                    i5 = 1;
                }
                C39191s4 r113 = new C39191s4(r23.A05.A02(r1, true), r13, i5, A002, j2, r3.A00());
                if (z3 && !z2) {
                    r113.A1C = true;
                }
                if (r0.A02 && !z2) {
                    i3 = 7;
                }
                r113.A01 = i3;
                r6.A1A = r113;
                r6.A06 = r113.A01;
                this.A0t.A00(r113);
            } catch (SQLiteException e2) {
                r6.A06 = z2 ^ true ? 1 : 0;
                e2.getMessage();
                this.A03.A0K(new RunnableRunnableShape0S0110000_I0(this, 0, z4));
            }
        }
    }

    public final void A0Q(C16740tZ r4, Runnable runnable, Collection collection, byte[] bArr) {
        if (bArr != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C16870tm A0F2 = ((C16740tZ) it.next()).A0F();
                AnonymousClass00B.A06(A0F2);
                A0F2.A02(bArr);
            }
        }
        if (r4 == null) {
            this.A03.Acq(runnable);
        } else {
            this.A1M.A01(r4, new RunnableRunnableShape0S0300000_I0(r4, collection, runnable, 9));
        }
    }

    public void A0R(C16740tZ r8, String str, String str2, String str3, String str4, List list, byte[] bArr) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C222617g r4 = this.A1N;
            C16830ti r3 = new C16830ti(r4.A05.A02((C15830rv) it.next(), true), (byte) 55, this.A0Q.A00());
            r3.Adh(new C16880tn(new C35201lX(str2, str3, bArr), new C35131lQ(1, str, 1), str4));
            A0M(r3);
            if (r8 != null) {
                r4.A05(r3, r8);
            }
            this.A0e.A0W(r3);
            AnonymousClass2K7 r32 = new AnonymousClass2K7();
            r32.A00 = 6;
            r32.A01 = 33;
            this.A10.A0B(r32, new AnonymousClass00F(1, 1), false);
        }
    }

    public void A0S(C16740tZ r18, String str, String str2, List list, boolean z2) {
        String str3 = str;
        C16740tZ r12 = r18;
        String str4 = str2;
        List<C15830rv> list2 = list;
        boolean z3 = z2;
        if (str2 != null) {
            try {
                byte[] bytes = str4.getBytes(AnonymousClass01S.A08);
                if (bytes != null) {
                    long length = (long) bytes.length;
                    C15900s5 r8 = this.A07;
                    if (length > ((long) r8.A02(C15910s6.A24)) * FileUtils.ONE_KB) {
                        this.A03.A0I(this.A0R.A00.getResources().getQuantityString(R.plurals.plurals0028, 1), 1);
                        return;
                    }
                    long A022 = ((long) r8.A02(C15910s6.A23)) * FileUtils.ONE_KB;
                    if (A022 > 0 && length > A022) {
                        if (str == null) {
                            C16980tz r3 = this.A0R;
                            str3 = new C39681st(this.A0J, r3, this.A0T).A01(str4);
                            if (str3 == null) {
                                str3 = r3.A00.getString(R.string.str0541);
                            }
                        }
                        this.A1Y.Acl(new RunnableRunnableShape0S1411000_I0(this, list2, bytes, r12, str3, 1, 1, z3));
                        return;
                    }
                }
            } catch (UnsupportedEncodingException unused) {
            }
        }
        for (C15830rv A023 : list2) {
            C222617g r5 = this.A1N;
            C38741rL r2 = new C38741rL(r5.A05.A02(A023, true), this.A0Q.A00());
            r2.A13(str4);
            r2.A00 = str3;
            r5.A05(r2, r12);
            if (z2) {
                r2.A0S(4);
            }
            A0M(r2);
            this.A0e.A0W(r2);
        }
    }

    public void A0T(C16740tZ r24, List list, List list2, boolean z2) {
        String string;
        List list3 = list2;
        String join = TextUtils.join(IOUtils.LINE_SEPARATOR_UNIX, list3);
        byte[] bArr = null;
        if (join != null) {
            try {
                bArr = join.getBytes(AnonymousClass01S.A08);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        C16740tZ r8 = r24;
        List<C15830rv> list4 = list;
        boolean z3 = z2;
        if (bArr != null) {
            int length = bArr.length;
            int size = list3.size();
            long j2 = (long) length;
            C15900s5 r12 = this.A07;
            if (j2 > ((long) r12.A02(C15910s6.A24)) * FileUtils.ONE_KB) {
                this.A03.A0I(this.A0R.A00.getResources().getQuantityString(R.plurals.plurals0028, size), 1);
                return;
            }
            long A022 = ((long) r12.A02(C15910s6.A23)) * FileUtils.ONE_KB;
            if (A022 > 0 && j2 > A022 && list3.size() > 0) {
                C16980tz r2 = this.A0R;
                C16000sG r0 = this.A0J;
                AnonymousClass013 r11 = this.A0T;
                int size2 = list3.size();
                String A012 = new C39681st(r0, r2, r11).A01((String) list3.get(0));
                if (A012 != null) {
                    int i2 = size2 - 1;
                    string = r11.A0J(new Object[]{A012, Integer.valueOf(i2)}, R.plurals.plurals0029, (long) i2);
                } else {
                    string = r2.A00.getString(R.string.str05a4);
                }
                this.A1Y.Acl(new RunnableRunnableShape0S1411000_I0(this, list4, bArr, r8, string, size, 1, z3));
                return;
            }
        }
        for (C15830rv A023 : list4) {
            C222617g r6 = this.A1N;
            long A002 = this.A0Q.A00();
            String A0J2 = this.A0T.A0J(new Object[]{Integer.valueOf(list3.size())}, R.plurals.plurals00d8, (long) list3.size());
            C38811rS r1 = new C38811rS(r6.A05.A02(A023, true), A002);
            r1.A00 = A0J2;
            r1.A13(list3);
            r6.A05(r1, r8);
            if (z2) {
                r1.A0S(4);
            }
            A0M(r1);
            this.A0e.A0W(r1);
        }
    }

    public void A0U(C30901d9 r16) {
        C16320sq r1 = this.A1Y;
        C16440t3 r7 = this.A0Q;
        C16300so r4 = this.A01;
        C17130ua r6 = this.A08;
        C16460t6 r9 = this.A0e;
        C19150xq r10 = this.A0n;
        C19950zG r12 = this.A13;
        C16260sj r8 = this.A0S;
        r1.Ack(new AnonymousClass2K4(this.A00, r4, this.A02, r6, r7, r8, r9, r10, this.A0o, r12, this.A14, r16), new Void[0]);
    }

    public void A0V(Collection collection, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder("useractions/userActionDeleteMessages ");
        Collection collection2 = collection;
        sb.append(collection.size());
        Log.i(sb.toString());
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                C16740tZ r3 = (C16740tZ) it.next();
                C42601y5.A02(this.A0z, this.A10, r3, 6);
                r3.A1C = true;
                if ((r3 instanceof C16730tY) && r3.A11.A02) {
                    this.A16.A04(r3, false);
                }
                this.A0m.A03(r3.A11);
            } else {
                this.A0Y.A01(new RunnableRunnableShape0S0220000_I0(this, collection2, 1, z2, z3), 20);
                this.A1Y.Acl(new RunnableRunnableShape2S0200000_I0(collection, 32, this));
                return;
            }
        }
    }

    public void A0W(Set set, boolean z2) {
        C38831rU r6;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C16740tZ r7 = (C16740tZ) it.next();
            r7.A1C = true;
            if (!C38621r6.A0o(r7)) {
                C28381Vw r8 = r7.A11;
                if (r8.A02) {
                    if (r7 instanceof C16730tY) {
                        this.A16.A04(r7, false);
                    }
                    if (C16030sJ.A0Q(r8.A00)) {
                        int A022 = C18020w1.A02(this.A0w, r7);
                        AnonymousClass1L1 r5 = this.A1T;
                        AnonymousClass2K3 r4 = new AnonymousClass2K3();
                        C47482Jd r0 = r5.A00;
                        r4.A02 = Long.valueOf(r0 == null ? 0 : r0.A05);
                        r4.A00 = Integer.valueOf(A022);
                        r4.A01 = Long.valueOf(r5.A04.A00() - r7.A0I);
                        r5.A09.A05(r4);
                        r5.A0D.A02(r7, (Long) null, (String) null, 4);
                    }
                    if (r7 instanceof C30071bh) {
                        C30071bh r82 = (C30071bh) r7;
                        if (this.A0Q.A00() < r82.A01 * 1000 && !r82.A07) {
                            C17780vd r3 = this.A12;
                            C16050sL r2 = r82.A02;
                            AnonymousClass00B.A06(r2);
                            r3.A02((C40901us) null, r2, Collections.singletonList(r82.A11.A00));
                        }
                    }
                    r6 = this.A1N.A03(r7, this.A0Q.A00());
                } else {
                    C222617g r1 = this.A1N;
                    long A002 = this.A0Q.A00();
                    C39161s1 r62 = new C39161s1(r1.A05.A02(r8.A00, false), r7.A0I);
                    r62.A00 = A002;
                    r62.A01 = r8.A01;
                    r62.A0M = r7.A0B();
                    r62.A0r = r7.A0Q();
                    r62.A0Z = r7.A0Z;
                    r62.A06 = 0;
                    C16040sK r02 = this.A05;
                    r02.A0B();
                    r62.A00 = r02.A05;
                    r6 = r62;
                }
                C27631Sn r32 = this.A0f;
                r32.A02.A01(new RunnableRunnableShape0S0210000_I0(r32, r6, 10, z2), 31);
            }
        }
        this.A1Y.Acl(new RunnableRunnableShape2S0200000_I0(set, 34, this));
    }

    public boolean A0X(C16740tZ r20, String str, boolean z2) {
        AnonymousClass01Y r5 = this.A0F;
        C16740tZ r3 = r20;
        C28381Vw r1 = r3.A11;
        C15830rv r4 = r1.A00;
        String str2 = str;
        if (r5.A0V(UserJid.of(r4)) && !TextUtils.isEmpty(str2)) {
            return false;
        }
        AnonymousClass23X r10 = new AnonymousClass23X(r3.A0C(), r1);
        AnonymousClass23X A012 = AnonymousClass23Y.A01(r3);
        long j2 = r3.A13;
        C222617g r12 = this.A1N;
        AnonymousClass00B.A06(r4);
        C16440t3 r0 = this.A0Q;
        C39101rv r8 = new C39101rv(r12.A05.A02(r4, true), r10, A012, str2, r0.A00(), j2, r0.A00());
        this.A0t.A00(r8);
        if (TextUtils.isEmpty(str2)) {
            C27641So r02 = this.A1O;
            r02.A01.A06(C27641So.A00(C18020w1.A02(r02.A00, r3), C18020w1.A06(r8), 2));
            C16050sL A032 = C16050sL.A03(r4);
            if (A032 != null && this.A0b.A02(A032) == 3) {
                this.A1Y.Acl(new RunnableRunnableShape0S0201000_I0(this, A032));
            }
        } else if (z2) {
            C27641So r03 = this.A1O;
            r03.A01.A06(C27641So.A00(C18020w1.A02(r03.A00, r3), C18020w1.A06(r8), 3));
        }
        this.A1Y.Acl(new RunnableRunnableShape2S0200000_I0(r3, 29, this));
        return true;
    }
}
