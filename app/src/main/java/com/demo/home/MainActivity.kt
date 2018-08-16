package com.demo.home

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.demo.R
import com.demo.adapter.MyAdapter
import com.demo.model.Record
import com.demo.restservices.APIService
import com.demo.restservices.ApiUtils
import com.google.gson.Gson
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private var apiServices: APIService? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        apiServices= ApiUtils.apiService
        recycler_view.layoutManager = LinearLayoutManager(this)

        initJson()
    }


    private fun initJson(){
        apiServices!!.getCustomerAll()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        {
                            result-> val data=result.records
                            val datas=Gson().toJson(data)
                            Log.d("TAHS","Response JSON = $datas")
                            recycler_view.adapter=MyAdapter(data)

                        },
                        { error ->
                            Log.d("TAHS","ERROR ${error.message }")
                        }
                )
    }
}
