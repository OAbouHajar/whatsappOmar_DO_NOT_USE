package X;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.zip.ZipFile;

/* renamed from: X.0bz  reason: invalid class name and case insensitive filesystem */
public class C07510bz implements C12420kN {
    public final Constructor A00;

    public C07510bz(Class cls) {
        Constructor constructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
        this.A00 = constructor;
        constructor.setAccessible(true);
    }

    public Object ALk(DexFile dexFile, File file) {
        return this.A00.newInstance(new Object[]{file, new ZipFile(file), dexFile});
    }
}
