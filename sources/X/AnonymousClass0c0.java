package X;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;

/* renamed from: X.0c0  reason: invalid class name */
public class AnonymousClass0c0 implements C12420kN {
    public final Constructor A00;

    public AnonymousClass0c0(Class cls) {
        Class<File> cls2 = File.class;
        Constructor constructor = cls.getConstructor(new Class[]{cls2, cls2, DexFile.class});
        this.A00 = constructor;
        constructor.setAccessible(true);
    }

    public Object ALk(DexFile dexFile, File file) {
        return this.A00.newInstance(new Object[]{file, file, dexFile});
    }
}
