package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;

public class TaskTracker {
    public static final TaskTracker TRACKER_CRYPTO = new TaskTracker(5, "Crypto");
    public static final TaskTracker TRACKER_DECODING = new TaskTracker(4, "Decoding");
    public static final TaskTracker TRACKER_DISK_IO = new TaskTracker(2, "Disk IO");
    public static final TaskTracker TRACKER_MAIN = new TaskTracker(1, "Main");
    public static final TaskTracker TRACKER_NETWORK = new TaskTracker(3, "Network");
    public static volatile boolean sInitialized;
    public final int mExecutionContext;
    public NativeHolder mNativeHolder;
    public final String mQueueName;

    public TaskTracker(int i2, String str) {
        this.mExecutionContext = i2;
        this.mQueueName = str;
    }

    public static native NativeHolder[] initNativeHolders(int[] iArr, String[] strArr);

    private native long nativeGetLong(int i2);

    private native String nativeGetString(int i2);

    private native int nativeGetTaskCount();
}
