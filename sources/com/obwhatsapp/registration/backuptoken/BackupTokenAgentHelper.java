package com.obwhatsapp.registration.backuptoken;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FileBackupHelper;
import android.os.ParcelFileDescriptor;

public class BackupTokenAgentHelper extends BackupAgentHelper {
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
    }

    public void onCreate() {
        addHelper("backup_helper_key", new FileBackupHelper(this, new String[]{"backup_token"}));
    }

    public void onRestore(BackupDataInput backupDataInput, int i2, ParcelFileDescriptor parcelFileDescriptor) {
    }
}
