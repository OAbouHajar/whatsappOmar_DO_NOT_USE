package X;

import java.math.BigInteger;

/* renamed from: X.0ii  reason: invalid class name and case insensitive filesystem */
public final class C11400ii extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ C09190f5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11400ii(C09190f5 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        return BigInteger.valueOf((long) this.this$0.A00).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.A01)).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.A02));
    }
}
