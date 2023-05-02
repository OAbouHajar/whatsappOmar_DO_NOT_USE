package org.whispersystems.jobqueue;

import X.AnonymousClass00B;
import X.AnonymousClass2BT;
import X.AnonymousClass2Q1;
import X.AnonymousClass2Q2;
import X.C15830rv;
import X.C16030sJ;
import X.C18450wi;
import X.C220816o;
import X.C28381Vw;
import X.C28781Xp;
import X.C28801Xr;
import X.C33211iD;
import X.C33231iF;
import android.os.PowerManager;
import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;
import com.obwhatsapp.jobqueue.job.BulkGetPreKeyJob;
import com.obwhatsapp.jobqueue.job.DeleteAccountFromHsmServerJob;
import com.obwhatsapp.jobqueue.job.GenerateTcTokenJob;
import com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob;
import com.obwhatsapp.jobqueue.job.GetStatusPrivacyJob;
import com.obwhatsapp.jobqueue.job.GetVNameCertificateJob;
import com.obwhatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob;
import com.obwhatsapp.jobqueue.job.ReceiptProcessingJob;
import com.obwhatsapp.jobqueue.job.RehydrateHsmJob;
import com.obwhatsapp.jobqueue.job.RehydrateTemplateJob;
import com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob;
import com.obwhatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob;
import com.obwhatsapp.jobqueue.job.SendDisableLiveLocationJob;
import com.obwhatsapp.jobqueue.job.SendE2EMessageJob;
import com.obwhatsapp.jobqueue.job.SendEngagedReceiptJob;
import com.obwhatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.obwhatsapp.jobqueue.job.SendFinalLiveLocationRetryJob;
import com.obwhatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.obwhatsapp.jobqueue.job.SendMediaErrorReceiptJob;
import com.obwhatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob;
import com.obwhatsapp.jobqueue.job.SendPaymentInviteSetupJob;
import com.obwhatsapp.jobqueue.job.SendPeerMessageJob;
import com.obwhatsapp.jobqueue.job.SendPermanentFailureReceiptJob;
import com.obwhatsapp.jobqueue.job.SendPlayedReceiptJob;
import com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2;
import com.obwhatsapp.jobqueue.job.SendReadReceiptJob;
import com.obwhatsapp.jobqueue.job.SendRetryReceiptJob;
import com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob;
import com.obwhatsapp.jobqueue.job.SyncDeviceAndResendMessageJob;
import com.obwhatsapp.jobqueue.job.SyncDeviceForAdvValidationJob;
import com.obwhatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob;
import com.obwhatsapp.jobqueue.job.SyncDevicesJob;
import com.obwhatsapp.jobqueue.job.SyncProfilePictureJob;
import com.obwhatsapp.jobqueue.job.SyncdDeleteAllDataForNonMdUserJob;
import com.obwhatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob;
import com.obwhatsapp.jobqueue.job.messagejob.AsyncMessageJob;
import com.obwhatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import org.whispersystems.jobqueue.requirements.Requirement;

public abstract class Job implements Serializable {
    public transient int A00;
    public transient long A01;
    public transient PowerManager.WakeLock A02;
    public final JobParameters parameters;

    public Job(JobParameters jobParameters) {
        this.parameters = jobParameters;
    }

