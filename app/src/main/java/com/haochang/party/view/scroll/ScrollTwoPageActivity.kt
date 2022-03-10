package com.haochang.party.view.scroll

import android.graphics.Color
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.haochang.base.ui.BaseActivity
import com.haochang.party.R

/**
 * @author: pandaren
 * @createTime: 2021/7/23
 */
class ScrollTwoPageActivity : BaseActivity() {

    private var recyclerView: RecyclerView? = null
    override fun initView() {
        super.initView()
        setContentView(R.layout.layout_scroll_page)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView?.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

    private val list = Array(50) { "------------------$it" }

    override fun onResume() {
        super.onResume()
        if (null == recyclerView?.adapter) {
            val value = object : RecyclerView.Adapter<BaseViewHolder>() {
                var list: Array<String> = arrayOf()
                fun setData(data: Array<String>) {
                    list = list.plus(data)
                    notifyDataSetChanged()
                }

                override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
                    val itemView = TextView(this@ScrollTwoPageActivity)
                    itemView.setPadding(100, 10, 100, 10)
                    itemView.setTextColor(Color.BLACK)
                    itemView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18f)
                    return BaseViewHolder(itemView)
                }

                override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
                    if (holder.itemView is TextView)
                        holder.itemView.text = list!![position]
                }

                override fun getItemCount(): Int {
                    return list?.size ?: 0
                }
            }
            recyclerView?.adapter = value
            value.setData(list)
        }
    }

    inner class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}