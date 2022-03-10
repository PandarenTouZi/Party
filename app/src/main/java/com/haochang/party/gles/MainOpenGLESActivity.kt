package com.haochang.party.gles

import android.content.Intent
import android.text.TextUtils
import android.view.View
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.party.R
import com.haochang.party.gles.learn.LearnOpenGLESActivity
import com.haochang.party.view.ItemEntity
import com.haochang.party.view.StringListAdapter

/**
 * @author: pandaren
 * @createTime: 2021/6/3
 */
class MainOpenGLESActivity : BaseActivityMVPActivity<MainOpenGLESPresenter>(),
    MainOpenGLESContract.IView {
    override fun provideLayoutId(): Int {
        return R.layout.layout_main_opengl
    }

    override fun onInitView(rootView: View) {
        val recyclerView = rootView.findViewById<RecyclerView>(R.id.mainViewsActivity_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val viewList = arrayOf(
            ItemEntity("基础OpenGL ES3", LearnOpenGLESActivity::class.java),
        )
        recyclerView.adapter = StringListAdapter(viewList, object :
            DiffUtil.ItemCallback<String>() {
            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return TextUtils.equals(oldItem, newItem)
            }

            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
                return TextUtils.equals(oldItem, newItem)
            }
        }).setAdapterCallback(object : StringListAdapter.IStringListAdapterCallback {
            override fun onItemClick(itemEntity: ItemEntity) {
                startActivity(Intent(this@MainOpenGLESActivity, itemEntity.cls))
            }
        })
    }

    override fun onInitMVPContract(): MainOpenGLESPresenter {
        return MainOpenGLESPresenter(this, MainOpenGLESModule())
    }
}