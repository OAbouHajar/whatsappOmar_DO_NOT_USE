package X;

import com.obwhatsapp.R;
import com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1wB  reason: invalid class name and case insensitive filesystem */
public class C41571wB implements C41581wC {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public int A03 = R.drawable.input_send;
    public long A04;
    public C613938s A05;
    public C41591wD A06;
    public C41561wA A07 = null;
    public String A08;
    public List A09 = Collections.singletonList(C34771kq.A00);
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public final AnonymousClass028 A0D;
    public final C14550pN A0E;
    public final C16440t3 A0F;
    public final C16980tz A0G;
    public final AnonymousClass013 A0H;
    public final C14710pd A0I;
    public final AnonymousClass1MV A0J;
    public final AnonymousClass1L1 A0K;
    public final C41621wG A0L;
    public final boolean A0M;
    public final boolean A0N;

    public C41571wB(AnonymousClass028 r6, C14550pN r7, C16440t3 r8, C16980tz r9, AnonymousClass013 r10, C14710pd r11, AnonymousClass1MV r12, AnonymousClass1L1 r13, C41621wG r14) {
        this.A0F = r8;
        this.A0I = r11;
        this.A0G = r9;
        this.A0H = r10;
        this.A0K = r13;
        this.A0J = r12;
        this.A0E = r7;
        C16620tM r1 = C16620tM.A01;
        boolean A0E2 = r11.A0E(r1, 1874);
        this.A0N = A0E2;
        boolean A0E3 = r11.A0E(r1, 815);
        this.A0M = A0E3;
        this.A08 = r9.A02(R.string.str14e6);
        this.A0D = r6;
        this.A0L = r14;
        CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) r14;
        this.A05 = creationModeBottomBar.A08.A00(creationModeBottomBar.A0D, A0E3);
        r14.setNewRecipientsVisibility(A0E3);
        C41591wD r0 = A0E2 ? new C41611wF(this) : new AnonymousClass35R(this);
        this.A06 = r0;
        creationModeBottomBar.A0E = this;
        r0.A00();
        if (A0E3) {
            this.A05.A00((C35541m6) r6.A01(), this.A09, true);
        } else {
            r14.setStatusPrivacyText(r9.A00.getString(((C35541m6) r6.A01()).A00 == 0 ? R.string.str1685 : R.string.str1686));
        }
    }
}
