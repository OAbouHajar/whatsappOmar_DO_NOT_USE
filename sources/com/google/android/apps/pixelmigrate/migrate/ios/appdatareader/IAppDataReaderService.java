package com.google.android.apps.pixelmigrate.migrate.ios.appdatareader;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;

public interface IAppDataReaderService extends IInterface {
    ParcelFileDescriptor ACI();
}
