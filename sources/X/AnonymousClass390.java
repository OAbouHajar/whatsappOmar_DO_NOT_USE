package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.io.FileUtils;

/* renamed from: X.390  reason: invalid class name */
public class AnonymousClass390 {
    public final C16180sb A00;
    public final C16200sd A01;
    public final AnonymousClass12M A02;
    public final AnonymousClass39E A03;
    public final AnonymousClass12T A04;
    public final AnonymousClass2GJ A05;
    public final AnonymousClass2GM A06;
    public final C16190sc A07;
    public final AnonymousClass12W A08;
    public final C16440t3 A09;
    public final C16980tz A0A;
    public final C16260sj A0B;
    public final C15860rz A0C;
    public final C14710pd A0D;
    public final C16490t9 A0E;
    public final C75673sX A0F;
    public final C17190ug A0G;
    public final String A0H;
    public final List A0I;
    public final Map A0J = new ConcurrentHashMap();
    public final AtomicBoolean A0K = new AtomicBoolean(true);
    public final AtomicLong A0L = new AtomicLong(0);
    public final AtomicLong A0M = new AtomicLong(0);
    public final AtomicLong A0N = new AtomicLong(0);
    public final AtomicLong A0O = new AtomicLong(0);
    public final AtomicLong A0P = new AtomicLong(0);
    public final AtomicLong A0Q = new AtomicLong(0);

    public AnonymousClass390(C16180sb r4, C16200sd r5, AnonymousClass12M r6, AnonymousClass39E r7, AnonymousClass12T r8, AnonymousClass2GJ r9, AnonymousClass2GM r10, C16190sc r11, AnonymousClass12W r12, C16440t3 r13, C16980tz r14, C16260sj r15, C15860rz r16, C14710pd r17, C16490t9 r18, C75673sX r19, C17190ug r20, String str, List list) {
        this.A0A = r14;
        this.A09 = r13;
        this.A0D = r17;
        this.A0H = str;
        this.A0I = list;
        this.A00 = r4;
        this.A02 = r6;
        this.A0E = r18;
        this.A07 = r11;
        this.A0G = r20;
        this.A05 = r9;
        this.A01 = r5;
        this.A03 = r7;
        this.A08 = r12;
        this.A06 = r10;
        this.A04 = r8;
        this.A0B = r15;
        this.A0C = r16;
        this.A0F = r19;
    }

    public void A00() {
        if (this.A0C.A0M() != null) {
            C75673sX r4 = this.A0F;
            AtomicLong atomicLong = this.A0N;
            r4.A04 = Long.valueOf(atomicLong.get());
            Double valueOf = Double.valueOf(((double) atomicLong.get()) / ((double) this.A0P.get()));
            r4.A00 = valueOf;
            r4.A01 = valueOf;
            r4.A06 = r4.A04;
            r4.A07 = Long.valueOf(this.A0M.get() / FileUtils.ONE_MB);
            Log.i(AnonymousClass000.A0g("gdrive/encrypted-re-upload/", r4));
            this.A0E.A06(r4);
        }
        Iterator A002 = C16590tJ.A00(this.A02);
        while (A002.hasNext()) {
            ((AnonymousClass12R) A002.next()).AQL();
        }
    }
}
