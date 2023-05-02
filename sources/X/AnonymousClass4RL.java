package X;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4RL  reason: invalid class name */
public class AnonymousClass4RL {
    public AnonymousClass4XH A00;
    public AnonymousClass4XH A01 = new AnonymousClass5HC(this);
    public final ConcurrentHashMap A02;

    public AnonymousClass4RL() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(100);
        this.A02 = concurrentHashMap;
        concurrentHashMap.put(Date.class, C107235Gy.A00);
        AnonymousClass4XH r3 = AnonymousClass5HE.A0C;
        concurrentHashMap.put(int[].class, r3);
        AnonymousClass4XH r1 = AnonymousClass5HE.A05;
        concurrentHashMap.put(Integer[].class, r1);
        concurrentHashMap.put(short[].class, r3);
        concurrentHashMap.put(Short[].class, r1);
        concurrentHashMap.put(long[].class, AnonymousClass5HE.A0D);
        concurrentHashMap.put(Long[].class, AnonymousClass5HE.A06);
        concurrentHashMap.put(byte[].class, AnonymousClass5HE.A08);
        concurrentHashMap.put(Byte[].class, AnonymousClass5HE.A01);
        concurrentHashMap.put(char[].class, AnonymousClass5HE.A09);
        concurrentHashMap.put(Character[].class, AnonymousClass5HE.A02);
        concurrentHashMap.put(float[].class, AnonymousClass5HE.A0B);
        concurrentHashMap.put(Float[].class, AnonymousClass5HE.A04);
        concurrentHashMap.put(double[].class, AnonymousClass5HE.A0A);
        concurrentHashMap.put(Double[].class, AnonymousClass5HE.A03);
        concurrentHashMap.put(boolean[].class, AnonymousClass5HE.A07);
        concurrentHashMap.put(Boolean[].class, AnonymousClass5HE.A00);
        AnonymousClass5HB r12 = new AnonymousClass5HB(this);
        this.A00 = r12;
        concurrentHashMap.put(AnonymousClass5VI.class, r12);
        concurrentHashMap.put(C109145Qw.class, this.A00);
        concurrentHashMap.put(AnonymousClass5C3.class, this.A00);
        concurrentHashMap.put(AnonymousClass5CE.class, this.A00);
    }

    public AnonymousClass4XH A00(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.A02;
        AnonymousClass4XH r0 = (AnonymousClass4XH) concurrentHashMap.get(cls);
        if (r0 != null) {
            return r0;
        }
        if (cls != null && (Map.class.isAssignableFrom(cls) || List.class.isAssignableFrom(cls))) {
            AnonymousClass5HD r02 = new AnonymousClass5HD(cls, this);
            concurrentHashMap.put(cls, r02);
            return r02;
        } else if (cls.isArray()) {
            C107225Gx r03 = new C107225Gx(cls, this);
            concurrentHashMap.putIfAbsent(cls, r03);
            return r03;
        } else {
            if (List.class.isAssignableFrom(cls)) {
                new AnonymousClass5H9(cls, this);
            } else if (Map.class.isAssignableFrom(cls)) {
                new AnonymousClass5HA(cls, this);
            } else {
                new AnonymousClass5H8(cls, this);
            }
            throw AnonymousClass000.A0Z();
        }
    }
}