    public void A00() {
        String A06;
        StringBuilder sb;
        String A04;
        String str;
        if (this instanceof C28781Xp) {
            A06 = "Fetch2FAEmailStatusJob/canceled";
        } else if (this instanceof C28801Xr) {
            return;
        } else {
            if (this instanceof AsyncMessageJob) {
                AsyncMessageJob asyncMessageJob = (AsyncMessageJob) this;
                StringBuilder sb2 = new StringBuilder("asyncMessageJob/canceled async message job");
                StringBuilder sb3 = new StringBuilder("; rowId=");
                sb3.append(asyncMessageJob.rowId);
                sb3.append("; job=");
                sb3.append(asyncMessageJob instanceof ProcessVCardMessageJob ? "processVCard" : "asyncTokenize");
                sb2.append(sb3.toString());
                A06 = sb2.toString();
            } else if (this instanceof SyncdTableEmptyKeyCheckJob) {
                Log.i("SyncdTableEmptyKeyCheckJob/onCanceled");
                ((SyncdTableEmptyKeyCheckJob) this).A00.A03(7);
                return;
            } else if (this instanceof SyncdDeleteAllDataForNonMdUserJob) {
                Log.i("SyncdDeleteAllDataForNonMdUserJob/onCanceled");
                ((SyncdDeleteAllDataForNonMdUserJob) this).A01.A08(true);
                return;
            } else if (this instanceof SyncProfilePictureJob) {
                SyncProfilePictureJob syncProfilePictureJob = (SyncProfilePictureJob) this;
                StringBuilder sb4 = new StringBuilder("SyncProfilePictureJob/onCanceled/cancel sync picture job param=");
                sb4.append(syncProfilePictureJob.A04());
                Log.w(sb4.toString());
                AnonymousClass00B.A0A("jid list is empty", C16030sJ.A09(syncProfilePictureJob.jids));
                return;
            } else if (this instanceof SyncDevicesJob) {
                SyncDevicesJob syncDevicesJob = (SyncDevicesJob) this;
                StringBuilder sb5 = new StringBuilder("SyncDevicesJob/onCanceled/cancel sync devices job param=");
                sb5.append(syncDevicesJob.A04());
                Log.w(sb5.toString());
                syncDevicesJob.A01.A00(syncDevicesJob.jids);
                return;
            } else if (this instanceof SyncDevicesAndSendInvisibleMessageJob) {
                SyncDevicesAndSendInvisibleMessageJob syncDevicesAndSendInvisibleMessageJob = (SyncDevicesAndSendInvisibleMessageJob) this;
                StringBuilder sb6 = new StringBuilder("SyncDeviceAndResendMessageJob/onCanceled/param=");
                sb6.append(syncDevicesAndSendInvisibleMessageJob.A04());
                Log.w(sb6.toString());
                C220816o r1 = syncDevicesAndSendInvisibleMessageJob.A01;
                C28381Vw r0 = syncDevicesAndSendInvisibleMessageJob.A04;
                Set set = r1.A02;
                synchronized (set) {
                    set.remove(r0);
                }
                return;
            } else if (this instanceof SyncDeviceForAdvValidationJob) {
                return;
            } else {
                if (this instanceof SyncDeviceAndResendMessageJob) {
                    SyncDeviceAndResendMessageJob syncDeviceAndResendMessageJob = (SyncDeviceAndResendMessageJob) this;
                    StringBuilder sb7 = new StringBuilder("SyncDeviceAndResendMessageJob/onCanceled/param=");
                    sb7.append(syncDeviceAndResendMessageJob.A04());
                    Log.w(sb7.toString());
                    C220816o r12 = syncDeviceAndResendMessageJob.A05;
                    C28381Vw r02 = syncDeviceAndResendMessageJob.A0H;
                    Set set2 = r12.A02;
                    synchronized (set2) {
                        set2.remove(r02);
                    }
                    return;
                }
                if (this instanceof SendStatusPrivacyListJob) {
                    sb = new StringBuilder("canceled send status privacy job");
                    A04 = ((SendStatusPrivacyListJob) this).A04();
                } else if (this instanceof SendRetryReceiptJob) {
                    sb = new StringBuilder("canceled sent read receipts job");
                    A04 = ((SendRetryReceiptJob) this).A04();
                } else if (this instanceof SendReadReceiptJob) {
                    sb = new StringBuilder("canceled sent read receipts job");
                    A04 = ((SendReadReceiptJob) this).A04();
                } else if (this instanceof SendPlayedReceiptJobV2) {
                    sb = new StringBuilder("SendPlayedReceiptJobV2/onCanceled; ");
                    A04 = ((SendPlayedReceiptJobV2) this).A04();
                } else if (this instanceof SendPlayedReceiptJob) {
                    StringBuilder sb8 = new StringBuilder("SendPlayedReceiptJob/canceled send played receipts job; id=");
                    sb8.append(((SendPlayedReceiptJob) this).messageId);
                    A06 = sb8.toString();
                } else if (this instanceof SendPermanentFailureReceiptJob) {
                    SendPermanentFailureReceiptJob sendPermanentFailureReceiptJob = (SendPermanentFailureReceiptJob) this;
                    StringBuilder sb9 = new StringBuilder("canceled send permananent-failure receipt job");
                    StringBuilder sb10 = new StringBuilder("; jid=");
                    sb10.append(sendPermanentFailureReceiptJob.jid);
                    sb10.append("; participant=");
                    sb10.append(sendPermanentFailureReceiptJob.participant);
                    sb10.append("; id=");
                    sb10.append(sendPermanentFailureReceiptJob.messageKeyId);
                    sb9.append(sb10.toString());
                    A06 = sb9.toString();
                } else if (this instanceof SendPeerMessageJob) {
                    sb = new StringBuilder("SendPeerMessageJob/onCanceled/cancel send job");
                    A04 = ((SendPeerMessageJob) this).A04();
                } else if (this instanceof SendPaymentInviteSetupJob) {
                    sb = new StringBuilder("canceled SendPaymentInviteSetupJob job");
                    A04 = ((SendPaymentInviteSetupJob) this).A04();
                } else if (this instanceof SendOrderStatusUpdateFailureReceiptJob) {
                    SendOrderStatusUpdateFailureReceiptJob sendOrderStatusUpdateFailureReceiptJob = (SendOrderStatusUpdateFailureReceiptJob) this;
                    StringBuilder sb11 = new StringBuilder("canceled send order-status-update-failure receipt job");
                    StringBuilder sb12 = new StringBuilder("; jid=");
                    sb12.append(sendOrderStatusUpdateFailureReceiptJob.jid);
                    sb12.append("; id=");
                    sb12.append(sendOrderStatusUpdateFailureReceiptJob.messageKeyId);
                    sb11.append(sb12.toString());
                    A06 = sb11.toString();
                } else if (this instanceof SendMediaErrorReceiptJob) {
                    StringBuilder sb13 = new StringBuilder("SendMediaErrorReceiptJob/canceled send played receipts job id=");
                    sb13.append(((SendMediaErrorReceiptJob) this).messageId);
                    A06 = sb13.toString();
                } else if (this instanceof SendLiveLocationKeyJob) {
                    sb = new StringBuilder("canceled send live location key job");
                    A04 = ((SendLiveLocationKeyJob) this).A04();
                } else if (this instanceof SendFinalLiveLocationRetryJob) {
                    sb = new StringBuilder("canceled send final live location retry job");
                    A04 = ((SendFinalLiveLocationRetryJob) this).A04();
                } else if (this instanceof SendFinalLiveLocationNotificationJob) {
                    sb = new StringBuilder("canceled send final live location job");
                    A04 = ((SendFinalLiveLocationNotificationJob) this).A04();
                } else if (this instanceof SendEngagedReceiptJob) {
                    A06 = C18450wi.A06("canceled sent engaged receipts job: ", ((SendEngagedReceiptJob) this).A04());
                } else if (this instanceof SendE2EMessageJob) {
                    SendE2EMessageJob sendE2EMessageJob = (SendE2EMessageJob) this;
                    StringBuilder sb14 = new StringBuilder("sende2emessagejob/e2e send job canceled");
                    sb14.append(sendE2EMessageJob.A04());
                    Log.w(sb14.toString());
                    SendE2EMessageJob.A0m.remove(new AnonymousClass2Q1(sendE2EMessageJob.jid, sendE2EMessageJob.id, sendE2EMessageJob.participant, sendE2EMessageJob.editVersion));
                    C33211iD r2 = sendE2EMessageJob.A0b;
                    if ((r2.A01 & 256) == 256) {
                        AnonymousClass2Q2 r03 = r2.A0Q;
                        if (r03 == null) {
                            r03 = AnonymousClass2Q2.A04;
                        }
                        C33231iF r04 = r03.A03;
                        if (r04 == null) {
                            r04 = C33231iF.A05;
                        }
                        C15830rv A022 = C15830rv.A02(r04.A03);
                        if (A022 != null) {
                            sendE2EMessageJob.A0Y.A00(sendE2EMessageJob.A0R, new C28381Vw(A022, sendE2EMessageJob.id, true));
                            sendE2EMessageJob.A07.A0K(new RunnableRunnableShape8S0200000_I0_6(sendE2EMessageJob, 5, A022));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (this instanceof SendDisableLiveLocationJob) {
                    sb = new StringBuilder("canceled disable live location job");
                    A04 = ((SendDisableLiveLocationJob) this).A04();
                } else if (this instanceof SendDeleteHistorySyncMmsJob) {
                    StringBuilder sb15 = new StringBuilder("SendDeleteHistorySyncMmsJob/ cancelled chunkId=");
                    sb15.append(((SendDeleteHistorySyncMmsJob) this).chunkId);
                    A06 = sb15.toString();
                } else if (this instanceof RotateSignedPreKeyJob) {
                    sb = new StringBuilder("canceled rotate signed pre key job");
                    A04 = ((RotateSignedPreKeyJob) this).A04();
                } else if (this instanceof RehydrateTemplateJob) {
                    sb = new StringBuilder("RehydrateTemplateJob/onCanceled/error canceled rehydrate hsm job, loggableParam=");
                    A04 = ((RehydrateTemplateJob) this).A04();
                } else if (this instanceof RehydrateHsmJob) {
                    sb = new StringBuilder("RehydrateHsmJob/onCanceled/w: canceled rehydrate hsm job");
                    A04 = ((RehydrateHsmJob) this).A04();
                } else if (this instanceof ReceiptProcessingJob) {
                    sb = new StringBuilder("ReceiptProcessingJob/onCanceled/cancel job param=");
                    A04 = ((ReceiptProcessingJob) this).A04();
                } else if (this instanceof ReceiptMultiTargetProcessingJob) {
                    sb = new StringBuilder("ReceiptMultiTargetProcessingJob/onCanceled/cancel job param=");
                    A04 = ((ReceiptMultiTargetProcessingJob) this).A04();
                } else if (this instanceof GetVNameCertificateJob) {
                    GetVNameCertificateJob getVNameCertificateJob = (GetVNameCertificateJob) this;
                    StringBuilder sb16 = new StringBuilder("canceled get vname certificate job");
                    sb16.append(getVNameCertificateJob.A04());
                    Log.w(sb16.toString());
                    GetVNameCertificateJob.A02.remove(getVNameCertificateJob.jid);
                    return;
                } else {
                    if (this instanceof GetStatusPrivacyJob) {
                        str = "canceled get status privacy job";
                    } else if (this instanceof GetHsmMessagePackJob) {
                        GetHsmMessagePackJob getHsmMessagePackJob = (GetHsmMessagePackJob) this;
                        StringBuilder sb17 = new StringBuilder("canceled get hsm message pack job");
                        sb17.append(getHsmMessagePackJob.A04());
                        Log.w(sb17.toString());
                        HashSet hashSet = GetHsmMessagePackJob.A00;
                        synchronized (hashSet) {
                            hashSet.remove(getHsmMessagePackJob);
                        }
                        return;
                    } else if (this instanceof GenerateTcTokenJob) {
                        GenerateTcTokenJob generateTcTokenJob = (GenerateTcTokenJob) this;
                        UserJid userJid = generateTcTokenJob.A01;
                        if (userJid != null) {
                            generateTcTokenJob.A03.A01(userJid);
                        }
                        StringBuilder sb18 = new StringBuilder("canceled generate trusted contact token job");
                        StringBuilder sb19 = new StringBuilder("; persistentId=");
                        sb19.append(generateTcTokenJob.A01);
                        sb18.append(sb19.toString());
                        A06 = sb18.toString();
                    } else if (this instanceof DeleteAccountFromHsmServerJob) {
                        str = "DeleteAccountFromHsmServerJob/canceled delete account from hsm server job";
                    } else if (this instanceof BulkGetPreKeyJob) {
                        sb = new StringBuilder("canceled bulk get pre key job");
                        A04 = ((BulkGetPreKeyJob) this).A04();
                    } else {
                        AnonymousClass2BT r3 = (AnonymousClass2BT) this;
                        StringBuilder sb20 = new StringBuilder("; persistentId=");
                        sb20.append(r3.A01);
                        sb20.append("; groupJid=");
                        sb20.append(r3.groupJidRawString);
                        A06 = C18450wi.A06("GroupFetchAllMembershipApprovalRequestsJob canceled", sb20.toString());
                    }
                    StringBuilder sb21 = new StringBuilder(str);
                    StringBuilder sb22 = new StringBuilder("; persistentId=");
                    sb22.append(this.A01);
                    sb21.append(sb22.toString());
                    A06 = sb21.toString();
                }
                sb.append(A04);
                A06 = sb.toString();
            }
        }
        Log.w(A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0f9f, code lost:
        if (r1.A0D == null) goto L_0x0fa1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0fe0, code lost:
        r13 = new android.content.ContentValues();
        r12 = java.lang.Long.valueOf(r0);
        r13.put("message_row_id", r12);
        r13.put("sender_jid", r5.getRawString());
        r13.put("chat_jid", X.C16030sJ.A03(r4));
        r13.put("vcard", r9);
        r10 = r3.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:?, code lost:
        r17 = r10.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:?, code lost:
        r9 = r10.A02;
        r15 = r9.A02(r13, "messages_vcards");
        r14 = r2.A05.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x1021, code lost:
        if (r14.hasNext() == false) goto L_0x1051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x1023, code lost:
        r13 = (X.C39711sw) r14.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x102b, code lost:
        if (r13.A01 == null) goto L_0x101d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x102d, code lost:
        r2 = new android.content.ContentValues();
        r2.put("message_row_id", r12);
        r2.put("vcard_row_id", java.lang.Long.valueOf(r15));
        r2.put("vcard_jid", X.C16030sJ.A03(r13.A01));
        r9.A02(r2, "messages_vcards_jids");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x1051, code lost:
        r17.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x1073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x1078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x1231, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e7, code lost:
        if (r0.A00.A06() != false) goto L_0x01e9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:33:0x0103, B:519:0x108d] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:496:0x1077 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:501:0x107c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:506:0x1081 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:511:0x1086 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:516:0x108b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:589:0x1230 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:589:0x1230=Splitter:B:589:0x1230, B:41:0x0121=Splitter:B:41:0x0121} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r36 = this;
            r0 = r36
            boolean r1 = r0 instanceof X.C28781Xp
            if (r1 == 0) goto L_0x00ac
            X.1Xp r0 = (X.C28781Xp) r0
            java.lang.String r1 = "Fetch2FAEmailStatusJob/onRun: asking for 2FA status"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1H4 r3 = r0.A01
            X.0ug r7 = r3.A01
            java.lang.String r10 = r7.A02()
            java.lang.String r2 = "TwoFactorXmppMethods/sendGetTwoFactorAuth; iq="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1bV r4 = new X.1bV
            r4.<init>()
            r1 = 8
            com.facebook.redex.IDxRCallbackShape48S0200000_1_I0 r8 = new com.facebook.redex.IDxRCallbackShape48S0200000_1_I0
            r8.<init>(r4, r1, r3)
            java.lang.String r2 = "2fa"
            r1 = 0
            X.1Vv r6 = new X.1Vv
            r6.<init>(r2, r1)
            r1 = 4
            X.1lL[] r5 = new X.C35081lL[r1]
            X.1ks r3 = X.C34791ks.A00
            java.lang.String r1 = "to"
            X.1lL r2 = new X.1lL
            r2.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)
            r1 = 0
            r5[r1] = r2
            java.lang.String r1 = "id"
            X.1lL r2 = new X.1lL
            r2.<init>((java.lang.String) r1, (java.lang.String) r10)
            r1 = 1
            r5[r1] = r2
            java.lang.String r3 = "xmlns"
            java.lang.String r1 = "urn:xmpp:whatsapp:account"
            X.1lL r2 = new X.1lL
            r2.<init>((java.lang.String) r3, (java.lang.String) r1)
            r1 = 2
            r5[r1] = r2
            java.lang.String r3 = "type"
            java.lang.String r1 = "get"
            X.1lL r2 = new X.1lL
            r2.<init>((java.lang.String) r3, (java.lang.String) r1)
            r1 = 3
            r5[r1] = r2
            java.lang.String r1 = "iq"
            X.1Vv r9 = new X.1Vv
            r9.<init>((X.C28371Vv) r6, (java.lang.String) r1, (X.C35081lL[]) r5)
            r11 = 114(0x72, float:1.6E-43)
            r12 = 32000(0x7d00, double:1.581E-319)
            r7.A0G(r8, r9, r10, r11, r12)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x009f }
            r4.get(r12, r1)     // Catch:{ Exception -> 0x009f }
            X.0ps r0 = r0.A00
            android.content.SharedPreferences r2 = r0.A00()
            java.lang.String r1 = "two_factor_auth_email_set"
            r0 = 0
            int r0 = r2.getInt(r1, r0)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r0 = "Fetch2FAEmailStatusJob/onRun: email status fetching failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r1 = "Failing Fetch2FAEmailStatusJob, fetching status failed"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x009f:
            java.lang.String r0 = "Fetch2FAEmailStatusJob/onRun: timeout waiting for response"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "Failing Fetch2FAEmailStatusJob, timeout for response"
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            throw r1
        L_0x00ac:
            boolean r1 = r0 instanceof X.C28801Xr
            if (r1 == 0) goto L_0x00bc
            X.1Xr r0 = (X.C28801Xr) r0
            X.16v r2 = r0.A00
            java.io.File r1 = r0.fileToDelete
            byte r0 = r0.messageType
            r2.A05(r1, r0)
        L_0x00bb:
            return
        L_0x00bc:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.messagejob.AsyncMessageJob
            if (r1 == 0) goto L_0x00f0
            com.obwhatsapp.jobqueue.job.messagejob.AsyncMessageJob r0 = (com.obwhatsapp.jobqueue.job.messagejob.AsyncMessageJob) r0
            X.0tq r1 = r0.A01
            X.0tf r22 = r1.get()
            X.1cj r21 = r22.A00()     // Catch:{ all -> 0x108c }
            X.0th r3 = r0.A00     // Catch:{ all -> 0x1087 }
            long r1 = r0.rowId     // Catch:{ all -> 0x1087 }
            X.0tZ r6 = r3.A00(r1)     // Catch:{ all -> 0x1087 }
            r21.A00()     // Catch:{ all -> 0x1087 }
            r21.close()     // Catch:{ all -> 0x108c }
            r22.close()
            if (r6 == 0) goto L_0x00bb
            boolean r5 = r0 instanceof com.obwhatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob
            if (r5 == 0) goto L_0x0ed4
            r2 = r0
            com.obwhatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob r2 = (com.obwhatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob) r2
            X.1QZ r1 = r2.A05
            java.util.List r6 = X.AnonymousClass2QA.A02(r6, r1)
            if (r6 == 0) goto L_0x0ef9
            goto L_0x0ec4
        L_0x00f0:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob
            if (r1 == 0) goto L_0x0139
            com.obwhatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob r0 = (com.obwhatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob) r0
            java.lang.String r1 = "SyncdTableEmptyKeyCheckJob/onRun/start"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0zv r1 = r0.A01
            X.19K r1 = r1.A01
            X.0tf r5 = r1.get()
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x1231 }
            java.lang.String r2 = "SELECT 1 as has_empty_key FROM syncd_mutations WHERE device_id = 0  AND epoch = 0  LIMIT 1 "
            r1 = 0
            android.database.Cursor r4 = r3.A08(r2, r1)     // Catch:{ all -> 0x1231 }
            boolean r1 = r4.moveToFirst()     // Catch:{ all -> 0x1091 }
            r3 = 0
            if (r1 == 0) goto L_0x0121
            java.lang.String r1 = "has_empty_key"
            int r1 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x1091 }
            int r2 = r4.getInt(r1)     // Catch:{ all -> 0x1091 }
            r1 = 1
            if (r2 != r1) goto L_0x0121
            r3 = 1
        L_0x0121:
            r4.close()     // Catch:{ all -> 0x1231 }
            r5.close()
            if (r3 == 0) goto L_0x0135
            java.lang.String r1 = "SyncdTableEmptyKeyCheckJob/onRun/hasEmptyKeyMutation"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.139 r1 = r0.A00
            r0 = 7
            r1.A03(r0)
            return
        L_0x0135:
            java.lang.String r0 = "SyncdTableEmptyKeyCheckJob/onRun/end"
            goto L_0x026f
        L_0x0139:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SyncdDeleteAllDataForNonMdUserJob
            if (r1 == 0) goto L_0x018c
            com.obwhatsapp.jobqueue.job.SyncdDeleteAllDataForNonMdUserJob r0 = (com.obwhatsapp.jobqueue.job.SyncdDeleteAllDataForNonMdUserJob) r0
            java.lang.String r1 = "SyncdDeleteAllDataForNonMdUserJob/onRun/start"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.139 r1 = r0.A01
            android.content.SharedPreferences r3 = r1.A01()
            java.lang.String r1 = "syncd_dirty"
            r2 = -1
            int r1 = r3.getInt(r1, r2)
            if (r1 != r2) goto L_0x0188
            X.139 r1 = r0.A01
            android.content.SharedPreferences r3 = r1.A01()
            java.lang.String r2 = "syncd_bootstrap_state"
            r1 = 0
            int r1 = r3.getInt(r2, r1)
            if (r1 != 0) goto L_0x0188
            X.0zv r1 = r0.A02
            boolean r1 = r1.A0J()
            if (r1 != 0) goto L_0x0174
            X.0zv r1 = r0.A02
            boolean r1 = r1.A0I()
            if (r1 == 0) goto L_0x0188
        L_0x0174:
            X.0sK r1 = r0.A00
            boolean r1 = r1.A0G()
            if (r1 != 0) goto L_0x0188
            java.lang.String r1 = "SyncdDeleteAllDataForNonMdUserJob/onRun/nonMdUserWithMutations"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.139 r1 = r0.A01
            r0 = 1
            r1.A08(r0)
            return
        L_0x0188:
            java.lang.String r0 = "SyncdDeleteAllDataForNonMdUserJob/onRun/end"
            goto L_0x026f
        L_0x018c:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SyncProfilePictureJob
            if (r1 == 0) goto L_0x01a5
            com.obwhatsapp.jobqueue.job.SyncProfilePictureJob r0 = (com.obwhatsapp.jobqueue.job.SyncProfilePictureJob) r0
            int r1 = r0.type
            r3 = 1
            if (r1 == r3) goto L_0x0198
            r3 = 0
        L_0x0198:
            java.lang.String[] r1 = r0.jids
            java.util.List r2 = X.C16030sJ.A09(r1)
            java.lang.String r1 = "jid list is empty"
            X.AnonymousClass00B.A0A(r1, r2)
            goto L_0x1099
        L_0x01a5:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SyncDevicesJob
            if (r1 == 0) goto L_0x01ae
            com.obwhatsapp.jobqueue.job.SyncDevicesJob r0 = (com.obwhatsapp.jobqueue.job.SyncDevicesJob) r0
            r4 = 0
            goto L_0x10db
        L_0x01ae:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob
            if (r1 == 0) goto L_0x01cb
            com.obwhatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob r0 = (com.obwhatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob) r0
            java.lang.String r1 = "SyncDevicesAndSendInvisibleMessageJob/onRun/param="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x1159
        L_0x01cb:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SyncDeviceForAdvValidationJob
            if (r1 == 0) goto L_0x0244
            com.obwhatsapp.jobqueue.job.SyncDeviceForAdvValidationJob r0 = (com.obwhatsapp.jobqueue.job.SyncDeviceForAdvValidationJob) r0
            java.lang.String[] r1 = r0.jids
            java.util.List r5 = X.C16030sJ.A09(r1)
            X.0tK r1 = r0.A00
            boolean r1 = r1.A08()
            r6 = 0
            if (r1 == 0) goto L_0x01e9
            X.0tK r1 = r0.A00
            boolean r1 = r1.A06()
            r4 = 1
            if (r1 == 0) goto L_0x01f1
        L_0x01e9:
            r4 = 0
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x01f1
            return
        L_0x01f1:
            X.0rz r1 = r0.A02
            X.01D r1 = r1.A01
            java.lang.Object r3 = r1.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.String r2 = "adv_validating_users_to_sync"
            java.util.Set r3 = r3.getStringSet(r2, r1)
            X.AnonymousClass00B.A06(r3)
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.Object[] r1 = r3.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.List r1 = X.C16030sJ.A09(r1)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r1)
            boolean r1 = r6.addAll(r5)
            if (r1 == 0) goto L_0x023a
            java.lang.String[] r1 = X.C16030sJ.A0T(r6)
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r1)
            X.0rz r1 = r0.A02
            android.content.SharedPreferences$Editor r1 = r1.A0K()
            android.content.SharedPreferences$Editor r1 = r1.putStringSet(r2, r3)
            r1.apply()
        L_0x023a:
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x00bb
            if (r4 == 0) goto L_0x00bb
            goto L_0x11db
        L_0x0244:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob
            if (r1 == 0) goto L_0x0273
            com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob r0 = (com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob) r0
            long r4 = com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob.A01
            long r2 = r0.A01
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0ce6
            java.lang.String r1 = "skip send status privacy job"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r0 = r0.A04()
            r2.append(r0)
            java.lang.String r0 = "; lastJobId="
            r2.append(r0)
            long r0 = com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob.A01
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x026f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0273:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendRetryReceiptJob
            if (r1 == 0) goto L_0x037e
            com.obwhatsapp.jobqueue.job.SendRetryReceiptJob r0 = (com.obwhatsapp.jobqueue.job.SendRetryReceiptJob) r0
            r6 = 0
            r1 = 0
            int r2 = r0.localRegistrationId
            byte[] r18 = X.C28641Wx.A02(r2)
            java.lang.String r2 = r0.jid
            com.whatsapp.jid.Jid r11 = com.whatsapp.jid.Jid.getNullable(r2)
            java.lang.String r2 = r0.participant
            com.whatsapp.jid.Jid r12 = com.whatsapp.jid.Jid.getNullable(r2)
            r20 = 0
            android.util.Pair r2 = X.C41071vB.A0K(r6, r11, r12)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.Object r5 = r2.first
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            java.lang.String r25 = "receipt"
            java.lang.String r27 = "retry"
            java.lang.String r4 = r0.id
            java.lang.Object r3 = r2.second
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            java.lang.String r2 = r0.category
            if (r2 == 0) goto L_0x02ac
            r6 = r2
        L_0x02ac:
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x0373
            r2 = 0
        L_0x02b3:
            r31 = 0
            X.1ci r7 = new X.1ci
            r29 = r1
            r21 = r7
            r22 = r5
            r23 = r3
            r24 = r1
            r26 = r4
            r28 = r6
            r30 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            int r2 = r0.retryCount
            r5 = 1
            if (r2 <= 0) goto L_0x033c
            X.16P r4 = r0.A03
            r2 = 16
            com.facebook.redex.IDxCallableShape148S0100000_2_I0 r3 = new com.facebook.redex.IDxCallableShape148S0100000_2_I0
            r3.<init>(r0, r2)
            java.util.concurrent.ThreadPoolExecutor r2 = r4.A00
            java.util.concurrent.Future r2 = r2.submit(r3)
            java.lang.Object r2 = r2.get()
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r3 = r2.first
            byte[] r3 = (byte[]) r3
            java.lang.Object r4 = r2.second
            X.1dG[] r4 = (X.C30971dG[]) r4
            r2 = 0
            r14 = r4[r2]
            r15 = r4[r5]
            X.0sK r2 = r0.A00
            boolean r2 = r2.A0G()
            if (r2 == 0) goto L_0x02ff
            X.11R r2 = r0.A01
            byte[] r20 = r2.A03()
        L_0x02ff:
            X.0zt r2 = r0.A05
            java.lang.String r6 = r0.id
            java.lang.String r4 = r0.recipientJid
            com.whatsapp.jid.UserJid r13 = com.whatsapp.jid.UserJid.getNullable(r4)
            long r8 = r0.timestamp
            int r4 = r0.retryCount
            int r22 = r4 + 1
            long r4 = r0.loggableStanzaId
            java.lang.String r0 = r0.category
            r21 = 5
            X.2QJ r10 = new X.2QJ
            r23 = r8
            r25 = r4
            r16 = r6
            r17 = r0
            r19 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25)
            r3 = 0
            r0 = 11
            android.os.Message r1 = android.os.Message.obtain(r1, r3, r0, r3, r10)
        L_0x032b:
            java.lang.Object r0 = r1.obj
            X.2QJ r0 = (X.AnonymousClass2QJ) r0
            r2.A00(r0)
            X.0ug r0 = r2.A03
            java.util.concurrent.Future r0 = r0.A04(r1, r7)
        L_0x0338:
            r0.get()
            return
        L_0x033c:
            X.0zt r2 = r0.A05
            java.lang.String r10 = r0.id
            java.lang.String r3 = r0.recipientJid
            com.whatsapp.jid.UserJid r22 = com.whatsapp.jid.UserJid.getNullable(r3)
            long r5 = r0.timestamp
            int r3 = r0.retryCount
            int r31 = r3 + 1
            long r3 = r0.loggableStanzaId
            java.lang.String r9 = r0.category
            r8 = 0
            X.2QJ r0 = new X.2QJ
            r28 = r1
            r30 = 0
            r19 = r0
            r20 = r11
            r21 = r12
            r23 = r1
            r25 = r10
            r26 = r9
            r27 = r18
            r32 = r5
            r34 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34)
            r3 = 11
            android.os.Message r1 = android.os.Message.obtain(r1, r8, r3, r8, r0)
            goto L_0x032b
        L_0x0373:
            java.util.Collection r7 = r7.values()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r7)
            goto L_0x02b3
        L_0x037e:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendReadReceiptJob
            if (r1 == 0) goto L_0x0463
            com.obwhatsapp.jobqueue.job.SendReadReceiptJob r0 = (com.obwhatsapp.jobqueue.job.SendReadReceiptJob) r0
            r10 = 0
            r0.A04()
            java.lang.String r1 = r0.jid
            X.0rv r9 = X.C15830rv.A02(r1)
            X.0z0 r1 = r0.A02
            boolean r1 = r1.A00(r9)
            if (r1 == 0) goto L_0x00bb
            boolean r1 = X.C16030sJ.A0Q(r9)
            if (r1 == 0) goto L_0x03b3
            long r4 = r0.originalMessageTimestamp
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x03b3
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 + r1
            X.0t3 r1 = r0.A00
            long r2 = r1.A00()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x03b3
            return
        L_0x03b3:
            java.lang.String r1 = r0.participant
            X.0rv r8 = X.C15830rv.A02(r1)
            java.lang.String r1 = r0.remoteSender
            com.whatsapp.jid.DeviceJid r7 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            X.0z0 r1 = r0.A02
            boolean r1 = r1.A01(r9)
            if (r1 == 0) goto L_0x045f
            boolean r1 = r0.shouldForceReadSelfReceipt
            if (r1 != 0) goto L_0x045f
            java.lang.String r13 = "read"
        L_0x03cd:
            boolean r1 = X.C16030sJ.A0Q(r8)
            r4 = 0
            if (r1 == 0) goto L_0x0450
            java.lang.String r1 = "send-read-job/malformed participant flipping"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.1kq r3 = X.C34771kq.A00
            java.lang.String[] r6 = r0.messageIds
            r2 = r6[r4]
            X.1Vw r1 = new X.1Vw
            r1.<init>(r3, r2, r4)
            X.2QK r5 = new X.2QK
            r5.<init>(r9, r7, r1, r13)
        L_0x03ea:
            int r3 = r6.length
            r2 = 1
            if (r3 <= r2) goto L_0x03f6
            int r3 = r3 - r2
            java.lang.String[] r1 = new java.lang.String[r3]
            r5.A01 = r1
            java.lang.System.arraycopy(r6, r2, r1, r4, r3)
        L_0x03f6:
            android.util.Pair r2 = X.C41071vB.A0K(r7, r9, r8)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.Object r8 = r2.first
            com.whatsapp.jid.Jid r8 = (com.whatsapp.jid.Jid) r8
            boolean r11 = com.obwhatsapp.yo.yo.BlueTi(r0)
            if (r11 == 0) goto L_0x040a
            return
        L_0x040a:
            java.lang.String r11 = "receipt"
            java.lang.String[] r1 = r0.messageIds
            r12 = r1[r4]
            java.lang.Object r9 = r2.second
            com.whatsapp.jid.Jid r9 = (com.whatsapp.jid.Jid) r9
            long r1 = r0.loggableStanzaId
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x0446
            r6 = 0
        L_0x041d:
            r15 = r10
            X.1ci r7 = new X.1ci
            r14 = r10
            r16 = r6
            r17 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            long r1 = r0.loggableStanzaId
            r5.A00 = r1
            X.11o r3 = r0.A03
            X.1d2 r2 = r3.A00(r4, r1)
            if (r2 == 0) goto L_0x0438
            r1 = 6
            r2.A00(r1)
        L_0x0438:
            X.0ug r1 = r0.A01
            r0 = 89
            android.os.Message r0 = android.os.Message.obtain(r10, r4, r0, r4, r5)
            java.util.concurrent.Future r0 = r1.A04(r0, r7)
            goto L_0x0338
        L_0x0446:
            java.util.Collection r3 = r6.values()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            goto L_0x041d
        L_0x0450:
            java.lang.String[] r6 = r0.messageIds
            r2 = r6[r4]
            X.1Vw r1 = new X.1Vw
            r1.<init>(r9, r2, r4)
            X.2QK r5 = new X.2QK
            r5.<init>(r8, r7, r1, r13)
            goto L_0x03ea
        L_0x045f:
            java.lang.String r13 = "read-self"
            goto L_0x03cd
        L_0x0463:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2
            if (r1 == 0) goto L_0x058a
            com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2 r0 = (com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2) r0
            r14 = 0
            java.lang.String r1 = r0.toRawJid
            X.0rv r2 = X.C15830rv.A01(r1)
            java.lang.String r1 = r0.participantRawJid
            X.0rv r1 = X.C15830rv.A02(r1)
            android.util.Pair r6 = X.C41071vB.A0K(r14, r2, r1)
            X.0z0 r2 = r0.A02
            java.lang.Object r1 = r6.first
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            X.0rv r1 = X.C15830rv.A00(r1)
            boolean r1 = r2.A01(r1)
            if (r1 == 0) goto L_0x0527
            java.lang.String r4 = "played"
        L_0x048c:
            r0.A04()
            if (r1 != 0) goto L_0x0530
            X.1Gi r12 = r0.A00
            java.lang.String r1 = r0.toRawJid
            X.0rv r5 = X.C15830rv.A01(r1)
            java.lang.String r1 = r0.participantRawJid
            X.0rv r3 = X.C15830rv.A02(r1)
            java.lang.Long[] r2 = r0.messageRowIds
            java.lang.String[] r1 = r0.messageIds
            X.1qz r11 = new X.1qz
            r11.<init>(r5, r3, r2, r1)
            java.lang.String r1 = "PlayedSelfReceiptStore/insertPlayedSelfReceipt/toJid = "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r11.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            r9 = 0
        L_0x04c3:
            java.lang.String[] r3 = r11.A03
            int r1 = r3.length
            if (r9 >= r1) goto L_0x052b
            r10.clear()
            X.14v r5 = r12.A00
            X.0rv r1 = r11.A01
            long r1 = r5.A01(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "to_jid_row_id"
            r10.put(r1, r2)
            X.0rv r1 = r11.A00
            if (r1 == 0) goto L_0x04ee
            long r1 = r5.A01(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "participant_jid_row_id"
            r10.put(r1, r2)
        L_0x04ee:
            java.lang.Long[] r1 = r11.A02
            r2 = r1[r9]
            java.lang.String r1 = "message_row_id"
            r10.put(r1, r2)
            r2 = r3[r9]
            java.lang.String r1 = "message_id"
            r10.put(r1, r2)
            X.0tq r1 = r12.A01
            X.0tf r5 = r1.A02()
            X.1cj r13 = r5.A00()     // Catch:{ all -> 0x1231 }
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x122c }
            java.lang.String r1 = "played_self_receipt"
            long r7 = r2.A02(r10, r1)     // Catch:{ all -> 0x122c }
            r2 = -1
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x051b
            java.lang.String r1 = "PlayedSelfReceiptStore/insertPlayedSelfReceipt fail to insert"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x122c }
        L_0x051b:
            r13.A00()     // Catch:{ all -> 0x122c }
            r13.close()     // Catch:{ all -> 0x1231 }
            r5.close()
            int r9 = r9 + 1
            goto L_0x04c3
        L_0x0527:
            java.lang.String r4 = "played-self"
            goto L_0x048c
        L_0x052b:
            boolean r1 = r0.playedSelfFromPeer
            if (r1 == 0) goto L_0x0530
            return
        L_0x0530:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.Object r12 = r6.first
            com.whatsapp.jid.Jid r12 = (com.whatsapp.jid.Jid) r12
            java.lang.String r15 = "receipt"
            java.lang.String[] r2 = r0.messageIds
            r1 = 0
            r16 = r2[r1]
            java.lang.Object r13 = r6.second
            com.whatsapp.jid.Jid r13 = (com.whatsapp.jid.Jid) r13
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x0580
            r2 = 0
        L_0x054b:
            r21 = 0
            r19 = r14
            X.1ci r11 = new X.1ci
            r17 = r4
            r18 = r14
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.0ug r5 = r0.A01
            java.lang.Object r1 = r6.first
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            X.0rv r3 = X.C15830rv.A00(r1)
            java.lang.Object r1 = r6.second
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            X.0rv r1 = X.C15830rv.A00(r1)
            java.lang.String[] r0 = r0.messageIds
            X.2QP r2 = new X.2QP
            r2.<init>(r3, r1, r4, r0)
            r1 = 0
            r0 = 38
            android.os.Message r0 = android.os.Message.obtain(r14, r1, r0, r1, r2)
            java.util.concurrent.Future r0 = r5.A04(r0, r11)
            goto L_0x0338
        L_0x0580:
            java.util.Collection r1 = r3.values()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            goto L_0x054b
        L_0x058a:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendPlayedReceiptJob
            if (r1 == 0) goto L_0x05f0
            com.obwhatsapp.jobqueue.job.SendPlayedReceiptJob r0 = (com.obwhatsapp.jobqueue.job.SendPlayedReceiptJob) r0
            r8 = 0
            java.lang.String r1 = r0.remoteJidRawJid
            X.0rv r7 = X.C15830rv.A01(r1)
            java.lang.String r1 = r0.remoteResourceRawJid
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x05ee
            java.lang.String r1 = r0.remoteResourceRawJid
            X.0rv r2 = X.C15830rv.A02(r1)
        L_0x05a5:
            java.lang.String r10 = r0.messageId
            boolean r1 = X.C16030sJ.A0G(r2)
            r6 = r2
            if (r1 != 0) goto L_0x05b0
            r6 = r7
            r7 = r2
        L_0x05b0:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r9 = "receipt"
            java.lang.String r11 = "played"
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x05e4
            r14 = 0
        L_0x05c0:
            r15 = 0
            r13 = r8
            X.1ci r5 = new X.1ci
            r12 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.0ug r4 = r0.A00
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r0 = r0.messageId
            r3[r2] = r0
            X.2QP r1 = new X.2QP
            r1.<init>(r6, r7, r11, r3)
            r0 = 38
            android.os.Message r0 = android.os.Message.obtain(r8, r2, r0, r2, r1)
            java.util.concurrent.Future r0 = r4.A04(r0, r5)
            goto L_0x0338
        L_0x05e4:
            java.util.Collection r1 = r2.values()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r1)
            goto L_0x05c0
        L_0x05ee:
            r2 = 0
            goto L_0x05a5
        L_0x05f0:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendPaymentInviteSetupJob
            if (r1 == 0) goto L_0x06d2
            com.obwhatsapp.jobqueue.job.SendPaymentInviteSetupJob r0 = (com.obwhatsapp.jobqueue.job.SendPaymentInviteSetupJob) r0
            r15 = 0
            java.lang.String r1 = "PAY: starting SendPaymentInviteSetupJob job"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0ug r1 = r0.A00
            java.lang.String r5 = r1.A03()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r1 = r0.jidRawStr
            com.whatsapp.jid.UserJid r14 = com.whatsapp.jid.UserJid.getNullable(r1)
            java.lang.String r4 = "notification"
            java.lang.String r2 = "pay"
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x06c7
            r3 = 0
        L_0x0628:
            r23 = 0
            r20 = r15
            r21 = r15
            X.1ci r13 = new X.1ci
            r16 = r15
            r17 = r4
            r18 = r5
            r19 = r2
            r22 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r1 = r0.jidRawStr
            com.whatsapp.jid.UserJid r8 = com.whatsapp.jid.UserJid.getNullable(r1)
            int r11 = r0.paymentService
            boolean r9 = r0.inviteUsed
            r7 = 3
            X.1lL[] r6 = new X.C35081lL[r7]
            java.lang.String r3 = "to"
            X.1lL r1 = new X.1lL
            r1.<init>((com.whatsapp.jid.Jid) r8, (java.lang.String) r3)
            r12 = 0
            r6[r12] = r1
            java.lang.String r3 = "type"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r3, (java.lang.String) r2)
            r10 = 1
            r6[r10] = r1
            java.lang.String r2 = "id"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r5)
            r8 = 2
            r6[r8] = r1
            X.1Vv[] r5 = new X.C28371Vv[r10]
            X.1lL[] r7 = new X.C35081lL[r7]
            java.lang.String r2 = "account-set-up"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r3, (java.lang.String) r2)
            r7[r12] = r1
            if (r11 == r10) goto L_0x06c4
            if (r11 == r8) goto L_0x06c1
            r1 = 3
            if (r11 == r1) goto L_0x06be
            r3 = 0
        L_0x067f:
            X.AnonymousClass00B.A06(r3)
            java.lang.String r2 = "service"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r3)
            r7[r10] = r1
            java.lang.String r2 = "invite-used"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (int) r9)
            r7[r8] = r1
            java.lang.String r2 = "invite"
            X.1Vv r1 = new X.1Vv
            r1.<init>(r2, r7)
            r5[r12] = r1
            X.1Vv r3 = new X.1Vv
            r3.<init>((java.lang.String) r4, (X.C35081lL[]) r6, (X.C28371Vv[]) r5)
            X.0ug r2 = r0.A00
            r1 = 272(0x110, float:3.81E-43)
            r2.A06(r3, r13, r1)
            java.lang.String r1 = "PAY: done SendPaymentInviteSetupJob job"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r0 = r0.A04()
        L_0x06b5:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x026f
        L_0x06be:
            java.lang.String r3 = "UPI"
            goto L_0x067f
        L_0x06c1:
            java.lang.String r3 = "NOVI"
            goto L_0x067f
        L_0x06c4:
            java.lang.String r3 = "FBPAY"
            goto L_0x067f
        L_0x06c7:
            java.util.Collection r1 = r3.values()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            goto L_0x0628
        L_0x06d2:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendMediaErrorReceiptJob
            if (r1 == 0) goto L_0x07a8
            com.obwhatsapp.jobqueue.job.SendMediaErrorReceiptJob r0 = (com.obwhatsapp.jobqueue.job.SendMediaErrorReceiptJob) r0
            r10 = 0
            java.lang.String r1 = r0.remoteJidRawJid
            X.0rv r19 = X.C15830rv.A02(r1)
            java.lang.String r1 = r0.remoteResourceRawJid
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r9 = 0
            if (r1 != 0) goto L_0x07a4
            java.lang.String r1 = r0.remoteResourceRawJid
            X.0rv r20 = X.C15830rv.A02(r1)
        L_0x06ee:
            boolean r2 = X.C16030sJ.A0G(r20)
            java.lang.String r1 = r0.myPrimaryJid
            if (r1 == 0) goto L_0x0798
            r6 = 1
            X.0rv r8 = X.C15830rv.A01(r1)
            X.AnonymousClass00B.A06(r19)
        L_0x06fe:
            boolean r1 = X.C16030sJ.A0L(r19)
            if (r1 != 0) goto L_0x0710
            boolean r1 = X.C16030sJ.A0Q(r19)
            if (r1 != 0) goto L_0x0710
            r20 = r10
            if (r2 == 0) goto L_0x0710
            r20 = r19
        L_0x0710:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r11 = "receipt"
            java.lang.String r13 = "server-error"
            java.lang.String r12 = r0.messageId
            if (r6 != 0) goto L_0x0720
            r9 = r20
        L_0x0720:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x078e
            r2 = 0
        L_0x0727:
            r17 = 0
            r15 = r10
            X.1ci r7 = new X.1ci
            r14 = r10
            r16 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = 12
            byte[] r5 = X.C004101u.A0E(r1)
            java.lang.String r2 = r0.messageId
            X.2QV r1 = new X.2QV
            r1.<init>((java.lang.String) r2)
            byte[] r4 = r0.mediaKey
            java.lang.String r3 = r0.messageId
            X.AnonymousClass13B.A00(r4, r5)
            com.facebook.simplejni.NativeHolder r2 = r1.A00
            r1 = 0
            java.lang.Object r4 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOO(r1, r3, r2, r4, r5)
            byte[] r4 = (byte[]) r4
            java.lang.String r2 = r0.messageId
            if (r6 == 0) goto L_0x0775
            boolean r1 = r0.mediaFromMe
            X.2QW r3 = new X.2QW
            r17 = r3
            r18 = r8
            r21 = r2
            r22 = r4
            r23 = r5
            r24 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r2 = 0
            r1 = 327(0x147, float:4.58E-43)
            android.os.Message r1 = android.os.Message.obtain(r10, r2, r1, r2, r3)
        L_0x076d:
            X.0ug r0 = r0.A01
            java.util.concurrent.Future r0 = r0.A04(r1, r7)
            goto L_0x0338
        L_0x0775:
            java.lang.String r1 = r0.category
            X.2QZ r3 = new X.2QZ
            r11 = r3
            r12 = r8
            r13 = r20
            r14 = r2
            r15 = r1
            r16 = r4
            r17 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r2 = 0
            r1 = 77
            android.os.Message r1 = android.os.Message.obtain(r10, r2, r1, r2, r3)
            goto L_0x076d
        L_0x078e:
            java.util.Collection r1 = r2.values()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            goto L_0x0727
        L_0x0798:
            r6 = 0
            r8 = r19
            if (r2 == 0) goto L_0x079f
            r8 = r20
        L_0x079f:
            X.AnonymousClass00B.A06(r8)
            goto L_0x06fe
        L_0x07a4:
            r20 = r10
            goto L_0x06ee
        L_0x07a8:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendFinalLiveLocationRetryJob
            if (r1 == 0) goto L_0x0838
            com.obwhatsapp.jobqueue.job.SendFinalLiveLocationRetryJob r0 = (com.obwhatsapp.jobqueue.job.SendFinalLiveLocationRetryJob) r0
            X.0sK r1 = r0.A00
            r1.A0B()
            X.1ZT r1 = r1.A05
            X.AnonymousClass00B.A06(r1)
            X.1sx r3 = new X.1sx
            r3.<init>(r1)
            double r1 = r0.latitude
            r3.A00 = r1
            double r1 = r0.longitude
            r3.A01 = r1
            long r1 = r0.timestamp
            r3.A05 = r1
            java.lang.String r1 = "run send final live location retry job"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1P7 r2 = r0.A04
            int r1 = r0.timeOffset
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.1iD r4 = r2.A02(r3, r1)
            X.16P r3 = r0.A03     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            r1 = 3
            com.facebook.redex.IDxCallableShape45S0200000_2_I0 r2 = new com.facebook.redex.IDxCallableShape45S0200000_2_I0     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            r2.<init>(r0, r1, r4)     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            java.util.concurrent.ThreadPoolExecutor r1 = r3.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            java.util.concurrent.Future r1 = r1.submit(r2)     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            java.lang.Object r5 = r1.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            X.1d1 r5 = (X.C30821d1) r5     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            java.lang.String r1 = r0.rawDeviceJid     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.getNullable(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            X.AnonymousClass00B.A06(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            com.whatsapp.jid.UserJid r3 = r1.getUserJid()     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            X.1Rw r2 = r0.A05     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            java.lang.String r1 = r0.contextRawJid     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            if (r1 != 0) goto L_0x0814
            r4 = 0
            goto L_0x0818
        L_0x0814:
            X.0rv r4 = X.C15830rv.A02(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
        L_0x0818:
            java.lang.String r6 = r0.msgId     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            int r7 = r0.retryCount     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            java.util.concurrent.Future r1 = r2.A00(r3, r4, r5, r6, r7)     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            r1.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0824 }
            goto L_0x082a
        L_0x0824:
            r2 = move-exception
            java.lang.String r1 = "LocationSharingManager/encryptAndSendLocation error"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x082a:
            java.lang.String r1 = "sent final live location notifications"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r0 = r0.A04()
            goto L_0x06b5
        L_0x0838:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob
            if (r1 == 0) goto L_0x08f7
            com.obwhatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob r0 = (com.obwhatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob) r0
            X.0sK r1 = r0.A00
            r1.A0B()
            X.1ZT r1 = r1.A05
            X.AnonymousClass00B.A06(r1)
            X.1sx r8 = new X.1sx
            r8.<init>(r1)
            double r1 = r0.latitude
            r8.A00 = r1
            double r1 = r0.longitude
            r8.A01 = r1
            long r1 = r0.timestamp
            r8.A05 = r1
            java.lang.String r1 = "run send final live location job"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0yQ r9 = r0.A04
            java.lang.String r1 = r0.rawJid
            X.0rv r4 = X.C15830rv.A02(r1)
            X.AnonymousClass00B.A06(r4)
            java.lang.String r3 = r0.msgId
            r2 = 1
            X.1Vw r1 = new X.1Vw
            r1.<init>(r4, r3, r2)
            X.1rV r7 = r9.A06(r1)
            if (r7 == 0) goto L_0x08d7
            java.lang.Object r6 = r9.A0S
            monitor-enter(r6)
            X.1sx r2 = r7.A02     // Catch:{ all -> 0x1236 }
            boolean r1 = r8.equals(r2)     // Catch:{ all -> 0x1236 }
            if (r1 != 0) goto L_0x08a2
            if (r2 == 0) goto L_0x089f
            long r4 = r8.A05     // Catch:{ all -> 0x1236 }
            long r2 = r2.A05     // Catch:{ all -> 0x1236 }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x089f
            monitor-exit(r6)     // Catch:{ all -> 0x1236 }
            goto L_0x08d7
        L_0x089f:
            r9.A0V(r8, r7)     // Catch:{ all -> 0x1236 }
        L_0x08a2:
            monitor-exit(r6)     // Catch:{ all -> 0x1236 }
            X.1GE r2 = r0.A03
            int r1 = r0.timeOffset
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.1iD r4 = r2.A02(r8, r1)
            X.16P r3 = r0.A02     // Catch:{ InterruptedException | ExecutionException -> 0x08e0 }
            r1 = 2
            com.facebook.redex.IDxCallableShape45S0200000_2_I0 r2 = new com.facebook.redex.IDxCallableShape45S0200000_2_I0     // Catch:{ InterruptedException | ExecutionException -> 0x08e0 }
            r2.<init>(r0, r1, r4)     // Catch:{ InterruptedException | ExecutionException -> 0x08e0 }
            java.util.concurrent.ThreadPoolExecutor r1 = r3.A00     // Catch:{ InterruptedException | ExecutionException -> 0x08e0 }
            java.util.concurrent.Future r1 = r1.submit(r2)     // Catch:{ InterruptedException | ExecutionException -> 0x08e0 }
            java.lang.Object r4 = r1.get()     // Catch:{ InterruptedException | ExecutionException -> 0x08e0 }
            X.1d1 r4 = (X.C30821d1) r4     // Catch:{ InterruptedException | ExecutionException -> 0x08e0 }
            java.lang.String r1 = r0.rawJid     // Catch:{ InterruptedException | ExecutionException -> 0x08e0 }
            X.0rv r2 = X.C15830rv.A02(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x08e0 }
            X.1Rw r1 = r0.A05     // Catch:{ InterruptedException | ExecutionException -> 0x08e0 }
            r3 = 0
            java.lang.String r5 = r0.msgId     // Catch:{ InterruptedException | ExecutionException -> 0x08e0 }
            r6 = 0
            java.util.concurrent.Future r1 = r1.A00(r2, r3, r4, r5, r6)     // Catch:{ InterruptedException | ExecutionException -> 0x08e0 }
            r1.get()     // Catch:{ InterruptedException | ExecutionException -> 0x08e0 }
            goto L_0x08e6
        L_0x08d7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "skip sending final live location job, final live location notification already sent"
            goto L_0x08ee
        L_0x08e0:
            r2 = move-exception
            java.lang.String r1 = "LocationSharingManager/encryptAndSendLocation error"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x08e6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "sent final live location notifications"
        L_0x08ee:
            r2.append(r1)
            java.lang.String r0 = r0.A04()
            goto L_0x06b5
        L_0x08f7:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendEngagedReceiptJob
            if (r1 == 0) goto L_0x0928
            com.obwhatsapp.jobqueue.job.SendEngagedReceiptJob r0 = (com.obwhatsapp.jobqueue.job.SendEngagedReceiptJob) r0
            r15 = 0
            java.lang.String r1 = r0.jidStr
            X.0rv r14 = X.C15830rv.A02(r1)
            boolean r1 = X.C16030sJ.A0Q(r14)
            java.lang.String r11 = "time"
            if (r1 == 0) goto L_0x1242
            long r4 = r0.originalMessageTimestamp
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x1242
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 + r1
            X.0t3 r1 = r0.A00
            if (r1 != 0) goto L_0x1239
            X.C18450wi.A0O(r11)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0928:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendDisableLiveLocationJob
            if (r1 == 0) goto L_0x094c
            com.obwhatsapp.jobqueue.job.SendDisableLiveLocationJob r0 = (com.obwhatsapp.jobqueue.job.SendDisableLiveLocationJob) r0
            r12 = 0
            java.lang.String r1 = r0.rawJid
            X.0rv r11 = X.C15830rv.A02(r1)
            if (r11 != 0) goto L_0x0bf9
            java.lang.String r2 = "skip disable live location job; invalid jid: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r0 = r0.rawJid
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0948:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x094c:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob
            if (r1 == 0) goto L_0x0977
            com.obwhatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob r0 = (com.obwhatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob) r0
            r5 = 0
            X.1QV r4 = r0.A01
            java.lang.String r6 = r0.mediaEncHash
            java.lang.String r7 = "md-msg-hist"
            r10 = 0
            X.AnonymousClass00B.A06(r6)
            X.AnonymousClass00B.A06(r7)
            r9 = r5
            r11 = 0
            X.2A0 r3 = new X.2A0
            r8 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.0xf r6 = r0.A02
            X.1qJ r2 = r6.A05(r7, r8, r9, r10, r11)
            com.facebook.redex.IDxRConsumerShape110S0200000_1_I0 r1 = new com.facebook.redex.IDxRConsumerShape110S0200000_1_I0
            r1.<init>(r0, r10, r3)
            r2.A00(r1)
            return
        L_0x0977:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob
            if (r1 == 0) goto L_0x0a40
            com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob r0 = (com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob) r0
            java.lang.String r1 = "starting rotate signed pre key job"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.16P r3 = r0.A02
            r1 = 15
            com.facebook.redex.IDxCallableShape148S0100000_2_I0 r2 = new com.facebook.redex.IDxCallableShape148S0100000_2_I0
            r2.<init>(r0, r1)
            java.util.concurrent.ThreadPoolExecutor r1 = r3.A00
            java.util.concurrent.Future r1 = r1.submit(r2)
            java.lang.Object r1 = r1.get()
            X.1dG r1 = (X.C30971dG) r1
            byte[] r2 = r0.id
            byte[] r1 = r1.A01
            boolean r1 = java.util.Arrays.equals(r2, r1)
            if (r1 != 0) goto L_0x09bf
            java.lang.String r1 = "aborting rotate signed pre key job due to id mismatch with latest"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
        L_0x09b9:
            java.lang.String r0 = r0.A04()
            goto L_0x0de5
        L_0x09bf:
            X.0ug r1 = r0.A04
            java.lang.String r8 = r1.A02()
            java.util.concurrent.atomic.AtomicInteger r7 = new java.util.concurrent.atomic.AtomicInteger
            r7.<init>()
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            r5.<init>()
            X.0ug r6 = r0.A04
            byte[] r4 = r0.id
            byte[] r3 = r0.data
            byte[] r1 = r0.signature
            X.1dG r2 = new X.1dG
            r2.<init>(r4, r3, r1)
            X.2Qg r1 = new X.2Qg
            r1.<init>(r0, r7, r5)
            X.2Qi r4 = new X.2Qi
            r4.<init>(r1, r2, r8)
            r3 = 0
            r2 = 0
            r1 = 86
            android.os.Message r1 = android.os.Message.obtain(r3, r2, r1, r2, r4)
            java.util.concurrent.Future r1 = r6.A05(r1, r8)
            r1.get()
            int r3 = r7.get()
            r1 = 503(0x1f7, float:7.05E-43)
            if (r3 == r1) goto L_0x13ba
            r2 = 409(0x199, float:5.73E-43)
            java.lang.String r1 = "server error code returned during rotate signed pre key job; errorCode="
            if (r3 != r2) goto L_0x0a31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r1)
            java.lang.Object r4 = r5.get()
            if (r4 == 0) goto L_0x00bb
            X.16P r3 = r0.A02
            r2 = 4
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r1 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r1.<init>(r0, r2, r4)
            java.util.concurrent.ThreadPoolExecutor r0 = r3.A00
            r0.submit(r1)
            return
        L_0x0a31:
            if (r3 == 0) goto L_0x00bb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            goto L_0x09b9
        L_0x0a40:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.RehydrateHsmJob
            if (r1 == 0) goto L_0x0aa3
            com.obwhatsapp.jobqueue.job.RehydrateHsmJob r0 = (com.obwhatsapp.jobqueue.job.RehydrateHsmJob) r0
            java.lang.String r1 = "RehydrateHsmJob/onRun/info: starting job, param="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1iD r1 = r0.A07
            r6 = 0
            if (r1 != 0) goto L_0x0a81
            java.lang.String r1 = "RehydrateHsmJob/onRun/error: missing message, param="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.0so r3 = r0.A01
            r2 = 1
            java.lang.String r1 = "rehydratehsmjob/run/message missing"
            r3.AcB(r1, r6, r2)
        L_0x0a7d:
            r0.A05(r6)
            return
        L_0x0a81:
            X.0t3 r1 = r0.A04
            long r4 = r1.A00()
            long r2 = r0.expireTimeMs
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x13d3
            java.lang.String r1 = "RehydrateHsmJob/onRun/error: job expired, param="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0a7d
        L_0x0aa3:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.ReceiptProcessingJob
            if (r1 == 0) goto L_0x0ae7
            com.obwhatsapp.jobqueue.job.ReceiptProcessingJob r0 = (com.obwhatsapp.jobqueue.job.ReceiptProcessingJob) r0
            java.lang.String r1 = "ReceiptProcessingJob/onRun/start param="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String[] r1 = r0.keyId
            int r8 = r1.length
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r8)
            r7 = 0
            r5 = 0
        L_0x0ac8:
            if (r5 >= r8) goto L_0x0caa
            java.lang.String[] r1 = r0.keyRemoteChatJidRawString
            r1 = r1[r5]
            X.0rv r4 = X.C15830rv.A02(r1)
            if (r4 == 0) goto L_0x0ae4
            boolean[] r1 = r0.keyFromMe
            boolean r3 = r1[r5]
            java.lang.String[] r1 = r0.keyId
            r2 = r1[r5]
            X.1Vw r1 = new X.1Vw
            r1.<init>(r4, r2, r3)
            r6.add(r1)
        L_0x0ae4:
            int r5 = r5 + 1
            goto L_0x0ac8
        L_0x0ae7:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob
            if (r1 == 0) goto L_0x0b3f
            com.obwhatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob r0 = (com.obwhatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob) r0
            java.lang.String r1 = "ReceiptMultiTargetProcessingJob/onRun/start param="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r1 = r0.keyRemoteChatJidRawString
            X.0rv r3 = X.C15830rv.A01(r1)
            boolean r2 = r0.keyFromMe
            java.lang.String r1 = r0.keyId
            X.1Vw r7 = new X.1Vw
            r7.<init>(r3, r1, r2)
            java.lang.String r1 = r0.remoteJidString
            com.whatsapp.jid.Jid r6 = com.whatsapp.jid.Jid.get(r1)
            java.lang.String[] r1 = r0.participantDeviceJidRawString
            int r5 = r1.length
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r5)
            r4 = 0
        L_0x0b20:
            if (r4 >= r5) goto L_0x0cd3
            java.lang.String[] r1 = r0.participantDeviceJidRawString
            r1 = r1[r4]
            com.whatsapp.jid.DeviceJid r3 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            if (r3 == 0) goto L_0x0b3c
            long[] r1 = r0.timestamp
            r1 = r1[r4]
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r3, r2)
            r10.add(r1)
        L_0x0b3c:
            int r4 = r4 + 1
            goto L_0x0b20
        L_0x0b3f:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.GetVNameCertificateJob
            if (r1 == 0) goto L_0x0b47
            com.obwhatsapp.jobqueue.job.GetVNameCertificateJob r0 = (com.obwhatsapp.jobqueue.job.GetVNameCertificateJob) r0
            goto L_0x14cd
        L_0x0b47:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.GetStatusPrivacyJob
            if (r1 == 0) goto L_0x0be7
            com.obwhatsapp.jobqueue.job.GetStatusPrivacyJob r0 = (com.obwhatsapp.jobqueue.job.GetStatusPrivacyJob) r0
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r5.<init>()
            X.2Py r7 = r0.A01
            X.2Qo r6 = new X.2Qo
            r6.<init>(r0, r5)
            X.1bV r4 = new X.1bV
            r4.<init>()
            X.0ug r9 = r7.A01
            java.lang.String r12 = r9.A02()
            r1 = 4
            X.1lL[] r8 = new X.C35081lL[r1]
            java.lang.String r1 = "id"
            X.1lL r2 = new X.1lL
            r2.<init>((java.lang.String) r1, (java.lang.String) r12)
            r1 = 0
            r8[r1] = r2
            java.lang.String r3 = "xmlns"
            java.lang.String r1 = "status"
            X.1lL r2 = new X.1lL
            r2.<init>((java.lang.String) r3, (java.lang.String) r1)
            r1 = 1
            r8[r1] = r2
            java.lang.String r3 = "type"
            java.lang.String r1 = "get"
            X.1lL r2 = new X.1lL
            r2.<init>((java.lang.String) r3, (java.lang.String) r1)
            r1 = 2
            r8[r1] = r2
            X.1ks r3 = X.C34791ks.A00
            java.lang.String r1 = "to"
            X.1lL r2 = new X.1lL
            r2.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)
            r1 = 3
            r8[r1] = r2
            java.lang.String r3 = "privacy"
            r1 = 0
            X.1Vv r2 = new X.1Vv
            r2.<init>(r3, r1)
            java.lang.String r1 = "iq"
            X.1Vv r11 = new X.1Vv
            r11.<init>((X.C28371Vv) r2, (java.lang.String) r1, (X.C35081lL[]) r8)
            r1 = 4
            com.facebook.redex.IDxRCallbackShape11S0300000_1_I0 r10 = new com.facebook.redex.IDxRCallbackShape11S0300000_1_I0
            r10.<init>(r4, r7, r6, r1)
            r13 = 121(0x79, float:1.7E-43)
            r14 = 32000(0x7d00, double:1.581E-319)
            r9.A0G(r10, r11, r12, r13, r14)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.get(r14, r1)
            int r2 = r5.get()
            r1 = 500(0x1f4, float:7.0E-43)
            if (r2 != r1) goto L_0x00bb
            java.lang.String r1 = "server 500 error during get status privacy job"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "; persistentId="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            long r0 = r0.A01
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x0be7:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob
            if (r1 != 0) goto L_0x00bb
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.GenerateTcTokenJob
            if (r1 == 0) goto L_0x0dfb
            com.obwhatsapp.jobqueue.job.GenerateTcTokenJob r0 = (com.obwhatsapp.jobqueue.job.GenerateTcTokenJob) r0
            com.whatsapp.jid.UserJid r1 = r0.A01
            if (r1 != 0) goto L_0x1571
            java.lang.String r0 = "GenerateTcTokenJob/onRun Stored UserJid String was invalid"
            goto L_0x0948
        L_0x0bf9:
            X.0yQ r1 = r0.A00
            boolean r1 = r1.A0c(r11)
            if (r1 == 0) goto L_0x0c12
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "skip disable live location job; sharing is currently enabled"
        L_0x0c09:
            r2.append(r1)
            java.lang.String r0 = r0.A04()
            goto L_0x06b5
        L_0x0c12:
            java.lang.String r1 = "starting disable live location job"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1Rw r3 = r0.A01
            long r1 = r0.sequenceNumber
            X.0ug r4 = r3.A01
            java.lang.String r15 = r4.A03()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r14 = "notification"
            java.lang.String r6 = "location"
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x0ca0
            r5 = 0
        L_0x0c42:
            r20 = 0
            r17 = r12
            r18 = r12
            X.1ci r10 = new X.1ci
            r13 = r12
            r16 = r6
            r19 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = 3
            X.1lL[] r5 = new X.C35081lL[r3]
            java.lang.String r7 = "id"
            X.1lL r3 = new X.1lL
            r3.<init>((java.lang.String) r7, (java.lang.String) r15)
            r9 = 0
            r5[r9] = r3
            java.lang.String r8 = "type"
            X.1lL r3 = new X.1lL
            r3.<init>((java.lang.String) r8, (java.lang.String) r6)
            r8 = 1
            r5[r8] = r3
            java.lang.String r3 = "to"
            X.1lL r6 = new X.1lL
            r6.<init>((com.whatsapp.jid.Jid) r11, (java.lang.String) r3)
            r3 = 2
            r5[r3] = r6
            X.1lL[] r3 = new X.C35081lL[r8]
            java.lang.String r2 = java.lang.Long.toString(r1)
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r7, (java.lang.String) r2)
            r3[r9] = r1
            java.lang.String r2 = "disable"
            X.1Vv r1 = new X.1Vv
            r1.<init>(r2, r3)
            X.1Vv r2 = new X.1Vv
            r2.<init>((X.C28371Vv) r1, (java.lang.String) r14, (X.C35081lL[]) r5)
            r1 = 81
            java.util.concurrent.Future r1 = r4.A06(r2, r10, r1)
            r1.get()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "done disable live location job"
            goto L_0x0c09
        L_0x0ca0:
            java.util.Collection r3 = r5.values()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            goto L_0x0c42
        L_0x0caa:
            java.lang.String r1 = r0.remoteJidRawString
            com.whatsapp.jid.Jid r3 = com.whatsapp.jid.Jid.get(r1)
            java.lang.String r1 = r0.participantDeviceJidRawString
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            X.1Vw[] r1 = new X.C28381Vw[r7]
            java.lang.Object[] r6 = r6.toArray(r1)
            X.1Vw[] r6 = (X.C28381Vw[]) r6
            int r7 = r0.status
            long r8 = r0.timestamp
            r5 = 0
            r10 = 0
            X.1ta r4 = r0.receiptPrivacyMode
            X.2Qr r1 = new X.2Qr
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10)
            X.1Sk r0 = r0.A00
            java.util.concurrent.Future r0 = r0.A01(r1)
            goto L_0x0338
        L_0x0cd3:
            int r11 = r0.status
            r9 = 0
            r12 = 0
            X.1ta r8 = r0.receiptPrivacyMode
            X.2Qu r5 = new X.2Qu
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.1Sk r0 = r0.A00
            java.util.concurrent.Future r0 = r0.A01(r5)
            goto L_0x0338
        L_0x0ce6:
            java.lang.String r1 = "run send status privacy job"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.concurrent.atomic.AtomicInteger r17 = new java.util.concurrent.atomic.AtomicInteger
            r17.<init>()
            X.2Py r8 = r0.A00
            int r11 = r0.statusDistribution
            java.util.Collection r2 = r0.jids
            if (r2 != 0) goto L_0x0d56
            r3 = 0
        L_0x0d0a:
            r4 = 2
            com.facebook.redex.IDxRCallbackShape49S0200000_2_I0 r7 = new com.facebook.redex.IDxRCallbackShape49S0200000_2_I0
            r1 = r17
            r7.<init>(r1, r4, r0)
            X.1bV r6 = new X.1bV
            r6.<init>()
            X.0ug r1 = r8.A01
            r18 = r1
            java.lang.String r5 = r18.A02()
            r9 = 0
            r16 = 0
            r12 = 1
            if (r3 == 0) goto L_0x0d61
            int r1 = r3.size()
            if (r1 <= 0) goto L_0x0d61
            int r1 = r3.size()
            X.1Vv[] r10 = new X.C28371Vv[r1]
            r14 = 0
        L_0x0d32:
            int r1 = r3.size()
            if (r14 >= r1) goto L_0x0d62
            X.1lL[] r13 = new X.C35081lL[r12]
            java.lang.Object r15 = r3.get(r14)
            com.whatsapp.jid.Jid r15 = (com.whatsapp.jid.Jid) r15
            java.lang.String r2 = "jid"
            X.1lL r1 = new X.1lL
            r1.<init>((com.whatsapp.jid.Jid) r15, (java.lang.String) r2)
            r13[r16] = r1
            java.lang.String r2 = "user"
            X.1Vv r1 = new X.1Vv
            r1.<init>(r2, r13)
            r10[r14] = r1
            int r14 = r14 + 1
            goto L_0x0d32
        L_0x0d56:
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.C16030sJ.A0D(r1, r2, r3)
            goto L_0x0d0a
        L_0x0d61:
            r10 = r9
        L_0x0d62:
            X.1lL[] r3 = new X.C35081lL[r12]
            if (r11 != 0) goto L_0x0df0
            java.lang.String r2 = "contacts"
        L_0x0d68:
            java.lang.String r11 = "type"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r11, (java.lang.String) r2)
            r3[r16] = r1
            java.lang.String r1 = "list"
            X.1Vv r2 = new X.1Vv
            r2.<init>((java.lang.String) r1, (X.C35081lL[]) r3, (X.C28371Vv[]) r10)
            java.lang.String r1 = "privacy"
            X.1Vv r10 = new X.1Vv
            r10.<init>((X.C28371Vv) r2, (java.lang.String) r1, (X.C35081lL[]) r9)
            r1 = 4
            X.1lL[] r9 = new X.C35081lL[r1]
            java.lang.String r2 = "id"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r5)
            r9[r16] = r1
            java.lang.String r3 = "xmlns"
            java.lang.String r2 = "status"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r3, (java.lang.String) r2)
            r9[r12] = r1
            java.lang.String r2 = "set"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r11, (java.lang.String) r2)
            r9[r4] = r1
            r4 = 3
            X.1ks r3 = X.C34791ks.A00
            java.lang.String r2 = "to"
            X.1lL r1 = new X.1lL
            r1.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r2)
            r9[r4] = r1
            java.lang.String r1 = "iq"
            X.1Vv r3 = new X.1Vv
            r3.<init>((X.C28371Vv) r10, (java.lang.String) r1, (X.C35081lL[]) r9)
            r2 = 6
            com.facebook.redex.IDxRCallbackShape13S0300000_2_I0 r1 = new com.facebook.redex.IDxRCallbackShape13S0300000_2_I0
            r1.<init>(r6, r7, r8, r2)
            r11 = 120(0x78, float:1.68E-43)
            r12 = 32000(0x7d00, double:1.581E-319)
            r7 = r18
            r8 = r1
            r9 = r3
            r10 = r5
            r7.A0G(r8, r9, r10, r11, r12)
            r6.get()
            int r3 = r17.get()
            r1 = 500(0x1f4, float:7.0E-43)
            if (r3 == r1) goto L_0x13a1
            if (r3 == 0) goto L_0x00bb
            java.lang.String r1 = "server error code returned during send status privacy job; errorCode="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r3)
            java.lang.String r0 = r0.A04()
        L_0x0de5:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0df0:
            if (r11 != r12) goto L_0x0df7
            java.lang.String r2 = "whitelist"
            goto L_0x0d68
        L_0x0df7:
            java.lang.String r2 = "blacklist"
            goto L_0x0d68
        L_0x0dfb:
            boolean r1 = r0 instanceof com.obwhatsapp.jobqueue.job.DeleteAccountFromHsmServerJob
            if (r1 == 0) goto L_0x0e51
            com.obwhatsapp.jobqueue.job.DeleteAccountFromHsmServerJob r0 = (com.obwhatsapp.jobqueue.job.DeleteAccountFromHsmServerJob) r0
            java.util.concurrent.atomic.AtomicInteger r6 = new java.util.concurrent.atomic.AtomicInteger
            r6.<init>()
            X.0sq r5 = r0.A01
            X.18X r4 = r0.A00
            java.util.Random r1 = r0.A02
            X.1ue r3 = new X.1ue
            r3.<init>(r1)
            X.2Qv r2 = new X.2Qv
            r2.<init>(r0, r6)
            X.2Qy r1 = new X.2Qy
            r1.<init>(r2, r4, r3, r5)
            r1.A01()
            int r1 = r6.get()
            if (r1 == 0) goto L_0x00bb
            int r2 = r6.get()
            r1 = 404(0x194, float:5.66E-43)
            if (r2 == r1) goto L_0x00bb
            java.lang.String r1 = "retriable error during delete account from hsm server job"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "; persistentId="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            long r0 = r0.A01
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x0e51:
            X.2BT r0 = (X.AnonymousClass2BT) r0
            X.0ug r7 = r0.A02
            if (r7 == 0) goto L_0x00bb
            X.0so r2 = r0.A00
            if (r2 == 0) goto L_0x00bb
            X.18U r1 = r0.A01
            if (r1 == 0) goto L_0x00bb
            java.lang.String r0 = r0.groupJidRawString
            X.0sL r6 = X.C16050sL.A04(r0)
            X.C18450wi.A0B(r6)
            X.1kE r3 = new X.1kE
            r3.<init>()
            X.2R0 r8 = new X.2R0
            r8.<init>(r2, r1, r3)
            java.lang.String r10 = r7.A02()
            X.C18450wi.A0B(r10)
            java.lang.String r1 = "membership_approval_requests"
            r0 = 0
            X.1Vv r5 = new X.1Vv
            r5.<init>(r1, r0)
            r0 = 4
            X.1lL[] r4 = new X.C35081lL[r0]
            java.lang.String r2 = "xmlns"
            java.lang.String r0 = "w:g2"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 0
            r4[r0] = r1
            java.lang.String r0 = "id"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r0, (java.lang.String) r10)
            r0 = 1
            r4[r0] = r1
            java.lang.String r2 = "type"
            java.lang.String r0 = "get"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 2
            r4[r0] = r1
            java.lang.String r0 = "to"
            X.1lL r1 = new X.1lL
            r1.<init>((com.whatsapp.jid.Jid) r6, (java.lang.String) r0)
            r0 = 3
            r4[r0] = r1
            java.lang.String r0 = "iq"
            X.1Vv r9 = new X.1Vv
            r9.<init>((X.C28371Vv) r5, (java.lang.String) r0, (X.C35081lL[]) r4)
            r11 = 355(0x163, float:4.97E-43)
            r12 = 32000(0x7d00, double:1.581E-319)
            r7.A0G(r8, r9, r10, r11, r12)
            goto L_0x1651
        L_0x0ec4:
            X.0tz r4 = r2.A01     // Catch:{ Exception -> 0x0eee }
            X.0sG r3 = r2.A00     // Catch:{ Exception -> 0x0eee }
            X.013 r2 = r2.A02     // Catch:{ Exception -> 0x0eee }
            X.1st r1 = new X.1st     // Catch:{ Exception -> 0x0eee }
            r1.<init>(r3, r4, r2)     // Catch:{ Exception -> 0x0eee }
            java.util.List r6 = r1.A02(r6)     // Catch:{ Exception -> 0x0eee }
            goto L_0x0efd
        L_0x0ed4:
            r4 = r0
            com.obwhatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob r4 = (com.obwhatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob) r4
            java.lang.String r1 = "ftsMessageStore/backgroundTokenize"
            X.1Zf r3 = new X.1Zf
            r3.<init>((java.lang.String) r1)
            X.17F r1 = r4.A00
            java.lang.String r2 = r1.A0E(r6)
            X.17F r1 = r4.A00
            java.lang.String r6 = r1.A0H(r2)
            r3.A01()
            goto L_0x0efd
        L_0x0eee:
            r1 = move-exception
            X.25H r2 = new X.25H
            r2.<init>(r1)
            java.lang.String r1 = "processvcard/error constructing contacts"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x0ef9:
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x0efd:
            X.0tq r1 = r0.A01
            X.0tf r22 = r1.get()
            X.1cj r21 = r22.A00()     // Catch:{ all -> 0x108c }
            X.0th r3 = r0.A00     // Catch:{ all -> 0x1087 }
            long r1 = r0.rowId     // Catch:{ all -> 0x1087 }
            X.0tZ r7 = r3.A00(r1)     // Catch:{ all -> 0x1087 }
            if (r7 == 0) goto L_0x0fa1
            boolean r1 = r7.A15     // Catch:{ all -> 0x1087 }
            if (r1 != 0) goto L_0x0fa1
            if (r5 == 0) goto L_0x0f50
            com.obwhatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob r0 = (com.obwhatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob) r0     // Catch:{ all -> 0x1087 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x1087 }
            boolean r1 = r7 instanceof X.C38811rS     // Catch:{ all -> 0x1087 }
            if (r1 == 0) goto L_0x0f24
            r1 = r7
            X.1rS r1 = (X.C38811rS) r1     // Catch:{ all -> 0x1087 }
            r1.A02 = r6     // Catch:{ all -> 0x1087 }
        L_0x0f24:
            X.17F r1 = r0.A03     // Catch:{ all -> 0x1087 }
            r1.A0O(r7)     // Catch:{ all -> 0x1087 }
            X.17m r8 = r0.A04     // Catch:{ all -> 0x1087 }
            X.1Vw r2 = r7.A11     // Catch:{ all -> 0x1087 }
            boolean r0 = r2.A02     // Catch:{ all -> 0x1087 }
            if (r0 == 0) goto L_0x0f39
            X.0sK r0 = r8.A00     // Catch:{ all -> 0x1087 }
            r0.A0B()     // Catch:{ all -> 0x1087 }
            X.1ZT r5 = r0.A05     // Catch:{ all -> 0x1087 }
            goto L_0x0f3d
        L_0x0f39:
            com.whatsapp.jid.UserJid r5 = r7.A0C()     // Catch:{ all -> 0x1087 }
        L_0x0f3d:
            if (r5 == 0) goto L_0x0fa1
            X.0sG r0 = r8.A01     // Catch:{ all -> 0x1087 }
            X.0sH r1 = r0.A08(r5)     // Catch:{ all -> 0x1087 }
            X.0sK r0 = r8.A00     // Catch:{ all -> 0x1087 }
            boolean r0 = r0.A0I(r5)     // Catch:{ all -> 0x1087 }
            if (r0 != 0) goto L_0x0fa6
            if (r1 == 0) goto L_0x0fa1
            goto L_0x0f9d
        L_0x0f50:
            com.obwhatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob r0 = (com.obwhatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob) r0     // Catch:{ all -> 0x1087 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x1087 }
            X.17F r5 = r0.A00     // Catch:{ all -> 0x1087 }
            long r11 = r5.A04()     // Catch:{ all -> 0x1087 }
            long r15 = r0.sortId     // Catch:{ all -> 0x1087 }
            long r0 = r0.rowId     // Catch:{ all -> 0x1087 }
            r14 = 1
            X.1xn r13 = new X.1xn     // Catch:{ all -> 0x1087 }
            r17 = r0
            r13.<init>(r14, r15, r17)     // Catch:{ all -> 0x1087 }
            X.0tq r0 = r5.A0D     // Catch:{ all -> 0x1087 }
            X.0tf r10 = r0.A02()     // Catch:{ all -> 0x1087 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0f97 }
            r9.<init>(r14)     // Catch:{ all -> 0x0f97 }
            java.lang.String r0 = "content"
            r9.put(r0, r6)     // Catch:{ all -> 0x0f97 }
            X.0tg r8 = r10.A02     // Catch:{ all -> 0x0f97 }
            java.lang.String r7 = "message_ftsv2"
            java.lang.String r4 = "docid = ?"
            java.lang.String[] r3 = new java.lang.String[r14]     // Catch:{ all -> 0x0f97 }
            r2 = 0
            long r0 = r13.A02     // Catch:{ all -> 0x0f97 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0f97 }
            r3[r2] = r0     // Catch:{ all -> 0x0f97 }
            r8.A00(r7, r9, r4, r3)     // Catch:{ all -> 0x0f97 }
            r10.close()     // Catch:{ all -> 0x1087 }
            r1 = 1
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0fa1
            r5.A06(r13, r6)     // Catch:{ all -> 0x1087 }
            goto L_0x0fa1
        L_0x0f97:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x1086 }
            goto L_0x1086
        L_0x0f9d:
            X.1ko r0 = r1.A0D     // Catch:{ all -> 0x1087 }
            if (r0 != 0) goto L_0x0fa6
        L_0x0fa1:
            r21.A00()     // Catch:{ all -> 0x1087 }
            goto L_0x106c
        L_0x0fa6:
            X.0rv r4 = r2.A00     // Catch:{ all -> 0x1087 }
            X.0tq r3 = r8.A09     // Catch:{ all -> 0x1087 }
            X.0tf r20 = r3.get()     // Catch:{ all -> 0x1087 }
            X.1cj r19 = r20.A00()     // Catch:{ all -> 0x1082 }
            java.util.Iterator r18 = r6.iterator()     // Catch:{ all -> 0x107d }
        L_0x0fb6:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x107d }
            if (r0 == 0) goto L_0x1061
            java.lang.Object r6 = r18.next()     // Catch:{ all -> 0x107d }
            X.1su r6 = (X.C39691su) r6     // Catch:{ all -> 0x107d }
            java.lang.String r9 = r6.A00     // Catch:{ all -> 0x107d }
            X.1sv r2 = r6.A01     // Catch:{ all -> 0x107d }
            long r0 = r7.A13     // Catch:{ all -> 0x107d }
            java.util.List r10 = r2.A05     // Catch:{ all -> 0x107d }
            if (r10 == 0) goto L_0x105a
            java.util.Iterator r11 = r10.iterator()     // Catch:{ all -> 0x107d }
        L_0x0fd0:
            boolean r10 = r11.hasNext()     // Catch:{ all -> 0x107d }
            if (r10 == 0) goto L_0x105a
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x107d }
            X.1sw r10 = (X.C39711sw) r10     // Catch:{ all -> 0x107d }
            com.whatsapp.jid.UserJid r10 = r10.A01     // Catch:{ all -> 0x107d }
            if (r10 == 0) goto L_0x0fd0
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x107d }
            r13.<init>()     // Catch:{ all -> 0x107d }
            java.lang.Long r12 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x107d }
            java.lang.String r11 = "message_row_id"
            r13.put(r11, r12)     // Catch:{ all -> 0x107d }
            java.lang.String r1 = r5.getRawString()     // Catch:{ all -> 0x107d }
            java.lang.String r0 = "sender_jid"
            r13.put(r0, r1)     // Catch:{ all -> 0x107d }
            java.lang.String r1 = X.C16030sJ.A03(r4)     // Catch:{ all -> 0x107d }
            java.lang.String r0 = "chat_jid"
            r13.put(r0, r1)     // Catch:{ all -> 0x107d }
            java.lang.String r0 = "vcard"
            r13.put(r0, r9)     // Catch:{ all -> 0x107d }
            X.0tf r10 = r3.A02()     // Catch:{ all -> 0x107d }
            X.1cj r17 = r10.A00()     // Catch:{ all -> 0x1078 }
            X.0tg r9 = r10.A02     // Catch:{ all -> 0x1073 }
            java.lang.String r0 = "messages_vcards"
            long r15 = r9.A02(r13, r0)     // Catch:{ all -> 0x1073 }
            java.util.List r0 = r2.A05     // Catch:{ all -> 0x1073 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x1073 }
        L_0x101d:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x1073 }
            if (r0 == 0) goto L_0x1051
            java.lang.Object r13 = r14.next()     // Catch:{ all -> 0x1073 }
            X.1sw r13 = (X.C39711sw) r13     // Catch:{ all -> 0x1073 }
            com.whatsapp.jid.UserJid r0 = r13.A01     // Catch:{ all -> 0x1073 }
            if (r0 == 0) goto L_0x101d
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x1073 }
            r2.<init>()     // Catch:{ all -> 0x1073 }
            r2.put(r11, r12)     // Catch:{ all -> 0x1073 }
            java.lang.String r1 = "vcard_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x1073 }
            r2.put(r1, r0)     // Catch:{ all -> 0x1073 }
            java.lang.String r1 = "vcard_jid"
            com.whatsapp.jid.UserJid r0 = r13.A01     // Catch:{ all -> 0x1073 }
            java.lang.String r0 = X.C16030sJ.A03(r0)     // Catch:{ all -> 0x1073 }
            r2.put(r1, r0)     // Catch:{ all -> 0x1073 }
            java.lang.String r0 = "messages_vcards_jids"
            r9.A02(r2, r0)     // Catch:{ all -> 0x1073 }
            goto L_0x101d
        L_0x1051:
            r17.A00()     // Catch:{ all -> 0x1073 }
            r17.close()     // Catch:{ all -> 0x1078 }
            r10.close()     // Catch:{ all -> 0x107d }
        L_0x105a:
            long r0 = r7.A13     // Catch:{ all -> 0x107d }
            r8.A08(r6, r0)     // Catch:{ all -> 0x107d }
            goto L_0x0fb6
        L_0x1061:
            r19.A00()     // Catch:{ all -> 0x107d }
            r19.close()     // Catch:{ all -> 0x1082 }
            r20.close()     // Catch:{ all -> 0x1087 }
            goto L_0x0fa1
        L_0x106c:
            r21.close()     // Catch:{ all -> 0x108c }
            r22.close()
            return
        L_0x1073:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x1077 }
        L_0x1077:
            throw r0     // Catch:{ all -> 0x1078 }
        L_0x1078:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x107c }
        L_0x107c:
            throw r0     // Catch:{ all -> 0x107d }
        L_0x107d:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x1081 }
        L_0x1081:
            throw r0     // Catch:{ all -> 0x1082 }
        L_0x1082:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x1086 }
        L_0x1086:
            throw r0     // Catch:{ all -> 0x1087 }
        L_0x1087:
            r0 = move-exception
            r21.close()     // Catch:{ all -> 0x108b }
        L_0x108b:
            throw r0     // Catch:{ all -> 0x108c }
        L_0x108c:
            r0 = move-exception
            r22.close()     // Catch:{ all -> 0x1235 }
            throw r0
        L_0x1091:
            r0 = move-exception
            if (r4 == 0) goto L_0x1230
            r4.close()     // Catch:{ all -> 0x1230 }
            goto L_0x1230
        L_0x1099:
            X.0xz r5 = r0.A00     // Catch:{ Exception -> 0x11c4 }
            if (r3 == 0) goto L_0x10cb
            X.1kz r1 = X.C34861kz.A06     // Catch:{ Exception -> 0x11c4 }
        L_0x109f:
            r2.size()     // Catch:{ Exception -> 0x11c4 }
            X.27v r4 = new X.27v     // Catch:{ Exception -> 0x11c4 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x11c4 }
            r1 = 1
            r4.A02 = r1     // Catch:{ Exception -> 0x11c4 }
            X.27w r1 = X.C453027w.A0I     // Catch:{ Exception -> 0x11c4 }
            r4.A00 = r1     // Catch:{ Exception -> 0x11c4 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ Exception -> 0x11c4 }
        L_0x10b2:
            boolean r1 = r3.hasNext()     // Catch:{ Exception -> 0x11c4 }
            if (r1 == 0) goto L_0x10ce
            java.lang.Object r2 = r3.next()     // Catch:{ Exception -> 0x11c4 }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ Exception -> 0x11c4 }
            X.0sG r1 = r5.A05     // Catch:{ Exception -> 0x11c4 }
            r1.A0A(r2)     // Catch:{ Exception -> 0x11c4 }
            if (r2 == 0) goto L_0x10b2
            java.util.Set r1 = r4.A07     // Catch:{ Exception -> 0x11c4 }
            r1.add(r2)     // Catch:{ Exception -> 0x11c4 }
            goto L_0x10b2
        L_0x10cb:
            X.1kz r1 = X.C34861kz.A07     // Catch:{ Exception -> 0x11c4 }
            goto L_0x109f
        L_0x10ce:
            X.27t r2 = r4.A01()     // Catch:{ Exception -> 0x11c4 }
            r1 = 0
            X.1kE r1 = r5.A03(r2, r1)     // Catch:{ Exception -> 0x11c4 }
            r1.get()     // Catch:{ Exception -> 0x11c4 }
            return
        L_0x10db:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1133 }
            r2.<init>()     // Catch:{ Exception -> 0x1133 }
            java.lang.String r1 = "SyncDevicesJob/onRun/start sync device. param="
            r2.append(r1)     // Catch:{ Exception -> 0x1133 }
            java.lang.String r1 = r0.A04()     // Catch:{ Exception -> 0x1133 }
            r2.append(r1)     // Catch:{ Exception -> 0x1133 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x1133 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x1133 }
            X.0xz r5 = r0.A00     // Catch:{ Exception -> 0x1133 }
            java.lang.String[] r1 = r0.jids     // Catch:{ Exception -> 0x1133 }
            java.util.List r8 = X.C16030sJ.A09(r1)     // Catch:{ Exception -> 0x1133 }
            java.lang.String r1 = "jid list is empty"
            X.AnonymousClass00B.A0A(r1, r8)     // Catch:{ Exception -> 0x1133 }
            int r2 = r0.syncType     // Catch:{ Exception -> 0x1133 }
            r1 = 1
            if (r2 == r1) goto L_0x1118
            r1 = 2
            if (r2 == r1) goto L_0x1115
            r1 = 3
            if (r2 == r1) goto L_0x1112
            r1 = 4
            if (r2 == r1) goto L_0x110f
            goto L_0x111b
        L_0x110f:
            X.1kz r7 = X.C34861kz.A0L     // Catch:{ Exception -> 0x1133 }
            goto L_0x111d
        L_0x1112:
            X.1kz r7 = X.C34861kz.A05     // Catch:{ Exception -> 0x1133 }
            goto L_0x111d
        L_0x1115:
            X.1kz r7 = X.C34861kz.A0G     // Catch:{ Exception -> 0x1133 }
            goto L_0x111d
        L_0x1118:
            X.1kz r7 = X.C34861kz.A0E     // Catch:{ Exception -> 0x1133 }
            goto L_0x111d
        L_0x111b:
            X.1kz r7 = X.C34861kz.A0C     // Catch:{ Exception -> 0x1133 }
        L_0x111d:
            r8.size()     // Catch:{ Exception -> 0x1133 }
            X.27w r6 = X.C453027w.A0D     // Catch:{ Exception -> 0x1133 }
            r9 = 1
            r10 = 1
            X.1kE r1 = r5.A02(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x1133 }
            r1.get()     // Catch:{ Exception -> 0x1133 }
            X.16o r1 = r0.A01
            java.lang.String[] r0 = r0.jids
            r1.A00(r0)
            return
        L_0x1133:
            r3 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x114e }
            r2.<init>()     // Catch:{ all -> 0x114e }
            java.lang.String r1 = "SyncDevicesJob/onRun/error, param="
            r2.append(r1)     // Catch:{ all -> 0x114e }
            java.lang.String r1 = r0.A04()     // Catch:{ all -> 0x114e }
            r2.append(r1)     // Catch:{ all -> 0x114e }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x114e }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x114e }
            r4 = 1
            throw r3     // Catch:{ all -> 0x114e }
        L_0x114e:
            r2 = move-exception
            if (r4 != 0) goto L_0x156c
            X.16o r1 = r0.A01
            java.lang.String[] r0 = r0.jids
            r1.A00(r0)
            throw r2
        L_0x1159:
            X.0xz r2 = r0.A00     // Catch:{ Exception -> 0x11b7 }
            java.util.Set r5 = r0.A06     // Catch:{ Exception -> 0x11b7 }
            java.lang.String r1 = "jid list is empty"
            X.AnonymousClass00B.A0A(r1, r5)     // Catch:{ Exception -> 0x11b7 }
            X.1kz r4 = X.C34861kz.A0E     // Catch:{ Exception -> 0x11b7 }
            r5.size()     // Catch:{ Exception -> 0x11b7 }
            X.27w r3 = X.C453027w.A0D     // Catch:{ Exception -> 0x11b7 }
            r6 = 1
            r7 = 1
            X.1kE r1 = r2.A02(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x11b7 }
            java.lang.Object r3 = r1.get()     // Catch:{ Exception -> 0x11b7 }
            X.284 r3 = (X.AnonymousClass284) r3     // Catch:{ Exception -> 0x11b7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x11b7 }
            r2.<init>()     // Catch:{ Exception -> 0x11b7 }
            java.lang.String r1 = "SyncDevicesAndSendInvisibleMessageJob/onRun/sync is success="
            r2.append(r1)     // Catch:{ Exception -> 0x11b7 }
            boolean r1 = r3.A00()     // Catch:{ Exception -> 0x11b7 }
            r2.append(r1)     // Catch:{ Exception -> 0x11b7 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x11b7 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x11b7 }
            java.lang.String r3 = r0.rawGroupJid     // Catch:{ Exception -> 0x11b7 }
            com.whatsapp.jid.Jid r2 = com.whatsapp.jid.Jid.get(r3)     // Catch:{ Exception -> 0x11b7 }
            boolean r1 = r2 instanceof com.whatsapp.jid.GroupJid     // Catch:{ Exception -> 0x11b7 }
            if (r1 == 0) goto L_0x11b1
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2     // Catch:{ Exception -> 0x11b7 }
            X.0t6 r5 = r0.A03     // Catch:{ Exception -> 0x11b7 }
            java.lang.String r1 = r0.messageId     // Catch:{ Exception -> 0x11b7 }
            X.1Vw r4 = new X.1Vw     // Catch:{ Exception -> 0x11b7 }
            r4.<init>(r2, r1, r6)     // Catch:{ Exception -> 0x11b7 }
            X.0t3 r1 = r0.A02     // Catch:{ Exception -> 0x11b7 }
            long r2 = r1.A00()     // Catch:{ Exception -> 0x11b7 }
            X.1rx r1 = new X.1rx     // Catch:{ Exception -> 0x11b7 }
            r1.<init>(r4, r2)     // Catch:{ Exception -> 0x11b7 }
            r5.A0W(r1)     // Catch:{ Exception -> 0x11b7 }
            return
        L_0x11b1:
            X.1W4 r1 = new X.1W4     // Catch:{ Exception -> 0x11b7 }
            r1.<init>((java.lang.String) r3)     // Catch:{ Exception -> 0x11b7 }
            throw r1     // Catch:{ Exception -> 0x11b7 }
        L_0x11b7:
            r3 = move-exception
            java.lang.String r1 = "SyncDevicesAndSendInvisibleMessageJob/onRun/error, param="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r0 = r0.A04()
            goto L_0x11d0
        L_0x11c4:
            r3 = move-exception
            java.lang.String r1 = "SyncProfilePictureJob/onRun/error, param="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r0 = r0.A04()
        L_0x11d0:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            throw r3
        L_0x11db:
            X.0xz r3 = r0.A01     // Catch:{ Exception -> 0x1204 }
            X.1kz r5 = X.C34861kz.A05     // Catch:{ Exception -> 0x1204 }
            r6.size()     // Catch:{ Exception -> 0x1204 }
            X.27w r4 = X.C453027w.A0D     // Catch:{ Exception -> 0x1204 }
            r7 = 1
            r8 = 1
            X.1kE r1 = r3.A02(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x1204 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x1204 }
            X.284 r1 = (X.AnonymousClass284) r1     // Catch:{ Exception -> 0x1204 }
            boolean r1 = r1.A00()     // Catch:{ Exception -> 0x1204 }
            if (r1 == 0) goto L_0x1216
            X.0rz r1 = r0.A02     // Catch:{ Exception -> 0x1204 }
            android.content.SharedPreferences$Editor r1 = r1.A0K()     // Catch:{ Exception -> 0x1204 }
            android.content.SharedPreferences$Editor r1 = r1.remove(r2)     // Catch:{ Exception -> 0x1204 }
            r1.apply()     // Catch:{ Exception -> 0x1204 }
            goto L_0x1216
        L_0x1204:
            r3 = move-exception
            java.lang.String r2 = "DeviceSyncManager/syncDeviceForAdvValidation/error ex="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x1216:
            X.0rz r1 = r0.A02
            X.0z2 r0 = r0.A03
            long r2 = r0.A03()
            android.content.SharedPreferences$Editor r1 = r1.A0K()
            java.lang.String r0 = "adv_last_device_job_ts"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
            r0.apply()
            return
        L_0x122c:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x1230 }
        L_0x1230:
            throw r0     // Catch:{ all -> 0x1231 }
        L_0x1231:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x1235 }
        L_0x1235:
            throw r0
        L_0x1236:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x1236 }
            throw r1
        L_0x1239:
            long r2 = r1.A00()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x1242
            return
        L_0x1242:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r2 = "receipt"
            java.lang.String r1 = "engaged"
            java.lang.String r7 = r0.messageId
            long r3 = r0.loggableStanzaId
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L_0x12bf
            r6 = 0
        L_0x1256:
            r20 = r15
            r21 = r15
            X.1ci r13 = new X.1ci
            r16 = r15
            r17 = r2
            r18 = r7
            r19 = r1
            r22 = r6
            r23 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            if (r14 == 0) goto L_0x1399
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14
            X.2Qd r3 = new X.2Qd
            r3.<init>(r14)
            X.1gQ r6 = new X.1gQ
            r6.<init>((java.lang.String) r2)
            X.1Vv r5 = r3.A00
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.A05(r5, r4)
            X.1Vv r9 = r6.A01()
            java.lang.String r14 = r0.messageId
            X.1gQ r7 = new X.1gQ
            r7.<init>((java.lang.String) r2)
            r4 = 0
            r15 = 0
            r17 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r19 = 0
            boolean r5 = X.C32271fx.A0D(r14, r15, r17, r19)
            if (r5 == 0) goto L_0x12a8
            java.lang.String r6 = "id"
            X.1lL r5 = new X.1lL
            r5.<init>((java.lang.String) r6, (java.lang.String) r14)
            r7.A02(r5)
        L_0x12a8:
            X.1Vv r8 = r7.A01()
            java.lang.String r14 = r0.value
            java.lang.String r10 = r0.source
            X.0t3 r5 = r0.A00
            if (r5 != 0) goto L_0x12c9
            X.C18450wi.A0O(r11)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x12bf:
            java.util.Collection r5 = r6.values()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            goto L_0x1256
        L_0x12c9:
            long r5 = r5.A01()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            X.2Qe r7 = new X.2Qe
            r7.<init>(r5)
            X.1gQ r6 = new X.1gQ
            r6.<init>((java.lang.String) r2)
            java.lang.String r11 = "type"
            X.1lL r5 = new X.1lL
            r5.<init>((java.lang.String) r11, (java.lang.String) r1)
            r6.A02(r5)
            java.lang.String r5 = "biz"
            X.1gQ r1 = new X.1gQ
            r1.<init>((java.lang.String) r5)
            r15 = 1
            boolean r11 = X.C32271fx.A0D(r14, r15, r17, r19)
            if (r11 == 0) goto L_0x1300
            java.lang.String r12 = "value"
            X.1lL r11 = new X.1lL
            r11.<init>((java.lang.String) r12, (java.lang.String) r14)
            r1.A02(r11)
        L_0x1300:
            java.util.ArrayList r12 = X.C48992Qf.A00
            java.lang.String r11 = "source"
            r1.A0A(r10, r11, r12)
            X.1Vv r7 = r7.A00
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r1.A05(r7, r10)
            X.1Vv r1 = r1.A01()
            r6.A03(r1)
            X.1Vv r11 = r6.A01()
            X.1gQ r6 = new X.1gQ
            r6.<init>((java.lang.String) r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.A05(r9, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.A05(r8, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.A05(r11, r1)
            java.util.List r10 = java.util.Collections.EMPTY_LIST
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.A07(r9, r10, r1)
            java.lang.String[] r1 = new java.lang.String[r4]
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            r1.addAll(r4, r10)
            r3.Aaf(r6, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.A07(r8, r10, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.A07(r11, r10, r1)
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r1[r4] = r5
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r2.addAll(r4, r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.A07(r7, r2, r1)
            X.1Vv r2 = r6.A01()
            X.0ug r1 = r0.A01
            if (r1 != 0) goto L_0x1393
            java.lang.String r0 = "messageClient"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x1393:
            r0 = 360(0x168, float:5.04E-43)
            r1.A06(r2, r13, r0)
            return
        L_0x1399:
            java.lang.String r1 = "null cannot be cast to non-null type com.obwhatsapp.jid.UserJid"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x13a1:
            java.lang.String r2 = "server 500 error during send status privacy job"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r0 = r0.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x13ba:
            java.lang.String r2 = "server 503 error during rotate signed pre key job"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r0 = r0.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x13d3:
            X.1iD r1 = r0.A07
            X.29b r7 = r1.A0M
            if (r7 != 0) goto L_0x13db
            X.29b r7 = X.C455029b.A0A
        L_0x13db:
            java.lang.String r1 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            X.AnonymousClass2R3.A04(r7, r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            X.0yB r4 = r0.A03     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            java.util.Locale[] r3 = r0.locales     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            java.lang.String r2 = r7.A09     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            java.lang.String r1 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            X.2Cg r6 = X.AnonymousClass2R3.A00(r4, r2, r1, r3)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            java.lang.String r1 = r7.A06     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            X.2IQ r5 = X.C19280yB.A00(r6, r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            if (r5 != 0) goto L_0x141a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            r2.<init>()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            java.lang.String r1 = "RehydrateHsmJob/onRun/error: translation is null, param="
            r2.append(r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            java.lang.String r1 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            r2.append(r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            java.lang.String r1 = r2.toString()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            r1 = 1001(0x3e9, float:1.403E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            r0.A05(r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            return
        L_0x141a:
            android.content.Context r4 = r0.A00     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            java.lang.String r8 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            r9 = 0
            r10 = 0
            java.lang.String r6 = X.AnonymousClass2R3.A01(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x14c6 }
            X.0yB r3 = r0.A03
            java.util.Locale[] r2 = r0.locales
            java.lang.String r1 = r7.A09
            X.2Cg r7 = r3.A02(r1, r2)
            X.AnonymousClass00B.A06(r7)
            java.lang.String r2 = r7.A05
            java.lang.String r1 = r7.A04
            java.util.Locale r5 = new java.util.Locale
            r5.<init>(r2, r1)
            X.17g r4 = r0.A08
            java.lang.String r1 = r0.jid
            X.0rv r2 = X.C15830rv.A02(r1)
            java.lang.String r1 = r0.id
            X.1Vw r3 = new X.1Vw
            r3.<init>(r2, r1, r9)
            long r1 = r0.timestamp
            X.0tZ r8 = r4.A01(r3, r9, r1)
            java.lang.String r1 = r0.participant
            X.0rv r1 = X.C15830rv.A02(r1)
            r8.A0b(r1)
            r8.A0k(r6)
            java.lang.Long r1 = r0.verifiedSender
            if (r1 == 0) goto L_0x1463
            r8.A0d = r1
        L_0x1463:
            int r1 = r0.verifiedLevel
            r8.A0E = r1
            r1 = 8
            r8.A0S(r1)
            int r1 = r0.expiration
            r8.A0T(r1)
            java.lang.Long r1 = r0.existingMessageRowId
            if (r1 == 0) goto L_0x1492
            long r1 = r1.longValue()
            r8.A13 = r1
            X.0t6 r1 = r0.A05
            X.1Vw r2 = r8.A11
            X.0th r1 = r1.A0K
            X.0tZ r6 = r1.A03(r2)
            r4 = 11
            if (r6 == 0) goto L_0x14c0
            byte r3 = r6.A10
            if (r3 != r4) goto L_0x14a1
            java.lang.String r1 = "rehydrateHsmJob/message-exists-already-replace-decryption-failure"
        L_0x148f:
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x1492:
            X.0t6 r1 = r0.A05
            r1.A0u(r8)
        L_0x1497:
            X.0yB r0 = r0.A03
            java.lang.String r1 = r7.A06
            X.11i r0 = r0.A01
            r0.A01(r1, r5)
            return
        L_0x14a1:
            r1 = 31
            if (r3 != r1) goto L_0x14a8
            java.lang.String r1 = "rehydrateHsmJob/message-exists-already-replace-multi-device-placeholder"
            goto L_0x148f
        L_0x14a8:
            java.lang.String r1 = "rehydrateHsmJob/message-exists-already-non-decryption-failure type="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = X.C38621r6.A0H(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r8.A0d(r6)
        L_0x14c0:
            X.0t6 r1 = r0.A05
            r1.A0y(r8, r4)
            goto L_0x1497
        L_0x14c6:
            r1 = move-exception
            java.lang.Integer r1 = r1.errorCode
            r0.A05(r1)
            return
        L_0x14cd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r2.<init>()     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            java.lang.String r1 = "starting get vname certificate job"
            r2.append(r1)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            java.lang.String r1 = r0.A04()     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r2.append(r1)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            X.2Qm r6 = r0.A01     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            java.lang.String r1 = r0.jid     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            com.whatsapp.jid.UserJid r5 = com.whatsapp.jid.UserJid.get(r1)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            X.0ug r10 = r6.A01     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            java.lang.String r13 = r10.A02()     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            java.lang.String r2 = "BizVNameXmppMethods/sendGetBizVNameCert; iq="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r1.append(r13)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            X.1bV r4 = new X.1bV     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r4.<init>()     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r9 = 1
            X.1lL[] r7 = new X.C35081lL[r9]     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            java.lang.String r2 = "jid"
            X.1lL r1 = new X.1lL     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r1.<init>((com.whatsapp.jid.Jid) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r3 = 0
            r7[r3] = r1     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            java.lang.String r1 = "verified_name"
            X.1Vv r8 = new X.1Vv     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r8.<init>(r1, r7)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r1 = 3
            X.1lL[] r7 = new X.C35081lL[r1]     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            java.lang.String r2 = "id"
            X.1lL r1 = new X.1lL     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r1.<init>((java.lang.String) r2, (java.lang.String) r13)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r7[r3] = r1     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            java.lang.String r3 = "xmlns"
            java.lang.String r2 = "w:biz"
            X.1lL r1 = new X.1lL     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r1.<init>((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r7[r9] = r1     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            java.lang.String r3 = "type"
            java.lang.String r1 = "get"
            X.1lL r2 = new X.1lL     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r2.<init>((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r1 = 2
            r7[r1] = r2     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            java.lang.String r1 = "iq"
            X.1Vv r12 = new X.1Vv     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r12.<init>((X.C28371Vv) r8, (java.lang.String) r1, (X.C35081lL[]) r7)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r1 = 3
            com.facebook.redex.IDxRCallbackShape11S0300000_1_I0 r11 = new com.facebook.redex.IDxRCallbackShape11S0300000_1_I0     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r11.<init>(r5, r6, r4, r1)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r14 = 118(0x76, float:1.65E-43)
            r15 = 32000(0x7d00, double:1.581E-319)
            r10.A0G(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            r4.get()     // Catch:{ Exception -> 0x156d, all -> 0x1564 }
            java.util.concurrent.ConcurrentHashMap r1 = com.obwhatsapp.jobqueue.job.GetVNameCertificateJob.A02
            java.lang.String r0 = r0.jid
            r1.remove(r0)
            return
        L_0x1564:
            r2 = move-exception
            java.util.concurrent.ConcurrentHashMap r1 = com.obwhatsapp.jobqueue.job.GetVNameCertificateJob.A02
            java.lang.String r0 = r0.jid
            r1.remove(r0)
        L_0x156c:
            throw r2
        L_0x156d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x156f }
        L_0x156f:
            r2 = move-exception
            throw r2
        L_0x1571:
            X.12G r2 = r0.A00
            java.lang.Long r1 = r0.timestamp
            long r4 = r1.longValue()
            long r2 = r2.A01()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x15a1
            java.lang.String r1 = "GenerateTcTokenJob/onRun Token timestamp "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.Long r1 = r0.timestamp
            r2.append(r1)
            java.lang.String r1 = " too old to send"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.1HG r1 = r0.A03
            com.whatsapp.jid.UserJid r0 = r0.A01
            r1.A01(r0)
            return
        L_0x15a1:
            X.0ug r1 = r0.A02
            java.lang.String r6 = r1.A02()
            X.1kE r5 = new X.1kE
            r5.<init>()
            X.0ug r14 = r0.A02
            r18 = 299(0x12b, float:4.19E-43)
            com.whatsapp.jid.UserJid r12 = r0.A01
            java.lang.Long r4 = r0.timestamp
            java.lang.String r3 = "trusted_contact"
            java.lang.String r2 = "jid"
            r9 = 3
            r10 = 2
            java.lang.String r8 = "type"
            r7 = 1
            r13 = 0
            if (r4 != 0) goto L_0x1627
            X.1lL[] r11 = new X.C35081lL[r10]
            X.1lL r1 = new X.1lL
            r1.<init>((com.whatsapp.jid.Jid) r12, (java.lang.String) r2)
            r11[r13] = r1
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r8, (java.lang.String) r3)
            r11[r7] = r1
        L_0x15d2:
            java.lang.String r1 = "token"
            X.1Vv r3 = new X.1Vv
            r3.<init>(r1, r11)
            r2 = 0
            java.lang.String r1 = "tokens"
            X.1Vv r4 = new X.1Vv
            r4.<init>((X.C28371Vv) r3, (java.lang.String) r1, (X.C35081lL[]) r2)
            r1 = 4
            X.1lL[] r3 = new X.C35081lL[r1]
            java.lang.String r2 = "id"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r6)
            r3[r13] = r1
            X.1ks r11 = X.C34791ks.A00
            java.lang.String r2 = "to"
            X.1lL r1 = new X.1lL
            r1.<init>((com.whatsapp.jid.Jid) r11, (java.lang.String) r2)
            r3[r7] = r1
            java.lang.String r11 = "xmlns"
            java.lang.String r2 = "privacy"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r11, (java.lang.String) r2)
            r3[r10] = r1
            java.lang.String r2 = "set"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r8, (java.lang.String) r2)
            r3[r9] = r1
            java.lang.String r2 = "iq"
            X.1Vv r1 = new X.1Vv
            r1.<init>((X.C28371Vv) r4, (java.lang.String) r2, (X.C35081lL[]) r3)
            com.facebook.redex.IDxRCallbackShape49S0200000_2_I0 r15 = new com.facebook.redex.IDxRCallbackShape49S0200000_2_I0
            r15.<init>(r5, r7, r0)
            r19 = 32000(0x7d00, double:1.581E-319)
            r17 = r6
            r16 = r1
            r14.A0G(r15, r16, r17, r18, r19)
            goto L_0x1646
        L_0x1627:
            X.1lL[] r11 = new X.C35081lL[r9]
            X.1lL r1 = new X.1lL
            r1.<init>((com.whatsapp.jid.Jid) r12, (java.lang.String) r2)
            r11[r13] = r1
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r8, (java.lang.String) r3)
            r11[r7] = r1
            long r2 = r4.longValue()
            java.lang.String r4 = "t"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r4, (long) r2)
            r11[r10] = r1
            goto L_0x15d2
        L_0x1646:
            r5.get()     // Catch:{ Exception -> 0x1659 }
            X.1HG r1 = r0.A03     // Catch:{ Exception -> 0x1659 }
            com.whatsapp.jid.UserJid r0 = r0.A01     // Catch:{ Exception -> 0x1659 }
            r1.A01(r0)     // Catch:{ Exception -> 0x1659 }
            return
        L_0x1651:
            r3.get()     // Catch:{ Exception -> 0x1655 }
            goto L_0x1660
        L_0x1655:
            r1 = move-exception
            java.lang.String r0 = "GroupFetchAllMembershipApprovalRequestsJob/onRun Failed to fetch pending requests"
            goto L_0x165c
        L_0x1659:
            r1 = move-exception
            java.lang.String r0 = "GenerateTcTokenJob/onRun Failed to deliver TCToken generate request"
        L_0x165c:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            throw r1
        L_0x1660:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.jobqueue.Job.A01():void");
    }

    public void A02(long j2) {
        if (this instanceof SendStatusPrivacyListJob) {
            SendStatusPrivacyListJob sendStatusPrivacyListJob = (SendStatusPrivacyListJob) this;
            sendStatusPrivacyListJob.A01 = j2;
            SendStatusPrivacyListJob.A01 = j2;
            StringBuilder sb = new StringBuilder("set persistent id for send status privacy job");
            sb.append(sendStatusPrivacyListJob.A04());
            Log.i(sb.toString());
            return;
        }
        this.A01 = j2;
    }

    public boolean A03() {
        for (Requirement AJT : this.parameters.requirements) {
            if (!AJT.AJT()) {
                return false;
            }
        }
        return true;
    }
}
