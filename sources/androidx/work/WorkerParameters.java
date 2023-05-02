package androidx.work;

import X.AnonymousClass04d;
import X.AnonymousClass0OP;
import X.AnonymousClass0UL;
import X.C007203h;
import X.C12030jj;
import X.C12570kc;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    public int A00;
    public C007203h A01;
    public C12570kc A02;
    public C12030jj A03;
    public AnonymousClass0UL A04;
    public AnonymousClass0OP A05;
    public AnonymousClass04d A06;
    public Set A07;
    public UUID A08;
    public Executor A09;

    public WorkerParameters(C007203h r2, C12570kc r3, C12030jj r4, AnonymousClass0UL r5, AnonymousClass0OP r6, AnonymousClass04d r7, Collection collection, UUID uuid, Executor executor, int i2) {
        this.A08 = uuid;
        this.A01 = r2;
        this.A07 = new HashSet(collection);
        this.A05 = r6;
        this.A00 = i2;
        this.A09 = executor;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }
}
