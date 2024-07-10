import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;

@RequiresApi(api = Build.VERSION_CODES.S)
private class MyCallStateListener extends TelephonyCallback implements TelephonyCallback.CallStateListener {
    @Override
    public void onCallStateChanged(int state) {
        if (state == TelephonyManager.CALL_STATE_IDLE) {
            mGSMIdle = true;
        } else {
            mGSMIdle = false;
        }
    }
}
