package X;

import android.app.Activity;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;

/* renamed from: X.2KS  reason: invalid class name */
public final class AnonymousClass2KS extends C19530ya {
    public AnonymousClass2KU A00;
    public Integer A01 = 4;
    public Runnable A02;
    public final C000900k A03;
    public final C19980zJ A04;
    public final AnonymousClass29B A05;
    public final C14600pS A06;
    public final C14870pt A07;
    public final C25951Lt A08;
    public final C18890xQ A09;
    public final C16760tb A0A;
    public final AnonymousClass01Y A0B;
    public final C16000sG A0C;
    public final C16080sP A0D;
    public final AnonymousClass1M1 A0E;
    public final C25931Lr A0F;
    public final AnonymousClass4E3 A0G;
    public final AnonymousClass2KT A0H;
    public final C809046a A0I;
    public final C16440t3 A0J;
    public final C15860rz A0K;
    public final AnonymousClass013 A0L;
    public final C216114t A0M;
    public final C16070sO A0N;
    public final C19780yz A0O;
    public final C18030w2 A0P;
    public final C17250um A0Q;
    public final C14710pd A0R;
    public final C20260zl A0S;
    public final C16490t9 A0T;
    public final C18040w3 A0U;
    public final C17240ul A0V;
    public final AnonymousClass15W A0W;
    public final C15830rv A0X;
    public final AnonymousClass1L9 A0Y;
    public final C17220uj A0Z;
    public final C25721Kw A0a;
    public final C16320sq A0b;

    public AnonymousClass2KS(C000900k r4, C19980zJ r5, AnonymousClass29B r6, C14600pS r7, C14870pt r8, C25951Lt r9, C18890xQ r10, C16760tb r11, AnonymousClass01Y r12, C16000sG r13, C16080sP r14, AnonymousClass1M1 r15, C25931Lr r16, AnonymousClass4E3 r17, AnonymousClass2KT r18, C809046a r19, C16440t3 r20, C15860rz r21, AnonymousClass013 r22, C216114t r23, C16070sO r24, C19780yz r25, C18030w2 r26, C17250um r27, C14710pd r28, C20260zl r29, C16490t9 r30, C18040w3 r31, C17240ul r32, AnonymousClass15W r33, C15830rv r34, AnonymousClass1L9 r35, C17220uj r36, C25721Kw r37, C16320sq r38) {
        this.A03 = r4;
        this.A0J = r20;
        this.A0R = r28;
        this.A09 = r10;
        this.A07 = r8;
        this.A0b = r38;
        this.A0T = r30;
        this.A0Q = r27;
        this.A0A = r11;
        this.A0S = r29;
        this.A04 = r5;
        this.A0C = r13;
        this.A0P = r26;
        this.A0Z = r36;
        this.A0D = r14;
        this.A0L = r22;
        this.A0B = r12;
        this.A0O = r25;
        this.A0V = r32;
        this.A0F = r16;
        this.A0W = r33;
        this.A08 = r9;
        this.A0U = r31;
        this.A0K = r21;
        this.A0E = r15;
        this.A0a = r37;
        this.A0N = r24;
        this.A0M = r23;
        this.A0Y = r35;
        this.A06 = r7;
        this.A05 = r6;
        this.A0G = r17;
        AnonymousClass2KT r2 = r18;
        this.A0H = r2;
        this.A0X = r34;
        this.A0I = r19;
        this.A02 = new RunnableRunnableShape0S0300000_I0(this, r7, r2, 45);
    }

    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        this.A02 = null;
        AnonymousClass2KU r1 = this.A00;
        if (r1 != null) {
            r1.A01 = null;
            r1.A00 = null;
            r1.A06(true);
            this.A00 = null;
        }
    }
}
