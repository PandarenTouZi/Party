package com.haochang.party.audio

import androidx.annotation.RawRes
import androidx.core.content.res.ResourcesCompat
import com.haochang.audio.player.AudioPlayer
import com.haochang.audio.record.AudioRecorder
import com.haochang.party.R

/**
 * author:pandaren
 * createDate:2023/11/6 17:25
 */
class MainAudioMVPModel : MainAudioMVPContract.IModel() {

    //raw资源
    @RawRes
    private var mRawResId: Int = ResourcesCompat.ID_NULL

    private var mAudioRecorder: AudioRecorder? = null
    private var mAudioPlayer: AudioPlayer? = null

    override fun onCreated() {
        mRawResId = R.raw.audio_4s

        mAudioRecorder = AudioRecorder()
        mAudioPlayer = AudioPlayer()
    }

    override fun onDestroy() {
        stopAllPlayers()
    }

    override fun stopAllPlayers() {
        mAudioRecorder?.stop()
        mAudioPlayer?.stop()
    }

    override fun startPlayRawAudio(listener: IRawAudioPlayerListener) {
        if (mRawResId == ResourcesCompat.ID_NULL) {
            listener.onError("raw资源未配置")
        } else {
            val audioPlayer = mAudioPlayer
            if (audioPlayer == null) {
                listener.onError("player为空")
            } else {
                audioPlayer.startPlay(mRawResId)
            }
        }
    }
}