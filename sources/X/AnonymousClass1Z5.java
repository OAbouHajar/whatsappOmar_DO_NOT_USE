package X;

import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.1Z5  reason: invalid class name */
public class AnonymousClass1Z5 extends Thread {
    public final ThreadPoolExecutor A00;
    public final AtomicInteger A01;
    public final C28811Xu A02;
    public final C28731Xk A03;

    public AnonymousClass1Z5(String str, AtomicInteger atomicInteger, C28811Xu r12, C28731Xk r13, int i2, int i3, boolean z2) {
        super(str);
        this.A02 = r12;
        this.A03 = r13;
        this.A01 = atomicInteger;
        ThreadPoolExecutor threadPoolExecutor = null;
        if (z2) {
            threadPoolExecutor = new ThreadPoolExecutor(i2, i3, 60, TimeUnit.SECONDS, new SynchronousQueue(), new AnonymousClass2PZ());
        }
        this.A00 = threadPoolExecutor;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.setRejectedExecutionHandler(new AnonymousClass2Pa(this, r12));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0441, code lost:
        if (r2 >= 500) goto L_0x0443;
     */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0084 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(org.whispersystems.jobqueue.Job r22) {
        /*
            r21 = this;
            r4 = r21
            java.util.concurrent.atomic.AtomicInteger r6 = r4.A01
            r6.getAndIncrement()
            r0 = r22
            org.whispersystems.jobqueue.JobParameters r1 = r0.parameters
            int r5 = r1.retryCount
            int r3 = r0.A00
        L_0x000f:
            if (r3 >= r5) goto L_0x0019
            r0.A01()     // Catch:{ Exception -> 0x0069 }
            org.whispersystems.jobqueue.JobConsumer$JobResult r2 = org.whispersystems.jobqueue.JobConsumer$JobResult.SUCCESS     // Catch:{ Exception -> 0x0069 }
            goto L_0x001b
        L_0x0017:
            if (r11 != 0) goto L_0x007c
        L_0x0019:
            org.whispersystems.jobqueue.JobConsumer$JobResult r2 = org.whispersystems.jobqueue.JobConsumer$JobResult.FAILURE
        L_0x001b:
            org.whispersystems.jobqueue.JobConsumer$JobResult r1 = org.whispersystems.jobqueue.JobConsumer$JobResult.DEFERRED
            if (r2 != r1) goto L_0x002f
            X.1Xu r1 = r4.A02
            r1.A02(r0)
        L_0x0024:
            org.whispersystems.jobqueue.JobParameters r0 = r0.parameters
            java.lang.String r2 = r0.groupId
            if (r2 == 0) goto L_0x0587
            X.1Xu r1 = r4.A02
            monitor-enter(r1)
            goto L_0x0576
        L_0x002f:
            org.whispersystems.jobqueue.JobConsumer$JobResult r1 = org.whispersystems.jobqueue.JobConsumer$JobResult.FAILURE
            if (r2 != r1) goto L_0x0036
            r0.A00()
        L_0x0036:
            org.whispersystems.jobqueue.JobParameters r1 = r0.parameters
            boolean r1 = r1.isPersistent
            if (r1 == 0) goto L_0x0057
            X.1Xk r1 = r4.A03
            long r7 = r0.A01
            X.1Xn r1 = r1.A03
            android.database.sqlite.SQLiteDatabase r5 = r1.getWritableDatabase()
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r1 = 0
            r3[r1] = r2
            java.lang.String r2 = "queue"
            java.lang.String r1 = "_id = ?"
            r5.delete(r2, r1, r3)
        L_0x0057:
            android.os.PowerManager$WakeLock r5 = r0.A02
            if (r5 == 0) goto L_0x0024
            org.whispersystems.jobqueue.JobParameters r1 = r0.parameters
            long r7 = r1.wakeLockTimeout
            r2 = 0
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0024
            r5.release()
            goto L_0x0024
        L_0x0069:
            r7 = move-exception
            java.lang.String r1 = "JobConsumer"
            android.util.Log.w(r1, r7)
            boolean r1 = r7 instanceof java.lang.RuntimeException
            if (r1 != 0) goto L_0x058b
            boolean r1 = r0 instanceof X.C28781Xp
            if (r1 == 0) goto L_0x0089
            java.lang.String r1 = "Fetch2FAEmailStatusJob/exception"
        L_0x0079:
            com.whatsapp.util.Log.w(r1, r7)
        L_0x007c:
            boolean r1 = r0.A03()
            int r3 = r3 + 1
            if (r1 != 0) goto L_0x000f
            r0.A00 = r3
            org.whispersystems.jobqueue.JobConsumer$JobResult r2 = org.whispersystems.jobqueue.JobConsumer$JobResult.DEFERRED
            goto L_0x001b
        L_0x0089:
            boolean r1 = r0 instanceof X.C28801Xr
            if (r1 != 0) goto L_0x007c
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.messagejob.AsyncMessageJob
            if (r1 == 0) goto L_0x00c4
            r10 = r0
            com.obwhatsapp.jobqueue.job.messagejob.AsyncMessageJob r10 = (com.obwhatsapp.jobqueue.job.messagejob.AsyncMessageJob) r10
            java.lang.String r1 = "asyncMessageJob/exception while running async message job"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r1)
            java.lang.String r1 = "; rowId="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            long r1 = r10.rowId
            r8.append(r1)
            java.lang.String r1 = "; job="
            r8.append(r1)
            boolean r1 = r10 instanceof com.obwhatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob
            if (r1 == 0) goto L_0x00c1
            java.lang.String r1 = "processVCard"
        L_0x00b2:
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            goto L_0x0079
        L_0x00c1:
            java.lang.String r1 = "asyncTokenize"
            goto L_0x00b2
        L_0x00c4:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob
            if (r1 == 0) goto L_0x00d8
            r2 = r0
            com.obwhatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob r2 = (com.obwhatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob) r2
            java.lang.String r1 = "SyncdTableEmptyKeyCheckJob/onShouldRetry"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.139 r2 = r2.A00
            r1 = 7
            r2.A03(r1)
            goto L_0x0019
        L_0x00d8:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SyncdDeleteAllDataForNonMdUserJob
            if (r1 == 0) goto L_0x00ec
            r2 = r0
            com.obwhatsapp.jobqueue.job.SyncdDeleteAllDataForNonMdUserJob r2 = (com.obwhatsapp.jobqueue.job.SyncdDeleteAllDataForNonMdUserJob) r2
            java.lang.String r1 = "SyncdDeleteAllDataForNonMdUserJob/onShouldRetry"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.139 r2 = r2.A01
            r1 = 1
            r2.A08(r1)
            goto L_0x0019
        L_0x00ec:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SyncProfilePictureJob
            if (r1 == 0) goto L_0x010a
            r2 = r0
            com.obwhatsapp.jobqueue.job.SyncProfilePictureJob r2 = (com.obwhatsapp.jobqueue.job.SyncProfilePictureJob) r2
            java.lang.String r1 = "SyncProfilePictureJob/onShouldReply/exception while running picture sync param="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
        L_0x00fe:
            r8.append(r1)
        L_0x0101:
            java.lang.String r1 = r8.toString()
            com.whatsapp.util.Log.w((java.lang.String) r1)
            goto L_0x007c
        L_0x010a:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SyncDevicesJob
            if (r1 == 0) goto L_0x011d
            r2 = r0
            com.obwhatsapp.jobqueue.job.SyncDevicesJob r2 = (com.obwhatsapp.jobqueue.job.SyncDevicesJob) r2
            java.lang.String r1 = "SyncDevicesJob/onShouldReply/exception while running devices sync param="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x00fe
        L_0x011d:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob
            if (r1 == 0) goto L_0x013b
            r2 = r0
            com.obwhatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob r2 = (com.obwhatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob) r2
            java.lang.String r1 = "SyncDeviceAndResendMessageJob/onShouldReply/param="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
        L_0x012f:
            r8.append(r1)
            java.lang.String r1 = " ;exception="
            r8.append(r1)
            r8.append(r7)
            goto L_0x0101
        L_0x013b:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SyncDeviceForAdvValidationJob
            if (r1 != 0) goto L_0x0019
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SyncDeviceAndResendMessageJob
            if (r1 == 0) goto L_0x0152
            r2 = r0
            com.obwhatsapp.jobqueue.job.SyncDeviceAndResendMessageJob r2 = (com.obwhatsapp.jobqueue.job.SyncDeviceAndResendMessageJob) r2
            java.lang.String r1 = "SyncDeviceAndResendMessageJob/onShouldReply/param="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x012f
        L_0x0152:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob
            if (r1 == 0) goto L_0x016d
            r2 = r0
            com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob r2 = (com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob) r2
            java.lang.String r1 = "exception while running send status privacy job"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
        L_0x0164:
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            goto L_0x0079
        L_0x016d:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendRetryReceiptJob
            if (r1 == 0) goto L_0x0180
            r2 = r0
            com.obwhatsapp.jobqueue.job.SendRetryReceiptJob r2 = (com.obwhatsapp.jobqueue.job.SendRetryReceiptJob) r2
            java.lang.String r1 = "exception while running sent persistent retry job"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x0164
        L_0x0180:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendReadReceiptJob
            if (r1 == 0) goto L_0x0193
            r2 = r0
            com.obwhatsapp.jobqueue.job.SendReadReceiptJob r2 = (com.obwhatsapp.jobqueue.job.SendReadReceiptJob) r2
            java.lang.String r1 = "exception while running sent read receipts job"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x0164
        L_0x0193:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2
            if (r1 == 0) goto L_0x019f
            r1 = r0
            com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2 r1 = (com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2) r1
            r1.A04()
            goto L_0x007c
        L_0x019f:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendPlayedReceiptJob
            if (r1 == 0) goto L_0x01b8
            r8 = r0
            com.obwhatsapp.jobqueue.job.SendPlayedReceiptJob r8 = (com.obwhatsapp.jobqueue.job.SendPlayedReceiptJob) r8
            java.lang.String r1 = "SendPlayedReceiptJob/exception while running sent played receipt job; id="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r8.messageId
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x0079
        L_0x01b8:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendPermanentFailureReceiptJob
            if (r1 == 0) goto L_0x01f3
            r2 = r0
            com.obwhatsapp.jobqueue.job.SendPermanentFailureReceiptJob r2 = (com.obwhatsapp.jobqueue.job.SendPermanentFailureReceiptJob) r2
            java.lang.String r1 = "exception while running send permanent failure receipt job"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = "; jid="
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r1)
            java.lang.String r1 = r2.jid
            r9.append(r1)
            java.lang.String r1 = "; participant="
            r9.append(r1)
            java.lang.String r1 = r2.participant
            r9.append(r1)
            java.lang.String r1 = "; id="
            r9.append(r1)
            java.lang.String r1 = r2.messageKeyId
        L_0x01e3:
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            goto L_0x0079
        L_0x01f3:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendPeerMessageJob
            if (r1 == 0) goto L_0x0207
            r2 = r0
            com.obwhatsapp.jobqueue.job.SendPeerMessageJob r2 = (com.obwhatsapp.jobqueue.job.SendPeerMessageJob) r2
            java.lang.String r1 = "SendPeerMessageJob/onShouldReply/exception while running"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x0164
        L_0x0207:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendPaymentInviteSetupJob
            if (r1 == 0) goto L_0x021b
            r2 = r0
            com.obwhatsapp.jobqueue.job.SendPaymentInviteSetupJob r2 = (com.obwhatsapp.jobqueue.job.SendPaymentInviteSetupJob) r2
            java.lang.String r1 = "exception while running SendPaymentInviteSetupJob job"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x0164
        L_0x021b:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob
            if (r1 == 0) goto L_0x023d
            r2 = r0
            com.obwhatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob r2 = (com.obwhatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob) r2
            java.lang.String r1 = "exception while running send order status update failure receipt job"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = "; jid="
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r1)
            java.lang.String r1 = r2.jid
            r9.append(r1)
            java.lang.String r1 = "; id="
            r9.append(r1)
            java.lang.String r1 = r2.messageKeyId
            goto L_0x01e3
        L_0x023d:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendMediaErrorReceiptJob
            if (r1 == 0) goto L_0x0256
            r8 = r0
            com.obwhatsapp.jobqueue.job.SendMediaErrorReceiptJob r8 = (com.obwhatsapp.jobqueue.job.SendMediaErrorReceiptJob) r8
            java.lang.String r1 = "SendMediaErrorReceiptJob/exception while running sent played receipt job id="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r8.messageId
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x0079
        L_0x0256:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendLiveLocationKeyJob
            if (r1 == 0) goto L_0x026a
            r2 = r0
            com.obwhatsapp.jobqueue.job.SendLiveLocationKeyJob r2 = (com.obwhatsapp.jobqueue.job.SendLiveLocationKeyJob) r2
            java.lang.String r1 = "exception while running send live location key job"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x0164
        L_0x026a:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendFinalLiveLocationRetryJob
            if (r1 == 0) goto L_0x027e
            r2 = r0
            com.obwhatsapp.jobqueue.job.SendFinalLiveLocationRetryJob r2 = (com.obwhatsapp.jobqueue.job.SendFinalLiveLocationRetryJob) r2
            java.lang.String r1 = "exception while running send final live location retry job"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x0164
        L_0x027e:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob
            if (r1 == 0) goto L_0x0292
            r2 = r0
            com.obwhatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob r2 = (com.obwhatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob) r2
            java.lang.String r1 = "exception while running send final live location job"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x0164
        L_0x0292:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendEngagedReceiptJob
            if (r1 == 0) goto L_0x02a5
            r1 = r0
            com.obwhatsapp.jobqueue.job.SendEngagedReceiptJob r1 = (com.obwhatsapp.jobqueue.job.SendEngagedReceiptJob) r1
            java.lang.String r2 = r1.A04()
            java.lang.String r1 = "exception while running sent engaged receipts job: "
            java.lang.String r1 = X.C18450wi.A06(r1, r2)
            goto L_0x0079
        L_0x02a5:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendE2EMessageJob
            if (r1 == 0) goto L_0x0345
            r1 = r0
            com.obwhatsapp.jobqueue.job.SendE2EMessageJob r1 = (com.obwhatsapp.jobqueue.job.SendE2EMessageJob) r1
            java.lang.String r2 = "sende2emessagejob/exception while sending e2e message"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            java.lang.String r2 = r1.A04()
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.whatsapp.util.Log.w(r2, r7)
            boolean r2 = r7 instanceof com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException
            r13 = 0
            if (r2 == 0) goto L_0x04e8
            X.0w1 r8 = r1.A09
            java.lang.String r2 = r1.id
            int r10 = r2.hashCode()
            r9 = 7
            boolean r2 = r8.A0M
            if (r2 == 0) goto L_0x02df
            X.18E r8 = r8.A0E
            boolean r2 = r8.A07(r10)
            if (r2 == 0) goto L_0x02df
            r8.A02(r10, r9)
        L_0x02df:
            r9 = r7
            com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException r9 = (com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException) r9
            int r2 = r9.encryptionRetryCount
            r8 = 3
            if (r2 <= r8) goto L_0x0552
            java.lang.String r2 = "sende2emessagejob/encryption failure limit reached for "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            com.whatsapp.jid.DeviceJid r2 = r9.jid
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r2)
            X.0w1 r3 = r1.A09
            java.lang.String r2 = r1.id
            int r5 = r2.hashCode()
            boolean r2 = r3.A0M
            if (r2 == 0) goto L_0x0312
            X.18E r3 = r3.A0E
            boolean r2 = r3.A07(r5)
            if (r2 == 0) goto L_0x0312
            r3.A06(r5, r8)
        L_0x0312:
            X.0w1 r7 = r1.A09
            X.0tZ r8 = r1.A0c
            int r10 = r8.A1H
            X.0tZ r2 = r1.A0c
            int r11 = r2.A0A
            X.2Pd r2 = r1.A0U
            java.util.Collection r2 = r2.A00()
            int r12 = r2.size()
            X.0t3 r2 = r1.A0C
            long r15 = r2.A00()
            X.0tZ r2 = r1.A0c
            long r2 = r2.A0I
            long r15 = r15 - r2
            boolean r19 = r1.A08()
            boolean r1 = r1.A0l
            r9 = 12
            r14 = 0
            r17 = 0
            r18 = 0
            r20 = r1
            r7.A0I(r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20)
            goto L_0x0019
        L_0x0345:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendDisableLiveLocationJob
            if (r1 == 0) goto L_0x0359
            r2 = r0
            com.obwhatsapp.jobqueue.job.SendDisableLiveLocationJob r2 = (com.obwhatsapp.jobqueue.job.SendDisableLiveLocationJob) r2
            java.lang.String r1 = "exception while running disable live location job"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x0164
        L_0x0359:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob
            if (r1 == 0) goto L_0x036b
            r2 = r0
            com.obwhatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob r2 = (com.obwhatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob) r2
            java.lang.String r1 = "SendDeleteHistorySyncMmsJob/ exception while running job chunkId="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.chunkId
            goto L_0x00fe
        L_0x036b:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob
            if (r1 == 0) goto L_0x037f
            r2 = r0
            com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob r2 = (com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob) r2
            java.lang.String r1 = "exception while running rotate signed pre key job"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x0164
        L_0x037f:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.RehydrateTemplateJob
            if (r1 == 0) goto L_0x039d
            r2 = r0
            com.obwhatsapp.jobqueue.job.RehydrateTemplateJob r2 = (com.obwhatsapp.jobqueue.job.RehydrateTemplateJob) r2
            java.lang.String r1 = "RehydrateTemplateJob/onShouldRetry/error exception while rehydrating hsm message, exception="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = r2.A04()
        L_0x0391:
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.w(r1, r7)
            goto L_0x0019
        L_0x039d:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.RehydrateHsmJob
            if (r1 == 0) goto L_0x03b0
            r2 = r0
            com.obwhatsapp.jobqueue.job.RehydrateHsmJob r2 = (com.obwhatsapp.jobqueue.job.RehydrateHsmJob) r2
            java.lang.String r1 = "RehydrateHsmJob/onShouldRetry/w: exception while rehydrating message"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x0391
        L_0x03b0:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.ReceiptProcessingJob
            if (r1 == 0) goto L_0x03c4
            r2 = r0
            com.obwhatsapp.jobqueue.job.ReceiptProcessingJob r2 = (com.obwhatsapp.jobqueue.job.ReceiptProcessingJob) r2
            java.lang.String r1 = "ReceiptProcessingJob/onShouldRetry/exception while running param="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x00fe
        L_0x03c4:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob
            if (r1 == 0) goto L_0x03d8
            r2 = r0
            com.obwhatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob r2 = (com.obwhatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob) r2
            java.lang.String r1 = "ReceiptMultiTargetProcessingJob/onShouldRetry/exception while running param="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x00fe
        L_0x03d8:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.GetVNameCertificateJob
            if (r1 == 0) goto L_0x03ec
            r2 = r0
            com.obwhatsapp.jobqueue.job.GetVNameCertificateJob r2 = (com.obwhatsapp.jobqueue.job.GetVNameCertificateJob) r2
            java.lang.String r1 = "exception while running get vname certificate job"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x0164
        L_0x03ec:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.GetStatusPrivacyJob
            if (r1 == 0) goto L_0x0410
            java.lang.String r1 = "exception while running get status privacy job"
        L_0x03f2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r1)
            java.lang.String r1 = "; persistentId="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            long r1 = r0.A01
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            goto L_0x0079
        L_0x0410:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob
            if (r1 == 0) goto L_0x0424
            r2 = r0
            com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob r2 = (com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob) r2
            java.lang.String r1 = "exception while running get hsm message pack job"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x0164
        L_0x0424:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.GenerateTcTokenJob
            if (r1 == 0) goto L_0x0477
            java.lang.Throwable r2 = r7.getCause()
            boolean r1 = r2 instanceof X.C48802Pe
            if (r1 == 0) goto L_0x0443
            X.2Pe r2 = (X.C48802Pe) r2
            X.1Vv r1 = r2.node
            if (r1 == 0) goto L_0x0443
            int r2 = X.C34451kH.A00(r1)
            r1 = 400(0x190, float:5.6E-43)
            if (r2 < r1) goto L_0x0443
            r1 = 500(0x1f4, float:7.0E-43)
            r11 = 0
            if (r2 < r1) goto L_0x0444
        L_0x0443:
            r11 = 1
        L_0x0444:
            java.lang.String r1 = "exception while running generate trusted contact token job, "
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r1)
            if (r11 == 0) goto L_0x0474
            java.lang.String r1 = ""
        L_0x044f:
            r9.append(r1)
            java.lang.String r1 = "retrying"
            r9.append(r1)
            java.lang.String r1 = "; persistentId="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            long r1 = r0.A01
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r9.append(r1)
        L_0x046b:
            java.lang.String r1 = r9.toString()
            com.whatsapp.util.Log.w(r1, r7)
            goto L_0x0017
        L_0x0474:
            java.lang.String r1 = "not "
            goto L_0x044f
        L_0x0477:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.DeleteAccountFromHsmServerJob
            if (r1 == 0) goto L_0x047f
            java.lang.String r1 = "DeleteAccountFromHsmServerJob/exception while running delete account from hsm server job"
            goto L_0x03f2
        L_0x047f:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.BulkGetPreKeyJob
            if (r1 == 0) goto L_0x0493
            r2 = r0
            com.obwhatsapp.jobqueue.job.BulkGetPreKeyJob r2 = (com.obwhatsapp.jobqueue.job.BulkGetPreKeyJob) r2
            java.lang.String r1 = "exception while running bulk get pre key job"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.String r1 = r2.A04()
            goto L_0x0164
        L_0x0493:
            r10 = r0
            X.2BT r10 = (X.AnonymousClass2BT) r10
            r8 = 0
            java.lang.Throwable r2 = r7.getCause()
            boolean r1 = r2 instanceof X.C48802Pe
            if (r1 == 0) goto L_0x04a3
            X.2Pe r2 = (X.C48802Pe) r2
            X.1Vv r8 = r2.node
        L_0x04a3:
            r11 = 1
            if (r8 == 0) goto L_0x04b3
            int r2 = X.C34451kH.A00(r8)
            r1 = 400(0x190, float:5.6E-43)
            if (r1 > r2) goto L_0x04b3
            r1 = 500(0x1f4, float:7.0E-43)
            if (r2 >= r1) goto L_0x04b3
            r11 = 0
        L_0x04b3:
            java.lang.String r1 = "GroupFetchAllMembershipApprovalRequestsJob/ exception while running iq call "
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r1)
            if (r11 == 0) goto L_0x04e5
            java.lang.String r1 = ""
        L_0x04be:
            r9.append(r1)
            java.lang.String r1 = "retrying"
            r9.append(r1)
            java.lang.String r1 = "; persistentId="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            long r1 = r10.A01
            r8.append(r1)
            java.lang.String r1 = "; groupJid="
            r8.append(r1)
            java.lang.String r1 = r10.groupJidRawString
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r9.append(r1)
            goto L_0x046b
        L_0x04e5:
            java.lang.String r1 = "not "
            goto L_0x04be
        L_0x04e8:
            java.lang.Throwable r2 = r7.getCause()
            boolean r2 = r2 instanceof X.C48812Pf
            if (r2 == 0) goto L_0x0570
            java.lang.String r2 = "sende2emessagejob/Cannot send message due to large payload "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = r1.A04()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r2)
            java.lang.Throwable r5 = r7.getCause()
            X.2Pf r5 = (X.C48812Pf) r5
            X.0w1 r7 = r1.A09
            X.0tZ r8 = r1.A0c
            r9 = 9
            int r10 = r8.A1H
            X.0tZ r2 = r1.A0c
            int r11 = r2.A0A
            X.2Pd r2 = r1.A0U
            java.util.Collection r2 = r2.A00()
            int r12 = r2.size()
            X.0t3 r2 = r1.A0C
            long r15 = r2.A00()
            X.0tZ r2 = r1.A0c
            long r2 = r2.A0I
            long r15 = r15 - r2
            boolean r2 = r1.A08()
            r17 = r2 ^ 1
            boolean r19 = r1.A08()
            boolean r2 = r1.A0l
            int r13 = r5.excessPayloadByteSize
            int r14 = r1.A00
            r18 = 0
            r20 = r2
            r7.A0I(r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20)
            X.1HK r5 = r1.A0J
            X.0tZ r1 = r1.A0c
            X.1Vw r3 = r1.A11
            r2 = 20
            r1 = 0
            r5.A01(r1, r3, r2)
            goto L_0x0019
        L_0x0552:
            java.lang.String r1 = "sende2emessagejob/retrying job due to encryption failure for "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            com.whatsapp.jid.DeviceJid r1 = r9.jid
            r2.append(r1)
            java.lang.String r1 = "; encRetryCount "
            r2.append(r1)
            int r1 = r9.encryptionRetryCount
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x0570:
            boolean r1 = r7 instanceof com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$UnrecoverableErrorException
            r11 = r1 ^ 1
            goto L_0x0017
        L_0x0576:
            java.util.Set r0 = r1.A03     // Catch:{ all -> 0x0583 }
            r0.remove(r2)     // Catch:{ all -> 0x0583 }
            X.1Xv r0 = r1.A05     // Catch:{ all -> 0x0583 }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x0583 }
            r0.open()     // Catch:{ all -> 0x0583 }
            goto L_0x0586
        L_0x0583:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0586:
            monitor-exit(r1)
        L_0x0587:
            r6.getAndDecrement()
            return
        L_0x058b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Z5.A00(org.whispersystems.jobqueue.Job):void");
    }

    public void run() {
        while (true) {
            C28811Xu r1 = this.A02;
            Job job = null;
            do {
                try {
                    job = (Job) r1.A04.take();
                    continue;
                } catch (InterruptedException unused) {
                }
            } while (job == null);
            ThreadPoolExecutor threadPoolExecutor = this.A00;
            if (threadPoolExecutor == null) {
                A00(job);
            } else {
                threadPoolExecutor.execute(new RunnableRunnableShape11S0200000_I0_9(job, 36, this));
            }
        }
    }
}
