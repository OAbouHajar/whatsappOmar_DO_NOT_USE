package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class LoaderManager {

    public interface LoaderCallbacks<D> {
        Loader<D> onCreateLoader(int i2, Bundle bundle);

        void onLoadFinished(Loader<D> loader, D d2);

        void onLoaderReset(Loader<D> loader);
    }

    public static void enableDebugLogging(boolean z2) {
        LoaderManagerImpl.DEBUG = z2;
    }

    public abstract void destroyLoader(int i2);

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> Loader<D> getLoader(int i2);

    public boolean hasRunningLoaders() {
        return false;
    }

    public abstract <D> Loader<D> initLoader(int i2, Bundle bundle, LoaderCallbacks<D> loaderCallbacks);

    public abstract <D> Loader<D> restartLoader(int i2, Bundle bundle, LoaderCallbacks<D> loaderCallbacks);
}
