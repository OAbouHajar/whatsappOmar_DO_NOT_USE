package X;

import com.facebook.redex.IDxOwnerShape355S0100000_2_I1;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;

/* renamed from: X.4oD  reason: invalid class name and case insensitive filesystem */
public abstract class C96364oD implements AnonymousClass5T2 {
    public int A00;
    public int A01;
    public int A02;
    public C804743z A03;
    public AnonymousClass3UX A04;
    public boolean A05;
    public boolean A06;
    public final Object A07 = C13690nt.A0Y();
    public final Thread A08;
    public final ArrayDeque A09 = new ArrayDeque();
    public final ArrayDeque A0A = new ArrayDeque();
    public final AnonymousClass3UX[] A0B;
    public final C65313Ug[] A0C;

    public C96364oD(AnonymousClass3UX[] r6, C65313Ug[] r7) {
        this.A0B = r6;
        this.A00 = r6.length;
        for (int i2 = 0; i2 < this.A00; i2++) {
            this.A0B[i2] = this instanceof C65323Ui ? new AnonymousClass3Uc() : new AnonymousClass3UX(2);
        }
        this.A0C = r7;
        int length = r7.length;
        this.A01 = length;
        for (int i3 = 0; i3 < length; i3++) {
            r7[i3] = this instanceof C65323Ui ? new C65513Vb(new IDxOwnerShape355S0100000_2_I1(this, 1)) : new SimpleOutputBuffer(new IDxOwnerShape355S0100000_2_I1(this, 0));
        }
        C105705Av r0 = new C105705Av(this);
        this.A08 = r0;
        r0.start();
    }

    public static int A04(List list, int i2) {
        return (int) ((ByteBuffer.wrap((byte[]) list.get(i2)).order(ByteOrder.nativeOrder()).getLong() * 48000) / 1000000000);
    }

    public C804743z A05(AnonymousClass3UX r8, C65313Ug r9, boolean z2) {
        C65323Ui r2 = (C65323Ui) this;
        AnonymousClass3Uc r82 = (AnonymousClass3Uc) r8;
        C65303Uf r92 = (C65303Uf) r9;
        try {
            ByteBuffer byteBuffer = r82.A01;
            C109535Sn A072 = r2.A07(byteBuffer.array(), byteBuffer.limit(), z2);
            long j2 = r82.A00;
            long j3 = r82.A00;
            r92.timeUs = j2;
            r92.A01 = A072;
            if (j3 != Long.MAX_VALUE) {
                j2 = j3;
            }
            r92.A00 = j2;
            r92.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (C65283Ua e2) {
            return e2;
        }
    }

    public void A06(C65313Ug r5) {
        Object obj = this.A07;
        synchronized (obj) {
            r5.clear();
            C65313Ug[] r2 = this.A0C;
            int i2 = this.A01;
            this.A01 = i2 + 1;
            r2[i2] = r5;
            if (!this.A09.isEmpty() && this.A01 > 0) {
                obj.notify();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A7q() {
        AnonymousClass3UX r0;
        synchronized (this.A07) {
            C804743z r02 = this.A03;
            if (r02 == null) {
                C90524eJ.A04(AnonymousClass000.A1W(this.A04));
                int i2 = this.A00;
                if (i2 == 0) {
                    r0 = null;
                } else {
                    AnonymousClass3UX[] r03 = this.A0B;
                    int i3 = i2 - 1;
                    this.A00 = i3;
                    r0 = r03[i3];
                }
                this.A04 = r0;
            } else {
                throw r02;
            }
        }
        return r0;
    }

    public /* bridge */ /* synthetic */ Object A7r() {
        C65313Ug r0;
        synchronized (this.A07) {
            C804743z r02 = this.A03;
            if (r02 == null) {
                ArrayDeque arrayDeque = this.A0A;
                r0 = arrayDeque.isEmpty() ? null : (C65313Ug) arrayDeque.removeFirst();
            } else {
                throw r02;
            }
        }
        return r0;
    }

    public /* bridge */ /* synthetic */ void AbI(Object obj) {
        Object obj2 = this.A07;
        synchronized (obj2) {
            C804743z r0 = this.A03;
            if (r0 == null) {
                C90524eJ.A03(AnonymousClass000.A1Y(obj, this.A04));
                ArrayDeque arrayDeque = this.A09;
                arrayDeque.addLast(obj);
                if (!arrayDeque.isEmpty() && this.A01 > 0) {
                    obj2.notify();
                }
                this.A04 = null;
            } else {
                throw r0;
            }
        }
    }

    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            AnonymousClass3UX r3 = this.A04;
            if (r3 != null) {
                r3.clear();
                AnonymousClass3UX[] r2 = this.A0B;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                r2[i2] = r3;
                this.A04 = null;
            }
            while (true) {
                ArrayDeque arrayDeque = this.A09;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                AnonymousClass3UX r32 = (AnonymousClass3UX) arrayDeque.removeFirst();
                r32.clear();
                AnonymousClass3UX[] r22 = this.A0B;
                int i3 = this.A00;
                this.A00 = i3 + 1;
                r22[i3] = r32;
            }
            while (true) {
                ArrayDeque arrayDeque2 = this.A0A;
                if (!arrayDeque2.isEmpty()) {
                    ((C65313Ug) arrayDeque2.removeFirst()).release();
                }
            }
        }
    }

    public void release() {
        Object obj = this.A07;
        synchronized (obj) {
            this.A06 = true;
            obj.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
