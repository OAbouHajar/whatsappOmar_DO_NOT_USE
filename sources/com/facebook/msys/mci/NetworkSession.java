package com.facebook.msys.mci;

import X.AnonymousClass1z9;
import X.AnonymousClass5Ky;
import X.AnonymousClass5Kz;
import X.C004201v;
import X.C42991zA;
import X.C48862Pr;
import X.C95744nD;
import android.util.Log;
import com.facebook.simplejni.NativeHolder;
import java.io.IOException;
import java.util.HashMap;

public class NetworkSession {
    public static final String TAG = "NetworkSession";
    public final HashMap mCallbackMap = new HashMap();
    public final DataTaskListener mDataTaskListener;
    public boolean mDisposed;
    public final AnonymousClass5Ky mDisposer;
    public final NativeHolder mNativeHolder;
    public final NotificationCenter mNotificationCenter;

    public NetworkSession(String str, NotificationCenter notificationCenter, C42991zA r5) {
        C004201v.A01("NetworkSession.new");
        try {
            this.mNotificationCenter = notificationCenter;
            AnonymousClass1z9 r1 = (AnonymousClass1z9) r5;
            this.mDataTaskListener = r1.A01;
            this.mDisposer = new C95744nD(this, r5);
            this.mNativeHolder = initNativeHolder(str, notificationCenter);
            int networkSessionTimeoutIntervalMs = getNetworkSessionTimeoutIntervalMs();
            if (networkSessionTimeoutIntervalMs > 0) {
                r1.A00 = networkSessionTimeoutIntervalMs;
            }
        } finally {
            C004201v.A00();
        }
    }

    private void dispatchProgressUpdateToObserver(String str, long j2, long j3, long j4) {
        if (this.mCallbackMap.containsKey(str)) {
            this.mCallbackMap.get(str);
        }
    }

    private native NativeHolder initNativeHolder(String str, NotificationCenter notificationCenter);

    private native void markDataTaskAsCompleted(String str, String str2, int i2, UrlResponse urlResponse, byte[] bArr, String str3, Throwable th, boolean z2);

    private native void nativeDispose();

    private void onCancelDataTask(String str) {
        Log.d(TAG, "DataTask with taskIdentifier %s cancelled by Msys");
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onCancelDataTask(str, this);
        }
    }

    private void onNewDataTask(DataTask dataTask) {
        Log.d(TAG, "New data task received from Msys");
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onNewTask(dataTask, this);
        }
    }

    private void onUpdateStreamingDataTask(byte[] bArr, String str) {
        Log.d(TAG, "Msys just sent us a streaming DataTask update!");
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onUpdateStreamingDataTask(bArr, str, this);
        }
    }

    private native void registerDownloadTaskProgressObserver(String str);

    private native void registerUploadTaskProgressObserver(String str);

    private native void setNetworkStateConnectedNative(NotificationCenter notificationCenter);

    private native void setNetworkStateDisconnectedNative(NotificationCenter notificationCenter);

    public native synchronized void canHandleStreamingUploadUpdate(String str);

    public synchronized void dispose() {
        if (!this.mDisposed) {
            nativeDispose();
            this.mDisposed = true;
        }
    }

    public void executeInNetworkContext(C48862Pr r3) {
        Execution.executeAsyncWithPriority(r3, 3, 0);
    }

    public native int getNetworkSessionTimeoutIntervalMs();

    public native DataTask[] getPendingDataTasks();

    public synchronized void markDataTaskAsCompletedCallback(String str, String str2, int i2, UrlResponse urlResponse, byte[] bArr, String str3, IOException iOException, boolean z2) {
        markDataTaskAsCompleted(str, str2, i2, urlResponse, bArr, str3, iOException, z2);
        if (this.mCallbackMap.containsKey(str2)) {
            this.mCallbackMap.remove(str2);
        }
    }

    public synchronized void registerDownloadTaskProgressObserverCallback(String str, AnonymousClass5Kz r3) {
        this.mCallbackMap.put(str, r3);
        registerDownloadTaskProgressObserver(str);
    }

    public synchronized void registerUploadTaskProgressObserverCallback(String str, AnonymousClass5Kz r3) {
        this.mCallbackMap.put(str, r3);
        registerUploadTaskProgressObserver(str);
    }

    public void setNetworkStateConnected() {
        setNetworkStateConnectedNative(this.mNotificationCenter);
    }

    public void setNetworkStateDisconnected() {
        setNetworkStateDisconnectedNative(this.mNotificationCenter);
    }

    public native void updateDataTaskDownloadProgress(String str, long j2, long j3, long j4);

    public native void updateDataTaskUploadProgress(String str, long j2, long j3, long j4);
}
