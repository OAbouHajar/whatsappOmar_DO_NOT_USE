package X;

import android.os.Build;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.4V9  reason: invalid class name */
public class AnonymousClass4V9 {
    public C13560ma A00;
    public C12200k0 A01;
    public C04680Nm A02;
    public AnonymousClass5UM A03;
    public C83234Fw A04;
    public C65143Tc A05;
    public C65143Tc A06;
    public C65143Tc A07;
    public final AnonymousClass4OO A08;

    public AnonymousClass4V9(AnonymousClass4OO r1) {
        this.A08 = r1;
    }

    public AnonymousClass5UM A00() {
        AnonymousClass5UM r3 = this.A03;
        if (r3 != null) {
            return r3;
        }
        AnonymousClass4OO r32 = this.A08;
        if (Build.VERSION.SDK_INT >= 21) {
            C65173Tf r33 = new C65173Tf(r32.A00, r32.A01, r32.A05);
            this.A03 = r33;
            return r33;
        }
        C95724n9 r34 = new C95724n9();
        this.A03 = r34;
        return r34;
    }

    public final C65143Tc A01(int i2) {
        C65143Tc r7;
        if (i2 == 0) {
            r7 = this.A07;
            if (r7 == null) {
                try {
                    Class<?> cls = Class.forName("com.facebook.imagepipeline.memory.NativeMemoryChunkPool");
                    Class[] clsArr = new Class[3];
                    clsArr[0] = C12190jz.class;
                    clsArr[1] = C88144a1.class;
                    Constructor A0c = AnonymousClass3K4.A0c(cls, AnonymousClass5Kx.class, clsArr, 2);
                    Object[] objArr = new Object[3];
                    AnonymousClass4OO r1 = this.A08;
                    objArr[0] = r1.A00;
                    objArr[1] = r1.A03;
                    C65143Tc r0 = (C65143Tc) AnonymousClass3K4.A0W(r1.A06, A0c, objArr, 2);
                    this.A07 = r0;
                    return r0;
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                    C13370lv r12 = AnonymousClass0X1.A00;
                    if (r12.AJ7(6)) {
                        r12.A8K("PoolFactory", "", e2);
                    }
                    this.A07 = null;
                    return null;
                }
            }
        } else if (i2 == 1) {
            r7 = this.A06;
            if (r7 == null) {
                r7 = null;
                Class<BufferMemoryChunkPool> cls2 = BufferMemoryChunkPool.class;
                try {
                    Class[] clsArr2 = new Class[3];
                    clsArr2[0] = C12190jz.class;
                    clsArr2[1] = C88144a1.class;
                    Constructor A0c2 = AnonymousClass3K4.A0c(cls2, AnonymousClass5Kx.class, clsArr2, 2);
                    Object[] objArr2 = new Object[3];
                    AnonymousClass4OO r13 = this.A08;
                    objArr2[0] = r13.A00;
                    objArr2[1] = r13.A03;
                    C65143Tc r02 = (C65143Tc) AnonymousClass3K4.A0W(r13.A06, A0c2, objArr2, 2);
                    this.A06 = r02;
                    return r02;
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                    this.A06 = null;
                }
            }
        } else if (i2 == 2) {
            r7 = this.A05;
            if (r7 == null) {
                Class<AshmemMemoryChunkPool> cls3 = AshmemMemoryChunkPool.class;
                try {
                    Class[] clsArr3 = new Class[3];
                    clsArr3[0] = C12190jz.class;
                    clsArr3[1] = C88144a1.class;
                    Constructor A0c3 = AnonymousClass3K4.A0c(cls3, AnonymousClass5Kx.class, clsArr3, 2);
                    Object[] objArr3 = new Object[3];
                    AnonymousClass4OO r14 = this.A08;
                    objArr3[0] = r14.A00;
                    objArr3[1] = r14.A03;
                    C65143Tc r03 = (C65143Tc) AnonymousClass3K4.A0W(r14.A06, A0c3, objArr3, 2);
                    this.A05 = r03;
                    return r03;
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused2) {
                    this.A05 = null;
                    return null;
                }
            }
        } else {
            throw AnonymousClass000.A0T("Invalid MemoryChunkType");
        }
        return r7;
    }
}
