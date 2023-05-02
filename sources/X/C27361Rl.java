package X;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Rl  reason: invalid class name and case insensitive filesystem */
public class C27361Rl implements C27371Rm {
    public AnonymousClass5UN A00;
    public final C37671pX A01;
    public final C27341Rj A02;

    public C27361Rl(C27351Rk r5, C27341Rj r6) {
        this.A02 = r6;
        this.A01 = new C37671pX(new C17010u2(), (C214414c) r5.A00.A01.AQO.get(), 256);
    }

    public final synchronized void A00() {
        NullPointerException nullPointerException;
        if (!AnonymousClass01E.A01() && this.A00 == null) {
            C27341Rj r8 = this.A02;
            C15420qr r2 = new C15420qr();
            r2.A00 = 12582912;
            r2.A04 = true;
            C15260qa A002 = r2.A00();
            AnonymousClass3U9 r1 = AnonymousClass3U9.A00;
            C29711b4 r6 = new C29711b4();
            Map map = r6.A01;
            map.put("user_scope", r1);
            map.put("eviction.v2", new AnonymousClass3UA(A002));
            C15150qP r3 = r8.A00;
            new C806244v();
            new HashMap().putAll(new AnonymousClass4G3().A00);
            C15360qk r5 = r3.A00;
            Pair pair = new Pair(5, "gif/gif_preview_cache");
            if (TextUtils.isEmpty((CharSequence) null) || 0 >= C814648k.A00.length) {
                File A012 = r5.A01(new Pair(pair.first, pair.second));
                C15340qi r22 = r8.A01;
                C96104nn r4 = new AnonymousClass3U8(RealtimeSinceBootClock.A00, new C62533Dx(r22, A012));
                ((C27301Rf) r22).AC5(C47742Kf.IDLE).execute(new RunnableRunnableShape12S0200000_I1(r8, 1, r4));
                List emptyList = Collections.emptyList();
                if (!emptyList.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(emptyList);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next();
                        nullPointerException = new NullPointerException("getClass");
                    } else {
                        r4 = new AnonymousClass3U7(r4, arrayList2);
                    }
                }
                Iterator it2 = new ArrayList(map.values()).iterator();
                while (it2.hasNext()) {
                    C15270qb r12 = (C15270qb) it2.next();
                    if (r12 instanceof AnonymousClass3UA) {
                        ((AnonymousClass3UA) r12).A00 = new WeakReference(r4);
                    }
                }
                C96124np r32 = r3.A00;
                ArrayList arrayList3 = new ArrayList(map.values());
                if (!arrayList3.isEmpty()) {
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        C15270qb r13 = (C15270qb) it3.next();
                        C15240qY A6h = r32.A6h(r13);
                        if (A6h != null) {
                            A6h.AUR(r6, r13, A012);
                        }
                    }
                }
                this.A00 = r4;
            } else {
                nullPointerException = new NullPointerException("contains");
            }
            throw nullPointerException;
        }
    }

    public AnonymousClass20S A9Y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C004101u.A02(str));
        sb.append(".gif");
        String obj = sb.toString();
        A00();
        C37671pX r6 = this.A01;
        AnonymousClass20S A04 = r6.A04(obj);
        if (A04 != null) {
            return A04;
        }
        if (AnonymousClass01E.A01()) {
            return null;
        }
        AnonymousClass5UN r0 = this.A00;
        AnonymousClass00B.A06(r0);
        File ACE = r0.ACE(obj);
        if (ACE == null || ACE.length() <= 0) {
            return A04;
        }
        AnonymousClass20S r8 = new AnonymousClass20S(ACE.getPath(), str, C18830xK.A03(C18830xK.A01(ACE), 100));
        r6.A03(obj, r8);
        return r8;
    }

    public void Ab1(AnonymousClass20S r3, String str) {
        A00();
        StringBuilder sb = new StringBuilder();
        sb.append(C004101u.A02(str));
        sb.append(".gif");
        this.A01.A03(sb.toString(), r3);
    }
}
