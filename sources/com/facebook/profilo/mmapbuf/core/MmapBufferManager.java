package com.facebook.profilo.mmapbuf.core;

import X.C88484aa;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.io.File;
import java.util.UUID;

public class MmapBufferManager {
    public final C88484aa mFileHelper;
    public final HybridData mHybridData = initHybrid();

    static {
        SoLoader.A06("profilo_mmapbuf");
    }

    public MmapBufferManager(File file) {
        this.mFileHelper = new C88484aa(file);
    }

    public static native HybridData initHybrid();

    private native Buffer nativeAllocateBuffer(int i2);

    private native Buffer nativeAllocateBuffer(int i2, String str);

    private native boolean nativeDeallocateBuffer(Buffer buffer);

    public Buffer allocateBuffer(int i2, boolean z2) {
        if (!z2) {
            return nativeAllocateBuffer(i2);
        }
        String obj = UUID.randomUUID().toString();
        StringBuilder sb = new StringBuilder();
        sb.append(C88484aa.A00(obj));
        sb.append(".buff");
        String A01 = this.mFileHelper.A01(sb.toString());
        if (A01 == null) {
            return null;
        }
        return nativeAllocateBuffer(i2, A01);
    }

    public synchronized boolean deallocateBuffer(Buffer buffer) {
        return nativeDeallocateBuffer(buffer);
    }
}
