package Listadetarefas.app.src.main.java.com.fernanda.listadetarefas;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.content.pm.PackageManager;

public class AudioHelper {

    private AudioManager audioManager;

    public AudioHelper(Context context) {
        audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
    }

    public boolean audioOutputAvailable(int type) {
        if (!context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_AUDIO_OUTPUT)) {
            return false;
        }
        return audioManager.getDevices(AudioManager.GET_DEVICES_OUTPUTS).anyMatch(device -> device.getType() == type);
    }
}
