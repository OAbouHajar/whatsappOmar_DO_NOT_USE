package androidx.window.java.layout;

import X.AnonymousClass000;
import X.AnonymousClass04N;
import X.AnonymousClass1UB;
import X.AnonymousClass1UD;
import X.AnonymousClass1UF;
import X.AnonymousClass1UG;
import X.AnonymousClass1UJ;
import X.AnonymousClass22M;
import X.C106185Cw;
import X.C109125Qu;
import X.C11040i6;
import X.C813747x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
public final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends AnonymousClass1UD implements AnonymousClass1UJ {
    public final /* synthetic */ AnonymousClass04N $consumer;
    public final /* synthetic */ C109125Qu $flow;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerCallbackAdapter$addListener$1$1(AnonymousClass04N r1, AnonymousClass1UG r2, C109125Qu r3) {
        super(r2);
        this.$flow = r3;
        this.$consumer = r1;
    }

    public final Object A04(Object obj) {
        Object A01 = C106185Cw.A01();
        int i2 = this.label;
        if (i2 == 0) {
            C813747x.A00(obj);
            C109125Qu r2 = this.$flow;
            C11040i6 r0 = new C11040i6(this.$consumer);
            this.label = 1;
            if (r2.A6Q(this, r0) == A01) {
                return A01;
            }
        } else if (i2 == 1) {
            C813747x.A00(obj);
        } else {
            throw AnonymousClass000.A0V("call to 'resume' before 'invoke' with coroutine");
        }
        return AnonymousClass22M.A00;
    }

    public final AnonymousClass1UG A05(Object obj, AnonymousClass1UG r5) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$consumer, r5, this.$flow);
    }

    /* renamed from: A06 */
    public final Object AIV(AnonymousClass1UG r3, AnonymousClass1UB r4) {
        return ((AnonymousClass1UF) A05(r4, r3)).A04(AnonymousClass22M.A00);
    }
}
