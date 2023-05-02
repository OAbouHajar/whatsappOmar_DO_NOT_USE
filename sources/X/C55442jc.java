package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import com.obwhatsapp.IDxTSpanShape53S0100000_2_I0;
import com.obwhatsapp.blocklist.BlockConfirmationDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2jc  reason: invalid class name and case insensitive filesystem */
public class C55442jc {
    public C16010sH A00;
    public boolean A01;
    public final C000900k A02;
    public final C14600pS A03;
    public final AnonymousClass01Y A04;
    public final C17230uk A05;
    public final C17030uP A06;
    public final C15860rz A07;
    public final C16070sO A08;
    public final AnonymousClass119 A09;
    public final C19410yO A0A;
    public final C20260zl A0B;
    public final C216014s A0C;
    public final C16320sq A0D;
    public final Runnable A0E;
    public final Runnable A0F;

    public C55442jc(C000900k r1, C14600pS r2, AnonymousClass01Y r3, C17230uk r4, C17030uP r5, C15860rz r6, C16070sO r7, AnonymousClass119 r8, C19410yO r9, C20260zl r10, C216014s r11, C16320sq r12, Runnable runnable, Runnable runnable2) {
        this.A0D = r12;
        this.A02 = r1;
        this.A0C = r11;
        this.A0B = r10;
        this.A04 = r3;
        this.A09 = r8;
        this.A06 = r5;
        this.A07 = r6;
        this.A05 = r4;
        this.A0A = r9;
        this.A08 = r7;
        this.A03 = r2;
        this.A0E = runnable;
        this.A0F = runnable2;
    }

    public SpannableStringBuilder A00(String str) {
        Spanned A012 = AnonymousClass1ZW.A01(str, new Object[0]);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A012);
        URLSpan[] uRLSpanArr = (URLSpan[]) A012.getSpans(0, A012.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("group-privacy-settings".equals(uRLSpan.getURL())) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new IDxTSpanShape53S0100000_2_I0((Context) this.A02, (Object) this, 2), spanStart, spanEnd, spanFlags);
                }
            }
        }
        return spannableStringBuilder;
    }

    public final String A01(int i2) {
        C16010sH r0 = this.A00;
        if (r0 != null) {
            Class<C16050sL> cls = C16050sL.class;
            if (r0.A08(cls) != null) {
                if (i2 == 0) {
                    return "group_spam_banner_report";
                }
                C16010sH r02 = this.A00;
                if (r02 == null) {
                    Log.e("Contact is unexpected null");
                    return "left_group_spam_banner_report";
                }
                GroupJid groupJid = (GroupJid) r02.A08(cls);
                if (groupJid == null || !this.A08.A09(groupJid)) {
                    return "left_group_spam_banner_report";
                }
            }
        }
        return null;
    }

    public void A02() {
        Jid A082 = this.A00.A08(C15830rv.class);
        AnonymousClass00B.A06(A082);
        this.A0C.A02((C15830rv) A082, 5, this.A01);
        this.A0E.run();
    }

    public void A03() {
        Jid A082 = this.A00.A08(C15830rv.class);
        AnonymousClass00B.A06(A082);
        C15830rv r4 = (C15830rv) A082;
        if (C40561uK.A01(this.A0B, r4)) {
            this.A07.A0c();
        } else {
            C216014s r2 = this.A0C;
            r2.A02(r4, 4, this.A01);
            r2.A05(r4, 1);
        }
        this.A0F.run();
    }

    public void A04(int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        C000900k r4;
        Jid A082 = this.A00.A08(UserJid.class);
        AnonymousClass00B.A06(A082);
        UserJid userJid = (UserJid) A082;
        String str = "biz_spam_banner_block";
        if (C40561uK.A00(this.A00, this.A0B)) {
            r4 = this.A02;
            if (this.A01) {
                str = "triggered_block";
            }
            z2 = false;
            z3 = false;
            z4 = false;
        } else {
            AnonymousClass01Y r2 = this.A04;
            String str2 = "1_1_spam_banner_block";
            z2 = false;
            z3 = true;
            if (!r2.A0V(userJid)) {
                this.A0C.A02(userJid, 3, this.A01);
                if (this.A00.A0H()) {
                    z4 = false;
                    if (i2 == 1) {
                        z4 = true;
                    }
                    r4 = this.A02;
                    if (this.A01) {
                        str = "triggered_block";
                    }
                } else {
                    if (i2 != 1) {
                        str2 = "1_1_old_spam_banner_block";
                    }
                    if (this.A01) {
                        str2 = "triggered_block";
                    }
                    this.A03.Afc(BlockConfirmationDialogFragment.A01(userJid, str2, true, false, true, false));
                    return;
                }
            } else {
                if (!this.A00.A0H()) {
                    str = "1_1_old_spam_banner_block";
                    if (i2 == 1) {
                        str = str2;
                    }
                }
                r2.A0J(this.A02, this.A00, str, false);
                return;
            }
        }
        r4.startActivityForResult(C14750ph.A0a(r4, userJid, str, z2, z3, z4), 902);
    }

    public void A05(int i2) {
        String str;
        Jid A082 = this.A00.A08(C15830rv.class);
        AnonymousClass00B.A06(A082);
        C15830rv r4 = (C15830rv) A082;
        if (r4 instanceof C16050sL) {
            str = A01(i2);
            AnonymousClass00B.A06(str);
        } else {
            str = "1_1_spam_banner_report";
        }
        C216014s r2 = this.A0C;
        r2.A02(r4, 2, this.A01);
        r2.A05(r4, -2);
        this.A0A.A04().A00(new C1037952t(this, r4, str));
    }
}
