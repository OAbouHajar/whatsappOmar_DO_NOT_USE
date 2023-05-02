package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.facebook.redex.IDxCListenerShape28S0200000_2_I0;
import com.facebook.redex.IDxNConsumerShape39S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.MuteDialogFragment;
import com.obwhatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2JF  reason: invalid class name */
public class AnonymousClass2JF implements AnonymousClass1U3 {
    public C15830rv A00;
    public final int A01;
    public final C14870pt A02;
    public final C16040sK A03;
    public final C16760tb A04;
    public final C19740yv A05;
    public final C17150uc A06;
    public final C16000sG A07;
    public final C19230xz A08;
    public final AnonymousClass10Y A09;
    public final C15800rs A0A;
    public final C30621cg A0B;
    public final C16440t3 A0C;
    public final C15860rz A0D;
    public final AnonymousClass013 A0E;
    public final C18910xS A0F;
    public final C15810rt A0G;
    public final C16070sO A0H;
    public final C14710pd A0I;
    public final C20260zl A0J;
    public final C17240ul A0K;
    public final C14770pj A0L;
    public final C16220sf A0M;
    public final C25781Lc A0N;
    public final AnonymousClass47T A0O;
    public final AnonymousClass15V A0P;
    public final C25681Ks A0Q;
    public final C25691Kt A0R;
    public final C25721Kw A0S;
    public final C16320sq A0T;
    public final WeakReference A0U;
    public final WeakReference A0V;

