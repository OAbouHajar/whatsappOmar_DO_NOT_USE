package com.facebook.profilo.mmapbuf.core;

import X.C88484aa;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.io.File;
import java.util.UUID;

public class Buffer {
    public static final String LOG_TAG = "Prflo/Buffer";
    public final HybridData mHybridData;

    static {
        SoLoader.A06("profilo_mmapbuf");
    }

    public Buffer(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private File getBufferContainingFolder() {
        return new File(getFilePath()).getParentFile();
    }

    private native void nativeUpdateId(String str);

    public synchronized String generateMemoryMappingFilePath() {
        String str;
        if (!isFileBacked()) {
            str = null;
        } else {
            str = getMemoryMappingFilePath();
            if (str == null) {
                C88484aa r2 = new C88484aa(getBufferContainingFolder());
                String obj = UUID.randomUUID().toString();
                StringBuilder sb = new StringBuilder();
                sb.append(C88484aa.A00(obj));
                sb.append(".maps");
                str = r2.A01(sb.toString());
                if (str != null) {
                    updateMemoryMappingFilePath(str);
                }
            }
        }
        return str;
    }

    public native synchronized String getFilePath();

    public native synchronized String getMemoryMappingFilePath();

    public boolean isFileBacked() {
        return getFilePath() != null;
    }

    public native synchronized void updateFilePath(String str);

    public native synchronized void updateHeader(int i2, long j2, long j3, long j4);

    public synchronized void updateId(String str) {
        if (isFileBacked()) {
            StringBuilder sb = new StringBuilder();
            sb.append(C88484aa.A00(str));
            sb.append(".buff");
            String A01 = new C88484aa(getBufferContainingFolder()).A01(sb.toString());
            if (A01 != null) {
                try {
                    nativeUpdateId(str);
                    updateFilePath(A01);
                } catch (Exception e2) {
                    Log.e(LOG_TAG, "Id update failed", e2);
                }
            }
        }
        return;
    }

    public native synchronized void updateMemoryMappingFilePath(String str);
}
