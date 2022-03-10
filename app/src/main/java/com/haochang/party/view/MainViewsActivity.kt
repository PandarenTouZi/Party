package com.haochang.party.view

import android.content.Intent
import android.text.TextUtils
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.base.listener.OnBaseClickListener
import com.haochang.party.R
import com.haochang.party.view.scroll.ScrollTwoPageActivity
import com.haochang.party.view.text.scrolltext.ScrollTextViewActivity
import com.haochang.utils.TraceUtils

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainViewsActivity : BaseActivityMVPActivity<MainViewsPresenter>(), MainViewsContract.IView {
    override fun provideLayoutId(): Int {
        return R.layout.layout_main_view
    }

    override fun onInitMVPContract(): MainViewsPresenter {
        return MainViewsPresenter(this, MainViewsModule())
    }

    override fun onInitView(rootView: View) {
        val recyclerView = rootView.findViewById<RecyclerView>(R.id.mainViewsActivity_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val viewList = arrayOf(
            ItemEntity("滑动TextView", ScrollTextViewActivity::class.java),
            ItemEntity("滑动页面", ScrollTwoPageActivity::class.java),
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
                startActivity(Intent(this@MainViewsActivity, itemEntity.cls))
            }
        })
        println("MainViewsActivity.onInitView --- ${TraceUtils.trace()}")
    }
}

class ItemEntity(val text: String, val cls: Class<*>)

class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

class StringListAdapter(
    var listData: Array<ItemEntity>?,
    itemCallback: DiffUtil.ItemCallback<String>
) :
    ListAdapter<String, ListViewHolder>(itemCallback) {

    private var adapterCallback: IStringListAdapterCallback? = null
    private val onBaseClickListener: OnBaseClickListener = object : OnBaseClickListener() {
        override fun onBaseClick(v: View?) {
            val tag = v?.tag
            if (tag is Int) {
                val s = listData?.get(tag)
                if (null != s)
                    adapterCallback?.onItemClick(s)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView = TextView(parent.context)
        itemView.setPadding(100, 10, 100, 10)
        return ListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        if (holder.itemView is TextView) {
            holder.itemView.text = listData!![position].text
            holder.itemView.tag = position
            holder.itemView.setOnClickListener(onBaseClickListener)
        }
    }

    override fun getItemCount(): Int {
        return listData?.size ?: 0
    }

    interface IStringListAdapterCallback {
        fun onItemClick(itemEntity: ItemEntity)
    }

    fun setAdapterCallback(adapterCallback: IStringListAdapterCallback): StringListAdapter {
        this.adapterCallback = adapterCallback
        return this@StringListAdapter
    }
}