    public AnonymousClass2JF(Context context, AnonymousClass02C r3, C14870pt r4, C16040sK r5, C16760tb r6, C19740yv r7, C17150uc r8, C16000sG r9, C19230xz r10, AnonymousClass10Y r11, C15800rs r12, C30621cg r13, C16440t3 r14, C15860rz r15, AnonymousClass013 r16, C18910xS r17, C15810rt r18, C16070sO r19, C14710pd r20, C20260zl r21, C17240ul r22, C14770pj r23, C16220sf r24, C25781Lc r25, AnonymousClass47T r26, AnonymousClass15V r27, C25681Ks r28, C25691Kt r29, C25721Kw r30, C16320sq r31, int i2) {
        this.A0U = new WeakReference(context);
        this.A0V = new WeakReference(r3);
        this.A0C = r14;
        this.A0I = r20;
        this.A0O = r26;
        this.A02 = r4;
        this.A03 = r5;
        this.A0T = r31;
        this.A0G = r18;
        this.A0P = r27;
        this.A0F = r17;
        this.A04 = r6;
        this.A0J = r21;
        this.A07 = r9;
        this.A0E = r16;
        this.A0K = r22;
        this.A0N = r25;
        this.A0Q = r28;
        this.A0M = r24;
        this.A05 = r7;
        this.A0R = r29;
        this.A08 = r10;
        this.A0L = r23;
        this.A0D = r15;
        this.A0A = r12;
        this.A06 = r8;
        this.A09 = r11;
        this.A0S = r30;
        this.A0H = r19;
        this.A0B = r13;
        this.A01 = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.view.ContextMenu r8, X.C15830rv r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.A0U
            java.lang.Object r3 = r0.get()
            android.content.Context r3 = (android.content.Context) r3
            if (r3 == 0) goto L_0x0031
            r7.A00 = r9
            X.0sG r0 = r7.A07
            X.0sH r4 = r0.A0A(r9)
            boolean r0 = X.C16030sJ.A0R(r9)
            r2 = 0
            if (r0 == 0) goto L_0x0032
            X.0ul r1 = r7.A0K
            boolean r0 = r9 instanceof X.AnonymousClass1WP
            if (r0 != 0) goto L_0x0020
            r9 = 0
        L_0x0020:
            java.util.Set r0 = r1.A12
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0031
            r3 = 2131364603(0x7f0a0afb, float:1.8349048E38)
            r1 = 2131887774(0x7f12069e, float:1.9410165E38)
        L_0x002e:
            r8.add(r2, r3, r2, r1)
        L_0x0031:
            return
        L_0x0032:
            boolean r6 = X.C16030sJ.A0G(r9)
            if (r6 != 0) goto L_0x0041
            r1 = 2131364602(0x7f0a0afa, float:1.8349046E38)
            r0 = 2131886272(0x7f1200c0, float:1.9407118E38)
            r8.add(r2, r1, r2, r0)
        L_0x0041:
            X.1ko r0 = r4.A0D
            if (r0 != 0) goto L_0x0177
            boolean r0 = X.C16030sJ.A0L(r9)
            if (r0 == 0) goto L_0x014a
            r1 = 2131364604(0x7f0a0afc, float:1.834905E38)
            r0 = 2131888794(0x7f120a9a, float:1.9412233E38)
        L_0x0051:
            r8.add(r2, r1, r2, r0)
        L_0x0054:
            boolean r0 = X.C16030sJ.A0L(r9)
            if (r0 == 0) goto L_0x013d
            X.0sL r5 = X.C16050sL.A03(r9)
            X.AnonymousClass00B.A06(r5)
            X.0ul r4 = r7.A0K
            boolean r0 = r4.A0c()
            if (r0 == 0) goto L_0x007a
            X.0rt r0 = r4.A0R
            int r1 = r0.A02(r5)
            r0 = 3
            if (r1 != r0) goto L_0x007a
            X.0sO r0 = r4.A0a
            boolean r0 = r0.A0A(r5)
            if (r0 != 0) goto L_0x008e
        L_0x007a:
            r4 = 2131364603(0x7f0a0afb, float:1.8349048E38)
            X.0sO r0 = r7.A0H
            boolean r1 = r0.A09(r5)
            r0 = 2131887774(0x7f12069e, float:1.9410165E38)
            if (r1 == 0) goto L_0x008b
            r0 = 2131888268(0x7f12088c, float:1.9411167E38)
        L_0x008b:
            r8.add(r2, r4, r2, r0)
        L_0x008e:
            X.0rt r4 = r7.A0G
            boolean r0 = r4.A0G(r9)
            if (r0 == 0) goto L_0x0130
            r1 = 2131364614(0x7f0a0b06, float:1.834907E38)
            r0 = 2131892332(0x7f12186c, float:1.941941E38)
            if (r6 == 0) goto L_0x00a1
            r0 = 2131892330(0x7f12186a, float:1.9419405E38)
        L_0x00a1:
            java.lang.String r0 = r3.getString(r0)
            r8.add(r2, r1, r2, r0)
            if (r11 == 0) goto L_0x00cb
            X.0rz r6 = r7.A0D
            boolean r5 = X.C222417e.A01(r6, r4, r9)
            X.0sf r1 = r7.A0M
            java.lang.String r0 = r9.getRawString()
            X.1WS r0 = r1.A07(r0)
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0104
            if (r5 != 0) goto L_0x0104
            r1 = 2131364609(0x7f0a0b01, float:1.834906E38)
            r0 = 2131889409(0x7f120d01, float:1.941348E38)
            r8.add(r2, r1, r2, r0)
        L_0x00cb:
            boolean r0 = r4.A0G(r9)
            if (r0 != 0) goto L_0x00f0
            if (r10 == 0) goto L_0x00f0
            X.0sf r1 = r7.A0M
            java.lang.String r0 = r9.getRawString()
            X.1WS r0 = r1.A07(r0)
            boolean r3 = r0.A0G
            r1 = 2131364612(0x7f0a0b04, float:1.8349066E38)
            r0 = 2131889415(0x7f120d07, float:1.9413493E38)
            if (r3 == 0) goto L_0x00ed
            r1 = 2131364618(0x7f0a0b0a, float:1.8349078E38)
            r0 = 2131889428(0x7f120d14, float:1.941352E38)
        L_0x00ed:
            r8.add(r2, r1, r2, r0)
        L_0x00f0:
            int r0 = r4.A00(r9)
            r3 = 2131364607(0x7f0a0aff, float:1.8349056E38)
            r1 = 2131889346(0x7f120cc2, float:1.9413353E38)
            if (r0 == 0) goto L_0x002e
            r3 = 2131364606(0x7f0a0afe, float:1.8349054E38)
            r1 = 2131889345(0x7f120cc1, float:1.941335E38)
            goto L_0x002e
        L_0x0104:
            r0 = 2131889427(0x7f120d13, float:1.9413517E38)
            java.lang.String r0 = r3.getString(r0)
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r0)
            boolean r0 = X.C222417e.A01(r6, r4, r9)
            if (r0 == 0) goto L_0x0129
            r0 = 2131100929(0x7f060501, float:1.7814253E38)
            int r0 = X.AnonymousClass00T.A00(r3, r0)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r5.length()
            r5.setSpan(r1, r2, r0, r2)
        L_0x0129:
            r0 = 2131364617(0x7f0a0b09, float:1.8349076E38)
            r8.add(r2, r0, r2, r5)
            goto L_0x00cb
        L_0x0130:
            r1 = 2131364598(0x7f0a0af6, float:1.8349038E38)
            r0 = 2131886332(0x7f1200fc, float:1.940724E38)
            if (r6 == 0) goto L_0x00a1
            r0 = 2131886331(0x7f1200fb, float:1.9407238E38)
            goto L_0x00a1
        L_0x013d:
            r4 = 2131364603(0x7f0a0afb, float:1.8349048E38)
            r0 = 2131887759(0x7f12068f, float:1.9410134E38)
            if (r6 == 0) goto L_0x008b
            r0 = 2131887783(0x7f1206a7, float:1.9410183E38)
            goto L_0x008b
        L_0x014a:
            if (r6 == 0) goto L_0x0154
            r1 = 2131364604(0x7f0a0afc, float:1.834905E38)
            r0 = 2131889248(0x7f120c60, float:1.9413154E38)
            goto L_0x0051
        L_0x0154:
            X.0sK r0 = r7.A03
            boolean r0 = r0.A0G()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0054
            X.0zl r0 = r7.A0J
            boolean r0 = X.C40561uK.A01(r0, r9)
            if (r0 != 0) goto L_0x0054
            r1 = 2131364596(0x7f0a0af4, float:1.8349034E38)
            r0 = 2131886246(0x7f1200a6, float:1.9407065E38)
            r8.add(r2, r1, r2, r0)
            r1 = 2131364597(0x7f0a0af5, float:1.8349036E38)
            r0 = 2131886255(0x7f1200af, float:1.9407084E38)
            goto L_0x0051
        L_0x0177:
            r1 = 2131364601(0x7f0a0af9, float:1.8349044E38)
            r0 = 2131892692(0x7f1219d4, float:1.942014E38)
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JF.A00(android.view.ContextMenu, X.0rv, boolean, boolean):void");
    }

    public void A01(Set set) {
        boolean z2;
        AnonymousClass02C r4 = (AnonymousClass02C) this.A0V.get();
        Context context = (Context) this.A0U.get();
        if (context != null && r4 != null) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                if (!this.A0A.A0C((C15830rv) it.next())) {
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], R.string.str189b);
                A012.A05 = R.string.str189d;
                A012.A0B = new Object[0];
                A012.A01(new IDxCListenerShape28S0200000_2_I0(this, 6, set), R.string.str189c);
                C91484fz r1 = C91484fz.A00;
                A012.A04 = R.string.str189a;
                A012.A07 = r1;
                A012.A00().A1G(r4, (String) null);
                return;
            }
            this.A02.A0H(context.getResources().getQuantityString(R.plurals.plurals0014, 3, new Object[]{3}), 0);
        }
    }

    public boolean A02(int i2) {
        UserJid userJid;
        if (this.A00 == null || i2 != this.A01) {
            return false;
        }
        this.A08.A07();
        C16010sH A0A2 = this.A07.A0A(this.A00);
        if (A0A2.A0H() && (userJid = (UserJid) A0A2.A08(UserJid.class)) != null) {
            this.A06.A05(this, userJid, (String) null);
        }
        this.A0Q.A00();
        return true;
    }

    public boolean A03(MenuItem menuItem, AnonymousClass01A r10, C001000l r11) {
        C16320sq r3;
        int i2;
        AnonymousClass02C r6 = (AnonymousClass02C) this.A0V.get();
        if (!(r6 == null || this.A00 == null)) {
            if (menuItem.getItemId() == R.id.menuitem_conversations_contact_info) {
                C16010sH A0A2 = this.A07.A0A(this.A00);
                if (A0A2.A0D != null) {
                    Jid A082 = A0A2.A08(UserJid.class);
                    AnonymousClass00B.A06(A082);
                    r11.startActivity(C14750ph.A0Z(r11, (UserJid) A082, (Integer) null, true));
                }
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_delete) {
                this.A0S.A07(r11).A00(new IDxNConsumerShape39S0200000_2_I0(r6, 2, this));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_add_new_contact) {
                Intent A002 = this.A0R.A00(this.A07.A0A(this.A00), this.A00, true);
                AnonymousClass00B.A06(r11);
                A002.setComponent(A002.resolveActivity(r11.getPackageManager()));
                if (A002.getComponent() != null) {
                    r10.startActivityForResult(A002, this.A01);
                    this.A0Q.A02(true, 7);
                    return true;
                }
                Log.w("conversations/context system contact list could not found");
                this.A02.A09(R.string.str1889, 0);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_add_to_existing_contact) {
                try {
                    r10.startActivityForResult(this.A0R.A00(this.A07.A0A(this.A00), this.A00, false), this.A01);
                    this.A0Q.A02(false, 7);
                    return true;
                } catch (ActivityNotFoundException unused) {
                    this.A02.A09(R.string.str00a0, 0);
                    return true;
                }
            } else {
                if (menuItem.getItemId() == R.id.menuitem_conversations_pin) {
                    Set A0A3 = this.A0M.A0A();
                    if (A0A3.size() >= 3) {
                        A01(A0A3);
                        return true;
                    }
                    r3 = this.A0T;
                    i2 = 22;
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_unpin) {
                    r3 = this.A0T;
                    i2 = 21;
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_mute) {
                    MuteDialogFragment.A02(Collections.singleton(this.A00), 1).A1G(r6, (String) null);
                    return true;
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_unmute) {
                    C15830rv r32 = this.A00;
                    if (C222417e.A01(this.A0D, this.A0G, r32)) {
                        C222417e.A00(r11, r11.findViewById(R.id.result_list), this.A04, this.A00, 0);
                        return true;
                    }
                    r3 = this.A0T;
                    i2 = 23;
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_archive) {
                    C30621cg r62 = this.A0B;
                    C15830rv r4 = this.A00;
                    r62.A06.A04(r4, 0, true);
                    r62.A0B.Acl(new RunnableRunnableShape0S0300000_I0(r62, r4, 0, 47));
                    return true;
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_unarchive) {
                    C30621cg r0 = this.A0B;
                    r0.A06.A04(this.A00, 0, false);
                    return true;
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_mark_read) {
                    this.A09.A00(this.A00, 1, true, true);
                    this.A0L.A08();
                    return true;
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_mark_unread) {
                    this.A09.A02(this.A00, true);
                    return true;
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_create_shortcuit) {
                    this.A05.A04(this.A07.A0A(this.A00));
                    return true;
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_group_info) {
                    C16010sH A0A4 = this.A07.A0A(this.A00);
                    if (C16030sJ.A0G(A0A4.A0E)) {
                        AnonymousClass00B.A06(r11);
                        r11.startActivity(C14750ph.A0R(r11, A0A4.A0E), (Bundle) null);
                        return true;
                    }
                    Intent A0W = C14750ph.A0W(r11, A0A4.A0E, true, false, true);
                    AnonymousClass22U.A00(A0W, r11.getClass().getSimpleName());
                    r11.startActivity(A0W, (Bundle) null);
                    return true;
                }
                r3.Acl(new RunnableRunnableShape8S0100000_I0_7(this, i2));
                return true;
            }
        }
        return false;
    }

    public void ARp() {
    }

    public void ARq() {
    }
}
