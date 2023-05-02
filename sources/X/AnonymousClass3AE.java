package X;

import com.obwhatsapp.community.iq.CreateCommunityManager$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3AE  reason: invalid class name */
public class AnonymousClass3AE {
    public long A00;
    public C55292jF A01;
    public C16050sL A02;
    public final AnonymousClass05T A03;
    public final C16300so A04;
    public final C14870pt A05;
    public final C16040sK A06;
    public final C16000sG A07;
    public final AnonymousClass120 A08;
    public final C16440t3 A09;
    public final C14710pd A0A;
    public final C17240ul A0B;
    public final C217415g A0C;
    public final C17190ug A0D;
    public final AnonymousClass121 A0E;
    public final C18050w4 A0F;
    public final Map A0G = Collections.synchronizedMap(AnonymousClass000.A0x());
    public final AtomicInteger A0H;

    public AnonymousClass3AE(C001300o r4, C16300so r5, C14870pt r6, C16040sK r7, C55292jF r8, C16000sG r9, AnonymousClass120 r10, C16440t3 r11, C14710pd r12, C17240ul r13, C217415g r14, C17190ug r15, AnonymousClass121 r16, C18050w4 r17) {
        this.A09 = r11;
        this.A0A = r12;
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = r7;
        this.A0D = r15;
        this.A07 = r9;
        this.A0B = r13;
        this.A08 = r10;
        this.A0E = r16;
        this.A0F = r17;
        this.A0C = r14;
        this.A01 = r8;
        boolean z2 = false;
        this.A0H = new AtomicInteger(0);
        AnonymousClass00B.A01();
        AnonymousClass00B.A0G(((C009604p) r4.getLifecycle()).A02 != C011005f.DESTROYED ? true : z2);
        CreateCommunityManager$$ExternalSyntheticLambda0 createCommunityManager$$ExternalSyntheticLambda0 = new CreateCommunityManager$$ExternalSyntheticLambda0(this);
        this.A03 = createCommunityManager$$ExternalSyntheticLambda0;
        r4.getLifecycle().A00(createCommunityManager$$ExternalSyntheticLambda0);
    }

    public static /* synthetic */ void A00(AnonymousClass3AE r6, int i2) {
        if (i2 == 0) {
            r6.A0F.A00(11, r6.A09.A00() - r6.A00);
            if (!r6.A0G.isEmpty() && r6.A02 != null) {
                C14870pt.A00(r6.A05, r6, 43);
            }
        }
    }
}
