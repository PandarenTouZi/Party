package com.haochang.party

import android.content.Intent
import android.graphics.Color
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import com.haochang.base.framework.mvp.AbsMVPContract
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.base.listener.OnBaseClickListener
import com.haochang.party.audio.MainAudioMVPActivity
import com.haochang.party.base.MainMVPActivity
import com.haochang.party.gles.MainOpenGLESActivity
import com.haochang.party.image.MainImageActivity
import com.haochang.party.network.MainNetworkActivity
import com.haochang.party.permission.MainPermissionActivity
import com.haochang.party.utils.MainUtilsActivity
import com.haochang.party.video.MainVideoMVPActivity
import com.haochang.party.view.MainViewsActivity

/**
 * @author: pandaren
 * @createTime: 2021/4/2
 * main logo
 */
class LogoActivity : BaseActivityMVPActivity<AbsMVPContract.IPresenter<*, *>>() {
    override fun provideLayoutId(): Int {
        return 0
    }

    override fun onInitView(rootView: View) {
        val viewParent: ViewGroup? = null
        val inflateView =
            LayoutInflater.from(this).inflate(R.layout.include_common_title, viewParent)
        inflateView.findViewById<View>(R.id.includeCommonTitleIvBack).setOnClickListener {
            finish()
        }
        inflateView.findViewById<TextView>(R.id.includeCommonTitleTvTitle).text = "测试功能列表"
        provideNormalTitleTop(inflateView)
    }

    override fun onInitMVPContract(): AbsMVPContract.IPresenter<*, *>? {
        return null
    }

    override fun provideContentView(): View {
        val functionList = arrayListOf(
            ItemEntity("音频", MainAudioMVPActivity::class.java),
            ItemEntity("视频", MainVideoMVPActivity::class.java),
            ItemEntity("网络", MainNetworkActivity::class.java),
            ItemEntity("权限", MainPermissionActivity::class.java),
            ItemEntity("页面视图", MainMVPActivity::class.java),
            ItemEntity("图片", MainImageActivity::class.java),
            ItemEntity("GLES", MainOpenGLESActivity::class.java),
            ItemEntity("工具", MainUtilsActivity::class.java),
            ItemEntity("自定义视图", MainViewsActivity::class.java)
        )
        val listView = ListView(this)
        val adapter = object : BaseAdapter() {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
                val appCompatTextView = AppCompatTextView(this@LogoActivity)
                val item = getItem(position)
                appCompatTextView.text = item.text
                appCompatTextView.gravity = Gravity.CENTER
                appCompatTextView.setPadding(0, 15, 0, 25)
                appCompatTextView.tag = item
                appCompatTextView.setOnClickListener(onClickListener)
                return appCompatTextView
            }

            override fun getItem(position: Int): ItemEntity {
                return functionList[position]
            }

            override fun getItemId(position: Int): Long {
                return getItem(position).hashCode().toLong()
            }

            override fun getCount(): Int {
                return functionList.size
            }
        }
        listView.adapter = adapter
        listView.setBackgroundColor(Color.TRANSPARENT)
        return listView
    }

    inner class ItemEntity(val text: String, val cls: Class<*>)

    private val onClickListener = object : OnBaseClickListener() {
        override fun onBaseClick(v: View?) {
            val tag = v?.tag
            if (tag is ItemEntity) {
                val intent = Intent(this@LogoActivity, tag.cls)
                startActivity(intent)
            }
        }
    }
}